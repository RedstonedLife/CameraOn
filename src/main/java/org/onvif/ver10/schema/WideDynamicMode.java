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
/*    */ @XmlType(name = "WideDynamicMode")
/*    */ @XmlEnum
/*    */ public enum WideDynamicMode
/*    */ {
/* 35 */   OFF, ON;
/*    */   
/*    */   public String value() {
/* 38 */     return name();
/*    */   }
/*    */   
/*    */   public static WideDynamicMode fromValue(String v) {
/* 42 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\WideDynamicMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */