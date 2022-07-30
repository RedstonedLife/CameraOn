/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */
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
/*    */ @XmlType(name = "Dot11SignalStrength")
/*    */ @XmlEnum
/*    */ public enum Dot11SignalStrength
/*    */ {
/* 40 */   NONE(
/* 41 */     "None"),
/* 42 */   VERY_BAD("Very Bad"),
/* 43 */   BAD("Bad"),
/* 44 */   GOOD("Good"),
/* 45 */   VERY_GOOD("Very Good"),
/* 46 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   Dot11SignalStrength(String v) {
/* 50 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 54 */     return this.value; } public static Dot11SignalStrength fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     Dot11SignalStrength[] arrayOfDot11SignalStrength;
/* 58 */     for (i = (arrayOfDot11SignalStrength = values()).length, b = 0; b < i; ) { Dot11SignalStrength c = arrayOfDot11SignalStrength[b];
/* 59 */       if (c.value.equals(v))
/* 60 */         return c; 
/*    */       b++; }
/*    */     
/* 63 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Dot11SignalStrength.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */