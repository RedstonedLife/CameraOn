/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlSchemaType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
/*    */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
/*    */ @XmlType(name = "", propOrder = {"certificateID"})
/*    */ @XmlRootElement(name = "DeleteCertificates")
/*    */ public class DeleteCertificates
/*    */ {
/*    */   @XmlElement(name = "CertificateID", required = true)
/*    */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*    */   @XmlSchemaType(name = "token")
/*    */   protected List<String> certificateID;
/*    */   
/*    */   public List<String> getCertificateID() {
/* 73 */     if (this.certificateID == null) {
/* 74 */       this.certificateID = new ArrayList<>();
/*    */     }
/* 76 */     return this.certificateID;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\DeleteCertificates.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */