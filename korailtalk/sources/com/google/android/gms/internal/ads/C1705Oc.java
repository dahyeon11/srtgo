package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1705Oc extends AbstractC1583Lc implements InterfaceC1787Qc {
    C1705Oc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1787Qc
    public final void zze(InterfaceC6172a interfaceC6172a, String str) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeString("GMA_SDK");
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1787Qc
    public final void zzf() {
        c(3, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1787Qc
    public final void zzg(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(7, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1787Qc
    public final void zzh(int[] iArr) {
        Parcel parcelA = a();
        parcelA.writeIntArray(null);
        c(4, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1787Qc
    public final void zzi(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(0);
        c(6, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1787Qc
    public final void zzj(byte[] bArr) {
        Parcel parcelA = a();
        parcelA.writeByteArray(bArr);
        c(5, parcelA);
    }
}
