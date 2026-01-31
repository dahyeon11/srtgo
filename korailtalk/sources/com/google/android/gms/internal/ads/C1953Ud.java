package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ud, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1953Ud extends AbstractC1583Lc implements InterfaceC2035Wd {
    C1953Ud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zzb() {
        c(5, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zzc() {
        c(2, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zzd(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zze() {
        c(4, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zzf() {
        c(1, a());
    }
}
