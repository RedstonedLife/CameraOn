/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
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
/*    */ @XmlType(name = "SystemLogType")
/*    */ @XmlEnum
/*    */ public enum SystemLogType
/*    */ {
/* 36 */   SYSTEM(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     "System"),
/*    */   
/* 43 */   ACCESS(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 48 */     "Access");
/*    */   private final String value;
/*    */   
/*    */   SystemLogType(String v) {
/* 52 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 56 */     return this.value; } public static SystemLogType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     SystemLogType[] arrayOfSystemLogType;
/* 60 */     for (i = (arrayOfSystemLogType = values()).length, b = 0; b < i; ) { SystemLogType c = arrayOfSystemLogType[b];
/* 61 */       if (c.value.equals(v))
/* 62 */         return c; 
/*    */       b++; }
/*    */     
/* 65 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\SystemLogType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */