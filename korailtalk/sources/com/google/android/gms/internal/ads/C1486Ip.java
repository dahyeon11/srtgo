package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Ip, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1486Ip extends AbstractC1583Lc implements InterfaceC1568Kp {
    C1486Ip(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zze(Intent intent) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, intent);
        c(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzf(String[] strArr, int[] iArr, InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        parcelA.writeStringArray(strArr);
        parcelA.writeIntArray(iArr);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(5, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzg(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(4, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzh() {
        c(3, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzi(InterfaceC6172a interfaceC6172a, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1568Kp
    public final void zzj(InterfaceC6172a interfaceC6172a, I1.a aVar) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, aVar);
        c(6, parcelA);
    }
}
