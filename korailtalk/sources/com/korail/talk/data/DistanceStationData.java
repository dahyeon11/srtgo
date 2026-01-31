package com.korail.talk.data;

import com.korail.talk.ui.booking.option.station.StationSearch;

/* loaded from: classes.dex */
public class DistanceStationData {
    private String arrivalStationName;
    private double distance;
    private int index;
    private String latitude;
    private String longitude;
    private String major;
    private String stationName;
    private StationSearch.g type;

    public String getArrivalStationName() {
        return this.arrivalStationName;
    }

    public double getDistance() {
        return this.distance;
    }

    public int getIndex() {
        return this.index;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getMajor() {
        return this.major;
    }

    public String getStationName() {
        return this.stationName;
    }

    public StationSearch.g getType() {
        return this.type;
    }

    public void setArrivalStationName(String str) {
        this.arrivalStationName = str;
    }

    public void setDistance(double d9) {
        this.distance = d9;
    }

    public void setIndex(int i8) {
        this.index = i8;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setMajor(String str) {
        this.major = str;
    }

    public void setStationName(String str) {
        this.stationName = str;
    }

    public void setType(StationSearch.g gVar) {
        this.type = gVar;
    }
}
