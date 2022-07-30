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
/*    */ @XmlType(name = "RelayMode")
/*    */ @XmlEnum
/*    */ public enum RelayMode
/*    */ {
/* 36 */   MONOSTABLE(
/* 37 */     "Monostable"),
/* 38 */   BISTABLE("Bistable");
/*    */   private final String value;
/*    */   
/*    */   RelayMode(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static RelayMode fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     RelayMode[] arrayOfRelayMode;
/* 50 */     for (i = (arrayOfRelayMode = values()).length, b = 0; b < i; ) { RelayMode c = arrayOfRelayMode[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\RelayMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */