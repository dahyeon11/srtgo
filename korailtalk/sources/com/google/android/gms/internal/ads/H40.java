package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class H40 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f13246a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f13247b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f13248c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f13249d;

    public H40(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f13246a = xd0;
        this.f13247b = xd02;
        this.f13248c = xd03;
        this.f13249d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new F40(interfaceExecutorServiceC1974Un0, ((C4053qF) this.f13247b).zza(), (PackageInfo) this.f13248c.zzb(), ((C2760ex) this.f13249d).zzb());
    }
}
