/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.NetworkInterfaceSetConfiguration;
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
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "", propOrder = {"interfaceToken", "networkInterface"})
/*    */ @XmlRootElement(name = "SetNetworkInterfaces")
/*    */ public class SetNetworkInterfaces
/*    */ {
/*    */   @XmlElement(name = "InterfaceToken", required = true)
/*    */   protected String interfaceToken;
/*    */   @XmlElement(name = "NetworkInterface", required = true)
/*    */   protected NetworkInterfaceSetConfiguration networkInterface;
/*    */   
/*    */   public String getInterfaceToken() {
/* 56 */     return this.interfaceToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setInterfaceToken(String value) {
/* 67 */     this.interfaceToken = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public NetworkInterfaceSetConfiguration getNetworkInterface() {
/* 77 */     return this.networkInterface;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setNetworkInterface(NetworkInterfaceSetConfiguration value) {
/* 88 */     this.networkInterface = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SetNetworkInterfaces.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */