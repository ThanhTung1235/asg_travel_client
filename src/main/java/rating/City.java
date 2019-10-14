/**
 * City.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rating;

public class City  implements java.io.Serializable {
    private rating.District[] districts;

    private long mtp;

    private java.lang.String name;

    private rating.Place[] places;

    private java.lang.String type;

    public City() {
    }

    public City(
           rating.District[] districts,
           long mtp,
           java.lang.String name,
           rating.Place[] places,
           java.lang.String type) {
           this.districts = districts;
           this.mtp = mtp;
           this.name = name;
           this.places = places;
           this.type = type;
    }


    /**
     * Gets the districts value for this City.
     * 
     * @return districts
     */
    public rating.District[] getDistricts() {
        return districts;
    }


    /**
     * Sets the districts value for this City.
     * 
     * @param districts
     */
    public void setDistricts(rating.District[] districts) {
        this.districts = districts;
    }

    public rating.District getDistricts(int i) {
        return this.districts[i];
    }

    public void setDistricts(int i, rating.District _value) {
        this.districts[i] = _value;
    }


    /**
     * Gets the mtp value for this City.
     * 
     * @return mtp
     */
    public long getMtp() {
        return mtp;
    }


    /**
     * Sets the mtp value for this City.
     * 
     * @param mtp
     */
    public void setMtp(long mtp) {
        this.mtp = mtp;
    }


    /**
     * Gets the name value for this City.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this City.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the places value for this City.
     * 
     * @return places
     */
    public rating.Place[] getPlaces() {
        return places;
    }


    /**
     * Sets the places value for this City.
     * 
     * @param places
     */
    public void setPlaces(rating.Place[] places) {
        this.places = places;
    }

    public rating.Place getPlaces(int i) {
        return this.places[i];
    }

    public void setPlaces(int i, rating.Place _value) {
        this.places[i] = _value;
    }


    /**
     * Gets the type value for this City.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this City.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.districts==null && other.getDistricts()==null) || 
             (this.districts!=null &&
              java.util.Arrays.equals(this.districts, other.getDistricts()))) &&
            this.mtp == other.getMtp() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.places==null && other.getPlaces()==null) || 
             (this.places!=null &&
              java.util.Arrays.equals(this.places, other.getPlaces()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getDistricts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistricts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistricts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getMtp()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPlaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(City.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rating.service/", "city"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("districts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "districts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rating.service/", "district"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("places");
        elemField.setXmlName(new javax.xml.namespace.QName("", "places"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rating.service/", "place"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
