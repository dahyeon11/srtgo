package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final long f24680a;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i8) {
            return new f[i8];
        }
    }

    /* synthetic */ f(long j8, a aVar) {
        this(j8);
    }

    public static f from(long j8) {
        return new f(j8);
    }

    public static f now() {
        return from(s.g().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f24680a == ((f) obj).f24680a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f24680a)});
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean isValid(long j8) {
        return j8 >= this.f24680a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f24680a);
    }

    private f(long j8) {
        this.f24680a = j8;
    }
}
