/**
 * DistrictServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package district;

public class DistrictServiceImplServiceLocator extends org.apache.axis.client.Service implements district.DistrictServiceImplService {

    public DistrictServiceImplServiceLocator() {
    }


    public DistrictServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DistrictServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DistrictServiceImplPort
    private java.lang.String DistrictServiceImplPort_address = "http://localhost:9000/district";

    public java.lang.String getDistrictServiceImplPortAddress() {
        return DistrictServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DistrictServiceImplPortWSDDServiceName = "DistrictServiceImplPort";

    public java.lang.String getDistrictServiceImplPortWSDDServiceName() {
        return DistrictServiceImplPortWSDDServiceName;
    }

    public void setDistrictServiceImplPortWSDDServiceName(java.lang.String name) {
        DistrictServiceImplPortWSDDServiceName = name;
    }

    public district.DistrictService getDistrictServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DistrictServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDistrictServiceImplPort(endpoint);
    }

    public district.DistrictService getDistrictServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            district.DistrictServiceImplPortBindingStub _stub = new district.DistrictServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getDistrictServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDistrictServiceImplPortEndpointAddress(java.lang.String address) {
        DistrictServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (district.DistrictService.class.isAssignableFrom(serviceEndpointInterface)) {
                district.DistrictServiceImplPortBindingStub _stub = new district.DistrictServiceImplPortBindingStub(new java.net.URL(DistrictServiceImplPort_address), this);
                _stub.setPortName(getDistrictServiceImplPortWSDDServiceName());
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
        if ("DistrictServiceImplPort".equals(inputPortName)) {
            return getDistrictServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://district.service/", "DistrictServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://district.service/", "DistrictServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DistrictServiceImplPort".equals(portName)) {
            setDistrictServiceImplPortEndpointAddress(address);
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
