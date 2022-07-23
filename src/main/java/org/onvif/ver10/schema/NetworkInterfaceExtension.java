/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "NetworkInterfaceExtension", propOrder = {"any", "interfaceType", "dot3", "dot11", "extension"})
/*     */ public class NetworkInterfaceExtension
/*     */ {
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlElement(name = "InterfaceType")
/*     */   protected int interfaceType;
/*     */   @XmlElement(name = "Dot3")
/*     */   protected List<Dot3Configuration> dot3;
/*     */   @XmlElement(name = "Dot11")
/*     */   protected List<Dot11Configuration> dot11;
/*     */   @XmlElement(name = "Extension")
/*     */   protected NetworkInterfaceExtension2 extension;
/*     */   
/*     */   public List<java.lang.Object> getAny() {
/*  80 */     if (this.any == null) {
/*  81 */       this.any = new ArrayList();
/*     */     }
/*  83 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInterfaceType() {
/*  91 */     return this.interfaceType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInterfaceType(int value) {
/*  99 */     this.interfaceType = value;
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
/*     */   public List<Dot3Configuration> getDot3() {
/* 123 */     if (this.dot3 == null) {
/* 124 */       this.dot3 = new ArrayList<>();
/*     */     }
/* 126 */     return this.dot3;
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
/*     */   public List<Dot11Configuration> getDot11() {
/* 150 */     if (this.dot11 == null) {
/* 151 */       this.dot11 = new ArrayList<>();
/*     */     }
/* 153 */     return this.dot11;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NetworkInterfaceExtension2 getExtension() {
/* 163 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(NetworkInterfaceExtension2 value) {
/* 174 */     this.extension = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\NetworkInterfaceExtension.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */