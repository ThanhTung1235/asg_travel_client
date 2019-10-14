/**
 * CityService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package city;

public interface CityService extends java.rmi.Remote {
    public city.City[] getAll() throws java.rmi.RemoteException;
    public city.City getCity(long arg0) throws java.rmi.RemoteException;
}
