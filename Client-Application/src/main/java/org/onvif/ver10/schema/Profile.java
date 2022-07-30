/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "Profile", propOrder = {"name", "videoSourceConfiguration", "audioSourceConfiguration", "videoEncoderConfiguration", "audioEncoderConfiguration", "videoAnalyticsConfiguration", "ptzConfiguration", "metadataConfiguration", "extension"})
/*     */ public class Profile
/*     */ {
/*     */   @XmlElement(name = "Name", required = true)
/*     */   protected String name;
/*     */   @XmlElement(name = "VideoSourceConfiguration")
/*     */   protected VideoSourceConfiguration videoSourceConfiguration;
/*     */   @XmlElement(name = "AudioSourceConfiguration")
/*     */   protected AudioSourceConfiguration audioSourceConfiguration;
/*     */   @XmlElement(name = "VideoEncoderConfiguration")
/*     */   protected VideoEncoderConfiguration videoEncoderConfiguration;
/*     */   @XmlElement(name = "AudioEncoderConfiguration")
/*     */   protected AudioEncoderConfiguration audioEncoderConfiguration;
/*     */   @XmlElement(name = "VideoAnalyticsConfiguration")
/*     */   protected VideoAnalyticsConfiguration videoAnalyticsConfiguration;
/*     */   @XmlElement(name = "PTZConfiguration")
/*     */   protected PTZConfiguration ptzConfiguration;
/*     */   @XmlElement(name = "MetadataConfiguration")
/*     */   protected MetadataConfiguration metadataConfiguration;
/*     */   @XmlElement(name = "Extension")
/*     */   protected ProfileExtension extension;
/*     */   @XmlAttribute(name = "token", required = true)
/*     */   protected String token;
/*     */   @XmlAttribute(name = "fixed")
/*     */   protected Boolean fixed;
/*     */   @XmlAnyAttribute
/*  96 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 105 */     return this.name;
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
/* 116 */     this.name = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoSourceConfiguration getVideoSourceConfiguration() {
/* 126 */     return this.videoSourceConfiguration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVideoSourceConfiguration(VideoSourceConfiguration value) {
/* 137 */     this.videoSourceConfiguration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioSourceConfiguration getAudioSourceConfiguration() {
/* 147 */     return this.audioSourceConfiguration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAudioSourceConfiguration(AudioSourceConfiguration value) {
/* 158 */     this.audioSourceConfiguration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoEncoderConfiguration getVideoEncoderConfiguration() {
/* 168 */     return this.videoEncoderConfiguration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVideoEncoderConfiguration(VideoEncoderConfiguration value) {
/* 179 */     this.videoEncoderConfiguration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioEncoderConfiguration getAudioEncoderConfiguration() {
/* 189 */     return this.audioEncoderConfiguration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAudioEncoderConfiguration(AudioEncoderConfiguration value) {
/* 200 */     this.audioEncoderConfiguration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoAnalyticsConfiguration getVideoAnalyticsConfiguration() {
/* 210 */     return this.videoAnalyticsConfiguration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
/* 221 */     this.videoAnalyticsConfiguration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZConfiguration getPTZConfiguration() {
/* 231 */     return this.ptzConfiguration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPTZConfiguration(PTZConfiguration value) {
/* 242 */     this.ptzConfiguration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MetadataConfiguration getMetadataConfiguration() {
/* 252 */     return this.metadataConfiguration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMetadataConfiguration(MetadataConfiguration value) {
/* 263 */     this.metadataConfiguration = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ProfileExtension getExtension() {
/* 273 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(ProfileExtension value) {
/* 284 */     this.extension = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getToken() {
/* 294 */     return this.token;
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
/* 305 */     this.token = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isFixed() {
/* 315 */     return this.fixed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFixed(Boolean value) {
/* 326 */     this.fixed = value;
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
/* 341 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Profile.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */