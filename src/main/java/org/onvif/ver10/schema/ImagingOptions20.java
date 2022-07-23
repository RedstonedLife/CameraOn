/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
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
/*     */ @XmlType(name = "ImagingOptions20", propOrder = {"backlightCompensation", "brightness", "colorSaturation", "contrast", "exposure", "focus", "irCutFilterModes", "sharpness", "wideDynamicRange", "whiteBalance", "extension"})
/*     */ public class ImagingOptions20
/*     */ {
/*     */   @XmlElement(name = "BacklightCompensation")
/*     */   protected BacklightCompensationOptions20 backlightCompensation;
/*     */   @XmlElement(name = "Brightness")
/*     */   protected FloatRange brightness;
/*     */   @XmlElement(name = "ColorSaturation")
/*     */   protected FloatRange colorSaturation;
/*     */   @XmlElement(name = "Contrast")
/*     */   protected FloatRange contrast;
/*     */   @XmlElement(name = "Exposure")
/*     */   protected ExposureOptions20 exposure;
/*     */   @XmlElement(name = "Focus")
/*     */   protected FocusOptions20 focus;
/*     */   @XmlElement(name = "IrCutFilterModes")
/*     */   protected List<IrCutFilterMode> irCutFilterModes;
/*     */   @XmlElement(name = "Sharpness")
/*     */   protected FloatRange sharpness;
/*     */   @XmlElement(name = "WideDynamicRange")
/*     */   protected WideDynamicRangeOptions20 wideDynamicRange;
/*     */   @XmlElement(name = "WhiteBalance")
/*     */   protected WhiteBalanceOptions20 whiteBalance;
/*     */   @XmlElement(name = "Extension")
/*     */   protected ImagingOptions20Extension extension;
/*     */   @XmlAnyAttribute
/*  81 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BacklightCompensationOptions20 getBacklightCompensation() {
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
/*     */   public void setBacklightCompensation(BacklightCompensationOptions20 value) {
/* 101 */     this.backlightCompensation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getBrightness() {
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
/*     */   public void setBrightness(FloatRange value) {
/* 122 */     this.brightness = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getColorSaturation() {
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
/*     */   public void setColorSaturation(FloatRange value) {
/* 143 */     this.colorSaturation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getContrast() {
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
/*     */   public void setContrast(FloatRange value) {
/* 164 */     this.contrast = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ExposureOptions20 getExposure() {
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
/*     */   public void setExposure(ExposureOptions20 value) {
/* 185 */     this.exposure = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FocusOptions20 getFocus() {
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
/*     */   public void setFocus(FocusOptions20 value) {
/* 206 */     this.focus = value;
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
/* 230 */     if (this.irCutFilterModes == null) {
/* 231 */       this.irCutFilterModes = new ArrayList<>();
/*     */     }
/* 233 */     return this.irCutFilterModes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getSharpness() {
/* 243 */     return this.sharpness;
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
/* 254 */     this.sharpness = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WideDynamicRangeOptions20 getWideDynamicRange() {
/* 264 */     return this.wideDynamicRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWideDynamicRange(WideDynamicRangeOptions20 value) {
/* 275 */     this.wideDynamicRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WhiteBalanceOptions20 getWhiteBalance() {
/* 285 */     return this.whiteBalance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWhiteBalance(WhiteBalanceOptions20 value) {
/* 296 */     this.whiteBalance = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ImagingOptions20Extension getExtension() {
/* 306 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(ImagingOptions20Extension value) {
/* 317 */     this.extension = value;
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
/* 332 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ImagingOptions20.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */