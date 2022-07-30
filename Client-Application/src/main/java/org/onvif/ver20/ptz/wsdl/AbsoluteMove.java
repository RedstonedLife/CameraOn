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
/*     */ @XmlType(name = "", propOrder = {"profileToken", "position", "speed"})
/*     */ @XmlRootElement(name = "AbsoluteMove")
/*     */ public class AbsoluteMove
/*     */ {
/*     */   @XmlElement(name = "ProfileToken", required = true)
/*     */   protected String profileToken;
/*     */   @XmlElement(name = "Position", required = true)
/*     */   protected PTZVector position;
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
/*     */   public PTZVector getPosition() {
/*  81 */     return this.position;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosition(PTZVector value) {
/*  92 */     this.position = value;
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


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\ptz\wsdl\AbsoluteMove.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */