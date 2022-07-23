/*     */ package org.onvif.ver10.media.wsdl;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlList;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.onvif.ver10.schema.VideoResolution;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "VideoSourceMode", propOrder = {"maxFramerate", "maxResolution", "encodings", "reboot", "description", "extension"})
/*     */ public class VideoSourceMode
/*     */ {
/*     */   @XmlElement(name = "MaxFramerate")
/*     */   protected float maxFramerate;
/*     */   @XmlElement(name = "MaxResolution", required = true)
/*     */   protected VideoResolution maxResolution;
/*     */   @XmlList
/*     */   @XmlElement(name = "Encodings", required = true)
/*     */   protected List<String> encodings;
/*     */   @XmlElement(name = "Reboot")
/*     */   protected boolean reboot;
/*     */   @XmlElement(name = "Description")
/*     */   protected String description;
/*     */   @XmlElement(name = "Extension")
/*     */   protected VideoSourceModeExtension extension;
/*     */   @XmlAttribute(name = "token", required = true)
/*     */   protected String token;
/*     */   @XmlAttribute(name = "Enabled")
/*     */   protected Boolean enabled;
/*     */   @XmlAnyAttribute
/*  75 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMaxFramerate() {
/*  82 */     return this.maxFramerate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxFramerate(float value) {
/*  90 */     this.maxFramerate = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoResolution getMaxResolution() {
/* 100 */     return this.maxResolution;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxResolution(VideoResolution value) {
/* 111 */     this.maxResolution = value;
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
/*     */   public List<String> getEncodings() {
/* 135 */     if (this.encodings == null) {
/* 136 */       this.encodings = new ArrayList<>();
/*     */     }
/* 138 */     return this.encodings;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isReboot() {
/* 146 */     return this.reboot;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReboot(boolean value) {
/* 154 */     this.reboot = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescription() {
/* 164 */     return this.description;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescription(String value) {
/* 175 */     this.description = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoSourceModeExtension getExtension() {
/* 185 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(VideoSourceModeExtension value) {
/* 196 */     this.extension = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getToken() {
/* 206 */     return this.token;
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
/* 217 */     this.token = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isEnabled() {
/* 227 */     return this.enabled;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnabled(Boolean value) {
/* 238 */     this.enabled = value;
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
/* 253 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\VideoSourceMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */