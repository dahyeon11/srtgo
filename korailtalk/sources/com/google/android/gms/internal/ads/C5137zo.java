package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5137zo extends AbstractC1583Lc implements InterfaceC1197Bo {
    C5137zo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1197Bo
    public final void zze(String str) {
        Parcel parcelA = a();
        parcelA.writeString("Adapter returned null.");
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1197Bo
    public final void zzf(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(4, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1197Bo
    public final void zzg() {
        c(2, a());
    }
}
