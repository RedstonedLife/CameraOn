/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "SystemCapabilitiesExtension", propOrder = {"any", "httpFirmwareUpgrade", "httpSystemBackup", "httpSystemLogging", "httpSupportInformation", "extension"})
/*     */ public class SystemCapabilitiesExtension
/*     */ {
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlElement(name = "HttpFirmwareUpgrade")
/*     */   protected Boolean httpFirmwareUpgrade;
/*     */   @XmlElement(name = "HttpSystemBackup")
/*     */   protected Boolean httpSystemBackup;
/*     */   @XmlElement(name = "HttpSystemLogging")
/*     */   protected Boolean httpSystemLogging;
/*     */   @XmlElement(name = "HttpSupportInformation")
/*     */   protected Boolean httpSupportInformation;
/*     */   @XmlElement(name = "Extension")
/*     */   protected SystemCapabilitiesExtension2 extension;
/*     */   
/*     */   public List<java.lang.Object> getAny() {
/*  84 */     if (this.any == null) {
/*  85 */       this.any = new ArrayList();
/*     */     }
/*  87 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHttpFirmwareUpgrade() {
/*  97 */     return this.httpFirmwareUpgrade;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHttpFirmwareUpgrade(Boolean value) {
/* 108 */     this.httpFirmwareUpgrade = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHttpSystemBackup() {
/* 118 */     return this.httpSystemBackup;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHttpSystemBackup(Boolean value) {
/* 129 */     this.httpSystemBackup = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHttpSystemLogging() {
/* 139 */     return this.httpSystemLogging;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHttpSystemLogging(Boolean value) {
/* 150 */     this.httpSystemLogging = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHttpSupportInformation() {
/* 160 */     return this.httpSupportInformation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHttpSupportInformation(Boolean value) {
/* 171 */     this.httpSupportInformation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SystemCapabilitiesExtension2 getExtension() {
/* 181 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(SystemCapabilitiesExtension2 value) {
/* 192 */     this.extension = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\SystemCapabilitiesExtension.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */