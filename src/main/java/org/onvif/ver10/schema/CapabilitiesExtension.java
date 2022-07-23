/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name = "CapabilitiesExtension", propOrder = {"any", "deviceIO", "display", "recording", "search", "replay", "receiver", "analyticsDevice", "extensions"})
/*     */ public class CapabilitiesExtension
/*     */ {
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<java.lang.Object> any;
/*     */   @XmlElement(name = "DeviceIO")
/*     */   protected DeviceIOCapabilities deviceIO;
/*     */   @XmlElement(name = "Display")
/*     */   protected DisplayCapabilities display;
/*     */   @XmlElement(name = "Recording")
/*     */   protected RecordingCapabilities recording;
/*     */   @XmlElement(name = "Search")
/*     */   protected SearchCapabilities search;
/*     */   @XmlElement(name = "Replay")
/*     */   protected ReplayCapabilities replay;
/*     */   @XmlElement(name = "Receiver")
/*     */   protected ReceiverCapabilities receiver;
/*     */   @XmlElement(name = "AnalyticsDevice")
/*     */   protected AnalyticsDeviceCapabilities analyticsDevice;
/*     */   @XmlElement(name = "Extensions")
/*     */   protected CapabilitiesExtension2 extensions;
/*     */   
/*     */   public List<java.lang.Object> getAny() {
/*  93 */     if (this.any == null) {
/*  94 */       this.any = new ArrayList();
/*     */     }
/*  96 */     return this.any;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceIOCapabilities getDeviceIO() {
/* 106 */     return this.deviceIO;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeviceIO(DeviceIOCapabilities value) {
/* 117 */     this.deviceIO = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DisplayCapabilities getDisplay() {
/* 127 */     return this.display;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisplay(DisplayCapabilities value) {
/* 138 */     this.display = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RecordingCapabilities getRecording() {
/* 148 */     return this.recording;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRecording(RecordingCapabilities value) {
/* 159 */     this.recording = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SearchCapabilities getSearch() {
/* 169 */     return this.search;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSearch(SearchCapabilities value) {
/* 180 */     this.search = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReplayCapabilities getReplay() {
/* 190 */     return this.replay;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReplay(ReplayCapabilities value) {
/* 201 */     this.replay = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReceiverCapabilities getReceiver() {
/* 211 */     return this.receiver;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReceiver(ReceiverCapabilities value) {
/* 222 */     this.receiver = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AnalyticsDeviceCapabilities getAnalyticsDevice() {
/* 232 */     return this.analyticsDevice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAnalyticsDevice(AnalyticsDeviceCapabilities value) {
/* 243 */     this.analyticsDevice = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CapabilitiesExtension2 getExtensions() {
/* 253 */     return this.extensions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtensions(CapabilitiesExtension2 value) {
/* 264 */     this.extensions = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\CapabilitiesExtension.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */