/**
 * AddressBookServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sample.addressbook.service;

public class AddressBookServiceServiceLocator extends org.apache.axis.client.Service implements sample.addressbook.service.AddressBookServiceService {

    public AddressBookServiceServiceLocator() {
    }


    public AddressBookServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddressBookServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddressBookService
    private java.lang.String AddressBookService_address = "http://localhost:8080/Pojo3/services/AddressBookService";

    public java.lang.String getAddressBookServiceAddress() {
        return AddressBookService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddressBookServiceWSDDServiceName = "AddressBookService";

    public java.lang.String getAddressBookServiceWSDDServiceName() {
        return AddressBookServiceWSDDServiceName;
    }

    public void setAddressBookServiceWSDDServiceName(java.lang.String name) {
        AddressBookServiceWSDDServiceName = name;
    }

    public sample.addressbook.service.AddressBookService getAddressBookService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddressBookService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddressBookService(endpoint);
    }

    public sample.addressbook.service.AddressBookService getAddressBookService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            sample.addressbook.service.AddressBookServiceSoapBindingStub _stub = new sample.addressbook.service.AddressBookServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddressBookServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddressBookServiceEndpointAddress(java.lang.String address) {
        AddressBookService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (sample.addressbook.service.AddressBookService.class.isAssignableFrom(serviceEndpointInterface)) {
                sample.addressbook.service.AddressBookServiceSoapBindingStub _stub = new sample.addressbook.service.AddressBookServiceSoapBindingStub(new java.net.URL(AddressBookService_address), this);
                _stub.setPortName(getAddressBookServiceWSDDServiceName());
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
        if ("AddressBookService".equals(inputPortName)) {
            return getAddressBookService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.addressbook.sample", "AddressBookServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.addressbook.sample", "AddressBookService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddressBookService".equals(portName)) {
            setAddressBookServiceEndpointAddress(address);
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
