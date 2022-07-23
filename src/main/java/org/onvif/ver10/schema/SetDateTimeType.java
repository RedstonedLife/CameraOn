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
/*    */ @XmlType(name = "SetDateTimeType")
/*    */ @XmlEnum
/*    */ public enum SetDateTimeType
/*    */ {
/* 36 */   MANUAL(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     "Manual"),
/*    */   
/* 43 */   NTP(
/*    */ 
/*    */ 
/*    */     
/* 47 */     "NTP");
/*    */   private final String value;
/*    */   
/*    */   SetDateTimeType(String v) {
/* 51 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 55 */     return this.value; } public static SetDateTimeType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     SetDateTimeType[] arrayOfSetDateTimeType;
/* 59 */     for (i = (arrayOfSetDateTimeType = values()).length, b = 0; b < i; ) { SetDateTimeType c = arrayOfSetDateTimeType[b];
/* 60 */       if (c.value.equals(v))
/* 61 */         return c; 
/*    */       b++; }
/*    */     
/* 64 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\SetDateTimeType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */