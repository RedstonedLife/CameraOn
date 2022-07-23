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
/*    */ @XmlType(name = "DynamicDNSType")
/*    */ @XmlEnum
/*    */ public enum DynamicDNSType
/*    */ {
/* 37 */   NO_UPDATE(
/* 38 */     "NoUpdate"),
/* 39 */   CLIENT_UPDATES("ClientUpdates"),
/* 40 */   SERVER_UPDATES("ServerUpdates");
/*    */   private final String value;
/*    */   
/*    */   DynamicDNSType(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value; } public static DynamicDNSType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     DynamicDNSType[] arrayOfDynamicDNSType;
/* 52 */     for (i = (arrayOfDynamicDNSType = values()).length, b = 0; b < i; ) { DynamicDNSType c = arrayOfDynamicDNSType[b];
/* 53 */       if (c.value.equals(v))
/* 54 */         return c; 
/*    */       b++; }
/*    */     
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\DynamicDNSType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */