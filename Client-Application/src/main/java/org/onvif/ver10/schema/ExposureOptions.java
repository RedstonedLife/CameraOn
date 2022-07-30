/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "ExposureOptions", propOrder = {"mode", "priority", "minExposureTime", "maxExposureTime", "minGain", "maxGain", "minIris", "maxIris", "exposureTime", "gain", "iris"})
/*     */ public class ExposureOptions
/*     */ {
/*     */   @XmlElement(name = "Mode", required = true)
/*     */   protected List<ExposureMode> mode;
/*     */   @XmlElement(name = "Priority", required = true)
/*     */   protected List<ExposurePriority> priority;
/*     */   @XmlElement(name = "MinExposureTime", required = true)
/*     */   protected FloatRange minExposureTime;
/*     */   @XmlElement(name = "MaxExposureTime", required = true)
/*     */   protected FloatRange maxExposureTime;
/*     */   @XmlElement(name = "MinGain", required = true)
/*     */   protected FloatRange minGain;
/*     */   @XmlElement(name = "MaxGain", required = true)
/*     */   protected FloatRange maxGain;
/*     */   @XmlElement(name = "MinIris", required = true)
/*     */   protected FloatRange minIris;
/*     */   @XmlElement(name = "MaxIris", required = true)
/*     */   protected FloatRange maxIris;
/*     */   @XmlElement(name = "ExposureTime", required = true)
/*     */   protected FloatRange exposureTime;
/*     */   @XmlElement(name = "Gain", required = true)
/*     */   protected FloatRange gain;
/*     */   @XmlElement(name = "Iris", required = true)
/*     */   protected FloatRange iris;
/*     */   
/*     */   public List<ExposureMode> getMode() {
/*  97 */     if (this.mode == null) {
/*  98 */       this.mode = new ArrayList<>();
/*     */     }
/* 100 */     return this.mode;
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
/*     */   public List<ExposurePriority> getPriority() {
/* 124 */     if (this.priority == null) {
/* 125 */       this.priority = new ArrayList<>();
/*     */     }
/* 127 */     return this.priority;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getMinExposureTime() {
/* 137 */     return this.minExposureTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinExposureTime(FloatRange value) {
/* 148 */     this.minExposureTime = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getMaxExposureTime() {
/* 158 */     return this.maxExposureTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxExposureTime(FloatRange value) {
/* 169 */     this.maxExposureTime = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getMinGain() {
/* 179 */     return this.minGain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinGain(FloatRange value) {
/* 190 */     this.minGain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getMaxGain() {
/* 200 */     return this.maxGain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxGain(FloatRange value) {
/* 211 */     this.maxGain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getMinIris() {
/* 221 */     return this.minIris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinIris(FloatRange value) {
/* 232 */     this.minIris = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getMaxIris() {
/* 242 */     return this.maxIris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxIris(FloatRange value) {
/* 253 */     this.maxIris = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getExposureTime() {
/* 263 */     return this.exposureTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExposureTime(FloatRange value) {
/* 274 */     this.exposureTime = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getGain() {
/* 284 */     return this.gain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGain(FloatRange value) {
/* 295 */     this.gain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getIris() {
/* 305 */     return this.iris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIris(FloatRange value) {
/* 316 */     this.iris = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ExposureOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */