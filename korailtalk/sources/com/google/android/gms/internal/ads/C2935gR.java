package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.gR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2935gR implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final ZQ f19354a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f19355b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f19356c;

    public C2935gR(ZQ zq, XD0 xd0, XD0 xd02) {
        this.f19354a = zq;
        this.f19355b = xd0;
        this.f19356c = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C3391kR c3391kR = (C3391kR) this.f19355b.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setZzg = ZQ.zzg(c3391kR, interfaceExecutorServiceC1974Un0);
        OD0.zzb(setZzg);
        return setZzg;
    }
}
