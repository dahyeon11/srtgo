package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Pl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1764Pl extends AbstractC1583Lc implements IInterface {
    C1764Pl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(C1519Jl c1519Jl, InterfaceC1723Ol interfaceC1723Ol) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c1519Jl);
        AbstractC1664Nc.zzf(parcelA, interfaceC1723Ol);
        d(2, parcelA);
    }
}
