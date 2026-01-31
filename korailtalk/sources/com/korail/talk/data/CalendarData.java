package com.korail.talk.data;

import java.io.Serializable;
import java.util.Calendar;

/* loaded from: classes.dex */
public class CalendarData implements Serializable {
    private String mDate;
    private String mHour;
    private String mMinute;
    private String mMonth;
    private String mYear;

    public CalendarData(String str, String str2, String str3) {
        this.mYear = str;
        this.mMonth = str2;
        this.mDate = str3;
    }

    public String getDate() {
        return this.mDate;
    }

    public String getHour() {
        return this.mHour;
    }

    public String getMinute() {
        return this.mMinute;
    }

    public String getMonth() {
        return this.mMonth;
    }

    public long getTimeMillis() throws NumberFormatException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(this.mYear), Integer.parseInt(this.mMonth) - 1, Integer.parseInt(this.mDate), Integer.parseInt(this.mHour), Integer.parseInt(this.mMinute));
        return calendar.getTimeInMillis();
    }

    public String getYear() {
        return this.mYear;
    }

    public boolean isBeforeThan(CalendarData calendarData) {
        return getTimeMillis() < calendarData.getTimeMillis();
    }

    public boolean isLaterThan(CalendarData calendarData) {
        return getTimeMillis() > calendarData.getTimeMillis();
    }

    public CalendarData(String str, String str2, String str3, String str4, String str5) {
        this.mYear = str;
        this.mMonth = str2;
        this.mDate = str3;
        this.mHour = str4;
        this.mMinute = str5;
    }
}
