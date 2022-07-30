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
/*    */ @XmlType(name = "VideoEncodingMimeNames")
/*    */ @XmlEnum
/*    */ public enum VideoEncodingMimeNames
/*    */ {
/* 37 */   JPEG("JPEG"),
/* 38 */   MPV_4_ES(
/* 39 */     "MPV4-ES"),
/* 40 */   H_264(
/* 41 */     "H264"),
/* 42 */   H_265(
/* 43 */     "H265");
/*    */   private final String value;
/*    */   
/*    */   VideoEncodingMimeNames(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 51 */     return this.value; } public static VideoEncodingMimeNames fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     VideoEncodingMimeNames[] arrayOfVideoEncodingMimeNames;
/* 55 */     for (i = (arrayOfVideoEncodingMimeNames = values()).length, b = 0; b < i; ) { VideoEncodingMimeNames c = arrayOfVideoEncodingMimeNames[b];
/* 56 */       if (c.value.equals(v))
/* 57 */         return c; 
/*    */       b++; }
/*    */     
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\VideoEncodingMimeNames.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */