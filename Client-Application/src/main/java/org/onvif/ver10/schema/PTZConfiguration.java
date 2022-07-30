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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "PTZConfiguration", propOrder = {"nodeToken", "defaultAbsolutePantTiltPositionSpace", "defaultAbsoluteZoomPositionSpace", "defaultRelativePanTiltTranslationSpace", "defaultRelativeZoomTranslationSpace", "defaultContinuousPanTiltVelocitySpace", "defaultContinuousZoomVelocitySpace", "defaultPTZSpeed", "defaultPTZTimeout", "panTiltLimits", "zoomLimits", "extension"})
/*     */ public class PTZConfiguration
/*     */   extends ConfigurationEntity
/*     */ {
/*     */   @XmlElement(name = "NodeToken", required = true)
/*     */   protected String nodeToken;
/*     */   @XmlElement(name = "DefaultAbsolutePantTiltPositionSpace")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String defaultAbsolutePantTiltPositionSpace;
/*     */   @XmlElement(name = "DefaultAbsoluteZoomPositionSpace")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String defaultAbsoluteZoomPositionSpace;
/*     */   @XmlElement(name = "DefaultRelativePanTiltTranslationSpace")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String defaultRelativePanTiltTranslationSpace;
/*     */   @XmlElement(name = "DefaultRelativeZoomTranslationSpace")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String defaultRelativeZoomTranslationSpace;
/*     */   @XmlElement(name = "DefaultContinuousPanTiltVelocitySpace")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String defaultContinuousPanTiltVelocitySpace;
/*     */   @XmlElement(name = "DefaultContinuousZoomVelocitySpace")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String defaultContinuousZoomVelocitySpace;
/*     */   @XmlElement(name = "DefaultPTZSpeed")
/*     */   protected PTZSpeed defaultPTZSpeed;
/*     */   @XmlElement(name = "DefaultPTZTimeout")
/*     */   protected Duration defaultPTZTimeout;
/*     */   @XmlElement(name = "PanTiltLimits")
/*     */   protected PanTiltLimits panTiltLimits;
/*     */   @XmlElement(name = "ZoomLimits")
/*     */   protected ZoomLimits zoomLimits;
/*     */   @XmlElement(name = "Extension")
/*     */   protected PTZConfigurationExtension extension;
/*     */   @XmlAnyAttribute
/*  91 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNodeToken() {
/* 100 */     return this.nodeToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNodeToken(String value) {
/* 111 */     this.nodeToken = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultAbsolutePantTiltPositionSpace() {
/* 121 */     return this.defaultAbsolutePantTiltPositionSpace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultAbsolutePantTiltPositionSpace(String value) {
/* 132 */     this.defaultAbsolutePantTiltPositionSpace = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultAbsoluteZoomPositionSpace() {
/* 142 */     return this.defaultAbsoluteZoomPositionSpace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultAbsoluteZoomPositionSpace(String value) {
/* 153 */     this.defaultAbsoluteZoomPositionSpace = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultRelativePanTiltTranslationSpace() {
/* 163 */     return this.defaultRelativePanTiltTranslationSpace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultRelativePanTiltTranslationSpace(String value) {
/* 174 */     this.defaultRelativePanTiltTranslationSpace = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultRelativeZoomTranslationSpace() {
/* 184 */     return this.defaultRelativeZoomTranslationSpace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultRelativeZoomTranslationSpace(String value) {
/* 195 */     this.defaultRelativeZoomTranslationSpace = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultContinuousPanTiltVelocitySpace() {
/* 205 */     return this.defaultContinuousPanTiltVelocitySpace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultContinuousPanTiltVelocitySpace(String value) {
/* 216 */     this.defaultContinuousPanTiltVelocitySpace = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDefaultContinuousZoomVelocitySpace() {
/* 226 */     return this.defaultContinuousZoomVelocitySpace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultContinuousZoomVelocitySpace(String value) {
/* 237 */     this.defaultContinuousZoomVelocitySpace = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZSpeed getDefaultPTZSpeed() {
/* 247 */     return this.defaultPTZSpeed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultPTZSpeed(PTZSpeed value) {
/* 258 */     this.defaultPTZSpeed = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Duration getDefaultPTZTimeout() {
/* 268 */     return this.defaultPTZTimeout;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultPTZTimeout(Duration value) {
/* 279 */     this.defaultPTZTimeout = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PanTiltLimits getPanTiltLimits() {
/* 289 */     return this.panTiltLimits;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPanTiltLimits(PanTiltLimits value) {
/* 300 */     this.panTiltLimits = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ZoomLimits getZoomLimits() {
/* 310 */     return this.zoomLimits;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZoomLimits(ZoomLimits value) {
/* 321 */     this.zoomLimits = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZConfigurationExtension getExtension() {
/* 331 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(PTZConfigurationExtension value) {
/* 342 */     this.extension = value;
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
/* 357 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */