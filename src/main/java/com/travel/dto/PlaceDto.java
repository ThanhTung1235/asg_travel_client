package com.travel.dto;

public class PlaceDto {
    private String name;
    private long citId;
    private long districtId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCitId() {
        return citId;
    }

    public void setCitId(long citId) {
        this.citId = citId;
    }

    public long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(long districtId) {
        this.districtId = districtId;
    }
}
