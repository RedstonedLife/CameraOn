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
/*    */ @XmlType(name = "H264Profile")
/*    */ @XmlEnum
/*    */ public enum H264Profile
/*    */ {
/* 38 */   BASELINE(
/* 39 */     "Baseline"),
/* 40 */   MAIN("Main"),
/* 41 */   EXTENDED("Extended"),
/* 42 */   HIGH("High");
/*    */   private final String value;
/*    */   
/*    */   H264Profile(String v) {
/* 46 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 50 */     return this.value; } public static H264Profile fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     H264Profile[] arrayOfH264Profile;
/* 54 */     for (i = (arrayOfH264Profile = values()).length, b = 0; b < i; ) { H264Profile c = arrayOfH264Profile[b];
/* 55 */       if (c.value.equals(v))
/* 56 */         return c; 
/*    */       b++; }
/*    */     
/* 59 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\H264Profile.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */