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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "FocusOptions", propOrder = {"autoFocusModes", "defaultSpeed", "nearLimit", "farLimit"})
/*     */ public class FocusOptions
/*     */ {
/*     */   @XmlElement(name = "AutoFocusModes")
/*     */   protected List<AutoFocusMode> autoFocusModes;
/*     */   @XmlElement(name = "DefaultSpeed", required = true)
/*     */   protected FloatRange defaultSpeed;
/*     */   @XmlElement(name = "NearLimit", required = true)
/*     */   protected FloatRange nearLimit;
/*     */   @XmlElement(name = "FarLimit", required = true)
/*     */   protected FloatRange farLimit;
/*     */   
/*     */   public List<AutoFocusMode> getAutoFocusModes() {
/*  75 */     if (this.autoFocusModes == null) {
/*  76 */       this.autoFocusModes = new ArrayList<>();
/*     */     }
/*  78 */     return this.autoFocusModes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getDefaultSpeed() {
/*  88 */     return this.defaultSpeed;
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
/*  99 */     this.defaultSpeed = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getNearLimit() {
/* 109 */     return this.nearLimit;
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
/* 120 */     this.nearLimit = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getFarLimit() {
/* 130 */     return this.farLimit;
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
/* 141 */     this.farLimit = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\FocusOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */