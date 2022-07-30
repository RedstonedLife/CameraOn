/*     */ package org.onvif.ver10.media.wsdl;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "", propOrder = {"totalNumber", "jpeg", "h264", "mpeg4"})
/*     */ @XmlRootElement(name = "GetGuaranteedNumberOfVideoEncoderInstancesResponse")
/*     */ public class GetGuaranteedNumberOfVideoEncoderInstancesResponse
/*     */ {
/*     */   @XmlElement(name = "TotalNumber")
/*     */   protected int totalNumber;
/*     */   @XmlElement(name = "JPEG")
/*     */   protected Integer jpeg;
/*     */   @XmlElement(name = "H264")
/*     */   protected Integer h264;
/*     */   @XmlElement(name = "MPEG4")
/*     */   protected Integer mpeg4;
/*     */   
/*     */   public int getTotalNumber() {
/*  59 */     return this.totalNumber;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTotalNumber(int value) {
/*  67 */     this.totalNumber = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getJPEG() {
/*  77 */     return this.jpeg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJPEG(Integer value) {
/*  88 */     this.jpeg = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getH264() {
/*  98 */     return this.h264;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setH264(Integer value) {
/* 109 */     this.h264 = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getMPEG4() {
/* 119 */     return this.mpeg4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMPEG4(Integer value) {
/* 130 */     this.mpeg4 = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\GetGuaranteedNumberOfVideoEncoderInstancesResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */