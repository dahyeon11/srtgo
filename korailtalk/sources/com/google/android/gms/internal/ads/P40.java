package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class P40 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f15198a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f15199b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f15200c;

    public P40(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f15198a = xd0;
        this.f15199b = xd02;
        this.f15200c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final N40 zzb() {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new N40(interfaceExecutorServiceC1974Un0, ((C2990gx) this.f15199b).zza(), (Set) this.f15200c.zzb());
    }
}
