package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5127zj extends AbstractC1583Lc implements InterfaceC1187Bj {
    C5127zj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1187Bj
    public final void zze(InterfaceC4329sj interfaceC4329sj) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC4329sj);
        c(1, parcelA);
    }
}
