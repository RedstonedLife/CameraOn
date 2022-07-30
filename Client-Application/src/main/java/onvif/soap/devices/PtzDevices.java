/*     */ package onvif.soap.devices;
/*     */ 
/*     */ import onvif.soap.OnvifDevice;
/*     */ import onvif.soap.SOAP;
/*     */ import java.net.ConnectException;
/*     */ import java.util.List;
/*     */ import javax.xml.soap.SOAPException;
/*     */ import org.onvif.ver10.schema.FloatRange;
/*     */ import org.onvif.ver10.schema.PTZConfiguration;
/*     */ import org.onvif.ver10.schema.PTZNode;
/*     */ import org.onvif.ver10.schema.PTZPreset;
/*     */ import org.onvif.ver10.schema.PTZSpaces;
/*     */ import org.onvif.ver10.schema.PTZSpeed;
/*     */ import org.onvif.ver10.schema.PTZStatus;
/*     */ import org.onvif.ver10.schema.PTZVector;
/*     */ import org.onvif.ver10.schema.Profile;
/*     */ import org.onvif.ver10.schema.Space1DDescription;
/*     */ import org.onvif.ver10.schema.Space2DDescription;
/*     */ import org.onvif.ver10.schema.Vector1D;
/*     */ import org.onvif.ver10.schema.Vector2D;
/*     */ import org.onvif.ver20.ptz.wsdl.AbsoluteMove;
/*     */ import org.onvif.ver20.ptz.wsdl.AbsoluteMoveResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.ContinuousMove;
/*     */ import org.onvif.ver20.ptz.wsdl.ContinuousMoveResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.GetNode;
/*     */ import org.onvif.ver20.ptz.wsdl.GetNodeResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.GetNodes;
/*     */ import org.onvif.ver20.ptz.wsdl.GetNodesResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.GetPresets;
/*     */ import org.onvif.ver20.ptz.wsdl.GetPresetsResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.GetStatus;
/*     */ import org.onvif.ver20.ptz.wsdl.GetStatusResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.GotoPreset;
/*     */ import org.onvif.ver20.ptz.wsdl.GotoPresetResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.RelativeMove;
/*     */ import org.onvif.ver20.ptz.wsdl.RelativeMoveResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.RemovePreset;
/*     */ import org.onvif.ver20.ptz.wsdl.RemovePresetResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.SetHomePosition;
/*     */ import org.onvif.ver20.ptz.wsdl.SetHomePositionResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.SetPreset;
/*     */ import org.onvif.ver20.ptz.wsdl.SetPresetResponse;
/*     */ import org.onvif.ver20.ptz.wsdl.Stop;
/*     */ import org.onvif.ver20.ptz.wsdl.StopResponse;
/*     */ 
/*     */ public class PtzDevices
/*     */ {
/*     */   private OnvifDevice onvifDevice;
/*     */   private SOAP soap;
/*     */   
/*     */   public PtzDevices(OnvifDevice onvifDevice) {
/*  52 */     this.onvifDevice = onvifDevice;
/*  53 */     this.soap = onvifDevice.getSoap();
/*     */   }
/*     */   
/*     */   public boolean isPtzOperationsSupported(String profileToken) {
/*  57 */     return (getPTZConfiguration(profileToken) != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PTZConfiguration getPTZConfiguration(String profileToken) {
/*  65 */     if (profileToken == null || profileToken.equals("")) {
/*  66 */       return null;
/*     */     }
/*  68 */     Profile profile = this.onvifDevice.getDevices().getProfile(profileToken);
/*  69 */     if (profile == null) {
/*  70 */       throw new IllegalArgumentException("No profile available for token: " + profileToken);
/*     */     }
/*  72 */     if (profile.getPTZConfiguration() == null) {
/*  73 */       return null;
/*     */     }
/*     */     
/*  76 */     return profile.getPTZConfiguration();
/*     */   }
/*     */   
/*     */   public List<PTZNode> getNodes() {
/*  80 */     GetNodes request = new GetNodes();
/*  81 */     GetNodesResponse response = new GetNodesResponse();
/*     */     
/*     */     try {
/*  84 */       response = (GetNodesResponse)this.soap.createSOAPDeviceRequest(request, response, true);
/*     */     }
/*  86 */     catch (SOAPException|ConnectException e) {
/*  87 */       e.printStackTrace();
/*  88 */       return null;
/*     */     } 
/*     */     
/*  91 */     if (response == null) {
/*  92 */       return null;
/*     */     }
/*     */     
/*  95 */     return response.getPTZNode();
/*     */   }
/*     */   
/*     */   public PTZNode getNode(String profileToken) {
/*  99 */     return getNode(getPTZConfiguration(profileToken));
/*     */   }
/*     */   
/*     */   public PTZNode getNode(PTZConfiguration ptzConfiguration) {
/* 103 */     GetNode request = new GetNode();
/* 104 */     GetNodeResponse response = new GetNodeResponse();
/*     */     
/* 106 */     if (ptzConfiguration == null) {
/* 107 */       return null;
/*     */     }
/* 109 */     request.setNodeToken(ptzConfiguration.getNodeToken());
/*     */     
/*     */     try {
/* 112 */       response = (GetNodeResponse)this.soap.createSOAPDeviceRequest(request, response, true);
/*     */     }
/* 114 */     catch (SOAPException|ConnectException e) {
/* 115 */       e.printStackTrace();
/* 116 */       return null;
/*     */     } 
/*     */     
/* 119 */     if (response == null) {
/* 120 */       return null;
/*     */     }
/*     */     
/* 123 */     return response.getPTZNode();
/*     */   }
/*     */   
/*     */   public FloatRange getPanSpaces(String profileToken) {
/* 127 */     PTZNode node = getNode(profileToken);
/*     */     
/* 129 */     PTZSpaces ptzSpaces = node.getSupportedPTZSpaces();
/* 130 */     return ((Space2DDescription)ptzSpaces.getAbsolutePanTiltPositionSpace().get(0)).getXRange();
/*     */   }
/*     */   
/*     */   public FloatRange getTiltSpaces(String profileToken) {
/* 134 */     PTZNode node = getNode(profileToken);
/*     */     
/* 136 */     PTZSpaces ptzSpaces = node.getSupportedPTZSpaces();
/* 137 */     return ((Space2DDescription)ptzSpaces.getAbsolutePanTiltPositionSpace().get(0)).getYRange();
/*     */   }
/*     */   
/*     */   public FloatRange getZoomSpaces(String profileToken) {
/* 141 */     PTZNode node = getNode(profileToken);
/*     */     
/* 143 */     PTZSpaces ptzSpaces = node.getSupportedPTZSpaces();
/* 144 */     return ((Space1DDescription)ptzSpaces.getAbsoluteZoomPositionSpace().get(0)).getXRange();
/*     */   }
/*     */   
/*     */   public boolean isAbsoluteMoveSupported(String profileToken) {
/* 148 */     Profile profile = this.onvifDevice.getDevices().getProfile(profileToken);
/*     */     try {
/* 150 */       if (profile.getPTZConfiguration().getDefaultAbsolutePantTiltPositionSpace() != null) {
/* 151 */         return true;
/*     */       }
/*     */     }
/* 154 */     catch (NullPointerException nullPointerException) {}
/*     */     
/* 156 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean absoluteMove(String profileToken, float x, float y, float zoom) throws SOAPException {
/* 172 */     PTZNode node = getNode(profileToken);
/* 173 */     if (node != null) {
/* 174 */       FloatRange xRange = ((Space2DDescription)node.getSupportedPTZSpaces().getAbsolutePanTiltPositionSpace().get(0)).getXRange();
/* 175 */       FloatRange yRange = ((Space2DDescription)node.getSupportedPTZSpaces().getAbsolutePanTiltPositionSpace().get(0)).getYRange();
/* 176 */       FloatRange zRange = ((Space1DDescription)node.getSupportedPTZSpaces().getAbsoluteZoomPositionSpace().get(0)).getXRange();
/*     */       
/* 178 */       if (zoom < zRange.getMin() || zoom > zRange.getMax()) {
/* 179 */         throw new IllegalArgumentException("Bad value for zoom: " + zoom);
/*     */       }
/* 181 */       if (x < xRange.getMin() || x > xRange.getMax()) {
/* 182 */         throw new IllegalArgumentException("Bad value for pan:/x " + x);
/*     */       }
/* 184 */       if (y < yRange.getMin() || y > yRange.getMax()) {
/* 185 */         throw new IllegalArgumentException("Bad value for tilt/y: " + y);
/*     */       }
/*     */     } 
/*     */     
/* 189 */     AbsoluteMove request = new AbsoluteMove();
/* 190 */     AbsoluteMoveResponse response = new AbsoluteMoveResponse();
/*     */     
/* 192 */     Vector2D panTiltVector = new Vector2D();
/* 193 */     panTiltVector.setX(x);
/* 194 */     panTiltVector.setY(y);
/* 195 */     Vector1D zoomVector = new Vector1D();
/* 196 */     zoomVector.setX(zoom);
/*     */     
/* 198 */     PTZVector ptzVector = new PTZVector();
/* 199 */     ptzVector.setPanTilt(panTiltVector);
/* 200 */     ptzVector.setZoom(zoomVector);
/* 201 */     request.setPosition(ptzVector);
/*     */     
/* 203 */     request.setProfileToken(profileToken);
/*     */     
/*     */     try {
/* 206 */       response = (AbsoluteMoveResponse)this.soap.createSOAPPtzRequest(request, response, true);
/*     */     }
/* 208 */     catch (SOAPException e) {
/* 209 */       throw e;
/*     */     }
/* 211 */     catch (ConnectException e) {
/* 212 */       e.printStackTrace();
/* 213 */       return false;
/*     */     } 
/*     */     
/* 216 */     if (response == null) {
/* 217 */       return false;
/*     */     }
/*     */     
/* 220 */     return true;
/*     */   }
/*     */   
/*     */   public boolean isRelativeMoveSupported(String profileToken) {
/* 224 */     Profile profile = this.onvifDevice.getDevices().getProfile(profileToken);
/*     */     try {
/* 226 */       if (profile.getPTZConfiguration().getDefaultRelativePanTiltTranslationSpace() != null) {
/* 227 */         return true;
/*     */       }
/*     */     }
/* 230 */     catch (NullPointerException nullPointerException) {}
/*     */     
/* 232 */     return false;
/*     */   }
/*     */   
/*     */   public boolean relativeMove(String profileToken, float x, float y, float zoom) {
/* 236 */     RelativeMove request = new RelativeMove();
/* 237 */     RelativeMoveResponse response = new RelativeMoveResponse();
/*     */     
/* 239 */     Vector2D panTiltVector = new Vector2D();
/* 240 */     panTiltVector.setX(x);
/* 241 */     panTiltVector.setY(y);
/* 242 */     Vector1D zoomVector = new Vector1D();
/* 243 */     zoomVector.setX(zoom);
/*     */     
/* 245 */     PTZVector translation = new PTZVector();
/* 246 */     translation.setPanTilt(panTiltVector);
/* 247 */     translation.setZoom(zoomVector);
/*     */     
/* 249 */     request.setProfileToken(profileToken);
/* 250 */     request.setTranslation(translation);
/*     */     
/*     */     try {
/* 253 */       response = (RelativeMoveResponse)this.soap.createSOAPPtzRequest(request, response, true);
/*     */     }
/* 255 */     catch (SOAPException|ConnectException e) {
/* 256 */       e.printStackTrace();
/* 257 */       return false;
/*     */     } 
/*     */     
/* 260 */     if (response == null) {
/* 261 */       return false;
/*     */     }
/*     */     
/* 264 */     return true;
/*     */   }
/*     */   
/*     */   public boolean isContinuosMoveSupported(String profileToken) {
/* 268 */     Profile profile = this.onvifDevice.getDevices().getProfile(profileToken);
/*     */     try {
/* 270 */       if (profile.getPTZConfiguration().getDefaultContinuousPanTiltVelocitySpace() != null) {
/* 271 */         return true;
/*     */       }
/*     */     }
/* 274 */     catch (NullPointerException nullPointerException) {}
/*     */     
/* 276 */     return false;
/*     */   }
/*     */   
/*     */   public boolean continuousMove(String profileToken, float x, float y, float zoom) {
/* 280 */     ContinuousMove request = new ContinuousMove();
/* 281 */     ContinuousMoveResponse response = new ContinuousMoveResponse();
/*     */     
/* 283 */     Vector2D panTiltVector = new Vector2D();
/* 284 */     panTiltVector.setX(x);
/* 285 */     panTiltVector.setY(y);
/* 286 */     Vector1D zoomVector = new Vector1D();
/* 287 */     zoomVector.setX(zoom);
/*     */     
/* 289 */     PTZSpeed ptzSpeed = new PTZSpeed();
/* 290 */     ptzSpeed.setPanTilt(panTiltVector);
/* 291 */     ptzSpeed.setZoom(zoomVector);
/* 292 */     request.setVelocity(ptzSpeed);
/*     */     
/* 294 */     request.setProfileToken(profileToken);
/*     */     
/*     */     try {
/* 297 */       response = (ContinuousMoveResponse)this.soap.createSOAPPtzRequest(request, response, true);
/*     */     }
/* 299 */     catch (SOAPException|ConnectException e) {
/* 300 */       e.printStackTrace();
/* 301 */       return false;
/*     */     } 
/*     */     
/* 304 */     if (response == null) {
/* 305 */       return false;
/*     */     }
/*     */     
/* 308 */     return true;
/*     */   }
/*     */   
/*     */   public boolean stopMove(String profileToken) {
/* 312 */     Stop request = new Stop();
/* 313 */     request.setPanTilt(Boolean.valueOf(true));
/* 314 */     request.setZoom(Boolean.valueOf(true));
/* 315 */     StopResponse response = new StopResponse();
/*     */     
/* 317 */     request.setProfileToken(profileToken);
/*     */     
/*     */     try {
/* 320 */       response = (StopResponse)this.soap.createSOAPPtzRequest(request, response, true);
/*     */     }
/* 322 */     catch (SOAPException|ConnectException e) {
/* 323 */       e.printStackTrace();
/* 324 */       return false;
/*     */     } 
/*     */     
/* 327 */     if (response == null) {
/* 328 */       return false;
/*     */     }
/*     */     
/* 331 */     return true;
/*     */   }
/*     */   
/*     */   public PTZStatus getStatus(String profileToken) {
/* 335 */     GetStatus request = new GetStatus();
/* 336 */     GetStatusResponse response = new GetStatusResponse();
/*     */     
/* 338 */     request.setProfileToken(profileToken);
/*     */     
/*     */     try {
/* 341 */       response = (GetStatusResponse)this.soap.createSOAPPtzRequest(request, response, false);
/*     */     }
/* 343 */     catch (SOAPException|ConnectException e) {
/* 344 */       e.printStackTrace();
/* 345 */       return null;
/*     */     } 
/*     */     
/* 348 */     if (response == null) {
/* 349 */       return null;
/*     */     }
/*     */     
/* 352 */     return response.getPTZStatus();
/*     */   }
/*     */   
/*     */   public PTZVector getPosition(String profileToken) {
/* 356 */     PTZStatus status = getStatus(profileToken);
/*     */     
/* 358 */     if (status == null) {
/* 359 */       return null;
/*     */     }
/*     */     
/* 362 */     return status.getPosition();
/*     */   }
/*     */   
/*     */   public boolean setHomePosition(String profileToken) {
/* 366 */     SetHomePosition request = new SetHomePosition();
/* 367 */     SetHomePositionResponse response = new SetHomePositionResponse();
/*     */     
/* 369 */     request.setProfileToken(profileToken);
/*     */     
/*     */     try {
/* 372 */       response = (SetHomePositionResponse)this.soap.createSOAPPtzRequest(request, response, true);
/*     */     }
/* 374 */     catch (SOAPException|ConnectException e) {
/* 375 */       e.printStackTrace();
/* 376 */       return false;
/*     */     } 
/*     */     
/* 379 */     if (response == null) {
/* 380 */       return false;
/*     */     }
/*     */     
/* 383 */     return true;
/*     */   }
/*     */   
/*     */   public List<PTZPreset> getPresets(String profileToken) {
/* 387 */     GetPresets request = new GetPresets();
/* 388 */     GetPresetsResponse response = new GetPresetsResponse();
/*     */     
/* 390 */     request.setProfileToken(profileToken);
/*     */     
/*     */     try {
/* 393 */       response = (GetPresetsResponse)this.soap.createSOAPPtzRequest(request, response, true);
/*     */     }
/* 395 */     catch (SOAPException|ConnectException e) {
/* 396 */       e.printStackTrace();
/* 397 */       return null;
/*     */     } 
/*     */     
/* 400 */     if (response == null) {
/* 401 */       return null;
/*     */     }
/*     */     
/* 404 */     return response.getPreset();
/*     */   }
/*     */   
/*     */   public String setPreset(String presetName, String presetToken, String profileToken) {
/* 408 */     SetPreset request = new SetPreset();
/* 409 */     SetPresetResponse response = new SetPresetResponse();
/*     */     
/* 411 */     request.setProfileToken(profileToken);
/* 412 */     request.setPresetName(presetName);
/* 413 */     request.setPresetToken(presetToken);
/*     */     
/*     */     try {
/* 416 */       response = (SetPresetResponse)this.soap.createSOAPPtzRequest(request, response, true);
/*     */     }
/* 418 */     catch (SOAPException|ConnectException e) {
/* 419 */       e.printStackTrace();
/* 420 */       return null;
/*     */     } 
/*     */     
/* 423 */     if (response == null) {
/* 424 */       return null;
/*     */     }
/*     */     
/* 427 */     return response.getPresetToken();
/*     */   }
/*     */   
/*     */   public String setPreset(String presetName, String profileToken) {
/* 431 */     return setPreset(presetName, null, profileToken);
/*     */   }
/*     */   
/*     */   public boolean removePreset(String presetToken, String profileToken) {
/* 435 */     RemovePreset request = new RemovePreset();
/* 436 */     RemovePresetResponse response = new RemovePresetResponse();
/*     */     
/* 438 */     request.setProfileToken(profileToken);
/* 439 */     request.setPresetToken(presetToken);
/*     */     
/*     */     try {
/* 442 */       response = (RemovePresetResponse)this.soap.createSOAPPtzRequest(request, response, true);
/*     */     }
/* 444 */     catch (SOAPException|ConnectException e) {
/* 445 */       e.printStackTrace();
/* 446 */       return false;
/*     */     } 
/*     */     
/* 449 */     if (response == null) {
/* 450 */       return false;
/*     */     }
/*     */     
/* 453 */     return true;
/*     */   }
/*     */   
/*     */   public boolean gotoPreset(String presetToken, String profileToken) {
/* 457 */     GotoPreset request = new GotoPreset();
/* 458 */     GotoPresetResponse response = new GotoPresetResponse();
/*     */     
/* 460 */     request.setProfileToken(profileToken);
/* 461 */     request.setPresetToken(presetToken);
/*     */     
/*     */     try {
/* 464 */       response = (GotoPresetResponse)this.soap.createSOAPPtzRequest(request, response, true);
/*     */     }
/* 466 */     catch (SOAPException|ConnectException e) {
/* 467 */       e.printStackTrace();
/* 468 */       return false;
/*     */     } 
/*     */     
/* 471 */     if (response == null) {
/* 472 */       return false;
/*     */     }
/*     */     
/* 475 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\soap\devices\PtzDevices.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */