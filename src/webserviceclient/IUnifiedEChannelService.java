package webserviceclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.huge.iunifiedechannelservice.Check;
import com.huge.iunifiedechannelservice.CheckResponse;
import com.huge.iunifiedechannelservice.FindBillInfo;
import com.huge.iunifiedechannelservice.FindBillInfoResponse;
import com.huge.iunifiedechannelservice.FindCustomerBalanceInfo;
import com.huge.iunifiedechannelservice.FindCustomerBalanceInfoResponse;
import com.huge.iunifiedechannelservice.FindCustomerInfo;
import com.huge.iunifiedechannelservice.FindCustomerInfoResponse;
import com.huge.iunifiedechannelservice.FindProductOfferingInfo;
import com.huge.iunifiedechannelservice.FindProductOfferingInfoResponseWrapper;
import com.huge.iunifiedechannelservice.FindTerminalInfo;
import com.huge.iunifiedechannelservice.FindTerminalInfoResponse;
import com.huge.iunifiedechannelservice.FindValueAddedProductInfo;
import com.huge.iunifiedechannelservice.FindValueAddedProductInfoResponse;
import com.huge.iunifiedechannelservice.FindVodInfo;
import com.huge.iunifiedechannelservice.FindVodInfoResponseWrapper;
import com.huge.iunifiedechannelservice.Login;
import com.huge.iunifiedechannelservice.LoginResponse;
import com.huge.iunifiedechannelservice.ModifyServicePassword;
import com.huge.iunifiedechannelservice.ModifyServicePasswordResponse;
import com.huge.iunifiedechannelservice.OpenInteractionAccount;
import com.huge.iunifiedechannelservice.OpenInteractionAccountResponse;
import com.huge.iunifiedechannelservice.Purchase;
import com.huge.iunifiedechannelservice.PurchaseExclusiveBalanceProduct;
import com.huge.iunifiedechannelservice.PurchaseExclusiveBalanceProductResponse;
import com.huge.iunifiedechannelservice.PurchaseResponse;
import com.huge.iunifiedechannelservice.Recharge;
import com.huge.iunifiedechannelservice.RechargeResponse;

@WebService(name = "IUnifiedEChannelService", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IUnifiedEChannelService {

	@WebMethod(operationName = "purchase", action = "purchase")
	@WebResult(name = "purchaseResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public PurchaseResponse purchase(
			@WebParam(name = "purchase", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			Purchase purchase);

	@WebMethod(operationName = "login", action = "login")
	@WebResult(name = "loginResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public LoginResponse login(
			@WebParam(name = "login", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			Login login);

	@WebMethod(operationName = "openInteractionAccount", action = "openInteractionAccount")
	@WebResult(name = "openInteractionAccountResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public OpenInteractionAccountResponse openInteractionAccount(
			@WebParam(name = "openInteractionAccount", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			OpenInteractionAccount openInteractionAccount);

	@WebMethod(operationName = "findTerminalInfo", action = "findTerminalInfo")
	@WebResult(name = "findTerminalInfoResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public FindTerminalInfoResponse findTerminalInfo(
			@WebParam(name = "findTerminalInfo", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			FindTerminalInfo findTerminalInfo);

	@WebMethod(operationName = "findBillInfo", action = "findBillInfo")
	@WebResult(name = "findBillInfoResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public FindBillInfoResponse findBillInfo(
			@WebParam(name = "findBillInfo", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			FindBillInfo findBillInfo);

	@WebMethod(operationName = "check", action = "check")
	@WebResult(name = "checkResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public CheckResponse check(
			@WebParam(name = "check", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			Check check);

	@WebMethod(operationName = "purchaseExclusiveBalanceProduct", action = "purchaseExclusiveBalanceProduct")
	@WebResult(name = "purchaseExclusiveBalanceProductResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public PurchaseExclusiveBalanceProductResponse purchaseExclusiveBalanceProduct(
			@WebParam(name = "purchaseExclusiveBalanceProduct", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			PurchaseExclusiveBalanceProduct purchaseExclusiveBalanceProduct);

	@WebMethod(operationName = "findProductOfferingInfo", action = "findProductOfferingInfo")
	@WebResult(name = "findProductOfferingInfoResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public FindProductOfferingInfoResponseWrapper findProductOfferingInfo(
			@WebParam(name = "findProductOfferingInfo", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			FindProductOfferingInfo findProductOfferingInfo);

	@WebMethod(operationName = "findCustomerBalanceInfo", action = "findCustomerBalanceInfo")
	@WebResult(name = "findCustomerBalanceInfoResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public FindCustomerBalanceInfoResponse findCustomerBalanceInfo(
			@WebParam(name = "findCustomerBalanceInfo", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			FindCustomerBalanceInfo findCustomerBalanceInfo);

	@WebMethod(operationName = "modifyServicePassword", action = "modifyServicePassword")
	@WebResult(name = "modifyServicePasswordResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public ModifyServicePasswordResponse modifyServicePassword(
			@WebParam(name = "modifyServicePassword", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			ModifyServicePassword modifyServicePassword);

	@WebMethod(operationName = "recharge", action = "recharge")
	@WebResult(name = "rechargeResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public RechargeResponse recharge(
			@WebParam(name = "recharge", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			Recharge recharge);

	@WebMethod(operationName = "findCustomerInfo", action = "findCustomerInfo")
	@WebResult(name = "findCustomerInfoResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public FindCustomerInfoResponse findCustomerInfo(
			@WebParam(name = "findCustomerInfo", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			FindCustomerInfo findCustomerInfo);

	@WebMethod(operationName = "findVodInfo", action = "findVodInfo")
	@WebResult(name = "findVodInfoResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public FindVodInfoResponseWrapper findVodInfo(
			@WebParam(name = "findVodInfo", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			FindVodInfo findVodInfo);

	@WebMethod(operationName = "findValueAddedProductInfo", action = "findValueAddedProductInfo")
	@WebResult(name = "findValueAddedProductInfoResponse", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
	public FindValueAddedProductInfoResponse findValueAddedProductInfo(
			@WebParam(name = "findValueAddedProductInfo", targetNamespace = "http://www.huge.com/IUnifiedEChannelService/")
			FindValueAddedProductInfo findValueAddedProductInfo);

}
