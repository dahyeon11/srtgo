package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.dF */
/* loaded from: classes2.dex */
public final class C2568dF implements GD0 {

    /* renamed from: a */
    private final XD0 f18561a;

    /* renamed from: b */
    private final XD0 f18562b;

    /* renamed from: c */
    private final XD0 f18563c;

    /* renamed from: d */
    private final XD0 f18564d;

    /* renamed from: e */
    private final XD0 f18565e;

    /* renamed from: f */
    private final XD0 f18566f;

    /* renamed from: g */
    private final XD0 f18567g;

    /* renamed from: h */
    private final XD0 f18568h;

    /* renamed from: i */
    private final XD0 f18569i;

    /* renamed from: j */
    private final XD0 f18570j;

    /* renamed from: k */
    private final XD0 f18571k;

    /* renamed from: l */
    private final XD0 f18572l;

    public C2568dF(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05, XD0 xd06, XD0 xd07, XD0 xd08, XD0 xd09, XD0 xd010, XD0 xd011, XD0 xd012) {
        this.f18561a = xd0;
        this.f18562b = xd02;
        this.f18563c = xd03;
        this.f18564d = xd04;
        this.f18565e = xd05;
        this.f18566f = xd06;
        this.f18567g = xd07;
        this.f18568h = xd08;
        this.f18569i = xd09;
        this.f18570j = xd010;
        this.f18571k = xd011;
        this.f18572l = xd012;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza */
    public final C2453cF zzb() {
        C2263ad0 c2263ad0 = (C2263ad0) this.f18561a.zzb();
        L1.a aVarZza = ((C4357sx) this.f18562b).zza();
        ApplicationInfo applicationInfoZzb = ((C2707eT) this.f18563c).zzb();
        String strZzb = ((C3279jT) this.f18564d).zzb();
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zza;
        return new C2453cF(c2263ad0, aVarZza, applicationInfoZzb, strZzb, H1.C.zza().zza(), (PackageInfo) this.f18566f.zzb(), FD0.zza(SD0.zza(this.f18567g)), ((C2760ex) this.f18568h).zzb(), (String) this.f18569i.zzb(), ((S50) this.f18570j).zzb(), ((C4053qF) this.f18571k).zza(), (C3831oI) this.f18572l.zzb());
    }
}
