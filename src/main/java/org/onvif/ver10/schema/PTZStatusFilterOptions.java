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
/*     */ @XmlType(name = "PTZStatusFilterOptions", propOrder = {"panTiltStatusSupported", "zoomStatusSupported", "any", "panTiltPositionSupported", "zoomPositionSupported", "extension"})
/*     */ public class PTZStatusFilterOptions
/*     */ {
/*     */   @XmlElement(name = "PanTiltStatusSupported")
/*     */   protected boolean panTiltStatusSupported;
/*     */   @XmlElement(name = "ZoomStatusSupported")
/*     */   protected boolean zoomStatusSupported;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlElement(name = "PanTiltPositionSupported")
/*     */   protected Boolean panTiltPositionSupported;
/*     */   @XmlElement(name = "ZoomPositionSupported")
/*     */   protected Boolean zoomPositionSupported;
/*     */   @XmlElement(name = "Extension")
/*     */   protected PTZStatusFilterOptionsExtension extension;
/*     */   @XmlAnyAttribute
/*  68 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPanTiltStatusSupported() {
/*  75 */     return this.panTiltStatusSupported;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPanTiltStatusSupported(boolean value) {
/*  83 */     this.panTiltStatusSupported = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isZoomStatusSupported() {
/*  91 */     return this.zoomStatusSupported;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZoomStatusSupported(boolean value) {
/*  99 */     this.zoomStatusSupported = value;
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
/* 123 */     if (this.any == null) {
/* 124 */       this.any = new ArrayList();
/*     */     }
/* 126 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isPanTiltPositionSupported() {
/* 136 */     return this.panTiltPositionSupported;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPanTiltPositionSupported(Boolean value) {
/* 147 */     this.panTiltPositionSupported = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isZoomPositionSupported() {
/* 157 */     return this.zoomPositionSupported;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZoomPositionSupported(Boolean value) {
/* 168 */     this.zoomPositionSupported = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZStatusFilterOptionsExtension getExtension() {
/* 178 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(PTZStatusFilterOptionsExtension value) {
/* 189 */     this.extension = value;
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


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZStatusFilterOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */