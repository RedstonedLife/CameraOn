/*    */ package org.onvif.ver10.media.wsdl;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "", propOrder = {"reboot"})
/*    */ @XmlRootElement(name = "SetVideoSourceModeResponse")
/*    */ public class SetVideoSourceModeResponse
/*    */ {
/*    */   @XmlElement(name = "Reboot")
/*    */   protected boolean reboot;
/*    */   
/*    */   public boolean isReboot() {
/* 50 */     return this.reboot;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setReboot(boolean value) {
/* 58 */     this.reboot = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\SetVideoSourceModeResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */