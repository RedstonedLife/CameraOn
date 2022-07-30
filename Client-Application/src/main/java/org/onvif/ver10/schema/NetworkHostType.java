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
/*    */ @XmlType(name = "NetworkHostType")
/*    */ @XmlEnum
/*    */ public enum NetworkHostType
/*    */ {
/* 37 */   I_PV_4(
/* 38 */     "IPv4"),
/* 39 */   I_PV_6("IPv6"), DNS("DNS");
/*    */   private final String value;
/*    */   
/*    */   NetworkHostType(String v) {
/* 43 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 47 */     return this.value; } public static NetworkHostType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     NetworkHostType[] arrayOfNetworkHostType;
/* 51 */     for (i = (arrayOfNetworkHostType = values()).length, b = 0; b < i; ) { NetworkHostType c = arrayOfNetworkHostType[b];
/* 52 */       if (c.value.equals(v))
/* 53 */         return c; 
/*    */       b++; }
/*    */     
/* 56 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\NetworkHostType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */