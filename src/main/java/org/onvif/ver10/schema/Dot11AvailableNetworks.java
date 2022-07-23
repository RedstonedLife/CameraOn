/*     */ package org.onvif.ver10.schema;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
/*     */ @XmlType(name = "Dot11AvailableNetworks", propOrder = {"ssid", "bssid", "authAndMangementSuite", "pairCipher", "groupCipher", "signalStrength", "extension"})
/*     */ public class Dot11AvailableNetworks
/*     */ {
/*     */   @XmlElement(name = "SSID", required = true, type = String.class)
/*     */   @XmlJavaTypeAdapter(HexBinaryAdapter.class)
/*     */   protected byte[] ssid;
/*     */   @XmlElement(name = "BSSID")
/*     */   protected String bssid;
/*     */   @XmlElement(name = "AuthAndMangementSuite")
/*     */   protected List<Dot11AuthAndMangementSuite> authAndMangementSuite;
/*     */   @XmlElement(name = "PairCipher")
/*     */   protected List<Dot11Cipher> pairCipher;
/*     */   @XmlElement(name = "GroupCipher")
/*     */   protected List<Dot11Cipher> groupCipher;
/*     */   @XmlElement(name = "SignalStrength")
/*     */   protected Dot11SignalStrength signalStrength;
/*     */   @XmlElement(name = "Extension")
/*     */   protected Dot11AvailableNetworksExtension extension;
/*     */   @XmlAnyAttribute
/*  71 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] getSSID() {
/*  80 */     return this.ssid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSSID(byte[] value) {
/*  91 */     this.ssid = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getBSSID() {
/* 101 */     return this.bssid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBSSID(String value) {
/* 112 */     this.bssid = value;
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
/*     */   public List<Dot11AuthAndMangementSuite> getAuthAndMangementSuite() {
/* 136 */     if (this.authAndMangementSuite == null) {
/* 137 */       this.authAndMangementSuite = new ArrayList<>();
/*     */     }
/* 139 */     return this.authAndMangementSuite;
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
/*     */   public List<Dot11Cipher> getPairCipher() {
/* 163 */     if (this.pairCipher == null) {
/* 164 */       this.pairCipher = new ArrayList<>();
/*     */     }
/* 166 */     return this.pairCipher;
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
/*     */   public List<Dot11Cipher> getGroupCipher() {
/* 190 */     if (this.groupCipher == null) {
/* 191 */       this.groupCipher = new ArrayList<>();
/*     */     }
/* 193 */     return this.groupCipher;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Dot11SignalStrength getSignalStrength() {
/* 203 */     return this.signalStrength;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSignalStrength(Dot11SignalStrength value) {
/* 214 */     this.signalStrength = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Dot11AvailableNetworksExtension getExtension() {
/* 224 */     return this.extension;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtension(Dot11AvailableNetworksExtension value) {
/* 235 */     this.extension = value;
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
/* 250 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Dot11AvailableNetworks.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */