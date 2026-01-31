package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Sn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1891Sn extends AbstractC1583Lc implements InterfaceC1973Un {
    C1891Sn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzA(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC2096Xn);
        c(28, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzB(H1.Y1 y12, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzC(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC2096Xn);
        c(32, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzD(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(21, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzE() {
        c(8, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzF() {
        c(9, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzG(boolean z8) {
        Parcel parcelA = a();
        int i8 = AbstractC1664Nc.zza;
        parcelA.writeInt(z8 ? 1 : 0);
        c(25, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzH(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(39, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzI() {
        c(4, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzJ(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(37, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzK(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(30, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzL() {
        c(12, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final boolean zzM() {
        Parcel parcelB = b(22, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final boolean zzN() {
        Parcel parcelB = b(13, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final C2513co zzO() {
        C2513co c2513co;
        Parcel parcelB = b(15, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c2513co = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c2513co = iInterfaceQueryLocalInterface instanceof C2513co ? (C2513co) iInterfaceQueryLocalInterface : new C2513co(strongBinder);
        }
        parcelB.recycle();
        return c2513co;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final C2742eo zzP() {
        C2742eo c2742eo;
        Parcel parcelB = b(16, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c2742eo = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c2742eo = iInterfaceQueryLocalInterface instanceof C2742eo ? (C2742eo) iInterfaceQueryLocalInterface : new C2742eo(strongBinder);
        }
        parcelB.recycle();
        return c2742eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final Bundle zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final Bundle zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final Bundle zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final H1.V0 zzh() {
        Parcel parcelB = b(26, a());
        H1.V0 v0Zzb = H1.U0.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return v0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final InterfaceC4899xj zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final InterfaceC2284ao zzj() {
        InterfaceC2284ao c2137Yn;
        Parcel parcelB = b(36, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c2137Yn = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c2137Yn = iInterfaceQueryLocalInterface instanceof InterfaceC2284ao ? (InterfaceC2284ao) iInterfaceQueryLocalInterface : new C2137Yn(strongBinder);
        }
        parcelB.recycle();
        return c2137Yn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final InterfaceC3087ho zzk() {
        InterfaceC3087ho c2857fo;
        Parcel parcelB = b(27, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c2857fo = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c2857fo = iInterfaceQueryLocalInterface instanceof InterfaceC3087ho ? (InterfaceC3087ho) iInterfaceQueryLocalInterface : new C2857fo(strongBinder);
        }
        parcelB.recycle();
        return c2857fo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final C2974gp zzl() {
        Parcel parcelB = b(33, a());
        C2974gp c2974gp = (C2974gp) AbstractC1664Nc.zza(parcelB, C2974gp.CREATOR);
        parcelB.recycle();
        return c2974gp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final C2974gp zzm() {
        Parcel parcelB = b(34, a());
        C2974gp c2974gp = (C2974gp) AbstractC1664Nc.zza(parcelB, C2974gp.CREATOR);
        parcelB.recycle();
        return c2974gp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final InterfaceC6172a zzn() {
        Parcel parcelB = b(2, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzo() {
        c(5, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzp(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC1201Br interfaceC1201Br, String str2) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeString(null);
        AbstractC1664Nc.zzf(parcelA, interfaceC1201Br);
        parcelA.writeString(str2);
        c(10, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzq(InterfaceC6172a interfaceC6172a, InterfaceC2280am interfaceC2280am, List list) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC2280am);
        parcelA.writeTypedList(list);
        c(31, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzr(InterfaceC6172a interfaceC6172a, InterfaceC1201Br interfaceC1201Br, List list) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC1201Br);
        parcelA.writeStringList(list);
        c(23, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzs(H1.Y1 y12, String str) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeString(str);
        c(11, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzt(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC2096Xn);
        c(38, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzu(InterfaceC6172a interfaceC6172a, H1.d2 d2Var, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzv(InterfaceC6172a interfaceC6172a, H1.d2 d2Var, H1.Y1 y12, String str, String str2, InterfaceC2096Xn interfaceC2096Xn) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, d2Var);
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC1664Nc.zzf(parcelA, interfaceC2096Xn);
        c(6, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzw(InterfaceC6172a interfaceC6172a, H1.d2 d2Var, H1.Y1 y12, String str, String str2, InterfaceC2096Xn interfaceC2096Xn) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, d2Var);
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC1664Nc.zzf(parcelA, interfaceC2096Xn);
        c(35, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzx(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, InterfaceC2096Xn interfaceC2096Xn) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzy(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, String str2, InterfaceC2096Xn interfaceC2096Xn) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC1664Nc.zzf(parcelA, interfaceC2096Xn);
        c(7, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973Un
    public final void zzz(InterfaceC6172a interfaceC6172a, H1.Y1 y12, String str, String str2, InterfaceC2096Xn interfaceC2096Xn, C1840Ri c1840Ri, List list) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, y12);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC1664Nc.zzf(parcelA, interfaceC2096Xn);
        AbstractC1664Nc.zzd(parcelA, c1840Ri);
        parcelA.writeStringList(list);
        c(14, parcelA);
    }
}
