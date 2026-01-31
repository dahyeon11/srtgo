package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2047Wj extends AbstractC1583Lc implements InterfaceC2129Yj {
    C2047Wj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2129Yj
    public final void zze() {
        c(2, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2129Yj
    public final void zzf(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(1, parcelA);
    }
}
