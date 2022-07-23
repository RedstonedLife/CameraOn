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
/*    */ @XmlType(name = "ImageStabilizationMode")
/*    */ @XmlEnum
/*    */ public enum ImageStabilizationMode
/*    */ {
/* 38 */   OFF("OFF"), ON("ON"), AUTO("AUTO"),
/* 39 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   ImageStabilizationMode(String v) {
/* 43 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 47 */     return this.value; } public static ImageStabilizationMode fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     ImageStabilizationMode[] arrayOfImageStabilizationMode;
/* 51 */     for (i = (arrayOfImageStabilizationMode = values()).length, b = 0; b < i; ) { ImageStabilizationMode c = arrayOfImageStabilizationMode[b];
/* 52 */       if (c.value.equals(v))
/* 53 */         return c; 
/*    */       b++; }
/*    */     
/* 56 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ImageStabilizationMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */