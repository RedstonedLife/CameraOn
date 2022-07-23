/*     */ package de.onvif.soap;
/*     */ 
/*     */ import de.onvif.log.Logger;
/*     */ import de.onvif.soap.devices.ImagingDevices;
/*     */ import de.onvif.soap.devices.InitialDevices;
/*     */ import de.onvif.soap.devices.MediaDevices;
/*     */ import de.onvif.soap.devices.PtzDevices;
/*     */ import java.io.IOException;
/*     */ import java.net.ConnectException;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketAddress;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.Random;
/*     */ import java.util.SimpleTimeZone;
/*     */ import java.util.TimeZone;
/*     */ import javax.xml.soap.SOAPException;
/*     */ import org.apache.commons.codec.binary.Base64;
/*     */ import org.onvif.ver10.schema.Capabilities;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OnvifDevice
/*     */ {
/*     */   private final String HOST_IP;
/*     */   private String originalIp;
/*     */   private boolean isProxy;
/*     */   private String username;
/*     */   private String password;
/*     */   private String nonce;
/*     */   private String utcTime;
/*     */   private String serverDeviceUri;
/*     */   private String serverPtzUri;
/*     */   private String serverMediaUri;
/*     */   private String serverImagingUri;
/*     */   private String serverEventsUri;
/*     */   private SOAP soap;
/*     */   private InitialDevices initialDevices;
/*     */   private PtzDevices ptzDevices;
/*     */   private MediaDevices mediaDevices;
/*     */   private ImagingDevices imagingDevices;
/*     */   private Logger logger;
/*     */   
/*     */   public OnvifDevice(String hostIp, String user, String password) throws ConnectException, SOAPException {
/*  70 */     this.logger = new Logger();
/*     */     
/*  72 */     this.HOST_IP = hostIp;
/*     */     
/*  74 */     if (!isOnline()) {
/*  75 */       throw new ConnectException("Host not available.");
/*     */     }
/*     */     
/*  78 */     this.serverDeviceUri = "http://" + this.HOST_IP + "/onvif/device_service";
/*     */     
/*  80 */     this.username = user;
/*  81 */     this.password = password;
/*     */     
/*  83 */     this.soap = new SOAP(this);
/*  84 */     this.initialDevices = new InitialDevices(this);
/*  85 */     this.ptzDevices = new PtzDevices(this);
/*  86 */     this.mediaDevices = new MediaDevices(this);
/*  87 */     this.imagingDevices = new ImagingDevices(this);
/*     */     
/*  89 */     init();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OnvifDevice(String hostIp) throws ConnectException, SOAPException {
/* 105 */     this(hostIp, null, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isOnline() {
/* 113 */     String port = this.HOST_IP.contains(":") ? this.HOST_IP.substring(this.HOST_IP.indexOf(':') + 1) : "80";
/* 114 */     String ip = this.HOST_IP.contains(":") ? this.HOST_IP.substring(0, this.HOST_IP.indexOf(':')) : this.HOST_IP;
/*     */     
/* 116 */     Socket socket = null;
/*     */     try {
/* 118 */       SocketAddress sockaddr = new InetSocketAddress(ip, (new Integer(port)).intValue());
/* 119 */       socket = new Socket();
/*     */       
/* 121 */       socket.connect(sockaddr, 5000);
/*     */     }
/* 123 */     catch (NumberFormatException|IOException e) {
/* 124 */       return false;
/*     */     } finally {
/*     */       
/*     */       try {
/* 128 */         if (socket != null) {
/* 129 */           socket.close();
/*     */         }
/*     */       }
/* 132 */       catch (IOException iOException) {}
/*     */     } 
/*     */     
/* 135 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void init() throws ConnectException, SOAPException {
/* 148 */     Capabilities capabilities = getDevices().getCapabilities();
/*     */     
/* 150 */     if (capabilities == null) {
/* 151 */       throw new ConnectException("Capabilities not reachable.");
/*     */     }
/*     */     
/* 154 */     String localDeviceUri = capabilities.getDevice().getXAddr();
/*     */     
/* 156 */     if (localDeviceUri.startsWith("http://")) {
/* 157 */       this.originalIp = localDeviceUri.replace("http://", "");
/* 158 */       this.originalIp = this.originalIp.substring(0, this.originalIp.indexOf('/'));
/*     */     } else {
/*     */       
/* 161 */       this.logger.error("Unknown/Not implemented local procotol!");
/*     */     } 
/*     */     
/* 164 */     if (!this.originalIp.equals(this.HOST_IP)) {
/* 165 */       this.isProxy = true;
/*     */     }
/*     */     
/* 168 */     if (capabilities.getMedia() != null && capabilities.getMedia().getXAddr() != null) {
/* 169 */       this.serverMediaUri = replaceLocalIpWithProxyIp(capabilities.getMedia().getXAddr());
/*     */     }
/*     */     
/* 172 */     if (capabilities.getPTZ() != null && capabilities.getPTZ().getXAddr() != null) {
/* 173 */       this.serverPtzUri = replaceLocalIpWithProxyIp(capabilities.getPTZ().getXAddr());
/*     */     }
/*     */     
/* 176 */     if (capabilities.getImaging() != null && capabilities.getImaging().getXAddr() != null) {
/* 177 */       this.serverImagingUri = replaceLocalIpWithProxyIp(capabilities.getImaging().getXAddr());
/*     */     }
/*     */     
/* 180 */     if (capabilities.getMedia() != null && capabilities.getEvents().getXAddr() != null) {
/* 181 */       this.serverEventsUri = replaceLocalIpWithProxyIp(capabilities.getEvents().getXAddr());
/*     */     }
/*     */   }
/*     */   
/*     */   public String replaceLocalIpWithProxyIp(String original) {
/* 186 */     if (original.startsWith("http:///")) {
/* 187 */       original.replace("http:///", "http://" + this.HOST_IP);
/*     */     }
/*     */     
/* 190 */     if (this.isProxy) {
/* 191 */       return original.replace(this.originalIp, this.HOST_IP);
/*     */     }
/* 193 */     return original;
/*     */   }
/*     */   
/*     */   public String getUsername() {
/* 197 */     return this.username;
/*     */   }
/*     */   
/*     */   public String getEncryptedPassword() {
/* 201 */     return encryptPassword();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String encryptPassword() {
/*     */     byte[] encryptedRaw;
/* 208 */     String nonce = getNonce();
/* 209 */     String timestamp = getUTCTime();
/*     */     
/* 211 */     String beforeEncryption = String.valueOf(nonce) + timestamp + this.password;
/*     */ 
/*     */     
/*     */     try {
/* 215 */       encryptedRaw = sha1(beforeEncryption);
/*     */     }
/* 217 */     catch (NoSuchAlgorithmException e) {
/* 218 */       e.printStackTrace();
/* 219 */       return null;
/*     */     } 
/* 221 */     String encoded = Base64.encodeBase64String(encryptedRaw);
/* 222 */     return encoded;
/*     */   }
/*     */   
/*     */   private static byte[] sha1(String s) throws NoSuchAlgorithmException {
/* 226 */     MessageDigest SHA1 = null;
/* 227 */     SHA1 = MessageDigest.getInstance("SHA1");
/*     */     
/* 229 */     SHA1.reset();
/* 230 */     SHA1.update(s.getBytes());
/*     */     
/* 232 */     byte[] encryptedRaw = SHA1.digest();
/* 233 */     return encryptedRaw;
/*     */   }
/*     */   
/*     */   private String getNonce() {
/* 237 */     if (this.nonce == null) {
/* 238 */       createNonce();
/*     */     }
/* 240 */     return this.nonce;
/*     */   }
/*     */   
/*     */   public String getEncryptedNonce() {
/* 244 */     if (this.nonce == null) {
/* 245 */       createNonce();
/*     */     }
/* 247 */     return Base64.encodeBase64String(this.nonce.getBytes());
/*     */   }
/*     */   
/*     */   public void createNonce() {
/* 251 */     Random generator = new Random();
/* 252 */     this.nonce = generator.nextInt();
/*     */   }
/*     */   
/*     */   public String getLastUTCTime() {
/* 256 */     return this.utcTime;
/*     */   }
/*     */   
/*     */   public String getUTCTime() {
/* 260 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d'T'HH:mm:ss'Z'");
/* 261 */     sdf.setTimeZone(new SimpleTimeZone(2, "UTC"));
/*     */     
/* 263 */     Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
/* 264 */     String utcTime = sdf.format(cal.getTime());
/* 265 */     this.utcTime = utcTime;
/* 266 */     return utcTime;
/*     */   }
/*     */   
/*     */   public SOAP getSoap() {
/* 270 */     return this.soap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InitialDevices getDevices() {
/* 277 */     return this.initialDevices;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PtzDevices getPtz() {
/* 284 */     return this.ptzDevices;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MediaDevices getMedia() {
/* 292 */     return this.mediaDevices;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ImagingDevices getImaging() {
/* 300 */     return this.imagingDevices;
/*     */   }
/*     */   
/*     */   public Logger getLogger() {
/* 304 */     return this.logger;
/*     */   }
/*     */   
/*     */   public String getDeviceUri() {
/* 308 */     return this.serverDeviceUri;
/*     */   }
/*     */   
/*     */   protected String getPtzUri() {
/* 312 */     return this.serverPtzUri;
/*     */   }
/*     */   
/*     */   protected String getMediaUri() {
/* 316 */     return this.serverMediaUri;
/*     */   }
/*     */   
/*     */   protected String getImagingUri() {
/* 320 */     return this.serverImagingUri;
/*     */   }
/*     */   
/*     */   protected String getEventsUri() {
/* 324 */     return this.serverEventsUri;
/*     */   }
/*     */   
/*     */   public Date getDate() {
/* 328 */     return this.initialDevices.getDate();
/*     */   }
/*     */   
/*     */   public String getName() {
/* 332 */     return this.initialDevices.getDeviceInformation().getModel();
/*     */   }
/*     */   
/*     */   public String getHostname() {
/* 336 */     return this.initialDevices.getHostname();
/*     */   }
/*     */   
/*     */   public String reboot() throws ConnectException, SOAPException {
/* 340 */     return this.initialDevices.reboot();
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\soap\OnvifDevice.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */