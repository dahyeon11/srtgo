package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Io, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1484Io extends AbstractC1583Lc implements InterfaceC1566Ko {
    C1484Io(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1566Ko
    public final void zze(String str) {
        Parcel parcelA = a();
        parcelA.writeString("Adapter returned null.");
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1566Ko
    public final void zzf(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1566Ko
    public final void zzg(InterfaceC3087ho interfaceC3087ho) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC3087ho);
        c(1, parcelA);
    }
}
