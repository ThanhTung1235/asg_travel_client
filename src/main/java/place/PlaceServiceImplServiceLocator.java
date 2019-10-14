/**
 * PlaceServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package place;

public class PlaceServiceImplServiceLocator extends org.apache.axis.client.Service implements place.PlaceServiceImplService {

    public PlaceServiceImplServiceLocator() {
    }


    public PlaceServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PlaceServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PlaceServiceImplPort
    private java.lang.String PlaceServiceImplPort_address = "http://localhost:9000/place";

    public java.lang.String getPlaceServiceImplPortAddress() {
        return PlaceServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PlaceServiceImplPortWSDDServiceName = "PlaceServiceImplPort";

    public java.lang.String getPlaceServiceImplPortWSDDServiceName() {
        return PlaceServiceImplPortWSDDServiceName;
    }

    public void setPlaceServiceImplPortWSDDServiceName(java.lang.String name) {
        PlaceServiceImplPortWSDDServiceName = name;
    }

    public place.PlaceService getPlaceServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PlaceServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPlaceServiceImplPort(endpoint);
    }

    public place.PlaceService getPlaceServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            place.PlaceServiceImplPortBindingStub _stub = new place.PlaceServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getPlaceServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPlaceServiceImplPortEndpointAddress(java.lang.String address) {
        PlaceServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (place.PlaceService.class.isAssignableFrom(serviceEndpointInterface)) {
                place.PlaceServiceImplPortBindingStub _stub = new place.PlaceServiceImplPortBindingStub(new java.net.URL(PlaceServiceImplPort_address), this);
                _stub.setPortName(getPlaceServiceImplPortWSDDServiceName());
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
        if ("PlaceServiceImplPort".equals(inputPortName)) {
            return getPlaceServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://place.service/", "PlaceServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://place.service/", "PlaceServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PlaceServiceImplPort".equals(portName)) {
            setPlaceServiceImplPortEndpointAddress(address);
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
