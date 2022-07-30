/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
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
/*    */ @XmlType(name = "RotateMode")
/*    */ @XmlEnum
/*    */ public enum RotateMode
/*    */ {
/* 36 */   OFF, ON, AUTO;
/*    */   
/*    */   public String value() {
/* 39 */     return name();
/*    */   }
/*    */   
/*    */   public static RotateMode fromValue(String v) {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\RotateMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */