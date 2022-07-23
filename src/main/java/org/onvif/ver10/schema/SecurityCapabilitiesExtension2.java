/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "SecurityCapabilitiesExtension2", propOrder = {"dot1X", "supportedEAPMethod", "remoteUserHandling", "any"})
/*     */ public class SecurityCapabilitiesExtension2
/*     */ {
/*     */   @XmlElement(name = "Dot1X")
/*     */   protected boolean dot1X;
/*     */   @XmlElement(name = "SupportedEAPMethod", type = Integer.class)
/*     */   protected List<Integer> supportedEAPMethod;
/*     */   @XmlElement(name = "RemoteUserHandling")
/*     */   protected boolean remoteUserHandling;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   
/*     */   public boolean isDot1X() {
/*  61 */     return this.dot1X;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDot1X(boolean value) {
/*  69 */     this.dot1X = value;
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
/*     */   public List<Integer> getSupportedEAPMethod() {
/*  93 */     if (this.supportedEAPMethod == null) {
/*  94 */       this.supportedEAPMethod = new ArrayList<>();
/*     */     }
/*  96 */     return this.supportedEAPMethod;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRemoteUserHandling() {
/* 104 */     return this.remoteUserHandling;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRemoteUserHandling(boolean value) {
/* 112 */     this.remoteUserHandling = value;
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
/* 136 */     if (this.any == null) {
/* 137 */       this.any = new ArrayList();
/*     */     }
/* 139 */     return this.any;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\SecurityCapabilitiesExtension2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */