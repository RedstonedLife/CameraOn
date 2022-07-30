/*     */ package org.onvif.ver10.events.wsdl;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "Capabilities", propOrder = {"any"})
/*     */ public class Capabilities
/*     */ {
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   @XmlAttribute(name = "WSSubscriptionPolicySupport")
/*     */   protected Boolean wsSubscriptionPolicySupport;
/*     */   @XmlAttribute(name = "WSPullPointSupport")
/*     */   protected Boolean wsPullPointSupport;
/*     */   @XmlAttribute(name = "WSPausableSubscriptionManagerInterfaceSupport")
/*     */   protected Boolean wsPausableSubscriptionManagerInterfaceSupport;
/*     */   @XmlAttribute(name = "MaxNotificationProducers")
/*     */   protected Integer maxNotificationProducers;
/*     */   @XmlAttribute(name = "MaxPullPoints")
/*     */   protected Integer maxPullPoints;
/*     */   @XmlAttribute(name = "PersistentNotificationStorage")
/*     */   protected Boolean persistentNotificationStorage;
/*     */   @XmlAnyAttribute
/*  72 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> getAny() {
/*  98 */     if (this.any == null) {
/*  99 */       this.any = new ArrayList();
/*     */     }
/* 101 */     return this.any;
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
/*     */   public Boolean isWSSubscriptionPolicySupport() {
/* 113 */     return this.wsSubscriptionPolicySupport;
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
/*     */   public void setWSSubscriptionPolicySupport(Boolean value) {
/* 125 */     this.wsSubscriptionPolicySupport = value;
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
/*     */   public Boolean isWSPullPointSupport() {
/* 137 */     return this.wsPullPointSupport;
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
/*     */   public void setWSPullPointSupport(Boolean value) {
/* 149 */     this.wsPullPointSupport = value;
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
/*     */   public Boolean isWSPausableSubscriptionManagerInterfaceSupport() {
/* 161 */     return this.wsPausableSubscriptionManagerInterfaceSupport;
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
/*     */   public void setWSPausableSubscriptionManagerInterfaceSupport(Boolean value) {
/* 173 */     this.wsPausableSubscriptionManagerInterfaceSupport = value;
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
/*     */   public Integer getMaxNotificationProducers() {
/* 185 */     return this.maxNotificationProducers;
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
/*     */   public void setMaxNotificationProducers(Integer value) {
/* 197 */     this.maxNotificationProducers = value;
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
/*     */   public Integer getMaxPullPoints() {
/* 209 */     return this.maxPullPoints;
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
/*     */   public void setMaxPullPoints(Integer value) {
/* 221 */     this.maxPullPoints = value;
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
/*     */   public Boolean isPersistentNotificationStorage() {
/* 233 */     return this.persistentNotificationStorage;
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
/*     */   public void setPersistentNotificationStorage(Boolean value) {
/* 245 */     this.persistentNotificationStorage = value;
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
/*     */   public Map<QName, String> getOtherAttributes() {
/* 263 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\events\wsdl\Capabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */