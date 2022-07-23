/*    */ package org.onvif.ver10.media.wsdl;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */ 
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
/*    */ @XmlType(name = "", propOrder = {"videoSourceModes"})
/*    */ @XmlRootElement(name = "GetVideoSourceModesResponse")
/*    */ public class GetVideoSourceModesResponse
/*    */ {
/*    */   @XmlElement(name = "VideoSourceModes", required = true)
/*    */   protected List<VideoSourceMode> videoSourceModes;
/*    */   
/*    */   public List<VideoSourceMode> getVideoSourceModes() {
/* 68 */     if (this.videoSourceModes == null) {
/* 69 */       this.videoSourceModes = new ArrayList<>();
/*    */     }
/* 71 */     return this.videoSourceModes;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\GetVideoSourceModesResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */