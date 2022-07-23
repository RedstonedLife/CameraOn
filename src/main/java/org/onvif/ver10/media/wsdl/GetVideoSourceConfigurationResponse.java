/*    */ package org.onvif.ver10.media.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.VideoSourceConfiguration;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */ @XmlType(name = "", propOrder = {"configuration"})
/*    */ @XmlRootElement(name = "GetVideoSourceConfigurationResponse")
/*    */ public class GetVideoSourceConfigurationResponse
/*    */ {
/*    */   @XmlElement(name = "Configuration", required = true)
/*    */   protected VideoSourceConfiguration configuration;
/*    */   
/*    */   public VideoSourceConfiguration getConfiguration() {
/* 53 */     return this.configuration;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setConfiguration(VideoSourceConfiguration value) {
/* 64 */     this.configuration = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\GetVideoSourceConfigurationResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */