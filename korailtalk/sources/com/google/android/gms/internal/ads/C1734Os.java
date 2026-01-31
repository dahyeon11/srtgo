package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Os, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1734Os extends AbstractC1583Lc implements InterfaceC1816Qs {
    C1734Os(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1816Qs
    public final void zzb(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1816Qs
    public final void zzc(String str, String str2, Bundle bundle) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC1664Nc.zzd(parcelA, bundle);
        c(3, parcelA);
    }
}
