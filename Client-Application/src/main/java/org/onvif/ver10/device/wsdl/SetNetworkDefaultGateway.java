/*     */ package org.onvif.ver10.device.wsdl;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
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
/*     */ @XmlType(name = "", propOrder = {"iPv4Address", "iPv6Address"})
/*     */ @XmlRootElement(name = "SetNetworkDefaultGateway")
/*     */ public class SetNetworkDefaultGateway
/*     */ {
/*     */   @XmlElement(name = "IPv4Address")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   protected List<String> iPv4Address;
/*     */   @XmlElement(name = "IPv6Address")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   protected List<String> iPv6Address;
/*     */   
/*     */   public List<String> getIPv4Address() {
/*  75 */     if (this.iPv4Address == null) {
/*  76 */       this.iPv4Address = new ArrayList<>();
/*     */     }
/*  78 */     return this.iPv4Address;
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
/* 102 */     if (this.iPv6Address == null) {
/* 103 */       this.iPv6Address = new ArrayList<>();
/*     */     }
/* 105 */     return this.iPv6Address;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SetNetworkDefaultGateway.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */