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
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "", propOrder = {"videoSourceToken", "videoSourceModeToken"})
/*    */ @XmlRootElement(name = "SetVideoSourceMode")
/*    */ public class SetVideoSourceMode
/*    */ {
/*    */   @XmlElement(name = "VideoSourceToken", required = true)
/*    */   protected String videoSourceToken;
/*    */   @XmlElement(name = "VideoSourceModeToken", required = true)
/*    */   protected String videoSourceModeToken;
/*    */   
/*    */   public String getVideoSourceToken() {
/* 55 */     return this.videoSourceToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setVideoSourceToken(String value) {
/* 66 */     this.videoSourceToken = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getVideoSourceModeToken() {
/* 76 */     return this.videoSourceModeToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setVideoSourceModeToken(String value) {
/* 87 */     this.videoSourceModeToken = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\SetVideoSourceMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */