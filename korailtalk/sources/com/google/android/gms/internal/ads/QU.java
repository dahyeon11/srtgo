package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class QU implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f15807a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f15808b;

    public QU(XD0 xd0, XD0 xd02) {
        this.f15807a = xd0;
        this.f15808b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final PU zzb() {
        return new PU(((C2990gx) this.f15807a).zza(), (ScheduledExecutorService) this.f15808b.zzb());
    }
}
