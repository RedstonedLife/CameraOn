/*    */ package org.onvif.ver10.device.wsdl;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.onvif.ver10.schema.FactoryDefaultType;
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
/*    */ @XmlType(name = "", propOrder = {"factoryDefault"})
/*    */ @XmlRootElement(name = "SetSystemFactoryDefault")
/*    */ public class SetSystemFactoryDefault
/*    */ {
/*    */   @XmlElement(name = "FactoryDefault", required = true)
/*    */   protected FactoryDefaultType factoryDefault;
/*    */   
/*    */   public FactoryDefaultType getFactoryDefault() {
/* 53 */     return this.factoryDefault;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setFactoryDefault(FactoryDefaultType value) {
/* 64 */     this.factoryDefault = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\SetSystemFactoryDefault.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */