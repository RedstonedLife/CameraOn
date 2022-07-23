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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "Exposure20", propOrder = {"mode", "priority", "window", "minExposureTime", "maxExposureTime", "minGain", "maxGain", "minIris", "maxIris", "exposureTime", "gain", "iris"})
/*     */ public class Exposure20
/*     */ {
/*     */   @XmlElement(name = "Mode", required = true)
/*     */   protected ExposureMode mode;
/*     */   @XmlElement(name = "Priority")
/*     */   protected ExposurePriority priority;
/*     */   @XmlElement(name = "Window")
/*     */   protected Rectangle window;
/*     */   @XmlElement(name = "MinExposureTime")
/*     */   protected Float minExposureTime;
/*     */   @XmlElement(name = "MaxExposureTime")
/*     */   protected Float maxExposureTime;
/*     */   @XmlElement(name = "MinGain")
/*     */   protected Float minGain;
/*     */   @XmlElement(name = "MaxGain")
/*     */   protected Float maxGain;
/*     */   @XmlElement(name = "MinIris")
/*     */   protected Float minIris;
/*     */   @XmlElement(name = "MaxIris")
/*     */   protected Float maxIris;
/*     */   @XmlElement(name = "ExposureTime")
/*     */   protected Float exposureTime;
/*     */   @XmlElement(name = "Gain")
/*     */   protected Float gain;
/*     */   @XmlElement(name = "Iris")
/*     */   protected Float iris;
/*     */   
/*     */   public ExposureMode getMode() {
/*  86 */     return this.mode;
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
/*  97 */     this.mode = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ExposurePriority getPriority() {
/* 107 */     return this.priority;
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
/* 118 */     this.priority = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Rectangle getWindow() {
/* 128 */     return this.window;
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
/* 139 */     this.window = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getMinExposureTime() {
/* 149 */     return this.minExposureTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinExposureTime(Float value) {
/* 160 */     this.minExposureTime = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getMaxExposureTime() {
/* 170 */     return this.maxExposureTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxExposureTime(Float value) {
/* 181 */     this.maxExposureTime = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getMinGain() {
/* 191 */     return this.minGain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinGain(Float value) {
/* 202 */     this.minGain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getMaxGain() {
/* 212 */     return this.maxGain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxGain(Float value) {
/* 223 */     this.maxGain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getMinIris() {
/* 233 */     return this.minIris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinIris(Float value) {
/* 244 */     this.minIris = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getMaxIris() {
/* 254 */     return this.maxIris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxIris(Float value) {
/* 265 */     this.maxIris = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getExposureTime() {
/* 275 */     return this.exposureTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExposureTime(Float value) {
/* 286 */     this.exposureTime = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getGain() {
/* 296 */     return this.gain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGain(Float value) {
/* 307 */     this.gain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getIris() {
/* 317 */     return this.iris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIris(Float value) {
/* 328 */     this.iris = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Exposure20.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */