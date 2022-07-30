/*     */ package org.onvif.ver10.events.wsdl;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.oasis_open.docs.wsn.t_1.TopicSetType;
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
/*     */ @XmlType(name = "", propOrder = {"topicNamespaceLocation", "fixedTopicSet", "topicSet", "topicExpressionDialect", "messageContentFilterDialect", "producerPropertiesFilterDialect", "messageContentSchemaLocation", "any"})
/*     */ @XmlRootElement(name = "GetEventPropertiesResponse")
/*     */ public class GetEventPropertiesResponse
/*     */ {
/*     */   @XmlElement(name = "TopicNamespaceLocation", required = true)
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected List<String> topicNamespaceLocation;
/*     */   @XmlElement(name = "FixedTopicSet", namespace = "http://docs.oasis-open.org/wsn/b-2", defaultValue = "true")
/*     */   protected boolean fixedTopicSet;
/*     */   @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/t-1", required = true)
/*     */   protected TopicSetType topicSet;
/*     */   @XmlElement(name = "TopicExpressionDialect", namespace = "http://docs.oasis-open.org/wsn/b-2", required = true)
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected List<String> topicExpressionDialect;
/*     */   @XmlElement(name = "MessageContentFilterDialect", required = true)
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected List<String> messageContentFilterDialect;
/*     */   @XmlElement(name = "ProducerPropertiesFilterDialect")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected List<String> producerPropertiesFilterDialect;
/*     */   @XmlElement(name = "MessageContentSchemaLocation", required = true)
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected List<String> messageContentSchemaLocation;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   
/*     */   public List<String> getTopicNamespaceLocation() {
/* 108 */     if (this.topicNamespaceLocation == null) {
/* 109 */       this.topicNamespaceLocation = new ArrayList<>();
/*     */     }
/* 111 */     return this.topicNamespaceLocation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFixedTopicSet() {
/* 119 */     return this.fixedTopicSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFixedTopicSet(boolean value) {
/* 127 */     this.fixedTopicSet = value;
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
/*     */   public TopicSetType getTopicSet() {
/* 139 */     return this.topicSet;
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
/*     */   public void setTopicSet(TopicSetType value) {
/* 151 */     this.topicSet = value;
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
/*     */   public List<String> getTopicExpressionDialect() {
/* 188 */     if (this.topicExpressionDialect == null) {
/* 189 */       this.topicExpressionDialect = new ArrayList<>();
/*     */     }
/* 191 */     return this.topicExpressionDialect;
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
/*     */ 
/*     */   
/*     */   public List<String> getMessageContentFilterDialect() {
/* 217 */     if (this.messageContentFilterDialect == null) {
/* 218 */       this.messageContentFilterDialect = new ArrayList<>();
/*     */     }
/* 220 */     return this.messageContentFilterDialect;
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
/*     */ 
/*     */   
/*     */   public List<String> getProducerPropertiesFilterDialect() {
/* 246 */     if (this.producerPropertiesFilterDialect == null) {
/* 247 */       this.producerPropertiesFilterDialect = new ArrayList<>();
/*     */     }
/* 249 */     return this.producerPropertiesFilterDialect;
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
/*     */ 
/*     */   
/*     */   public List<String> getMessageContentSchemaLocation() {
/* 275 */     if (this.messageContentSchemaLocation == null) {
/* 276 */       this.messageContentSchemaLocation = new ArrayList<>();
/*     */     }
/* 278 */     return this.messageContentSchemaLocation;
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
/*     */ 
/*     */   
/*     */   public List<Object> getAny() {
/* 304 */     if (this.any == null) {
/* 305 */       this.any = new ArrayList();
/*     */     }
/* 307 */     return this.any;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\events\wsdl\GetEventPropertiesResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */