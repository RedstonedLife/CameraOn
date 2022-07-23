/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.RelayOutputSettings;
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
/*    */ @XmlType(name = "", propOrder = {"relayOutputToken", "properties"})
/*    */ @XmlRootElement(name = "SetRelayOutputSettings")
/*    */ public class SetRelayOutputSettings
/*    */ {
/*    */   @XmlElement(name = "RelayOutputToken", required = true)
/*    */   protected String relayOutputToken;
/*    */   @XmlElement(name = "Properties", required = true)
/*    */   protected RelayOutputSettings properties;
/*    */   
/*    */   public String getRelayOutputToken() {
/* 56 */     return this.relayOutputToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRelayOutputToken(String value) {
/* 67 */     this.relayOutputToken = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public RelayOutputSettings getProperties() {
/* 77 */     return this.properties;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setProperties(RelayOutputSettings value) {
/* 88 */     this.properties = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SetRelayOutputSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */