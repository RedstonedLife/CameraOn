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
/*    */ @XmlType(name = "DigitalIdleState")
/*    */ @XmlEnum
/*    */ public enum DigitalIdleState
/*    */ {
/* 35 */   CLOSED(
/* 36 */     "closed"),
/* 37 */   OPEN(
/* 38 */     "open");
/*    */   private final String value;
/*    */   
/*    */   DigitalIdleState(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static DigitalIdleState fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     DigitalIdleState[] arrayOfDigitalIdleState;
/* 50 */     for (i = (arrayOfDigitalIdleState = values()).length, b = 0; b < i; ) { DigitalIdleState c = arrayOfDigitalIdleState[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\DigitalIdleState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */