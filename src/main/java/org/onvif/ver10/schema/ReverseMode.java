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
/*    */ @XmlType(name = "ReverseMode")
/*    */ @XmlEnum
/*    */ public enum ReverseMode
/*    */ {
/* 38 */   OFF("OFF"), ON("ON"), AUTO("AUTO"),
/* 39 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   ReverseMode(String v) {
/* 43 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 47 */     return this.value; } public static ReverseMode fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     ReverseMode[] arrayOfReverseMode;
/* 51 */     for (i = (arrayOfReverseMode = values()).length, b = 0; b < i; ) { ReverseMode c = arrayOfReverseMode[b];
/* 52 */       if (c.value.equals(v))
/* 53 */         return c; 
/*    */       b++; }
/*    */     
/* 56 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ReverseMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */