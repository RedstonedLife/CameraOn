/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlElements;
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
/*    */ 
/*    */ 
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
/*    */ @XmlType(name = "VideoAnalyticsStream", propOrder = {"frameOrExtension"})
/*    */ public class VideoAnalyticsStream
/*    */ {
/*    */   @XmlElements({@XmlElement(name = "Frame", type = Frame.class), @XmlElement(name = "Extension", type = VideoAnalyticsStreamExtension.class)})
/*    */   protected List<java.lang.Object> frameOrExtension;
/*    */   
/*    */   public List<java.lang.Object> getFrameOrExtension() {
/* 68 */     if (this.frameOrExtension == null) {
/* 69 */       this.frameOrExtension = new ArrayList();
/*    */     }
/* 71 */     return this.frameOrExtension;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\VideoAnalyticsStream.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */