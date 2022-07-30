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
/*    */ @XmlType(name = "DiscoveryMode")
/*    */ @XmlEnum
/*    */ public enum DiscoveryMode
/*    */ {
/* 36 */   DISCOVERABLE(
/* 37 */     "Discoverable"),
/* 38 */   NON_DISCOVERABLE("NonDiscoverable");
/*    */   private final String value;
/*    */   
/*    */   DiscoveryMode(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static DiscoveryMode fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     DiscoveryMode[] arrayOfDiscoveryMode;
/* 50 */     for (i = (arrayOfDiscoveryMode = values()).length, b = 0; b < i; ) { DiscoveryMode c = arrayOfDiscoveryMode[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\DiscoveryMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */