/*     */ package org.w3._2005._08.addressing;
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
/*     */ @XmlRegistry
/*     */ public class ObjectFactory
/*     */ {
/*  26 */   private static final QName _EndpointReference_QNAME = new QName("http://www.w3.org/2005/08/addressing", "EndpointReference");
/*  27 */   private static final QName _ProblemHeaderQName_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemHeaderQName");
/*  28 */   private static final QName _RetryAfter_QNAME = new QName("http://www.w3.org/2005/08/addressing", "RetryAfter");
/*  29 */   private static final QName _To_QNAME = new QName("http://www.w3.org/2005/08/addressing", "To");
/*  30 */   private static final QName _ProblemHeader_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemHeader");
/*  31 */   private static final QName _Metadata_QNAME = new QName("http://www.w3.org/2005/08/addressing", "Metadata");
/*  32 */   private static final QName _MessageID_QNAME = new QName("http://www.w3.org/2005/08/addressing", "MessageID");
/*  33 */   private static final QName _ProblemIRI_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemIRI");
/*  34 */   private static final QName _From_QNAME = new QName("http://www.w3.org/2005/08/addressing", "From");
/*  35 */   private static final QName _ReplyTo_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ReplyTo");
/*  36 */   private static final QName _Action_QNAME = new QName("http://www.w3.org/2005/08/addressing", "Action");
/*  37 */   private static final QName _FaultTo_QNAME = new QName("http://www.w3.org/2005/08/addressing", "FaultTo");
/*  38 */   private static final QName _ProblemAction_QNAME = new QName("http://www.w3.org/2005/08/addressing", "ProblemAction");
/*  39 */   private static final QName _RelatesTo_QNAME = new QName("http://www.w3.org/2005/08/addressing", "RelatesTo");
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
/*     */   public EndpointReferenceType createEndpointReferenceType() {
/*  53 */     return new EndpointReferenceType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ProblemActionType createProblemActionType() {
/*  61 */     return new ProblemActionType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AttributedAnyType createAttributedAnyType() {
/*  69 */     return new AttributedAnyType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AttributedURIType createAttributedURIType() {
/*  77 */     return new AttributedURIType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AttributedQNameType createAttributedQNameType() {
/*  85 */     return new AttributedQNameType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AttributedUnsignedLongType createAttributedUnsignedLongType() {
/*  93 */     return new AttributedUnsignedLongType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MetadataType createMetadataType() {
/* 101 */     return new MetadataType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RelatesToType createRelatesToType() {
/* 109 */     return new RelatesToType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReferenceParametersType createReferenceParametersType() {
/* 117 */     return new ReferenceParametersType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "EndpointReference")
/*     */   public JAXBElement<EndpointReferenceType> createEndpointReference(EndpointReferenceType value) {
/* 126 */     return new JAXBElement(_EndpointReference_QNAME, EndpointReferenceType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemHeaderQName")
/*     */   public JAXBElement<AttributedQNameType> createProblemHeaderQName(AttributedQNameType value) {
/* 135 */     return new JAXBElement(_ProblemHeaderQName_QNAME, AttributedQNameType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "RetryAfter")
/*     */   public JAXBElement<AttributedUnsignedLongType> createRetryAfter(AttributedUnsignedLongType value) {
/* 144 */     return new JAXBElement(_RetryAfter_QNAME, AttributedUnsignedLongType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "To")
/*     */   public JAXBElement<AttributedURIType> createTo(AttributedURIType value) {
/* 153 */     return new JAXBElement(_To_QNAME, AttributedURIType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemHeader")
/*     */   public JAXBElement<AttributedAnyType> createProblemHeader(AttributedAnyType value) {
/* 162 */     return new JAXBElement(_ProblemHeader_QNAME, AttributedAnyType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "Metadata")
/*     */   public JAXBElement<MetadataType> createMetadata(MetadataType value) {
/* 171 */     return new JAXBElement(_Metadata_QNAME, MetadataType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "MessageID")
/*     */   public JAXBElement<AttributedURIType> createMessageID(AttributedURIType value) {
/* 180 */     return new JAXBElement(_MessageID_QNAME, AttributedURIType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemIRI")
/*     */   public JAXBElement<AttributedURIType> createProblemIRI(AttributedURIType value) {
/* 189 */     return new JAXBElement(_ProblemIRI_QNAME, AttributedURIType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "From")
/*     */   public JAXBElement<EndpointReferenceType> createFrom(EndpointReferenceType value) {
/* 198 */     return new JAXBElement(_From_QNAME, EndpointReferenceType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ReplyTo")
/*     */   public JAXBElement<EndpointReferenceType> createReplyTo(EndpointReferenceType value) {
/* 207 */     return new JAXBElement(_ReplyTo_QNAME, EndpointReferenceType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "Action")
/*     */   public JAXBElement<AttributedURIType> createAction(AttributedURIType value) {
/* 216 */     return new JAXBElement(_Action_QNAME, AttributedURIType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "FaultTo")
/*     */   public JAXBElement<EndpointReferenceType> createFaultTo(EndpointReferenceType value) {
/* 225 */     return new JAXBElement(_FaultTo_QNAME, EndpointReferenceType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "ProblemAction")
/*     */   public JAXBElement<ProblemActionType> createProblemAction(ProblemActionType value) {
/* 234 */     return new JAXBElement(_ProblemAction_QNAME, ProblemActionType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.w3.org/2005/08/addressing", name = "RelatesTo")
/*     */   public JAXBElement<RelatesToType> createRelatesTo(RelatesToType value) {
/* 243 */     return new JAXBElement(_RelatesTo_QNAME, RelatesToType.class, null, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\w3\_2005\_08\addressing\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */