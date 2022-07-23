/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "TrackAttributes", propOrder = {"trackInformation", "videoAttributes", "audioAttributes", "metadataAttributes", "extension"})
/*     */ public class TrackAttributes
/*     */ {
/*     */   @XmlElement(name = "TrackInformation", required = true)
/*     */   protected TrackInformation trackInformation;
/*     */   @XmlElement(name = "VideoAttributes")
/*     */   protected VideoAttributes videoAttributes;
/*     */   @XmlElement(name = "AudioAttributes")
/*     */   protected AudioAttributes audioAttributes;
/*     */   @XmlElement(name = "MetadataAttributes")
/*     */   protected MetadataAttributes metadataAttributes;
/*     */   @XmlElement(name = "Extension")
/*     */   protected TrackAttributesExtension extension;
/*     */   @XmlAnyAttribute
/*  60 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TrackInformation getTrackInformation() {
/*  69 */     return this.trackInformation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrackInformation(TrackInformation value) {
/*  80 */     this.trackInformation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoAttributes getVideoAttributes() {
/*  90 */     return this.videoAttributes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVideoAttributes(VideoAttributes value) {
/* 101 */     this.videoAttributes = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioAttributes getAudioAttributes() {
/* 111 */     return this.audioAttributes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAudioAttributes(AudioAttributes value) {
/* 122 */     this.audioAttributes = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MetadataAttributes getMetadataAttributes() {
/* 132 */     return this.metadataAttributes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMetadataAttributes(MetadataAttributes value) {
/* 143 */     this.metadataAttributes = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TrackAttributesExtension getExtension() {
/* 153 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(TrackAttributesExtension value) {
/* 164 */     this.extension = value;
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


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\TrackAttributes.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */