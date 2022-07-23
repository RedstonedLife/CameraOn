/*    */ package org.onvif.ver10.media.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.MetadataConfigurationOptions;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */ @XmlType(name = "", propOrder = {"options"})
/*    */ @XmlRootElement(name = "GetMetadataConfigurationOptionsResponse")
/*    */ public class GetMetadataConfigurationOptionsResponse
/*    */ {
/*    */   @XmlElement(name = "Options", required = true)
/*    */   protected MetadataConfigurationOptions options;
/*    */   
/*    */   public MetadataConfigurationOptions getOptions() {
/* 53 */     return this.options;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setOptions(MetadataConfigurationOptions value) {
/* 64 */     this.options = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\GetMetadataConfigurationOptionsResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */