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
/*    */ @XmlType(name = "StreamType")
/*    */ @XmlEnum
/*    */ public enum StreamType
/*    */ {
/* 36 */   RTP_UNICAST(
/* 37 */     "RTP-Unicast"),
/* 38 */   RTP_MULTICAST("RTP-Multicast");
/*    */   private final String value;
/*    */   
/*    */   StreamType(String v) {
/* 42 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 46 */     return this.value; } public static StreamType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     StreamType[] arrayOfStreamType;
/* 50 */     for (i = (arrayOfStreamType = values()).length, b = 0; b < i; ) { StreamType c = arrayOfStreamType[b];
/* 51 */       if (c.value.equals(v))
/* 52 */         return c; 
/*    */       b++; }
/*    */     
/* 55 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\StreamType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */