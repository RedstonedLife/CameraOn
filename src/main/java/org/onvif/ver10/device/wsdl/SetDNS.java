/*     */ package org.onvif.ver10.device.wsdl;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ import org.onvif.ver10.schema.IPAddress;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "", propOrder = {"fromDHCP", "searchDomain", "dnsManual"})
/*     */ @XmlRootElement(name = "SetDNS")
/*     */ public class SetDNS
/*     */ {
/*     */   @XmlElement(name = "FromDHCP")
/*     */   protected boolean fromDHCP;
/*     */   @XmlElement(name = "SearchDomain")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   @XmlSchemaType(name = "token")
/*     */   protected List<String> searchDomain;
/*     */   @XmlElement(name = "DNSManual")
/*     */   protected List<IPAddress> dnsManual;
/*     */   
/*     */   public boolean isFromDHCP() {
/*  64 */     return this.fromDHCP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFromDHCP(boolean value) {
/*  72 */     this.fromDHCP = value;
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
/*  96 */     if (this.searchDomain == null) {
/*  97 */       this.searchDomain = new ArrayList<>();
/*     */     }
/*  99 */     return this.searchDomain;
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
/* 123 */     if (this.dnsManual == null) {
/* 124 */       this.dnsManual = new ArrayList<>();
/*     */     }
/* 126 */     return this.dnsManual;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SetDNS.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */