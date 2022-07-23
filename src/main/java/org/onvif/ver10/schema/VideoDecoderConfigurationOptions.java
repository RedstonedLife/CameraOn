/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.namespace.QName;
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
/*     */ @XmlType(name = "VideoDecoderConfigurationOptions", propOrder = {"jpegDecOptions", "h264DecOptions", "mpeg4DecOptions", "extension"})
/*     */ public class VideoDecoderConfigurationOptions
/*     */ {
/*     */   @XmlElement(name = "JpegDecOptions")
/*     */   protected JpegDecOptions jpegDecOptions;
/*     */   @XmlElement(name = "H264DecOptions")
/*     */   protected H264DecOptions h264DecOptions;
/*     */   @XmlElement(name = "Mpeg4DecOptions")
/*     */   protected Mpeg4DecOptions mpeg4DecOptions;
/*     */   @XmlElement(name = "Extension")
/*     */   protected VideoDecoderConfigurationOptionsExtension extension;
/*     */   @XmlAnyAttribute
/*  57 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JpegDecOptions getJpegDecOptions() {
/*  66 */     return this.jpegDecOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJpegDecOptions(JpegDecOptions value) {
/*  77 */     this.jpegDecOptions = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public H264DecOptions getH264DecOptions() {
/*  87 */     return this.h264DecOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setH264DecOptions(H264DecOptions value) {
/*  98 */     this.h264DecOptions = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mpeg4DecOptions getMpeg4DecOptions() {
/* 108 */     return this.mpeg4DecOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMpeg4DecOptions(Mpeg4DecOptions value) {
/* 119 */     this.mpeg4DecOptions = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoDecoderConfigurationOptionsExtension getExtension() {
/* 129 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(VideoDecoderConfigurationOptionsExtension value) {
/* 140 */     this.extension = value;
/*     */   }
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
/*     */   public Map<QName, String> getOtherAttributes() {
/* 155 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\VideoDecoderConfigurationOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */