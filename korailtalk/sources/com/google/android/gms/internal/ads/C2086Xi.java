package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Xi */
/* loaded from: classes2.dex */
public final class C2086Xi extends AbstractC1583Lc implements InterfaceC2168Zi {
    C2086Xi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final float zze() {
        Parcel parcelB = b(2, a());
        float f8 = parcelB.readFloat();
        parcelB.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final float zzf() {
        Parcel parcelB = b(6, a());
        float f8 = parcelB.readFloat();
        parcelB.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final float zzg() {
        Parcel parcelB = b(5, a());
        float f8 = parcelB.readFloat();
        parcelB.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final H1.V0 zzh() {
        Parcel parcelB = b(7, a());
        H1.V0 v0Zzb = H1.U0.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return v0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final InterfaceC6172a zzi() {
        Parcel parcelB = b(4, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final void zzj(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final boolean zzk() {
        Parcel parcelB = b(10, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final boolean zzl() {
        Parcel parcelB = b(8, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Zi
    public final void zzm(C1637Mj c1637Mj) {
        throw null;
    }
}
