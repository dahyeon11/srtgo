package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class Lr extends AbstractC1583Lc implements InterfaceC1692Nr {
    Lr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zze() {
        c(7, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzf() {
        c(6, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzg() {
        c(2, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzh(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(4, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzi(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(5, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzj() {
        c(1, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzk(InterfaceC1406Gr interfaceC1406Gr) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1406Gr);
        c(3, parcelA);
    }
}
