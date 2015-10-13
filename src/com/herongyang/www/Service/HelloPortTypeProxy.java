package com.herongyang.www.Service;

public class HelloPortTypeProxy implements com.herongyang.www.Service.HelloPortType {
  private String _endpoint = null;
  private com.herongyang.www.Service.HelloPortType helloPortType = null;
  
  public HelloPortTypeProxy() {
    _initHelloPortTypeProxy();
  }
  
  public HelloPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloPortTypeProxy();
  }
  
  private void _initHelloPortTypeProxy() {
    try {
      helloPortType = (new com.herongyang.www.Service.HelloServiceLocator()).gethelloPort();
      if (helloPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloPortType != null)
      ((javax.xml.rpc.Stub)helloPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.herongyang.www.Service.HelloPortType getHelloPortType() {
    if (helloPortType == null)
      _initHelloPortTypeProxy();
    return helloPortType;
  }
  
  public java.lang.String hello(java.lang.String helloInputPart) throws java.rmi.RemoteException{
    if (helloPortType == null)
      _initHelloPortTypeProxy();
    return helloPortType.hello(helloInputPart);
  }
  
  
}