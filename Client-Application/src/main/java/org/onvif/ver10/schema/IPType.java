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
/*    */ @XmlType(name = "IPType")
/*    */ @XmlEnum
/*    */ public enum IPType
/*    */ {
/* 36 */   I_PV_4(
/* 37 */     "IPv4"),
/* 38 */   I_PV_6("IPv6");
/*    */   private final String value;
/*    */   
/*    */   IPType(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static IPType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     IPType[] arrayOfIPType;
/* 50 */     for (i = (arrayOfIPType = values()).length, b = 0; b < i; ) { IPType c = arrayOfIPType[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\IPType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */