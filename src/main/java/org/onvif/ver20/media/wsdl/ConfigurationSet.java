/*     */ package org.onvif.ver20.media.wsdl;
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
/*     */ import org.onvif.ver10.schema.AudioDecoderConfiguration;
/*     */ import org.onvif.ver10.schema.AudioEncoder2Configuration;
/*     */ import org.onvif.ver10.schema.AudioOutputConfiguration;
/*     */ import org.onvif.ver10.schema.AudioSourceConfiguration;
/*     */ import org.onvif.ver10.schema.ConfigurationEntity;
/*     */ import org.onvif.ver10.schema.MetadataConfiguration;
/*     */ import org.onvif.ver10.schema.PTZConfiguration;
/*     */ import org.onvif.ver10.schema.VideoEncoder2Configuration;
/*     */ import org.onvif.ver10.schema.VideoSourceConfiguration;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "ConfigurationSet", propOrder = {"videoSource", "audioSource", "videoEncoder", "audioEncoder", "analytics", "ptz", "metadata", "audioOutput", "audioDecoder", "any"})
/*     */ public class ConfigurationSet
/*     */ {
/*     */   @XmlElement(name = "VideoSource")
/*     */   protected VideoSourceConfiguration videoSource;
/*     */   @XmlElement(name = "AudioSource")
/*     */   protected AudioSourceConfiguration audioSource;
/*     */   @XmlElement(name = "VideoEncoder")
/*     */   protected VideoEncoder2Configuration videoEncoder;
/*     */   @XmlElement(name = "AudioEncoder")
/*     */   protected AudioEncoder2Configuration audioEncoder;
/*     */   @XmlElement(name = "Analytics")
/*     */   protected ConfigurationEntity analytics;
/*     */   @XmlElement(name = "PTZ")
/*     */   protected PTZConfiguration ptz;
/*     */   @XmlElement(name = "Metadata")
/*     */   protected MetadataConfiguration metadata;
/*     */   @XmlElement(name = "AudioOutput")
/*     */   protected AudioOutputConfiguration audioOutput;
/*     */   @XmlElement(name = "AudioDecoder")
/*     */   protected AudioDecoderConfiguration audioDecoder;
/*     */   @XmlAnyElement
/*     */   protected List<Element> any;
/*     */   @XmlAnyAttribute
/* 103 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoSourceConfiguration getVideoSource() {
/* 114 */     return this.videoSource;
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
/*     */   public void setVideoSource(VideoSourceConfiguration value) {
/* 126 */     this.videoSource = value;
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
/*     */   public AudioSourceConfiguration getAudioSource() {
/* 138 */     return this.audioSource;
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
/*     */   public void setAudioSource(AudioSourceConfiguration value) {
/* 150 */     this.audioSource = value;
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
/*     */   public VideoEncoder2Configuration getVideoEncoder() {
/* 162 */     return this.videoEncoder;
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
/*     */   public void setVideoEncoder(VideoEncoder2Configuration value) {
/* 174 */     this.videoEncoder = value;
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
/*     */   public AudioEncoder2Configuration getAudioEncoder() {
/* 186 */     return this.audioEncoder;
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
/*     */   public void setAudioEncoder(AudioEncoder2Configuration value) {
/* 198 */     this.audioEncoder = value;
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
/*     */   public ConfigurationEntity getAnalytics() {
/* 210 */     return this.analytics;
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
/*     */   public void setAnalytics(ConfigurationEntity value) {
/* 222 */     this.analytics = value;
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
/*     */   public PTZConfiguration getPTZ() {
/* 234 */     return this.ptz;
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
/*     */   public void setPTZ(PTZConfiguration value) {
/* 246 */     this.ptz = value;
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
/*     */   public MetadataConfiguration getMetadata() {
/* 258 */     return this.metadata;
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
/*     */   public void setMetadata(MetadataConfiguration value) {
/* 270 */     this.metadata = value;
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
/*     */   public AudioOutputConfiguration getAudioOutput() {
/* 282 */     return this.audioOutput;
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
/*     */   public void setAudioOutput(AudioOutputConfiguration value) {
/* 294 */     this.audioOutput = value;
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
/*     */   public AudioDecoderConfiguration getAudioDecoder() {
/* 306 */     return this.audioDecoder;
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
/*     */   public void setAudioDecoder(AudioDecoderConfiguration value) {
/* 318 */     this.audioDecoder = value;
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
/*     */ 
/*     */   
/*     */   public List<Element> getAny() {
/* 344 */     if (this.any == null) {
/* 345 */       this.any = new ArrayList<>();
/*     */     }
/* 347 */     return this.any;
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
/* 365 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\media\wsdl\ConfigurationSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */