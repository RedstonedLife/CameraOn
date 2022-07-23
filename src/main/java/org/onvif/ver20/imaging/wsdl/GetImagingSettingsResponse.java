/*    */ package org.onvif.ver20.imaging.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.ImagingSettings20;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */ @XmlType(name = "", propOrder = {"imagingSettings"})
/*    */ @XmlRootElement(name = "GetImagingSettingsResponse")
/*    */ public class GetImagingSettingsResponse
/*    */ {
/*    */   @XmlElement(name = "ImagingSettings", required = true)
/*    */   protected ImagingSettings20 imagingSettings;
/*    */   
/*    */   public ImagingSettings20 getImagingSettings() {
/* 57 */     return this.imagingSettings;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setImagingSettings(ImagingSettings20 value) {
/* 69 */     this.imagingSettings = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\imaging\wsdl\GetImagingSettingsResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */