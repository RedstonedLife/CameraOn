/*    */ package org.oasis_open.docs.wsn.b_2;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.namespace.QName;
/*    */ import org.oasis_open.docs.wsrf.bf_2.BaseFaultType;
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
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "UnrecognizedPolicyRequestFaultType", propOrder = {"unrecognizedPolicy"})
/*    */ public class UnrecognizedPolicyRequestFaultType
/*    */   extends BaseFaultType
/*    */ {
/*    */   @XmlElement(name = "UnrecognizedPolicy")
/*    */   protected List<QName> unrecognizedPolicy;
/*    */   
/*    */   public List<QName> getUnrecognizedPolicy() {
/* 69 */     if (this.unrecognizedPolicy == null) {
/* 70 */       this.unrecognizedPolicy = new ArrayList<>();
/*    */     }
/* 72 */     return this.unrecognizedPolicy;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\oasis_open\docs\wsn\b_2\UnrecognizedPolicyRequestFaultType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */