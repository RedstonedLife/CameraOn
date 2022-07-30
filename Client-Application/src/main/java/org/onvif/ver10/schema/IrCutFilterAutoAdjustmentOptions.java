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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "IrCutFilterAutoAdjustmentOptions", propOrder = {"boundaryType", "boundaryOffset", "responseTimeRange", "extension"})
/*     */ public class IrCutFilterAutoAdjustmentOptions
/*     */ {
/*     */   @XmlElement(name = "BoundaryType", required = true)
/*     */   protected List<String> boundaryType;
/*     */   @XmlElement(name = "BoundaryOffset")
/*     */   protected Boolean boundaryOffset;
/*     */   @XmlElement(name = "ResponseTimeRange")
/*     */   protected DurationRange responseTimeRange;
/*     */   @XmlElement(name = "Extension")
/*     */   protected IrCutFilterAutoAdjustmentOptionsExtension extension;
/*     */   @XmlAnyAttribute
/*  59 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> getBoundaryType() {
/*  82 */     if (this.boundaryType == null) {
/*  83 */       this.boundaryType = new ArrayList<>();
/*     */     }
/*  85 */     return this.boundaryType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isBoundaryOffset() {
/*  95 */     return this.boundaryOffset;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBoundaryOffset(Boolean value) {
/* 106 */     this.boundaryOffset = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DurationRange getResponseTimeRange() {
/* 116 */     return this.responseTimeRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setResponseTimeRange(DurationRange value) {
/* 127 */     this.responseTimeRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IrCutFilterAutoAdjustmentOptionsExtension getExtension() {
/* 137 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(IrCutFilterAutoAdjustmentOptionsExtension value) {
/* 148 */     this.extension = value;
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
/* 163 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\IrCutFilterAutoAdjustmentOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */