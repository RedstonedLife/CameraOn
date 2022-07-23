/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "ColorCovariance")
/*     */ public class ColorCovariance
/*     */ {
/*     */   @XmlAttribute(name = "XX", required = true)
/*     */   protected float xx;
/*     */   @XmlAttribute(name = "YY", required = true)
/*     */   protected float yy;
/*     */   @XmlAttribute(name = "ZZ", required = true)
/*     */   protected float zz;
/*     */   @XmlAttribute(name = "XY")
/*     */   protected Float xy;
/*     */   @XmlAttribute(name = "XZ")
/*     */   protected Float xz;
/*     */   @XmlAttribute(name = "YZ")
/*     */   protected Float yz;
/*     */   @XmlAttribute(name = "Colorspace")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String colorspace;
/*     */   
/*     */   public float getXX() {
/*  66 */     return this.xx;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setXX(float value) {
/*  74 */     this.xx = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getYY() {
/*  82 */     return this.yy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setYY(float value) {
/*  90 */     this.yy = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getZZ() {
/*  98 */     return this.zz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZZ(float value) {
/* 106 */     this.zz = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getXY() {
/* 116 */     return this.xy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setXY(Float value) {
/* 127 */     this.xy = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getXZ() {
/* 137 */     return this.xz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setXZ(Float value) {
/* 148 */     this.xz = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float getYZ() {
/* 158 */     return this.yz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setYZ(Float value) {
/* 169 */     this.yz = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getColorspace() {
/* 179 */     return this.colorspace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColorspace(String value) {
/* 190 */     this.colorspace = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ColorCovariance.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */