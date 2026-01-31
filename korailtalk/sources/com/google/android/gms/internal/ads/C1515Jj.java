package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Jj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1515Jj extends AbstractC1583Lc implements InterfaceC1597Lj {
    C1515Jj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1597Lj
    public final void zze(InterfaceC4899xj interfaceC4899xj) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC4899xj);
        c(1, parcelA);
    }
}
