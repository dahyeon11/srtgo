package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1801Qj extends AbstractC1583Lc implements InterfaceC1883Sj {
    C1801Qj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1883Sj
    public final void zze(InterfaceC2391bk interfaceC2391bk) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC2391bk);
        c(1, parcelA);
    }
}
