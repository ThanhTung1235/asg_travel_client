/**
 * PhotoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package photo;

public interface PhotoService extends java.rmi.Remote {
    public java.lang.String save(photo.Photo arg0) throws java.rmi.RemoteException;
    public photo.Photo[] getAll() throws java.rmi.RemoteException;
}
