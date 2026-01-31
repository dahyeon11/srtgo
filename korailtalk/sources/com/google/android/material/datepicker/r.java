package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
class r {

    /* renamed from: c, reason: collision with root package name */
    private static final r f24763c = new r(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Long f24764a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeZone f24765b;

    private r(Long l8, TimeZone timeZone) {
        this.f24764a = l8;
        this.f24765b = timeZone;
    }

    static r c() {
        return f24763c;
    }

    Calendar a() {
        return b(this.f24765b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l8 = this.f24764a;
        if (l8 != null) {
            calendar.setTimeInMillis(l8.longValue());
        }
        return calendar;
    }
}
