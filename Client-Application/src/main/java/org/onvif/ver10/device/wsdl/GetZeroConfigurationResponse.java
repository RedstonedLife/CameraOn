/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.NetworkZeroConfiguration;
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
/*    */ @XmlType(name = "", propOrder = {"zeroConfiguration"})
/*    */ @XmlRootElement(name = "GetZeroConfigurationResponse")
/*    */ public class GetZeroConfigurationResponse
/*    */ {
/*    */   @XmlElement(name = "ZeroConfiguration", required = true)
/*    */   protected NetworkZeroConfiguration zeroConfiguration;
/*    */   
/*    */   public NetworkZeroConfiguration getZeroConfiguration() {
/* 53 */     return this.zeroConfiguration;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setZeroConfiguration(NetworkZeroConfiguration value) {
/* 64 */     this.zeroConfiguration = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\GetZeroConfigurationResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */