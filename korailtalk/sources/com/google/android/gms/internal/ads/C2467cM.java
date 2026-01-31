package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2467cM {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC1310Ej f18291a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC1187Bj f18292b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC1883Sj f18293c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC1760Pj f18294d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC4335sm f18295e;

    /* renamed from: f, reason: collision with root package name */
    final O.h f18296f = new O.h();

    /* renamed from: g, reason: collision with root package name */
    final O.h f18297g = new O.h();

    public final C2467cM zza(InterfaceC1187Bj interfaceC1187Bj) {
        this.f18292b = interfaceC1187Bj;
        return this;
    }

    public final C2467cM zzb(InterfaceC1310Ej interfaceC1310Ej) {
        this.f18291a = interfaceC1310Ej;
        return this;
    }

    public final C2467cM zzc(String str, InterfaceC1597Lj interfaceC1597Lj, InterfaceC1433Hj interfaceC1433Hj) {
        this.f18296f.put(str, interfaceC1597Lj);
        if (interfaceC1433Hj != null) {
            this.f18297g.put(str, interfaceC1433Hj);
        }
        return this;
    }

    public final C2467cM zzd(InterfaceC4335sm interfaceC4335sm) {
        this.f18295e = interfaceC4335sm;
        return this;
    }

    public final C2467cM zze(InterfaceC1760Pj interfaceC1760Pj) {
        this.f18294d = interfaceC1760Pj;
        return this;
    }

    public final C2467cM zzf(InterfaceC1883Sj interfaceC1883Sj) {
        this.f18293c = interfaceC1883Sj;
        return this;
    }

    public final C2696eM zzg() {
        return new C2696eM(this);
    }
}
