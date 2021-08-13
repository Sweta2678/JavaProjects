/**
 * ColorServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pmdb.coach.inbound.color;

public interface ColorServiceService extends javax.xml.rpc.Service {
    public java.lang.String getColorServiceAddress();

    public com.pmdb.coach.inbound.color.ColorService getColorService() throws javax.xml.rpc.ServiceException;

    public com.pmdb.coach.inbound.color.ColorService getColorService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
