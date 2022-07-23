/*    */ package org.onvif.ver10.events.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "", propOrder = {"capabilities"})
/*    */ @XmlRootElement(name = "GetServiceCapabilitiesResponse")
/*    */ public class GetServiceCapabilitiesResponse
/*    */ {
/*    */   @XmlElement(name = "Capabilities", required = true)
/*    */   protected Capabilities capabilities;
/*    */   
/*    */   public Capabilities getCapabilities() {
/* 56 */     return this.capabilities;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCapabilities(Capabilities value) {
/* 68 */     this.capabilities = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\events\wsdl\GetServiceCapabilitiesResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */