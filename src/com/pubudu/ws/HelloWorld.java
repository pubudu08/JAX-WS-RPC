package com.pubudu.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created with IntelliJ IDEA.
 * User: pubudu
 * Date: 12/3/13
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface HelloWorld {

    @WebMethod String getHelloWorldAsString(String name);
}
