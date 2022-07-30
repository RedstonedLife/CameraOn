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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "WhiteBalanceOptions", propOrder = {"mode", "yrGain", "ybGain"})
/*     */ public class WhiteBalanceOptions
/*     */ {
/*     */   @XmlElement(name = "Mode", required = true)
/*     */   protected List<WhiteBalanceMode> mode;
/*     */   @XmlElement(name = "YrGain", required = true)
/*     */   protected FloatRange yrGain;
/*     */   @XmlElement(name = "YbGain", required = true)
/*     */   protected FloatRange ybGain;
/*     */   
/*     */   public List<WhiteBalanceMode> getMode() {
/*  72 */     if (this.mode == null) {
/*  73 */       this.mode = new ArrayList<>();
/*     */     }
/*  75 */     return this.mode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getYrGain() {
/*  85 */     return this.yrGain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setYrGain(FloatRange value) {
/*  96 */     this.yrGain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getYbGain() {
/* 106 */     return this.ybGain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setYbGain(FloatRange value) {
/* 117 */     this.ybGain = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\WhiteBalanceOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */