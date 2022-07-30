/*     */ package org.onvif.ver10.device.wsdl;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "", propOrder = {"manufacturer", "model", "firmwareVersion", "serialNumber", "hardwareId"})
/*     */ @XmlRootElement(name = "GetDeviceInformationResponse")
/*     */ public class GetDeviceInformationResponse
/*     */ {
/*     */   @XmlElement(name = "Manufacturer", required = true)
/*     */   protected String manufacturer;
/*     */   @XmlElement(name = "Model", required = true)
/*     */   protected String model;
/*     */   @XmlElement(name = "FirmwareVersion", required = true)
/*     */   protected String firmwareVersion;
/*     */   @XmlElement(name = "SerialNumber", required = true)
/*     */   protected String serialNumber;
/*     */   @XmlElement(name = "HardwareId", required = true)
/*     */   protected String hardwareId;
/*     */   
/*     */   public String getManufacturer() {
/*  64 */     return this.manufacturer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setManufacturer(String value) {
/*  75 */     this.manufacturer = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModel() {
/*  85 */     return this.model;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModel(String value) {
/*  96 */     this.model = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFirmwareVersion() {
/* 106 */     return this.firmwareVersion;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFirmwareVersion(String value) {
/* 117 */     this.firmwareVersion = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSerialNumber() {
/* 127 */     return this.serialNumber;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSerialNumber(String value) {
/* 138 */     this.serialNumber = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getHardwareId() {
/* 148 */     return this.hardwareId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHardwareId(String value) {
/* 159 */     this.hardwareId = value;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\GetDeviceInformationResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */