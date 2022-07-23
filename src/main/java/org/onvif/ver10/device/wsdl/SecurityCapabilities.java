/*     */ package org.onvif.ver10.device.wsdl;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "SecurityCapabilities")
/*     */ public class SecurityCapabilities
/*     */ {
/*     */   @XmlAttribute(name = "TLS1.0")
/*     */   protected Boolean tls10;
/*     */   @XmlAttribute(name = "TLS1.1")
/*     */   protected Boolean tls11;
/*     */   @XmlAttribute(name = "TLS1.2")
/*     */   protected Boolean tls12;
/*     */   @XmlAttribute(name = "OnboardKeyGeneration")
/*     */   protected Boolean onboardKeyGeneration;
/*     */   @XmlAttribute(name = "AccessPolicyConfig")
/*     */   protected Boolean accessPolicyConfig;
/*     */   @XmlAttribute(name = "DefaultAccessPolicy")
/*     */   protected Boolean defaultAccessPolicy;
/*     */   @XmlAttribute(name = "Dot1X")
/*     */   protected Boolean dot1X;
/*     */   @XmlAttribute(name = "RemoteUserHandling")
/*     */   protected Boolean remoteUserHandling;
/*     */   @XmlAttribute(name = "X.509Token")
/*     */   protected Boolean x509Token;
/*     */   @XmlAttribute(name = "SAMLToken")
/*     */   protected Boolean samlToken;
/*     */   @XmlAttribute(name = "KerberosToken")
/*     */   protected Boolean kerberosToken;
/*     */   @XmlAttribute(name = "UsernameToken")
/*     */   protected Boolean usernameToken;
/*     */   @XmlAttribute(name = "HttpDigest")
/*     */   protected Boolean httpDigest;
/*     */   @XmlAttribute(name = "RELToken")
/*     */   protected Boolean relToken;
/*     */   @XmlAttribute(name = "SupportedEAPMethods")
/*     */   protected List<Integer> supportedEAPMethods;
/*     */   @XmlAttribute(name = "MaxUsers")
/*     */   protected Integer maxUsers;
/*     */   @XmlAnyAttribute
/*  93 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isTLS10() {
/* 102 */     return this.tls10;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTLS10(Boolean value) {
/* 113 */     this.tls10 = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isTLS11() {
/* 123 */     return this.tls11;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTLS11(Boolean value) {
/* 134 */     this.tls11 = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isTLS12() {
/* 144 */     return this.tls12;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTLS12(Boolean value) {
/* 155 */     this.tls12 = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isOnboardKeyGeneration() {
/* 165 */     return this.onboardKeyGeneration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnboardKeyGeneration(Boolean value) {
/* 176 */     this.onboardKeyGeneration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isAccessPolicyConfig() {
/* 186 */     return this.accessPolicyConfig;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAccessPolicyConfig(Boolean value) {
/* 197 */     this.accessPolicyConfig = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isDefaultAccessPolicy() {
/* 207 */     return this.defaultAccessPolicy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultAccessPolicy(Boolean value) {
/* 218 */     this.defaultAccessPolicy = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isDot1X() {
/* 228 */     return this.dot1X;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDot1X(Boolean value) {
/* 239 */     this.dot1X = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isRemoteUserHandling() {
/* 249 */     return this.remoteUserHandling;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRemoteUserHandling(Boolean value) {
/* 260 */     this.remoteUserHandling = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isX509Token() {
/* 270 */     return this.x509Token;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setX509Token(Boolean value) {
/* 281 */     this.x509Token = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isSAMLToken() {
/* 291 */     return this.samlToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSAMLToken(Boolean value) {
/* 302 */     this.samlToken = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isKerberosToken() {
/* 312 */     return this.kerberosToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKerberosToken(Boolean value) {
/* 323 */     this.kerberosToken = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isUsernameToken() {
/* 333 */     return this.usernameToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUsernameToken(Boolean value) {
/* 344 */     this.usernameToken = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHttpDigest() {
/* 354 */     return this.httpDigest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHttpDigest(Boolean value) {
/* 365 */     this.httpDigest = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isRELToken() {
/* 375 */     return this.relToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRELToken(Boolean value) {
/* 386 */     this.relToken = value;
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
/*     */   public List<Integer> getSupportedEAPMethods() {
/* 410 */     if (this.supportedEAPMethods == null) {
/* 411 */       this.supportedEAPMethods = new ArrayList<>();
/*     */     }
/* 413 */     return this.supportedEAPMethods;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getMaxUsers() {
/* 423 */     return this.maxUsers;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxUsers(Integer value) {
/* 434 */     this.maxUsers = value;
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
/* 449 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SecurityCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */