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
/*    */ @XmlType(name = "PTZPresetTourDirection")
/*    */ @XmlEnum
/*    */ public enum PTZPresetTourDirection
/*    */ {
/* 37 */   FORWARD(
/* 38 */     "Forward"),
/* 39 */   BACKWARD("Backward"),
/* 40 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   PTZPresetTourDirection(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value; } public static PTZPresetTourDirection fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     PTZPresetTourDirection[] arrayOfPTZPresetTourDirection;
/* 52 */     for (i = (arrayOfPTZPresetTourDirection = values()).length, b = 0; b < i; ) { PTZPresetTourDirection c = arrayOfPTZPresetTourDirection[b];
/* 53 */       if (c.value.equals(v))
/* 54 */         return c; 
/*    */       b++; }
/*    */     
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZPresetTourDirection.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */