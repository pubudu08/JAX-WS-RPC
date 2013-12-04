package com.pubudu.client;

import com.pubudu.ws.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: pubudu
 * Date: 12/3/13
 * Time: 11:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldClient {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:9999/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.pubudu.com/", "HelloWorldImpService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("pubudu"));




    }
}
