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
/*    */ @XmlType(name = "ReceiverMode")
/*    */ @XmlEnum
/*    */ public enum ReceiverMode
/*    */ {
/* 38 */   AUTO_CONNECT(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 43 */     "AutoConnect"),
/*    */   
/* 45 */   ALWAYS_CONNECT(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     "AlwaysConnect"),
/*    */   
/* 52 */   NEVER_CONNECT(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     "NeverConnect"),
/*    */   
/* 59 */   UNKNOWN(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 64 */     "Unknown");
/*    */   private final String value;
/*    */   
/*    */   ReceiverMode(String v) {
/* 68 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 72 */     return this.value; } public static ReceiverMode fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     ReceiverMode[] arrayOfReceiverMode;
/* 76 */     for (i = (arrayOfReceiverMode = values()).length, b = 0; b < i; ) { ReceiverMode c = arrayOfReceiverMode[b];
/* 77 */       if (c.value.equals(v))
/* 78 */         return c; 
/*    */       b++; }
/*    */     
/* 81 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ReceiverMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */