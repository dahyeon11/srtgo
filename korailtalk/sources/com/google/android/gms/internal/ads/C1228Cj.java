package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Cj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1228Cj extends AbstractC1583Lc implements InterfaceC1310Ej {
    C1228Cj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1310Ej
    public final void zze(InterfaceC4557uj interfaceC4557uj) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC4557uj);
        c(1, parcelA);
    }
}
