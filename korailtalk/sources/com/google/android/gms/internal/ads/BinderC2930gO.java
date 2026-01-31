package com.google.android.gms.internal.ads;

import H1.InterfaceC0583w0;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.gO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2930gO extends AbstractBinderC2276ak {

    /* renamed from: a, reason: collision with root package name */
    private final String f19350a;

    /* renamed from: b, reason: collision with root package name */
    private final NL f19351b;

    /* renamed from: c, reason: collision with root package name */
    private final SL f19352c;

    /* renamed from: d, reason: collision with root package name */
    private final LQ f19353d;

    public BinderC2930gO(String str, NL nl, SL sl, LQ lq) {
        this.f19350a = str;
        this.f19351b = nl;
        this.f19352c = sl;
        this.f19353d = lq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzA() {
        this.f19351b.zzH();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzB(Bundle bundle) {
        this.f19351b.zzL(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzC() {
        this.f19351b.zzN();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzD(InterfaceC0583w0 interfaceC0583w0) {
        this.f19351b.zzO(interfaceC0583w0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzE(H1.L0 l02) {
        try {
            if (!l02.zzf()) {
                this.f19353d.zze();
            }
        } catch (RemoteException e8) {
            L1.n.zzf("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f19351b.zzP(l02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzF(InterfaceC2129Yj interfaceC2129Yj) {
        this.f19351b.zzQ(interfaceC2129Yj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final boolean zzG() {
        return this.f19351b.zzV();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final boolean zzH() {
        return (this.f19352c.zzH().isEmpty() || this.f19352c.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final boolean zzI(Bundle bundle) {
        return this.f19351b.zzY(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final double zze() {
        return this.f19352c.zza();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final Bundle zzf() {
        return this.f19352c.zzd();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final H1.S0 zzg() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgW)).booleanValue()) {
            return this.f19351b.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final H1.V0 zzh() {
        return this.f19352c.zzj();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC2004Vi zzi() {
        return this.f19352c.zzl();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC2168Zi zzj() {
        return this.f19351b.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC2503cj zzk() {
        return this.f19352c.zzn();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC6172a zzl() {
        return this.f19352c.zzv();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final InterfaceC6172a zzm() {
        return r2.b.wrap(this.f19351b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzn() {
        return this.f19352c.zzx();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzo() {
        return this.f19352c.zzy();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzp() {
        return this.f19352c.zzz();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzq() {
        return this.f19352c.zzB();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzr() {
        return this.f19350a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzs() {
        return this.f19352c.zzD();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final String zzt() {
        return this.f19352c.zzE();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final List zzu() {
        return this.f19352c.zzG();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final List zzv() {
        return zzH() ? this.f19352c.zzH() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzw() {
        this.f19351b.zzv();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzx() {
        this.f19351b.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzy(H1.A0 a02) {
        this.f19351b.zzC(a02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2276ak, com.google.android.gms.internal.ads.InterfaceC2391bk
    public final void zzz(Bundle bundle) {
        this.f19351b.zzG(bundle);
    }
}
