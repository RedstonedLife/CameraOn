/*     */ package org.onvif.ver10.device.wsdl;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.datatype.Duration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "", propOrder = {"uploadUri", "uploadDelay", "expectedDownTime"})
/*     */ @XmlRootElement(name = "StartFirmwareUpgradeResponse")
/*     */ public class StartFirmwareUpgradeResponse
/*     */ {
/*     */   @XmlElement(name = "UploadUri", required = true)
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String uploadUri;
/*     */   @XmlElement(name = "UploadDelay", required = true)
/*     */   protected Duration uploadDelay;
/*     */   @XmlElement(name = "ExpectedDownTime", required = true)
/*     */   protected Duration expectedDownTime;
/*     */   
/*     */   public String getUploadUri() {
/*  61 */     return this.uploadUri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUploadUri(String value) {
/*  72 */     this.uploadUri = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Duration getUploadDelay() {
/*  82 */     return this.uploadDelay;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUploadDelay(Duration value) {
/*  93 */     this.uploadDelay = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Duration getExpectedDownTime() {
/* 103 */     return this.expectedDownTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExpectedDownTime(Duration value) {
/* 114 */     this.expectedDownTime = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\StartFirmwareUpgradeResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */