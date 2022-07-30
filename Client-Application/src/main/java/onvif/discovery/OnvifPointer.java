/*    */ package onvif.discovery;
/*    */ 
/*    */ import onvif.soap.OnvifDevice;
/*    */ import java.net.ConnectException;
/*    */ import java.net.URL;
/*    */ import java.util.List;
/*    */ import javax.xml.soap.SOAPException;
/*    */ import org.onvif.ver10.schema.Profile;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OnvifPointer
/*    */ {
/*    */   private final String address;
/*    */   private final String name;
/*    */   private final String snapshotUrl;
/*    */   
/*    */   public String getSnapshotUrl() {
/* 22 */     return this.snapshotUrl;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 26 */     return this.name;
/*    */   }
/*    */   
/*    */   public String getAddress() {
/* 30 */     return this.address;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public OnvifPointer(String address) {
/* 36 */     this.address = address;
/*    */     try {
/* 38 */       OnvifDevice device = new OnvifDevice(address);
/* 39 */       this.name = device.getName();
/* 40 */       List<Profile> profiles = device.getDevices().getProfiles();
/* 41 */       Profile profile = profiles.get(0);
/* 42 */       this.snapshotUrl = device.getMedia().getSnapshotUri(profile.getToken());
/*    */     }
/* 44 */     catch (Exception e) {
/* 45 */       throw new RuntimeException("no onvif device or device not configured", e);
/*    */     } 
/*    */   }
/*    */   
/*    */   public OnvifPointer(URL service) {
/* 50 */     this(service.getHost());
/*    */   }
/*    */   
/*    */   public OnvifDevice getOnvifDevice() throws SOAPException, ConnectException {
/* 54 */     return new OnvifDevice(this.address);
/*    */   }
/*    */   
/*    */   public String toString() {
/* 58 */     return "ONVIF: " + this.name + "@" + this.address;
/*    */   }
/*    */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\discovery\OnvifPointer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */