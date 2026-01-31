package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1351Fj extends AbstractC1583Lc implements InterfaceC1433Hj {
    C1351Fj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1433Hj
    public final void zze(InterfaceC4899xj interfaceC4899xj, String str) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC4899xj);
        parcelA.writeString(str);
        c(1, parcelA);
    }
}
