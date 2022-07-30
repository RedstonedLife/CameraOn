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
/*    */ @XmlType(name = "BacklightCompensationMode")
/*    */ @XmlEnum
/*    */ public enum BacklightCompensationMode
/*    */ {
/* 35 */   OFF,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 41 */   ON;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String value() {
/* 48 */     return name();
/*    */   }
/*    */   
/*    */   public static BacklightCompensationMode fromValue(String v) {
/* 52 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\BacklightCompensationMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */