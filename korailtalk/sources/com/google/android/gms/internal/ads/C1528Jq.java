package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Jq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1528Jq extends AbstractC1583Lc implements InterfaceC1610Lq {
    C1528Jq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1610Lq
    public final void zze(C2519cr c2519cr, InterfaceC2019Vq interfaceC2019Vq) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c2519cr);
        AbstractC1664Nc.zzf(parcelA, interfaceC2019Vq);
        c(6, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1610Lq
    public final void zzf(C2519cr c2519cr, InterfaceC2019Vq interfaceC2019Vq) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c2519cr);
        AbstractC1664Nc.zzf(parcelA, interfaceC2019Vq);
        c(5, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1610Lq
    public final void zzg(C2519cr c2519cr, InterfaceC2019Vq interfaceC2019Vq) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c2519cr);
        AbstractC1664Nc.zzf(parcelA, interfaceC2019Vq);
        c(4, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1610Lq
    public final void zzh(String str, InterfaceC2019Vq interfaceC2019Vq) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC2019Vq);
        c(7, parcelA);
    }
}
