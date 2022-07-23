/*     */ package org.onvif.ver20.ptz.wsdl;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
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
/*     */ @XmlType(name = "", propOrder = {"profileToken", "presetName", "presetToken"})
/*     */ @XmlRootElement(name = "SetPreset")
/*     */ public class SetPreset
/*     */ {
/*     */   @XmlElement(name = "ProfileToken", required = true)
/*     */   protected String profileToken;
/*     */   @XmlElement(name = "PresetName")
/*     */   protected String presetName;
/*     */   @XmlElement(name = "PresetToken")
/*     */   protected String presetToken;
/*     */   
/*     */   public String getProfileToken() {
/*  58 */     return this.profileToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProfileToken(String value) {
/*  69 */     this.profileToken = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPresetName() {
/*  79 */     return this.presetName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPresetName(String value) {
/*  90 */     this.presetName = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPresetToken() {
/* 100 */     return this.presetToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPresetToken(String value) {
/* 111 */     this.presetToken = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\ptz\wsdl\SetPreset.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */