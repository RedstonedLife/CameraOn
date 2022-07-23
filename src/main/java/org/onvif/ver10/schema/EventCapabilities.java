/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
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
/*     */ @XmlType(name = "EventCapabilities", propOrder = {"xAddr", "wsSubscriptionPolicySupport", "wsPullPointSupport", "wsPausableSubscriptionManagerInterfaceSupport", "any"})
/*     */ public class EventCapabilities
/*     */ {
/*     */   @XmlElement(name = "XAddr", required = true)
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String xAddr;
/*     */   @XmlElement(name = "WSSubscriptionPolicySupport")
/*     */   protected boolean wsSubscriptionPolicySupport;
/*     */   @XmlElement(name = "WSPullPointSupport")
/*     */   protected boolean wsPullPointSupport;
/*     */   @XmlElement(name = "WSPausableSubscriptionManagerInterfaceSupport")
/*     */   protected boolean wsPausableSubscriptionManagerInterfaceSupport;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlAnyAttribute
/*  67 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXAddr() {
/*  76 */     return this.xAddr;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setXAddr(String value) {
/*  87 */     this.xAddr = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWSSubscriptionPolicySupport() {
/*  95 */     return this.wsSubscriptionPolicySupport;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWSSubscriptionPolicySupport(boolean value) {
/* 103 */     this.wsSubscriptionPolicySupport = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWSPullPointSupport() {
/* 111 */     return this.wsPullPointSupport;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWSPullPointSupport(boolean value) {
/* 119 */     this.wsPullPointSupport = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWSPausableSubscriptionManagerInterfaceSupport() {
/* 127 */     return this.wsPausableSubscriptionManagerInterfaceSupport;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWSPausableSubscriptionManagerInterfaceSupport(boolean value) {
/* 135 */     this.wsPausableSubscriptionManagerInterfaceSupport = value;
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
/*     */   public List<java.lang.Object> getAny() {
/* 159 */     if (this.any == null) {
/* 160 */       this.any = new ArrayList();
/*     */     }
/* 162 */     return this.any;
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
/* 177 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\EventCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */