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
/*    */ @XmlType(name = "BacklightCompensationOptions20", propOrder = {"mode", "level"})
/*    */ public class BacklightCompensationOptions20
/*    */ {
/*    */   @XmlElement(name = "Mode", required = true)
/*    */   protected List<BacklightCompensationMode> mode;
/*    */   @XmlElement(name = "Level")
/*    */   protected FloatRange level;
/*    */   
/*    */   public List<BacklightCompensationMode> getMode() {
/* 69 */     if (this.mode == null) {
/* 70 */       this.mode = new ArrayList<>();
/*    */     }
/* 72 */     return this.mode;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FloatRange getLevel() {
/* 82 */     return this.level;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setLevel(FloatRange value) {
/* 93 */     this.level = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\BacklightCompensationOptions20.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */