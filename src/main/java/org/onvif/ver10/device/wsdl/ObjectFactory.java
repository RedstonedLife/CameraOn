/*      */ package org.onvif.ver10.device.wsdl;
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
/*   26 */   private static final QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/device/wsdl", "Capabilities");
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
/*      */   public GetSystemUrisResponse createGetSystemUrisResponse() {
/*   40 */     return new GetSystemUrisResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Service createService() {
/*   48 */     return new Service();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetUser createSetUser() {
/*   56 */     return new SetUser();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UpgradeSystemFirmwareResponse createUpgradeSystemFirmwareResponse() {
/*   64 */     return new UpgradeSystemFirmwareResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetNTPResponse createSetNTPResponse() {
/*   72 */     return new SetNTPResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetRelayOutputStateResponse createSetRelayOutputStateResponse() {
/*   80 */     return new SetRelayOutputStateResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetAccessPolicyResponse createSetAccessPolicyResponse() {
/*   88 */     return new SetAccessPolicyResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetScopesResponse createGetScopesResponse() {
/*   96 */     return new GetScopesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ScanAvailableDot11NetworksResponse createScanAvailableDot11NetworksResponse() {
/*  104 */     return new ScanAvailableDot11NetworksResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRemoteDiscoveryModeResponse createGetRemoteDiscoveryModeResponse() {
/*  112 */     return new GetRemoteDiscoveryModeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDiscoveryMode createSetDiscoveryMode() {
/*  120 */     return new SetDiscoveryMode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetRelayOutputSettingsResponse createSetRelayOutputSettingsResponse() {
/*  128 */     return new SetRelayOutputSettingsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetCertificatesStatusResponse createSetCertificatesStatusResponse() {
/*  136 */     return new SetCertificatesStatusResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetRemoteUserResponse createSetRemoteUserResponse() {
/*  144 */     return new SetRemoteUserResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetScopes createSetScopes() {
/*  152 */     return new SetScopes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteDot1XConfigurationResponse createDeleteDot1XConfigurationResponse() {
/*  160 */     return new DeleteDot1XConfigurationResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNTPResponse createGetNTPResponse() {
/*  168 */     return new GetNTPResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCertificates createGetCertificates() {
/*  176 */     return new GetCertificates();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetWsdlUrl createGetWsdlUrl() {
/*  184 */     return new GetWsdlUrl();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetNetworkDefaultGateway createSetNetworkDefaultGateway() {
/*  192 */     return new SetNetworkDefaultGateway();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetEndpointReference createGetEndpointReference() {
/*  200 */     return new GetEndpointReference();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetZeroConfiguration createGetZeroConfiguration() {
/*  208 */     return new GetZeroConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SendAuxiliaryCommand createSendAuxiliaryCommand() {
/*  216 */     return new SendAuxiliaryCommand();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetWsdlUrlResponse createGetWsdlUrlResponse() {
/*  224 */     return new GetWsdlUrlResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteCertificatesResponse createDeleteCertificatesResponse() {
/*  232 */     return new DeleteCertificatesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public StartSystemRestore createStartSystemRestore() {
/*  240 */     return new StartSystemRestore();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemReboot createSystemReboot() {
/*  248 */     return new SystemReboot();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDot1XConfigurationResponse createSetDot1XConfigurationResponse() {
/*  256 */     return new SetDot1XConfigurationResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetClientCertificateMode createSetClientCertificateMode() {
/*  264 */     return new SetClientCertificateMode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public StartFirmwareUpgradeResponse createStartFirmwareUpgradeResponse() {
/*  272 */     return new StartFirmwareUpgradeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public StartFirmwareUpgrade createStartFirmwareUpgrade() {
/*  280 */     return new StartFirmwareUpgrade();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetClientCertificateModeResponse createSetClientCertificateModeResponse() {
/*  288 */     return new SetClientCertificateModeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDynamicDNSResponse createGetDynamicDNSResponse() {
/*  296 */     return new GetDynamicDNSResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCertificateInformation createGetCertificateInformation() {
/*  304 */     return new GetCertificateInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDeviceInformation createGetDeviceInformation() {
/*  312 */     return new GetDeviceInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDynamicDNS createGetDynamicDNS() {
/*  320 */     return new GetDynamicDNS();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateDot1XConfiguration createCreateDot1XConfiguration() {
/*  328 */     return new CreateDot1XConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetSystemFactoryDefaultResponse createSetSystemFactoryDefaultResponse() {
/*  336 */     return new SetSystemFactoryDefaultResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UpgradeSystemFirmware createUpgradeSystemFirmware() {
/*  344 */     return new UpgradeSystemFirmware();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDiscoveryMode createGetDiscoveryMode() {
/*  352 */     return new GetDiscoveryMode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetZeroConfigurationResponse createGetZeroConfigurationResponse() {
/*  360 */     return new GetZeroConfigurationResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetHostnameResponse createSetHostnameResponse() {
/*  368 */     return new SetHostnameResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SendAuxiliaryCommandResponse createSendAuxiliaryCommandResponse() {
/*  376 */     return new SendAuxiliaryCommandResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDynamicDNSResponse createSetDynamicDNSResponse() {
/*  384 */     return new SetDynamicDNSResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetNetworkProtocolsResponse createSetNetworkProtocolsResponse() {
/*  392 */     return new SetNetworkProtocolsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LoadCertificates createLoadCertificates() {
/*  400 */     return new LoadCertificates();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RestoreSystem createRestoreSystem() {
/*  408 */     return new RestoreSystem();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRelayOutputsResponse createGetRelayOutputsResponse() {
/*  416 */     return new GetRelayOutputsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCertificatesResponse createGetCertificatesResponse() {
/*  424 */     return new GetCertificatesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemDateAndTimeResponse createGetSystemDateAndTimeResponse() {
/*  432 */     return new GetSystemDateAndTimeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetSystemDateAndTime createSetSystemDateAndTime() {
/*  440 */     return new SetSystemDateAndTime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCapabilitiesResponse createGetCapabilitiesResponse() {
/*  448 */     return new GetCapabilitiesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LoadCACertificates createLoadCACertificates() {
/*  456 */     return new LoadCACertificates();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetClientCertificateModeResponse createGetClientCertificateModeResponse() {
/*  464 */     return new GetClientCertificateModeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemBackup createGetSystemBackup() {
/*  472 */     return new GetSystemBackup();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCertificatesStatusResponse createGetCertificatesStatusResponse() {
/*  480 */     return new GetCertificatesStatusResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AddIPAddressFilterResponse createAddIPAddressFilterResponse() {
/*  488 */     return new AddIPAddressFilterResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCACertificatesResponse createGetCACertificatesResponse() {
/*  496 */     return new GetCACertificatesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemSupportInformationResponse createGetSystemSupportInformationResponse() {
/*  504 */     return new GetSystemSupportInformationResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public StartSystemRestoreResponse createStartSystemRestoreResponse() {
/*  512 */     return new StartSystemRestoreResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCertificateInformationResponse createGetCertificateInformationResponse() {
/*  520 */     return new GetCertificateInformationResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemBackupResponse createGetSystemBackupResponse() {
/*  528 */     return new GetSystemBackupResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetNetworkInterfacesResponse createSetNetworkInterfacesResponse() {
/*  536 */     return new SetNetworkInterfacesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LoadCertificatesResponse createLoadCertificatesResponse() {
/*  544 */     return new LoadCertificatesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDot1XConfigurationResponse createGetDot1XConfigurationResponse() {
/*  552 */     return new GetDot1XConfigurationResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDPAddresses createSetDPAddresses() {
/*  560 */     return new SetDPAddresses();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDiscoveryModeResponse createGetDiscoveryModeResponse() {
/*  568 */     return new GetDiscoveryModeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetRemoteUser createSetRemoteUser() {
/*  576 */     return new SetRemoteUser();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateUsers createCreateUsers() {
/*  584 */     return new CreateUsers();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetRelayOutputSettings createSetRelayOutputSettings() {
/*  592 */     return new SetRelayOutputSettings();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetNTP createSetNTP() {
/*  600 */     return new SetNTP();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateDot1XConfigurationResponse createCreateDot1XConfigurationResponse() {
/*  608 */     return new CreateDot1XConfigurationResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRemoteUserResponse createGetRemoteUserResponse() {
/*  616 */     return new GetRemoteUserResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDPAddressesResponse createGetDPAddressesResponse() {
/*  624 */     return new GetDPAddressesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetHostname createSetHostname() {
/*  632 */     return new SetHostname();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetHostnameResponse createGetHostnameResponse() {
/*  640 */     return new GetHostnameResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDPAddressesResponse createSetDPAddressesResponse() {
/*  648 */     return new SetDPAddressesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRemoteDiscoveryMode createGetRemoteDiscoveryMode() {
/*  656 */     return new GetRemoteDiscoveryMode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDot11StatusResponse createGetDot11StatusResponse() {
/*  664 */     return new GetDot11StatusResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAccessPolicyResponse createGetAccessPolicyResponse() {
/*  672 */     return new GetAccessPolicyResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetIPAddressFilter createSetIPAddressFilter() {
/*  680 */     return new SetIPAddressFilter();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetServicesResponse createGetServicesResponse() {
/*  688 */     return new GetServicesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetCertificatesStatus createSetCertificatesStatus() {
/*  696 */     return new SetCertificatesStatus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetNetworkInterfaces createSetNetworkInterfaces() {
/*  704 */     return new SetNetworkInterfaces();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDiscoveryModeResponse createSetDiscoveryModeResponse() {
/*  712 */     return new SetDiscoveryModeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNetworkProtocolsResponse createGetNetworkProtocolsResponse() {
/*  720 */     return new GetNetworkProtocolsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LoadCertificateWithPrivateKeyResponse createLoadCertificateWithPrivateKeyResponse() {
/*  728 */     return new LoadCertificateWithPrivateKeyResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemUrisResponse.Extension createGetSystemUrisResponseExtension() {
/*  736 */     return new GetSystemUrisResponse.Extension();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDNSResponse createGetDNSResponse() {
/*  744 */     return new GetDNSResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDot1XConfiguration createSetDot1XConfiguration() {
/*  752 */     return new SetDot1XConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUsersResponse createGetUsersResponse() {
/*  760 */     return new GetUsersResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDynamicDNS createSetDynamicDNS() {
/*  768 */     return new SetDynamicDNS();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNetworkInterfacesResponse createGetNetworkInterfacesResponse() {
/*  776 */     return new GetNetworkInterfacesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDPAddresses createGetDPAddresses() {
/*  784 */     return new GetDPAddresses();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ScanAvailableDot11Networks createScanAvailableDot11Networks() {
/*  792 */     return new ScanAvailableDot11Networks();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
/*  800 */     return new GetServiceCapabilitiesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeviceServiceCapabilities createDeviceServiceCapabilities() {
/*  808 */     return new DeviceServiceCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetHostname createGetHostname() {
/*  816 */     return new GetHostname();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LoadCACertificatesResponse createLoadCACertificatesResponse() {
/*  824 */     return new LoadCACertificatesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AddIPAddressFilter createAddIPAddressFilter() {
/*  832 */     return new AddIPAddressFilter();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetIPAddressFilter createGetIPAddressFilter() {
/*  840 */     return new GetIPAddressFilter();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteUsersResponse createDeleteUsersResponse() {
/*  848 */     return new DeleteUsersResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LoadCertificateWithPrivateKey createLoadCertificateWithPrivateKey() {
/*  856 */     return new LoadCertificateWithPrivateKey();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateCertificateResponse createCreateCertificateResponse() {
/*  864 */     return new CreateCertificateResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDNS createSetDNS() {
/*  872 */     return new SetDNS();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteCertificates createDeleteCertificates() {
/*  880 */     return new DeleteCertificates();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNetworkInterfaces createGetNetworkInterfaces() {
/*  888 */     return new GetNetworkInterfaces();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDot11CapabilitiesResponse createGetDot11CapabilitiesResponse() {
/*  896 */     return new GetDot11CapabilitiesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCACertificates createGetCACertificates() {
/*  904 */     return new GetCACertificates();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteDot1XConfiguration createDeleteDot1XConfiguration() {
/*  912 */     return new DeleteDot1XConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNetworkDefaultGateway createGetNetworkDefaultGateway() {
/*  920 */     return new GetNetworkDefaultGateway();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RestoreSystemResponse createRestoreSystemResponse() {
/*  928 */     return new RestoreSystemResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RemoveIPAddressFilter createRemoveIPAddressFilter() {
/*  936 */     return new RemoveIPAddressFilter();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDNS createGetDNS() {
/*  944 */     return new GetDNS();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetClientCertificateMode createGetClientCertificateMode() {
/*  952 */     return new GetClientCertificateMode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetScopes createGetScopes() {
/*  960 */     return new GetScopes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAccessPolicy createGetAccessPolicy() {
/*  968 */     return new GetAccessPolicy();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RemoveIPAddressFilterResponse createRemoveIPAddressFilterResponse() {
/*  976 */     return new RemoveIPAddressFilterResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemLog createGetSystemLog() {
/*  984 */     return new GetSystemLog();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDot11Capabilities createGetDot11Capabilities() {
/*  992 */     return new GetDot11Capabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNetworkDefaultGatewayResponse createGetNetworkDefaultGatewayResponse() {
/* 1000 */     return new GetNetworkDefaultGatewayResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetServiceCapabilities createGetServiceCapabilities() {
/* 1008 */     return new GetServiceCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemDateAndTime createGetSystemDateAndTime() {
/* 1016 */     return new GetSystemDateAndTime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetScopesResponse createSetScopesResponse() {
/* 1024 */     return new SetScopesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDot1XConfigurationsResponse createGetDot1XConfigurationsResponse() {
/* 1032 */     return new GetDot1XConfigurationsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDot1XConfigurations createGetDot1XConfigurations() {
/* 1040 */     return new GetDot1XConfigurations();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetUserResponse createSetUserResponse() {
/* 1048 */     return new SetUserResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetZeroConfigurationResponse createSetZeroConfigurationResponse() {
/* 1056 */     return new SetZeroConfigurationResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemUris createGetSystemUris() {
/* 1064 */     return new GetSystemUris();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetEndpointReferenceResponse createGetEndpointReferenceResponse() {
/* 1072 */     return new GetEndpointReferenceResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AddScopes createAddScopes() {
/* 1080 */     return new AddScopes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDeviceInformationResponse createGetDeviceInformationResponse() {
/* 1088 */     return new GetDeviceInformationResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetHostnameFromDHCPResponse createSetHostnameFromDHCPResponse() {
/* 1096 */     return new SetHostnameFromDHCPResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDot11Status createGetDot11Status() {
/* 1104 */     return new GetDot11Status();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetHostnameFromDHCP createSetHostnameFromDHCP() {
/* 1112 */     return new SetHostnameFromDHCP();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemLogResponse createGetSystemLogResponse() {
/* 1120 */     return new GetSystemLogResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetPkcs10Request createGetPkcs10Request() {
/* 1128 */     return new GetPkcs10Request();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRelayOutputs createGetRelayOutputs() {
/* 1136 */     return new GetRelayOutputs();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetZeroConfiguration createSetZeroConfiguration() {
/* 1144 */     return new SetZeroConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetSystemSupportInformation createGetSystemSupportInformation() {
/* 1152 */     return new GetSystemSupportInformation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetDNSResponse createSetDNSResponse() {
/* 1160 */     return new SetDNSResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetIPAddressFilterResponse createGetIPAddressFilterResponse() {
/* 1168 */     return new GetIPAddressFilterResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNTP createGetNTP() {
/* 1176 */     return new GetNTP();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNetworkProtocols createGetNetworkProtocols() {
/* 1184 */     return new GetNetworkProtocols();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCapabilities createGetCapabilities() {
/* 1192 */     return new GetCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateCertificate createCreateCertificate() {
/* 1200 */     return new CreateCertificate();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetIPAddressFilterResponse createSetIPAddressFilterResponse() {
/* 1208 */     return new SetIPAddressFilterResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RemoveScopesResponse createRemoveScopesResponse() {
/* 1216 */     return new RemoveScopesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCertificatesStatus createGetCertificatesStatus() {
/* 1224 */     return new GetCertificatesStatus();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AddScopesResponse createAddScopesResponse() {
/* 1232 */     return new AddScopesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetSystemDateAndTimeResponse createSetSystemDateAndTimeResponse() {
/* 1240 */     return new SetSystemDateAndTimeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetPkcs10RequestResponse createGetPkcs10RequestResponse() {
/* 1248 */     return new GetPkcs10RequestResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetRemoteDiscoveryModeResponse createSetRemoteDiscoveryModeResponse() {
/* 1256 */     return new SetRemoteDiscoveryModeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemRebootResponse createSystemRebootResponse() {
/* 1264 */     return new SystemRebootResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetNetworkDefaultGatewayResponse createSetNetworkDefaultGatewayResponse() {
/* 1272 */     return new SetNetworkDefaultGatewayResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateUsersResponse createCreateUsersResponse() {
/* 1280 */     return new CreateUsersResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetAccessPolicy createSetAccessPolicy() {
/* 1288 */     return new SetAccessPolicy();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUsers createGetUsers() {
/* 1296 */     return new GetUsers();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRemoteUser createGetRemoteUser() {
/* 1304 */     return new GetRemoteUser();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RemoveScopes createRemoveScopes() {
/* 1312 */     return new RemoveScopes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetSystemFactoryDefault createSetSystemFactoryDefault() {
/* 1320 */     return new SetSystemFactoryDefault();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetRelayOutputState createSetRelayOutputState() {
/* 1328 */     return new SetRelayOutputState();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDot1XConfiguration createGetDot1XConfiguration() {
/* 1336 */     return new GetDot1XConfiguration();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetServices createGetServices() {
/* 1344 */     return new GetServices();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteUsers createDeleteUsers() {
/* 1352 */     return new DeleteUsers();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetRemoteDiscoveryMode createSetRemoteDiscoveryMode() {
/* 1360 */     return new SetRemoteDiscoveryMode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetNetworkProtocols createSetNetworkProtocols() {
/* 1368 */     return new SetNetworkProtocols();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NetworkCapabilities createNetworkCapabilities() {
/* 1376 */     return new NetworkCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SecurityCapabilities createSecurityCapabilities() {
/* 1384 */     return new SecurityCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MiscCapabilities createMiscCapabilities() {
/* 1392 */     return new MiscCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SystemCapabilities createSystemCapabilities() {
/* 1400 */     return new SystemCapabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Service.Capabilities createServiceCapabilities() {
/* 1408 */     return new Service.Capabilities();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://www.onvif.org/ver10/device/wsdl", name = "Capabilities")
/*      */   public JAXBElement<DeviceServiceCapabilities> createCapabilities(DeviceServiceCapabilities value) {
/* 1417 */     return new JAXBElement(_Capabilities_QNAME, DeviceServiceCapabilities.class, null, value);
/*      */   }
/*      */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\onvif\ver10\device\wsdl\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */