package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.nm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3766nm extends AbstractC1583Lc implements InterfaceC3994pm {
    C3766nm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3994pm
    public final void zze(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3994pm
    public final void zzf() {
        c(1, a());
    }
}
