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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "ImagingSettings20", propOrder = {"backlightCompensation", "brightness", "colorSaturation", "contrast", "exposure", "focus", "irCutFilter", "sharpness", "wideDynamicRange", "whiteBalance", "extension"})
/*     */ public class ImagingSettings20
/*     */ {
/*     */   @XmlElement(name = "BacklightCompensation")
/*     */   protected BacklightCompensation20 backlightCompensation;
/*     */   @XmlElement(name = "Brightness")
/*     */   protected Float brightness;
/*     */   @XmlElement(name = "ColorSaturation")
/*     */   protected Float colorSaturation;
/*     */   @XmlElement(name = "Contrast")
/*     */   protected Float contrast;
/*     */   @XmlElement(name = "Exposure")
/*     */   protected Exposure20 exposure;
/*     */   @XmlElement(name = "Focus")
/*     */   protected FocusConfiguration20 focus;
/*     */   @XmlElement(name = "IrCutFilter")
/*     */   protected IrCutFilterMode irCutFilter;
/*     */   @XmlElement(name = "Sharpness")
/*     */   protected Float sharpness;
/*     */   @XmlElement(name = "WideDynamicRange")
/*     */   protected WideDynamicRange20 wideDynamicRange;
/*     */   @XmlElement(name = "WhiteBalance")
/*     */   protected WhiteBalance20 whiteBalance;
/*     */   @XmlElement(name = "Extension")
/*     */   protected ImagingSettingsExtension20 extension;
/*     */   @XmlAnyAttribute
/*  81 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BacklightCompensation20 getBacklightCompensation() {
/*  90 */     return this.backlightCompensation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBacklightCompensation(BacklightCompensation20 value) {
/* 101 */     this.backlightCompensation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getBrightness() {
/* 111 */     return this.brightness;
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
/* 122 */     this.brightness = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getColorSaturation() {
/* 132 */     return this.colorSaturation;
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
/* 143 */     this.colorSaturation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getContrast() {
/* 153 */     return this.contrast;
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
/* 164 */     this.contrast = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Exposure20 getExposure() {
/* 174 */     return this.exposure;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExposure(Exposure20 value) {
/* 185 */     this.exposure = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FocusConfiguration20 getFocus() {
/* 195 */     return this.focus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFocus(FocusConfiguration20 value) {
/* 206 */     this.focus = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IrCutFilterMode getIrCutFilter() {
/* 216 */     return this.irCutFilter;
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
/* 227 */     this.irCutFilter = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getSharpness() {
/* 237 */     return this.sharpness;
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
/* 248 */     this.sharpness = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WideDynamicRange20 getWideDynamicRange() {
/* 258 */     return this.wideDynamicRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWideDynamicRange(WideDynamicRange20 value) {
/* 269 */     this.wideDynamicRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WhiteBalance20 getWhiteBalance() {
/* 279 */     return this.whiteBalance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWhiteBalance(WhiteBalance20 value) {
/* 290 */     this.whiteBalance = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ImagingSettingsExtension20 getExtension() {
/* 300 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(ImagingSettingsExtension20 value) {
/* 311 */     this.extension = value;
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
/* 326 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ImagingSettings20.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */