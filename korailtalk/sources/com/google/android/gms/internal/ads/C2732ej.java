package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.ej, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2732ej extends AbstractC1583Lc implements InterfaceC2962gj {
    C2732ej(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2962gj
    public final InterfaceC6172a zzb(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(2, parcelA);
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2962gj
    public final void zzc() {
        c(4, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2962gj
    public final void zzd(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(7, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2962gj
    public final void zzdv(String str, InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2962gj
    public final void zzdw(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(6, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2962gj
    public final void zzdx(InterfaceC2168Zi interfaceC2168Zi) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC2168Zi);
        c(8, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2962gj
    public final void zzdy(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(9, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2962gj
    public final void zzdz(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2962gj
    public final void zze(InterfaceC6172a interfaceC6172a, int i8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeInt(i8);
        c(5, parcelA);
    }
}
