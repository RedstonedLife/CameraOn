/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "NetworkGateway", propOrder = {"iPv4Address", "iPv6Address"})
/*     */ public class NetworkGateway
/*     */ {
/*     */   @XmlElement(name = "IPv4Address")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   protected List<String> iPv4Address;
/*     */   @XmlElement(name = "IPv6Address")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   protected List<String> iPv6Address;
/*     */   
/*     */   public List<String> getIPv4Address() {
/*  73 */     if (this.iPv4Address == null) {
/*  74 */       this.iPv4Address = new ArrayList<>();
/*     */     }
/*  76 */     return this.iPv4Address;
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
/*     */   public List<String> getIPv6Address() {
/* 100 */     if (this.iPv6Address == null) {
/* 101 */       this.iPv6Address = new ArrayList<>();
/*     */     }
/* 103 */     return this.iPv6Address;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\NetworkGateway.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */