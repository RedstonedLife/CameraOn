/*     */ package org.xmlsoap.schemas.soap.envelope;
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
/*  26 */   private static final QName _Body_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
/*  27 */   private static final QName _Envelope_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
/*  28 */   private static final QName _Fault_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
/*  29 */   private static final QName _Header_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");
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
/*     */   public Body createBody() {
/*  43 */     return new Body();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Header createHeader() {
/*  51 */     return new Header();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Envelope createEnvelope() {
/*  59 */     return new Envelope();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Fault createFault() {
/*  67 */     return new Fault();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Detail createDetail() {
/*  75 */     return new Detail();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Body")
/*     */   public JAXBElement<Body> createBody(Body value) {
/*  84 */     return new JAXBElement(_Body_QNAME, Body.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Envelope")
/*     */   public JAXBElement<Envelope> createEnvelope(Envelope value) {
/*  93 */     return new JAXBElement(_Envelope_QNAME, Envelope.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Fault")
/*     */   public JAXBElement<Fault> createFault(Fault value) {
/* 102 */     return new JAXBElement(_Fault_QNAME, Fault.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Header")
/*     */   public JAXBElement<Header> createHeader(Header value) {
/* 111 */     return new JAXBElement(_Header_QNAME, Header.class, null, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\xmlsoap\schemas\soap\envelope\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */