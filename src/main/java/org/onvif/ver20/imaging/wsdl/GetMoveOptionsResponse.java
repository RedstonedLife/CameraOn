/*    */ package org.onvif.ver20.imaging.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.MoveOptions20;
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
/*    */ @XmlType(name = "", propOrder = {"moveOptions"})
/*    */ @XmlRootElement(name = "GetMoveOptionsResponse")
/*    */ public class GetMoveOptionsResponse
/*    */ {
/*    */   @XmlElement(name = "MoveOptions", required = true)
/*    */   protected MoveOptions20 moveOptions;
/*    */   
/*    */   public MoveOptions20 getMoveOptions() {
/* 57 */     return this.moveOptions;
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
/*    */   public void setMoveOptions(MoveOptions20 value) {
/* 69 */     this.moveOptions = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\imaging\wsdl\GetMoveOptionsResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */