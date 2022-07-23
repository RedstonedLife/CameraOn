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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "IPv6Configuration", propOrder = {"acceptRouterAdvert", "dhcp", "manual", "linkLocal", "fromDHCP", "fromRA", "extension"})
/*     */ public class IPv6Configuration
/*     */ {
/*     */   @XmlElement(name = "AcceptRouterAdvert")
/*     */   protected Boolean acceptRouterAdvert;
/*     */   @XmlElement(name = "DHCP", required = true)
/*     */   protected IPv6DHCPConfiguration dhcp;
/*     */   @XmlElement(name = "Manual")
/*     */   protected List<PrefixedIPv6Address> manual;
/*     */   @XmlElement(name = "LinkLocal")
/*     */   protected List<PrefixedIPv6Address> linkLocal;
/*     */   @XmlElement(name = "FromDHCP")
/*     */   protected List<PrefixedIPv6Address> fromDHCP;
/*     */   @XmlElement(name = "FromRA")
/*     */   protected List<PrefixedIPv6Address> fromRA;
/*     */   @XmlElement(name = "Extension")
/*     */   protected IPv6ConfigurationExtension extension;
/*     */   @XmlAnyAttribute
/*  68 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isAcceptRouterAdvert() {
/*  77 */     return this.acceptRouterAdvert;
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
/*  88 */     this.acceptRouterAdvert = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IPv6DHCPConfiguration getDHCP() {
/*  98 */     return this.dhcp;
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
/* 109 */     this.dhcp = value;
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
/* 133 */     if (this.manual == null) {
/* 134 */       this.manual = new ArrayList<>();
/*     */     }
/* 136 */     return this.manual;
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
/*     */   public List<PrefixedIPv6Address> getLinkLocal() {
/* 160 */     if (this.linkLocal == null) {
/* 161 */       this.linkLocal = new ArrayList<>();
/*     */     }
/* 163 */     return this.linkLocal;
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
/*     */   public List<PrefixedIPv6Address> getFromDHCP() {
/* 187 */     if (this.fromDHCP == null) {
/* 188 */       this.fromDHCP = new ArrayList<>();
/*     */     }
/* 190 */     return this.fromDHCP;
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
/*     */   public List<PrefixedIPv6Address> getFromRA() {
/* 214 */     if (this.fromRA == null) {
/* 215 */       this.fromRA = new ArrayList<>();
/*     */     }
/* 217 */     return this.fromRA;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IPv6ConfigurationExtension getExtension() {
/* 227 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(IPv6ConfigurationExtension value) {
/* 238 */     this.extension = value;
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
/* 253 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\IPv6Configuration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */