/**
 * DistrictService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package district;

public interface DistrictService extends java.rmi.Remote {
    public district.District getDistrict(long arg0) throws java.rmi.RemoteException;
    public district.District[] getByCityId(long arg0) throws java.rmi.RemoteException;
}
