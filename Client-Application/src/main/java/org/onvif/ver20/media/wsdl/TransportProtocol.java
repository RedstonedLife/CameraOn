/*    */ package org.onvif.ver20.media.wsdl;
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
/*    */ @XmlType(name = "TransportProtocol")
/*    */ @XmlEnum
/*    */ public enum TransportProtocol
/*    */ {
/* 37 */   RTSP_UNICAST(
/* 38 */     "RtspUnicast"),
/* 39 */   RTSP_MULTICAST(
/* 40 */     "RtspMulticast"),
/* 41 */   RTSP("RTSP"),
/* 42 */   RTSP_OVER_HTTP(
/* 43 */     "RtspOverHttp");
/*    */   private final String value;
/*    */   
/*    */   TransportProtocol(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 51 */     return this.value; } public static TransportProtocol fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     TransportProtocol[] arrayOfTransportProtocol;
/* 55 */     for (i = (arrayOfTransportProtocol = values()).length, b = 0; b < i; ) { TransportProtocol c = arrayOfTransportProtocol[b];
/* 56 */       if (c.value.equals(v))
/* 57 */         return c; 
/*    */       b++; }
/*    */     
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\media\wsdl\TransportProtocol.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */