/**
 * MemberService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package member;

public interface MemberService extends java.rmi.Remote {
    public java.lang.String save(member.Member arg0) throws java.rmi.RemoteException;
    public member.Member[] getAll() throws java.rmi.RemoteException;
    public member.Member authentication(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}
