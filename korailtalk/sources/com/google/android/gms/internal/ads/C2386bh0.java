package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.bh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2386bh0 extends AbstractC1583Lc implements InterfaceC2615dh0 {
    C2386bh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public final void zze(InterfaceC6172a interfaceC6172a, String str, String str2) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeString(str);
        parcelA.writeString(null);
        c(8, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public final void zzf() {
        c(3, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public final void zzg(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(7, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public final void zzh(int[] iArr) {
        Parcel parcelA = a();
        parcelA.writeIntArray(null);
        c(4, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public final void zzi(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(6, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public final void zzj(byte[] bArr) {
        Parcel parcelA = a();
        parcelA.writeByteArray(bArr);
        c(5, parcelA);
    }
}
