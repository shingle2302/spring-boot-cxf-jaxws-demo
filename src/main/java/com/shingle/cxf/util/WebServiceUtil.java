package com.shingle.cxf.util;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

public class WebServiceUtil {


    @SuppressWarnings("unchecked")
    public static <T> T createService(Class<T> clazz, String serviceUrl) throws Exception {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress(serviceUrl);
        factory.setServiceClass(clazz);
        factory.setUsername("shingle2302");
        factory.setPassword("123456");
        T webService = (T) factory.create();
        Client proxy = ClientProxy.getClient(webService);
        HTTPConduit httpConduit = (HTTPConduit) proxy.getConduit();
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(6000);
        policy.setReceiveTimeout(6000);
        httpConduit.setClient(policy);
        return webService;
    }
}
