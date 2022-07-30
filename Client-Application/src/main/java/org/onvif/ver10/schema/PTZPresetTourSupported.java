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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "PTZPresetTourSupported", propOrder = {"maximumNumberOfPresetTours", "ptzPresetTourOperation", "extension"})
/*     */ public class PTZPresetTourSupported
/*     */ {
/*     */   @XmlElement(name = "MaximumNumberOfPresetTours")
/*     */   protected int maximumNumberOfPresetTours;
/*     */   @XmlElement(name = "PTZPresetTourOperation")
/*     */   protected List<PTZPresetTourOperation> ptzPresetTourOperation;
/*     */   @XmlElement(name = "Extension")
/*     */   protected PTZPresetTourSupportedExtension extension;
/*     */   @XmlAnyAttribute
/*  56 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaximumNumberOfPresetTours() {
/*  63 */     return this.maximumNumberOfPresetTours;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaximumNumberOfPresetTours(int value) {
/*  71 */     this.maximumNumberOfPresetTours = value;
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
/*     */   public List<PTZPresetTourOperation> getPTZPresetTourOperation() {
/*  95 */     if (this.ptzPresetTourOperation == null) {
/*  96 */       this.ptzPresetTourOperation = new ArrayList<>();
/*     */     }
/*  98 */     return this.ptzPresetTourOperation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZPresetTourSupportedExtension getExtension() {
/* 108 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(PTZPresetTourSupportedExtension value) {
/* 119 */     this.extension = value;
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
/* 134 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZPresetTourSupported.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */