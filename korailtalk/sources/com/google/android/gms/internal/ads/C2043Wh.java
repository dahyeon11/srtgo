package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Wh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2043Wh implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f17049a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f17050b;

    public C2043Wh(XD0 xd0, XD0 xd02) {
        this.f17049a = xd0;
        this.f17050b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final C2002Vh zzb() {
        return new C2002Vh((ScheduledExecutorService) this.f17049a.zzb(), (R1.K) this.f17050b.zzb());
    }
}
