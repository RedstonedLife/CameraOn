/*     */ package org.onvif.ver20.ptz.wsdl;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.namespace.QName;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlRegistry
/*     */ public class ObjectFactory
/*     */ {
/*  26 */   private static final QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver20/ptz/wsdl", "Capabilities");
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
/*     */   public GetNodes createGetNodes() {
/*  40 */     return new GetNodes();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RemovePresetResponse createRemovePresetResponse() {
/*  48 */     return new RemovePresetResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetHomePosition createSetHomePosition() {
/*  56 */     return new SetHomePosition();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GotoHomePosition createGotoHomePosition() {
/*  64 */     return new GotoHomePosition();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RelativeMoveResponse createRelativeMoveResponse() {
/*  72 */     return new RelativeMoveResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetNode createGetNode() {
/*  80 */     return new GetNode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
/*  88 */     return new GetServiceCapabilitiesResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Capabilities createCapabilities() {
/*  96 */     return new Capabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GotoPresetResponse createGotoPresetResponse() {
/* 104 */     return new GotoPresetResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SendAuxiliaryCommand createSendAuxiliaryCommand() {
/* 112 */     return new SendAuxiliaryCommand();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OperatePresetTour createOperatePresetTour() {
/* 120 */     return new OperatePresetTour();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GotoPreset createGotoPreset() {
/* 128 */     return new GotoPreset();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetConfigurationResponse createSetConfigurationResponse() {
/* 136 */     return new SetConfigurationResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetPresetTourResponse createGetPresetTourResponse() {
/* 144 */     return new GetPresetTourResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetConfigurationResponse createGetConfigurationResponse() {
/* 152 */     return new GetConfigurationResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetConfiguration createSetConfiguration() {
/* 160 */     return new SetConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetNodesResponse createGetNodesResponse() {
/* 168 */     return new GetNodesResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetPresetTourOptions createGetPresetTourOptions() {
/* 176 */     return new GetPresetTourOptions();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreatePresetTour createCreatePresetTour() {
/* 184 */     return new CreatePresetTour();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetConfiguration createGetConfiguration() {
/* 192 */     return new GetConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetPresetTour createGetPresetTour() {
/* 200 */     return new GetPresetTour();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetPresetTourOptionsResponse createGetPresetTourOptionsResponse() {
/* 208 */     return new GetPresetTourOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetPresetTours createGetPresetTours() {
/* 216 */     return new GetPresetTours();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetConfigurationsResponse createGetConfigurationsResponse() {
/* 224 */     return new GetConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AbsoluteMove createAbsoluteMove() {
/* 232 */     return new AbsoluteMove();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OperatePresetTourResponse createOperatePresetTourResponse() {
/* 240 */     return new OperatePresetTourResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetNodeResponse createGetNodeResponse() {
/* 248 */     return new GetNodeResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SendAuxiliaryCommandResponse createSendAuxiliaryCommandResponse() {
/* 256 */     return new SendAuxiliaryCommandResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetServiceCapabilities createGetServiceCapabilities() {
/* 264 */     return new GetServiceCapabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RemovePresetTour createRemovePresetTour() {
/* 272 */     return new RemovePresetTour();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetPresets createGetPresets() {
/* 280 */     return new GetPresets();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ContinuousMoveResponse createContinuousMoveResponse() {
/* 288 */     return new ContinuousMoveResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetHomePositionResponse createSetHomePositionResponse() {
/* 296 */     return new SetHomePositionResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetCompatibleConfigurations createGetCompatibleConfigurations() {
/* 304 */     return new GetCompatibleConfigurations();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ContinuousMove createContinuousMove() {
/* 312 */     return new ContinuousMove();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RelativeMove createRelativeMove() {
/* 320 */     return new RelativeMove();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ModifyPresetTour createModifyPresetTour() {
/* 328 */     return new ModifyPresetTour();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetPresetToursResponse createGetPresetToursResponse() {
/* 336 */     return new GetPresetToursResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ModifyPresetTourResponse createModifyPresetTourResponse() {
/* 344 */     return new ModifyPresetTourResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetStatus createGetStatus() {
/* 352 */     return new GetStatus();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetPresetResponse createSetPresetResponse() {
/* 360 */     return new SetPresetResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Stop createStop() {
/* 368 */     return new Stop();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AbsoluteMoveResponse createAbsoluteMoveResponse() {
/* 376 */     return new AbsoluteMoveResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GotoHomePositionResponse createGotoHomePositionResponse() {
/* 384 */     return new GotoHomePositionResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetCompatibleConfigurationsResponse createGetCompatibleConfigurationsResponse() {
/* 392 */     return new GetCompatibleConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StopResponse createStopResponse() {
/* 400 */     return new StopResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetConfigurationOptions createGetConfigurationOptions() {
/* 408 */     return new GetConfigurationOptions();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreatePresetTourResponse createCreatePresetTourResponse() {
/* 416 */     return new CreatePresetTourResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetPresetsResponse createGetPresetsResponse() {
/* 424 */     return new GetPresetsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetConfigurations createGetConfigurations() {
/* 432 */     return new GetConfigurations();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RemovePresetTourResponse createRemovePresetTourResponse() {
/* 440 */     return new RemovePresetTourResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetPreset createSetPreset() {
/* 448 */     return new SetPreset();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetStatusResponse createGetStatusResponse() {
/* 456 */     return new GetStatusResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RemovePreset createRemovePreset() {
/* 464 */     return new RemovePreset();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetConfigurationOptionsResponse createGetConfigurationOptionsResponse() {
/* 472 */     return new GetConfigurationOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/ptz/wsdl", name = "Capabilities")
/*     */   public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
/* 481 */     return new JAXBElement(_Capabilities_QNAME, Capabilities.class, null, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\ptz\wsdl\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */