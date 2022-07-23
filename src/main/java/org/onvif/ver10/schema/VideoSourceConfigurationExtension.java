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
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "VideoSourceConfigurationExtension", propOrder = {"rotate", "extension"})
/*    */ public class VideoSourceConfigurationExtension
/*    */ {
/*    */   @XmlElement(name = "Rotate")
/*    */   protected Rotate rotate;
/*    */   @XmlElement(name = "Extension")
/*    */   protected VideoSourceConfigurationExtension2 extension;
/*    */   
/*    */   public Rotate getRotate() {
/* 53 */     return this.rotate;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRotate(Rotate value) {
/* 64 */     this.rotate = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public VideoSourceConfigurationExtension2 getExtension() {
/* 74 */     return this.extension;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setExtension(VideoSourceConfigurationExtension2 value) {
/* 85 */     this.extension = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\VideoSourceConfigurationExtension.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */