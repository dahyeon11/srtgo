package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Co, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1238Co extends AbstractC1583Lc implements InterfaceC1320Eo {
    C1238Co(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1320Eo
    public final void zze(String str) {
        Parcel parcelA = a();
        parcelA.writeString("Adapter returned null.");
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1320Eo
    public final void zzf(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1320Eo
    public final void zzg(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1320Eo
    public final void zzh(InterfaceC2284ao interfaceC2284ao) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC2284ao);
        c(4, parcelA);
    }
}
