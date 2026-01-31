package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Pr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1774Pr extends AbstractC1583Lc implements InterfaceC1856Rr {
    C1774Pr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1856Rr
    public final void zze(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1856Rr
    public final void zzf(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1856Rr
    public final void zzg() {
        c(1, a());
    }
}
