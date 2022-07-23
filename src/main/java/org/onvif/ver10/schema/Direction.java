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
/*    */ @XmlType(name = "Direction")
/*    */ @XmlEnum
/*    */ public enum Direction
/*    */ {
/* 37 */   LEFT(
/* 38 */     "Left"),
/* 39 */   RIGHT("Right"),
/* 40 */   ANY("Any");
/*    */   private final String value;
/*    */   
/*    */   Direction(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value; } public static Direction fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     Direction[] arrayOfDirection;
/* 52 */     for (i = (arrayOfDirection = values()).length, b = 0; b < i; ) { Direction c = arrayOfDirection[b];
/* 53 */       if (c.value.equals(v))
/* 54 */         return c; 
/*    */       b++; }
/*    */     
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Direction.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */