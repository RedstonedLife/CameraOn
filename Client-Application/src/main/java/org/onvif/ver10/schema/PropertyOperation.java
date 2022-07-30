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
/*    */ @XmlType(name = "PropertyOperation")
/*    */ @XmlEnum
/*    */ public enum PropertyOperation
/*    */ {
/* 37 */   INITIALIZED(
/* 38 */     "Initialized"),
/* 39 */   DELETED("Deleted"),
/* 40 */   CHANGED("Changed");
/*    */   private final String value;
/*    */   
/*    */   PropertyOperation(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value; } public static PropertyOperation fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     PropertyOperation[] arrayOfPropertyOperation;
/* 52 */     for (i = (arrayOfPropertyOperation = values()).length, b = 0; b < i; ) { PropertyOperation c = arrayOfPropertyOperation[b];
/* 53 */       if (c.value.equals(v))
/* 54 */         return c; 
/*    */       b++; }
/*    */     
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PropertyOperation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */