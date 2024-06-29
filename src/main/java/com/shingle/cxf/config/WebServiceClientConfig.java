package com.shingle.cxf.config;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceClientConfig {

    @Bean
    public JaxWsDynamicClientFactory jaxWsDynamicClientFactory() {
        return JaxWsDynamicClientFactory.newInstance();
    }

}
