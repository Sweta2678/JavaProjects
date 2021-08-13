/**
 * ColorServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pmdb.coach.inbound.color;

public class ColorServiceServiceLocator extends org.apache.axis.client.Service implements com.pmdb.coach.inbound.color.ColorServiceService {

    public ColorServiceServiceLocator() {
    }


    public ColorServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ColorServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ColorService
    private java.lang.String ColorService_address = "http://localhost:8080/PMDBInbound/services/ColorService";

    public java.lang.String getColorServiceAddress() {
        return ColorService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ColorServiceWSDDServiceName = "ColorService";

    public java.lang.String getColorServiceWSDDServiceName() {
        return ColorServiceWSDDServiceName;
    }

    public void setColorServiceWSDDServiceName(java.lang.String name) {
        ColorServiceWSDDServiceName = name;
    }

    public com.pmdb.coach.inbound.color.ColorService getColorService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ColorService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getColorService(endpoint);
    }

    public com.pmdb.coach.inbound.color.ColorService getColorService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pmdb.coach.inbound.color.ColorServiceSoapBindingStub _stub = new com.pmdb.coach.inbound.color.ColorServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getColorServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setColorServiceEndpointAddress(java.lang.String address) {
        ColorService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pmdb.coach.inbound.color.ColorService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pmdb.coach.inbound.color.ColorServiceSoapBindingStub _stub = new com.pmdb.coach.inbound.color.ColorServiceSoapBindingStub(new java.net.URL(ColorService_address), this);
                _stub.setPortName(getColorServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ColorService".equals(inputPortName)) {
            return getColorService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://color.inbound.coach.pmdb.com", "ColorServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://color.inbound.coach.pmdb.com", "ColorService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ColorService".equals(portName)) {
            setColorServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
