package com.mywebservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by slavik on 2017-05-23.
 */
@WebService(name="MyProducts", serviceName="MyProducts",portName="MyProductsPort", targetNamespace="com.mywebservice")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public class MyProducts implements IMyProducts {

    @WebMethod
    public String getProducts(){
        return "BMW";
    }
}
