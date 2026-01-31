package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4482u2 implements InterfaceC2425c1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2425c1 f22959a;

    public C4482u2() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        return this.f22959a.zzb(interfaceC2540d1, c5050z1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f22959a.zzd(interfaceC2769f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f22959a.zze(j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        return this.f22959a.zzf(interfaceC2540d1);
    }

    public C4482u2(int i8) {
        this.f22959a = new C4596v2();
    }
}
