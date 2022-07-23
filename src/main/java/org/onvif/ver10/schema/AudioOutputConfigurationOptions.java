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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "AudioOutputConfigurationOptions", propOrder = {"outputTokensAvailable", "sendPrimacyOptions", "outputLevelRange", "any"})
/*     */ public class AudioOutputConfigurationOptions
/*     */ {
/*     */   @XmlElement(name = "OutputTokensAvailable", required = true)
/*     */   protected List<String> outputTokensAvailable;
/*     */   @XmlElement(name = "SendPrimacyOptions")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected List<String> sendPrimacyOptions;
/*     */   @XmlElement(name = "OutputLevelRange", required = true)
/*     */   protected IntRange outputLevelRange;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlAnyAttribute
/*  63 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> getOutputTokensAvailable() {
/*  86 */     if (this.outputTokensAvailable == null) {
/*  87 */       this.outputTokensAvailable = new ArrayList<>();
/*     */     }
/*  89 */     return this.outputTokensAvailable;
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
/*     */   public List<String> getSendPrimacyOptions() {
/* 113 */     if (this.sendPrimacyOptions == null) {
/* 114 */       this.sendPrimacyOptions = new ArrayList<>();
/*     */     }
/* 116 */     return this.sendPrimacyOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getOutputLevelRange() {
/* 126 */     return this.outputLevelRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOutputLevelRange(IntRange value) {
/* 137 */     this.outputLevelRange = value;
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
/* 161 */     if (this.any == null) {
/* 162 */       this.any = new ArrayList();
/*     */     }
/* 164 */     return this.any;
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
/* 179 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\AudioOutputConfigurationOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */