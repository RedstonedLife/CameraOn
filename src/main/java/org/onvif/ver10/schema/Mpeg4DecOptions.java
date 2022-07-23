/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "Mpeg4DecOptions", propOrder = {"resolutionsAvailable", "supportedMpeg4Profiles", "supportedInputBitrate", "supportedFrameRate", "any"})
/*     */ public class Mpeg4DecOptions
/*     */ {
/*     */   @XmlElement(name = "ResolutionsAvailable", required = true)
/*     */   protected List<VideoResolution> resolutionsAvailable;
/*     */   @XmlElement(name = "SupportedMpeg4Profiles", required = true)
/*     */   protected List<Mpeg4Profile> supportedMpeg4Profiles;
/*     */   @XmlElement(name = "SupportedInputBitrate", required = true)
/*     */   protected IntRange supportedInputBitrate;
/*     */   @XmlElement(name = "SupportedFrameRate", required = true)
/*     */   protected IntRange supportedFrameRate;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlAnyAttribute
/*  64 */   private Map<QName, String> otherAttributes = new HashMap<>();
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
/*     */   public List<VideoResolution> getResolutionsAvailable() {
/*  87 */     if (this.resolutionsAvailable == null) {
/*  88 */       this.resolutionsAvailable = new ArrayList<>();
/*     */     }
/*  90 */     return this.resolutionsAvailable;
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
/*     */   public List<Mpeg4Profile> getSupportedMpeg4Profiles() {
/* 114 */     if (this.supportedMpeg4Profiles == null) {
/* 115 */       this.supportedMpeg4Profiles = new ArrayList<>();
/*     */     }
/* 117 */     return this.supportedMpeg4Profiles;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getSupportedInputBitrate() {
/* 127 */     return this.supportedInputBitrate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupportedInputBitrate(IntRange value) {
/* 138 */     this.supportedInputBitrate = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getSupportedFrameRate() {
/* 148 */     return this.supportedFrameRate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupportedFrameRate(IntRange value) {
/* 159 */     this.supportedFrameRate = value;
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
/*     */   public List<java.lang.Object> getAny() {
/* 183 */     if (this.any == null) {
/* 184 */       this.any = new ArrayList();
/*     */     }
/* 186 */     return this.any;
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
/* 201 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Mpeg4DecOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */