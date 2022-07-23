/*     */ package org.onvif.ver20.imaging.wsdl;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.onvif.ver10.schema.ImagingSettings20;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "", propOrder = {"videoSourceToken", "imagingSettings", "forcePersistence"})
/*     */ @XmlRootElement(name = "SetImagingSettings")
/*     */ public class SetImagingSettings
/*     */ {
/*     */   @XmlElement(name = "VideoSourceToken", required = true)
/*     */   protected String videoSourceToken;
/*     */   @XmlElement(name = "ImagingSettings", required = true)
/*     */   protected ImagingSettings20 imagingSettings;
/*     */   @XmlElement(name = "ForcePersistence")
/*     */   protected Boolean forcePersistence;
/*     */   
/*     */   public String getVideoSourceToken() {
/*  65 */     return this.videoSourceToken;
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
/*     */   public void setVideoSourceToken(String value) {
/*  77 */     this.videoSourceToken = value;
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
/*     */   public ImagingSettings20 getImagingSettings() {
/*  89 */     return this.imagingSettings;
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
/*     */   public void setImagingSettings(ImagingSettings20 value) {
/* 101 */     this.imagingSettings = value;
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
/*     */   public Boolean isForcePersistence() {
/* 113 */     return this.forcePersistence;
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
/*     */   public void setForcePersistence(Boolean value) {
/* 125 */     this.forcePersistence = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\imaging\wsdl\SetImagingSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */