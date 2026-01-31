package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Tq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1937Tq extends AbstractC1583Lc implements InterfaceC2019Vq {
    C1937Tq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2019Vq
    public final void zze(K1.D d9) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, d9);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2019Vq
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, parcelFileDescriptor);
        c(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2019Vq
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, C2519cr c2519cr) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, parcelFileDescriptor);
        AbstractC1664Nc.zzd(parcelA, c2519cr);
        c(3, parcelA);
    }
}
