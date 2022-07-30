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
/*    */ @XmlType(name = "IPAddressFilterType")
/*    */ @XmlEnum
/*    */ public enum IPAddressFilterType
/*    */ {
/* 36 */   ALLOW(
/* 37 */     "Allow"),
/* 38 */   DENY("Deny");
/*    */   private final String value;
/*    */   
/*    */   IPAddressFilterType(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static IPAddressFilterType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     IPAddressFilterType[] arrayOfIPAddressFilterType;
/* 50 */     for (i = (arrayOfIPAddressFilterType = values()).length, b = 0; b < i; ) { IPAddressFilterType c = arrayOfIPAddressFilterType[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\IPAddressFilterType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */