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
/*    */ @XmlType(name = "Duplex")
/*    */ @XmlEnum
/*    */ public enum Duplex
/*    */ {
/* 36 */   FULL(
/* 37 */     "Full"),
/* 38 */   HALF("Half");
/*    */   private final String value;
/*    */   
/*    */   Duplex(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static Duplex fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     Duplex[] arrayOfDuplex;
/* 50 */     for (i = (arrayOfDuplex = values()).length, b = 0; b < i; ) { Duplex c = arrayOfDuplex[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Duplex.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */