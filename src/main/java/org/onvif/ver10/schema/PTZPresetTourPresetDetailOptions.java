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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "PTZPresetTourPresetDetailOptions", propOrder = {"presetToken", "home", "panTiltPositionSpace", "zoomPositionSpace", "extension"})
/*     */ public class PTZPresetTourPresetDetailOptions
/*     */ {
/*     */   @XmlElement(name = "PresetToken")
/*     */   protected List<String> presetToken;
/*     */   @XmlElement(name = "Home")
/*     */   protected Boolean home;
/*     */   @XmlElement(name = "PanTiltPositionSpace")
/*     */   protected Space2DDescription panTiltPositionSpace;
/*     */   @XmlElement(name = "ZoomPositionSpace")
/*     */   protected Space1DDescription zoomPositionSpace;
/*     */   @XmlElement(name = "Extension")
/*     */   protected PTZPresetTourPresetDetailOptionsExtension extension;
/*     */   @XmlAnyAttribute
/*  62 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> getPresetToken() {
/*  85 */     if (this.presetToken == null) {
/*  86 */       this.presetToken = new ArrayList<>();
/*     */     }
/*  88 */     return this.presetToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isHome() {
/*  98 */     return this.home;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHome(Boolean value) {
/* 109 */     this.home = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Space2DDescription getPanTiltPositionSpace() {
/* 119 */     return this.panTiltPositionSpace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPanTiltPositionSpace(Space2DDescription value) {
/* 130 */     this.panTiltPositionSpace = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Space1DDescription getZoomPositionSpace() {
/* 140 */     return this.zoomPositionSpace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZoomPositionSpace(Space1DDescription value) {
/* 151 */     this.zoomPositionSpace = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZPresetTourPresetDetailOptionsExtension getExtension() {
/* 161 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(PTZPresetTourPresetDetailOptionsExtension value) {
/* 172 */     this.extension = value;
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
/* 187 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZPresetTourPresetDetailOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */