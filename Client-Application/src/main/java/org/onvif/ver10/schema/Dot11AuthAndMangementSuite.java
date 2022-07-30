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
/*    */ @XmlType(name = "Dot11AuthAndMangementSuite")
/*    */ @XmlEnum
/*    */ public enum Dot11AuthAndMangementSuite
/*    */ {
/* 38 */   NONE(
/* 39 */     "None"),
/* 40 */   DOT_1_X("Dot1X"), PSK("PSK"),
/* 41 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   Dot11AuthAndMangementSuite(String v) {
/* 45 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 49 */     return this.value; } public static Dot11AuthAndMangementSuite fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     Dot11AuthAndMangementSuite[] arrayOfDot11AuthAndMangementSuite;
/* 53 */     for (i = (arrayOfDot11AuthAndMangementSuite = values()).length, b = 0; b < i; ) { Dot11AuthAndMangementSuite c = arrayOfDot11AuthAndMangementSuite[b];
/* 54 */       if (c.value.equals(v))
/* 55 */         return c; 
/*    */       b++; }
/*    */     
/* 58 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Dot11AuthAndMangementSuite.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */