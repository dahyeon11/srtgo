package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes2.dex */
public final class KG0 extends AbstractC4056qG0 implements InterfaceC2913gF0 {

    /* renamed from: b, reason: collision with root package name */
    private final NF0 f13781b;

    /* renamed from: c, reason: collision with root package name */
    private final K30 f13782c;

    KG0(C2798fF0 c2798fF0) {
        K30 k30 = new K30(InterfaceC3002h20.zza);
        this.f13782c = k30;
        try {
            this.f13781b = new NF0(c2798fF0, this);
            k30.zze();
        } catch (Throwable th) {
            this.f13782c.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzA(SG0 sg0) {
        this.f13782c.zzb();
        this.f13781b.zzA(sg0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzB(PM0 pm0) {
        this.f13782c.zzb();
        this.f13781b.zzB(pm0);
    }

    public final WE0 zzC() {
        this.f13782c.zzb();
        return this.f13781b.zzE();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0
    public final void zza(int i8, long j8, int i9, boolean z8) {
        this.f13782c.zzb();
        this.f13781b.zza(i8, j8, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzb() {
        this.f13782c.zzb();
        return this.f13781b.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzc() {
        this.f13782c.zzb();
        return this.f13781b.zzc();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzd() {
        this.f13782c.zzb();
        return this.f13781b.zzd();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zze() {
        this.f13782c.zzb();
        return this.f13781b.zze();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzf() {
        this.f13782c.zzb();
        return this.f13781b.zzf();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzg() {
        this.f13782c.zzb();
        return this.f13781b.zzg();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzh() {
        this.f13782c.zzb();
        this.f13781b.zzh();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzi() {
        this.f13782c.zzb();
        return this.f13781b.zzi();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzj() {
        this.f13782c.zzb();
        return this.f13781b.zzj();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzk() {
        this.f13782c.zzb();
        return this.f13781b.zzk();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzl() {
        this.f13782c.zzb();
        return this.f13781b.zzl();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final long zzm() {
        this.f13782c.zzb();
        return this.f13781b.zzm();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final RG zzn() {
        this.f13782c.zzb();
        return this.f13781b.zzn();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final CN zzo() {
        this.f13782c.zzb();
        return this.f13781b.zzo();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzp() {
        this.f13782c.zzb();
        this.f13781b.zzp();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzq() {
        this.f13782c.zzb();
        this.f13781b.zzq();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzr(boolean z8) {
        this.f13782c.zzb();
        this.f13781b.zzr(z8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzs(Surface surface) {
        this.f13782c.zzb();
        this.f13781b.zzs(surface);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzt(float f8) {
        this.f13782c.zzb();
        this.f13781b.zzt(f8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzu() {
        this.f13782c.zzb();
        this.f13781b.zzu();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final boolean zzv() {
        this.f13782c.zzb();
        return this.f13781b.zzv();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final boolean zzw() {
        this.f13782c.zzb();
        this.f13781b.zzw();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4056qG0, com.google.android.gms.internal.ads.InterfaceC3021hC, com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final boolean zzx() {
        this.f13782c.zzb();
        return this.f13781b.zzx();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final int zzy() {
        this.f13782c.zzb();
        this.f13781b.zzy();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2913gF0
    public final void zzz(SG0 sg0) {
        this.f13782c.zzb();
        this.f13781b.zzz(sg0);
    }
}
