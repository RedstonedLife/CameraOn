/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
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
/*    */ @XmlType(name = "IrCutFilterAutoBoundaryType")
/*    */ @XmlEnum
/*    */ public enum IrCutFilterAutoBoundaryType
/*    */ {
/* 38 */   COMMON(
/* 39 */     "Common"),
/* 40 */   TO_ON("ToOn"),
/* 41 */   TO_OFF("ToOff"),
/* 42 */   EXTENDED("Extended");
/*    */   private final String value;
/*    */   
/*    */   IrCutFilterAutoBoundaryType(String v) {
/* 46 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 50 */     return this.value; } public static IrCutFilterAutoBoundaryType fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     IrCutFilterAutoBoundaryType[] arrayOfIrCutFilterAutoBoundaryType;
/* 54 */     for (i = (arrayOfIrCutFilterAutoBoundaryType = values()).length, b = 0; b < i; ) { IrCutFilterAutoBoundaryType c = arrayOfIrCutFilterAutoBoundaryType[b];
/* 55 */       if (c.value.equals(v))
/* 56 */         return c; 
/*    */       b++; }
/*    */     
/* 59 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\IrCutFilterAutoBoundaryType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */