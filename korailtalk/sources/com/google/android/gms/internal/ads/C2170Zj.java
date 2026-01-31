package com.google.android.gms.internal.ads;

import H1.InterfaceC0583w0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2170Zj extends AbstractC1583Lc implements InterfaceC2391bk {
    C2170Zj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzA() {
        c(28, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzB(Bundle bundle) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, bundle);
        c(17, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzC() {
        c(27, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzD(InterfaceC0583w0 interfaceC0583w0) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC0583w0);
        c(26, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzE(H1.L0 l02) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, l02);
        c(32, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzF(InterfaceC2129Yj interfaceC2129Yj) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC2129Yj);
        c(21, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final boolean zzG() {
        Parcel parcelB = b(30, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final boolean zzH() {
        Parcel parcelB = b(24, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final boolean zzI(Bundle bundle) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, bundle);
        Parcel parcelB = b(16, parcelA);
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final double zze() {
        Parcel parcelB = b(8, a());
        double d9 = parcelB.readDouble();
        parcelB.recycle();
        return d9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final Bundle zzf() {
        Parcel parcelB = b(20, a());
        Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcelB, Bundle.CREATOR);
        parcelB.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final H1.S0 zzg() {
        Parcel parcelB = b(31, a());
        H1.S0 s0Zzb = H1.R0.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return s0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final H1.V0 zzh() {
        Parcel parcelB = b(11, a());
        H1.V0 v0Zzb = H1.U0.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return v0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC2004Vi zzi() {
        InterfaceC2004Vi c1922Ti;
        Parcel parcelB = b(14, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c1922Ti = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c1922Ti = iInterfaceQueryLocalInterface instanceof InterfaceC2004Vi ? (InterfaceC2004Vi) iInterfaceQueryLocalInterface : new C1922Ti(strongBinder);
        }
        parcelB.recycle();
        return c1922Ti;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC2168Zi zzj() {
        InterfaceC2168Zi c2086Xi;
        Parcel parcelB = b(29, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c2086Xi = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            c2086Xi = iInterfaceQueryLocalInterface instanceof InterfaceC2168Zi ? (InterfaceC2168Zi) iInterfaceQueryLocalInterface : new C2086Xi(strongBinder);
        }
        parcelB.recycle();
        return c2086Xi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC2503cj zzk() {
        InterfaceC2503cj c2274aj;
        Parcel parcelB = b(5, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c2274aj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c2274aj = iInterfaceQueryLocalInterface instanceof InterfaceC2503cj ? (InterfaceC2503cj) iInterfaceQueryLocalInterface : new C2274aj(strongBinder);
        }
        parcelB.recycle();
        return c2274aj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC6172a zzl() {
        Parcel parcelB = b(19, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC6172a zzm() {
        Parcel parcelB = b(18, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzn() {
        Parcel parcelB = b(7, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzo() {
        Parcel parcelB = b(4, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzp() {
        Parcel parcelB = b(6, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzq() {
        Parcel parcelB = b(2, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzs() {
        Parcel parcelB = b(10, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzt() {
        Parcel parcelB = b(9, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final List zzu() {
        Parcel parcelB = b(3, a());
        ArrayList arrayListZzb = AbstractC1664Nc.zzb(parcelB);
        parcelB.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final List zzv() {
        Parcel parcelB = b(23, a());
        ArrayList arrayListZzb = AbstractC1664Nc.zzb(parcelB);
        parcelB.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzw() {
        c(22, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzx() {
        c(13, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzy(H1.A0 a02) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, a02);
        c(25, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzz(Bundle bundle) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, bundle);
        c(15, parcelA);
    }
}
