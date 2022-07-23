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
/*    */ 
/*    */ @XmlType(name = "ModeOfOperation")
/*    */ @XmlEnum
/*    */ public enum ModeOfOperation
/*    */ {
/* 37 */   IDLE(
/* 38 */     "Idle"),
/* 39 */   ACTIVE("Active"),
/*    */   
/* 41 */   UNKNOWN(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     "Unknown");
/*    */   private final String value;
/*    */   
/*    */   ModeOfOperation(String v) {
/* 50 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 54 */     return this.value; } public static ModeOfOperation fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     ModeOfOperation[] arrayOfModeOfOperation;
/* 58 */     for (i = (arrayOfModeOfOperation = values()).length, b = 0; b < i; ) { ModeOfOperation c = arrayOfModeOfOperation[b];
/* 59 */       if (c.value.equals(v))
/* 60 */         return c; 
/*    */       b++; }
/*    */     
/* 63 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ModeOfOperation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */