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
/*    */ 
/*    */ 
/*    */ @XmlType(name = "Dot11SecurityMode")
/*    */ @XmlEnum
/*    */ public enum Dot11SecurityMode
/*    */ {
/* 39 */   NONE(
/* 40 */     "None"), WEP("WEP"), PSK("PSK"),
/* 41 */   DOT_1_X("Dot1X"),
/* 42 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   Dot11SecurityMode(String v) {
/* 46 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 50 */     return this.value; } public static Dot11SecurityMode fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     Dot11SecurityMode[] arrayOfDot11SecurityMode;
/* 54 */     for (i = (arrayOfDot11SecurityMode = values()).length, b = 0; b < i; ) { Dot11SecurityMode c = arrayOfDot11SecurityMode[b];
/* 55 */       if (c.value.equals(v))
/* 56 */         return c; 
/*    */       b++; }
/*    */     
/* 59 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Dot11SecurityMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */