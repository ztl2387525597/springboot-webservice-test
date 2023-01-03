package com.deehow.cxf.client.service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "IWZService", targetNamespace = "http://tempuri.org/")
public interface CreateMaterailClient {

    @WebMethod(operationName = "createMaterail", action = "http://tempuri.org/IWZService/createMaterail")
    @WebResult(name = "createMaterailResult", targetNamespace = "http://tempuri.org/")
    String  createMaterail(@WebParam(name = "xmlStr") String xml);
}
