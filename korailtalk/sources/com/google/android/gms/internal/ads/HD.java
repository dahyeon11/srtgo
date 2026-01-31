package com.google.android.gms.internal.ads;

import H1.C0534f1;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class HD {

    /* renamed from: a */
    private final CT f13292a;

    /* renamed from: b */
    private final C1825Ra0 f13293b;

    /* renamed from: c */
    private final C2263ad0 f13294c;

    /* renamed from: d */
    private final C1987Uz f13295d;

    /* renamed from: e */
    private final C3741nZ f13296e;

    /* renamed from: f */
    private final C3375kI f13297f;

    /* renamed from: g */
    private C1457Ia0 f13298g;

    /* renamed from: h */
    private final C3508lU f13299h;

    /* renamed from: i */
    private final C2453cF f13300i;

    /* renamed from: j */
    private final Executor f13301j;

    /* renamed from: k */
    private final VT f13302k;

    /* renamed from: l */
    private final C3739nX f13303l;

    /* renamed from: m */
    private final CU f13304m;

    /* renamed from: n */
    private final JU f13305n;

    HD(CT ct, C1825Ra0 c1825Ra0, C2263ad0 c2263ad0, C1987Uz c1987Uz, C3741nZ c3741nZ, C3375kI c3375kI, C1457Ia0 c1457Ia0, C3508lU c3508lU, C2453cF c2453cF, Executor executor, VT vt, C3739nX c3739nX, CU cu, JU ju) {
        this.f13292a = ct;
        this.f13293b = c1825Ra0;
        this.f13294c = c2263ad0;
        this.f13295d = c1987Uz;
        this.f13296e = c3741nZ;
        this.f13297f = c3375kI;
        this.f13298g = c1457Ia0;
        this.f13299h = c3508lU;
        this.f13300i = c2453cF;
        this.f13301j = executor;
        this.f13302k = vt;
        this.f13303l = c3739nX;
        this.f13304m = cu;
        this.f13305n = ju;
    }

    final /* synthetic */ C1457Ia0 b(C1457Ia0 c1457Ia0) {
        this.f13295d.zza(c1457Ia0);
        return c1457Ia0;
    }

    final /* synthetic */ com.google.common.util.concurrent.C c(C1704Ob0 c1704Ob0, C2519cr c2519cr) {
        c2519cr.zzi = c1704Ob0;
        return this.f13299h.zza(c2519cr);
    }

    final /* synthetic */ com.google.common.util.concurrent.C d(com.google.common.util.concurrent.C c9, com.google.common.util.concurrent.C c10, com.google.common.util.concurrent.C c11) {
        return this.f13305n.zzc((C2519cr) c9.get(), (JSONObject) c10.get(), (C2863fr) c11.get());
    }

    public final C0534f1 zza(Throwable th) {
        return AbstractC4542ub0.zzb(th, this.f13303l);
    }

    public final C3375kI zzc() {
        return this.f13297f;
    }

    public final com.google.common.util.concurrent.C zze(final C1704Ob0 c1704Ob0) {
        C1297Ec0 c1297Ec0Zza = this.f13294c.zzb(EnumC1952Uc0.GET_CACHE_KEY, this.f13300i.zzc()).zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.DD
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.c(c1704Ob0, (C2519cr) obj);
            }
        }).zza();
        AbstractC1483In0.zzr(c1297Ec0Zza, new FD(this), this.f13301j);
        return c1297Ec0Zza;
    }

    public final com.google.common.util.concurrent.C zzh(C2519cr c2519cr) {
        C1297Ec0 c1297Ec0Zza = this.f13294c.zzb(EnumC1952Uc0.NOTIFY_CACHE_HIT, this.f13299h.zzg(c2519cr)).zza();
        AbstractC1483In0.zzr(c1297Ec0Zza, new GD(this), this.f13301j);
        return c1297Ec0Zza;
    }

    public final com.google.common.util.concurrent.C zzi(com.google.common.util.concurrent.C c9) {
        C1829Rc0 c1829Rc0Zzf = this.f13294c.zzb(EnumC1952Uc0.RENDERER, c9).zze(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.yD
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) {
                C1457Ia0 c1457Ia0 = (C1457Ia0) obj;
                this.zza.b(c1457Ia0);
                return c1457Ia0;
            }
        }).zzf(this.f13296e);
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfD)).booleanValue()) {
            c1829Rc0Zzf = c1829Rc0Zzf.zzi(((Integer) H1.C.zzc().zza(AbstractC4439th.zzfF)).intValue(), TimeUnit.SECONDS);
        }
        return c1829Rc0Zzf.zza();
    }

    public final com.google.common.util.concurrent.C zzj() {
        H1.Y1 y12 = this.f13293b.zzd;
        if (y12.zzx == null && y12.zzs == null) {
            return zzk(this.f13300i.zzc());
        }
        C2263ad0 c2263ad0 = this.f13294c;
        CT ct = this.f13292a;
        return AbstractC1543Kc0.zzc(ct.zza(), EnumC1952Uc0.PRELOADED_LOADER, c2263ad0).zza();
    }

    public final com.google.common.util.concurrent.C zzk(final com.google.common.util.concurrent.C c9) {
        C1457Ia0 c1457Ia0 = this.f13298g;
        if (c1457Ia0 != null) {
            return AbstractC1543Kc0.zzc(AbstractC1483In0.zzh(c1457Ia0), EnumC1952Uc0.SERVER_TRANSACTION, this.f13294c).zza();
        }
        G1.u.zzc().zzj();
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlB)).booleanValue() || ((Boolean) AbstractC4783wi.zzc.zze()).booleanValue()) {
            C1829Rc0 c1829Rc0Zzb = this.f13294c.zzb(EnumC1952Uc0.SERVER_TRANSACTION, c9);
            final VT vt = this.f13302k;
            Objects.requireNonNull(vt);
            return c1829Rc0Zzb.zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.ED
                @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                public final com.google.common.util.concurrent.C zza(Object obj) {
                    return vt.zzb((C2519cr) obj);
                }
            }).zza();
        }
        final CU cu = this.f13304m;
        Objects.requireNonNull(cu);
        final com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(c9, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.zD
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return cu.zza((C2519cr) obj);
            }
        }, this.f13301j);
        C1829Rc0 c1829Rc0Zzb2 = this.f13294c.zzb(EnumC1952Uc0.BUILD_URL, cZzn);
        final C3508lU c3508lU = this.f13299h;
        Objects.requireNonNull(c3508lU);
        final C1297Ec0 c1297Ec0Zza = c1829Rc0Zzb2.zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.AD
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return c3508lU.zzb((JSONObject) obj);
            }
        }).zza();
        return this.f13294c.zza(EnumC1952Uc0.SERVER_TRANSACTION, c9, cZzn, c1297Ec0Zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.BD
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.d(c9, cZzn, c1297Ec0Zza);
            }
        }).zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.CD
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return (com.google.common.util.concurrent.C) obj;
            }
        }).zza();
    }

    public final void zzl(C1457Ia0 c1457Ia0) {
        this.f13298g = c1457Ia0;
    }
}
