package com.shingle.cxf.util;

import jakarta.annotation.Resource;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.stereotype.Component;

@Component
public class DynamicClient {

    @Resource
    private JaxWsDynamicClientFactory jaxWsDynamicClientFactory;

    public Object[] invokeWebService(String serviceUrl, String methodName, Object[] args) throws Exception {
        try (Client client = jaxWsDynamicClientFactory.createClient(serviceUrl)) {
            client.getInInterceptors().add(new LoggingInInterceptor());
            client.getOutInterceptors().add(new LoggingOutInterceptor());
            return client.invoke(methodName, args);
        }
    }
}
