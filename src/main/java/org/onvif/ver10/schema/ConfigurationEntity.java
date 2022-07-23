/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "ConfigurationEntity", propOrder = {"name", "useCount"})
/*     */ @XmlSeeAlso({AudioSourceConfiguration.class, PTZConfiguration.class, VideoSourceConfiguration.class, AudioEncoderConfiguration.class, VideoEncoderConfiguration.class, AudioDecoderConfiguration.class, VideoAnalyticsConfiguration.class, AudioOutputConfiguration.class, MetadataConfiguration.class, AnalyticsEngineInput.class, AnalyticsEngineControl.class, AnalyticsEngine.class, VideoOutputConfiguration.class})
/*     */ public class ConfigurationEntity
/*     */ {
/*     */   @XmlElement(name = "Name", required = true)
/*     */   protected String name;
/*     */   @XmlElement(name = "UseCount")
/*     */   protected int useCount;
/*     */   @XmlAttribute(name = "token", required = true)
/*     */   protected String token;
/*     */   
/*     */   public String getName() {
/*  63 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setName(String value) {
/*  74 */     this.name = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getUseCount() {
/*  82 */     return this.useCount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUseCount(int value) {
/*  90 */     this.useCount = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getToken() {
/* 100 */     return this.token;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setToken(String value) {
/* 111 */     this.token = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ConfigurationEntity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */