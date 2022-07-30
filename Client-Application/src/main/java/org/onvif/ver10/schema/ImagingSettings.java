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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "ImagingSettings", propOrder = {"backlightCompensation", "brightness", "colorSaturation", "contrast", "exposure", "focus", "irCutFilter", "sharpness", "wideDynamicRange", "whiteBalance", "extension"})
/*     */ public class ImagingSettings
/*     */ {
/*     */   @XmlElement(name = "BacklightCompensation")
/*     */   protected BacklightCompensation backlightCompensation;
/*     */   @XmlElement(name = "Brightness")
/*     */   protected Float brightness;
/*     */   @XmlElement(name = "ColorSaturation")
/*     */   protected Float colorSaturation;
/*     */   @XmlElement(name = "Contrast")
/*     */   protected Float contrast;
/*     */   @XmlElement(name = "Exposure")
/*     */   protected Exposure exposure;
/*     */   @XmlElement(name = "Focus")
/*     */   protected FocusConfiguration focus;
/*     */   @XmlElement(name = "IrCutFilter")
/*     */   protected IrCutFilterMode irCutFilter;
/*     */   @XmlElement(name = "Sharpness")
/*     */   protected Float sharpness;
/*     */   @XmlElement(name = "WideDynamicRange")
/*     */   protected WideDynamicRange wideDynamicRange;
/*     */   @XmlElement(name = "WhiteBalance")
/*     */   protected WhiteBalance whiteBalance;
/*     */   @XmlElement(name = "Extension")
/*     */   protected ImagingSettingsExtension extension;
/*     */   @XmlAnyAttribute
/*  79 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BacklightCompensation getBacklightCompensation() {
/*  88 */     return this.backlightCompensation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBacklightCompensation(BacklightCompensation value) {
/*  99 */     this.backlightCompensation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getBrightness() {
/* 109 */     return this.brightness;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBrightness(Float value) {
/* 120 */     this.brightness = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getColorSaturation() {
/* 130 */     return this.colorSaturation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColorSaturation(Float value) {
/* 141 */     this.colorSaturation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getContrast() {
/* 151 */     return this.contrast;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContrast(Float value) {
/* 162 */     this.contrast = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Exposure getExposure() {
/* 172 */     return this.exposure;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExposure(Exposure value) {
/* 183 */     this.exposure = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FocusConfiguration getFocus() {
/* 193 */     return this.focus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFocus(FocusConfiguration value) {
/* 204 */     this.focus = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IrCutFilterMode getIrCutFilter() {
/* 214 */     return this.irCutFilter;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIrCutFilter(IrCutFilterMode value) {
/* 225 */     this.irCutFilter = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getSharpness() {
/* 235 */     return this.sharpness;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSharpness(Float value) {
/* 246 */     this.sharpness = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WideDynamicRange getWideDynamicRange() {
/* 256 */     return this.wideDynamicRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWideDynamicRange(WideDynamicRange value) {
/* 267 */     this.wideDynamicRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WhiteBalance getWhiteBalance() {
/* 277 */     return this.whiteBalance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWhiteBalance(WhiteBalance value) {
/* 288 */     this.whiteBalance = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ImagingSettingsExtension getExtension() {
/* 298 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(ImagingSettingsExtension value) {
/* 309 */     this.extension = value;
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
/* 324 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ImagingSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */