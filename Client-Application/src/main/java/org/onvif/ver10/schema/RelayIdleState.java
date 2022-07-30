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
/*    */ @XmlType(name = "RelayIdleState")
/*    */ @XmlEnum
/*    */ public enum RelayIdleState
/*    */ {
/* 36 */   CLOSED(
/* 37 */     "closed"),
/* 38 */   OPEN("open");
/*    */   private final String value;
/*    */   
/*    */   RelayIdleState(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static RelayIdleState fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     RelayIdleState[] arrayOfRelayIdleState;
/* 50 */     for (i = (arrayOfRelayIdleState = values()).length, b = 0; b < i; ) { RelayIdleState c = arrayOfRelayIdleState[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\RelayIdleState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */