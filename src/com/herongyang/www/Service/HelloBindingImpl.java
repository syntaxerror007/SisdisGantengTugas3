/**
 * HelloBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.herongyang.www.Service;

public class HelloBindingImpl implements com.herongyang.www.Service.HelloPortType{
    public java.lang.String hello(java.lang.String helloInputPart) throws java.rmi.RemoteException {
        return "Hello " + helloInputPart;
    }
}
