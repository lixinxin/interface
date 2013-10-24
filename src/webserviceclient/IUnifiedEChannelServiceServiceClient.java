
package webserviceclient;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.aegis.AegisBindingProvider;
import org.codehaus.xfire.annotations.AnnotationServiceFactory;
import org.codehaus.xfire.annotations.jsr181.Jsr181WebAnnotations;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.jaxb2.JaxbTypeRegistry;
import org.codehaus.xfire.service.Endpoint;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.soap.AbstractSoapBinding;
import org.codehaus.xfire.transport.TransportManager;

import webserviceclient.dao.BusinessOrderInfoDao;
import webserviceclient.util.CommMethod;

import com.huge.iunifiedechannelservice.CommonTradeInfo;
import com.huge.iunifiedechannelservice.FindCustomerInfo;
import com.huge.iunifiedechannelservice.FindCustomerInfoResponse;

public class IUnifiedEChannelServiceServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public IUnifiedEChannelServiceServiceClient() {
        create0();
        Endpoint IUnifiedEChannelServiceLocalEndpointEP = service0 .addEndpoint(new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServiceLocalEndpoint"), new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServiceLocalBinding"), "xfire.local://IUnifiedEChannelServiceService");
        endpoints.put(new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServiceLocalEndpoint"), IUnifiedEChannelServiceLocalEndpointEP);
        Endpoint IUnifiedEChannelServicePortEP = service0 .addEndpoint(new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServicePort"), new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServiceServiceSoapBinding"), "http://localhost:9090/hello");
        endpoints.put(new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServicePort"), IUnifiedEChannelServicePortEP);
    }

    public Object getEndpoint(Endpoint endpoint) {
        try {
            return proxyFactory.create((endpoint).getBinding(), (endpoint).getUrl());
        } catch (MalformedURLException e) {
            throw new XFireRuntimeException("Invalid URL", e);
        }
    }

    public Object getEndpoint(QName name) {
        Endpoint endpoint = ((Endpoint) endpoints.get((name)));
        if ((endpoint) == null) {
            throw new IllegalStateException("No such endpoint!");
        }
        return getEndpoint((endpoint));
    }

    public Collection getEndpoints() {
        return endpoints.values();
    }

    private void create0() {
        TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
        HashMap props = new HashMap();
        props.put("annotations.allow.interface", true);
        AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new JaxbTypeRegistry()));
        asf.setBindingCreationEnabled(false);
        service0 = asf.create((webserviceclient.IUnifiedEChannelService.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServiceLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServiceServiceSoapBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public IUnifiedEChannelService getIUnifiedEChannelServiceLocalEndpoint() {
        return ((IUnifiedEChannelService)(this).getEndpoint(new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServiceLocalEndpoint")));
    }

    public IUnifiedEChannelService getIUnifiedEChannelServiceLocalEndpoint(String url) {
        IUnifiedEChannelService var = getIUnifiedEChannelServiceLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public IUnifiedEChannelService getIUnifiedEChannelServicePort() {
        return ((IUnifiedEChannelService)(this).getEndpoint(new QName("http://www.huge.com/IUnifiedEChannelService/", "IUnifiedEChannelServicePort")));
    }

    public IUnifiedEChannelService getIUnifiedEChannelServicePort(String url) {
        IUnifiedEChannelService var = getIUnifiedEChannelServicePort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }
    //产生基本报头信息
    CommonTradeInfo getCommonTradeInfo(){
    	CommonTradeInfo commonTradeInfo = new CommonTradeInfo();
        commonTradeInfo.setOperationRoleCode("WF");  //运营商编码
        commonTradeInfo.setServiceChannel(""); //验证码（暂时传空）
        commonTradeInfo.setVerificationCode("213");//服务渠道 网上营业厅：213  电视营业厅：214 移动：217
        return commonTradeInfo;
    }
    //查询用户的基本信息
    public FindCustomerInfoResponse findCustomerInfo(FindCustomerInfo findCustomerInfo){
    	
//    	//查询用户信息，根据智能卡号
//        FindCustomerInfo findCustomerInfo = new FindCustomerInfo();
//        findCustomerInfo.setCustomerIdentificationType(2);
//        findCustomerInfo.setCustomerIdentification("");
//        findCustomerInfo.setCommonTradeInfo(commonTradeInfo);
//        FindCustomerInfoResponse  ifResponse =  service.findCustomerInfo(findCustomerInfo);
    	return null;
    }
    public static void main(String[] args) {
        

        IUnifiedEChannelServiceServiceClient client = new IUnifiedEChannelServiceServiceClient();
        
		//create a default service endpoint
        IUnifiedEChannelService service = client.getIUnifiedEChannelServicePort();
        //测试库连接
		SqlSessionFactory  sessionFactory =CommMethod.getSqlSessionFactory();
		SqlSession sqlSession = sessionFactory.openSession();
		BusinessOrderInfoDao businessOrderInfoDao = sqlSession.getMapper(BusinessOrderInfoDao.class);
		List list = businessOrderInfoDao.selectAll();
		System.out.println("记录条数："+list.size());
		System.out.println("test client completed");
//        System.exit(0);
        CommonTradeInfo commonTradeInfo = new CommonTradeInfo();
        commonTradeInfo.setOperationRoleCode("WF");  //运营商编码
        commonTradeInfo.setServiceChannel(""); //验证码（暂时传空）
        commonTradeInfo.setVerificationCode("213");//服务渠道 网上营业厅：213  电视营业厅：214 移动：217
        
        //查询用户信息，根据智能卡号
        FindCustomerInfo findCustomerInfo = new FindCustomerInfo();
        findCustomerInfo.setCustomerIdentificationType(2);
        findCustomerInfo.setCustomerIdentification("");
        findCustomerInfo.setCommonTradeInfo(commonTradeInfo);
        FindCustomerInfoResponse  ifResponse =  service.findCustomerInfo(findCustomerInfo);
        //查询用户当前的产品信息
//        service.findProductOfferingInfo(findProductOfferingInfo);
        
    }

}
