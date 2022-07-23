/*    */ package org.w3._2005._08.addressing;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*    */ import javax.xml.bind.annotation.XmlSchemaType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.XmlValue;
/*    */ import javax.xml.namespace.QName;
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
/*    */ @XmlType(name = "AttributedUnsignedLongType", propOrder = {"value"})
/*    */ public class AttributedUnsignedLongType
/*    */ {
/*    */   @XmlValue
/*    */   @XmlSchemaType(name = "unsignedLong")
/*    */   protected BigInteger value;
/*    */   @XmlAnyAttribute
/* 48 */   private Map<QName, String> otherAttributes = new HashMap<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BigInteger getValue() {
/* 57 */     return this.value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValue(BigInteger value) {
/* 68 */     this.value = value;
/*    */   }
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
/*    */   public Map<QName, String> getOtherAttributes() {
/* 83 */     return this.otherAttributes;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\w3\_2005\_08\addressing\AttributedUnsignedLongType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */