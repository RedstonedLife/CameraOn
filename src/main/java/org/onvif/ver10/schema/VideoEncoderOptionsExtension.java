/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "VideoEncoderOptionsExtension", propOrder = {"any", "jpeg", "mpeg4", "h264", "extension"})
/*     */ public class VideoEncoderOptionsExtension
/*     */ {
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlElement(name = "JPEG")
/*     */   protected JpegOptions2 jpeg;
/*     */   @XmlElement(name = "MPEG4")
/*     */   protected Mpeg4Options2 mpeg4;
/*     */   @XmlElement(name = "H264")
/*     */   protected H264Options2 h264;
/*     */   @XmlElement(name = "Extension")
/*     */   protected VideoEncoderOptionsExtension2 extension;
/*     */   
/*     */   public List<java.lang.Object> getAny() {
/*  80 */     if (this.any == null) {
/*  81 */       this.any = new ArrayList();
/*     */     }
/*  83 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JpegOptions2 getJPEG() {
/*  93 */     return this.jpeg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJPEG(JpegOptions2 value) {
/* 104 */     this.jpeg = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mpeg4Options2 getMPEG4() {
/* 114 */     return this.mpeg4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMPEG4(Mpeg4Options2 value) {
/* 125 */     this.mpeg4 = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public H264Options2 getH264() {
/* 135 */     return this.h264;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setH264(H264Options2 value) {
/* 146 */     this.h264 = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoEncoderOptionsExtension2 getExtension() {
/* 156 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(VideoEncoderOptionsExtension2 value) {
/* 167 */     this.extension = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\VideoEncoderOptionsExtension.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */