/**
 * CityServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package city;

public class CityServiceImplServiceLocator extends org.apache.axis.client.Service implements city.CityServiceImplService {

    public CityServiceImplServiceLocator() {
    }


    public CityServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CityServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CityServiceImplPort
    private java.lang.String CityServiceImplPort_address = "http://localhost:9000/city";

    public java.lang.String getCityServiceImplPortAddress() {
        return CityServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CityServiceImplPortWSDDServiceName = "CityServiceImplPort";

    public java.lang.String getCityServiceImplPortWSDDServiceName() {
        return CityServiceImplPortWSDDServiceName;
    }

    public void setCityServiceImplPortWSDDServiceName(java.lang.String name) {
        CityServiceImplPortWSDDServiceName = name;
    }

    public city.CityService getCityServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CityServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCityServiceImplPort(endpoint);
    }

    public city.CityService getCityServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            city.CityServiceImplPortBindingStub _stub = new city.CityServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getCityServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCityServiceImplPortEndpointAddress(java.lang.String address) {
        CityServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (city.CityService.class.isAssignableFrom(serviceEndpointInterface)) {
                city.CityServiceImplPortBindingStub _stub = new city.CityServiceImplPortBindingStub(new java.net.URL(CityServiceImplPort_address), this);
                _stub.setPortName(getCityServiceImplPortWSDDServiceName());
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
        if ("CityServiceImplPort".equals(inputPortName)) {
            return getCityServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://city.service/", "CityServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://city.service/", "CityServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CityServiceImplPort".equals(portName)) {
            setCityServiceImplPortEndpointAddress(address);
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
