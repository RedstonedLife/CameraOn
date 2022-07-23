/*     */ package org.onvif.ver10.device.wsdl;
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
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "DeviceServiceCapabilities", propOrder = {"network", "security", "system", "misc"})
/*     */ public class DeviceServiceCapabilities
/*     */ {
/*     */   @XmlElement(name = "Network", required = true)
/*     */   protected NetworkCapabilities network;
/*     */   @XmlElement(name = "Security", required = true)
/*     */   protected SecurityCapabilities security;
/*     */   @XmlElement(name = "System", required = true)
/*     */   protected SystemCapabilities system;
/*     */   @XmlElement(name = "Misc")
/*     */   protected MiscCapabilities misc;
/*     */   
/*     */   public NetworkCapabilities getNetwork() {
/*  59 */     return this.network;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNetwork(NetworkCapabilities value) {
/*  70 */     this.network = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SecurityCapabilities getSecurity() {
/*  80 */     return this.security;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSecurity(SecurityCapabilities value) {
/*  91 */     this.security = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SystemCapabilities getSystem() {
/* 101 */     return this.system;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSystem(SystemCapabilities value) {
/* 112 */     this.system = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MiscCapabilities getMisc() {
/* 122 */     return this.misc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMisc(MiscCapabilities value) {
/* 133 */     this.misc = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\DeviceServiceCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */