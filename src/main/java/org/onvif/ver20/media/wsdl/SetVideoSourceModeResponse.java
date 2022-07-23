/*    */ package org.onvif.ver20.media.wsdl;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "", propOrder = {"reboot"})
/*    */ @XmlRootElement(name = "SetVideoSourceModeResponse")
/*    */ public class SetVideoSourceModeResponse
/*    */ {
/*    */   @XmlElement(name = "Reboot")
/*    */   protected boolean reboot;
/*    */   
/*    */   public boolean isReboot() {
/* 52 */     return this.reboot;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setReboot(boolean value) {
/* 60 */     this.reboot = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\media\wsdl\SetVideoSourceModeResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */