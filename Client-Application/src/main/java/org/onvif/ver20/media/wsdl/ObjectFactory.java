/*     */ package org.onvif.ver20.media.wsdl;
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
/*  34 */   private static final QName _GetVideoEncoderConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoEncoderConfigurationOptions");
/*  35 */   private static final QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "Capabilities");
/*  36 */   private static final QName _StopMulticastStreaming_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "StopMulticastStreaming");
/*  37 */   private static final QName _GetAnalyticsConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAnalyticsConfigurations");
/*  38 */   private static final QName _StartMulticastStreaming_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "StartMulticastStreaming");
/*  39 */   private static final QName _GetVideoSourceConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoSourceConfigurations");
/*  40 */   private static final QName _GetAudioEncoderConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioEncoderConfigurationOptions");
/*  41 */   private static final QName _GetVideoSourceConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoSourceConfigurationOptions");
/*  42 */   private static final QName _GetVideoEncoderConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoEncoderConfigurations");
/*  43 */   private static final QName _GetMetadataConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetMetadataConfigurationOptions");
/*  44 */   private static final QName _GetAudioOutputConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioOutputConfigurationOptions");
/*  45 */   private static final QName _ConfigurationEnumeration_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "ConfigurationEnumeration");
/*  46 */   private static final QName _GetAudioSourceConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioSourceConfigurationOptions");
/*  47 */   private static final QName _GetAudioOutputConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioOutputConfigurations");
/*  48 */   private static final QName _GetAudioDecoderConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioDecoderConfigurationOptions");
/*  49 */   private static final QName _GetMetadataConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetMetadataConfigurations");
/*  50 */   private static final QName _GetAudioSourceConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioSourceConfigurations");
/*  51 */   private static final QName _GetAudioDecoderConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioDecoderConfigurations");
/*  52 */   private static final QName _GetAudioEncoderConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioEncoderConfigurations");
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
/*     */   public GetConfiguration createGetConfiguration() {
/*  66 */     return new GetConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetVideoSourceMode createSetVideoSourceMode() {
/*  74 */     return new SetVideoSourceMode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetMetadataConfigurationsResponse createGetMetadataConfigurationsResponse() {
/*  82 */     return new GetMetadataConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeleteProfileResponse createDeleteProfileResponse() {
/*  90 */     return new DeleteProfileResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetMetadataConfiguration createSetMetadataConfiguration() {
/*  98 */     return new SetMetadataConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetSynchronizationPointResponse createSetSynchronizationPointResponse() {
/* 106 */     return new SetSynchronizationPointResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetAnalyticsConfigurationsResponse createGetAnalyticsConfigurationsResponse() {
/* 114 */     return new GetAnalyticsConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RemoveConfiguration createRemoveConfiguration() {
/* 122 */     return new RemoveConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ConfigurationRef createConfigurationRef() {
/* 130 */     return new ConfigurationRef();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetVideoSourceModeResponse createSetVideoSourceModeResponse() {
/* 138 */     return new SetVideoSourceModeResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetOSDOptions createGetOSDOptions() {
/* 146 */     return new GetOSDOptions();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetAudioSourceConfiguration createSetAudioSourceConfiguration() {
/* 154 */     return new SetAudioSourceConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeleteOSD createDeleteOSD() {
/* 162 */     return new DeleteOSD();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetVideoEncoderConfiguration createSetVideoEncoderConfiguration() {
/* 170 */     return new SetVideoEncoderConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeleteProfile createDeleteProfile() {
/* 178 */     return new DeleteProfile();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetOSDsResponse createGetOSDsResponse() {
/* 186 */     return new GetOSDsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreateProfileResponse createCreateProfileResponse() {
/* 194 */     return new CreateProfileResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetVideoSourceModesResponse createGetVideoSourceModesResponse() {
/* 202 */     return new GetVideoSourceModesResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoSourceMode createVideoSourceMode() {
/* 210 */     return new VideoSourceMode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetAudioOutputConfigurationOptionsResponse createGetAudioOutputConfigurationOptionsResponse() {
/* 218 */     return new GetAudioOutputConfigurationOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetVideoSourceModes createGetVideoSourceModes() {
/* 226 */     return new GetVideoSourceModes();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetStreamUriResponse createGetStreamUriResponse() {
/* 234 */     return new GetStreamUriResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetProfilesResponse createGetProfilesResponse() {
/* 242 */     return new GetProfilesResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MediaProfile createMediaProfile() {
/* 250 */     return new MediaProfile();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetOSD createSetOSD() {
/* 258 */     return new SetOSD();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreateOSDResponse createCreateOSDResponse() {
/* 266 */     return new CreateOSDResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetAudioEncoderConfigurationOptionsResponse createGetAudioEncoderConfigurationOptionsResponse() {
/* 274 */     return new GetAudioEncoderConfigurationOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AddConfiguration createAddConfiguration() {
/* 282 */     return new AddConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetAudioOutputConfigurationsResponse createGetAudioOutputConfigurationsResponse() {
/* 290 */     return new GetAudioOutputConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetProfiles createGetProfiles() {
/* 298 */     return new GetProfiles();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetAudioEncoderConfiguration createSetAudioEncoderConfiguration() {
/* 306 */     return new SetAudioEncoderConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetAudioSourceConfigurationsResponse createGetAudioSourceConfigurationsResponse() {
/* 314 */     return new GetAudioSourceConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetVideoSourceConfiguration createSetVideoSourceConfiguration() {
/* 322 */     return new SetVideoSourceConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetSnapshotUriResponse createGetSnapshotUriResponse() {
/* 330 */     return new GetSnapshotUriResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetAudioDecoderConfiguration createSetAudioDecoderConfiguration() {
/* 338 */     return new SetAudioDecoderConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetVideoEncoderConfigurationOptionsResponse createGetVideoEncoderConfigurationOptionsResponse() {
/* 346 */     return new GetVideoEncoderConfigurationOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetAudioEncoderConfigurationsResponse createGetAudioEncoderConfigurationsResponse() {
/* 354 */     return new GetAudioEncoderConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RemoveConfigurationResponse createRemoveConfigurationResponse() {
/* 362 */     return new RemoveConfigurationResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetConfigurationResponse createSetConfigurationResponse() {
/* 370 */     return new SetConfigurationResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StartStopMulticastStreaming createStartStopMulticastStreaming() {
/* 378 */     return new StartStopMulticastStreaming();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetSynchronizationPoint createSetSynchronizationPoint() {
/* 386 */     return new SetSynchronizationPoint();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreateOSD createCreateOSD() {
/* 394 */     return new CreateOSD();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetAudioDecoderConfigurationsResponse createGetAudioDecoderConfigurationsResponse() {
/* 402 */     return new GetAudioDecoderConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetStreamUri createGetStreamUri() {
/* 410 */     return new GetStreamUri();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AddConfigurationResponse createAddConfigurationResponse() {
/* 418 */     return new AddConfigurationResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetAudioSourceConfigurationOptionsResponse createGetAudioSourceConfigurationOptionsResponse() {
/* 426 */     return new GetAudioSourceConfigurationOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetSnapshotUri createGetSnapshotUri() {
/* 434 */     return new GetSnapshotUri();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SetAudioOutputConfiguration createSetAudioOutputConfiguration() {
/* 442 */     return new SetAudioOutputConfiguration();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetAudioDecoderConfigurationOptionsResponse createGetAudioDecoderConfigurationOptionsResponse() {
/* 450 */     return new GetAudioDecoderConfigurationOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetOSDOptionsResponse createGetOSDOptionsResponse() {
/* 458 */     return new GetOSDOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetMetadataConfigurationOptionsResponse createGetMetadataConfigurationOptionsResponse() {
/* 466 */     return new GetMetadataConfigurationOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetServiceCapabilities createGetServiceCapabilities() {
/* 474 */     return new GetServiceCapabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetVideoSourceConfigurationsResponse createGetVideoSourceConfigurationsResponse() {
/* 482 */     return new GetVideoSourceConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetOSDs createGetOSDs() {
/* 490 */     return new GetOSDs();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Capabilities2 createCapabilities2() {
/* 498 */     return new Capabilities2();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetVideoEncoderConfigurationsResponse createGetVideoEncoderConfigurationsResponse() {
/* 506 */     return new GetVideoEncoderConfigurationsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetVideoSourceConfigurationOptionsResponse createGetVideoSourceConfigurationOptionsResponse() {
/* 514 */     return new GetVideoSourceConfigurationOptionsResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreateProfile createCreateProfile() {
/* 522 */     return new CreateProfile();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StartStopMulticastStreamingResponse createStartStopMulticastStreamingResponse() {
/* 530 */     return new StartStopMulticastStreamingResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetServiceCapabilitiesResponse2 createGetServiceCapabilitiesResponse2() {
/* 538 */     return new GetServiceCapabilitiesResponse2();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ProfileCapabilities createProfileCapabilities() {
/* 546 */     return new ProfileCapabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamingCapabilities createStreamingCapabilities() {
/* 554 */     return new StreamingCapabilities();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ConfigurationSet createConfigurationSet() {
/* 562 */     return new ConfigurationSet();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VideoSourceModeExtension createVideoSourceModeExtension() {
/* 570 */     return new VideoSourceModeExtension();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoEncoderConfigurationOptions")
/*     */   public JAXBElement<GetConfiguration> createGetVideoEncoderConfigurationOptions(GetConfiguration value) {
/* 579 */     return new JAXBElement(_GetVideoEncoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "Capabilities")
/*     */   public JAXBElement<Capabilities2> createCapabilities(Capabilities2 value) {
/* 588 */     return new JAXBElement(_Capabilities_QNAME, Capabilities2.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "StopMulticastStreaming")
/*     */   public JAXBElement<StartStopMulticastStreaming> createStopMulticastStreaming(StartStopMulticastStreaming value) {
/* 597 */     return new JAXBElement(_StopMulticastStreaming_QNAME, StartStopMulticastStreaming.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAnalyticsConfigurations")
/*     */   public JAXBElement<GetConfiguration> createGetAnalyticsConfigurations(GetConfiguration value) {
/* 606 */     return new JAXBElement(_GetAnalyticsConfigurations_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "StartMulticastStreaming")
/*     */   public JAXBElement<StartStopMulticastStreaming> createStartMulticastStreaming(StartStopMulticastStreaming value) {
/* 615 */     return new JAXBElement(_StartMulticastStreaming_QNAME, StartStopMulticastStreaming.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoSourceConfigurations")
/*     */   public JAXBElement<GetConfiguration> createGetVideoSourceConfigurations(GetConfiguration value) {
/* 624 */     return new JAXBElement(_GetVideoSourceConfigurations_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioEncoderConfigurationOptions")
/*     */   public JAXBElement<GetConfiguration> createGetAudioEncoderConfigurationOptions(GetConfiguration value) {
/* 633 */     return new JAXBElement(_GetAudioEncoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoSourceConfigurationOptions")
/*     */   public JAXBElement<GetConfiguration> createGetVideoSourceConfigurationOptions(GetConfiguration value) {
/* 642 */     return new JAXBElement(_GetVideoSourceConfigurationOptions_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoEncoderConfigurations")
/*     */   public JAXBElement<GetConfiguration> createGetVideoEncoderConfigurations(GetConfiguration value) {
/* 651 */     return new JAXBElement(_GetVideoEncoderConfigurations_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetMetadataConfigurationOptions")
/*     */   public JAXBElement<GetConfiguration> createGetMetadataConfigurationOptions(GetConfiguration value) {
/* 660 */     return new JAXBElement(_GetMetadataConfigurationOptions_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioOutputConfigurationOptions")
/*     */   public JAXBElement<GetConfiguration> createGetAudioOutputConfigurationOptions(GetConfiguration value) {
/* 669 */     return new JAXBElement(_GetAudioOutputConfigurationOptions_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "ConfigurationEnumeration")
/*     */   public JAXBElement<ConfigurationEnumeration> createConfigurationEnumeration(ConfigurationEnumeration value) {
/* 678 */     return new JAXBElement(_ConfigurationEnumeration_QNAME, ConfigurationEnumeration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioSourceConfigurationOptions")
/*     */   public JAXBElement<GetConfiguration> createGetAudioSourceConfigurationOptions(GetConfiguration value) {
/* 687 */     return new JAXBElement(_GetAudioSourceConfigurationOptions_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioOutputConfigurations")
/*     */   public JAXBElement<GetConfiguration> createGetAudioOutputConfigurations(GetConfiguration value) {
/* 696 */     return new JAXBElement(_GetAudioOutputConfigurations_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioDecoderConfigurationOptions")
/*     */   public JAXBElement<GetConfiguration> createGetAudioDecoderConfigurationOptions(GetConfiguration value) {
/* 705 */     return new JAXBElement(_GetAudioDecoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetMetadataConfigurations")
/*     */   public JAXBElement<GetConfiguration> createGetMetadataConfigurations(GetConfiguration value) {
/* 714 */     return new JAXBElement(_GetMetadataConfigurations_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioSourceConfigurations")
/*     */   public JAXBElement<GetConfiguration> createGetAudioSourceConfigurations(GetConfiguration value) {
/* 723 */     return new JAXBElement(_GetAudioSourceConfigurations_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioDecoderConfigurations")
/*     */   public JAXBElement<GetConfiguration> createGetAudioDecoderConfigurations(GetConfiguration value) {
/* 732 */     return new JAXBElement(_GetAudioDecoderConfigurations_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioEncoderConfigurations")
/*     */   public JAXBElement<GetConfiguration> createGetAudioEncoderConfigurations(GetConfiguration value) {
/* 741 */     return new JAXBElement(_GetAudioEncoderConfigurations_QNAME, GetConfiguration.class, null, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver20\media\wsdl\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */