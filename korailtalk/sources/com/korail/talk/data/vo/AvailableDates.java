package com.korail.talk.data.vo;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import z4.C6634h;
import z4.t;

/* loaded from: classes.dex */
public class AvailableDates {
    private final List<Calendar> mAvailableCalendarList;
    private final List<Calendar> mAvailableMonthList;
    private Calendar mFirstDate;
    private final SimpleDateFormat mFormatter;
    private Calendar mLastDate;

    public AvailableDates(String[] strArr) {
        this(strArr, true);
    }

    public Calendar getFirstDate() {
        Calendar calendar = this.mFirstDate;
        if (calendar == null) {
            return null;
        }
        return (Calendar) calendar.clone();
    }

    public Calendar getLastDate() {
        Calendar calendar = this.mLastDate;
        if (calendar == null) {
            return null;
        }
        return (Calendar) calendar.clone();
    }

    public boolean isAvailableDate(Calendar calendar) {
        if (calendar == null) {
            return false;
        }
        Iterator<Calendar> it = this.mAvailableCalendarList.iterator();
        while (it.hasNext()) {
            if (C6634h.isEquals(it.next(), calendar, "yyyyMMdd")) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.mAvailableCalendarList.size() == 0;
    }

    public boolean isInAvailableRange(Calendar calendar) {
        if (calendar == null || calendar.compareTo(this.mFirstDate) <= 0) {
            return false;
        }
        return calendar.compareTo(this.mLastDate) < 0 || C6634h.isEquals(calendar, this.mLastDate, "yyyyMMdd");
    }

    public AvailableDates(String[] strArr, boolean z8) throws IllegalAccessException, NoSuchMethodException, SecurityException, ParseException, IllegalArgumentException, InvocationTargetException {
        this.mAvailableCalendarList = new ArrayList();
        this.mAvailableMonthList = new ArrayList();
        this.mFormatter = new SimpleDateFormat("yyyyMMdd");
        if (strArr == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        Calendar calendar2 = null;
        for (String str : strArr) {
            try {
                Date date = this.mFormatter.parse(str);
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(date);
                if (!z8 || C6634h.isEquals(calendar, calendar3, "yyyyMMdd") || !calendar.after(calendar3)) {
                    this.mAvailableCalendarList.add(calendar3);
                    if (calendar2 == null || !C6634h.isEquals(calendar2, calendar3, "yyyyMM")) {
                        calendar2 = (Calendar) calendar3.clone();
                        this.mAvailableMonthList.add(calendar2);
                    }
                }
            } catch (ParseException e8) {
                t.e(e8.getMessage());
            }
        }
        if (this.mAvailableCalendarList.size() <= 0) {
            this.mFirstDate = null;
            this.mLastDate = null;
        } else {
            this.mFirstDate = (Calendar) this.mAvailableCalendarList.get(0).clone();
            this.mLastDate = (Calendar) this.mAvailableCalendarList.get(r10.size() - 1).clone();
        }
    }
}
