package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.So, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1893So extends AbstractC1583Lc implements InterfaceC1975Uo {
    C1893So(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1975Uo
    public final void zze(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1975Uo
    public final void zzf(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1975Uo
    public final void zzg(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(3, parcelA);
    }
}
