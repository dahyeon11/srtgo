package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ur, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4573ur extends AbstractC1583Lc implements InterfaceC4801wr {
    C4573ur(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4801wr
    public final void zze(InterfaceC4118qr interfaceC4118qr) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC4118qr);
        c(5, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4801wr
    public final void zzf() {
        c(4, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4801wr
    public final void zzg(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(7, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4801wr
    public final void zzh() {
        c(6, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4801wr
    public final void zzi() {
        c(1, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4801wr
    public final void zzj() {
        c(2, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4801wr
    public final void zzk() {
        c(8, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4801wr
    public final void zzl() {
        c(3, a());
    }
}
