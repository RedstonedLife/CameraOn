/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.NetworkHost;
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
/*    */ @XmlType(name = "", propOrder = {"fromDHCP", "ntpManual"})
/*    */ @XmlRootElement(name = "SetNTP")
/*    */ public class SetNTP
/*    */ {
/*    */   @XmlElement(name = "FromDHCP")
/*    */   protected boolean fromDHCP;
/*    */   @XmlElement(name = "NTPManual")
/*    */   protected List<NetworkHost> ntpManual;
/*    */   
/*    */   public boolean isFromDHCP() {
/* 56 */     return this.fromDHCP;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setFromDHCP(boolean value) {
/* 64 */     this.fromDHCP = value;
/*    */   }
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
/*    */   public List<NetworkHost> getNTPManual() {
/* 88 */     if (this.ntpManual == null) {
/* 89 */       this.ntpManual = new ArrayList<>();
/*    */     }
/* 91 */     return this.ntpManual;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SetNTP.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */