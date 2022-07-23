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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "NetworkCapabilities")
/*     */ public class NetworkCapabilities
/*     */ {
/*     */   @XmlAttribute(name = "IPFilter")
/*     */   protected Boolean ipFilter;
/*     */   @XmlAttribute(name = "ZeroConfiguration")
/*     */   protected Boolean zeroConfiguration;
/*     */   @XmlAttribute(name = "IPVersion6")
/*     */   protected Boolean ipVersion6;
/*     */   @XmlAttribute(name = "DynDNS")
/*     */   protected Boolean dynDNS;
/*     */   @XmlAttribute(name = "Dot11Configuration")
/*     */   protected Boolean dot11Configuration;
/*     */   @XmlAttribute(name = "Dot1XConfigurations")
/*     */   protected Integer dot1XConfigurations;
/*     */   @XmlAttribute(name = "HostnameFromDHCP")
/*     */   protected Boolean hostnameFromDHCP;
/*     */   @XmlAttribute(name = "NTP")
/*     */   protected Integer ntp;
/*     */   @XmlAttribute(name = "DHCPv6")
/*     */   protected Boolean dhcPv6;
/*     */   @XmlAnyAttribute
/*  70 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isIPFilter() {
/*  79 */     return this.ipFilter;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIPFilter(Boolean value) {
/*  90 */     this.ipFilter = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isZeroConfiguration() {
/* 100 */     return this.zeroConfiguration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZeroConfiguration(Boolean value) {
/* 111 */     this.zeroConfiguration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isIPVersion6() {
/* 121 */     return this.ipVersion6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIPVersion6(Boolean value) {
/* 132 */     this.ipVersion6 = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isDynDNS() {
/* 142 */     return this.dynDNS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDynDNS(Boolean value) {
/* 153 */     this.dynDNS = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isDot11Configuration() {
/* 163 */     return this.dot11Configuration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDot11Configuration(Boolean value) {
/* 174 */     this.dot11Configuration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getDot1XConfigurations() {
/* 184 */     return this.dot1XConfigurations;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDot1XConfigurations(Integer value) {
/* 195 */     this.dot1XConfigurations = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHostnameFromDHCP() {
/* 205 */     return this.hostnameFromDHCP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHostnameFromDHCP(Boolean value) {
/* 216 */     this.hostnameFromDHCP = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNTP() {
/* 226 */     return this.ntp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNTP(Integer value) {
/* 237 */     this.ntp = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isDHCPv6() {
/* 247 */     return this.dhcPv6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDHCPv6(Boolean value) {
/* 258 */     this.dhcPv6 = value;
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
/* 273 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\NetworkCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */