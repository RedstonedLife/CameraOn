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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "SecurityCapabilities", propOrder = {"tls11", "tls12", "onboardKeyGeneration", "accessPolicyConfig", "x509Token", "samlToken", "kerberosToken", "relToken", "any", "extension"})
/*     */ public class SecurityCapabilities
/*     */ {
/*     */   @XmlElement(name = "TLS1.1")
/*     */   protected boolean tls11;
/*     */   @XmlElement(name = "TLS1.2")
/*     */   protected boolean tls12;
/*     */   @XmlElement(name = "OnboardKeyGeneration")
/*     */   protected boolean onboardKeyGeneration;
/*     */   @XmlElement(name = "AccessPolicyConfig")
/*     */   protected boolean accessPolicyConfig;
/*     */   @XmlElement(name = "X.509Token")
/*     */   protected boolean x509Token;
/*     */   @XmlElement(name = "SAMLToken")
/*     */   protected boolean samlToken;
/*     */   @XmlElement(name = "KerberosToken")
/*     */   protected boolean kerberosToken;
/*     */   @XmlElement(name = "RELToken")
/*     */   protected boolean relToken;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlElement(name = "Extension")
/*     */   protected SecurityCapabilitiesExtension extension;
/*     */   @XmlAnyAttribute
/*  80 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isTLS11() {
/*  87 */     return this.tls11;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTLS11(boolean value) {
/*  95 */     this.tls11 = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isTLS12() {
/* 103 */     return this.tls12;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTLS12(boolean value) {
/* 111 */     this.tls12 = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOnboardKeyGeneration() {
/* 119 */     return this.onboardKeyGeneration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnboardKeyGeneration(boolean value) {
/* 127 */     this.onboardKeyGeneration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isAccessPolicyConfig() {
/* 135 */     return this.accessPolicyConfig;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAccessPolicyConfig(boolean value) {
/* 143 */     this.accessPolicyConfig = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isX509Token() {
/* 151 */     return this.x509Token;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setX509Token(boolean value) {
/* 159 */     this.x509Token = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSAMLToken() {
/* 167 */     return this.samlToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSAMLToken(boolean value) {
/* 175 */     this.samlToken = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isKerberosToken() {
/* 183 */     return this.kerberosToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKerberosToken(boolean value) {
/* 191 */     this.kerberosToken = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRELToken() {
/* 199 */     return this.relToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRELToken(boolean value) {
/* 207 */     this.relToken = value;
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
/* 231 */     if (this.any == null) {
/* 232 */       this.any = new ArrayList();
/*     */     }
/* 234 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SecurityCapabilitiesExtension getExtension() {
/* 244 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(SecurityCapabilitiesExtension value) {
/* 255 */     this.extension = value;
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
/* 270 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\SecurityCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */