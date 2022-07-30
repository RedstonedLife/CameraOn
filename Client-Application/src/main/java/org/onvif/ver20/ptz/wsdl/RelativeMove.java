/*     */ package org.onvif.ver20.ptz.wsdl;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.onvif.ver10.schema.PTZSpeed;
/*     */ import org.onvif.ver10.schema.PTZVector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "", propOrder = {"profileToken", "translation", "speed"})
/*     */ @XmlRootElement(name = "RelativeMove")
/*     */ public class RelativeMove
/*     */ {
/*     */   @XmlElement(name = "ProfileToken", required = true)
/*     */   protected String profileToken;
/*     */   @XmlElement(name = "Translation", required = true)
/*     */   protected PTZVector translation;
/*     */   @XmlElement(name = "Speed")
/*     */   protected PTZSpeed speed;
/*     */   
/*     */   public String getProfileToken() {
/*  60 */     return this.profileToken;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProfileToken(String value) {
/*  71 */     this.profileToken = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZVector getTranslation() {
/*  81 */     return this.translation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTranslation(PTZVector value) {
/*  92 */     this.translation = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZSpeed getSpeed() {
/* 102 */     return this.speed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSpeed(PTZSpeed value) {
/* 113 */     this.speed = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\ptz\wsdl\RelativeMove.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */