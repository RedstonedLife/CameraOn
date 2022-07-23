/*    */ package org.onvif.ver10.media.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.AudioSourceConfiguration;
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
/*    */ @XmlType(name = "", propOrder = {"configuration", "forcePersistence"})
/*    */ @XmlRootElement(name = "SetAudioSourceConfiguration")
/*    */ public class SetAudioSourceConfiguration
/*    */ {
/*    */   @XmlElement(name = "Configuration", required = true)
/*    */   protected AudioSourceConfiguration configuration;
/*    */   @XmlElement(name = "ForcePersistence")
/*    */   protected boolean forcePersistence;
/*    */   
/*    */   public AudioSourceConfiguration getConfiguration() {
/* 56 */     return this.configuration;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setConfiguration(AudioSourceConfiguration value) {
/* 67 */     this.configuration = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isForcePersistence() {
/* 75 */     return this.forcePersistence;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setForcePersistence(boolean value) {
/* 83 */     this.forcePersistence = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\media\wsdl\SetAudioSourceConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */