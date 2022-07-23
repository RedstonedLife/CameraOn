/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.DiscoveryMode;
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
/*    */ @XmlType(name = "", propOrder = {"remoteDiscoveryMode"})
/*    */ @XmlRootElement(name = "GetRemoteDiscoveryModeResponse")
/*    */ public class GetRemoteDiscoveryModeResponse
/*    */ {
/*    */   @XmlElement(name = "RemoteDiscoveryMode", required = true)
/*    */   protected DiscoveryMode remoteDiscoveryMode;
/*    */   
/*    */   public DiscoveryMode getRemoteDiscoveryMode() {
/* 53 */     return this.remoteDiscoveryMode;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRemoteDiscoveryMode(DiscoveryMode value) {
/* 64 */     this.remoteDiscoveryMode = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\GetRemoteDiscoveryModeResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */