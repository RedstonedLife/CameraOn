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
/*     */ @XmlType(name = "MoveOptions20", propOrder = {"absolute", "relative", "continuous"})
/*     */ public class MoveOptions20
/*     */ {
/*     */   @XmlElement(name = "Absolute")
/*     */   protected AbsoluteFocusOptions absolute;
/*     */   @XmlElement(name = "Relative")
/*     */   protected RelativeFocusOptions20 relative;
/*     */   @XmlElement(name = "Continuous")
/*     */   protected ContinuousFocusOptions continuous;
/*     */   
/*     */   public AbsoluteFocusOptions getAbsolute() {
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
/*     */   public void setAbsolute(AbsoluteFocusOptions value) {
/*  67 */     this.absolute = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RelativeFocusOptions20 getRelative() {
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
/*     */   public void setRelative(RelativeFocusOptions20 value) {
/*  88 */     this.relative = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ContinuousFocusOptions getContinuous() {
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
/*     */   public void setContinuous(ContinuousFocusOptions value) {
/* 109 */     this.continuous = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\MoveOptions20.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */