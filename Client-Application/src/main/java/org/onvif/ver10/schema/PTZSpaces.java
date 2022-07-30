/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "PTZSpaces", propOrder = {"absolutePanTiltPositionSpace", "absoluteZoomPositionSpace", "relativePanTiltTranslationSpace", "relativeZoomTranslationSpace", "continuousPanTiltVelocitySpace", "continuousZoomVelocitySpace", "panTiltSpeedSpace", "zoomSpeedSpace", "extension"})
/*     */ public class PTZSpaces
/*     */ {
/*     */   @XmlElement(name = "AbsolutePanTiltPositionSpace")
/*     */   protected List<Space2DDescription> absolutePanTiltPositionSpace;
/*     */   @XmlElement(name = "AbsoluteZoomPositionSpace")
/*     */   protected List<Space1DDescription> absoluteZoomPositionSpace;
/*     */   @XmlElement(name = "RelativePanTiltTranslationSpace")
/*     */   protected List<Space2DDescription> relativePanTiltTranslationSpace;
/*     */   @XmlElement(name = "RelativeZoomTranslationSpace")
/*     */   protected List<Space1DDescription> relativeZoomTranslationSpace;
/*     */   @XmlElement(name = "ContinuousPanTiltVelocitySpace")
/*     */   protected List<Space2DDescription> continuousPanTiltVelocitySpace;
/*     */   @XmlElement(name = "ContinuousZoomVelocitySpace")
/*     */   protected List<Space1DDescription> continuousZoomVelocitySpace;
/*     */   @XmlElement(name = "PanTiltSpeedSpace")
/*     */   protected List<Space1DDescription> panTiltSpeedSpace;
/*     */   @XmlElement(name = "ZoomSpeedSpace")
/*     */   protected List<Space1DDescription> zoomSpeedSpace;
/*     */   @XmlElement(name = "Extension")
/*     */   protected PTZSpacesExtension extension;
/*     */   @XmlAnyAttribute
/*  75 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Space2DDescription> getAbsolutePanTiltPositionSpace() {
/*  98 */     if (this.absolutePanTiltPositionSpace == null) {
/*  99 */       this.absolutePanTiltPositionSpace = new ArrayList<>();
/*     */     }
/* 101 */     return this.absolutePanTiltPositionSpace;
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
/*     */   public List<Space1DDescription> getAbsoluteZoomPositionSpace() {
/* 125 */     if (this.absoluteZoomPositionSpace == null) {
/* 126 */       this.absoluteZoomPositionSpace = new ArrayList<>();
/*     */     }
/* 128 */     return this.absoluteZoomPositionSpace;
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
/*     */   public List<Space2DDescription> getRelativePanTiltTranslationSpace() {
/* 152 */     if (this.relativePanTiltTranslationSpace == null) {
/* 153 */       this.relativePanTiltTranslationSpace = new ArrayList<>();
/*     */     }
/* 155 */     return this.relativePanTiltTranslationSpace;
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
/*     */   public List<Space1DDescription> getRelativeZoomTranslationSpace() {
/* 179 */     if (this.relativeZoomTranslationSpace == null) {
/* 180 */       this.relativeZoomTranslationSpace = new ArrayList<>();
/*     */     }
/* 182 */     return this.relativeZoomTranslationSpace;
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
/*     */   public List<Space2DDescription> getContinuousPanTiltVelocitySpace() {
/* 206 */     if (this.continuousPanTiltVelocitySpace == null) {
/* 207 */       this.continuousPanTiltVelocitySpace = new ArrayList<>();
/*     */     }
/* 209 */     return this.continuousPanTiltVelocitySpace;
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
/*     */   public List<Space1DDescription> getContinuousZoomVelocitySpace() {
/* 233 */     if (this.continuousZoomVelocitySpace == null) {
/* 234 */       this.continuousZoomVelocitySpace = new ArrayList<>();
/*     */     }
/* 236 */     return this.continuousZoomVelocitySpace;
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
/*     */   public List<Space1DDescription> getPanTiltSpeedSpace() {
/* 260 */     if (this.panTiltSpeedSpace == null) {
/* 261 */       this.panTiltSpeedSpace = new ArrayList<>();
/*     */     }
/* 263 */     return this.panTiltSpeedSpace;
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
/*     */   public List<Space1DDescription> getZoomSpeedSpace() {
/* 287 */     if (this.zoomSpeedSpace == null) {
/* 288 */       this.zoomSpeedSpace = new ArrayList<>();
/*     */     }
/* 290 */     return this.zoomSpeedSpace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZSpacesExtension getExtension() {
/* 300 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(PTZSpacesExtension value) {
/* 311 */     this.extension = value;
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
/* 326 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZSpaces.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */