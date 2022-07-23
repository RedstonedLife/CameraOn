/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */ @XmlType(name = "ImagingSettingsExtension202", propOrder = {"irCutFilterAutoAdjustment", "extension"})
/*    */ public class ImagingSettingsExtension202
/*    */ {
/*    */   @XmlElement(name = "IrCutFilterAutoAdjustment")
/*    */   protected List<IrCutFilterAutoAdjustment> irCutFilterAutoAdjustment;
/*    */   @XmlElement(name = "Extension")
/*    */   protected ImagingSettingsExtension203 extension;
/*    */   
/*    */   public List<IrCutFilterAutoAdjustment> getIrCutFilterAutoAdjustment() {
/* 69 */     if (this.irCutFilterAutoAdjustment == null) {
/* 70 */       this.irCutFilterAutoAdjustment = new ArrayList<>();
/*    */     }
/* 72 */     return this.irCutFilterAutoAdjustment;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ImagingSettingsExtension203 getExtension() {
/* 82 */     return this.extension;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setExtension(ImagingSettingsExtension203 value) {
/* 93 */     this.extension = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ImagingSettingsExtension202.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */