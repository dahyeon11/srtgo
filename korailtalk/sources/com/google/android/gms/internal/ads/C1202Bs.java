package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Bs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1202Bs extends AbstractC1448Hs {

    /* renamed from: b, reason: collision with root package name */
    private final o2.f f12316b;

    /* renamed from: c, reason: collision with root package name */
    private final C1202Bs f12317c = this;

    /* renamed from: d, reason: collision with root package name */
    private final PD0 f12318d;

    /* renamed from: e, reason: collision with root package name */
    private final PD0 f12319e;

    /* renamed from: f, reason: collision with root package name */
    private final PD0 f12320f;

    /* renamed from: g, reason: collision with root package name */
    private final PD0 f12321g;

    /* renamed from: h, reason: collision with root package name */
    private final PD0 f12322h;

    /* renamed from: i, reason: collision with root package name */
    private final PD0 f12323i;

    /* renamed from: j, reason: collision with root package name */
    private final PD0 f12324j;

    /* renamed from: k, reason: collision with root package name */
    private final PD0 f12325k;

    /* synthetic */ C1202Bs(Context context, o2.f fVar, InterfaceC0671x0 interfaceC0671x0, C1407Gs c1407Gs, AbstractC1161As abstractC1161As) {
        this.f12316b = fVar;
        GD0 gd0Zza = HD0.zza(context);
        this.f12318d = gd0Zza;
        GD0 gd0Zza2 = HD0.zza(interfaceC0671x0);
        this.f12319e = gd0Zza2;
        this.f12320f = FD0.zzc(new C4461ts(gd0Zza, gd0Zza2));
        GD0 gd0Zza3 = HD0.zza(fVar);
        this.f12321g = gd0Zza3;
        GD0 gd0Zza4 = HD0.zza(c1407Gs);
        this.f12322h = gd0Zza4;
        PD0 pd0Zzc = FD0.zzc(new C4689vs(gd0Zza3, gd0Zza2, gd0Zza4));
        this.f12323i = pd0Zzc;
        C4917xs c4917xs = new C4917xs(gd0Zza3, pd0Zzc);
        this.f12324j = c4917xs;
        this.f12325k = FD0.zzc(new C1693Ns(gd0Zza, c4917xs));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1448Hs
    final SharedPreferencesOnSharedPreferenceChangeListenerC4347ss a() {
        return (SharedPreferencesOnSharedPreferenceChangeListenerC4347ss) this.f12320f.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1448Hs
    final C4803ws b() {
        return new C4803ws(this.f12316b, (C4575us) this.f12323i.zzb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1448Hs
    final C1611Ls c() {
        return (C1611Ls) this.f12325k.zzb();
    }
}
