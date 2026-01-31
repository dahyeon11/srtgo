package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.qm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4108qm extends AbstractC1583Lc implements InterfaceC4335sm {
    C4108qm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4335sm
    public final void zze(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4335sm
    public final void zzf(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4335sm
    public final void zzg(InterfaceC3652mm interfaceC3652mm) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC3652mm);
        c(1, parcelA);
    }
}
