package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class Scope extends AbstractC5814a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f11847a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11848b;

    Scope(int i8, String str) {
        AbstractC5683p.checkNotEmpty(str, "scopeUri must not be null or empty");
        this.f11847a = i8;
        this.f11848b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f11848b.equals(((Scope) obj).f11848b);
        }
        return false;
    }

    public String getScopeUri() {
        return this.f11848b;
    }

    public int hashCode() {
        return this.f11848b.hashCode();
    }

    public String toString() {
        return this.f11848b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f11847a;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeString(parcel, 2, getScopeUri(), false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public Scope(String str) {
        this(1, str);
    }
}
