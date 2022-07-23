/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.CertificateWithPrivateKey;
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
/*    */ @XmlType(name = "", propOrder = {"certificateWithPrivateKey"})
/*    */ @XmlRootElement(name = "LoadCertificateWithPrivateKey")
/*    */ public class LoadCertificateWithPrivateKey
/*    */ {
/*    */   @XmlElement(name = "CertificateWithPrivateKey", required = true)
/*    */   protected List<CertificateWithPrivateKey> certificateWithPrivateKey;
/*    */   
/*    */   public List<CertificateWithPrivateKey> getCertificateWithPrivateKey() {
/* 69 */     if (this.certificateWithPrivateKey == null) {
/* 70 */       this.certificateWithPrivateKey = new ArrayList<>();
/*    */     }
/* 72 */     return this.certificateWithPrivateKey;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\LoadCertificateWithPrivateKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */