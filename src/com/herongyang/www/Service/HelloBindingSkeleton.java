/**
 * HelloBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.herongyang.www.Service;

public class HelloBindingSkeleton implements com.herongyang.www.Service.HelloPortType, org.apache.axis.wsdl.Skeleton {
    private com.herongyang.www.Service.HelloPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.herongyang.com/Service/", "HelloRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("hello", _params, new javax.xml.namespace.QName("http://www.herongyang.com/Service/", "HelloResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "Hello"));
        _oper.setSoapAction("http://www.herongyang.com/Service/Hello");
        _myOperationsList.add(_oper);
        if (_myOperations.get("hello") == null) {
            _myOperations.put("hello", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("hello")).add(_oper);
    }

    public HelloBindingSkeleton() {
        this.impl = new com.herongyang.www.Service.HelloBindingImpl();
    }

    public HelloBindingSkeleton(com.herongyang.www.Service.HelloPortType impl) {
        this.impl = impl;
    }
    public java.lang.String hello(java.lang.String helloInputPart) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.hello(helloInputPart);
        return ret;
    }

}
