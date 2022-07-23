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
/*    */ 
/*    */ 
/*    */ @XmlType(name = "RecordingStatus")
/*    */ @XmlEnum
/*    */ public enum RecordingStatus
/*    */ {
/* 40 */   INITIATED(
/* 41 */     "Initiated"),
/* 42 */   RECORDING("Recording"),
/* 43 */   STOPPED("Stopped"),
/* 44 */   REMOVING("Removing"),
/* 45 */   REMOVED("Removed"),
/*    */   
/* 47 */   UNKNOWN(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     "Unknown");
/*    */   private final String value;
/*    */   
/*    */   RecordingStatus(String v) {
/* 56 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 60 */     return this.value; } public static RecordingStatus fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     RecordingStatus[] arrayOfRecordingStatus;
/* 64 */     for (i = (arrayOfRecordingStatus = values()).length, b = 0; b < i; ) { RecordingStatus c = arrayOfRecordingStatus[b];
/* 65 */       if (c.value.equals(v))
/* 66 */         return c; 
/*    */       b++; }
/*    */     
/* 69 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\RecordingStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */