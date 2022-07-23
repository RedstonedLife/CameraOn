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
/*    */ @XmlType(name = "FactoryDefaultType")
/*    */ @XmlEnum
/*    */ public enum FactoryDefaultType
/*    */ {
/* 36 */   HARD(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     "Hard"),
/*    */   
/* 43 */   SOFT(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 48 */     "Soft");
/*    */   private final String value;
/*    */   
/*    */   FactoryDefaultType(String v) {
/* 52 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 56 */     return this.value; } public static FactoryDefaultType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     FactoryDefaultType[] arrayOfFactoryDefaultType;
/* 60 */     for (i = (arrayOfFactoryDefaultType = values()).length, b = 0; b < i; ) { FactoryDefaultType c = arrayOfFactoryDefaultType[b];
/* 61 */       if (c.value.equals(v))
/* 62 */         return c; 
/*    */       b++; }
/*    */     
/* 65 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\FactoryDefaultType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */