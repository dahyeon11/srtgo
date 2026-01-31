package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ra, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1824Ra implements InterfaceC1141Ag0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1876Sf0 f16129a;

    C1824Ra(C1876Sf0 c1876Sf0) {
        this.f16129a = c1876Sf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1141Ag0
    public final void zza(int i8, long j8) {
        this.f16129a.zzd(i8, System.currentTimeMillis() - j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1141Ag0
    public final void zzb(int i8, long j8, String str) {
        this.f16129a.zze(i8, System.currentTimeMillis() - j8, str);
    }
}
