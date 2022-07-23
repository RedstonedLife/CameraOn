/*     */ package org.onvif.ver20.imaging.wsdl;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.namespace.QName;
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
/*     */ 
/*     */ @XmlRegistry
/*     */ public class ObjectFactory
/*     */ {
/*  34 */   private static final QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver20/imaging/wsdl", "Capabilities");
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
/*     */   public GetOptions createGetOptions() {
/*  48 */     return new GetOptions();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MoveResponse createMoveResponse() {
/*  56 */     return new MoveResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetImagingSettings createGetImagingSettings() {
/*  64 */     return new GetImagingSettings();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetStatus createGetStatus() {
/*  72 */     return new GetStatus();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetOptionsResponse createGetOptionsResponse() {
/*  80 */     return new GetOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
/*  88 */     return new GetServiceCapabilitiesResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Capabilities createCapabilities() {
/*  96 */     return new Capabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Stop createStop() {
/* 104 */     return new Stop();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetImagingSettingsResponse createSetImagingSettingsResponse() {
/* 112 */     return new SetImagingSettingsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StopResponse createStopResponse() {
/* 120 */     return new StopResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetStatusResponse createGetStatusResponse() {
/* 128 */     return new GetStatusResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetServiceCapabilities createGetServiceCapabilities() {
/* 136 */     return new GetServiceCapabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Move createMove() {
/* 144 */     return new Move();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetImagingSettingsResponse createGetImagingSettingsResponse() {
/* 152 */     return new GetImagingSettingsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetImagingSettings createSetImagingSettings() {
/* 160 */     return new SetImagingSettings();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetMoveOptions createGetMoveOptions() {
/* 168 */     return new GetMoveOptions();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetMoveOptionsResponse createGetMoveOptionsResponse() {
/* 176 */     return new GetMoveOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/imaging/wsdl", name = "Capabilities")
/*     */   public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
/* 185 */     return new JAXBElement(_Capabilities_QNAME, Capabilities.class, null, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\imaging\wsdl\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */