/*     */ package org.onvif.ver10.device.wsdl;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.onvif.ver10.schema.DateTime;
/*     */ import org.onvif.ver10.schema.SetDateTimeType;
/*     */ import org.onvif.ver10.schema.TimeZone;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "", propOrder = {"dateTimeType", "daylightSavings", "timeZone", "utcDateTime"})
/*     */ @XmlRootElement(name = "SetSystemDateAndTime")
/*     */ public class SetSystemDateAndTime
/*     */ {
/*     */   @XmlElement(name = "DateTimeType", required = true)
/*     */   protected SetDateTimeType dateTimeType;
/*     */   @XmlElement(name = "DaylightSavings")
/*     */   protected boolean daylightSavings;
/*     */   @XmlElement(name = "TimeZone")
/*     */   protected TimeZone timeZone;
/*     */   @XmlElement(name = "UTCDateTime")
/*     */   protected DateTime utcDateTime;
/*     */   
/*     */   public SetDateTimeType getDateTimeType() {
/*  64 */     return this.dateTimeType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDateTimeType(SetDateTimeType value) {
/*  75 */     this.dateTimeType = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDaylightSavings() {
/*  83 */     return this.daylightSavings;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDaylightSavings(boolean value) {
/*  91 */     this.daylightSavings = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZone getTimeZone() {
/* 101 */     return this.timeZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTimeZone(TimeZone value) {
/* 112 */     this.timeZone = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateTime getUTCDateTime() {
/* 122 */     return this.utcDateTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUTCDateTime(DateTime value) {
/* 133 */     this.utcDateTime = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SetSystemDateAndTime.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */