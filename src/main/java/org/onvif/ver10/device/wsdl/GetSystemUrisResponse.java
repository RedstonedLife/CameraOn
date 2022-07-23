/*     */ package org.onvif.ver10.device.wsdl;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.onvif.ver10.schema.SystemLogUriList;
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
/*     */ @XmlType(name = "", propOrder = {"systemLogUris", "supportInfoUri", "systemBackupUri", "extension"})
/*     */ @XmlRootElement(name = "GetSystemUrisResponse")
/*     */ public class GetSystemUrisResponse
/*     */ {
/*     */   @XmlElement(name = "SystemLogUris")
/*     */   protected SystemLogUriList systemLogUris;
/*     */   @XmlElement(name = "SupportInfoUri")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String supportInfoUri;
/*     */   @XmlElement(name = "SystemBackupUri")
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String systemBackupUri;
/*     */   @XmlElement(name = "Extension")
/*     */   protected Extension extension;
/*     */   
/*     */   public SystemLogUriList getSystemLogUris() {
/*  79 */     return this.systemLogUris;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSystemLogUris(SystemLogUriList value) {
/*  90 */     this.systemLogUris = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSupportInfoUri() {
/* 100 */     return this.supportInfoUri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupportInfoUri(String value) {
/* 111 */     this.supportInfoUri = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSystemBackupUri() {
/* 121 */     return this.systemBackupUri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSystemBackupUri(String value) {
/* 132 */     this.systemBackupUri = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Extension getExtension() {
/* 142 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(Extension value) {
/* 153 */     this.extension = value;
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
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name = "", propOrder = {"any"})
/*     */   public static class Extension
/*     */   {
/*     */     @XmlAnyElement(lax = true)
/*     */     protected List<Object> any;
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
/*     */     public List<Object> getAny() {
/* 205 */       if (this.any == null) {
/* 206 */         this.any = new ArrayList();
/*     */       }
/* 208 */       return this.any;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\GetSystemUrisResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */