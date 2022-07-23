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
/*    */ @XmlType(name = "ExposurePriority")
/*    */ @XmlEnum
/*    */ public enum ExposurePriority
/*    */ {
/* 36 */   LOW_NOISE(
/* 37 */     "LowNoise"),
/* 38 */   FRAME_RATE("FrameRate");
/*    */   private final String value;
/*    */   
/*    */   ExposurePriority(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static ExposurePriority fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     ExposurePriority[] arrayOfExposurePriority;
/* 50 */     for (i = (arrayOfExposurePriority = values()).length, b = 0; b < i; ) { ExposurePriority c = arrayOfExposurePriority[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ExposurePriority.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */