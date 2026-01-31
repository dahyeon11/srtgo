package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.d50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2549d50 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f18512a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f18513b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f18514c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f18515d;

    public C2549d50(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f18512a = xd0;
        this.f18513b = xd02;
        this.f18514c = xd03;
        this.f18515d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final C2320b50 zzb() {
        Context contextZza = ((C2990gx) this.f18512a).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C2320b50(contextZza, interfaceExecutorServiceC1974Un0, ((C4053qF) this.f18514c).zza(), ((C4357sx) this.f18515d).zza());
    }
}
