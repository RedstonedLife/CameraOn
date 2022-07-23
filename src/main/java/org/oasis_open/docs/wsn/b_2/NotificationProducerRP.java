/*     */ package org.oasis_open.docs.wsn.b_2;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "", propOrder = {"topicExpression", "fixedTopicSet", "topicExpressionDialect", "topicSet"})
/*     */ @XmlRootElement(name = "NotificationProducerRP")
/*     */ public class NotificationProducerRP
/*     */ {
/*     */   @XmlElement(name = "TopicExpression")
/*     */   protected List<TopicExpressionType> topicExpression;
/*     */   @XmlElement(name = "FixedTopicSet", defaultValue = "true")
/*     */   protected Boolean fixedTopicSet;
/*     */   @XmlElement(name = "TopicExpressionDialect")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected List<String> topicExpressionDialect;
/*     */   @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/t-1")
/*     */   protected TopicSetType topicSet;
/*     */   
/*     */   public List<TopicExpressionType> getTopicExpression() {
/*  80 */     if (this.topicExpression == null) {
/*  81 */       this.topicExpression = new ArrayList<>();
/*     */     }
/*  83 */     return this.topicExpression;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isFixedTopicSet() {
/*  93 */     return this.fixedTopicSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFixedTopicSet(Boolean value) {
/* 104 */     this.fixedTopicSet = value;
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
/*     */   public List<String> getTopicExpressionDialect() {
/* 128 */     if (this.topicExpressionDialect == null) {
/* 129 */       this.topicExpressionDialect = new ArrayList<>();
/*     */     }
/* 131 */     return this.topicExpressionDialect;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TopicSetType getTopicSet() {
/* 141 */     return this.topicSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTopicSet(TopicSetType value) {
/* 152 */     this.topicSet = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\oasis_open\docs\wsn\b_2\NotificationProducerRP.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */