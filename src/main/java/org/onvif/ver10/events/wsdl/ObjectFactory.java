/*     */ package org.onvif.ver10.events.wsdl;
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
/*  34 */   private static final QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/events/wsdl", "Capabilities");
/*  35 */   private static final QName _CreatePullPointSubscriptionInitialTerminationTime_QNAME = new QName("http://www.onvif.org/ver10/events/wsdl", "InitialTerminationTime");
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
/*     */   public CreatePullPointSubscription createCreatePullPointSubscription() {
/*  49 */     return new CreatePullPointSubscription();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SeekResponse createSeekResponse() {
/*  57 */     return new SeekResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PullMessages createPullMessages() {
/*  65 */     return new PullMessages();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PullMessagesResponse createPullMessagesResponse() {
/*  73 */     return new PullMessagesResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreatePullPointSubscriptionResponse createCreatePullPointSubscriptionResponse() {
/*  81 */     return new CreatePullPointSubscriptionResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
/*  89 */     return new GetServiceCapabilitiesResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Capabilities createCapabilities() {
/*  97 */     return new Capabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetSynchronizationPointResponse createSetSynchronizationPointResponse() {
/* 105 */     return new SetSynchronizationPointResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetEventProperties createGetEventProperties() {
/* 113 */     return new GetEventProperties();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetServiceCapabilities createGetServiceCapabilities() {
/* 121 */     return new GetServiceCapabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetEventPropertiesResponse createGetEventPropertiesResponse() {
/* 129 */     return new GetEventPropertiesResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetSynchronizationPoint createSetSynchronizationPoint() {
/* 137 */     return new SetSynchronizationPoint();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreatePullPointSubscription.SubscriptionPolicy createCreatePullPointSubscriptionSubscriptionPolicy() {
/* 145 */     return new CreatePullPointSubscription.SubscriptionPolicy();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PullMessagesFaultResponse createPullMessagesFaultResponse() {
/* 153 */     return new PullMessagesFaultResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Seek createSeek() {
/* 161 */     return new Seek();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SubscriptionPolicy createSubscriptionPolicy() {
/* 169 */     return new SubscriptionPolicy();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "Capabilities")
/*     */   public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
/* 178 */     return new JAXBElement(_Capabilities_QNAME, Capabilities.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "InitialTerminationTime", scope = CreatePullPointSubscription.class)
/*     */   public JAXBElement<String> createCreatePullPointSubscriptionInitialTerminationTime(String value) {
/* 187 */     return new JAXBElement(_CreatePullPointSubscriptionInitialTerminationTime_QNAME, String.class, CreatePullPointSubscription.class, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\events\wsdl\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */