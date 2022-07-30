/*     */ package onvif.soap;
/*     */ 
/*     */ import java.net.ConnectException;
/*     */ import java.net.SocketException;
/*     */ import javax.xml.bind.JAXBContext;
/*     */ import javax.xml.bind.JAXBException;
/*     */ import javax.xml.bind.Marshaller;
/*     */ import javax.xml.bind.UnmarshalException;
/*     */ import javax.xml.bind.Unmarshaller;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import javax.xml.parsers.ParserConfigurationException;
/*     */ import javax.xml.soap.MessageFactory;
/*     */ import javax.xml.soap.SOAPConnection;
/*     */ import javax.xml.soap.SOAPConnectionFactory;
/*     */ import javax.xml.soap.SOAPElement;
/*     */ import javax.xml.soap.SOAPEnvelope;
/*     */ import javax.xml.soap.SOAPException;
/*     */ import javax.xml.soap.SOAPHeader;
/*     */ import javax.xml.soap.SOAPMessage;
/*     */ import javax.xml.soap.SOAPPart;
/*     */ import org.w3c.dom.Document;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SOAP
/*     */ {
/*     */   private boolean logging = true;
/*     */   private OnvifDevice onvifDevice;
/*     */   
/*     */   public SOAP(OnvifDevice onvifDevice) {
/*  36 */     this.onvifDevice = onvifDevice;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object createSOAPDeviceRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) throws SOAPException, ConnectException {
/*  41 */     return createSOAPRequest(soapRequestElem, soapResponseElem, this.onvifDevice.getDeviceUri(), needsAuthentification);
/*     */   }
/*     */   
/*     */   public Object createSOAPPtzRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) throws SOAPException, ConnectException {
/*  45 */     return createSOAPRequest(soapRequestElem, soapResponseElem, this.onvifDevice.getPtzUri(), needsAuthentification);
/*     */   }
/*     */   
/*     */   public Object createSOAPMediaRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) throws SOAPException, ConnectException {
/*  49 */     return createSOAPRequest(soapRequestElem, soapResponseElem, this.onvifDevice.getMediaUri(), needsAuthentification);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object createSOAPImagingRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) throws SOAPException, ConnectException {
/*  54 */     return createSOAPRequest(soapRequestElem, soapResponseElem, this.onvifDevice.getImagingUri(), needsAuthentification);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object createSOAPEventsRequest(Object soapRequestElem, Object soapResponseElem, boolean needsAuthentification) throws SOAPException, ConnectException {
/*  59 */     return createSOAPRequest(soapRequestElem, soapResponseElem, this.onvifDevice.getEventsUri(), needsAuthentification);
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
/*     */   public Object createSOAPRequest(Object soapRequestElem, Object soapResponseElem, String soapUri, boolean needsAuthentification) throws ConnectException, SOAPException {
/*  72 */     SOAPConnection soapConnection = null;
/*  73 */     SOAPMessage soapResponse = null;
/*     */ 
/*     */     
/*     */     try {
/*  77 */       SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
/*  78 */       soapConnection = soapConnectionFactory.createConnection();
/*     */       
/*  80 */       SOAPMessage soapMessage = createSoapMessage(soapRequestElem, needsAuthentification);
/*     */ 
/*     */       
/*  83 */       if (isLogging()) {
/*  84 */         System.out.print("Request SOAP Message (" + soapRequestElem.getClass().getSimpleName() + "): ");
/*  85 */         soapMessage.writeTo(System.out);
/*  86 */         System.out.println();
/*     */       } 
/*     */       
/*  89 */       soapResponse = soapConnection.call(soapMessage, soapUri);
/*     */ 
/*     */       
/*  92 */       if (isLogging()) {
/*  93 */         System.out.print("Response SOAP Message (" + soapResponseElem.getClass().getSimpleName() + "): ");
/*  94 */         soapResponse.writeTo(System.out);
/*  95 */         System.out.println();
/*     */       } 
/*     */       
/*  98 */       if (soapResponseElem == null) {
/*  99 */         throw new NullPointerException("Improper SOAP Response Element given (is null).");
/*     */       }
/*     */       
/* 102 */       Unmarshaller unmarshaller = JAXBContext.newInstance(new Class[] { soapResponseElem.getClass() }).createUnmarshaller();
/*     */       try {
/*     */         try {
/* 105 */           soapResponseElem = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
/*     */         }
/* 107 */         catch (SOAPException e) {
/*     */ 
/*     */           
/* 110 */           soapResponseElem = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
/*     */         }
/*     */       
/* 113 */       } catch (UnmarshalException e) {
/*     */ 
/*     */         
/* 116 */         this.onvifDevice.getLogger().warn("Could not unmarshal, ended in SOAP fault.");
/*     */       } 
/*     */ 
/*     */       
/* 120 */       return soapResponseElem;
/*     */     }
/* 122 */     catch (SocketException e) {
/* 123 */       throw new ConnectException(e.getMessage());
/*     */     }
/* 125 */     catch (SOAPException e) {
/* 126 */       this.onvifDevice.getLogger().error(
/* 127 */           "Unexpected response. Response should be from class " + soapResponseElem.getClass() + ", but response is: " + soapResponse);
/* 128 */       throw e;
/*     */     }
/* 130 */     catch (ParserConfigurationException|JAXBException|java.io.IOException e) {
/* 131 */       this.onvifDevice.getLogger().error("Unhandled exception: " + e.getMessage());
/* 132 */       e.printStackTrace();
/* 133 */       return null;
/*     */     } finally {
/*     */       
/*     */       try {
/* 137 */         soapConnection.close();
/*     */       }
/* 139 */       catch (SOAPException sOAPException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected SOAPMessage createSoapMessage(Object soapRequestElem, boolean needAuthentification) throws SOAPException, ParserConfigurationException, JAXBException {
/* 146 */     MessageFactory messageFactory = MessageFactory.newInstance("SOAP 1.2 Protocol");
/* 147 */     SOAPMessage soapMessage = messageFactory.createMessage();
/*     */     
/* 149 */     Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
/* 150 */     Marshaller marshaller = JAXBContext.newInstance(new Class[] { soapRequestElem.getClass() }).createMarshaller();
/* 151 */     marshaller.marshal(soapRequestElem, document);
/* 152 */     soapMessage.getSOAPBody().addDocument(document);
/*     */ 
/*     */     
/* 155 */     createSoapHeader(soapMessage);
/*     */     
/* 157 */     soapMessage.saveChanges();
/* 158 */     return soapMessage;
/*     */   }
/*     */   
/*     */   protected void createSoapHeader(SOAPMessage soapMessage) throws SOAPException {
/* 162 */     this.onvifDevice.createNonce();
/* 163 */     String encrypedPassword = this.onvifDevice.getEncryptedPassword();
/* 164 */     if (encrypedPassword != null && this.onvifDevice.getUsername() != null) {
/*     */       
/* 166 */       SOAPPart sp = soapMessage.getSOAPPart();
/* 167 */       SOAPEnvelope se = sp.getEnvelope();
/* 168 */       SOAPHeader header = soapMessage.getSOAPHeader();
/* 169 */       se.addNamespaceDeclaration("wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
/* 170 */       se.addNamespaceDeclaration("wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
/*     */       
/* 172 */       SOAPElement securityElem = header.addChildElement("Security", "wsse");
/*     */ 
/*     */       
/* 175 */       SOAPElement usernameTokenElem = securityElem.addChildElement("UsernameToken", "wsse");
/*     */       
/* 177 */       SOAPElement usernameElem = usernameTokenElem.addChildElement("Username", "wsse");
/* 178 */       usernameElem.setTextContent(this.onvifDevice.getUsername());
/*     */       
/* 180 */       SOAPElement passwordElem = usernameTokenElem.addChildElement("Password", "wsse");
/* 181 */       passwordElem.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
/* 182 */       passwordElem.setTextContent(encrypedPassword);
/*     */       
/* 184 */       SOAPElement nonceElem = usernameTokenElem.addChildElement("Nonce", "wsse");
/* 185 */       nonceElem.setAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
/* 186 */       nonceElem.setTextContent(this.onvifDevice.getEncryptedNonce());
/*     */       
/* 188 */       SOAPElement createdElem = usernameTokenElem.addChildElement("Created", "wsu");
/* 189 */       createdElem.setTextContent(this.onvifDevice.getLastUTCTime());
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean isLogging() {
/* 194 */     return this.logging;
/*     */   }
/*     */   
/*     */   public void setLogging(boolean logging) {
/* 198 */     this.logging = logging;
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\de\onvif\soap\SOAP.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */