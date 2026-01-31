package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Tj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1924Tj extends AbstractC1583Lc implements InterfaceC2006Vj {
    C1924Tj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2006Vj
    public final boolean zze(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        Parcel parcelB = b(2, parcelA);
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
