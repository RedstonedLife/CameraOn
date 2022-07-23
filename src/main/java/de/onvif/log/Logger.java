/*    */ package de.onvif.log;
/*    */ 
/*    */ public class Logger {
/*    */   public void debug(String text) {
/*  5 */     System.out.println(text);
/*    */   }
/*    */   
/*    */   public void info(String text) {
/*  9 */     System.out.println(text);
/*    */   }
/*    */   
/*    */   public void warn(String text) {
/* 13 */     System.err.println(text);
/*    */   }
/*    */   
/*    */   public void error(String text) {
/* 17 */     System.err.println(text);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\log\Logger.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */