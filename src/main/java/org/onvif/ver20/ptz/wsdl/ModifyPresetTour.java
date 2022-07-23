/*    */ package org.onvif.ver20.ptz.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.PresetTour;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */ @XmlType(name = "", propOrder = {"profileToken", "presetTour"})
/*    */ @XmlRootElement(name = "ModifyPresetTour")
/*    */ public class ModifyPresetTour
/*    */ {
/*    */   @XmlElement(name = "ProfileToken", required = true)
/*    */   protected String profileToken;
/*    */   @XmlElement(name = "PresetTour", required = true)
/*    */   protected PresetTour presetTour;
/*    */   
/*    */   public String getProfileToken() {
/* 56 */     return this.profileToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setProfileToken(String value) {
/* 67 */     this.profileToken = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public PresetTour getPresetTour() {
/* 77 */     return this.presetTour;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPresetTour(PresetTour value) {
/* 88 */     this.presetTour = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\ptz\wsdl\ModifyPresetTour.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */