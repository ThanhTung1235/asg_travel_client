/**
 * Place.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package place;

public class Place  implements java.io.Serializable {
    private place.City city;

    private place.Comment[] comments;

    private place.District district;

    private long id;

    private java.lang.String name;

    private java.lang.String photo;

    private double ratingCount;

    private double ratingValue;

    private place.Rating[] ratings;

    public Place() {
    }

    public Place(
           place.City city,
           place.Comment[] comments,
           place.District district,
           long id,
           java.lang.String name,
           java.lang.String photo,
           double ratingCount,
           double ratingValue,
           place.Rating[] ratings) {
           this.city = city;
           this.comments = comments;
           this.district = district;
           this.id = id;
           this.name = name;
           this.photo = photo;
           this.ratingCount = ratingCount;
           this.ratingValue = ratingValue;
           this.ratings = ratings;
    }


    /**
     * Gets the city value for this Place.
     * 
     * @return city
     */
    public place.City getCity() {
        return city;
    }


    /**
     * Sets the city value for this Place.
     * 
     * @param city
     */
    public void setCity(place.City city) {
        this.city = city;
    }


    /**
     * Gets the comments value for this Place.
     * 
     * @return comments
     */
    public place.Comment[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Place.
     * 
     * @param comments
     */
    public void setComments(place.Comment[] comments) {
        this.comments = comments;
    }

    public place.Comment getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, place.Comment _value) {
        this.comments[i] = _value;
    }


    /**
     * Gets the district value for this Place.
     * 
     * @return district
     */
    public place.District getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this Place.
     * 
     * @param district
     */
    public void setDistrict(place.District district) {
        this.district = district;
    }


    /**
     * Gets the id value for this Place.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Place.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Place.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Place.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the photo value for this Place.
     * 
     * @return photo
     */
    public java.lang.String getPhoto() {
        return photo;
    }


    /**
     * Sets the photo value for this Place.
     * 
     * @param photo
     */
    public void setPhoto(java.lang.String photo) {
        this.photo = photo;
    }


    /**
     * Gets the ratingCount value for this Place.
     * 
     * @return ratingCount
     */
    public double getRatingCount() {
        return ratingCount;
    }


    /**
     * Sets the ratingCount value for this Place.
     * 
     * @param ratingCount
     */
    public void setRatingCount(double ratingCount) {
        this.ratingCount = ratingCount;
    }


    /**
     * Gets the ratingValue value for this Place.
     * 
     * @return ratingValue
     */
    public double getRatingValue() {
        return ratingValue;
    }


    /**
     * Sets the ratingValue value for this Place.
     * 
     * @param ratingValue
     */
    public void setRatingValue(double ratingValue) {
        this.ratingValue = ratingValue;
    }


    /**
     * Gets the ratings value for this Place.
     * 
     * @return ratings
     */
    public place.Rating[] getRatings() {
        return ratings;
    }


    /**
     * Sets the ratings value for this Place.
     * 
     * @param ratings
     */
    public void setRatings(place.Rating[] ratings) {
        this.ratings = ratings;
    }

    public place.Rating getRatings(int i) {
        return this.ratings[i];
    }

    public void setRatings(int i, place.Rating _value) {
        this.ratings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Place)) return false;
        Place other = (Place) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.photo==null && other.getPhoto()==null) || 
             (this.photo!=null &&
              this.photo.equals(other.getPhoto()))) &&
            this.ratingCount == other.getRatingCount() &&
            this.ratingValue == other.getRatingValue() &&
            ((this.ratings==null && other.getRatings()==null) || 
             (this.ratings!=null &&
              java.util.Arrays.equals(this.ratings, other.getRatings())));
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPhoto() != null) {
            _hashCode += getPhoto().hashCode();
        }
        _hashCode += new Double(getRatingCount()).hashCode();
        _hashCode += new Double(getRatingValue()).hashCode();
        if (getRatings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Place.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://place.service/", "place"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://place.service/", "city"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://place.service/", "comment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://place.service/", "district"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField.setFieldName("photo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "photo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratingCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratingCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratingValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratingValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://place.service/", "rating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
