package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Hr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1447Hr extends AbstractC1583Lc implements InterfaceC1570Kr {
    C1447Hr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final Bundle zzb() {
        Parcel parcelB = b(9, a());
        Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcelB, Bundle.CREATOR);
        parcelB.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final H1.S0 zzc() {
        Parcel parcelB = b(12, a());
        H1.S0 s0Zzb = H1.R0.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return s0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final InterfaceC1406Gr zzd() {
        InterfaceC1406Gr c1324Er;
        Parcel parcelB = b(11, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c1324Er = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            c1324Er = iInterfaceQueryLocalInterface instanceof InterfaceC1406Gr ? (InterfaceC1406Gr) iInterfaceQueryLocalInterface : new C1324Er(strongBinder);
        }
        parcelB.recycle();
        return c1324Er;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzf(H1.Y1 y12, InterfaceC1856Rr interfaceC1856Rr) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, y12);
        AbstractC1664Nc.zzf(parcelA, interfaceC1856Rr);
        c(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzg(H1.Y1 y12, InterfaceC1856Rr interfaceC1856Rr) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, y12);
        AbstractC1664Nc.zzf(parcelA, interfaceC1856Rr);
        c(14, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzh(boolean z8) {
        Parcel parcelA = a();
        int i8 = AbstractC1664Nc.zza;
        parcelA.writeInt(z8 ? 1 : 0);
        c(15, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzi(H1.I0 i02) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, i02);
        c(8, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzj(H1.L0 l02) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, l02);
        c(13, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzk(InterfaceC1692Nr interfaceC1692Nr) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1692Nr);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzl(C2143Yr c2143Yr) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c2143Yr);
        c(7, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzm(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(5, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzn(InterfaceC6172a interfaceC6172a, boolean z8) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final boolean zzo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzp(C1897Sr c1897Sr) {
        throw null;
    }
}
