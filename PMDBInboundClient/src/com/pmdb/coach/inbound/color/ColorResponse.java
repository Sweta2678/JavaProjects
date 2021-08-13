/**
 * ColorResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pmdb.coach.inbound.color;

public class ColorResponse  implements java.io.Serializable {
    private java.lang.String actionName;

    private java.lang.String applicationName;

    private java.lang.String messageDetails;

    private java.lang.String messageID;

    private java.lang.String resultFlag;

    public ColorResponse() {
    }

    public ColorResponse(
           java.lang.String actionName,
           java.lang.String applicationName,
           java.lang.String messageDetails,
           java.lang.String messageID,
           java.lang.String resultFlag) {
           this.actionName = actionName;
           this.applicationName = applicationName;
           this.messageDetails = messageDetails;
           this.messageID = messageID;
           this.resultFlag = resultFlag;
    }


    /**
     * Gets the actionName value for this ColorResponse.
     * 
     * @return actionName
     */
    public java.lang.String getActionName() {
        return actionName;
    }


    /**
     * Sets the actionName value for this ColorResponse.
     * 
     * @param actionName
     */
    public void setActionName(java.lang.String actionName) {
        this.actionName = actionName;
    }


    /**
     * Gets the applicationName value for this ColorResponse.
     * 
     * @return applicationName
     */
    public java.lang.String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this ColorResponse.
     * 
     * @param applicationName
     */
    public void setApplicationName(java.lang.String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the messageDetails value for this ColorResponse.
     * 
     * @return messageDetails
     */
    public java.lang.String getMessageDetails() {
        return messageDetails;
    }


    /**
     * Sets the messageDetails value for this ColorResponse.
     * 
     * @param messageDetails
     */
    public void setMessageDetails(java.lang.String messageDetails) {
        this.messageDetails = messageDetails;
    }


    /**
     * Gets the messageID value for this ColorResponse.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this ColorResponse.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the resultFlag value for this ColorResponse.
     * 
     * @return resultFlag
     */
    public java.lang.String getResultFlag() {
        return resultFlag;
    }


    /**
     * Sets the resultFlag value for this ColorResponse.
     * 
     * @param resultFlag
     */
    public void setResultFlag(java.lang.String resultFlag) {
        this.resultFlag = resultFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ColorResponse)) return false;
        ColorResponse other = (ColorResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionName==null && other.getActionName()==null) || 
             (this.actionName!=null &&
              this.actionName.equals(other.getActionName()))) &&
            ((this.applicationName==null && other.getApplicationName()==null) || 
             (this.applicationName!=null &&
              this.applicationName.equals(other.getApplicationName()))) &&
            ((this.messageDetails==null && other.getMessageDetails()==null) || 
             (this.messageDetails!=null &&
              this.messageDetails.equals(other.getMessageDetails()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.resultFlag==null && other.getResultFlag()==null) || 
             (this.resultFlag!=null &&
              this.resultFlag.equals(other.getResultFlag())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getActionName() != null) {
            _hashCode += getActionName().hashCode();
        }
        if (getApplicationName() != null) {
            _hashCode += getApplicationName().hashCode();
        }
        if (getMessageDetails() != null) {
            _hashCode += getMessageDetails().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getResultFlag() != null) {
            _hashCode += getResultFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ColorResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://color.inbound.coach.pmdb.com", "ColorResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://color.inbound.coach.pmdb.com", "actionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://color.inbound.coach.pmdb.com", "applicationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://color.inbound.coach.pmdb.com", "messageDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://color.inbound.coach.pmdb.com", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://color.inbound.coach.pmdb.com", "resultFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
