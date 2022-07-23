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
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlType(name = "CapabilityCategory")
/*    */ @XmlEnum
/*    */ public enum CapabilityCategory
/*    */ {
/* 41 */   ALL(
/* 42 */     "All"),
/* 43 */   ANALYTICS("Analytics"),
/* 44 */   DEVICE("Device"),
/* 45 */   EVENTS("Events"),
/* 46 */   IMAGING("Imaging"),
/* 47 */   MEDIA("Media"), PTZ("PTZ");
/*    */   private final String value;
/*    */   
/*    */   CapabilityCategory(String v) {
/* 51 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 55 */     return this.value; } public static CapabilityCategory fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     CapabilityCategory[] arrayOfCapabilityCategory;
/* 59 */     for (i = (arrayOfCapabilityCategory = values()).length, b = 0; b < i; ) { CapabilityCategory c = arrayOfCapabilityCategory[b];
/* 60 */       if (c.value.equals(v))
/* 61 */         return c; 
/*    */       b++; }
/*    */     
/* 64 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\CapabilityCategory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */