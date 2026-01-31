package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4883xb implements InterfaceC2083Xg0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1958Uf0 f23756a;

    /* renamed from: b, reason: collision with root package name */
    private final C3527lg0 f23757b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC1581Lb f23758c;

    /* renamed from: d, reason: collision with root package name */
    private final C4769wb f23759d;

    /* renamed from: e, reason: collision with root package name */
    private final C2946gb f23760e;

    /* renamed from: f, reason: collision with root package name */
    private final C1703Ob f23761f;

    /* renamed from: g, reason: collision with root package name */
    private final C1335Fb f23762g;

    /* renamed from: h, reason: collision with root package name */
    private final C4655vb f23763h;

    C4883xb(AbstractC1958Uf0 abstractC1958Uf0, C3527lg0 c3527lg0, ViewOnAttachStateChangeListenerC1581Lb viewOnAttachStateChangeListenerC1581Lb, C4769wb c4769wb, C2946gb c2946gb, C1703Ob c1703Ob, C1335Fb c1335Fb, C4655vb c4655vb) {
        this.f23756a = abstractC1958Uf0;
        this.f23757b = c3527lg0;
        this.f23758c = viewOnAttachStateChangeListenerC1581Lb;
        this.f23759d = c4769wb;
        this.f23760e = c2946gb;
        this.f23761f = c1703Ob;
        this.f23762g = c1335Fb;
        this.f23763h = c4655vb;
    }

    private final Map b() {
        HashMap map = new HashMap();
        AbstractC1958Uf0 abstractC1958Uf0 = this.f23756a;
        O9 o9Zzb = this.f23757b.zzb();
        map.put("v", abstractC1958Uf0.zzb());
        map.put("gms", Boolean.valueOf(this.f23756a.zzc()));
        map.put("int", o9Zzb.zzi());
        map.put("up", Boolean.valueOf(this.f23759d.a()));
        map.put("t", new Throwable());
        C1335Fb c1335Fb = this.f23762g;
        if (c1335Fb != null) {
            map.put("tcq", Long.valueOf(c1335Fb.zzc()));
            map.put("tpq", Long.valueOf(this.f23762g.zzg()));
            map.put("tcv", Long.valueOf(this.f23762g.zzd()));
            map.put("tpv", Long.valueOf(this.f23762g.zzh()));
            map.put("tchv", Long.valueOf(this.f23762g.zzb()));
            map.put("tphv", Long.valueOf(this.f23762g.zzf()));
            map.put("tcc", Long.valueOf(this.f23762g.zza()));
            map.put("tpc", Long.valueOf(this.f23762g.zze()));
        }
        return map;
    }

    final void a(View view) {
        this.f23758c.c(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2083Xg0
    public final Map zza() {
        ViewOnAttachStateChangeListenerC1581Lb viewOnAttachStateChangeListenerC1581Lb = this.f23758c;
        Map mapB = b();
        mapB.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC1581Lb.zza()));
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2083Xg0
    public final Map zzb() {
        AbstractC1958Uf0 abstractC1958Uf0 = this.f23756a;
        C3527lg0 c3527lg0 = this.f23757b;
        Map mapB = b();
        O9 o9Zza = c3527lg0.zza();
        mapB.put("gai", Boolean.valueOf(abstractC1958Uf0.zzd()));
        mapB.put("did", o9Zza.zzh());
        mapB.put("dst", Integer.valueOf(o9Zza.zzc().zza()));
        mapB.put("doo", Boolean.valueOf(o9Zza.zzaq()));
        C2946gb c2946gb = this.f23760e;
        if (c2946gb != null) {
            mapB.put("nt", Long.valueOf(c2946gb.zza()));
        }
        C1703Ob c1703Ob = this.f23761f;
        if (c1703Ob != null) {
            mapB.put("vs", Long.valueOf(c1703Ob.zzc()));
            mapB.put("vf", Long.valueOf(this.f23761f.zzb()));
        }
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2083Xg0
    public final Map zzc() {
        C4655vb c4655vb = this.f23763h;
        Map mapB = b();
        if (c4655vb != null) {
            mapB.put("vst", c4655vb.zza());
        }
        return mapB;
    }
}
