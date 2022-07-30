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
/*    */ @XmlType(name = "ReceiverState")
/*    */ @XmlEnum
/*    */ public enum ReceiverState
/*    */ {
/* 38 */   NOT_CONNECTED(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 43 */     "NotConnected"),
/*    */   
/* 45 */   CONNECTING(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     "Connecting"),
/*    */   
/* 52 */   CONNECTED(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     "Connected"),
/*    */   
/* 59 */   UNKNOWN(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 64 */     "Unknown");
/*    */   private final String value;
/*    */   
/*    */   ReceiverState(String v) {
/* 68 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 72 */     return this.value; } public static ReceiverState fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     ReceiverState[] arrayOfReceiverState;
/* 76 */     for (i = (arrayOfReceiverState = values()).length, b = 0; b < i; ) { ReceiverState c = arrayOfReceiverState[b];
/* 77 */       if (c.value.equals(v))
/* 78 */         return c; 
/*    */       b++; }
/*    */     
/* 81 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ReceiverState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */