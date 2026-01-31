package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.fR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2820fR implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final ZQ f19184a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f19185b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f19186c;

    public C2820fR(ZQ zq, XD0 xd0, XD0 xd02) {
        this.f19184a = zq;
        this.f19185b = xd0;
        this.f19186c = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C3391kR c3391kR = (C3391kR) this.f19185b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setZzf = ZQ.zzf(c3391kR, interfaceExecutorServiceC1974Un0);
        OD0.zzb(setZzf);
        return setZzf;
    }
}
