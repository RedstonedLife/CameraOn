/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
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
/*    */ @XmlType(name = "TransportProtocol")
/*    */ @XmlEnum
/*    */ public enum TransportProtocol
/*    */ {
/* 37 */   UDP, TCP, RTSP, HTTP;
/*    */   
/*    */   public String value() {
/* 40 */     return name();
/*    */   }
/*    */   
/*    */   public static TransportProtocol fromValue(String v) {
/* 44 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\TransportProtocol.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */