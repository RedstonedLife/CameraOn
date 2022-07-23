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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "OSDConfigurationOptions", propOrder = {"maximumNumberOfOSDs", "type", "positionOption", "textOption", "imageOption", "extension"})
/*     */ public class OSDConfigurationOptions
/*     */ {
/*     */   @XmlElement(name = "MaximumNumberOfOSDs", required = true)
/*     */   protected MaximumNumberOfOSDs maximumNumberOfOSDs;
/*     */   @XmlElement(name = "Type", required = true)
/*     */   protected List<OSDType> type;
/*     */   @XmlElement(name = "PositionOption", required = true)
/*     */   protected List<String> positionOption;
/*     */   @XmlElement(name = "TextOption")
/*     */   protected OSDTextOptions textOption;
/*     */   @XmlElement(name = "ImageOption")
/*     */   protected OSDImgOptions imageOption;
/*     */   @XmlElement(name = "Extension")
/*     */   protected OSDConfigurationOptionsExtension extension;
/*     */   @XmlAnyAttribute
/*  65 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MaximumNumberOfOSDs getMaximumNumberOfOSDs() {
/*  74 */     return this.maximumNumberOfOSDs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaximumNumberOfOSDs(MaximumNumberOfOSDs value) {
/*  85 */     this.maximumNumberOfOSDs = value;
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
/*     */   public List<OSDType> getType() {
/* 109 */     if (this.type == null) {
/* 110 */       this.type = new ArrayList<>();
/*     */     }
/* 112 */     return this.type;
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
/*     */   public List<String> getPositionOption() {
/* 136 */     if (this.positionOption == null) {
/* 137 */       this.positionOption = new ArrayList<>();
/*     */     }
/* 139 */     return this.positionOption;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OSDTextOptions getTextOption() {
/* 149 */     return this.textOption;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTextOption(OSDTextOptions value) {
/* 160 */     this.textOption = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OSDImgOptions getImageOption() {
/* 170 */     return this.imageOption;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImageOption(OSDImgOptions value) {
/* 181 */     this.imageOption = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OSDConfigurationOptionsExtension getExtension() {
/* 191 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(OSDConfigurationOptionsExtension value) {
/* 202 */     this.extension = value;
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
/* 217 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\OSDConfigurationOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */