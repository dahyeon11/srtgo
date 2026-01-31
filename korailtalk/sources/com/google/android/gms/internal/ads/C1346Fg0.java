package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Fg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1346Fg0 extends AbstractC5814a {
    public static final Parcelable.Creator<C1346Fg0> CREATOR = new C1387Gg0();
    public final int zza;
    public final String zzb;
    public final String zzc;

    C1346Fg0(int i8, String str, String str2) {
        this.zza = i8;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeString(parcel, 2, this.zzb, false);
        AbstractC5816c.writeString(parcel, 3, this.zzc, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C1346Fg0(String str, String str2) {
        this(1, str, str2);
    }
}
