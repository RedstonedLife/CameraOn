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
/*    */ @XmlType(name = "TrackType")
/*    */ @XmlEnum
/*    */ public enum TrackType
/*    */ {
/* 38 */   VIDEO(
/* 39 */     "Video"),
/* 40 */   AUDIO("Audio"),
/* 41 */   METADATA("Metadata"),
/*    */   
/* 43 */   EXTENDED(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 48 */     "Extended");
/*    */   private final String value;
/*    */   
/*    */   TrackType(String v) {
/* 52 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 56 */     return this.value; } public static TrackType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     TrackType[] arrayOfTrackType;
/* 60 */     for (i = (arrayOfTrackType = values()).length, b = 0; b < i; ) { TrackType c = arrayOfTrackType[b];
/* 61 */       if (c.value.equals(v))
/* 62 */         return c; 
/*    */       b++; }
/*    */     
/* 65 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\TrackType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */