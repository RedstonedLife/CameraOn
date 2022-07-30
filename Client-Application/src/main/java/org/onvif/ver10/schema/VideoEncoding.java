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
/*    */ @XmlType(name = "VideoEncoding")
/*    */ @XmlEnum
/*    */ public enum VideoEncoding
/*    */ {
/* 37 */   JPEG("JPEG"),
/* 38 */   MPEG_4("MPEG4"),
/* 39 */   H_264("H264");
/*    */   private final String value;
/*    */   
/*    */   VideoEncoding(String v) {
/* 43 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 47 */     return this.value; } public static VideoEncoding fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     VideoEncoding[] arrayOfVideoEncoding;
/* 51 */     for (i = (arrayOfVideoEncoding = values()).length, b = 0; b < i; ) { VideoEncoding c = arrayOfVideoEncoding[b];
/* 52 */       if (c.value.equals(v))
/* 53 */         return c; 
/*    */       b++; }
/*    */     
/* 56 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\VideoEncoding.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */