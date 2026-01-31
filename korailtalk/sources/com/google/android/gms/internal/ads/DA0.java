package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class DA0 extends BA0 {
    DA0() {
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* synthetic */ int a(Object obj) {
        return ((CA0) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* synthetic */ int b(Object obj) {
        return ((CA0) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        Zy0 zy0 = (Zy0) obj;
        CA0 ca0 = zy0.zzt;
        if (ca0 != CA0.zzc()) {
            return ca0;
        }
        CA0 ca0C = CA0.c();
        zy0.zzt = ca0C;
        return ca0C;
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* synthetic */ Object d(Object obj) {
        return ((Zy0) obj).zzt;
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (CA0.zzc().equals(obj2)) {
            return obj;
        }
        if (CA0.zzc().equals(obj)) {
            return CA0.b((CA0) obj, (CA0) obj2);
        }
        ((CA0) obj).a((CA0) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* synthetic */ Object f() {
        return CA0.c();
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* synthetic */ Object g(Object obj) {
        ((CA0) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* bridge */ /* synthetic */ void h(Object obj, int i8, int i9) {
        ((CA0) obj).f((i8 << 3) | 5, Integer.valueOf(i9));
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* bridge */ /* synthetic */ void i(Object obj, int i8, long j8) {
        ((CA0) obj).f((i8 << 3) | 1, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* bridge */ /* synthetic */ void j(Object obj, int i8, Object obj2) {
        ((CA0) obj).f((i8 << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* bridge */ /* synthetic */ void k(Object obj, int i8, AbstractC3677my0 abstractC3677my0) {
        ((CA0) obj).f((i8 << 3) | 2, abstractC3677my0);
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* bridge */ /* synthetic */ void l(Object obj, int i8, long j8) {
        ((CA0) obj).f(i8 << 3, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final void m(Object obj) {
        ((Zy0) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* synthetic */ void n(Object obj, Object obj2) {
        ((Zy0) obj).zzt = (CA0) obj2;
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* synthetic */ void o(Object obj, Object obj2) {
        ((Zy0) obj).zzt = (CA0) obj2;
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* synthetic */ void p(Object obj, UA0 ua0) {
        ((CA0) obj).g(ua0);
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final /* synthetic */ void q(Object obj, UA0 ua0) {
        ((CA0) obj).zzl(ua0);
    }

    @Override // com.google.android.gms.internal.ads.BA0
    final boolean s(InterfaceC2444cA0 interfaceC2444cA0) {
        return false;
    }
}
