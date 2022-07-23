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
/*    */ @XmlType(name = "OSDType")
/*    */ @XmlEnum
/*    */ public enum OSDType
/*    */ {
/* 37 */   TEXT(
/* 38 */     "Text"),
/* 39 */   IMAGE("Image"),
/* 40 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   OSDType(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value; } public static OSDType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     OSDType[] arrayOfOSDType;
/* 52 */     for (i = (arrayOfOSDType = values()).length, b = 0; b < i; ) { OSDType c = arrayOfOSDType[b];
/* 53 */       if (c.value.equals(v))
/* 54 */         return c; 
/*    */       b++; }
/*    */     
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\OSDType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */