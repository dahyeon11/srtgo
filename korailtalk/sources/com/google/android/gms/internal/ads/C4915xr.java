package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.xr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4915xr extends AbstractC5814a {
    public static final Parcelable.Creator<C4915xr> CREATOR = new C5029yr();
    public final H1.Y1 zza;
    public final String zzb;

    public C4915xr(H1.Y1 y12, String str) {
        this.zza = y12;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        H1.Y1 y12 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeParcelable(parcel, 2, y12, i8, false);
        AbstractC5816c.writeString(parcel, 3, this.zzb, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
