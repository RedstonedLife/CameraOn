/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.DynamicDNSInformation;
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
/*    */ @XmlType(name = "", propOrder = {"dynamicDNSInformation"})
/*    */ @XmlRootElement(name = "GetDynamicDNSResponse")
/*    */ public class GetDynamicDNSResponse
/*    */ {
/*    */   @XmlElement(name = "DynamicDNSInformation", required = true)
/*    */   protected DynamicDNSInformation dynamicDNSInformation;
/*    */   
/*    */   public DynamicDNSInformation getDynamicDNSInformation() {
/* 53 */     return this.dynamicDNSInformation;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDynamicDNSInformation(DynamicDNSInformation value) {
/* 64 */     this.dynamicDNSInformation = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\GetDynamicDNSResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */