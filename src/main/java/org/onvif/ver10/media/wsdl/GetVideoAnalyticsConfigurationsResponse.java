/*    */ package org.onvif.ver10.media.wsdl;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.VideoAnalyticsConfiguration;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */ @XmlType(name = "", propOrder = {"configurations"})
/*    */ @XmlRootElement(name = "GetVideoAnalyticsConfigurationsResponse")
/*    */ public class GetVideoAnalyticsConfigurationsResponse
/*    */ {
/*    */   @XmlElement(name = "Configurations")
/*    */   protected List<VideoAnalyticsConfiguration> configurations;
/*    */   
/*    */   public List<VideoAnalyticsConfiguration> getConfigurations() {
/* 69 */     if (this.configurations == null) {
/* 70 */       this.configurations = new ArrayList<>();
/*    */     }
/* 72 */     return this.configurations;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\GetVideoAnalyticsConfigurationsResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */