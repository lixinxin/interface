
package com.huge.iunifiedechannelservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huge.iunifiedechannelservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindTerminalInfo_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findTerminalInfo");
    private final static QName _FindValueAddedProductInfo_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findValueAddedProductInfo");
    private final static QName _FindValueAddedProductInfoResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findValueAddedProductInfoResponse");
    private final static QName _FindBillInfo_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findBillInfo");
    private final static QName _FindProductOfferingInfoResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findProductOfferingInfoResponse");
    private final static QName _FindCustomerBalanceInfoResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findCustomerBalanceInfoResponse");
    private final static QName _CheckResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "checkResponse");
    private final static QName _FindTerminalInfoResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findTerminalInfoResponse");
    private final static QName _FindBillInfoResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findBillInfoResponse");
    private final static QName _FindCustomerInfoResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findCustomerInfoResponse");
    private final static QName _FindCustomerBalanceInfo_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findCustomerBalanceInfo");
    private final static QName _Check_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "check");
    private final static QName _LoginResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "loginResponse");
    private final static QName _RechargeResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "rechargeResponse");
    private final static QName _OpenInteractionAccountResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "openInteractionAccountResponse");
    private final static QName _FindCustomerInfo_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findCustomerInfo");
    private final static QName _FindVodInfoResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "findVodInfoResponse");
    private final static QName _ModifyServicePasswordResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "modifyServicePasswordResponse");
    private final static QName _PurchaseResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "purchaseResponse");
    private final static QName _PurchaseExclusiveBalanceProductResponse_QNAME = new QName("http://www.huge.com/IUnifiedEChannelService/", "purchaseExclusiveBalanceProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huge.iunifiedechannelservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AreaInfo }
     * 
     */
    public AreaInfo createAreaInfo() {
        return new AreaInfo();
    }

    /**
     * Create an instance of {@link FindCustomerInfo }
     * 
     */
    public FindCustomerInfo createFindCustomerInfo() {
        return new FindCustomerInfo();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link FindValueAddedProductInfoResponse }
     * 
     */
    public FindValueAddedProductInfoResponse createFindValueAddedProductInfoResponse() {
        return new FindValueAddedProductInfoResponse();
    }

    /**
     * Create an instance of {@link FindCustomerBalanceInfo }
     * 
     */
    public FindCustomerBalanceInfo createFindCustomerBalanceInfo() {
        return new FindCustomerBalanceInfo();
    }

    /**
     * Create an instance of {@link PurchaseExclusiveBalanceProductResponse }
     * 
     */
    public PurchaseExclusiveBalanceProductResponse createPurchaseExclusiveBalanceProductResponse() {
        return new PurchaseExclusiveBalanceProductResponse();
    }

    /**
     * Create an instance of {@link OpenInteractionAccountResponse }
     * 
     */
    public OpenInteractionAccountResponse createOpenInteractionAccountResponse() {
        return new OpenInteractionAccountResponse();
    }

    /**
     * Create an instance of {@link CommonTradeInfo }
     * 
     */
    public CommonTradeInfo createCommonTradeInfo() {
        return new CommonTradeInfo();
    }

    /**
     * Create an instance of {@link PurchaseExclusiveBalanceProduct }
     * 
     */
    public PurchaseExclusiveBalanceProduct createPurchaseExclusiveBalanceProduct() {
        return new PurchaseExclusiveBalanceProduct();
    }

    /**
     * Create an instance of {@link ValueAddedProductInfo.PreferentialPolicyInfos }
     * 
     */
    public ValueAddedProductInfo.PreferentialPolicyInfos createValueAddedProductInfoPreferentialPolicyInfos() {
        return new ValueAddedProductInfo.PreferentialPolicyInfos();
    }

    /**
     * Create an instance of {@link FindProductOfferingInfo }
     * 
     */
    public FindProductOfferingInfo createFindProductOfferingInfo() {
        return new FindProductOfferingInfo();
    }

    /**
     * Create an instance of {@link MapType }
     * 
     */
    public MapType createMapType() {
        return new MapType();
    }

    /**
     * Create an instance of {@link ModifyServicePassword }
     * 
     */
    public ModifyServicePassword createModifyServicePassword() {
        return new ModifyServicePassword();
    }

    /**
     * Create an instance of {@link ProductOfferingInfo }
     * 
     */
    public ProductOfferingInfo createProductOfferingInfo() {
        return new ProductOfferingInfo();
    }

    /**
     * Create an instance of {@link FindProductOfferingInfoResponseWrapper }
     * 
     */
    public FindProductOfferingInfoResponseWrapper createFindProductOfferingInfoResponseWrapper() {
        return new FindProductOfferingInfoResponseWrapper();
    }

    /**
     * Create an instance of {@link PurchaseExclusiveBalanceProduct.PurchaseInfos }
     * 
     */
    public PurchaseExclusiveBalanceProduct.PurchaseInfos createPurchaseExclusiveBalanceProductPurchaseInfos() {
        return new PurchaseExclusiveBalanceProduct.PurchaseInfos();
    }

    /**
     * Create an instance of {@link CallResultInfo }
     * 
     */
    public CallResultInfo createCallResultInfo() {
        return new CallResultInfo();
    }

    /**
     * Create an instance of {@link FindVodInfoResponseWrapper.VodInfos }
     * 
     */
    public FindVodInfoResponseWrapper.VodInfos createFindVodInfoResponseWrapperVodInfos() {
        return new FindVodInfoResponseWrapper.VodInfos();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link FindBillInfoResponse }
     * 
     */
    public FindBillInfoResponse createFindBillInfoResponse() {
        return new FindBillInfoResponse();
    }

    /**
     * Create an instance of {@link BillInfo }
     * 
     */
    public BillInfo createBillInfo() {
        return new BillInfo();
    }

    /**
     * Create an instance of {@link ModifyServicePasswordResponse }
     * 
     */
    public ModifyServicePasswordResponse createModifyServicePasswordResponse() {
        return new ModifyServicePasswordResponse();
    }

    /**
     * Create an instance of {@link CheckResponse }
     * 
     */
    public CheckResponse createCheckResponse() {
        return new CheckResponse();
    }

    /**
     * Create an instance of {@link MapEntry }
     * 
     */
    public MapEntry createMapEntry() {
        return new MapEntry();
    }

    /**
     * Create an instance of {@link PurchaseResponse }
     * 
     */
    public PurchaseResponse createPurchaseResponse() {
        return new PurchaseResponse();
    }

    /**
     * Create an instance of {@link TerminalInfo }
     * 
     */
    public TerminalInfo createTerminalInfo() {
        return new TerminalInfo();
    }

    /**
     * Create an instance of {@link Purchase }
     * 
     */
    public Purchase createPurchase() {
        return new Purchase();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link CustomerBalanceInfo }
     * 
     */
    public CustomerBalanceInfo createCustomerBalanceInfo() {
        return new CustomerBalanceInfo();
    }

    /**
     * Create an instance of {@link OpenInteractionAccount }
     * 
     */
    public OpenInteractionAccount createOpenInteractionAccount() {
        return new OpenInteractionAccount();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link FindCustomerBalanceInfoResponse }
     * 
     */
    public FindCustomerBalanceInfoResponse createFindCustomerBalanceInfoResponse() {
        return new FindCustomerBalanceInfoResponse();
    }

    /**
     * Create an instance of {@link FindVodInfo }
     * 
     */
    public FindVodInfo createFindVodInfo() {
        return new FindVodInfo();
    }

    /**
     * Create an instance of {@link ProductOfferingInfo.PreferentialPolicyInfos }
     * 
     */
    public ProductOfferingInfo.PreferentialPolicyInfos createProductOfferingInfoPreferentialPolicyInfos() {
        return new ProductOfferingInfo.PreferentialPolicyInfos();
    }

    /**
     * Create an instance of {@link ValueAddedProductInfo }
     * 
     */
    public ValueAddedProductInfo createValueAddedProductInfo() {
        return new ValueAddedProductInfo();
    }

    /**
     * Create an instance of {@link FindBillInfo }
     * 
     */
    public FindBillInfo createFindBillInfo() {
        return new FindBillInfo();
    }

    /**
     * Create an instance of {@link ExternalTradeCheckingInfo }
     * 
     */
    public ExternalTradeCheckingInfo createExternalTradeCheckingInfo() {
        return new ExternalTradeCheckingInfo();
    }

    /**
     * Create an instance of {@link CustomerInfo.AreaInfos }
     * 
     */
    public CustomerInfo.AreaInfos createCustomerInfoAreaInfos() {
        return new CustomerInfo.AreaInfos();
    }

    /**
     * Create an instance of {@link FindCustomerInfoResponse }
     * 
     */
    public FindCustomerInfoResponse createFindCustomerInfoResponse() {
        return new FindCustomerInfoResponse();
    }

    /**
     * Create an instance of {@link FindVodInfoResponseWrapper }
     * 
     */
    public FindVodInfoResponseWrapper createFindVodInfoResponseWrapper() {
        return new FindVodInfoResponseWrapper();
    }

    /**
     * Create an instance of {@link FindTerminalInfo }
     * 
     */
    public FindTerminalInfo createFindTerminalInfo() {
        return new FindTerminalInfo();
    }

    /**
     * Create an instance of {@link RechargeResponse }
     * 
     */
    public RechargeResponse createRechargeResponse() {
        return new RechargeResponse();
    }

    /**
     * Create an instance of {@link RechargeInfo }
     * 
     */
    public RechargeInfo createRechargeInfo() {
        return new RechargeInfo();
    }

    /**
     * Create an instance of {@link VodInfo }
     * 
     */
    public VodInfo createVodInfo() {
        return new VodInfo();
    }

    /**
     * Create an instance of {@link FindTerminalInfoResponse }
     * 
     */
    public FindTerminalInfoResponse createFindTerminalInfoResponse() {
        return new FindTerminalInfoResponse();
    }

    /**
     * Create an instance of {@link Recharge }
     * 
     */
    public Recharge createRecharge() {
        return new Recharge();
    }

    /**
     * Create an instance of {@link Purchase.PurchaseInfos }
     * 
     */
    public Purchase.PurchaseInfos createPurchasePurchaseInfos() {
        return new Purchase.PurchaseInfos();
    }

    /**
     * Create an instance of {@link FindProductOfferingInfoResponseWrapper.ProductOfferingInfos }
     * 
     */
    public FindProductOfferingInfoResponseWrapper.ProductOfferingInfos createFindProductOfferingInfoResponseWrapperProductOfferingInfos() {
        return new FindProductOfferingInfoResponseWrapper.ProductOfferingInfos();
    }

    /**
     * Create an instance of {@link PurchaseInfo }
     * 
     */
    public PurchaseInfo createPurchaseInfo() {
        return new PurchaseInfo();
    }

    /**
     * Create an instance of {@link FindValueAddedProductInfo }
     * 
     */
    public FindValueAddedProductInfo createFindValueAddedProductInfo() {
        return new FindValueAddedProductInfo();
    }

    /**
     * Create an instance of {@link PreferentialPolicyInfo }
     * 
     */
    public PreferentialPolicyInfo createPreferentialPolicyInfo() {
        return new PreferentialPolicyInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTerminalInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findTerminalInfo")
    public JAXBElement<FindTerminalInfo> createFindTerminalInfo(FindTerminalInfo value) {
        return new JAXBElement<FindTerminalInfo>(_FindTerminalInfo_QNAME, FindTerminalInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindValueAddedProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findValueAddedProductInfo")
    public JAXBElement<FindValueAddedProductInfo> createFindValueAddedProductInfo(FindValueAddedProductInfo value) {
        return new JAXBElement<FindValueAddedProductInfo>(_FindValueAddedProductInfo_QNAME, FindValueAddedProductInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindValueAddedProductInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findValueAddedProductInfoResponse")
    public JAXBElement<FindValueAddedProductInfoResponse> createFindValueAddedProductInfoResponse(FindValueAddedProductInfoResponse value) {
        return new JAXBElement<FindValueAddedProductInfoResponse>(_FindValueAddedProductInfoResponse_QNAME, FindValueAddedProductInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBillInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findBillInfo")
    public JAXBElement<FindBillInfo> createFindBillInfo(FindBillInfo value) {
        return new JAXBElement<FindBillInfo>(_FindBillInfo_QNAME, FindBillInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductOfferingInfoResponseWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findProductOfferingInfoResponse")
    public JAXBElement<FindProductOfferingInfoResponseWrapper> createFindProductOfferingInfoResponse(FindProductOfferingInfoResponseWrapper value) {
        return new JAXBElement<FindProductOfferingInfoResponseWrapper>(_FindProductOfferingInfoResponse_QNAME, FindProductOfferingInfoResponseWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerBalanceInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findCustomerBalanceInfoResponse")
    public JAXBElement<FindCustomerBalanceInfoResponse> createFindCustomerBalanceInfoResponse(FindCustomerBalanceInfoResponse value) {
        return new JAXBElement<FindCustomerBalanceInfoResponse>(_FindCustomerBalanceInfoResponse_QNAME, FindCustomerBalanceInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "checkResponse")
    public JAXBElement<CheckResponse> createCheckResponse(CheckResponse value) {
        return new JAXBElement<CheckResponse>(_CheckResponse_QNAME, CheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTerminalInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findTerminalInfoResponse")
    public JAXBElement<FindTerminalInfoResponse> createFindTerminalInfoResponse(FindTerminalInfoResponse value) {
        return new JAXBElement<FindTerminalInfoResponse>(_FindTerminalInfoResponse_QNAME, FindTerminalInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBillInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findBillInfoResponse")
    public JAXBElement<FindBillInfoResponse> createFindBillInfoResponse(FindBillInfoResponse value) {
        return new JAXBElement<FindBillInfoResponse>(_FindBillInfoResponse_QNAME, FindBillInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findCustomerInfoResponse")
    public JAXBElement<FindCustomerInfoResponse> createFindCustomerInfoResponse(FindCustomerInfoResponse value) {
        return new JAXBElement<FindCustomerInfoResponse>(_FindCustomerInfoResponse_QNAME, FindCustomerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerBalanceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findCustomerBalanceInfo")
    public JAXBElement<FindCustomerBalanceInfo> createFindCustomerBalanceInfo(FindCustomerBalanceInfo value) {
        return new JAXBElement<FindCustomerBalanceInfo>(_FindCustomerBalanceInfo_QNAME, FindCustomerBalanceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Check }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "check")
    public JAXBElement<Check> createCheck(Check value) {
        return new JAXBElement<Check>(_Check_QNAME, Check.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechargeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "rechargeResponse")
    public JAXBElement<RechargeResponse> createRechargeResponse(RechargeResponse value) {
        return new JAXBElement<RechargeResponse>(_RechargeResponse_QNAME, RechargeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenInteractionAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "openInteractionAccountResponse")
    public JAXBElement<OpenInteractionAccountResponse> createOpenInteractionAccountResponse(OpenInteractionAccountResponse value) {
        return new JAXBElement<OpenInteractionAccountResponse>(_OpenInteractionAccountResponse_QNAME, OpenInteractionAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findCustomerInfo")
    public JAXBElement<FindCustomerInfo> createFindCustomerInfo(FindCustomerInfo value) {
        return new JAXBElement<FindCustomerInfo>(_FindCustomerInfo_QNAME, FindCustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindVodInfoResponseWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "findVodInfoResponse")
    public JAXBElement<FindVodInfoResponseWrapper> createFindVodInfoResponse(FindVodInfoResponseWrapper value) {
        return new JAXBElement<FindVodInfoResponseWrapper>(_FindVodInfoResponse_QNAME, FindVodInfoResponseWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyServicePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "modifyServicePasswordResponse")
    public JAXBElement<ModifyServicePasswordResponse> createModifyServicePasswordResponse(ModifyServicePasswordResponse value) {
        return new JAXBElement<ModifyServicePasswordResponse>(_ModifyServicePasswordResponse_QNAME, ModifyServicePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "purchaseResponse")
    public JAXBElement<PurchaseResponse> createPurchaseResponse(PurchaseResponse value) {
        return new JAXBElement<PurchaseResponse>(_PurchaseResponse_QNAME, PurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseExclusiveBalanceProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huge.com/IUnifiedEChannelService/", name = "purchaseExclusiveBalanceProductResponse")
    public JAXBElement<PurchaseExclusiveBalanceProductResponse> createPurchaseExclusiveBalanceProductResponse(PurchaseExclusiveBalanceProductResponse value) {
        return new JAXBElement<PurchaseExclusiveBalanceProductResponse>(_PurchaseExclusiveBalanceProductResponse_QNAME, PurchaseExclusiveBalanceProductResponse.class, null, value);
    }

}
