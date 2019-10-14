/**
 * CommentServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package comment;

public class CommentServiceImplServiceLocator extends org.apache.axis.client.Service implements comment.CommentServiceImplService {

    public CommentServiceImplServiceLocator() {
    }


    public CommentServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommentServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CommentServiceImplPort
    private java.lang.String CommentServiceImplPort_address = "http://localhost:9000/comment";

    public java.lang.String getCommentServiceImplPortAddress() {
        return CommentServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CommentServiceImplPortWSDDServiceName = "CommentServiceImplPort";

    public java.lang.String getCommentServiceImplPortWSDDServiceName() {
        return CommentServiceImplPortWSDDServiceName;
    }

    public void setCommentServiceImplPortWSDDServiceName(java.lang.String name) {
        CommentServiceImplPortWSDDServiceName = name;
    }

    public comment.CommentService getCommentServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CommentServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCommentServiceImplPort(endpoint);
    }

    public comment.CommentService getCommentServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            comment.CommentServiceImplPortBindingStub _stub = new comment.CommentServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getCommentServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCommentServiceImplPortEndpointAddress(java.lang.String address) {
        CommentServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (comment.CommentService.class.isAssignableFrom(serviceEndpointInterface)) {
                comment.CommentServiceImplPortBindingStub _stub = new comment.CommentServiceImplPortBindingStub(new java.net.URL(CommentServiceImplPort_address), this);
                _stub.setPortName(getCommentServiceImplPortWSDDServiceName());
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
        if ("CommentServiceImplPort".equals(inputPortName)) {
            return getCommentServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://comment.service/", "CommentServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://comment.service/", "CommentServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CommentServiceImplPort".equals(portName)) {
            setCommentServiceImplPortEndpointAddress(address);
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
