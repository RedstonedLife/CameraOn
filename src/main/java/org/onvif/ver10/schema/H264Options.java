/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "H264Options", propOrder = {"resolutionsAvailable", "govLengthRange", "frameRateRange", "encodingIntervalRange", "h264ProfilesSupported"})
/*     */ @XmlSeeAlso({H264Options2.class})
/*     */ public class H264Options
/*     */ {
/*     */   @XmlElement(name = "ResolutionsAvailable", required = true)
/*     */   protected List<VideoResolution> resolutionsAvailable;
/*     */   @XmlElement(name = "GovLengthRange", required = true)
/*     */   protected IntRange govLengthRange;
/*     */   @XmlElement(name = "FrameRateRange", required = true)
/*     */   protected IntRange frameRateRange;
/*     */   @XmlElement(name = "EncodingIntervalRange", required = true)
/*     */   protected IntRange encodingIntervalRange;
/*     */   @XmlElement(name = "H264ProfilesSupported", required = true)
/*     */   protected List<H264Profile> h264ProfilesSupported;
/*     */   
/*     */   public List<VideoResolution> getResolutionsAvailable() {
/*  80 */     if (this.resolutionsAvailable == null) {
/*  81 */       this.resolutionsAvailable = new ArrayList<>();
/*     */     }
/*  83 */     return this.resolutionsAvailable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getGovLengthRange() {
/*  93 */     return this.govLengthRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGovLengthRange(IntRange value) {
/* 104 */     this.govLengthRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getFrameRateRange() {
/* 114 */     return this.frameRateRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFrameRateRange(IntRange value) {
/* 125 */     this.frameRateRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getEncodingIntervalRange() {
/* 135 */     return this.encodingIntervalRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEncodingIntervalRange(IntRange value) {
/* 146 */     this.encodingIntervalRange = value;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<H264Profile> getH264ProfilesSupported() {
/* 170 */     if (this.h264ProfilesSupported == null) {
/* 171 */       this.h264ProfilesSupported = new ArrayList<>();
/*     */     }
/* 173 */     return this.h264ProfilesSupported;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\H264Options.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */