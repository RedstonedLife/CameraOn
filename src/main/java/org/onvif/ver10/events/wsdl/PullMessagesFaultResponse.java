/*     */ package org.onvif.ver10.events.wsdl;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.datatype.Duration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "", propOrder = {"maxTimeout", "maxMessageLimit", "any"})
/*     */ @XmlRootElement(name = "PullMessagesFaultResponse")
/*     */ public class PullMessagesFaultResponse
/*     */ {
/*     */   @XmlElement(name = "MaxTimeout", required = true)
/*     */   protected Duration maxTimeout;
/*     */   @XmlElement(name = "MaxMessageLimit")
/*     */   protected int maxMessageLimit;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   
/*     */   public Duration getMaxTimeout() {
/*  68 */     return this.maxTimeout;
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
/*     */   public void setMaxTimeout(Duration value) {
/*  80 */     this.maxTimeout = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxMessageLimit() {
/*  88 */     return this.maxMessageLimit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxMessageLimit(int value) {
/*  96 */     this.maxMessageLimit = value;
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
/*     */ 
/*     */   
/*     */   public List<Object> getAny() {
/* 122 */     if (this.any == null) {
/* 123 */       this.any = new ArrayList();
/*     */     }
/* 125 */     return this.any;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\events\wsdl\PullMessagesFaultResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */