/*     */ package org.onvif.ver10.schema;
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
/*     */ @XmlType(name = "PTZNode", propOrder = {"name", "supportedPTZSpaces", "maximumNumberOfPresets", "homeSupported", "auxiliaryCommands", "extension"})
/*     */ public class PTZNode
/*     */   extends DeviceEntity
/*     */ {
/*     */   @XmlElement(name = "Name")
/*     */   protected String name;
/*     */   @XmlElement(name = "SupportedPTZSpaces", required = true)
/*     */   protected PTZSpaces supportedPTZSpaces;
/*     */   @XmlElement(name = "MaximumNumberOfPresets")
/*     */   protected int maximumNumberOfPresets;
/*     */   @XmlElement(name = "HomeSupported")
/*     */   protected boolean homeSupported;
/*     */   @XmlElement(name = "AuxiliaryCommands")
/*     */   protected List<String> auxiliaryCommands;
/*     */   @XmlElement(name = "Extension")
/*     */   protected PTZNodeExtension extension;
/*     */   @XmlAttribute(name = "FixedHomePosition")
/*     */   protected Boolean fixedHomePosition;
/*     */   @XmlAnyAttribute
/*  69 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/*  78 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setName(String value) {
/*  89 */     this.name = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZSpaces getSupportedPTZSpaces() {
/*  99 */     return this.supportedPTZSpaces;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupportedPTZSpaces(PTZSpaces value) {
/* 110 */     this.supportedPTZSpaces = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaximumNumberOfPresets() {
/* 118 */     return this.maximumNumberOfPresets;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaximumNumberOfPresets(int value) {
/* 126 */     this.maximumNumberOfPresets = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isHomeSupported() {
/* 134 */     return this.homeSupported;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHomeSupported(boolean value) {
/* 142 */     this.homeSupported = value;
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
/*     */   public List<String> getAuxiliaryCommands() {
/* 166 */     if (this.auxiliaryCommands == null) {
/* 167 */       this.auxiliaryCommands = new ArrayList<>();
/*     */     }
/* 169 */     return this.auxiliaryCommands;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZNodeExtension getExtension() {
/* 179 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(PTZNodeExtension value) {
/* 190 */     this.extension = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isFixedHomePosition() {
/* 200 */     return this.fixedHomePosition;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFixedHomePosition(Boolean value) {
/* 211 */     this.fixedHomePosition = value;
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
/* 226 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */