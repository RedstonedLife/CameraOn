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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "FocusOptions20", propOrder = {"autoFocusModes", "defaultSpeed", "nearLimit", "farLimit", "extension"})
/*     */ public class FocusOptions20
/*     */ {
/*     */   @XmlElement(name = "AutoFocusModes")
/*     */   protected List<AutoFocusMode> autoFocusModes;
/*     */   @XmlElement(name = "DefaultSpeed")
/*     */   protected FloatRange defaultSpeed;
/*     */   @XmlElement(name = "NearLimit")
/*     */   protected FloatRange nearLimit;
/*     */   @XmlElement(name = "FarLimit")
/*     */   protected FloatRange farLimit;
/*     */   @XmlElement(name = "Extension")
/*     */   protected FocusOptions20Extension extension;
/*     */   
/*     */   public List<AutoFocusMode> getAutoFocusModes() {
/*  78 */     if (this.autoFocusModes == null) {
/*  79 */       this.autoFocusModes = new ArrayList<>();
/*     */     }
/*  81 */     return this.autoFocusModes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getDefaultSpeed() {
/*  91 */     return this.defaultSpeed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultSpeed(FloatRange value) {
/* 102 */     this.defaultSpeed = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getNearLimit() {
/* 112 */     return this.nearLimit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNearLimit(FloatRange value) {
/* 123 */     this.nearLimit = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getFarLimit() {
/* 133 */     return this.farLimit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFarLimit(FloatRange value) {
/* 144 */     this.farLimit = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FocusOptions20Extension getExtension() {
/* 154 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(FocusOptions20Extension value) {
/* 165 */     this.extension = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\FocusOptions20.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */