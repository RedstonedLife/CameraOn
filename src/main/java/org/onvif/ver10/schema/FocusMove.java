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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "FocusMove", propOrder = {"absolute", "relative", "continuous"})
/*     */ public class FocusMove
/*     */ {
/*     */   @XmlElement(name = "Absolute")
/*     */   protected AbsoluteFocus absolute;
/*     */   @XmlElement(name = "Relative")
/*     */   protected RelativeFocus relative;
/*     */   @XmlElement(name = "Continuous")
/*     */   protected ContinuousFocus continuous;
/*     */   
/*     */   public AbsoluteFocus getAbsolute() {
/*  56 */     return this.absolute;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAbsolute(AbsoluteFocus value) {
/*  67 */     this.absolute = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RelativeFocus getRelative() {
/*  77 */     return this.relative;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRelative(RelativeFocus value) {
/*  88 */     this.relative = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ContinuousFocus getContinuous() {
/*  98 */     return this.continuous;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContinuous(ContinuousFocus value) {
/* 109 */     this.continuous = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\FocusMove.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */