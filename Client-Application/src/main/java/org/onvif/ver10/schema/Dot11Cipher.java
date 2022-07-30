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
/*    */ @XmlType(name = "Dot11Cipher")
/*    */ @XmlEnum
/*    */ public enum Dot11Cipher
/*    */ {
/* 38 */   CCMP("CCMP"), TKIP("TKIP"),
/* 39 */   ANY("Any"),
/* 40 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   Dot11Cipher(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value; } public static Dot11Cipher fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     Dot11Cipher[] arrayOfDot11Cipher;
/* 52 */     for (i = (arrayOfDot11Cipher = values()).length, b = 0; b < i; ) { Dot11Cipher c = arrayOfDot11Cipher[b];
/* 53 */       if (c.value.equals(v))
/* 54 */         return c; 
/*    */       b++; }
/*    */     
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Dot11Cipher.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */