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
/*    */ @XmlType(name = "IPv6DHCPConfiguration")
/*    */ @XmlEnum
/*    */ public enum IPv6DHCPConfiguration
/*    */ {
/* 38 */   AUTO(
/* 39 */     "Auto"),
/* 40 */   STATEFUL("Stateful"),
/* 41 */   STATELESS("Stateless"),
/* 42 */   OFF("Off");
/*    */   private final String value;
/*    */   
/*    */   IPv6DHCPConfiguration(String v) {
/* 46 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 50 */     return this.value; } public static IPv6DHCPConfiguration fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     IPv6DHCPConfiguration[] arrayOfIPv6DHCPConfiguration;
/* 54 */     for (i = (arrayOfIPv6DHCPConfiguration = values()).length, b = 0; b < i; ) { IPv6DHCPConfiguration c = arrayOfIPv6DHCPConfiguration[b];
/* 55 */       if (c.value.equals(v))
/* 56 */         return c; 
/*    */       b++; }
/*    */     
/* 59 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\IPv6DHCPConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */