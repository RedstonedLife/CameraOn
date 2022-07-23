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
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "DNSInformation", propOrder = {"fromDHCP", "searchDomain", "dnsFromDHCP", "dnsManual", "extension"})
/*     */ public class DNSInformation
/*     */ {
/*     */   @XmlElement(name = "FromDHCP")
/*     */   protected boolean fromDHCP;
/*     */   @XmlElement(name = "SearchDomain")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   @XmlSchemaType(name = "token")
/*     */   protected List<String> searchDomain;
/*     */   @XmlElement(name = "DNSFromDHCP")
/*     */   protected List<IPAddress> dnsFromDHCP;
/*     */   @XmlElement(name = "DNSManual")
/*     */   protected List<IPAddress> dnsManual;
/*     */   @XmlElement(name = "Extension")
/*     */   protected DNSInformationExtension extension;
/*     */   @XmlAnyAttribute
/*  67 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFromDHCP() {
/*  74 */     return this.fromDHCP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFromDHCP(boolean value) {
/*  82 */     this.fromDHCP = value;
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
/*     */   public List<String> getSearchDomain() {
/* 106 */     if (this.searchDomain == null) {
/* 107 */       this.searchDomain = new ArrayList<>();
/*     */     }
/* 109 */     return this.searchDomain;
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
/*     */   public List<IPAddress> getDNSFromDHCP() {
/* 133 */     if (this.dnsFromDHCP == null) {
/* 134 */       this.dnsFromDHCP = new ArrayList<>();
/*     */     }
/* 136 */     return this.dnsFromDHCP;
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
/*     */   public List<IPAddress> getDNSManual() {
/* 160 */     if (this.dnsManual == null) {
/* 161 */       this.dnsManual = new ArrayList<>();
/*     */     }
/* 163 */     return this.dnsManual;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DNSInformationExtension getExtension() {
/* 173 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(DNSInformationExtension value) {
/* 184 */     this.extension = value;
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
/* 199 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\DNSInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */