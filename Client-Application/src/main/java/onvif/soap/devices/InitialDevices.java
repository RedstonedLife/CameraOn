/*     */ package onvif.soap.devices;
/*     */ 
/*     */ import onvif.soap.OnvifDevice;
/*     */ import onvif.soap.SOAP;
/*     */ import java.net.ConnectException;
/*     */ import java.util.Calendar;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.List;
/*     */ import javax.xml.soap.SOAPException;
/*     */
import org.onvif.ver10.device.wsdl.GetCapabilities;
/*     */ import org.onvif.ver10.device.wsdl.GetCapabilitiesResponse;
/*     */ import org.onvif.ver10.device.wsdl.GetDeviceInformation;
/*     */ import org.onvif.ver10.device.wsdl.GetDeviceInformationResponse;
/*     */ import org.onvif.ver10.device.wsdl.GetHostname;
/*     */ import org.onvif.ver10.device.wsdl.GetHostnameResponse;
/*     */ import org.onvif.ver10.device.wsdl.GetScopes;
/*     */ import org.onvif.ver10.device.wsdl.GetScopesResponse;
/*     */ import org.onvif.ver10.device.wsdl.GetServices;
/*     */ import org.onvif.ver10.device.wsdl.GetServicesResponse;
/*     */ import org.onvif.ver10.device.wsdl.GetSystemDateAndTime;
/*     */ import org.onvif.ver10.device.wsdl.GetSystemDateAndTimeResponse;
/*     */ import org.onvif.ver10.device.wsdl.GetUsers;
/*     */ import org.onvif.ver10.device.wsdl.GetUsersResponse;
/*     */ import org.onvif.ver10.device.wsdl.Service;
/*     */ import org.onvif.ver10.device.wsdl.SetHostname;
/*     */ import org.onvif.ver10.device.wsdl.SetHostnameResponse;
/*     */ import org.onvif.ver10.device.wsdl.SystemReboot;
/*     */ import org.onvif.ver10.device.wsdl.SystemRebootResponse;
/*     */ import org.onvif.ver10.media.wsdl.CreateProfile;
/*     */ import org.onvif.ver10.media.wsdl.CreateProfileResponse;
/*     */ import org.onvif.ver10.media.wsdl.GetProfile;
/*     */ import org.onvif.ver10.media.wsdl.GetProfileResponse;
/*     */ import org.onvif.ver10.media.wsdl.GetProfiles;
/*     */ import org.onvif.ver10.media.wsdl.GetProfilesResponse;
import org.onvif.ver10.schema.*;
/*     */
/*     */
/*     */
/*     */

/*     */
/*     */ 
/*     */ 
/*     */ public class InitialDevices
/*     */ {
/*     */   private SOAP soap;
/*     */   private OnvifDevice onvifDevice;
/*     */   
/*     */   public InitialDevices(OnvifDevice onvifDevice) {
/*  51 */     this.onvifDevice = onvifDevice;
/*  52 */     this.soap = onvifDevice.getSoap();
/*     */   }
/*     */   
/*     */   public java.util.Date getDate() {
/*  56 */     Calendar cal = null;
/*     */     
/*  58 */     GetSystemDateAndTimeResponse response = new GetSystemDateAndTimeResponse();
/*     */     
/*     */     try {
/*  61 */       response = (GetSystemDateAndTimeResponse)this.soap.createSOAPDeviceRequest(new GetSystemDateAndTime(), response, false);
/*     */     }
/*  63 */     catch (SOAPException|ConnectException e) {
/*  64 */       e.printStackTrace();
/*  65 */       return null;
/*     */     } 
/*     */     
/*  68 */     Date date = response.getSystemDateAndTime().getUTCDateTime().getDate();
/*  69 */     Time time = response.getSystemDateAndTime().getUTCDateTime().getTime();
/*  70 */     cal = new GregorianCalendar(date.getYear(), date.getMonth() - 1, date.getDay(), time.getHour(), time.getMinute(), time.getSecond());
/*     */     
/*  72 */     return cal.getTime();
/*     */   }
/*     */   
/*     */   public GetDeviceInformationResponse getDeviceInformation() {
/*  76 */     GetDeviceInformation getHostname = new GetDeviceInformation();
/*  77 */     GetDeviceInformationResponse response = new GetDeviceInformationResponse();
/*     */     try {
/*  79 */       response = (GetDeviceInformationResponse)this.soap.createSOAPDeviceRequest(getHostname, response, true);
/*     */     }
/*  81 */     catch (SOAPException|ConnectException e) {
/*  82 */       e.printStackTrace();
/*  83 */       return null;
/*     */     } 
/*     */     
/*  86 */     return response;
/*     */   }
/*     */   
/*     */   public String getHostname() {
/*  90 */     GetHostname getHostname = new GetHostname();
/*  91 */     GetHostnameResponse response = new GetHostnameResponse();
/*     */     try {
/*  93 */       response = (GetHostnameResponse)this.soap.createSOAPDeviceRequest(getHostname, response, true);
/*     */     }
/*  95 */     catch (SOAPException|ConnectException e) {
/*  96 */       e.printStackTrace();
/*  97 */       return null;
/*     */     } 
/*     */     
/* 100 */     return response.getHostnameInformation().getName();
/*     */   }
/*     */   
/*     */   public boolean setHostname(String hostname) {
/* 104 */     SetHostname setHostname = new SetHostname();
/* 105 */     setHostname.setName(hostname);
/* 106 */     SetHostnameResponse response = new SetHostnameResponse();
/*     */     try {
/* 108 */       response = (SetHostnameResponse)this.soap.createSOAPDeviceRequest(setHostname, response, true);
/*     */     }
/* 110 */     catch (SOAPException|ConnectException e) {
/* 111 */       e.printStackTrace();
/* 112 */       return false;
/*     */     } 
/*     */     
/* 115 */     return true;
/*     */   }
/*     */   
/*     */   public List<User> getUsers() {
/* 119 */     GetUsers getUsers = new GetUsers();
/* 120 */     GetUsersResponse response = new GetUsersResponse();
/*     */     try {
/* 122 */       response = (GetUsersResponse)this.soap.createSOAPDeviceRequest(getUsers, response, true);
/*     */     }
/* 124 */     catch (SOAPException|ConnectException e) {
/* 125 */       e.printStackTrace();
/* 126 */       return null;
/*     */     } 
/*     */     
/* 129 */     if (response == null) {
/* 130 */       return null;
/*     */     }
/*     */     
/* 133 */     return response.getUser();
/*     */   }
/*     */   
/*     */   public Capabilities getCapabilities() throws ConnectException, SOAPException {
/* 137 */     GetCapabilities getCapabilities = new GetCapabilities();
/* 138 */     GetCapabilitiesResponse response = new GetCapabilitiesResponse();
/*     */     
/*     */     try {
/* 141 */       response = (GetCapabilitiesResponse)this.soap.createSOAPRequest(getCapabilities, response, this.onvifDevice.getDeviceUri(), false);
/*     */     }
/* 143 */     catch (SOAPException e) {
/* 144 */       throw e;
/*     */     } 
/*     */     
/* 147 */     if (response == null) {
/* 148 */       return null;
/*     */     }
/*     */     
/* 151 */     return response.getCapabilities();
/*     */   }
/*     */   
/*     */   public List<Profile> getProfiles() {
/* 155 */     GetProfiles request = new GetProfiles();
/* 156 */     GetProfilesResponse response = new GetProfilesResponse();
/*     */     
/*     */     try {
/* 159 */       response = (GetProfilesResponse)this.soap.createSOAPMediaRequest(request, response, true);
/*     */     }
/* 161 */     catch (SOAPException|ConnectException e) {
/* 162 */       e.printStackTrace();
/* 163 */       return null;
/*     */     } 
/*     */     
/* 166 */     if (response == null) {
/* 167 */       return null;
/*     */     }
/*     */     
/* 170 */     return response.getProfiles();
/*     */   }
/*     */   
/*     */   public Profile getProfile(String profileToken) {
/* 174 */     GetProfile request = new GetProfile();
/* 175 */     GetProfileResponse response = new GetProfileResponse();
/*     */     
/* 177 */     request.setProfileToken(profileToken);
/*     */     
/*     */     try {
/* 180 */       response = (GetProfileResponse)this.soap.createSOAPMediaRequest(request, response, true);
/*     */     }
/* 182 */     catch (SOAPException|ConnectException e) {
/* 183 */       e.printStackTrace();
/* 184 */       return null;
/*     */     } 
/*     */     
/* 187 */     if (response == null) {
/* 188 */       return null;
/*     */     }
/*     */     
/* 191 */     return response.getProfile();
/*     */   }
/*     */   
/*     */   public Profile createProfile(String name) {
/* 195 */     CreateProfile request = new CreateProfile();
/* 196 */     CreateProfileResponse response = new CreateProfileResponse();
/*     */     
/* 198 */     request.setName(name);
/*     */     
/*     */     try {
/* 201 */       response = (CreateProfileResponse)this.soap.createSOAPMediaRequest(request, response, true);
/*     */     }
/* 203 */     catch (SOAPException|ConnectException e) {
/* 204 */       e.printStackTrace();
/* 205 */       return null;
/*     */     } 
/*     */     
/* 208 */     if (response == null) {
/* 209 */       return null;
/*     */     }
/*     */     
/* 212 */     return response.getProfile();
/*     */   }
/*     */   
/*     */   public List<Service> getServices(boolean includeCapability) {
/* 216 */     GetServices request = new GetServices();
/* 217 */     GetServicesResponse response = new GetServicesResponse();
/*     */     
/* 219 */     request.setIncludeCapability(includeCapability);
/*     */     
/*     */     try {
/* 222 */       response = (GetServicesResponse)this.soap.createSOAPDeviceRequest(request, response, true);
/*     */     }
/* 224 */     catch (SOAPException|ConnectException e) {
/* 225 */       e.printStackTrace();
/* 226 */       return null;
/*     */     } 
/*     */     
/* 229 */     if (response == null) {
/* 230 */       return null;
/*     */     }
/*     */     
/* 233 */     return response.getService();
/*     */   }
/*     */   
/*     */   public List<Scope> getScopes() {
/* 237 */     GetScopes request = new GetScopes();
/* 238 */     GetScopesResponse response = new GetScopesResponse();
/*     */     
/*     */     try {
/* 241 */       response = (GetScopesResponse)this.soap.createSOAPMediaRequest(request, response, true);
/*     */     }
/* 243 */     catch (SOAPException|ConnectException e) {
/* 244 */       e.printStackTrace();
/* 245 */       return null;
/*     */     } 
/*     */     
/* 248 */     if (response == null) {
/* 249 */       return null;
/*     */     }
/*     */     
/* 252 */     return response.getScopes();
/*     */   }
/*     */   
/*     */   public String reboot() throws ConnectException, SOAPException {
/* 256 */     SystemReboot request = new SystemReboot();
/* 257 */     SystemRebootResponse response = new SystemRebootResponse();
/*     */     
/*     */     try {
/* 260 */       response = (SystemRebootResponse)this.soap.createSOAPMediaRequest(request, response, true);
/*     */     }
/* 262 */     catch (SOAPException|ConnectException e) {
/* 263 */       throw e;
/*     */     } 
/*     */     
/* 266 */     if (response == null) {
/* 267 */       return null;
/*     */     }
/*     */     
/* 270 */     return response.getMessage();
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\soap\devices\InitialDevices.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */