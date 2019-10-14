/**
 * Photo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package photo;

public class Photo  implements java.io.Serializable {
    private long id;

    private java.lang.String link;

    private photo.Place place;

    public Photo() {
    }

    public Photo(
           long id,
           java.lang.String link,
           photo.Place place) {
           this.id = id;
           this.link = link;
           this.place = place;
    }


    /**
     * Gets the id value for this Photo.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Photo.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the link value for this Photo.
     * 
     * @return link
     */
    public java.lang.String getLink() {
        return link;
    }


    /**
     * Sets the link value for this Photo.
     * 
     * @param link
     */
    public void setLink(java.lang.String link) {
        this.link = link;
    }


    /**
     * Gets the place value for this Photo.
     * 
     * @return place
     */
    public photo.Place getPlace() {
        return place;
    }


    /**
     * Sets the place value for this Photo.
     * 
     * @param place
     */
    public void setPlace(photo.Place place) {
        this.place = place;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Photo)) return false;
        Photo other = (Photo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace())));
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
        _hashCode += new Long(getId()).hashCode();
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Photo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://photo.service/", "photo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://photo.service/", "place"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
