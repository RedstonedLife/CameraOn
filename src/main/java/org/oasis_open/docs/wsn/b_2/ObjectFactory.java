/*     */ package org.oasis_open.docs.wsn.b_2;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.w3._2005._08.addressing.EndpointReferenceType;
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
/*  28 */   private static final QName _TerminationTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TerminationTime");
/*  29 */   private static final QName _NotifyMessageNotSupportedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "NotifyMessageNotSupportedFault");
/*  30 */   private static final QName _ConsumerReference_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ConsumerReference");
/*  31 */   private static final QName _UnsupportedPolicyRequestFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnsupportedPolicyRequestFault");
/*  32 */   private static final QName _SubscriptionPolicy_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionPolicy");
/*  33 */   private static final QName _NotificationMessage_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "NotificationMessage");
/*  34 */   private static final QName _UnacceptableInitialTerminationTimeFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", 
/*  35 */       "UnacceptableInitialTerminationTimeFault");
/*  36 */   private static final QName _InvalidTopicExpressionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InvalidTopicExpressionFault");
/*  37 */   private static final QName _TopicExpressionDialect_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialect");
/*  38 */   private static final QName _Filter_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "Filter");
/*  39 */   private static final QName _UnableToCreatePullPointFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToCreatePullPointFault");
/*  40 */   private static final QName _CreationTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "CreationTime");
/*  41 */   private static final QName _ResumeFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ResumeFailedFault");
/*  42 */   private static final QName _InvalidProducerPropertiesExpressionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", 
/*  43 */       "InvalidProducerPropertiesExpressionFault");
/*  44 */   private static final QName _UnableToGetMessagesFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToGetMessagesFault");
/*  45 */   private static final QName _MessageContent_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "MessageContent");
/*  46 */   private static final QName _TopicExpressionDialectUnknownFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialectUnknownFault");
/*  47 */   private static final QName _UnableToDestroySubscriptionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroySubscriptionFault");
/*  48 */   private static final QName _UnrecognizedPolicyRequestFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnrecognizedPolicyRequestFault");
/*  49 */   private static final QName _SubscribeCreationFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "SubscribeCreationFailedFault");
/*  50 */   private static final QName _ProducerReference_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ProducerReference");
/*  51 */   private static final QName _NoCurrentMessageOnTopicFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "NoCurrentMessageOnTopicFault");
/*  52 */   private static final QName _MultipleTopicsSpecifiedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "MultipleTopicsSpecifiedFault");
/*  53 */   private static final QName _UnacceptableTerminationTimeFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnacceptableTerminationTimeFault");
/*  54 */   private static final QName _CurrentTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "CurrentTime");
/*  55 */   private static final QName _TopicExpression_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpression");
/*  56 */   private static final QName _ProducerProperties_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ProducerProperties");
/*  57 */   private static final QName _TopicNotSupportedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicNotSupportedFault");
/*  58 */   private static final QName _InvalidFilterFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InvalidFilterFault");
/*  59 */   private static final QName _FixedTopicSet_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "FixedTopicSet");
/*  60 */   private static final QName _Topic_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "Topic");
/*  61 */   private static final QName _UnableToDestroyPullPointFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroyPullPointFault");
/*  62 */   private static final QName _InvalidMessageContentExpressionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", 
/*  63 */       "InvalidMessageContentExpressionFault");
/*  64 */   private static final QName _PauseFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "PauseFailedFault");
/*  65 */   private static final QName _SubscriptionReference_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionReference");
/*  66 */   private static final QName _SubscribeInitialTerminationTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InitialTerminationTime");
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
/*     */   public Subscribe createSubscribe() {
/*  80 */     return new Subscribe();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NotificationMessageHolderType createNotificationMessageHolderType() {
/*  88 */     return new NotificationMessageHolderType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TopicExpressionDialectUnknownFaultType createTopicExpressionDialectUnknownFaultType() {
/*  96 */     return new TopicExpressionDialectUnknownFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public QueryExpressionType createQueryExpressionType() {
/* 104 */     return new QueryExpressionType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnableToGetMessagesFaultType createUnableToGetMessagesFaultType() {
/* 112 */     return new UnableToGetMessagesFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ResumeSubscription createResumeSubscription() {
/* 120 */     return new ResumeSubscription();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ResumeFailedFaultType createResumeFailedFaultType() {
/* 128 */     return new ResumeFailedFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InvalidProducerPropertiesExpressionFaultType createInvalidProducerPropertiesExpressionFaultType() {
/* 136 */     return new InvalidProducerPropertiesExpressionFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DestroyPullPointResponse createDestroyPullPointResponse() {
/* 144 */     return new DestroyPullPointResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PauseSubscriptionResponse createPauseSubscriptionResponse() {
/* 152 */     return new PauseSubscriptionResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ResumeSubscriptionResponse createResumeSubscriptionResponse() {
/* 160 */     return new ResumeSubscriptionResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SubscribeCreationFailedFaultType createSubscribeCreationFailedFaultType() {
/* 168 */     return new SubscribeCreationFailedFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RenewResponse createRenewResponse() {
/* 176 */     return new RenewResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnableToDestroySubscriptionFaultType createUnableToDestroySubscriptionFaultType() {
/* 184 */     return new UnableToDestroySubscriptionFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnrecognizedPolicyRequestFaultType createUnrecognizedPolicyRequestFaultType() {
/* 192 */     return new UnrecognizedPolicyRequestFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FilterType createFilterType() {
/* 200 */     return new FilterType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Subscribe.SubscriptionPolicy createSubscribeSubscriptionPolicy() {
/* 208 */     return new Subscribe.SubscriptionPolicy();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NotificationProducerRP createNotificationProducerRP() {
/* 216 */     return new NotificationProducerRP();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TopicExpressionType createTopicExpressionType() {
/* 224 */     return new TopicExpressionType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetMessages createGetMessages() {
/* 232 */     return new GetMessages();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Renew createRenew() {
/* 240 */     return new Renew();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UseRaw createUseRaw() {
/* 248 */     return new UseRaw();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreatePullPoint createCreatePullPoint() {
/* 256 */     return new CreatePullPoint();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NotifyMessageNotSupportedFaultType createNotifyMessageNotSupportedFaultType() {
/* 264 */     return new NotifyMessageNotSupportedFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetMessagesResponse createGetMessagesResponse() {
/* 272 */     return new GetMessagesResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SubscribeResponse createSubscribeResponse() {
/* 280 */     return new SubscribeResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CreatePullPointResponse createCreatePullPointResponse() {
/* 288 */     return new CreatePullPointResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnableToCreatePullPointFaultType createUnableToCreatePullPointFaultType() {
/* 296 */     return new UnableToCreatePullPointFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnacceptableInitialTerminationTimeFaultType createUnacceptableInitialTerminationTimeFaultType() {
/* 304 */     return new UnacceptableInitialTerminationTimeFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InvalidTopicExpressionFaultType createInvalidTopicExpressionFaultType() {
/* 312 */     return new InvalidTopicExpressionFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnsupportedPolicyRequestFaultType createUnsupportedPolicyRequestFaultType() {
/* 320 */     return new UnsupportedPolicyRequestFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SubscriptionManagerRP createSubscriptionManagerRP() {
/* 328 */     return new SubscriptionManagerRP();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SubscriptionPolicyType createSubscriptionPolicyType() {
/* 336 */     return new SubscriptionPolicyType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Notify createNotify() {
/* 344 */     return new Notify();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DestroyPullPoint createDestroyPullPoint() {
/* 352 */     return new DestroyPullPoint();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnsubscribeResponse createUnsubscribeResponse() {
/* 360 */     return new UnsubscribeResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetCurrentMessageResponse createGetCurrentMessageResponse() {
/* 368 */     return new GetCurrentMessageResponse();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PauseFailedFaultType createPauseFailedFaultType() {
/* 376 */     return new PauseFailedFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GetCurrentMessage createGetCurrentMessage() {
/* 384 */     return new GetCurrentMessage();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InvalidMessageContentExpressionFaultType createInvalidMessageContentExpressionFaultType() {
/* 392 */     return new InvalidMessageContentExpressionFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnableToDestroyPullPointFaultType createUnableToDestroyPullPointFaultType() {
/* 400 */     return new UnableToDestroyPullPointFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MultipleTopicsSpecifiedFaultType createMultipleTopicsSpecifiedFaultType() {
/* 408 */     return new MultipleTopicsSpecifiedFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NoCurrentMessageOnTopicFaultType createNoCurrentMessageOnTopicFaultType() {
/* 416 */     return new NoCurrentMessageOnTopicFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InvalidFilterFaultType createInvalidFilterFaultType() {
/* 424 */     return new InvalidFilterFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TopicNotSupportedFaultType createTopicNotSupportedFaultType() {
/* 432 */     return new TopicNotSupportedFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PauseSubscription createPauseSubscription() {
/* 440 */     return new PauseSubscription();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Unsubscribe createUnsubscribe() {
/* 448 */     return new Unsubscribe();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UnacceptableTerminationTimeFaultType createUnacceptableTerminationTimeFaultType() {
/* 456 */     return new UnacceptableTerminationTimeFaultType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NotificationMessageHolderType.Message createNotificationMessageHolderTypeMessage() {
/* 464 */     return new NotificationMessageHolderType.Message();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TerminationTime")
/*     */   public JAXBElement<XMLGregorianCalendar> createTerminationTime(XMLGregorianCalendar value) {
/* 473 */     return new JAXBElement(_TerminationTime_QNAME, XMLGregorianCalendar.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NotifyMessageNotSupportedFault")
/*     */   public JAXBElement<NotifyMessageNotSupportedFaultType> createNotifyMessageNotSupportedFault(NotifyMessageNotSupportedFaultType value) {
/* 482 */     return new JAXBElement(_NotifyMessageNotSupportedFault_QNAME, NotifyMessageNotSupportedFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ConsumerReference")
/*     */   public JAXBElement<EndpointReferenceType> createConsumerReference(EndpointReferenceType value) {
/* 491 */     return new JAXBElement(_ConsumerReference_QNAME, EndpointReferenceType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnsupportedPolicyRequestFault")
/*     */   public JAXBElement<UnsupportedPolicyRequestFaultType> createUnsupportedPolicyRequestFault(UnsupportedPolicyRequestFaultType value) {
/* 500 */     return new JAXBElement(_UnsupportedPolicyRequestFault_QNAME, UnsupportedPolicyRequestFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscriptionPolicy")
/*     */   public JAXBElement<SubscriptionPolicyType> createSubscriptionPolicy(SubscriptionPolicyType value) {
/* 509 */     return new JAXBElement(_SubscriptionPolicy_QNAME, SubscriptionPolicyType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NotificationMessage")
/*     */   public JAXBElement<NotificationMessageHolderType> createNotificationMessage(NotificationMessageHolderType value) {
/* 518 */     return new JAXBElement(_NotificationMessage_QNAME, NotificationMessageHolderType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnacceptableInitialTerminationTimeFault")
/*     */   public JAXBElement<UnacceptableInitialTerminationTimeFaultType> createUnacceptableInitialTerminationTimeFault(UnacceptableInitialTerminationTimeFaultType value) {
/* 528 */     return new JAXBElement(_UnacceptableInitialTerminationTimeFault_QNAME, 
/* 529 */         UnacceptableInitialTerminationTimeFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidTopicExpressionFault")
/*     */   public JAXBElement<InvalidTopicExpressionFaultType> createInvalidTopicExpressionFault(InvalidTopicExpressionFaultType value) {
/* 538 */     return new JAXBElement(_InvalidTopicExpressionFault_QNAME, InvalidTopicExpressionFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpressionDialect")
/*     */   public JAXBElement<String> createTopicExpressionDialect(String value) {
/* 547 */     return new JAXBElement(_TopicExpressionDialect_QNAME, String.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "Filter")
/*     */   public JAXBElement<FilterType> createFilter(FilterType value) {
/* 556 */     return new JAXBElement(_Filter_QNAME, FilterType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToCreatePullPointFault")
/*     */   public JAXBElement<UnableToCreatePullPointFaultType> createUnableToCreatePullPointFault(UnableToCreatePullPointFaultType value) {
/* 565 */     return new JAXBElement(_UnableToCreatePullPointFault_QNAME, UnableToCreatePullPointFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "CreationTime")
/*     */   public JAXBElement<XMLGregorianCalendar> createCreationTime(XMLGregorianCalendar value) {
/* 574 */     return new JAXBElement(_CreationTime_QNAME, XMLGregorianCalendar.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ResumeFailedFault")
/*     */   public JAXBElement<ResumeFailedFaultType> createResumeFailedFault(ResumeFailedFaultType value) {
/* 583 */     return new JAXBElement(_ResumeFailedFault_QNAME, ResumeFailedFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidProducerPropertiesExpressionFault")
/*     */   public JAXBElement<InvalidProducerPropertiesExpressionFaultType> createInvalidProducerPropertiesExpressionFault(InvalidProducerPropertiesExpressionFaultType value) {
/* 593 */     return new JAXBElement(_InvalidProducerPropertiesExpressionFault_QNAME, 
/* 594 */         InvalidProducerPropertiesExpressionFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToGetMessagesFault")
/*     */   public JAXBElement<UnableToGetMessagesFaultType> createUnableToGetMessagesFault(UnableToGetMessagesFaultType value) {
/* 603 */     return new JAXBElement(_UnableToGetMessagesFault_QNAME, UnableToGetMessagesFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "MessageContent")
/*     */   public JAXBElement<QueryExpressionType> createMessageContent(QueryExpressionType value) {
/* 612 */     return new JAXBElement(_MessageContent_QNAME, QueryExpressionType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpressionDialectUnknownFault")
/*     */   public JAXBElement<TopicExpressionDialectUnknownFaultType> createTopicExpressionDialectUnknownFault(TopicExpressionDialectUnknownFaultType value) {
/* 621 */     return new JAXBElement(_TopicExpressionDialectUnknownFault_QNAME, TopicExpressionDialectUnknownFaultType.class, 
/* 622 */         null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToDestroySubscriptionFault")
/*     */   public JAXBElement<UnableToDestroySubscriptionFaultType> createUnableToDestroySubscriptionFault(UnableToDestroySubscriptionFaultType value) {
/* 631 */     return new JAXBElement(_UnableToDestroySubscriptionFault_QNAME, UnableToDestroySubscriptionFaultType.class, null, 
/* 632 */         value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnrecognizedPolicyRequestFault")
/*     */   public JAXBElement<UnrecognizedPolicyRequestFaultType> createUnrecognizedPolicyRequestFault(UnrecognizedPolicyRequestFaultType value) {
/* 641 */     return new JAXBElement(_UnrecognizedPolicyRequestFault_QNAME, UnrecognizedPolicyRequestFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscribeCreationFailedFault")
/*     */   public JAXBElement<SubscribeCreationFailedFaultType> createSubscribeCreationFailedFault(SubscribeCreationFailedFaultType value) {
/* 650 */     return new JAXBElement(_SubscribeCreationFailedFault_QNAME, SubscribeCreationFailedFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ProducerReference")
/*     */   public JAXBElement<EndpointReferenceType> createProducerReference(EndpointReferenceType value) {
/* 659 */     return new JAXBElement(_ProducerReference_QNAME, EndpointReferenceType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NoCurrentMessageOnTopicFault")
/*     */   public JAXBElement<NoCurrentMessageOnTopicFaultType> createNoCurrentMessageOnTopicFault(NoCurrentMessageOnTopicFaultType value) {
/* 668 */     return new JAXBElement(_NoCurrentMessageOnTopicFault_QNAME, NoCurrentMessageOnTopicFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "MultipleTopicsSpecifiedFault")
/*     */   public JAXBElement<MultipleTopicsSpecifiedFaultType> createMultipleTopicsSpecifiedFault(MultipleTopicsSpecifiedFaultType value) {
/* 677 */     return new JAXBElement(_MultipleTopicsSpecifiedFault_QNAME, MultipleTopicsSpecifiedFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnacceptableTerminationTimeFault")
/*     */   public JAXBElement<UnacceptableTerminationTimeFaultType> createUnacceptableTerminationTimeFault(UnacceptableTerminationTimeFaultType value) {
/* 686 */     return new JAXBElement(_UnacceptableTerminationTimeFault_QNAME, UnacceptableTerminationTimeFaultType.class, null, 
/* 687 */         value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "CurrentTime")
/*     */   public JAXBElement<XMLGregorianCalendar> createCurrentTime(XMLGregorianCalendar value) {
/* 696 */     return new JAXBElement(_CurrentTime_QNAME, XMLGregorianCalendar.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpression")
/*     */   public JAXBElement<TopicExpressionType> createTopicExpression(TopicExpressionType value) {
/* 705 */     return new JAXBElement(_TopicExpression_QNAME, TopicExpressionType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ProducerProperties")
/*     */   public JAXBElement<QueryExpressionType> createProducerProperties(QueryExpressionType value) {
/* 714 */     return new JAXBElement(_ProducerProperties_QNAME, QueryExpressionType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicNotSupportedFault")
/*     */   public JAXBElement<TopicNotSupportedFaultType> createTopicNotSupportedFault(TopicNotSupportedFaultType value) {
/* 723 */     return new JAXBElement(_TopicNotSupportedFault_QNAME, TopicNotSupportedFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidFilterFault")
/*     */   public JAXBElement<InvalidFilterFaultType> createInvalidFilterFault(InvalidFilterFaultType value) {
/* 732 */     return new JAXBElement(_InvalidFilterFault_QNAME, InvalidFilterFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "FixedTopicSet", defaultValue = "true")
/*     */   public JAXBElement<Boolean> createFixedTopicSet(Boolean value) {
/* 741 */     return new JAXBElement(_FixedTopicSet_QNAME, Boolean.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "Topic")
/*     */   public JAXBElement<TopicExpressionType> createTopic(TopicExpressionType value) {
/* 750 */     return new JAXBElement(_Topic_QNAME, TopicExpressionType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToDestroyPullPointFault")
/*     */   public JAXBElement<UnableToDestroyPullPointFaultType> createUnableToDestroyPullPointFault(UnableToDestroyPullPointFaultType value) {
/* 759 */     return new JAXBElement(_UnableToDestroyPullPointFault_QNAME, UnableToDestroyPullPointFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidMessageContentExpressionFault")
/*     */   public JAXBElement<InvalidMessageContentExpressionFaultType> createInvalidMessageContentExpressionFault(InvalidMessageContentExpressionFaultType value) {
/* 768 */     return new JAXBElement(_InvalidMessageContentExpressionFault_QNAME, 
/* 769 */         InvalidMessageContentExpressionFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "PauseFailedFault")
/*     */   public JAXBElement<PauseFailedFaultType> createPauseFailedFault(PauseFailedFaultType value) {
/* 778 */     return new JAXBElement(_PauseFailedFault_QNAME, PauseFailedFaultType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscriptionReference")
/*     */   public JAXBElement<EndpointReferenceType> createSubscriptionReference(EndpointReferenceType value) {
/* 787 */     return new JAXBElement(_SubscriptionReference_QNAME, EndpointReferenceType.class, null, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InitialTerminationTime", scope = Subscribe.class)
/*     */   public JAXBElement<String> createSubscribeInitialTerminationTime(String value) {
/* 796 */     return new JAXBElement(_SubscribeInitialTerminationTime_QNAME, String.class, Subscribe.class, value);
/*     */   }
/*     */ }


/* Location:              C:\Users\Billy\Downloads\onvif-2016-03-16.jar!\org\oasis_open\docs\wsn\b_2\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */