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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "OSDTextOptions", propOrder = {"type", "fontSizeRange", "dateFormat", "timeFormat", "fontColor", "backgroundColor", "extension"})
/*     */ public class OSDTextOptions
/*     */ {
/*     */   @XmlElement(name = "Type", required = true)
/*     */   protected List<String> type;
/*     */   @XmlElement(name = "FontSizeRange")
/*     */   protected IntRange fontSizeRange;
/*     */   @XmlElement(name = "DateFormat")
/*     */   protected List<String> dateFormat;
/*     */   @XmlElement(name = "TimeFormat")
/*     */   protected List<String> timeFormat;
/*     */   @XmlElement(name = "FontColor")
/*     */   protected OSDColorOptions fontColor;
/*     */   @XmlElement(name = "BackgroundColor")
/*     */   protected OSDColorOptions backgroundColor;
/*     */   @XmlElement(name = "Extension")
/*     */   protected OSDTextOptionsExtension extension;
/*     */   @XmlAnyAttribute
/*  68 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> getType() {
/*  91 */     if (this.type == null) {
/*  92 */       this.type = new ArrayList<>();
/*     */     }
/*  94 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntRange getFontSizeRange() {
/* 104 */     return this.fontSizeRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFontSizeRange(IntRange value) {
/* 115 */     this.fontSizeRange = value;
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
/*     */   public List<String> getDateFormat() {
/* 139 */     if (this.dateFormat == null) {
/* 140 */       this.dateFormat = new ArrayList<>();
/*     */     }
/* 142 */     return this.dateFormat;
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
/*     */   public List<String> getTimeFormat() {
/* 166 */     if (this.timeFormat == null) {
/* 167 */       this.timeFormat = new ArrayList<>();
/*     */     }
/* 169 */     return this.timeFormat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OSDColorOptions getFontColor() {
/* 179 */     return this.fontColor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFontColor(OSDColorOptions value) {
/* 190 */     this.fontColor = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OSDColorOptions getBackgroundColor() {
/* 200 */     return this.backgroundColor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBackgroundColor(OSDColorOptions value) {
/* 211 */     this.backgroundColor = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OSDTextOptionsExtension getExtension() {
/* 221 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(OSDTextOptionsExtension value) {
/* 232 */     this.extension = value;
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
/* 247 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\OSDTextOptions.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */