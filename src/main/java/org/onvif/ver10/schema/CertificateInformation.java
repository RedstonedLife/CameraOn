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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "CertificateInformation", propOrder = {"certificateID", "issuerDN", "subjectDN", "keyUsage", "extendedKeyUsage", "keyLength", "version", "serialNum", "signatureAlgorithm", "validity", "extension"})
/*     */ public class CertificateInformation
/*     */ {
/*     */   @XmlElement(name = "CertificateID", required = true)
/*     */   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
/*     */   @XmlSchemaType(name = "token")
/*     */   protected String certificateID;
/*     */   @XmlElement(name = "IssuerDN")
/*     */   protected String issuerDN;
/*     */   @XmlElement(name = "SubjectDN")
/*     */   protected String subjectDN;
/*     */   @XmlElement(name = "KeyUsage")
/*     */   protected CertificateUsage keyUsage;
/*     */   @XmlElement(name = "ExtendedKeyUsage")
/*     */   protected CertificateUsage extendedKeyUsage;
/*     */   @XmlElement(name = "KeyLength")
/*     */   protected Integer keyLength;
/*     */   @XmlElement(name = "Version")
/*     */   protected String version;
/*     */   @XmlElement(name = "SerialNum")
/*     */   protected String serialNum;
/*     */   @XmlElement(name = "SignatureAlgorithm")
/*     */   protected String signatureAlgorithm;
/*     */   @XmlElement(name = "Validity")
/*     */   protected DateTimeRange validity;
/*     */   @XmlElement(name = "Extension")
/*     */   protected CertificateInformationExtension extension;
/*     */   @XmlAnyAttribute
/*  84 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCertificateID() {
/*  93 */     return this.certificateID;
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
/* 104 */     this.certificateID = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIssuerDN() {
/* 114 */     return this.issuerDN;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIssuerDN(String value) {
/* 125 */     this.issuerDN = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSubjectDN() {
/* 135 */     return this.subjectDN;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSubjectDN(String value) {
/* 146 */     this.subjectDN = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CertificateUsage getKeyUsage() {
/* 156 */     return this.keyUsage;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKeyUsage(CertificateUsage value) {
/* 167 */     this.keyUsage = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CertificateUsage getExtendedKeyUsage() {
/* 177 */     return this.extendedKeyUsage;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtendedKeyUsage(CertificateUsage value) {
/* 188 */     this.extendedKeyUsage = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getKeyLength() {
/* 198 */     return this.keyLength;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKeyLength(Integer value) {
/* 209 */     this.keyLength = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVersion() {
/* 219 */     return this.version;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVersion(String value) {
/* 230 */     this.version = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSerialNum() {
/* 240 */     return this.serialNum;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSerialNum(String value) {
/* 251 */     this.serialNum = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSignatureAlgorithm() {
/* 261 */     return this.signatureAlgorithm;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSignatureAlgorithm(String value) {
/* 272 */     this.signatureAlgorithm = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateTimeRange getValidity() {
/* 282 */     return this.validity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValidity(DateTimeRange value) {
/* 293 */     this.validity = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CertificateInformationExtension getExtension() {
/* 303 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(CertificateInformationExtension value) {
/* 314 */     this.extension = value;
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
/* 329 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\CertificateInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */