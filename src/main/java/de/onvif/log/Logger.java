/*    */ package de.onvif.log;
/*    */ 
/*    */ public class Logger {
/*    */   public void debug(String text) {
/*  5 */     com.bss.inc.cameraon.logging.Logger.getLogger("BNC").debug(text);
/*    */   }
/*    */   
/*    */   public void info(String text) {
/*  9 */     com.bss.inc.cameraon.logging.Logger.getLogger("BNC").info(text);
/*    */   }
/*    */   
/*    */   public void warn(String text) {
/* 13 */     com.bss.inc.cameraon.logging.Logger.getLogger("BNC").warn(text);
/*    */   }
/*    */   
/*    */   public void error(String text) {
/* 17 */     com.bss.inc.cameraon.logging.Logger.getLogger("BNC").error(text);
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\log\Logger.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */