/*     */ package org.onvif.ver10.schema;
/*     */ 
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "Exposure", propOrder = {"mode", "priority", "window", "minExposureTime", "maxExposureTime", "minGain", "maxGain", "minIris", "maxIris", "exposureTime", "gain", "iris"})
/*     */ public class Exposure
/*     */ {
/*     */   @XmlElement(name = "Mode", required = true)
/*     */   protected ExposureMode mode;
/*     */   @XmlElement(name = "Priority", required = true)
/*     */   protected ExposurePriority priority;
/*     */   @XmlElement(name = "Window", required = true)
/*     */   protected Rectangle window;
/*     */   @XmlElement(name = "MinExposureTime")
/*     */   protected float minExposureTime;
/*     */   @XmlElement(name = "MaxExposureTime")
/*     */   protected float maxExposureTime;
/*     */   @XmlElement(name = "MinGain")
/*     */   protected float minGain;
/*     */   @XmlElement(name = "MaxGain")
/*     */   protected float maxGain;
/*     */   @XmlElement(name = "MinIris")
/*     */   protected float minIris;
/*     */   @XmlElement(name = "MaxIris")
/*     */   protected float maxIris;
/*     */   @XmlElement(name = "ExposureTime")
/*     */   protected float exposureTime;
/*     */   @XmlElement(name = "Gain")
/*     */   protected float gain;
/*     */   @XmlElement(name = "Iris")
/*     */   protected float iris;
/*     */   
/*     */   public ExposureMode getMode() {
/*  84 */     return this.mode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMode(ExposureMode value) {
/*  95 */     this.mode = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ExposurePriority getPriority() {
/* 105 */     return this.priority;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPriority(ExposurePriority value) {
/* 116 */     this.priority = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Rectangle getWindow() {
/* 126 */     return this.window;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWindow(Rectangle value) {
/* 137 */     this.window = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMinExposureTime() {
/* 145 */     return this.minExposureTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinExposureTime(float value) {
/* 153 */     this.minExposureTime = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMaxExposureTime() {
/* 161 */     return this.maxExposureTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxExposureTime(float value) {
/* 169 */     this.maxExposureTime = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMinGain() {
/* 177 */     return this.minGain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinGain(float value) {
/* 185 */     this.minGain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMaxGain() {
/* 193 */     return this.maxGain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxGain(float value) {
/* 201 */     this.maxGain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMinIris() {
/* 209 */     return this.minIris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinIris(float value) {
/* 217 */     this.minIris = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMaxIris() {
/* 225 */     return this.maxIris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxIris(float value) {
/* 233 */     this.maxIris = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getExposureTime() {
/* 241 */     return this.exposureTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExposureTime(float value) {
/* 249 */     this.exposureTime = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getGain() {
/* 257 */     return this.gain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGain(float value) {
/* 265 */     this.gain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getIris() {
/* 273 */     return this.iris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIris(float value) {
/* 281 */     this.iris = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Exposure.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */