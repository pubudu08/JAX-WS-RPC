package com.pubudu.ws;

import javax.jws.WebService;
import javax.xml.ws.WebServiceException;

/**
 * Created with IntelliJ IDEA.
 * User: pubudu
 * Date: 12/3/13
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.pubudu.ws.HelloWorld")
public class HelloWorldImp implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS "+name;
    }
}
