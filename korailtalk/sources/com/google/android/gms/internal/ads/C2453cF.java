package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.cF */
/* loaded from: classes2.dex */
public final class C2453cF {

    /* renamed from: a */
    private final C2263ad0 f18264a;

    /* renamed from: b */
    private final L1.a f18265b;

    /* renamed from: c */
    private final ApplicationInfo f18266c;

    /* renamed from: d */
    private final String f18267d;

    /* renamed from: e */
    private final List f18268e;

    /* renamed from: f */
    private final PackageInfo f18269f;

    /* renamed from: g */
    private final AD0 f18270g;

    /* renamed from: h */
    private final String f18271h;

    /* renamed from: i */
    private final Q50 f18272i;

    /* renamed from: j */
    private final InterfaceC0671x0 f18273j;

    /* renamed from: k */
    private final C1825Ra0 f18274k;

    /* renamed from: l */
    private final C3831oI f18275l;

    public C2453cF(C2263ad0 c2263ad0, L1.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, AD0 ad0, InterfaceC0671x0 interfaceC0671x0, String str2, Q50 q50, C1825Ra0 c1825Ra0, C3831oI c3831oI) {
        this.f18264a = c2263ad0;
        this.f18265b = aVar;
        this.f18266c = applicationInfo;
        this.f18267d = str;
        this.f18268e = list;
        this.f18269f = packageInfo;
        this.f18270g = ad0;
        this.f18271h = str2;
        this.f18272i = q50;
        this.f18273j = interfaceC0671x0;
        this.f18274k = c1825Ra0;
        this.f18275l = c3831oI;
    }

    final /* synthetic */ C2519cr a(com.google.common.util.concurrent.C c9, Bundle bundle) {
        Bundle bundle2 = (Bundle) c9.get();
        String str = (String) ((com.google.common.util.concurrent.C) this.f18270g.zzb()).get();
        boolean z8 = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhq)).booleanValue() && this.f18273j.zzS();
        String str2 = this.f18271h;
        PackageInfo packageInfo = this.f18269f;
        List list = this.f18268e;
        return new C2519cr(bundle2, this.f18265b, this.f18266c, this.f18267d, list, packageInfo, str, str2, null, null, z8, this.f18274k.zzb(), bundle);
    }

    public final com.google.common.util.concurrent.C zzb(Bundle bundle) {
        this.f18275l.zza();
        return AbstractC1543Kc0.zzc(this.f18272i.zza(new Bundle(), bundle), EnumC1952Uc0.SIGNALS, this.f18264a).zza();
    }

    public final com.google.common.util.concurrent.C zzc() {
        Bundle bundle;
        final Bundle bundle2 = new Bundle();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue() && (bundle = this.f18274k.zzs) != null) {
            bundle2.putAll(bundle);
        }
        final com.google.common.util.concurrent.C cZzb = zzb(bundle2);
        return this.f18264a.zza(EnumC1952Uc0.REQUEST_PARCEL, cZzb, (com.google.common.util.concurrent.C) this.f18270g.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.bF
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a(cZzb, bundle2);
            }
        }).zza();
    }
}
