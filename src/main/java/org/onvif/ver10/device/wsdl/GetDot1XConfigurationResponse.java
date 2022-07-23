/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.Dot1XConfiguration;
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
/*    */ @XmlType(name = "", propOrder = {"dot1XConfiguration"})
/*    */ @XmlRootElement(name = "GetDot1XConfigurationResponse")
/*    */ public class GetDot1XConfigurationResponse
/*    */ {
/*    */   @XmlElement(name = "Dot1XConfiguration", required = true)
/*    */   protected Dot1XConfiguration dot1XConfiguration;
/*    */   
/*    */   public Dot1XConfiguration getDot1XConfiguration() {
/* 53 */     return this.dot1XConfiguration;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDot1XConfiguration(Dot1XConfiguration value) {
/* 64 */     this.dot1XConfiguration = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\GetDot1XConfigurationResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */