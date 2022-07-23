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
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
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
/*     */ @XmlType(name = "SupportedAnalyticsModules", propOrder = {"analyticsModuleContentSchemaLocation", "analyticsModuleDescription", "extension"})
/*     */ public class SupportedAnalyticsModules
/*     */ {
/*     */   @XmlElement(name = "AnalyticsModuleContentSchemaLocation")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected List<String> analyticsModuleContentSchemaLocation;
/*     */   @XmlElement(name = "AnalyticsModuleDescription")
/*     */   protected List<ConfigDescription> analyticsModuleDescription;
/*     */   @XmlElement(name = "Extension")
/*     */   protected SupportedAnalyticsModulesExtension extension;
/*     */   @XmlAnyAttribute
/*  58 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> getAnalyticsModuleContentSchemaLocation() {
/*  81 */     if (this.analyticsModuleContentSchemaLocation == null) {
/*  82 */       this.analyticsModuleContentSchemaLocation = new ArrayList<>();
/*     */     }
/*  84 */     return this.analyticsModuleContentSchemaLocation;
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
/*     */   public List<ConfigDescription> getAnalyticsModuleDescription() {
/* 108 */     if (this.analyticsModuleDescription == null) {
/* 109 */       this.analyticsModuleDescription = new ArrayList<>();
/*     */     }
/* 111 */     return this.analyticsModuleDescription;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupportedAnalyticsModulesExtension getExtension() {
/* 121 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(SupportedAnalyticsModulesExtension value) {
/* 132 */     this.extension = value;
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
/* 147 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\SupportedAnalyticsModules.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */