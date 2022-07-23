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
/*    */ @XmlType(name = "ClassType")
/*    */ @XmlEnum
/*    */ public enum ClassType
/*    */ {
/* 39 */   ANIMAL(
/* 40 */     "Animal"),
/* 41 */   FACE("Face"),
/* 42 */   HUMAN("Human"),
/* 43 */   VEHICAL("Vehical"),
/* 44 */   OTHER("Other");
/*    */   private final String value;
/*    */   
/*    */   ClassType(String v) {
/* 48 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 52 */     return this.value; } public static ClassType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     ClassType[] arrayOfClassType;
/* 56 */     for (i = (arrayOfClassType = values()).length, b = 0; b < i; ) { ClassType c = arrayOfClassType[b];
/* 57 */       if (c.value.equals(v))
/* 58 */         return c; 
/*    */       b++; }
/*    */     
/* 61 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ClassType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */