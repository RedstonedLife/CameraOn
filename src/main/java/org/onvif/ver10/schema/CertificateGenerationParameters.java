/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.HashMap;
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
/*     */ @XmlType(name = "CertificateGenerationParameters", propOrder = {"certificateID", "subject", "validNotBefore", "validNotAfter", "extension"})
/*     */ public class CertificateGenerationParameters
/*     */ {
/*     */   @XmlElement(name = "CertificateID")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   @XmlSchemaType(name = "token")
/*     */   protected String certificateID;
/*     */   @XmlElement(name = "Subject")
/*     */   protected String subject;
/*     */   @XmlElement(name = "ValidNotBefore")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   @XmlSchemaType(name = "token")
/*     */   protected String validNotBefore;
/*     */   @XmlElement(name = "ValidNotAfter")
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   @XmlSchemaType(name = "token")
/*     */   protected String validNotAfter;
/*     */   @XmlElement(name = "Extension")
/*     */   protected CertificateGenerationParametersExtension extension;
/*     */   @XmlAnyAttribute
/*  69 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCertificateID() {
/*  78 */     return this.certificateID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCertificateID(String value) {
/*  89 */     this.certificateID = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSubject() {
/*  99 */     return this.subject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSubject(String value) {
/* 110 */     this.subject = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValidNotBefore() {
/* 120 */     return this.validNotBefore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValidNotBefore(String value) {
/* 131 */     this.validNotBefore = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValidNotAfter() {
/* 141 */     return this.validNotAfter;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValidNotAfter(String value) {
/* 152 */     this.validNotAfter = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CertificateGenerationParametersExtension getExtension() {
/* 162 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(CertificateGenerationParametersExtension value) {
/* 173 */     this.extension = value;
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
/* 188 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\CertificateGenerationParameters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */