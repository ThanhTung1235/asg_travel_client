/**
 * Rating.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rating;

public class Rating  implements java.io.Serializable {
    private long id;

    private rating.Member member;

    private rating.Place place;

    private int starValue;

    public Rating() {
    }

    public Rating(
           long id,
           rating.Member member,
           rating.Place place,
           int starValue) {
           this.id = id;
           this.member = member;
           this.place = place;
           this.starValue = starValue;
    }


    /**
     * Gets the id value for this Rating.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Rating.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the member value for this Rating.
     * 
     * @return member
     */
    public rating.Member getMember() {
        return member;
    }


    /**
     * Sets the member value for this Rating.
     * 
     * @param member
     */
    public void setMember(rating.Member member) {
        this.member = member;
    }


    /**
     * Gets the place value for this Rating.
     * 
     * @return place
     */
    public rating.Place getPlace() {
        return place;
    }


    /**
     * Sets the place value for this Rating.
     * 
     * @param place
     */
    public void setPlace(rating.Place place) {
        this.place = place;
    }


    /**
     * Gets the starValue value for this Rating.
     * 
     * @return starValue
     */
    public int getStarValue() {
        return starValue;
    }


    /**
     * Sets the starValue value for this Rating.
     * 
     * @param starValue
     */
    public void setStarValue(int starValue) {
        this.starValue = starValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rating)) return false;
        Rating other = (Rating) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.member==null && other.getMember()==null) || 
             (this.member!=null &&
              this.member.equals(other.getMember()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            this.starValue == other.getStarValue();
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
        if (getMember() != null) {
            _hashCode += getMember().hashCode();
        }
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        _hashCode += getStarValue();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rating.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rating.service/", "rating"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rating.service/", "member"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rating.service/", "place"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
