/*     */ package org.oasis_open.docs.wsn.b_2;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ import org.w3._2005._08.addressing.EndpointReferenceType;
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
/*     */ @XmlType(name = "", propOrder = {"consumerReference", "filter", "subscriptionPolicy", "creationTime"})
/*     */ @XmlRootElement(name = "SubscriptionManagerRP")
/*     */ public class SubscriptionManagerRP
/*     */ {
/*     */   @XmlElement(name = "ConsumerReference", required = true)
/*     */   protected EndpointReferenceType consumerReference;
/*     */   @XmlElement(name = "Filter")
/*     */   protected FilterType filter;
/*     */   @XmlElement(name = "SubscriptionPolicy")
/*     */   protected SubscriptionPolicyType subscriptionPolicy;
/*     */   @XmlElement(name = "CreationTime")
/*     */   @XmlSchemaType(name = "dateTime")
/*     */   protected XMLGregorianCalendar creationTime;
/*     */   
/*     */   public EndpointReferenceType getConsumerReference() {
/*  65 */     return this.consumerReference;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setConsumerReference(EndpointReferenceType value) {
/*  76 */     this.consumerReference = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FilterType getFilter() {
/*  86 */     return this.filter;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFilter(FilterType value) {
/*  97 */     this.filter = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SubscriptionPolicyType getSubscriptionPolicy() {
/* 107 */     return this.subscriptionPolicy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSubscriptionPolicy(SubscriptionPolicyType value) {
/* 118 */     this.subscriptionPolicy = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public XMLGregorianCalendar getCreationTime() {
/* 128 */     return this.creationTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreationTime(XMLGregorianCalendar value) {
/* 139 */     this.creationTime = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\oasis_open\docs\wsn\b_2\SubscriptionManagerRP.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */