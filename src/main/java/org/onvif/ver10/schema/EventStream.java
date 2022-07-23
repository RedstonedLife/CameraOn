/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlElements;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.oasis_open.docs.wsn.b_2.NotificationMessageHolderType;
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
/*    */ @XmlType(name = "EventStream", propOrder = {"notificationMessageOrExtension"})
/*    */ public class EventStream
/*    */ {
/*    */   @XmlElements({@XmlElement(name = "NotificationMessage", namespace = "http://docs.oasis-open.org/wsn/b-2", type = NotificationMessageHolderType.class), @XmlElement(name = "Extension", type = EventStreamExtension.class)})
/*    */   protected List<java.lang.Object> notificationMessageOrExtension;
/*    */   
/*    */   public List<java.lang.Object> getNotificationMessageOrExtension() {
/* 70 */     if (this.notificationMessageOrExtension == null) {
/* 71 */       this.notificationMessageOrExtension = new ArrayList();
/*    */     }
/* 73 */     return this.notificationMessageOrExtension;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\EventStream.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */