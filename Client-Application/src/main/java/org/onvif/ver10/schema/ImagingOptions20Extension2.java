/*    */ package org.onvif.ver10.schema;
/*    */ 
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "ImagingOptions20Extension2", propOrder = {"irCutFilterAutoAdjustment", "extension"})
/*    */ public class ImagingOptions20Extension2
/*    */ {
/*    */   @XmlElement(name = "IrCutFilterAutoAdjustment")
/*    */   protected IrCutFilterAutoAdjustmentOptions irCutFilterAutoAdjustment;
/*    */   @XmlElement(name = "Extension")
/*    */   protected ImagingOptions20Extension3 extension;
/*    */   
/*    */   public IrCutFilterAutoAdjustmentOptions getIrCutFilterAutoAdjustment() {
/* 53 */     return this.irCutFilterAutoAdjustment;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setIrCutFilterAutoAdjustment(IrCutFilterAutoAdjustmentOptions value) {
/* 64 */     this.irCutFilterAutoAdjustment = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ImagingOptions20Extension3 getExtension() {
/* 74 */     return this.extension;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setExtension(ImagingOptions20Extension3 value) {
/* 85 */     this.extension = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ImagingOptions20Extension2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */