/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "NetworkInterfaceConnectionSetting", propOrder = {"autoNegotiation", "speed", "duplex"})
/*    */ public class NetworkInterfaceConnectionSetting
/*    */ {
/*    */   @XmlElement(name = "AutoNegotiation")
/*    */   protected boolean autoNegotiation;
/*    */   @XmlElement(name = "Speed")
/*    */   protected int speed;
/*    */   @XmlElement(name = "Duplex", required = true)
/*    */   protected Duplex duplex;
/*    */   
/*    */   public boolean isAutoNegotiation() {
/* 54 */     return this.autoNegotiation;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setAutoNegotiation(boolean value) {
/* 62 */     this.autoNegotiation = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getSpeed() {
/* 70 */     return this.speed;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setSpeed(int value) {
/* 78 */     this.speed = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Duplex getDuplex() {
/* 88 */     return this.duplex;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDuplex(Duplex value) {
/* 99 */     this.duplex = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\NetworkInterfaceConnectionSetting.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */