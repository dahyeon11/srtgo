package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f25436a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f25437b;

    /* renamed from: c, reason: collision with root package name */
    final int f25438c;

    /* renamed from: d, reason: collision with root package name */
    int f25439d;

    /* renamed from: e, reason: collision with root package name */
    int f25440e;

    /* renamed from: f, reason: collision with root package name */
    int f25441f;

    /* renamed from: g, reason: collision with root package name */
    int f25442g;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c() {
        this(0);
    }

    private static int b(int i8) {
        return i8 >= 12 ? 1 : 0;
    }

    public static String formatText(Resources resources, CharSequence charSequence) {
        return formatText(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25439d == cVar.f25439d && this.f25440e == cVar.f25440e && this.f25438c == cVar.f25438c && this.f25441f == cVar.f25441f;
    }

    public int getHourForDisplay() {
        if (this.f25438c == 1) {
            return this.f25439d % 24;
        }
        int i8 = this.f25439d;
        if (i8 % 12 == 0) {
            return 12;
        }
        return this.f25442g == 1 ? i8 - 12 : i8;
    }

    public com.google.android.material.timepicker.a getHourInputValidator() {
        return this.f25437b;
    }

    public com.google.android.material.timepicker.a getMinuteInputValidator() {
        return this.f25436a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25438c), Integer.valueOf(this.f25439d), Integer.valueOf(this.f25440e), Integer.valueOf(this.f25441f)});
    }

    public void setHour(int i8) {
        if (this.f25438c == 1) {
            this.f25439d = i8;
        } else {
            this.f25439d = (i8 % 12) + (this.f25442g != 1 ? 0 : 12);
        }
    }

    public void setHourOfDay(int i8) {
        this.f25442g = b(i8);
        this.f25439d = i8;
    }

    public void setMinute(int i8) {
        this.f25440e = i8 % 60;
    }

    public void setPeriod(int i8) {
        if (i8 != this.f25442g) {
            this.f25442g = i8;
            int i9 = this.f25439d;
            if (i9 < 12 && i8 == 1) {
                this.f25439d = i9 + 12;
            } else {
                if (i9 < 12 || i8 != 0) {
                    return;
                }
                this.f25439d = i9 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f25439d);
        parcel.writeInt(this.f25440e);
        parcel.writeInt(this.f25441f);
        parcel.writeInt(this.f25438c);
    }

    public c(int i8) {
        this(0, 0, 10, i8);
    }

    public static String formatText(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public c(int i8, int i9, int i10, int i11) {
        this.f25439d = i8;
        this.f25440e = i9;
        this.f25441f = i10;
        this.f25438c = i11;
        this.f25442g = b(i8);
        this.f25436a = new com.google.android.material.timepicker.a(59);
        this.f25437b = new com.google.android.material.timepicker.a(i11 == 1 ? 24 : 12);
    }

    protected c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
