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
/*    */ @XmlType(name = "AudioEncoding")
/*    */ @XmlEnum
/*    */ public enum AudioEncoding
/*    */ {
/* 37 */   G_711(
/* 38 */     "G711"),
/* 39 */   G_726("G726"), AAC("AAC");
/*    */   private final String value;
/*    */   
/*    */   AudioEncoding(String v) {
/* 43 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 47 */     return this.value; } public static AudioEncoding fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     AudioEncoding[] arrayOfAudioEncoding;
/* 51 */     for (i = (arrayOfAudioEncoding = values()).length, b = 0; b < i; ) { AudioEncoding c = arrayOfAudioEncoding[b];
/* 52 */       if (c.value.equals(v))
/* 53 */         return c; 
/*    */       b++; }
/*    */     
/* 56 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\AudioEncoding.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */