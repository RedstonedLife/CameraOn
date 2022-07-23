/*    */ package org.onvif.ver20.ptz.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.PTZStatus;
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
/*    */ @XmlType(name = "", propOrder = {"ptzStatus"})
/*    */ @XmlRootElement(name = "GetStatusResponse")
/*    */ public class GetStatusResponse
/*    */ {
/*    */   @XmlElement(name = "PTZStatus", required = true)
/*    */   protected PTZStatus ptzStatus;
/*    */   
/*    */   public PTZStatus getPTZStatus() {
/* 53 */     return this.ptzStatus;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPTZStatus(PTZStatus value) {
/* 64 */     this.ptzStatus = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\ptz\wsdl\GetStatusResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */