/*    */ package org.oasis_open.docs.wsn.b_2;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlSchemaType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.datatype.XMLGregorianCalendar;
/*    */ import org.oasis_open.docs.wsrf.bf_2.BaseFaultType;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "UnacceptableInitialTerminationTimeFaultType", propOrder = {"minimumTime", "maximumTime"})
/*    */ public class UnacceptableInitialTerminationTimeFaultType
/*    */   extends BaseFaultType
/*    */ {
/*    */   @XmlElement(name = "MinimumTime", required = true)
/*    */   @XmlSchemaType(name = "dateTime")
/*    */   protected XMLGregorianCalendar minimumTime;
/*    */   @XmlElement(name = "MaximumTime")
/*    */   @XmlSchemaType(name = "dateTime")
/*    */   protected XMLGregorianCalendar maximumTime;
/*    */   
/*    */   public XMLGregorianCalendar getMinimumTime() {
/* 59 */     return this.minimumTime;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setMinimumTime(XMLGregorianCalendar value) {
/* 70 */     this.minimumTime = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public XMLGregorianCalendar getMaximumTime() {
/* 80 */     return this.maximumTime;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setMaximumTime(XMLGregorianCalendar value) {
/* 91 */     this.maximumTime = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\oasis_open\docs\wsn\b_2\UnacceptableInitialTerminationTimeFaultType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */