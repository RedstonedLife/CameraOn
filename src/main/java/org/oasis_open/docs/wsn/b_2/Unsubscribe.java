/*    */ package org.oasis_open.docs.wsn.b_2;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAnyElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
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
/*    */ @XmlType(name = "", propOrder = {"any"})
/*    */ @XmlRootElement(name = "Unsubscribe")
/*    */ public class Unsubscribe
/*    */ {
/*    */   @XmlAnyElement(lax = true)
/*    */   protected List<Object> any;
/*    */   
/*    */   public List<Object> getAny() {
/* 69 */     if (this.any == null) {
/* 70 */       this.any = new ArrayList();
/*    */     }
/* 72 */     return this.any;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\oasis_open\docs\wsn\b_2\Unsubscribe.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */