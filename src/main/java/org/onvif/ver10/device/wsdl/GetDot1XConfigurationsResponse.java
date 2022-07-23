/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.Dot1XConfiguration;
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
/*    */ @XmlType(name = "", propOrder = {"dot1XConfiguration"})
/*    */ @XmlRootElement(name = "GetDot1XConfigurationsResponse")
/*    */ public class GetDot1XConfigurationsResponse
/*    */ {
/*    */   @XmlElement(name = "Dot1XConfiguration")
/*    */   protected List<Dot1XConfiguration> dot1XConfiguration;
/*    */   
/*    */   public List<Dot1XConfiguration> getDot1XConfiguration() {
/* 69 */     if (this.dot1XConfiguration == null) {
/* 70 */       this.dot1XConfiguration = new ArrayList<>();
/*    */     }
/* 72 */     return this.dot1XConfiguration;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\GetDot1XConfigurationsResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */