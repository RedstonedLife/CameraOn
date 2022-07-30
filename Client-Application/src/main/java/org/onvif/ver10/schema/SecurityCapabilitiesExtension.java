/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlType;
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
/*    */ @XmlType(name = "SecurityCapabilitiesExtension", propOrder = {"tls10", "extension"})
/*    */ public class SecurityCapabilitiesExtension
/*    */ {
/*    */   @XmlElement(name = "TLS1.0")
/*    */   protected boolean tls10;
/*    */   @XmlElement(name = "Extension")
/*    */   protected SecurityCapabilitiesExtension2 extension;
/*    */   
/*    */   public boolean isTLS10() {
/* 51 */     return this.tls10;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setTLS10(boolean value) {
/* 59 */     this.tls10 = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public SecurityCapabilitiesExtension2 getExtension() {
/* 69 */     return this.extension;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setExtension(SecurityCapabilitiesExtension2 value) {
/* 80 */     this.extension = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\SecurityCapabilitiesExtension.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */