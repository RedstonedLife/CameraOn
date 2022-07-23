/*     */ package org.onvif.ver10.media.wsdl;
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
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.namespace.QName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "StreamingCapabilities", propOrder = {"any"})
/*     */ public class StreamingCapabilities
/*     */ {
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   @XmlAttribute(name = "RTPMulticast")
/*     */   protected Boolean rtpMulticast;
/*     */   @XmlAttribute(name = "RTP_TCP")
/*     */   protected Boolean rtptcp;
/*     */   @XmlAttribute(name = "RTP_RTSP_TCP")
/*     */   protected Boolean rtprtsptcp;
/*     */   @XmlAttribute(name = "NonAggregateControl")
/*     */   protected Boolean nonAggregateControl;
/*     */   @XmlAttribute(name = "NoRTSPStreaming")
/*     */   protected Boolean noRTSPStreaming;
/*     */   @XmlAnyAttribute
/*  67 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  90 */     if (this.any == null) {
/*  91 */       this.any = new ArrayList();
/*     */     }
/*  93 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isRTPMulticast() {
/* 103 */     return this.rtpMulticast;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRTPMulticast(Boolean value) {
/* 114 */     this.rtpMulticast = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isRTPTCP() {
/* 124 */     return this.rtptcp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRTPTCP(Boolean value) {
/* 135 */     this.rtptcp = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isRTPRTSPTCP() {
/* 145 */     return this.rtprtsptcp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRTPRTSPTCP(Boolean value) {
/* 156 */     this.rtprtsptcp = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isNonAggregateControl() {
/* 166 */     return this.nonAggregateControl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNonAggregateControl(Boolean value) {
/* 177 */     this.nonAggregateControl = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isNoRTSPStreaming() {
/* 187 */     return this.noRTSPStreaming;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNoRTSPStreaming(Boolean value) {
/* 198 */     this.noRTSPStreaming = value;
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
/* 213 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\StreamingCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */