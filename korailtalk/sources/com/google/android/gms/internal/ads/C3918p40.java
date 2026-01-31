package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.p40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3918p40 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f21629a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f21630b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f21631c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f21632d;

    public C3918p40(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f21629a = xd0;
        this.f21630b = xd02;
        this.f21631c = xd03;
        this.f21632d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final C3690n40 zzb() {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new C3690n40(interfaceExecutorServiceC1974Un0, ((KB) this.f21630b).zza(), (Context) this.f21631c.zzb(), ((VD0) this.f21632d).zzb());
    }
}
