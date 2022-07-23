/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "Mpeg4Configuration", propOrder = {"govLength", "mpeg4Profile"})
/*    */ public class Mpeg4Configuration
/*    */ {
/*    */   @XmlElement(name = "GovLength")
/*    */   protected int govLength;
/*    */   @XmlElement(name = "Mpeg4Profile", required = true)
/*    */   protected Mpeg4Profile mpeg4Profile;
/*    */   
/*    */   public int getGovLength() {
/* 51 */     return this.govLength;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setGovLength(int value) {
/* 59 */     this.govLength = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Mpeg4Profile getMpeg4Profile() {
/* 69 */     return this.mpeg4Profile;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setMpeg4Profile(Mpeg4Profile value) {
/* 80 */     this.mpeg4Profile = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\Mpeg4Configuration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */