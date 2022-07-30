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
/*    */ @XmlType(name = "AudioEncodingMimeNames")
/*    */ @XmlEnum
/*    */ public enum AudioEncodingMimeNames
/*    */ {
/* 36 */   PCMU("PCMU"),
/* 37 */   G_726(
/* 38 */     "G726"),
/* 39 */   MP_4_A_LATM(
/* 40 */     "MP4A-LATM");
/*    */   private final String value;
/*    */   
/*    */   AudioEncodingMimeNames(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value; } public static AudioEncodingMimeNames fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     AudioEncodingMimeNames[] arrayOfAudioEncodingMimeNames;
/* 52 */     for (i = (arrayOfAudioEncodingMimeNames = values()).length, b = 0; b < i; ) { AudioEncodingMimeNames c = arrayOfAudioEncodingMimeNames[b];
/* 53 */       if (c.value.equals(v))
/* 54 */         return c; 
/*    */       b++; }
/*    */     
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\AudioEncodingMimeNames.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */