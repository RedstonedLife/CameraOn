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
/*     */ @XmlType(name = "Mpeg4Options", propOrder = {"resolutionsAvailable", "govLengthRange", "frameRateRange", "encodingIntervalRange", "mpeg4ProfilesSupported"})
/*     */ @XmlSeeAlso({Mpeg4Options2.class})
/*     */ public class Mpeg4Options
/*     */ {
/*     */   @XmlElement(name = "ResolutionsAvailable", required = true)
/*     */   protected List<VideoResolution> resolutionsAvailable;
/*     */   @XmlElement(name = "GovLengthRange", required = true)
/*     */   protected IntRange govLengthRange;
/*     */   @XmlElement(name = "FrameRateRange", required = true)
/*     */   protected IntRange frameRateRange;
/*     */   @XmlElement(name = "EncodingIntervalRange", required = true)
/*     */   protected IntRange encodingIntervalRange;
/*     */   @XmlElement(name = "Mpeg4ProfilesSupported", required = true)
/*     */   protected List<Mpeg4Profile> mpeg4ProfilesSupported;
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
/*     */   public List<Mpeg4Profile> getMpeg4ProfilesSupported() {
/* 170 */     if (this.mpeg4ProfilesSupported == null) {
/* 171 */       this.mpeg4ProfilesSupported = new ArrayList<>();
/*     */     }
/* 173 */     return this.mpeg4ProfilesSupported;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Mpeg4Options.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */