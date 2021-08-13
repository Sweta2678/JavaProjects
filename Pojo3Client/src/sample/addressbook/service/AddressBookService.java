/**
 * AddressBookService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sample.addressbook.service;

public interface AddressBookService extends java.rmi.Remote {
    public void addEntry(sample.addressbook.entry.Entry entry) throws java.rmi.RemoteException;
    public sample.addressbook.entry.Entry findEntry(java.lang.String name) throws java.rmi.RemoteException;
}
