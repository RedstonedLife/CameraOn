/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlElements;
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
/*    */ @XmlType(name = "PTZStream", propOrder = {"ptzStatusOrExtension"})
/*    */ public class PTZStream
/*    */ {
/*    */   @XmlElements({@XmlElement(name = "PTZStatus", type = PTZStatus.class), @XmlElement(name = "Extension", type = PTZStreamExtension.class)})
/*    */   protected List<java.lang.Object> ptzStatusOrExtension;
/*    */   
/*    */   public List<java.lang.Object> getPTZStatusOrExtension() {
/* 68 */     if (this.ptzStatusOrExtension == null) {
/* 69 */       this.ptzStatusOrExtension = new ArrayList();
/*    */     }
/* 71 */     return this.ptzStatusOrExtension;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\PTZStream.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */