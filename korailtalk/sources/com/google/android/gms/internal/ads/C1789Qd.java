package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1789Qd extends AbstractC1583Lc implements InterfaceC1871Sd {
    C1789Qd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1871Sd
    public final void zzb(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1871Sd
    public final void zzc(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1871Sd
    public final void zzd(InterfaceC1748Pd interfaceC1748Pd) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1748Pd);
        c(1, parcelA);
    }
}
