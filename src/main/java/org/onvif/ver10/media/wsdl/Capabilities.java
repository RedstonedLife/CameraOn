/*     */ package org.onvif.ver10.media.wsdl;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "Capabilities", propOrder = {"profileCapabilities", "streamingCapabilities", "any"})
/*     */ public class Capabilities
/*     */ {
/*     */   @XmlElement(name = "ProfileCapabilities", required = true)
/*     */   protected ProfileCapabilities profileCapabilities;
/*     */   @XmlElement(name = "StreamingCapabilities", required = true)
/*     */   protected StreamingCapabilities streamingCapabilities;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   @XmlAttribute(name = "SnapshotUri")
/*     */   protected Boolean snapshotUri;
/*     */   @XmlAttribute(name = "Rotation")
/*     */   protected Boolean rotation;
/*     */   @XmlAttribute(name = "VideoSourceMode")
/*     */   protected Boolean videoSourceMode;
/*     */   @XmlAttribute(name = "OSD")
/*     */   protected Boolean osd;
/*     */   @XmlAnyAttribute
/*  71 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ProfileCapabilities getProfileCapabilities() {
/*  80 */     return this.profileCapabilities;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProfileCapabilities(ProfileCapabilities value) {
/*  91 */     this.profileCapabilities = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamingCapabilities getStreamingCapabilities() {
/* 101 */     return this.streamingCapabilities;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStreamingCapabilities(StreamingCapabilities value) {
/* 112 */     this.streamingCapabilities = value;
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
/*     */   public List<Object> getAny() {
/* 136 */     if (this.any == null) {
/* 137 */       this.any = new ArrayList();
/*     */     }
/* 139 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isSnapshotUri() {
/* 149 */     return this.snapshotUri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSnapshotUri(Boolean value) {
/* 160 */     this.snapshotUri = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isRotation() {
/* 170 */     return this.rotation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRotation(Boolean value) {
/* 181 */     this.rotation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isVideoSourceMode() {
/* 191 */     return this.videoSourceMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVideoSourceMode(Boolean value) {
/* 202 */     this.videoSourceMode = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isOSD() {
/* 212 */     return this.osd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOSD(Boolean value) {
/* 223 */     this.osd = value;
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
/* 238 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\Capabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */