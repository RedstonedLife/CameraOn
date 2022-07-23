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
/*    */ @XmlType(name = "DefoggingMode")
/*    */ @XmlEnum
/*    */ public enum DefoggingMode
/*    */ {
/* 35 */   OFF,
/* 36 */   ON,
/* 37 */   AUTO;
/*    */   
/*    */   public String value() {
/* 40 */     return name();
/*    */   }
/*    */   
/*    */   public static DefoggingMode fromValue(String v) {
/* 44 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\DefoggingMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */