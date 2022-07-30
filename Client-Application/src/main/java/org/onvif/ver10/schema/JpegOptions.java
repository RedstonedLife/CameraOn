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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "JpegOptions", propOrder = {"resolutionsAvailable", "frameRateRange", "encodingIntervalRange"})
/*     */ @XmlSeeAlso({JpegOptions2.class})
/*     */ public class JpegOptions
/*     */ {
/*     */   @XmlElement(name = "ResolutionsAvailable", required = true)
/*     */   protected List<VideoResolution> resolutionsAvailable;
/*     */   @XmlElement(name = "FrameRateRange", required = true)
/*     */   protected IntRange frameRateRange;
/*     */   @XmlElement(name = "EncodingIntervalRange", required = true)
/*     */   protected IntRange encodingIntervalRange;
/*     */   
/*     */   public List<VideoResolution> getResolutionsAvailable() {
/*  74 */     if (this.resolutionsAvailable == null) {
/*  75 */       this.resolutionsAvailable = new ArrayList<>();
/*     */     }
/*  77 */     return this.resolutionsAvailable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getFrameRateRange() {
/*  87 */     return this.frameRateRange;
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
/*  98 */     this.frameRateRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getEncodingIntervalRange() {
/* 108 */     return this.encodingIntervalRange;
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
/* 119 */     this.encodingIntervalRange = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\JpegOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */