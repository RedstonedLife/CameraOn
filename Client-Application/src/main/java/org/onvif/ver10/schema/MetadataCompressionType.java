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
/*    */ @XmlType(name = "MetadataCompressionType")
/*    */ @XmlEnum
/*    */ public enum MetadataCompressionType
/*    */ {
/* 36 */   NONE(
/* 37 */     "None"),
/* 38 */   GZIP("GZIP"),
/* 39 */   EXI("EXI");
/*    */   private final String value;
/*    */   
/*    */   MetadataCompressionType(String v) {
/* 43 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 47 */     return this.value; } public static MetadataCompressionType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     MetadataCompressionType[] arrayOfMetadataCompressionType;
/* 51 */     for (i = (arrayOfMetadataCompressionType = values()).length, b = 0; b < i; ) { MetadataCompressionType c = arrayOfMetadataCompressionType[b];
/* 52 */       if (c.value.equals(v))
/* 53 */         return c; 
/*    */       b++; }
/*    */     
/* 56 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\MetadataCompressionType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */