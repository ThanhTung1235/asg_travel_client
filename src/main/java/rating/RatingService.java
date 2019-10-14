/**
 * RatingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rating;

public interface RatingService extends java.rmi.Remote {
    public java.lang.String save(rating.Rating arg0) throws java.rmi.RemoteException;
    public rating.Rating[] getAll() throws java.rmi.RemoteException;
}
