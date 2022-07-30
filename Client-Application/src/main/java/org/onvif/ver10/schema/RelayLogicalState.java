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
/*    */ @XmlType(name = "RelayLogicalState")
/*    */ @XmlEnum
/*    */ public enum RelayLogicalState
/*    */ {
/* 36 */   ACTIVE(
/* 37 */     "active"),
/* 38 */   INACTIVE("inactive");
/*    */   private final String value;
/*    */   
/*    */   RelayLogicalState(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static RelayLogicalState fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     RelayLogicalState[] arrayOfRelayLogicalState;
/* 50 */     for (i = (arrayOfRelayLogicalState = values()).length, b = 0; b < i; ) { RelayLogicalState c = arrayOfRelayLogicalState[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\RelayLogicalState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */