/*     */ package org.onvif.ver10.device.wsdl;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.namespace.QName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "SystemCapabilities")
/*     */ public class SystemCapabilities
/*     */ {
/*     */   @XmlAttribute(name = "DiscoveryResolve")
/*     */   protected Boolean discoveryResolve;
/*     */   @XmlAttribute(name = "DiscoveryBye")
/*     */   protected Boolean discoveryBye;
/*     */   @XmlAttribute(name = "RemoteDiscovery")
/*     */   protected Boolean remoteDiscovery;
/*     */   @XmlAttribute(name = "SystemBackup")
/*     */   protected Boolean systemBackup;
/*     */   @XmlAttribute(name = "SystemLogging")
/*     */   protected Boolean systemLogging;
/*     */   @XmlAttribute(name = "FirmwareUpgrade")
/*     */   protected Boolean firmwareUpgrade;
/*     */   @XmlAttribute(name = "HttpFirmwareUpgrade")
/*     */   protected Boolean httpFirmwareUpgrade;
/*     */   @XmlAttribute(name = "HttpSystemBackup")
/*     */   protected Boolean httpSystemBackup;
/*     */   @XmlAttribute(name = "HttpSystemLogging")
/*     */   protected Boolean httpSystemLogging;
/*     */   @XmlAttribute(name = "HttpSupportInformation")
/*     */   protected Boolean httpSupportInformation;
/*     */   @XmlAnyAttribute
/*  73 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isDiscoveryResolve() {
/*  82 */     return this.discoveryResolve;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDiscoveryResolve(Boolean value) {
/*  93 */     this.discoveryResolve = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isDiscoveryBye() {
/* 103 */     return this.discoveryBye;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDiscoveryBye(Boolean value) {
/* 114 */     this.discoveryBye = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isRemoteDiscovery() {
/* 124 */     return this.remoteDiscovery;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRemoteDiscovery(Boolean value) {
/* 135 */     this.remoteDiscovery = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isSystemBackup() {
/* 145 */     return this.systemBackup;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSystemBackup(Boolean value) {
/* 156 */     this.systemBackup = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isSystemLogging() {
/* 166 */     return this.systemLogging;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSystemLogging(Boolean value) {
/* 177 */     this.systemLogging = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isFirmwareUpgrade() {
/* 187 */     return this.firmwareUpgrade;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFirmwareUpgrade(Boolean value) {
/* 198 */     this.firmwareUpgrade = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHttpFirmwareUpgrade() {
/* 208 */     return this.httpFirmwareUpgrade;
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
/* 219 */     this.httpFirmwareUpgrade = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHttpSystemBackup() {
/* 229 */     return this.httpSystemBackup;
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
/* 240 */     this.httpSystemBackup = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHttpSystemLogging() {
/* 250 */     return this.httpSystemLogging;
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
/* 261 */     this.httpSystemLogging = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHttpSupportInformation() {
/* 271 */     return this.httpSupportInformation;
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
/* 282 */     this.httpSupportInformation = value;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<QName, String> getOtherAttributes() {
/* 297 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SystemCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */