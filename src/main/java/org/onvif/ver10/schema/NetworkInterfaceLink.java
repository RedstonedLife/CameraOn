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
/*     */ @XmlType(name = "NetworkInterfaceLink", propOrder = {"adminSettings", "operSettings", "interfaceType"})
/*     */ public class NetworkInterfaceLink
/*     */ {
/*     */   @XmlElement(name = "AdminSettings", required = true)
/*     */   protected NetworkInterfaceConnectionSetting adminSettings;
/*     */   @XmlElement(name = "OperSettings", required = true)
/*     */   protected NetworkInterfaceConnectionSetting operSettings;
/*     */   @XmlElement(name = "InterfaceType")
/*     */   protected int interfaceType;
/*     */   
/*     */   public NetworkInterfaceConnectionSetting getAdminSettings() {
/*  56 */     return this.adminSettings;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAdminSettings(NetworkInterfaceConnectionSetting value) {
/*  67 */     this.adminSettings = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NetworkInterfaceConnectionSetting getOperSettings() {
/*  77 */     return this.operSettings;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOperSettings(NetworkInterfaceConnectionSetting value) {
/*  88 */     this.operSettings = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInterfaceType() {
/*  96 */     return this.interfaceType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInterfaceType(int value) {
/* 104 */     this.interfaceType = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\NetworkInterfaceLink.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */