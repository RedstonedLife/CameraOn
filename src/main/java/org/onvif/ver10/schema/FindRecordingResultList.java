/*    */ package org.onvif.ver10.schema;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "FindRecordingResultList", propOrder = {"searchState", "recordingInformation"})
/*    */ public class FindRecordingResultList
/*    */ {
/*    */   @XmlElement(name = "SearchState", required = true)
/*    */   protected SearchState searchState;
/*    */   @XmlElement(name = "RecordingInformation")
/*    */   protected List<RecordingInformation> recordingInformation;
/*    */   
/*    */   public SearchState getSearchState() {
/* 55 */     return this.searchState;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setSearchState(SearchState value) {
/* 66 */     this.searchState = value;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<RecordingInformation> getRecordingInformation() {
/* 90 */     if (this.recordingInformation == null) {
/* 91 */       this.recordingInformation = new ArrayList<>();
/*    */     }
/* 93 */     return this.recordingInformation;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\FindRecordingResultList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */