package com.pubudu.ws;

import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: pubudu
 * Date: 12/3/13
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello",new HelloWorldImp());
    }
}
