/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlSeeAlso;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "DeviceEntity")
/*    */ @XmlSeeAlso({RelayOutput.class, NetworkInterface.class, VideoOutput.class, AudioSource.class, OSDConfiguration.class, AudioOutput.class, VideoSource.class, DigitalInput.class, PTZNode.class})
/*    */ public class DeviceEntity
/*    */ {
/*    */   @XmlAttribute(name = "token", required = true)
/*    */   protected String token;
/*    */   
/*    */   public String getToken() {
/* 53 */     return this.token;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setToken(String value) {
/* 64 */     this.token = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\DeviceEntity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */