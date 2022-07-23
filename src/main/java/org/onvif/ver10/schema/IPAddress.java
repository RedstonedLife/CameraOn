/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "IPAddress", propOrder = {"type", "iPv4Address", "iPv6Address"})
/*     */ public class IPAddress
/*     */ {
/*     */   @XmlElement(name = "Type", required = true)
/*     */   protected IPType type;
/*     */   @XmlElement(name = "IPv4Address")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   protected String iPv4Address;
/*     */   @XmlElement(name = "IPv6Address")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   protected String iPv6Address;
/*     */   
/*     */   public IPType getType() {
/*  60 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setType(IPType value) {
/*  71 */     this.type = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIPv4Address() {
/*  81 */     return this.iPv4Address;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIPv4Address(String value) {
/*  92 */     this.iPv4Address = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIPv6Address() {
/* 102 */     return this.iPv6Address;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIPv6Address(String value) {
/* 113 */     this.iPv6Address = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\IPAddress.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */