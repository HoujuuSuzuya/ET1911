package com.etoak;

import com.etoak.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class CxfClient {
    public static void main(String[] args) {

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        factory.setAddress("http://localhost:8000/hello?wsdl");
        factory.setServiceClass(HelloService.class);
        HelloService service =(HelloService)factory.create();
        System.out.println(service);

        System.out.println(service.sayHello("CXF"));




    }
}
