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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "IntRectangleRange", propOrder = {"xRange", "yRange", "widthRange", "heightRange"})
/*     */ public class IntRectangleRange
/*     */ {
/*     */   @XmlElement(name = "XRange", required = true)
/*     */   protected IntRange xRange;
/*     */   @XmlElement(name = "YRange", required = true)
/*     */   protected IntRange yRange;
/*     */   @XmlElement(name = "WidthRange", required = true)
/*     */   protected IntRange widthRange;
/*     */   @XmlElement(name = "HeightRange", required = true)
/*     */   protected IntRange heightRange;
/*     */   
/*     */   public IntRange getXRange() {
/*  61 */     return this.xRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setXRange(IntRange value) {
/*  72 */     this.xRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getYRange() {
/*  82 */     return this.yRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setYRange(IntRange value) {
/*  93 */     this.yRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getWidthRange() {
/* 103 */     return this.widthRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWidthRange(IntRange value) {
/* 114 */     this.widthRange = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getHeightRange() {
/* 124 */     return this.heightRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHeightRange(IntRange value) {
/* 135 */     this.heightRange = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\IntRectangleRange.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */