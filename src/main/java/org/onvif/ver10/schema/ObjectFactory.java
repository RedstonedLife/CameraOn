/*      */ package org.onvif.ver10.schema;
/*      */ 
/*      */ import javax.xml.bind.JAXBElement;
/*      */ import javax.xml.bind.annotation.XmlElementDecl;
/*      */ import javax.xml.bind.annotation.XmlRegistry;
/*      */ import javax.xml.namespace.QName;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @XmlRegistry
/*      */ public class ObjectFactory
/*      */ {
/*   26 */   private static final QName _VideoSourceConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoSourceConfiguration");
/*   27 */   private static final QName _MetadataStream_QNAME = new QName("http://www.onvif.org/ver10/schema", "MetadataStream");
/*   28 */   private static final QName _AudioEncoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioEncoderConfiguration");
/*   29 */   private static final QName _VideoEncoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoEncoderConfiguration");
/*   30 */   private static final QName _VideoAnalyticsConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "VideoAnalyticsConfiguration");
/*   31 */   private static final QName _AudioOutputConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioOutputConfiguration");
/*   32 */   private static final QName _Polygon_QNAME = new QName("http://www.onvif.org/ver10/schema", "Polygon");
/*   33 */   private static final QName _Polyline_QNAME = new QName("http://www.onvif.org/ver10/schema", "Polyline");
/*   34 */   private static final QName _AudioSourceConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioSourceConfiguration");
/*   35 */   private static final QName _MetadataConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "MetadataConfiguration");
/*   36 */   private static final QName _PTZConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "PTZConfiguration");
/*   37 */   private static final QName _AudioDecoderConfiguration_QNAME = new QName("http://www.onvif.org/ver10/schema", "AudioDecoderConfiguration");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ItemListDescription createItemListDescription() {
/*   51 */     return new ItemListDescription();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ConfigDescription createConfigDescription() {
/*   59 */     return new ConfigDescription();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Behaviour createBehaviour() {
/*   67 */     return new Behaviour();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ColorDescriptor createColorDescriptor() {
/*   75 */     return new ColorDescriptor();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EventSubscription createEventSubscription() {
/*   83 */     return new EventSubscription();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClassDescriptor createClassDescriptor() {
/*   91 */     return new ClassDescriptor();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ItemList createItemList() {
/*   99 */     return new ItemList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public User createUser() {
/*  107 */     return new User();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Scope createScope() {
/*  115 */     return new Scope();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot11AvailableNetworks createDot11AvailableNetworks() {
/*  123 */     return new Dot11AvailableNetworks();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NTPInformation createNTPInformation() {
/*  131 */     return new NTPInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DynamicDNSInformation createDynamicDNSInformation() {
/*  139 */     return new DynamicDNSInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot1XConfiguration createDot1XConfiguration() {
/*  147 */     return new Dot1XConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AttachmentData createAttachmentData() {
/*  155 */     return new AttachmentData();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkZeroConfiguration createNetworkZeroConfiguration() {
/*  163 */     return new NetworkZeroConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Certificate createCertificate() {
/*  171 */     return new Certificate();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BackupFile createBackupFile() {
/*  179 */     return new BackupFile();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RelayOutput createRelayOutput() {
/*  187 */     return new RelayOutput();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemDateTime createSystemDateTime() {
/*  195 */     return new SystemDateTime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TimeZone createTimeZone() {
/*  203 */     return new TimeZone();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DateTime createDateTime() {
/*  211 */     return new DateTime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Capabilities createCapabilities() {
/*  219 */     return new Capabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CertificateStatus createCertificateStatus() {
/*  227 */     return new CertificateStatus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SupportInformation createSupportInformation() {
/*  235 */     return new SupportInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CertificateInformation createCertificateInformation() {
/*  243 */     return new CertificateInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkHost createNetworkHost() {
/*  251 */     return new NetworkHost();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RemoteUser createRemoteUser() {
/*  259 */     return new RemoteUser();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RelayOutputSettings createRelayOutputSettings() {
/*  267 */     return new RelayOutputSettings();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public HostnameInformation createHostnameInformation() {
/*  275 */     return new HostnameInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot11Status createDot11Status() {
/*  283 */     return new Dot11Status();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BinaryData createBinaryData() {
/*  291 */     return new BinaryData();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPAddressFilter createIPAddressFilter() {
/*  299 */     return new IPAddressFilter();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkInterfaceSetConfiguration createNetworkInterfaceSetConfiguration() {
/*  307 */     return new NetworkInterfaceSetConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkProtocol createNetworkProtocol() {
/*  315 */     return new NetworkProtocol();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemLogUriList createSystemLogUriList() {
/*  323 */     return new SystemLogUriList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DNSInformation createDNSInformation() {
/*  331 */     return new DNSInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkInterface createNetworkInterface() {
/*  339 */     return new NetworkInterface();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CertificateWithPrivateKey createCertificateWithPrivateKey() {
/*  347 */     return new CertificateWithPrivateKey();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPAddress createIPAddress() {
/*  355 */     return new IPAddress();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot11Capabilities createDot11Capabilities() {
/*  363 */     return new Dot11Capabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkGateway createNetworkGateway() {
/*  371 */     return new NetworkGateway();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemLog createSystemLog() {
/*  379 */     return new SystemLog();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioSourceConfiguration createAudioSourceConfiguration() {
/*  387 */     return new AudioSourceConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZConfiguration createPTZConfiguration() {
/*  395 */     return new PTZConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoSourceConfiguration createVideoSourceConfiguration() {
/*  403 */     return new VideoSourceConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Message createMessage() {
/*  411 */     return new Message();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MessageExtension createMessageExtension() {
/*  419 */     return new MessageExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioEncoderConfiguration createAudioEncoderConfiguration() {
/*  427 */     return new AudioEncoderConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoEncoderConfiguration createVideoEncoderConfiguration() {
/*  435 */     return new VideoEncoderConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataStream createMetadataStream() {
/*  443 */     return new MetadataStream();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioDecoderConfiguration createAudioDecoderConfiguration() {
/*  451 */     return new AudioDecoderConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoAnalyticsConfiguration createVideoAnalyticsConfiguration() {
/*  459 */     return new VideoAnalyticsConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioOutputConfiguration createAudioOutputConfiguration() {
/*  467 */     return new AudioOutputConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Polygon createPolygon() {
/*  475 */     return new Polygon();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataConfiguration createMetadataConfiguration() {
/*  483 */     return new MetadataConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Polyline createPolyline() {
/*  491 */     return new Polyline();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IrCutFilterAutoAdjustment createIrCutFilterAutoAdjustment() {
/*  499 */     return new IrCutFilterAutoAdjustment();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZNodeExtension2 createPTZNodeExtension2() {
/*  507 */     return new PTZNodeExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WideDynamicRangeOptions20 createWideDynamicRangeOptions20() {
/*  515 */     return new WideDynamicRangeOptions20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CertificateGenerationParametersExtension createCertificateGenerationParametersExtension() {
/*  523 */     return new CertificateGenerationParametersExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZSpacesExtension createPTZSpacesExtension() {
/*  531 */     return new PTZSpacesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EFlip createEFlip() {
/*  539 */     return new EFlip();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoAttributes createVideoAttributes() {
/*  547 */     return new VideoAttributes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MediaAttributes createMediaAttributes() {
/*  555 */     return new MediaAttributes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SearchCapabilities createSearchCapabilities() {
/*  563 */     return new SearchCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public G726DecOptions createG726DecOptions() {
/*  571 */     return new G726DecOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeviceEntity createDeviceEntity() {
/*  579 */     return new DeviceEntity();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZVector createPTZVector() {
/*  587 */     return new PTZVector();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AACDecOptions createAACDecOptions() {
/*  595 */     return new AACDecOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingStatus20Extension createImagingStatus20Extension() {
/*  603 */     return new ImagingStatus20Extension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZConfigurationOptions createPTZConfigurationOptions() {
/*  611 */     return new PTZConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPv6ConfigurationExtension createIPv6ConfigurationExtension() {
/*  619 */     return new IPv6ConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoOutputConfigurationOptions createVideoOutputConfigurationOptions() {
/*  627 */     return new VideoOutputConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rename createRename() {
/*  635 */     return new Rename();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public G711DecOptions createG711DecOptions() {
/*  643 */     return new G711DecOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CertificateGenerationParameters createCertificateGenerationParameters() {
/*  651 */     return new CertificateGenerationParameters();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Receiver createReceiver() {
/*  659 */     return new Receiver();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Transport createTransport() {
/*  667 */     return new Transport();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourSpotOptions createPTZPresetTourSpotOptions() {
/*  675 */     return new PTZPresetTourSpotOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot11Configuration createDot11Configuration() {
/*  683 */     return new Dot11Configuration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PolylineArrayExtension createPolylineArrayExtension() {
/*  691 */     return new PolylineArrayExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EventFilter createEventFilter() {
/*  699 */     return new EventFilter();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PolygonConfiguration createPolygonConfiguration() {
/*  707 */     return new PolygonConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetTracksResponseList createGetTracksResponseList() {
/*  715 */     return new GetTracksResponseList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RotateOptions createRotateOptions() {
/*  723 */     return new RotateOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SupportedRules createSupportedRules() {
/*  731 */     return new SupportedRules();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkInterfaceExtension createNetworkInterfaceExtension() {
/*  739 */     return new NetworkInterfaceExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDConfigurationOptionsExtension createOSDConfigurationOptionsExtension() {
/*  747 */     return new OSDConfigurationOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BacklightCompensationOptions createBacklightCompensationOptions() {
/*  755 */     return new BacklightCompensationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioDecoderConfigurationOptionsExtension createAudioDecoderConfigurationOptionsExtension() {
/*  763 */     return new AudioDecoderConfigurationOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Merge createMerge() {
/*  771 */     return new Merge();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rotate createRotate() {
/*  779 */     return new Rotate();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDConfigurationExtension createOSDConfigurationExtension() {
/*  787 */     return new OSDConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemCapabilitiesExtension createSystemCapabilitiesExtension() {
/*  795 */     return new SystemCapabilitiesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PaneOptionExtension createPaneOptionExtension() {
/*  803 */     return new PaneOptionExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IrCutFilterAutoAdjustmentOptions createIrCutFilterAutoAdjustmentOptions() {
/*  811 */     return new IrCutFilterAutoAdjustmentOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZStatusFilterOptionsExtension createPTZStatusFilterOptionsExtension() {
/*  819 */     return new PTZStatusFilterOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDColor createOSDColor() {
/*  827 */     return new OSDColor();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Split createSplit() {
/*  835 */     return new Split();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourStartingConditionOptions createPTZPresetTourStartingConditionOptions() {
/*  843 */     return new PTZPresetTourStartingConditionOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DisplayCapabilities createDisplayCapabilities() {
/*  851 */     return new DisplayCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PolylineArray createPolylineArray() {
/*  859 */     return new PolylineArray();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rectangle createRectangle() {
/*  867 */     return new Rectangle();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TLSConfiguration createTLSConfiguration() {
/*  875 */     return new TLSConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkInterfaceConnectionSetting createNetworkInterfaceConnectionSetting() {
/*  883 */     return new NetworkInterfaceConnectionSetting();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SourceIdentificationExtension createSourceIdentificationExtension() {
/*  891 */     return new SourceIdentificationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsEngineInput createAnalyticsEngineInput() {
/*  899 */     return new AnalyticsEngineInput();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ColorOptions createColorOptions() {
/*  907 */     return new ColorOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsDeviceCapabilities createAnalyticsDeviceCapabilities() {
/*  915 */     return new AnalyticsDeviceCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SourceReference createSourceReference() {
/*  923 */     return new SourceReference();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingCapabilities createRecordingCapabilities() {
/*  931 */     return new RecordingCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDPosConfigurationExtension createOSDPosConfigurationExtension() {
/*  939 */     return new OSDPosConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MediaCapabilities createMediaCapabilities() {
/*  947 */     return new MediaCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkZeroConfigurationExtension createNetworkZeroConfigurationExtension() {
/*  955 */     return new NetworkZeroConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusOptions20 createFocusOptions20() {
/*  963 */     return new FocusOptions20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ConfigDescriptionExtension createConfigDescriptionExtension() {
/*  971 */     return new ConfigDescriptionExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MulticastConfiguration createMulticastConfiguration() {
/*  979 */     return new MulticastConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SourceIdentification createSourceIdentification() {
/*  987 */     return new SourceIdentification();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ZoomLimits createZoomLimits() {
/*  995 */     return new ZoomLimits();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ExposureOptions20 createExposureOptions20() {
/* 1003 */     return new ExposureOptions20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoOutput createVideoOutput() {
/* 1011 */     return new VideoOutput();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoEncoderConfigurationOptions createVideoEncoderConfigurationOptions() {
/* 1019 */     return new VideoEncoderConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JpegOptions2 createJpegOptions2() {
/* 1027 */     return new JpegOptions2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPv6Configuration createIPv6Configuration() {
/* 1035 */     return new IPv6Configuration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataConfigurationOptions createMetadataConfigurationOptions() {
/* 1043 */     return new MetadataConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoResolution createVideoResolution() {
/* 1051 */     return new VideoResolution();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataAttributes createMetadataAttributes() {
/* 1059 */     return new MetadataAttributes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoSourceConfigurationOptions createVideoSourceConfigurationOptions() {
/* 1067 */     return new VideoSourceConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JpegDecOptions createJpegDecOptions() {
/* 1075 */     return new JpegDecOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ItemListDescriptionExtension createItemListDescriptionExtension() {
/* 1083 */     return new ItemListDescriptionExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GenericEapPwdConfigurationExtension createGenericEapPwdConfigurationExtension() {
/* 1091 */     return new GenericEapPwdConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LayoutOptionsExtension createLayoutOptionsExtension() {
/* 1099 */     return new LayoutOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mpeg4Configuration createMpeg4Configuration() {
/* 1107 */     return new Mpeg4Configuration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioSource createAudioSource() {
/* 1115 */     return new AudioSource();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImageStabilizationOptions createImageStabilizationOptions() {
/* 1123 */     return new ImageStabilizationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EAPMethodConfiguration createEAPMethodConfiguration() {
/* 1131 */     return new EAPMethodConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusOptions20Extension createFocusOptions20Extension() {
/* 1139 */     return new FocusOptions20Extension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ReverseOptions createReverseOptions() {
/* 1147 */     return new ReverseOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ColorspaceRange createColorspaceRange() {
/* 1155 */     return new ColorspaceRange();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusStatus20Extension createFocusStatus20Extension() {
/* 1163 */     return new FocusStatus20Extension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public H264Options2 createH264Options2() {
/* 1171 */     return new H264Options2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public H264DecOptions createH264DecOptions() {
/* 1179 */     return new H264DecOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDReference createOSDReference() {
/* 1187 */     return new OSDReference();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AbsoluteFocus createAbsoluteFocus() {
/* 1195 */     return new AbsoluteFocus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZStatus createPTZStatus() {
/* 1203 */     return new PTZStatus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DynamicDNSInformationExtension createDynamicDNSInformationExtension() {
/* 1211 */     return new DynamicDNSInformationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPv6NetworkInterfaceSetConfiguration createIPv6NetworkInterfaceSetConfiguration() {
/* 1219 */     return new IPv6NetworkInterfaceSetConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobConfiguration createRecordingJobConfiguration() {
/* 1227 */     return new RecordingJobConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioClassDescriptor createAudioClassDescriptor() {
/* 1235 */     return new AudioClassDescriptor();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TrackConfiguration createTrackConfiguration() {
/* 1243 */     return new TrackConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Space2DDescription createSpace2DDescription() {
/* 1251 */     return new Space2DDescription();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkZeroConfigurationExtension2 createNetworkZeroConfigurationExtension2() {
/* 1259 */     return new NetworkZeroConfigurationExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobStateSource createRecordingJobStateSource() {
/* 1267 */     return new RecordingJobStateSource();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IOCapabilities createIOCapabilities() {
/* 1275 */     return new IOCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DateTimeRange createDateTimeRange() {
/* 1283 */     return new DateTimeRange();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TrackAttributes createTrackAttributes() {
/* 1291 */     return new TrackAttributes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CertificateUsage createCertificateUsage() {
/* 1299 */     return new CertificateUsage();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Transformation createTransformation() {
/* 1307 */     return new Transformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PaneLayoutOptions createPaneLayoutOptions() {
/* 1315 */     return new PaneLayoutOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnyHolder createAnyHolder() {
/* 1323 */     return new AnyHolder();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Space1DDescription createSpace1DDescription() {
/* 1331 */     return new Space1DDescription();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PolylineArrayConfiguration createPolylineArrayConfiguration() {
/* 1339 */     return new PolylineArrayConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImageStabilization createImageStabilization() {
/* 1347 */     return new ImageStabilization();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioClassDescriptorExtension createAudioClassDescriptorExtension() {
/* 1355 */     return new AudioClassDescriptorExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot11SecurityConfiguration createDot11SecurityConfiguration() {
/* 1363 */     return new Dot11SecurityConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPv4NetworkInterfaceSetConfiguration createIPv4NetworkInterfaceSetConfiguration() {
/* 1371 */     return new IPv4NetworkInterfaceSetConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Vector1D createVector1D() {
/* 1379 */     return new Vector1D();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourSupportedExtension createPTZPresetTourSupportedExtension() {
/* 1387 */     return new PTZPresetTourSupportedExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WhiteBalance createWhiteBalance() {
/* 1395 */     return new WhiteBalance();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingInformation createRecordingInformation() {
/* 1403 */     return new RecordingInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPositionFilter createPTZPositionFilter() {
/* 1411 */     return new PTZPositionFilter();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingSettings createImagingSettings() {
/* 1419 */     return new ImagingSettings();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Color createColor() {
/* 1427 */     return new Color();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkCapabilitiesExtension2 createNetworkCapabilitiesExtension2() {
/* 1435 */     return new NetworkCapabilitiesExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MediaUri createMediaUri() {
/* 1443 */     return new MediaUri();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindPTZPositionResult createFindPTZPositionResult() {
/* 1451 */     return new FindPTZPositionResult();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRecordingsResponseItem createGetRecordingsResponseItem() {
/* 1459 */     return new GetRecordingsResponseItem();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Vector2D createVector2D() {
/* 1467 */     return new Vector2D();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ObjectTreeExtension createObjectTreeExtension() {
/* 1475 */     return new ObjectTreeExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobStateTrack createRecordingJobStateTrack() {
/* 1483 */     return new RecordingJobStateTrack();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZConfigurationExtension createPTZConfigurationExtension() {
/* 1491 */     return new PTZConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkInterfaceLink createNetworkInterfaceLink() {
/* 1499 */     return new NetworkInterfaceLink();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioSourceConfigurationOptions createAudioSourceConfigurationOptions() {
/* 1507 */     return new AudioSourceConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ReverseOptionsExtension createReverseOptionsExtension() {
/* 1515 */     return new ReverseOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MessageDescription createMessageDescription() {
/* 1523 */     return new MessageDescription();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JpegOptions createJpegOptions() {
/* 1531 */     return new JpegOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IntRectangleRange createIntRectangleRange() {
/* 1539 */     return new IntRectangleRange();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EFlipOptions createEFlipOptions() {
/* 1547 */     return new EFlipOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsStateInformation createAnalyticsStateInformation() {
/* 1555 */     return new AnalyticsStateInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPv6NetworkInterface createIPv6NetworkInterface() {
/* 1563 */     return new IPv6NetworkInterface();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioDescriptor createAudioDescriptor() {
/* 1571 */     return new AudioDescriptor();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ProfileCapabilities createProfileCapabilities() {
/* 1579 */     return new ProfileCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BacklightCompensation20 createBacklightCompensation20() {
/* 1587 */     return new BacklightCompensation20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImageStabilizationExtension createImageStabilizationExtension() {
/* 1595 */     return new ImageStabilizationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EventStreamExtension createEventStreamExtension() {
/* 1603 */     return new EventStreamExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IOCapabilitiesExtension createIOCapabilitiesExtension() {
/* 1611 */     return new IOCapabilitiesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDConfigurationOptions createOSDConfigurationOptions() {
/* 1619 */     return new OSDConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusStatus20 createFocusStatus20() {
/* 1627 */     return new FocusStatus20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RelativeFocusOptions20 createRelativeFocusOptions20() {
/* 1635 */     return new RelativeFocusOptions20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataInputExtension createMetadataInputExtension() {
/* 1643 */     return new MetadataInputExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioAnalyticsStreamExtension createAudioAnalyticsStreamExtension() {
/* 1651 */     return new AudioAnalyticsStreamExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioAnalyticsStream createAudioAnalyticsStream() {
/* 1659 */     return new AudioAnalyticsStream();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDColorOptionsExtension createOSDColorOptionsExtension() {
/* 1667 */     return new OSDColorOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EventCapabilities createEventCapabilities() {
/* 1675 */     return new EventCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioEncoderConfigurationOption createAudioEncoderConfigurationOption() {
/* 1683 */     return new AudioEncoderConfigurationOption();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BacklightCompensationOptions20 createBacklightCompensationOptions20() {
/* 1691 */     return new BacklightCompensationOptions20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataFilter createMetadataFilter() {
/* 1699 */     return new MetadataFilter();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZNodeExtension createPTZNodeExtension() {
/* 1707 */     return new PTZNodeExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingStatus createImagingStatus() {
/* 1715 */     return new ImagingStatus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WhiteBalance20 createWhiteBalance20() {
/* 1723 */     return new WhiteBalance20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDConfiguration createOSDConfiguration() {
/* 1731 */     return new OSDConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusStatus createFocusStatus() {
/* 1739 */     return new FocusStatus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Frame createFrame() {
/* 1747 */     return new Frame();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPAddressFilterExtension createIPAddressFilterExtension() {
/* 1755 */     return new IPAddressFilterExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ReplayCapabilities createReplayCapabilities() {
/* 1763 */     return new ReplayCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ContinuousFocus createContinuousFocus() {
/* 1771 */     return new ContinuousFocus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MotionExpressionConfiguration createMotionExpressionConfiguration() {
/* 1779 */     return new MotionExpressionConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobConfigurationExtension createRecordingJobConfigurationExtension() {
/* 1787 */     return new RecordingJobConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourOptions createPTZPresetTourOptions() {
/* 1795 */     return new PTZPresetTourOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public StreamSetup createStreamSetup() {
/* 1803 */     return new StreamSetup();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IntRectangle createIntRectangle() {
/* 1811 */     return new IntRectangle();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoDecoderConfigurationOptionsExtension createVideoDecoderConfigurationOptionsExtension() {
/* 1819 */     return new VideoDecoderConfigurationOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTControlDirection createPTControlDirection() {
/* 1827 */     return new PTControlDirection();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoRateControl createVideoRateControl() {
/* 1835 */     return new VideoRateControl();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RelativeFocus createRelativeFocus() {
/* 1843 */     return new RelativeFocus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetTracksResponseItem createGetTracksResponseItem() {
/* 1851 */     return new GetTracksResponseItem();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Vector createVector() {
/* 1859 */     return new Vector();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusConfiguration createFocusConfiguration() {
/* 1867 */     return new FocusConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ProfileExtension createProfileExtension() {
/* 1875 */     return new ProfileExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BehaviourExtension createBehaviourExtension() {
/* 1883 */     return new BehaviourExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IrCutFilterAutoAdjustmentExtension createIrCutFilterAutoAdjustmentExtension() {
/* 1891 */     return new IrCutFilterAutoAdjustmentExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingOptions20Extension2 createImagingOptions20Extension2() {
/* 1899 */     return new ImagingOptions20Extension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkCapabilities createNetworkCapabilities() {
/* 1907 */     return new NetworkCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingOptions20Extension3 createImagingOptions20Extension3() {
/* 1915 */     return new ImagingOptions20Extension3();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobStateInformationExtension createRecordingJobStateInformationExtension() {
/* 1923 */     return new RecordingJobStateInformationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ObjectTree createObjectTree() {
/* 1931 */     return new ObjectTree();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZCapabilities createPTZCapabilities() {
/* 1939 */     return new PTZCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusConfiguration20 createFocusConfiguration20() {
/* 1947 */     return new FocusConfiguration20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDImgConfigurationExtension createOSDImgConfigurationExtension() {
/* 1955 */     return new OSDImgConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TrackAttributesExtension createTrackAttributesExtension() {
/* 1963 */     return new TrackAttributesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemCapabilities createSystemCapabilities() {
/* 1971 */     return new SystemCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WhiteBalanceOptions20Extension createWhiteBalanceOptions20Extension() {
/* 1979 */     return new WhiteBalanceOptions20Extension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkInterfaceInfo createNetworkInterfaceInfo() {
/* 1987 */     return new NetworkInterfaceInfo();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoSourceExtension2 createVideoSourceExtension2() {
/* 1995 */     return new VideoSourceExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindMetadataResultList createFindMetadataResultList() {
/* 2003 */     return new FindMetadataResultList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsEngineInputInfoExtension createAnalyticsEngineInputInfoExtension() {
/* 2011 */     return new AnalyticsEngineInputInfoExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ReceiverCapabilities createReceiverCapabilities() {
/* 2019 */     return new ReceiverCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindRecordingResultList createFindRecordingResultList() {
/* 2027 */     return new FindRecordingResultList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemDateTimeExtension createSystemDateTimeExtension() {
/* 2035 */     return new SystemDateTimeExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindPTZPositionResultList createFindPTZPositionResultList() {
/* 2043 */     return new FindPTZPositionResultList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RuleEngineConfigurationExtension createRuleEngineConfigurationExtension() {
/* 2051 */     return new RuleEngineConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClassDescriptorExtension createClassDescriptorExtension() {
/* 2059 */     return new ClassDescriptorExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkInterfaceSetConfigurationExtension2 createNetworkInterfaceSetConfigurationExtension2() {
/* 2067 */     return new NetworkInterfaceSetConfigurationExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot3Configuration createDot3Configuration() {
/* 2075 */     return new Dot3Configuration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDTextConfigurationExtension createOSDTextConfigurationExtension() {
/* 2083 */     return new OSDTextConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsEngineInputInfo createAnalyticsEngineInputInfo() {
/* 2091 */     return new AnalyticsEngineInputInfo();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoOutputExtension createVideoOutputExtension() {
/* 2099 */     return new VideoOutputExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ExposureOptions createExposureOptions() {
/* 2107 */     return new ExposureOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoSourceConfigurationOptionsExtension2 createVideoSourceConfigurationOptionsExtension2() {
/* 2115 */     return new VideoSourceConfigurationOptionsExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ReplayConfiguration createReplayConfiguration() {
/* 2123 */     return new ReplayConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IrCutFilterAutoAdjustmentOptionsExtension createIrCutFilterAutoAdjustmentOptionsExtension() {
/* 2131 */     return new IrCutFilterAutoAdjustmentOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDColorOptions createOSDColorOptions() {
/* 2139 */     return new OSDColorOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZStatusFilterOptions createPTZStatusFilterOptions() {
/* 2147 */     return new PTZStatusFilterOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemCapabilitiesExtension2 createSystemCapabilitiesExtension2() {
/* 2155 */     return new SystemCapabilitiesExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoEncoderOptionsExtension2 createVideoEncoderOptionsExtension2() {
/* 2163 */     return new VideoEncoderOptionsExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RelativeFocusOptions createRelativeFocusOptions() {
/* 2171 */     return new RelativeFocusOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoSourceConfigurationExtension2 createVideoSourceConfigurationExtension2() {
/* 2179 */     return new VideoSourceConfigurationExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusMove createFocusMove() {
/* 2187 */     return new FocusMove();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsEngineControl createAnalyticsEngineControl() {
/* 2195 */     return new AnalyticsEngineControl();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ObjectId createObjectId() {
/* 2203 */     return new ObjectId();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CellLayout createCellLayout() {
/* 2211 */     return new CellLayout();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Profile createProfile() {
/* 2219 */     return new Profile();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingSettingsExtension202 createImagingSettingsExtension202() {
/* 2227 */     return new ImagingSettingsExtension202();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SearchScopeExtension createSearchScopeExtension() {
/* 2235 */     return new SearchScopeExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingSettingsExtension203 createImagingSettingsExtension203() {
/* 2243 */     return new ImagingSettingsExtension203();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImageStabilizationOptionsExtension createImageStabilizationOptionsExtension() {
/* 2251 */     return new ImageStabilizationOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ColorDescriptorExtension createColorDescriptorExtension() {
/* 2259 */     return new ColorDescriptorExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Layout createLayout() {
/* 2267 */     return new Layout();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkInterfaceSetConfigurationExtension createNetworkInterfaceSetConfigurationExtension() {
/* 2275 */     return new NetworkInterfaceSetConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SecurityCapabilities createSecurityCapabilities() {
/* 2283 */     return new SecurityCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IOCapabilitiesExtension2 createIOCapabilitiesExtension2() {
/* 2291 */     return new IOCapabilitiesExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AppearanceExtension createAppearanceExtension() {
/* 2299 */     return new AppearanceExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobSourceExtension createRecordingJobSourceExtension() {
/* 2307 */     return new RecordingJobSourceExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindEventResult createFindEventResult() {
/* 2315 */     return new FindEventResult();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingConfiguration createRecordingConfiguration() {
/* 2323 */     return new RecordingConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FloatList createFloatList() {
/* 2331 */     return new FloatList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PaneConfiguration createPaneConfiguration() {
/* 2339 */     return new PaneConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MediaCapabilitiesExtension createMediaCapabilitiesExtension() {
/* 2347 */     return new MediaCapabilitiesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPv4NetworkInterface createIPv4NetworkInterface() {
/* 2355 */     return new IPv4NetworkInterface();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoEncoderOptionsExtension createVideoEncoderOptionsExtension() {
/* 2363 */     return new VideoEncoderOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioSourceOptionsExtension createAudioSourceOptionsExtension() {
/* 2371 */     return new AudioSourceOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourSupported createPTZPresetTourSupported() {
/* 2379 */     return new PTZPresetTourSupported();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IntList createIntList() {
/* 2387 */     return new IntList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CertificateInformationExtension createCertificateInformationExtension() {
/* 2395 */     return new CertificateInformationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourStartingConditionExtension createPTZPresetTourStartingConditionExtension() {
/* 2403 */     return new PTZPresetTourStartingConditionExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LayoutOptions createLayoutOptions() {
/* 2411 */     return new LayoutOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ContinuousFocusOptions createContinuousFocusOptions() {
/* 2419 */     return new ContinuousFocusOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataConfigurationExtension createMetadataConfigurationExtension() {
/* 2427 */     return new MetadataConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CapabilitiesExtension createCapabilitiesExtension() {
/* 2435 */     return new CapabilitiesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZStreamExtension createPTZStreamExtension() {
/* 2443 */     return new PTZStreamExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioDecoderConfigurationOptions createAudioDecoderConfigurationOptions() {
/* 2451 */     return new AudioDecoderConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DurationRange createDurationRange() {
/* 2459 */     return new DurationRange();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioEncoderConfigurationOptions createAudioEncoderConfigurationOptions() {
/* 2467 */     return new AudioEncoderConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemLogUri createSystemLogUri() {
/* 2475 */     return new SystemLogUri();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsEngineConfigurationExtension createAnalyticsEngineConfigurationExtension() {
/* 2483 */     return new AnalyticsEngineConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mpeg4Options createMpeg4Options() {
/* 2491 */     return new Mpeg4Options();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZFilter createPTZFilter() {
/* 2499 */     return new PTZFilter();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeviceCapabilitiesExtension createDeviceCapabilitiesExtension() {
/* 2507 */     return new DeviceCapabilitiesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot11AvailableNetworksExtension createDot11AvailableNetworksExtension() {
/* 2515 */     return new Dot11AvailableNetworksExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot11PSKSet createDot11PSKSet() {
/* 2523 */     return new Dot11PSKSet();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsCapabilities createAnalyticsCapabilities() {
/* 2531 */     return new AnalyticsCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EapMethodExtension createEapMethodExtension() {
/* 2539 */     return new EapMethodExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPreset createPTZPreset() {
/* 2547 */     return new PTZPreset();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WideDynamicRange createWideDynamicRange() {
/* 2555 */     return new WideDynamicRange();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusConfiguration20Extension createFocusConfiguration20Extension() {
/* 2563 */     return new FocusConfiguration20Extension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UserExtension createUserExtension() {
/* 2571 */     return new UserExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZSpaces createPTZSpaces() {
/* 2579 */     return new PTZSpaces();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SupportedAnalyticsModulesExtension createSupportedAnalyticsModulesExtension() {
/* 2587 */     return new SupportedAnalyticsModulesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SupportedRulesExtension createSupportedRulesExtension() {
/* 2595 */     return new SupportedRulesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Exposure20 createExposure20() {
/* 2603 */     return new Exposure20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsEngineConfiguration createAnalyticsEngineConfiguration() {
/* 2611 */     return new AnalyticsEngineConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IPv4Configuration createIPv4Configuration() {
/* 2619 */     return new IPv4Configuration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Exposure createExposure() {
/* 2627 */     return new Exposure();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClassDescriptorExtension2 createClassDescriptorExtension2() {
/* 2635 */     return new ClassDescriptorExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot1XConfigurationExtension createDot1XConfigurationExtension() {
/* 2643 */     return new Dot1XConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ShapeDescriptor createShapeDescriptor() {
/* 2651 */     return new ShapeDescriptor();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataStreamExtension createMetadataStreamExtension() {
/* 2659 */     return new MetadataStreamExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OtherType createOtherType() {
/* 2667 */     return new OtherType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SearchScope createSearchScope() {
/* 2675 */     return new SearchScope();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoSourceExtension createVideoSourceExtension() {
/* 2683 */     return new VideoSourceExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourStartingCondition createPTZPresetTourStartingCondition() {
/* 2691 */     return new PTZPresetTourStartingCondition();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EngineConfiguration createEngineConfiguration() {
/* 2699 */     return new EngineConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SecurityCapabilitiesExtension createSecurityCapabilitiesExtension() {
/* 2707 */     return new SecurityCapabilitiesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FrameExtension2 createFrameExtension2() {
/* 2715 */     return new FrameExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioOutput createAudioOutput() {
/* 2723 */     return new AudioOutput();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobStateTracks createRecordingJobStateTracks() {
/* 2731 */     return new RecordingJobStateTracks();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZConfigurationOptions2 createPTZConfigurationOptions2() {
/* 2739 */     return new PTZConfigurationOptions2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PrefixedIPv6Address createPrefixedIPv6Address() {
/* 2747 */     return new PrefixedIPv6Address();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IntRange createIntRange() {
/* 2755 */     return new IntRange();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TransformationExtension createTransformationExtension() {
/* 2763 */     return new TransformationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRecordingJobsResponseItem createGetRecordingJobsResponseItem() {
/* 2771 */     return new GetRecordingJobsResponseItem();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CodingCapabilities createCodingCapabilities() {
/* 2779 */     return new CodingCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RealTimeStreamingCapabilitiesExtension createRealTimeStreamingCapabilitiesExtension() {
/* 2787 */     return new RealTimeStreamingCapabilitiesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingSourceInformation createRecordingSourceInformation() {
/* 2795 */     return new RecordingSourceInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EFlipOptionsExtension createEFlipOptionsExtension() {
/* 2803 */     return new EFlipOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingSettings20 createImagingSettings20() {
/* 2811 */     return new ImagingSettings20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PrefixedIPv4Address createPrefixedIPv4Address() {
/* 2819 */     return new PrefixedIPv4Address();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ActionEngineEventPayload createActionEngineEventPayload() {
/* 2827 */     return new ActionEngineEventPayload();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RealTimeStreamingCapabilities createRealTimeStreamingCapabilities() {
/* 2835 */     return new RealTimeStreamingCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OnvifVersion createOnvifVersion() {
/* 2843 */     return new OnvifVersion();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioOutputConfigurationOptions createAudioOutputConfigurationOptions() {
/* 2851 */     return new AudioOutputConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ShapeDescriptorExtension createShapeDescriptorExtension() {
/* 2859 */     return new ShapeDescriptorExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZMoveStatus createPTZMoveStatus() {
/* 2867 */     return new PTZMoveStatus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsDeviceEngineConfigurationExtension createAnalyticsDeviceEngineConfigurationExtension() {
/* 2875 */     return new AnalyticsDeviceEngineConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RotateExtension createRotateExtension() {
/* 2883 */     return new RotateExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourStartingConditionOptionsExtension createPTZPresetTourStartingConditionOptionsExtension() {
/* 2891 */     return new PTZPresetTourStartingConditionOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoSource createVideoSource() {
/* 2899 */     return new VideoSource();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataStreamExtension2 createMetadataStreamExtension2() {
/* 2907 */     return new MetadataStreamExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTControlDirectionExtension createPTControlDirectionExtension() {
/* 2915 */     return new PTControlDirectionExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ProfileExtension2 createProfileExtension2() {
/* 2923 */     return new ProfileExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourPresetDetailOptions createPTZPresetTourPresetDetailOptions() {
/* 2931 */     return new PTZPresetTourPresetDetailOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LayoutExtension createLayoutExtension() {
/* 2939 */     return new LayoutExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public H264Configuration createH264Configuration() {
/* 2947 */     return new H264Configuration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mpeg4DecOptions createMpeg4DecOptions() {
/* 2955 */     return new Mpeg4DecOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RotateOptionsExtension createRotateOptionsExtension() {
/* 2963 */     return new RotateOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioAttributes createAudioAttributes() {
/* 2971 */     return new AudioAttributes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourStatusExtension createPTZPresetTourStatusExtension() {
/* 2979 */     return new PTZPresetTourStatusExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MaximumNumberOfOSDs createMaximumNumberOfOSDs() {
/* 2987 */     return new MaximumNumberOfOSDs();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsState createAnalyticsState() {
/* 2995 */     return new AnalyticsState();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MoveOptions createMoveOptions() {
/* 3003 */     return new MoveOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AbsoluteFocusOptions createAbsoluteFocusOptions() {
/* 3011 */     return new AbsoluteFocusOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WideDynamicRange20 createWideDynamicRange20() {
/* 3019 */     return new WideDynamicRange20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EventStream createEventStream() {
/* 3027 */     return new EventStream();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FloatRange createFloatRange() {
/* 3035 */     return new FloatRange();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourSpotExtension createPTZPresetTourSpotExtension() {
/* 3043 */     return new PTZPresetTourSpotExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WideDynamicRangeOptions createWideDynamicRangeOptions() {
/* 3051 */     return new WideDynamicRangeOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date createDate() {
/* 3059 */     return new Date();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDImgConfiguration createOSDImgConfiguration() {
/* 3067 */     return new OSDImgConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsEngine createAnalyticsEngine() {
/* 3075 */     return new AnalyticsEngine();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindEventResultList createFindEventResultList() {
/* 3083 */     return new FindEventResultList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTControlDirectionOptionsExtension createPTControlDirectionOptionsExtension() {
/* 3091 */     return new PTControlDirectionOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourPresetDetail createPTZPresetTourPresetDetail() {
/* 3099 */     return new PTZPresetTourPresetDetail();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Mpeg4Options2 createMpeg4Options2() {
/* 3107 */     return new Mpeg4Options2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ReceiverConfiguration createReceiverConfiguration() {
/* 3115 */     return new ReceiverConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingOptions20 createImagingOptions20() {
/* 3123 */     return new ImagingOptions20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MetadataInput createMetadataInput() {
/* 3131 */     return new MetadataInput();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDImgOptionsExtension createOSDImgOptionsExtension() {
/* 3139 */     return new OSDImgOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ItemListExtension createItemListExtension() {
/* 3147 */     return new ItemListExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DNSInformationExtension createDNSInformationExtension() {
/* 3155 */     return new DNSInformationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Config createConfig() {
/* 3163 */     return new Config();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeviceIOCapabilities createDeviceIOCapabilities() {
/* 3171 */     return new DeviceIOCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZConfigurationExtension2 createPTZConfigurationExtension2() {
/* 3179 */     return new PTZConfigurationExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ActionEngineEventPayloadExtension createActionEngineEventPayloadExtension() {
/* 3187 */     return new ActionEngineEventPayloadExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourPresetDetailOptionsExtension createPTZPresetTourPresetDetailOptionsExtension() {
/* 3195 */     return new PTZPresetTourPresetDetailOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingOptions20Extension createImagingOptions20Extension() {
/* 3203 */     return new ImagingOptions20Extension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Time createTime() {
/* 3211 */     return new Time();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTControlDirectionOptions createPTControlDirectionOptions() {
/* 3219 */     return new PTControlDirectionOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MessageDescriptionExtension createMessageDescriptionExtension() {
/* 3227 */     return new MessageDescriptionExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object createObject() {
/* 3235 */     return new Object();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BacklightCompensation createBacklightCompensation() {
/* 3243 */     return new BacklightCompensation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoSourceConfigurationOptionsExtension createVideoSourceConfigurationOptionsExtension() {
/* 3251 */     return new VideoSourceConfigurationOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindMetadataResult createFindMetadataResult() {
/* 3259 */     return new FindMetadataResult();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingSettingsExtension createImagingSettingsExtension() {
/* 3267 */     return new ImagingSettingsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobTrack createRecordingJobTrack() {
/* 3275 */     return new RecordingJobTrack();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot11PSKSetExtension createDot11PSKSetExtension() {
/* 3283 */     return new Dot11PSKSetExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WhiteBalanceOptions20 createWhiteBalanceOptions20() {
/* 3291 */     return new WhiteBalanceOptions20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NTPInformationExtension createNTPInformationExtension() {
/* 3299 */     return new NTPInformationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobSource createRecordingJobSource() {
/* 3307 */     return new RecordingJobSource();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingOptions createImagingOptions() {
/* 3315 */     return new ImagingOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MotionInCells createMotionInCells() {
/* 3323 */     return new MotionInCells();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingStatus20 createImagingStatus20() {
/* 3331 */     return new ImagingStatus20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Reverse createReverse() {
/* 3339 */     return new Reverse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SupportedAnalyticsModules createSupportedAnalyticsModules() {
/* 3347 */     return new SupportedAnalyticsModules();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingSettingsExtension20 createImagingSettingsExtension20() {
/* 3355 */     return new ImagingSettingsExtension20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DigitalInput createDigitalInput() {
/* 3363 */     return new DigitalInput();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoAnalyticsStreamExtension createVideoAnalyticsStreamExtension() {
/* 3371 */     return new VideoAnalyticsStreamExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PresetTour createPresetTour() {
/* 3379 */     return new PresetTour();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkInterfaceExtension2 createNetworkInterfaceExtension2() {
/* 3387 */     return new NetworkInterfaceExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoDecoderConfigurationOptions createVideoDecoderConfigurationOptions() {
/* 3395 */     return new VideoDecoderConfigurationOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDImgOptions createOSDImgOptions() {
/* 3403 */     return new OSDImgOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Appearance createAppearance() {
/* 3411 */     return new Appearance();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WhiteBalance20Extension createWhiteBalance20Extension() {
/* 3419 */     return new WhiteBalance20Extension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PaneLayout createPaneLayout() {
/* 3427 */     return new PaneLayout();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WhiteBalanceOptions createWhiteBalanceOptions() {
/* 3435 */     return new WhiteBalanceOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeviceCapabilities createDeviceCapabilities() {
/* 3443 */     return new DeviceCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDTextOptions createOSDTextOptions() {
/* 3451 */     return new OSDTextOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ObjectExtension createObjectExtension() {
/* 3459 */     return new ObjectExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CapabilitiesExtension2 createCapabilitiesExtension2() {
/* 3467 */     return new CapabilitiesExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsDeviceEngineConfiguration createAnalyticsDeviceEngineConfiguration() {
/* 3475 */     return new AnalyticsDeviceEngineConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDTextConfiguration createOSDTextConfiguration() {
/* 3483 */     return new OSDTextConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ColorCovariance createColorCovariance() {
/* 3491 */     return new ColorCovariance();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDPosConfiguration createOSDPosConfiguration() {
/* 3499 */     return new OSDPosConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZSpeed createPTZSpeed() {
/* 3507 */     return new PTZSpeed();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkCapabilitiesExtension createNetworkCapabilitiesExtension() {
/* 3515 */     return new NetworkCapabilitiesExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PanTiltLimits createPanTiltLimits() {
/* 3523 */     return new PanTiltLimits();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingSummary createRecordingSummary() {
/* 3531 */     return new RecordingSummary();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SecurityCapabilitiesExtension2 createSecurityCapabilitiesExtension2() {
/* 3539 */     return new SecurityCapabilitiesExtension2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZNode createPTZNode() {
/* 3547 */     return new PTZNode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourStatus createPTZPresetTourStatus() {
/* 3555 */     return new PTZPresetTourStatus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RuleEngineConfiguration createRuleEngineConfiguration() {
/* 3563 */     return new RuleEngineConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoSourceConfigurationExtension createVideoSourceConfigurationExtension() {
/* 3571 */     return new VideoSourceConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TrackInformation createTrackInformation() {
/* 3579 */     return new TrackInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnalyticsDeviceExtension createAnalyticsDeviceExtension() {
/* 3587 */     return new AnalyticsDeviceExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RecordingJobStateInformation createRecordingJobStateInformation() {
/* 3595 */     return new RecordingJobStateInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoAnalyticsStream createVideoAnalyticsStream() {
/* 3603 */     return new VideoAnalyticsStream();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ConfigurationEntity createConfigurationEntity() {
/* 3611 */     return new ConfigurationEntity();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MoveOptions20 createMoveOptions20() {
/* 3619 */     return new MoveOptions20();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public HostnameInformationExtension createHostnameInformationExtension() {
/* 3627 */     return new HostnameInformationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourExtension createPTZPresetTourExtension() {
/* 3635 */     return new PTZPresetTourExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MotionExpression createMotionExpression() {
/* 3643 */     return new MotionExpression();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public H264Options createH264Options() {
/* 3651 */     return new H264Options();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ReceiverStateInformation createReceiverStateInformation() {
/* 3659 */     return new ReceiverStateInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Dot11SecurityConfigurationExtension createDot11SecurityConfigurationExtension() {
/* 3667 */     return new Dot11SecurityConfigurationExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkProtocolExtension createNetworkProtocolExtension() {
/* 3675 */     return new NetworkProtocolExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZStream createPTZStream() {
/* 3683 */     return new PTZStream();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FrameExtension createFrameExtension() {
/* 3691 */     return new FrameExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourSpot createPTZPresetTourSpot() {
/* 3699 */     return new PTZPresetTourSpot();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PTZPresetTourTypeExtension createPTZPresetTourTypeExtension() {
/* 3707 */     return new PTZPresetTourTypeExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FocusOptions createFocusOptions() {
/* 3715 */     return new FocusOptions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public OSDTextOptionsExtension createOSDTextOptionsExtension() {
/* 3723 */     return new OSDTextOptionsExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ImagingCapabilities createImagingCapabilities() {
/* 3731 */     return new ImagingCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public VideoOutputConfiguration createVideoOutputConfiguration() {
/* 3739 */     return new VideoOutputConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioClassCandidate createAudioClassCandidate() {
/* 3747 */     return new AudioClassCandidate();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkHostExtension createNetworkHostExtension() {
/* 3755 */     return new NetworkHostExtension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ItemListDescription.SimpleItemDescription createItemListDescriptionSimpleItemDescription() {
/* 3763 */     return new ItemListDescription.SimpleItemDescription();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ItemListDescription.ElementItemDescription createItemListDescriptionElementItemDescription() {
/* 3771 */     return new ItemListDescription.ElementItemDescription();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ConfigDescription.Messages createConfigDescriptionMessages() {
/* 3779 */     return new ConfigDescription.Messages();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Behaviour.Removed createBehaviourRemoved() {
/* 3787 */     return new Behaviour.Removed();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Behaviour.Idle createBehaviourIdle() {
/* 3795 */     return new Behaviour.Idle();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ColorDescriptor.ColorCluster createColorDescriptorColorCluster() {
/* 3803 */     return new ColorDescriptor.ColorCluster();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EventSubscription.SubscriptionPolicy createEventSubscriptionSubscriptionPolicy() {
/* 3811 */     return new EventSubscription.SubscriptionPolicy();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClassDescriptor.ClassCandidate createClassDescriptorClassCandidate() {
/* 3819 */     return new ClassDescriptor.ClassCandidate();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ItemList.SimpleItem createItemListSimpleItem() {
/* 3827 */     return new ItemList.SimpleItem();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ItemList.ElementItem createItemListElementItem() {
/* 3835 */     return new ItemList.ElementItem();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoSourceConfiguration")
/*      */   public JAXBElement<VideoSourceConfiguration> createVideoSourceConfiguration(VideoSourceConfiguration value) {
/* 3844 */     return new JAXBElement(_VideoSourceConfiguration_QNAME, VideoSourceConfiguration.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "MetadataStream")
/*      */   public JAXBElement<MetadataStream> createMetadataStream(MetadataStream value) {
/* 3853 */     return new JAXBElement(_MetadataStream_QNAME, MetadataStream.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioEncoderConfiguration")
/*      */   public JAXBElement<AudioEncoderConfiguration> createAudioEncoderConfiguration(AudioEncoderConfiguration value) {
/* 3862 */     return new JAXBElement(_AudioEncoderConfiguration_QNAME, AudioEncoderConfiguration.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoEncoderConfiguration")
/*      */   public JAXBElement<VideoEncoderConfiguration> createVideoEncoderConfiguration(VideoEncoderConfiguration value) {
/* 3871 */     return new JAXBElement(_VideoEncoderConfiguration_QNAME, VideoEncoderConfiguration.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "VideoAnalyticsConfiguration")
/*      */   public JAXBElement<VideoAnalyticsConfiguration> createVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
/* 3880 */     return new JAXBElement(_VideoAnalyticsConfiguration_QNAME, VideoAnalyticsConfiguration.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioOutputConfiguration")
/*      */   public JAXBElement<AudioOutputConfiguration> createAudioOutputConfiguration(AudioOutputConfiguration value) {
/* 3889 */     return new JAXBElement(_AudioOutputConfiguration_QNAME, AudioOutputConfiguration.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polygon")
/*      */   public JAXBElement<Polygon> createPolygon(Polygon value) {
/* 3898 */     return new JAXBElement(_Polygon_QNAME, Polygon.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polyline")
/*      */   public JAXBElement<Polyline> createPolyline(Polyline value) {
/* 3907 */     return new JAXBElement(_Polyline_QNAME, Polyline.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioSourceConfiguration")
/*      */   public JAXBElement<AudioSourceConfiguration> createAudioSourceConfiguration(AudioSourceConfiguration value) {
/* 3916 */     return new JAXBElement(_AudioSourceConfiguration_QNAME, AudioSourceConfiguration.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "MetadataConfiguration")
/*      */   public JAXBElement<MetadataConfiguration> createMetadataConfiguration(MetadataConfiguration value) {
/* 3925 */     return new JAXBElement(_MetadataConfiguration_QNAME, MetadataConfiguration.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "PTZConfiguration")
/*      */   public JAXBElement<PTZConfiguration> createPTZConfiguration(PTZConfiguration value) {
/* 3934 */     return new JAXBElement(_PTZConfiguration_QNAME, PTZConfiguration.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "AudioDecoderConfiguration")
/*      */   public JAXBElement<AudioDecoderConfiguration> createAudioDecoderConfiguration(AudioDecoderConfiguration value) {
/* 3943 */     return new JAXBElement(_AudioDecoderConfiguration_QNAME, AudioDecoderConfiguration.class, null, value);
/*      */   }
/*      */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\schema\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */