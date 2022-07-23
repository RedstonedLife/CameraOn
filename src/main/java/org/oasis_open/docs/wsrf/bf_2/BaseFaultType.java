/*     */ package org.oasis_open.docs.wsrf.bf_2;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlMixed;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.XmlValue;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.oasis_open.docs.wsn.b_2.InvalidFilterFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.InvalidMessageContentExpressionFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.MultipleTopicsSpecifiedFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.NoCurrentMessageOnTopicFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.NotifyMessageNotSupportedFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.PauseFailedFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.ResumeFailedFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.SubscribeCreationFailedFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.TopicExpressionDialectUnknownFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.UnableToCreatePullPointFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.UnableToDestroyPullPointFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.UnableToDestroySubscriptionFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.UnableToGetMessagesFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.UnacceptableInitialTerminationTimeFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.UnacceptableTerminationTimeFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType;
/*     */ import org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType;
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
/*     */ @XmlType(name = "BaseFaultType", propOrder = {"any", "timestamp", "originator", "errorCode", "description", "faultCause"})
/*     */ @XmlSeeAlso({TopicExpressionDialectUnknownFaultType.class, UnableToGetMessagesFaultType.class, ResumeFailedFaultType.class, InvalidProducerPropertiesExpressionFaultType.class, SubscribeCreationFailedFaultType.class, UnableToDestroySubscriptionFaultType.class, UnrecognizedPolicyRequestFaultType.class, NotifyMessageNotSupportedFaultType.class, UnableToCreatePullPointFaultType.class, UnacceptableInitialTerminationTimeFaultType.class, InvalidTopicExpressionFaultType.class, UnsupportedPolicyRequestFaultType.class, PauseFailedFaultType.class, InvalidMessageContentExpressionFaultType.class, UnableToDestroyPullPointFaultType.class, MultipleTopicsSpecifiedFaultType.class, NoCurrentMessageOnTopicFaultType.class, InvalidFilterFaultType.class, TopicNotSupportedFaultType.class, UnacceptableTerminationTimeFaultType.class})
/*     */ public class BaseFaultType
/*     */ {
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   @XmlElement(name = "Timestamp", required = true)
/*     */   @XmlSchemaType(name = "dateTime")
/*     */   protected XMLGregorianCalendar timestamp;
/*     */   @XmlElement(name = "Originator")
/*     */   protected EndpointReferenceType originator;
/*     */   @XmlElement(name = "ErrorCode")
/*     */   protected ErrorCode errorCode;
/*     */   @XmlElement(name = "Description")
/*     */   protected List<Description> description;
/*     */   @XmlElement(name = "FaultCause")
/*     */   protected FaultCause faultCause;
/*     */   @XmlAnyAttribute
/* 129 */   private Map<QName, String> otherAttributes = new HashMap<>();
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
/*     */   public List<Object> getAny() {
/* 152 */     if (this.any == null) {
/* 153 */       this.any = new ArrayList();
/*     */     }
/* 155 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public XMLGregorianCalendar getTimestamp() {
/* 165 */     return this.timestamp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTimestamp(XMLGregorianCalendar value) {
/* 176 */     this.timestamp = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EndpointReferenceType getOriginator() {
/* 186 */     return this.originator;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOriginator(EndpointReferenceType value) {
/* 197 */     this.originator = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ErrorCode getErrorCode() {
/* 207 */     return this.errorCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setErrorCode(ErrorCode value) {
/* 218 */     this.errorCode = value;
/*     */   }
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
/*     */   public List<Description> getDescription() {
/* 242 */     if (this.description == null) {
/* 243 */       this.description = new ArrayList<>();
/*     */     }
/* 245 */     return this.description;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FaultCause getFaultCause() {
/* 255 */     return this.faultCause;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFaultCause(FaultCause value) {
/* 266 */     this.faultCause = value;
/*     */   }
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
/*     */   public Map<QName, String> getOtherAttributes() {
/* 281 */     return this.otherAttributes;
/*     */   }
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
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name = "", propOrder = {"value"})
/*     */   public static class Description
/*     */   {
/*     */     @XmlValue
/*     */     protected String value;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
/*     */     protected String lang;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getValue() {
/* 319 */       return this.value;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setValue(String value) {
/* 330 */       this.value = value;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getLang() {
/* 340 */       return this.lang;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setLang(String value) {
/* 351 */       this.lang = value;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name = "", propOrder = {"content"})
/*     */   public static class ErrorCode
/*     */   {
/*     */     @XmlMixed
/*     */     @XmlAnyElement
/*     */     protected List<Object> content;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @XmlAttribute(name = "dialect", required = true)
/*     */     @XmlSchemaType(name = "anyURI")
/*     */     protected String dialect;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @XmlAnyAttribute
/*     */     private Map<QName, String> otherAttributes;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public ErrorCode() {
/* 387 */       this.otherAttributes = new HashMap<>();
/*     */     }
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
/*     */     public List<Object> getContent() {
/* 410 */       if (this.content == null) {
/* 411 */         this.content = new ArrayList();
/*     */       }
/* 413 */       return this.content;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getDialect() {
/* 423 */       return this.dialect;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setDialect(String value) {
/* 434 */       this.dialect = value;
/*     */     }
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
/*     */     public Map<QName, String> getOtherAttributes() {
/* 449 */       return this.otherAttributes;
/*     */     }
/*     */   }
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
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name = "", propOrder = {"any"})
/*     */   public static class FaultCause
/*     */   {
/*     */     @XmlAnyElement(lax = true)
/*     */     protected Object any;
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
/*     */     public Object getAny() {
/* 489 */       return this.any;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setAny(Object value) {
/* 500 */       this.any = value;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\oasis_open\docs\wsrf\bf_2\BaseFaultType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */