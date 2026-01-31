package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ke, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3408ke extends AbstractC1583Lc implements IInterface {
    C3408ke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(C3067he c3067he) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c3067he);
        Parcel parcelB = b(3, parcelA);
        long j8 = parcelB.readLong();
        parcelB.recycle();
        return j8;
    }

    public final C2722ee zzf(C3067he c3067he) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c3067he);
        Parcel parcelB = b(1, parcelA);
        C2722ee c2722ee = (C2722ee) AbstractC1664Nc.zza(parcelB, C2722ee.CREATOR);
        parcelB.recycle();
        return c2722ee;
    }

    public final C2722ee zzg(C3067he c3067he) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c3067he);
        Parcel parcelB = b(2, parcelA);
        C2722ee c2722ee = (C2722ee) AbstractC1664Nc.zza(parcelB, C2722ee.CREATOR);
        parcelB.recycle();
        return c2722ee;
    }
}
