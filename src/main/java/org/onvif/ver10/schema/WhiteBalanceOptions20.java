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
/*     */ @XmlType(name = "WhiteBalanceOptions20", propOrder = {"mode", "yrGain", "ybGain", "extension"})
/*     */ public class WhiteBalanceOptions20
/*     */ {
/*     */   @XmlElement(name = "Mode", required = true)
/*     */   protected List<WhiteBalanceMode> mode;
/*     */   @XmlElement(name = "YrGain")
/*     */   protected FloatRange yrGain;
/*     */   @XmlElement(name = "YbGain")
/*     */   protected FloatRange ybGain;
/*     */   @XmlElement(name = "Extension")
/*     */   protected WhiteBalanceOptions20Extension extension;
/*     */   
/*     */   public List<WhiteBalanceMode> getMode() {
/*  75 */     if (this.mode == null) {
/*  76 */       this.mode = new ArrayList<>();
/*     */     }
/*  78 */     return this.mode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getYrGain() {
/*  88 */     return this.yrGain;
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
/*  99 */     this.yrGain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatRange getYbGain() {
/* 109 */     return this.ybGain;
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
/* 120 */     this.ybGain = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WhiteBalanceOptions20Extension getExtension() {
/* 130 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(WhiteBalanceOptions20Extension value) {
/* 141 */     this.extension = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\WhiteBalanceOptions20.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */