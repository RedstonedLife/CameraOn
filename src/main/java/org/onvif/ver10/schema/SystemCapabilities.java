/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "SystemCapabilities", propOrder = {"discoveryResolve", "discoveryBye", "remoteDiscovery", "systemBackup", "systemLogging", "firmwareUpgrade", "supportedVersions", "extension"})
/*     */ public class SystemCapabilities
/*     */ {
/*     */   @XmlElement(name = "DiscoveryResolve")
/*     */   protected boolean discoveryResolve;
/*     */   @XmlElement(name = "DiscoveryBye")
/*     */   protected boolean discoveryBye;
/*     */   @XmlElement(name = "RemoteDiscovery")
/*     */   protected boolean remoteDiscovery;
/*     */   @XmlElement(name = "SystemBackup")
/*     */   protected boolean systemBackup;
/*     */   @XmlElement(name = "SystemLogging")
/*     */   protected boolean systemLogging;
/*     */   @XmlElement(name = "FirmwareUpgrade")
/*     */   protected boolean firmwareUpgrade;
/*     */   @XmlElement(name = "SupportedVersions", required = true)
/*     */   protected List<OnvifVersion> supportedVersions;
/*     */   @XmlElement(name = "Extension")
/*     */   protected SystemCapabilitiesExtension extension;
/*     */   @XmlAnyAttribute
/*  72 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDiscoveryResolve() {
/*  79 */     return this.discoveryResolve;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDiscoveryResolve(boolean value) {
/*  87 */     this.discoveryResolve = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDiscoveryBye() {
/*  95 */     return this.discoveryBye;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDiscoveryBye(boolean value) {
/* 103 */     this.discoveryBye = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRemoteDiscovery() {
/* 111 */     return this.remoteDiscovery;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRemoteDiscovery(boolean value) {
/* 119 */     this.remoteDiscovery = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSystemBackup() {
/* 127 */     return this.systemBackup;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSystemBackup(boolean value) {
/* 135 */     this.systemBackup = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSystemLogging() {
/* 143 */     return this.systemLogging;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSystemLogging(boolean value) {
/* 151 */     this.systemLogging = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFirmwareUpgrade() {
/* 159 */     return this.firmwareUpgrade;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFirmwareUpgrade(boolean value) {
/* 167 */     this.firmwareUpgrade = value;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<OnvifVersion> getSupportedVersions() {
/* 191 */     if (this.supportedVersions == null) {
/* 192 */       this.supportedVersions = new ArrayList<>();
/*     */     }
/* 194 */     return this.supportedVersions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SystemCapabilitiesExtension getExtension() {
/* 204 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(SystemCapabilitiesExtension value) {
/* 215 */     this.extension = value;
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
/* 230 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\SystemCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */