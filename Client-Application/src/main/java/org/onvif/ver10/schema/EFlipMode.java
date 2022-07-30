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
/*    */ @XmlType(name = "EFlipMode")
/*    */ @XmlEnum
/*    */ public enum EFlipMode
/*    */ {
/* 37 */   OFF("OFF"), ON("ON"),
/* 38 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   EFlipMode(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static EFlipMode fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     EFlipMode[] arrayOfEFlipMode;
/* 50 */     for (i = (arrayOfEFlipMode = values()).length, b = 0; b < i; ) { EFlipMode c = arrayOfEFlipMode[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\EFlipMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */