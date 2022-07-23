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
/*    */ @XmlType(name = "PTZPresetTourOperation")
/*    */ @XmlEnum
/*    */ public enum PTZPresetTourOperation
/*    */ {
/* 38 */   START(
/* 39 */     "Start"),
/* 40 */   STOP("Stop"),
/* 41 */   PAUSE("Pause"),
/* 42 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   PTZPresetTourOperation(String v) {
/* 46 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 50 */     return this.value; } public static PTZPresetTourOperation fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     PTZPresetTourOperation[] arrayOfPTZPresetTourOperation;
/* 54 */     for (i = (arrayOfPTZPresetTourOperation = values()).length, b = 0; b < i; ) { PTZPresetTourOperation c = arrayOfPTZPresetTourOperation[b];
/* 55 */       if (c.value.equals(v))
/* 56 */         return c; 
/*    */       b++; }
/*    */     
/* 59 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZPresetTourOperation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */