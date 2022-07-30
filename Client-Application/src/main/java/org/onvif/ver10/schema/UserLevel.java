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
/*    */ 
/*    */ @XmlType(name = "UserLevel")
/*    */ @XmlEnum
/*    */ public enum UserLevel
/*    */ {
/* 39 */   ADMINISTRATOR(
/* 40 */     "Administrator"),
/* 41 */   OPERATOR("Operator"),
/* 42 */   USER("User"),
/* 43 */   ANONYMOUS("Anonymous"),
/* 44 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   UserLevel(String v) {
/* 48 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 52 */     return this.value; } public static UserLevel fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     UserLevel[] arrayOfUserLevel;
/* 56 */     for (i = (arrayOfUserLevel = values()).length, b = 0; b < i; ) { UserLevel c = arrayOfUserLevel[b];
/* 57 */       if (c.value.equals(v))
/* 58 */         return c; 
/*    */       b++; }
/*    */     
/* 61 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\UserLevel.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */