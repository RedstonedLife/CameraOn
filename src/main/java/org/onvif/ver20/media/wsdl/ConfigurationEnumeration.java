/*    */ package org.onvif.ver20.media.wsdl;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlType(name = "ConfigurationEnumeration")
/*    */ @XmlEnum
/*    */ public enum ConfigurationEnumeration
/*    */ {
/* 43 */   ALL(
/* 44 */     "All"),
/* 45 */   VIDEO_SOURCE(
/* 46 */     "VideoSource"),
/* 47 */   VIDEO_ENCODER(
/* 48 */     "VideoEncoder"),
/* 49 */   AUDIO_SOURCE(
/* 50 */     "AudioSource"),
/* 51 */   AUDIO_ENCODER(
/* 52 */     "AudioEncoder"),
/* 53 */   AUDIO_OUTPUT(
/* 54 */     "AudioOutput"),
/* 55 */   AUDIO_DECODER(
/* 56 */     "AudioDecoder"),
/* 57 */   METADATA(
/* 58 */     "Metadata"),
/* 59 */   ANALYTICS(
/* 60 */     "Analytics"),
/* 61 */   PTZ("PTZ");
/*    */   private final String value;
/*    */   
/*    */   ConfigurationEnumeration(String v) {
/* 65 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 69 */     return this.value; } public static ConfigurationEnumeration fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     ConfigurationEnumeration[] arrayOfConfigurationEnumeration;
/* 73 */     for (i = (arrayOfConfigurationEnumeration = values()).length, b = 0; b < i; ) { ConfigurationEnumeration c = arrayOfConfigurationEnumeration[b];
/* 74 */       if (c.value.equals(v))
/* 75 */         return c; 
/*    */       b++; }
/*    */     
/* 78 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\media\wsdl\ConfigurationEnumeration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */