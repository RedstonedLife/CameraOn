/*     */ package onvif.soap.devices;
/*     */ 
/*     */ import onvif.soap.OnvifDevice;
/*     */ import onvif.soap.SOAP;
/*     */ import java.net.ConnectException;
/*     */ import java.util.List;
/*     */ import javax.xml.soap.SOAPException;
/*     */ import org.onvif.ver10.media.wsdl.GetSnapshotUri;
/*     */ import org.onvif.ver10.media.wsdl.GetSnapshotUriResponse;
/*     */ import org.onvif.ver10.media.wsdl.GetStreamUri;
/*     */ import org.onvif.ver10.media.wsdl.GetStreamUriResponse;
/*     */ import org.onvif.ver10.media.wsdl.GetVideoEncoderConfigurationOptions;
/*     */ import org.onvif.ver10.media.wsdl.GetVideoEncoderConfigurationOptionsResponse;
/*     */ import org.onvif.ver10.media.wsdl.GetVideoSources;
/*     */ import org.onvif.ver10.media.wsdl.GetVideoSourcesResponse;
/*     */ import org.onvif.ver10.media.wsdl.SetVideoEncoderConfiguration;
/*     */ import org.onvif.ver10.media.wsdl.SetVideoEncoderConfigurationResponse;
/*     */ import org.onvif.ver10.schema.Profile;
/*     */ import org.onvif.ver10.schema.StreamSetup;
/*     */ import org.onvif.ver10.schema.StreamType;
/*     */ import org.onvif.ver10.schema.Transport;
/*     */ import org.onvif.ver10.schema.TransportProtocol;
/*     */ import org.onvif.ver10.schema.VideoEncoderConfiguration;
/*     */ import org.onvif.ver10.schema.VideoEncoderConfigurationOptions;
/*     */ import org.onvif.ver10.schema.VideoSource;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MediaDevices
/*     */ {
/*     */   private OnvifDevice onvifDevice;
/*     */   private SOAP soap;
/*     */   
/*     */   public MediaDevices(OnvifDevice onvifDevice) {
/*  35 */     this.onvifDevice = onvifDevice;
/*  36 */     this.soap = onvifDevice.getSoap();
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public String getHTTPStreamUri(int profileNumber) throws ConnectException, SOAPException {
/*  41 */     StreamSetup setup = new StreamSetup();
/*  42 */     setup.setStream(StreamType.RTP_UNICAST);
/*  43 */     Transport transport = new Transport();
/*  44 */     transport.setProtocol(TransportProtocol.HTTP);
/*  45 */     setup.setTransport(transport);
/*  46 */     return getStreamUri(setup, profileNumber);
/*     */   }
/*     */   
/*     */   public String getHTTPStreamUri(String profileToken) throws ConnectException, SOAPException {
/*  50 */     StreamSetup setup = new StreamSetup();
/*  51 */     setup.setStream(StreamType.RTP_UNICAST);
/*  52 */     Transport transport = new Transport();
/*  53 */     transport.setProtocol(TransportProtocol.HTTP);
/*  54 */     setup.setTransport(transport);
/*  55 */     return getStreamUri(profileToken, setup);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public String getUDPStreamUri(int profileNumber) throws ConnectException, SOAPException {
/*  60 */     StreamSetup setup = new StreamSetup();
/*  61 */     setup.setStream(StreamType.RTP_UNICAST);
/*  62 */     Transport transport = new Transport();
/*  63 */     transport.setProtocol(TransportProtocol.UDP);
/*  64 */     setup.setTransport(transport);
/*  65 */     return getStreamUri(setup, profileNumber);
/*     */   }
/*     */   
/*     */   public String getUDPStreamUri(String profileToken) throws ConnectException, SOAPException {
/*  69 */     StreamSetup setup = new StreamSetup();
/*  70 */     setup.setStream(StreamType.RTP_UNICAST);
/*  71 */     Transport transport = new Transport();
/*  72 */     transport.setProtocol(TransportProtocol.UDP);
/*  73 */     setup.setTransport(transport);
/*  74 */     return getStreamUri(profileToken, setup);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public String getTCPStreamUri(int profileNumber) throws ConnectException, SOAPException {
/*  79 */     StreamSetup setup = new StreamSetup();
/*  80 */     setup.setStream(StreamType.RTP_UNICAST);
/*  81 */     Transport transport = new Transport();
/*  82 */     transport.setProtocol(TransportProtocol.TCP);
/*  83 */     setup.setTransport(transport);
/*  84 */     return getStreamUri(setup, profileNumber);
/*     */   }
/*     */   
/*     */   public String getTCPStreamUri(String profileToken) throws ConnectException, SOAPException {
/*  88 */     StreamSetup setup = new StreamSetup();
/*  89 */     setup.setStream(StreamType.RTP_UNICAST);
/*  90 */     Transport transport = new Transport();
/*  91 */     transport.setProtocol(TransportProtocol.TCP);
/*  92 */     setup.setTransport(transport);
/*  93 */     return getStreamUri(profileToken, setup);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public String getRTSPStreamUri(int profileNumber) throws ConnectException, SOAPException {
/*  98 */     StreamSetup setup = new StreamSetup();
/*  99 */     setup.setStream(StreamType.RTP_UNICAST);
/* 100 */     Transport transport = new Transport();
/* 101 */     transport.setProtocol(TransportProtocol.TCP);
/* 102 */     setup.setTransport(transport);
/* 103 */     return getStreamUri(setup, profileNumber);
/*     */   }
/*     */   
/*     */   public String getRTSPStreamUri(String profileToken) throws ConnectException, SOAPException {
/* 107 */     StreamSetup setup = new StreamSetup();
/* 108 */     setup.setStream(StreamType.RTP_UNICAST);
/* 109 */     Transport transport = new Transport();
/* 110 */     transport.setProtocol(TransportProtocol.TCP);
/* 111 */     setup.setTransport(transport);
/* 112 */     return getStreamUri(profileToken, setup);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public String getStreamUri(StreamSetup streamSetup, int profileNumber) throws ConnectException, SOAPException {
/* 117 */     Profile profile = this.onvifDevice.getDevices().getProfiles().get(profileNumber);
/* 118 */     return getStreamUri(profile, streamSetup);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public String getStreamUri(Profile profile, StreamSetup streamSetup) throws ConnectException, SOAPException {
/* 123 */     return getStreamUri(profile.getToken(), streamSetup);
/*     */   }
/*     */   
/*     */   public String getStreamUri(String profileToken, StreamSetup streamSetup) throws SOAPException, ConnectException {
/* 127 */     GetStreamUri request = new GetStreamUri();
/* 128 */     GetStreamUriResponse response = new GetStreamUriResponse();
/*     */     
/* 130 */     request.setProfileToken(profileToken);
/* 131 */     request.setStreamSetup(streamSetup);
/*     */     
/*     */     try {
/* 134 */       response = (GetStreamUriResponse)this.soap.createSOAPMediaRequest(request, response, false);
/*     */     }
/* 136 */     catch (SOAPException|ConnectException e) {
/* 137 */       throw e;
/*     */     } 
/*     */     
/* 140 */     if (response == null) {
/* 141 */       return null;
/*     */     }
/*     */     
/* 144 */     return this.onvifDevice.replaceLocalIpWithProxyIp(response.getMediaUri().getUri());
/*     */   }
/*     */   
/*     */   public static VideoEncoderConfiguration getVideoEncoderConfiguration(Profile profile) {
/* 148 */     return profile.getVideoEncoderConfiguration();
/*     */   }
/*     */   
/*     */   public VideoEncoderConfigurationOptions getVideoEncoderConfigurationOptions(String profileToken) throws SOAPException, ConnectException {
/* 152 */     GetVideoEncoderConfigurationOptions request = new GetVideoEncoderConfigurationOptions();
/* 153 */     GetVideoEncoderConfigurationOptionsResponse response = new GetVideoEncoderConfigurationOptionsResponse();
/*     */     
/* 155 */     request.setProfileToken(profileToken);
/*     */     
/*     */     try {
/* 158 */       response = (GetVideoEncoderConfigurationOptionsResponse)this.soap.createSOAPMediaRequest(request, response, false);
/*     */     }
/* 160 */     catch (SOAPException|ConnectException e) {
/* 161 */       throw e;
/*     */     } 
/*     */     
/* 164 */     if (response == null) {
/* 165 */       return null;
/*     */     }
/*     */     
/* 168 */     return response.getOptions();
/*     */   }
/*     */   
/*     */   public boolean setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) throws SOAPException, ConnectException {
/* 172 */     SetVideoEncoderConfiguration request = new SetVideoEncoderConfiguration();
/* 173 */     SetVideoEncoderConfigurationResponse response = new SetVideoEncoderConfigurationResponse();
/*     */     
/* 175 */     request.setConfiguration(videoEncoderConfiguration);
/* 176 */     request.setForcePersistence(true);
/*     */     
/*     */     try {
/* 179 */       response = (SetVideoEncoderConfigurationResponse)this.soap.createSOAPMediaRequest(request, response, true);
/*     */     }
/* 181 */     catch (SOAPException|ConnectException e) {
/* 182 */       throw e;
/*     */     } 
/*     */     
/* 185 */     if (response == null) {
/* 186 */       return false;
/*     */     }
/*     */     
/* 189 */     return true;
/*     */   }
/*     */   
/*     */   public String getSceenshotUri(String profileToken) throws SOAPException, ConnectException {
/* 193 */     return getSnapshotUri(profileToken);
/*     */   }
/*     */   
/*     */   public String getSnapshotUri(String profileToken) throws SOAPException, ConnectException {
/* 197 */     GetSnapshotUri request = new GetSnapshotUri();
/* 198 */     GetSnapshotUriResponse response = new GetSnapshotUriResponse();
/*     */     
/* 200 */     request.setProfileToken(profileToken);
/*     */     
/*     */     try {
/* 203 */       response = (GetSnapshotUriResponse)this.soap.createSOAPMediaRequest(request, response, true);
/*     */     }
/* 205 */     catch (SOAPException|ConnectException e) {
/* 206 */       throw e;
/*     */     } 
/*     */     
/* 209 */     if (response == null || response.getMediaUri() == null) {
/* 210 */       return null;
/*     */     }
/*     */     
/* 213 */     return this.onvifDevice.replaceLocalIpWithProxyIp(response.getMediaUri().getUri());
/*     */   }
/*     */   
/*     */   public List<VideoSource> getVideoSources() throws SOAPException, ConnectException {
/* 217 */     GetVideoSources request = new GetVideoSources();
/* 218 */     GetVideoSourcesResponse response = new GetVideoSourcesResponse();
/*     */     
/*     */     try {
/* 221 */       response = (GetVideoSourcesResponse)this.soap.createSOAPMediaRequest(request, response, false);
/*     */     }
/* 223 */     catch (SOAPException|ConnectException e) {
/* 224 */       throw e;
/*     */     } 
/*     */     
/* 227 */     if (response == null) {
/* 228 */       return null;
/*     */     }
/*     */     
/* 231 */     return response.getVideoSources();
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\soap\devices\MediaDevices.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */