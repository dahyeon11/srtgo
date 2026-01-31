package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Nd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1666Nd extends AbstractC1583Lc implements InterfaceC1748Pd {
    C1666Nd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final H1.X zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final H1.S0 zzf() {
        Parcel parcelB = b(5, a());
        H1.S0 s0Zzb = H1.R0.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return s0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final void zzg(boolean z8) {
        Parcel parcelA = a();
        int i8 = AbstractC1664Nc.zza;
        parcelA.writeInt(z8 ? 1 : 0);
        c(6, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final void zzh(H1.L0 l02) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, l02);
        c(7, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1748Pd
    public final void zzi(InterfaceC6172a interfaceC6172a, InterfaceC2035Wd interfaceC2035Wd) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC2035Wd);
        c(4, parcelA);
    }
}
