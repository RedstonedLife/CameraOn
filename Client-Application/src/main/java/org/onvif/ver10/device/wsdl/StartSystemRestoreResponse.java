/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlSchemaType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.datatype.Duration;
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
/*    */ @XmlType(name = "", propOrder = {"uploadUri", "expectedDownTime"})
/*    */ @XmlRootElement(name = "StartSystemRestoreResponse")
/*    */ public class StartSystemRestoreResponse
/*    */ {
/*    */   @XmlElement(name = "UploadUri", required = true)
/*    */   @XmlSchemaType(name = "anyURI")
/*    */   protected String uploadUri;
/*    */   @XmlElement(name = "ExpectedDownTime", required = true)
/*    */   protected Duration expectedDownTime;
/*    */   
/*    */   public String getUploadUri() {
/* 58 */     return this.uploadUri;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setUploadUri(String value) {
/* 69 */     this.uploadUri = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Duration getExpectedDownTime() {
/* 79 */     return this.expectedDownTime;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setExpectedDownTime(Duration value) {
/* 90 */     this.expectedDownTime = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\StartSystemRestoreResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */