package com.shingle.cxf.config;

import com.shingle.cxf.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class WebServiceConfig {

    @Resource
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        List<Interceptor<? extends Message>> inInterceptors = bus.getInInterceptors();
        List<Interceptor<? extends Message>> outInterceptors = bus.getOutInterceptors();
        inInterceptors.add(new LoggingInInterceptor());
        outInterceptors.add(new LoggingOutInterceptor());
        EndpointImpl endpoint = new EndpointImpl(bus, new UserServiceImpl(), null, null, null);
        endpoint.publish("/");
        return endpoint;
    }
}
