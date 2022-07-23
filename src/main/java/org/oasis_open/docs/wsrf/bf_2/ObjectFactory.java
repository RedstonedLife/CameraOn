/*    */ package org.oasis_open.docs.wsrf.bf_2;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlElementDecl;
/*    */ import javax.xml.bind.annotation.XmlRegistry;
/*    */ import javax.xml.namespace.QName;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlRegistry
/*    */ public class ObjectFactory
/*    */ {
/* 26 */   private static final QName _BaseFault_QNAME = new QName("http://docs.oasis-open.org/wsrf/bf-2", "BaseFault");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BaseFaultType createBaseFaultType() {
/* 40 */     return new BaseFaultType();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BaseFaultType.ErrorCode createBaseFaultTypeErrorCode() {
/* 48 */     return new BaseFaultType.ErrorCode();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BaseFaultType.Description createBaseFaultTypeDescription() {
/* 56 */     return new BaseFaultType.Description();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BaseFaultType.FaultCause createBaseFaultTypeFaultCause() {
/* 64 */     return new BaseFaultType.FaultCause();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/bf-2", name = "BaseFault")
/*    */   public JAXBElement<BaseFaultType> createBaseFault(BaseFaultType value) {
/* 73 */     return new JAXBElement(_BaseFault_QNAME, BaseFaultType.class, null, value);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\oasis_open\docs\wsrf\bf_2\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */