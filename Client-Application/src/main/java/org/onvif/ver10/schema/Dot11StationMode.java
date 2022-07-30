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
/*    */ @XmlType(name = "Dot11StationMode")
/*    */ @XmlEnum
/*    */ public enum Dot11StationMode
/*    */ {
/* 37 */   AD_HOC(
/* 38 */     "Ad-hoc"),
/* 39 */   INFRASTRUCTURE("Infrastructure"),
/* 40 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   Dot11StationMode(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value; } public static Dot11StationMode fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     Dot11StationMode[] arrayOfDot11StationMode;
/* 52 */     for (i = (arrayOfDot11StationMode = values()).length, b = 0; b < i; ) { Dot11StationMode c = arrayOfDot11StationMode[b];
/* 53 */       if (c.value.equals(v))
/* 54 */         return c; 
/*    */       b++; }
/*    */     
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Dot11StationMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */