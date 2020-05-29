package com.etoak.service.impl;

import com.etoak.service.HelloService;

import javax.jws.WebService;

@WebService(serviceName = "HelloService",portName = "HelloServiceWSPort")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("服务端调用");
        return "Hello "+ name;
    }
}
