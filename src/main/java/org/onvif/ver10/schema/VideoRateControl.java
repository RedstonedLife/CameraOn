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
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "VideoRateControl", propOrder = {"frameRateLimit", "encodingInterval", "bitrateLimit"})
/*    */ public class VideoRateControl
/*    */ {
/*    */   @XmlElement(name = "FrameRateLimit")
/*    */   protected int frameRateLimit;
/*    */   @XmlElement(name = "EncodingInterval")
/*    */   protected int encodingInterval;
/*    */   @XmlElement(name = "BitrateLimit")
/*    */   protected int bitrateLimit;
/*    */   
/*    */   public int getFrameRateLimit() {
/* 54 */     return this.frameRateLimit;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setFrameRateLimit(int value) {
/* 62 */     this.frameRateLimit = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getEncodingInterval() {
/* 70 */     return this.encodingInterval;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setEncodingInterval(int value) {
/* 78 */     this.encodingInterval = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getBitrateLimit() {
/* 86 */     return this.bitrateLimit;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setBitrateLimit(int value) {
/* 94 */     this.bitrateLimit = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\VideoRateControl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */