/*     */ package onvif.soap.devices;
/*     */ 
/*     */ import onvif.soap.OnvifDevice;
/*     */ import onvif.soap.SOAP;
/*     */ import javax.xml.soap.SOAPException;
/*     */
import org.onvif.ver10.schema.AbsoluteFocus;
/*     */ import org.onvif.ver10.schema.FocusMove;
/*     */ import org.onvif.ver10.schema.ImagingOptions20;
/*     */ import org.onvif.ver10.schema.ImagingSettings20;
/*     */ import org.onvif.ver20.imaging.wsdl.GetImagingSettings;
/*     */ import org.onvif.ver20.imaging.wsdl.GetImagingSettingsResponse;
/*     */ import org.onvif.ver20.imaging.wsdl.GetOptions;
/*     */ import org.onvif.ver20.imaging.wsdl.GetOptionsResponse;
/*     */ import org.onvif.ver20.imaging.wsdl.Move;
/*     */ import org.onvif.ver20.imaging.wsdl.MoveResponse;
/*     */ import org.onvif.ver20.imaging.wsdl.SetImagingSettings;
/*     */ import org.onvif.ver20.imaging.wsdl.SetImagingSettingsResponse;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ImagingDevices
/*     */ {
/*     */   private OnvifDevice onvifDevice;
/*     */   private SOAP soap;
/*     */   
/*     */   public ImagingDevices(OnvifDevice onvifDevice) {
/*  29 */     this.onvifDevice = onvifDevice;
/*  30 */     this.soap = onvifDevice.getSoap();
/*     */   }
/*     */   
/*     */   public ImagingOptions20 getOptions(String videoSourceToken) {
/*  34 */     if (videoSourceToken == null) {
/*  35 */       return null;
/*     */     }
/*     */     
/*  38 */     GetOptions request = new GetOptions();
/*  39 */     GetOptionsResponse response = new GetOptionsResponse();
/*     */     
/*  41 */     request.setVideoSourceToken(videoSourceToken);
/*     */     
/*     */     try {
/*  44 */       response = (GetOptionsResponse)this.soap.createSOAPImagingRequest(request, response, false);
/*     */     }
/*  46 */     catch (SOAPException|java.net.ConnectException e) {
/*  47 */       e.printStackTrace();
/*  48 */       return null;
/*     */     } 
/*     */     
/*  51 */     if (response == null) {
/*  52 */       return null;
/*     */     }
/*     */     
/*  55 */     return response.getImagingOptions();
/*     */   }
/*     */   
/*     */   public boolean moveFocus(String videoSourceToken, float absoluteFocusValue) {
/*  59 */     if (videoSourceToken == null) {
/*  60 */       return false;
/*     */     }
/*     */     
/*  63 */     Move request = new Move();
/*  64 */     MoveResponse response = new MoveResponse();
/*     */     
/*  66 */     AbsoluteFocus absoluteFocus = new AbsoluteFocus();
/*  67 */     absoluteFocus.setPosition(absoluteFocusValue);
/*     */     
/*  69 */     FocusMove focusMove = new FocusMove();
/*  70 */     focusMove.setAbsolute(absoluteFocus);
/*     */     
/*  72 */     request.setVideoSourceToken(videoSourceToken);
/*  73 */     request.setFocus(focusMove);
/*     */     
/*     */     try {
/*  76 */       response = (MoveResponse)this.soap.createSOAPImagingRequest(request, response, true);
/*     */     }
/*  78 */     catch (SOAPException|java.net.ConnectException e) {
/*  79 */       e.printStackTrace();
/*  80 */       return false;
/*     */     } 
/*     */     
/*  83 */     if (response == null) {
/*  84 */       return false;
/*     */     }
/*     */     
/*  87 */     return true;
/*     */   }
/*     */   
/*     */   public ImagingSettings20 getImagingSettings(String videoSourceToken) {
/*  91 */     if (videoSourceToken == null) {
/*  92 */       return null;
/*     */     }
/*     */     
/*  95 */     GetImagingSettings request = new GetImagingSettings();
/*  96 */     GetImagingSettingsResponse response = new GetImagingSettingsResponse();
/*     */     
/*  98 */     request.setVideoSourceToken(videoSourceToken);
/*     */     
/*     */     try {
/* 101 */       response = (GetImagingSettingsResponse)this.soap.createSOAPImagingRequest(request, response, true);
/*     */     }
/* 103 */     catch (SOAPException|java.net.ConnectException e) {
/* 104 */       e.printStackTrace();
/* 105 */       return null;
/*     */     } 
/*     */     
/* 108 */     if (response == null) {
/* 109 */       return null;
/*     */     }
/*     */     
/* 112 */     return response.getImagingSettings();
/*     */   }
/*     */   
/*     */   public boolean setImagingSettings(String videoSourceToken, ImagingSettings20 imagingSettings) {
/* 116 */     if (videoSourceToken == null) {
/* 117 */       return false;
/*     */     }
/*     */     
/* 120 */     SetImagingSettings request = new SetImagingSettings();
/* 121 */     SetImagingSettingsResponse response = new SetImagingSettingsResponse();
/*     */     
/* 123 */     request.setVideoSourceToken(videoSourceToken);
/* 124 */     request.setImagingSettings(imagingSettings);
/*     */     
/*     */     try {
/* 127 */       response = (SetImagingSettingsResponse)this.soap.createSOAPImagingRequest(request, response, true);
/*     */     }
/* 129 */     catch (SOAPException|java.net.ConnectException e) {
/* 130 */       e.printStackTrace();
/* 131 */       return false;
/*     */     } 
/*     */     
/* 134 */     if (response == null) {
/* 135 */       return false;
/*     */     }
/*     */     
/* 138 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\soap\devices\ImagingDevices.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */