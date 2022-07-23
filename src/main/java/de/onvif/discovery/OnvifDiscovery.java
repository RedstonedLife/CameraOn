/*    */ package de.onvif.discovery;
/*    */ 
/*    */ import java.net.URL;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import org.me.javawsdiscovery.DeviceDiscovery;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OnvifDiscovery
/*    */ {
/*    */   public static List<OnvifPointer> discoverOnvifDevices() {
/* 16 */     ArrayList<OnvifPointer> onvifPointers = new ArrayList<>();
/* 17 */     Collection<URL> urls = DeviceDiscovery.discoverWsDevicesAsUrls("^http$", ".*onvif.*");
/* 18 */     for (URL url : urls) {
/*    */       try {
/* 20 */         onvifPointers.add(new OnvifPointer(url));
/*    */       }
/* 22 */       catch (Exception e) {
/* 23 */         e.printStackTrace();
/*    */       } 
/*    */     } 
/* 26 */     return onvifPointers;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\discovery\OnvifDiscovery.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */