package com.korail.talk.database.model;

import com.j256.ormlite.field.DatabaseField;

/* loaded from: classes.dex */
public class ZRecentStation {

    @DatabaseField
    private String arrivalStation;

    @DatabaseField
    private String arrivalStationCode;

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String startStation;

    @DatabaseField
    private String startStationCode;

    @DatabaseField
    private long timestamp;

    public String getArrivalStation() {
        return this.arrivalStation;
    }

    public String getArrivalStationCode() {
        return this.arrivalStationCode;
    }

    public int getId() {
        return this.id;
    }

    public String getStartStation() {
        return this.startStation;
    }

    public String getStartStationCode() {
        return this.startStationCode;
    }

    public void setArrivalStation(String str) {
        this.arrivalStation = str;
    }

    public void setArrivalStationCode(String str) {
        this.arrivalStationCode = str;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setStartStation(String str) {
        this.startStation = str;
    }

    public void setStartStationCode(String str) {
        this.startStationCode = str;
    }

    public void setTimestamp(long j8) {
        this.timestamp = j8;
    }
}
