/*    */ package org.onvif.ver20.ptz.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
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
/*    */ @XmlType(name = "", propOrder = {"auxiliaryResponse"})
/*    */ @XmlRootElement(name = "SendAuxiliaryCommandResponse")
/*    */ public class SendAuxiliaryCommandResponse
/*    */ {
/*    */   @XmlElement(name = "AuxiliaryResponse", required = true)
/*    */   protected String auxiliaryResponse;
/*    */   
/*    */   public String getAuxiliaryResponse() {
/* 52 */     return this.auxiliaryResponse;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setAuxiliaryResponse(String value) {
/* 63 */     this.auxiliaryResponse = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\ptz\wsdl\SendAuxiliaryCommandResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */