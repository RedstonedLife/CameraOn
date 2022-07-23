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
/*    */ @XmlType(name = "SearchState")
/*    */ @XmlEnum
/*    */ public enum SearchState
/*    */ {
/* 38 */   QUEUED(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 43 */     "Queued"),
/*    */   
/* 45 */   SEARCHING(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     "Searching"),
/*    */   
/* 52 */   COMPLETED(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     "Completed"),
/*    */   
/* 59 */   UNKNOWN(
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 64 */     "Unknown");
/*    */   private final String value;
/*    */   
/*    */   SearchState(String v) {
/* 68 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 72 */     return this.value; } public static SearchState fromValue(String v) {
/*    */     byte b;
/*    */     int i;
/*    */     SearchState[] arrayOfSearchState;
/* 76 */     for (i = (arrayOfSearchState = values()).length, b = 0; b < i; ) { SearchState c = arrayOfSearchState[b];
/* 77 */       if (c.value.equals(v))
/* 78 */         return c; 
/*    */       b++; }
/*    */     
/* 81 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\SearchState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */