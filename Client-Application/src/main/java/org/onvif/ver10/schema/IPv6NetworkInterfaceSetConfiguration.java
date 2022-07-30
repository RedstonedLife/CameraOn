/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name = "IPv6NetworkInterfaceSetConfiguration", propOrder = {"enabled", "acceptRouterAdvert", "manual", "dhcp"})
/*     */ public class IPv6NetworkInterfaceSetConfiguration
/*     */ {
/*     */   @XmlElement(name = "Enabled")
/*     */   protected Boolean enabled;
/*     */   @XmlElement(name = "AcceptRouterAdvert")
/*     */   protected Boolean acceptRouterAdvert;
/*     */   @XmlElement(name = "Manual")
/*     */   protected List<PrefixedIPv6Address> manual;
/*     */   @XmlElement(name = "DHCP")
/*     */   protected IPv6DHCPConfiguration dhcp;
/*     */   
/*     */   public Boolean isEnabled() {
/*  61 */     return this.enabled;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnabled(Boolean value) {
/*  72 */     this.enabled = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isAcceptRouterAdvert() {
/*  82 */     return this.acceptRouterAdvert;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAcceptRouterAdvert(Boolean value) {
/*  93 */     this.acceptRouterAdvert = value;
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
/*     */   public List<PrefixedIPv6Address> getManual() {
/* 117 */     if (this.manual == null) {
/* 118 */       this.manual = new ArrayList<>();
/*     */     }
/* 120 */     return this.manual;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IPv6DHCPConfiguration getDHCP() {
/* 130 */     return this.dhcp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDHCP(IPv6DHCPConfiguration value) {
/* 141 */     this.dhcp = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\IPv6NetworkInterfaceSetConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */