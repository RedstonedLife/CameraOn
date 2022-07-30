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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "ImagingOptions", propOrder = {"backlightCompensation", "brightness", "colorSaturation", "contrast", "exposure", "focus", "irCutFilterModes", "sharpness", "wideDynamicRange", "whiteBalance", "any"})
/*     */ public class ImagingOptions
/*     */ {
/*     */   @XmlElement(name = "BacklightCompensation", required = true)
/*     */   protected BacklightCompensationOptions backlightCompensation;
/*     */   @XmlElement(name = "Brightness", required = true)
/*     */   protected FloatRange brightness;
/*     */   @XmlElement(name = "ColorSaturation", required = true)
/*     */   protected FloatRange colorSaturation;
/*     */   @XmlElement(name = "Contrast", required = true)
/*     */   protected FloatRange contrast;
/*     */   @XmlElement(name = "Exposure", required = true)
/*     */   protected ExposureOptions exposure;
/*     */   @XmlElement(name = "Focus", required = true)
/*     */   protected FocusOptions focus;
/*     */   @XmlElement(name = "IrCutFilterModes", required = true)
/*     */   protected List<IrCutFilterMode> irCutFilterModes;
/*     */   @XmlElement(name = "Sharpness", required = true)
/*     */   protected FloatRange sharpness;
/*     */   @XmlElement(name = "WideDynamicRange", required = true)
/*     */   protected WideDynamicRangeOptions wideDynamicRange;
/*     */   @XmlElement(name = "WhiteBalance", required = true)
/*     */   protected WhiteBalanceOptions whiteBalance;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlAnyAttribute
/*  83 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BacklightCompensationOptions getBacklightCompensation() {
/*  92 */     return this.backlightCompensation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBacklightCompensation(BacklightCompensationOptions value) {
/* 103 */     this.backlightCompensation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getBrightness() {
/* 113 */     return this.brightness;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBrightness(FloatRange value) {
/* 124 */     this.brightness = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getColorSaturation() {
/* 134 */     return this.colorSaturation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColorSaturation(FloatRange value) {
/* 145 */     this.colorSaturation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getContrast() {
/* 155 */     return this.contrast;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContrast(FloatRange value) {
/* 166 */     this.contrast = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ExposureOptions getExposure() {
/* 176 */     return this.exposure;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExposure(ExposureOptions value) {
/* 187 */     this.exposure = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FocusOptions getFocus() {
/* 197 */     return this.focus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFocus(FocusOptions value) {
/* 208 */     this.focus = value;
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
/*     */   public List<IrCutFilterMode> getIrCutFilterModes() {
/* 232 */     if (this.irCutFilterModes == null) {
/* 233 */       this.irCutFilterModes = new ArrayList<>();
/*     */     }
/* 235 */     return this.irCutFilterModes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getSharpness() {
/* 245 */     return this.sharpness;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSharpness(FloatRange value) {
/* 256 */     this.sharpness = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WideDynamicRangeOptions getWideDynamicRange() {
/* 266 */     return this.wideDynamicRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWideDynamicRange(WideDynamicRangeOptions value) {
/* 277 */     this.wideDynamicRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WhiteBalanceOptions getWhiteBalance() {
/* 287 */     return this.whiteBalance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWhiteBalance(WhiteBalanceOptions value) {
/* 298 */     this.whiteBalance = value;
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
/* 322 */     if (this.any == null) {
/* 323 */       this.any = new ArrayList();
/*     */     }
/* 325 */     return this.any;
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
/* 340 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ImagingOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */