package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;

/* loaded from: classes2.dex */
public final class UD implements InterfaceC3941pG, InterfaceC0517a, YG, VF, InterfaceC5078zF, InterfaceC3603mI {

    /* renamed from: a, reason: collision with root package name */
    private final o2.f f16616a;

    /* renamed from: b, reason: collision with root package name */
    private final C2752et f16617b;

    public UD(o2.f fVar, C2752et c2752et) {
        this.f16616a = fVar;
        this.f16617b = c2752et;
    }

    @Override // H1.InterfaceC0517a
    public final void onAdClicked() {
        this.f16617b.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zza() {
        this.f16617b.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdn(C2519cr c2519cr) {
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdo(C1457Ia0 c1457Ia0) {
        this.f16617b.zzk(this.f16616a.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzds(InterfaceC4118qr interfaceC4118qr, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzf() {
    }

    public final String zzg() {
        return this.f16617b.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzi(C1957Uf c1957Uf) {
        this.f16617b.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzj(C1957Uf c1957Uf) {
    }

    public final void zzk(H1.Y1 y12) {
        this.f16617b.zzj(y12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzl(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzm(C1957Uf c1957Uf) {
        this.f16617b.zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603mI
    public final void zzn(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void zzr() {
        this.f16617b.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final void zzs() {
        this.f16617b.zzh(true);
    }
}
