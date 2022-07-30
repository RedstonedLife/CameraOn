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
/*    */ 
/*    */ 
/*    */ @XmlType(name = "VideoEncodingProfiles")
/*    */ @XmlEnum
/*    */ public enum VideoEncodingProfiles
/*    */ {
/* 40 */   SIMPLE(
/* 41 */     "Simple"),
/* 42 */   ADVANCED_SIMPLE(
/* 43 */     "AdvancedSimple"),
/* 44 */   BASELINE(
/* 45 */     "Baseline"),
/* 46 */   MAIN(
/* 47 */     "Main"),
/* 48 */   MAIN_10(
/* 49 */     "Main10"),
/* 50 */   EXTENDED(
/* 51 */     "Extended"),
/* 52 */   HIGH(
/* 53 */     "High");
/*    */   private final String value;
/*    */   
/*    */   VideoEncodingProfiles(String v) {
/* 57 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 61 */     return this.value; } public static VideoEncodingProfiles fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     VideoEncodingProfiles[] arrayOfVideoEncodingProfiles;
/* 65 */     for (i = (arrayOfVideoEncodingProfiles = values()).length, b = 0; b < i; ) { VideoEncodingProfiles c = arrayOfVideoEncodingProfiles[b];
/* 66 */       if (c.value.equals(v))
/* 67 */         return c; 
/*    */       b++; }
/*    */     
/* 70 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\VideoEncodingProfiles.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */