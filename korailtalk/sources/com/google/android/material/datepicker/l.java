package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
final class l implements Comparable, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f24741a;

    /* renamed from: b, reason: collision with root package name */
    final int f24742b;

    /* renamed from: c, reason: collision with root package name */
    final int f24743c;

    /* renamed from: d, reason: collision with root package name */
    final int f24744d;

    /* renamed from: e, reason: collision with root package name */
    final int f24745e;

    /* renamed from: f, reason: collision with root package name */
    final long f24746f;

    /* renamed from: g, reason: collision with root package name */
    private String f24747g;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public l createFromParcel(Parcel parcel) {
            return l.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public l[] newArray(int i8) {
            return new l[i8];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = s.d(calendar);
        this.f24741a = calendarD;
        this.f24742b = calendarD.get(2);
        this.f24743c = calendarD.get(1);
        this.f24744d = calendarD.getMaximum(7);
        this.f24745e = calendarD.getActualMaximum(5);
        this.f24746f = calendarD.getTimeInMillis();
    }

    static l b(int i8, int i9) {
        Calendar calendarI = s.i();
        calendarI.set(1, i8);
        calendarI.set(2, i9);
        return new l(calendarI);
    }

    static l c(long j8) {
        Calendar calendarI = s.i();
        calendarI.setTimeInMillis(j8);
        return new l(calendarI);
    }

    static l d() {
        return new l(s.g());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int e() {
        int firstDayOfWeek = this.f24741a.get(7) - this.f24741a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f24744d : firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f24742b == lVar.f24742b && this.f24743c == lVar.f24743c;
    }

    long f(int i8) {
        Calendar calendarD = s.d(this.f24741a);
        calendarD.set(5, i8);
        return calendarD.getTimeInMillis();
    }

    int g(long j8) {
        Calendar calendarD = s.d(this.f24741a);
        calendarD.setTimeInMillis(j8);
        return calendarD.get(5);
    }

    String h(Context context) {
        if (this.f24747g == null) {
            this.f24747g = e.c(context, this.f24741a.getTimeInMillis());
        }
        return this.f24747g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24742b), Integer.valueOf(this.f24743c)});
    }

    long i() {
        return this.f24741a.getTimeInMillis();
    }

    l j(int i8) {
        Calendar calendarD = s.d(this.f24741a);
        calendarD.add(2, i8);
        return new l(calendarD);
    }

    int k(l lVar) {
        if (this.f24741a instanceof GregorianCalendar) {
            return ((lVar.f24743c - this.f24743c) * 12) + (lVar.f24742b - this.f24742b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f24743c);
        parcel.writeInt(this.f24742b);
    }

    @Override // java.lang.Comparable
    public int compareTo(l lVar) {
        return this.f24741a.compareTo(lVar.f24741a);
    }
}
