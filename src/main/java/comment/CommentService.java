/**
 * CommentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package comment;

public interface CommentService extends java.rmi.Remote {
    public java.lang.String save(comment.Comment arg0) throws java.rmi.RemoteException;
    public comment.Comment getComment(long arg0) throws java.rmi.RemoteException;
    public comment.Comment[] getAll() throws java.rmi.RemoteException;
}
