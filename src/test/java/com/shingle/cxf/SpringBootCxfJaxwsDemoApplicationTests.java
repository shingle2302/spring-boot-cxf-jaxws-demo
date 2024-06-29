package com.shingle.cxf;


import cn.com.webxml.ArrayOfString;
import cn.com.webxml.IpAddressSearchWebService;
import cn.com.webxml.IpAddressSearchWebServiceSoap;
import com.shingle.cxf.client.UserBo;
import com.shingle.cxf.client.UserQueryParam;
import com.shingle.cxf.client.UserService;
import com.shingle.cxf.client.UserService_Service;
import com.shingle.cxf.util.DynamicClient;

import com.shingle.cxf.util.WebServiceUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootCxfJaxwsDemoApplicationTests {


    @Resource
    private DynamicClient client;

    @Test
    void contextLoads() throws Exception {
        Object[] getCountryCityByIps = client.invokeWebService("http://www.webxml.com.cn/WebServices/IpAddressSearchWebService.asmx?wsdl", "getCountryCityByIp", new String[]{"192.168.0.0.4"});
        Object getCountryCityByIp = getCountryCityByIps[0];
        System.out.println(getCountryCityByIp);
    }


    @Test
    void uerServiceProxyFactoryBeanTest() throws Exception {
        UserService userService = WebServiceUtil.createService(UserService.class,"http://localhost:8080/service/UserService");
        UserBo userBo = userService.getUserById(1L);
        System.out.println(userBo);
    }

    @Test
    void userServiceFactoryTest() {
        UserService_Service factory = new UserService_Service();
        UserService userService = factory.getUserServiceImplPort();
        UserBo userBo = userService.getUserById(1L);
        System.out.println(userBo);
    }

    @Test
    void userServiceFactoryTest2() {
        UserService_Service factory = new UserService_Service();
        UserService userService = factory.getUserServiceImplPort();
        UserQueryParam userQueryParam = new UserQueryParam();
        userQueryParam.setId(1L);
        UserBo userBo = userService.queryUserByParam(userQueryParam);
        System.out.println(userBo);
    }

    @Test
    void IpAddressSearchWebServiceSoapTest() {
        IpAddressSearchWebService factory = new IpAddressSearchWebService();
        IpAddressSearchWebServiceSoap ipAddressSearchWebServiceSoap = factory.getIpAddressSearchWebServiceSoap();
        ArrayOfString countryCityByIp = ipAddressSearchWebServiceSoap.getCountryCityByIp("192.168.0.100");
        System.out.println(countryCityByIp.getString());
    }
    @Test
    void IpAddressSearchWebServiceSoapTest2() throws Exception {
        IpAddressSearchWebServiceSoap ipAddressSearchWebServiceSoap = WebServiceUtil.createService(IpAddressSearchWebServiceSoap.class, "http://www.webxml.com.cn/WebServices/IpAddressSearchWebService.asmx");
        ArrayOfString countryCityByIp = ipAddressSearchWebServiceSoap.getCountryCityByIp("192.168.0.100");
        System.out.println(countryCityByIp.getString());
    }




}
