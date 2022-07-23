/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.RelayLogicalState;
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
/*    */ @XmlType(name = "", propOrder = {"relayOutputToken", "logicalState"})
/*    */ @XmlRootElement(name = "SetRelayOutputState")
/*    */ public class SetRelayOutputState
/*    */ {
/*    */   @XmlElement(name = "RelayOutputToken", required = true)
/*    */   protected String relayOutputToken;
/*    */   @XmlElement(name = "LogicalState", required = true)
/*    */   protected RelayLogicalState logicalState;
/*    */   
/*    */   public String getRelayOutputToken() {
/* 56 */     return this.relayOutputToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRelayOutputToken(String value) {
/* 67 */     this.relayOutputToken = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public RelayLogicalState getLogicalState() {
/* 77 */     return this.logicalState;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setLogicalState(RelayLogicalState value) {
/* 88 */     this.logicalState = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SetRelayOutputState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */