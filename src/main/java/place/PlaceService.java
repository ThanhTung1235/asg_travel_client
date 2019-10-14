/**
 * PlaceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package place;

public interface PlaceService extends java.rmi.Remote {
    public java.lang.String save(place.Place arg0) throws java.rmi.RemoteException;
    public place.Place[] getAll() throws java.rmi.RemoteException;
    public place.Place getPlace(long arg0) throws java.rmi.RemoteException;
}
