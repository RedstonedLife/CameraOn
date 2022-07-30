/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlElements;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.namespace.QName;
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
/*    */ @XmlType(name = "MetadataStream", propOrder = {"videoAnalyticsOrPTZOrEvent"})
/*    */ public class MetadataStream
/*    */ {
/*    */   @XmlElements({@XmlElement(name = "VideoAnalytics", type = VideoAnalyticsStream.class), @XmlElement(name = "PTZ", type = PTZStream.class), @XmlElement(name = "Event", type = EventStream.class), @XmlElement(name = "Extension", type = MetadataStreamExtension.class)})
/*    */   protected List<java.lang.Object> videoAnalyticsOrPTZOrEvent;
/*    */   @XmlAnyAttribute
/* 57 */   private Map<QName, String> otherAttributes = new HashMap<>();
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
/*    */   public List<java.lang.Object> getVideoAnalyticsOrPTZOrEvent() {
/* 80 */     if (this.videoAnalyticsOrPTZOrEvent == null) {
/* 81 */       this.videoAnalyticsOrPTZOrEvent = new ArrayList();
/*    */     }
/* 83 */     return this.videoAnalyticsOrPTZOrEvent;
/*    */   }
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
/*    */   public Map<QName, String> getOtherAttributes() {
/* 98 */     return this.otherAttributes;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\MetadataStream.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */