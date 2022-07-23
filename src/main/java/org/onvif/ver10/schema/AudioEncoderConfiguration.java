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
/*     */ import javax.xml.datatype.Duration;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "AudioEncoderConfiguration", propOrder = {"encoding", "bitrate", "sampleRate", "multicast", "sessionTimeout", "any"})
/*     */ public class AudioEncoderConfiguration
/*     */   extends ConfigurationEntity
/*     */ {
/*     */   @XmlElement(name = "Encoding", required = true)
/*     */   protected AudioEncoding encoding;
/*     */   @XmlElement(name = "Bitrate")
/*     */   protected int bitrate;
/*     */   @XmlElement(name = "SampleRate")
/*     */   protected int sampleRate;
/*     */   @XmlElement(name = "Multicast", required = true)
/*     */   protected MulticastConfiguration multicast;
/*     */   @XmlElement(name = "SessionTimeout", required = true)
/*     */   protected Duration sessionTimeout;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlAnyAttribute
/*  68 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioEncoding getEncoding() {
/*  77 */     return this.encoding;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEncoding(AudioEncoding value) {
/*  88 */     this.encoding = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBitrate() {
/*  96 */     return this.bitrate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBitrate(int value) {
/* 104 */     this.bitrate = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSampleRate() {
/* 112 */     return this.sampleRate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSampleRate(int value) {
/* 120 */     this.sampleRate = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MulticastConfiguration getMulticast() {
/* 130 */     return this.multicast;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMulticast(MulticastConfiguration value) {
/* 141 */     this.multicast = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Duration getSessionTimeout() {
/* 151 */     return this.sessionTimeout;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSessionTimeout(Duration value) {
/* 162 */     this.sessionTimeout = value;
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
/* 186 */     if (this.any == null) {
/* 187 */       this.any = new ArrayList();
/*     */     }
/* 189 */     return this.any;
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
/* 204 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\AudioEncoderConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */