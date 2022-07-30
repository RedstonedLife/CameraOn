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
/*    */ @XmlType(name = "PTZPresetTourState")
/*    */ @XmlEnum
/*    */ public enum PTZPresetTourState
/*    */ {
/* 38 */   IDLE(
/* 39 */     "Idle"),
/* 40 */   TOURING("Touring"),
/* 41 */   PAUSED("Paused"),
/* 42 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   PTZPresetTourState(String v) {
/* 46 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 50 */     return this.value; } public static PTZPresetTourState fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     PTZPresetTourState[] arrayOfPTZPresetTourState;
/* 54 */     for (i = (arrayOfPTZPresetTourState = values()).length, b = 0; b < i; ) { PTZPresetTourState c = arrayOfPTZPresetTourState[b];
/* 55 */       if (c.value.equals(v))
/* 56 */         return c; 
/*    */       b++; }
/*    */     
/* 59 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZPresetTourState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */