package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.lj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3532lj extends AbstractC1583Lc implements InterfaceC3760nj {
    C3532lj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3760nj
    public final void zzb(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3760nj
    public final void zzc(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3760nj
    public final void zzd() {
        c(2, a());
    }
}
