package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Yh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2125Yh implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f17405a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f17406b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f17407c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f17408d;

    public C2125Yh(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f17405a = xd0;
        this.f17406b = xd02;
        this.f17407c = xd03;
        this.f17408d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* synthetic */ Object zzb() {
        return new C2084Xh(((C2990gx) this.f17405a).zza(), (ScheduledExecutorService) this.f17406b.zzb(), new C2166Zh(), (RunnableC4660vd0) this.f17408d.zzb());
    }
}
