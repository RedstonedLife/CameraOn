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
/*    */ @XmlType(name = "ScopeDefinition")
/*    */ @XmlEnum
/*    */ public enum ScopeDefinition
/*    */ {
/* 36 */   FIXED(
/* 37 */     "Fixed"),
/* 38 */   CONFIGURABLE("Configurable");
/*    */   private final String value;
/*    */   
/*    */   ScopeDefinition(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static ScopeDefinition fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     ScopeDefinition[] arrayOfScopeDefinition;
/* 50 */     for (i = (arrayOfScopeDefinition = values()).length, b = 0; b < i; ) { ScopeDefinition c = arrayOfScopeDefinition[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ScopeDefinition.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */