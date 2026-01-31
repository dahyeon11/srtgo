package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class F30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f12916a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f12917b;

    public F30(XD0 xd0, XD0 xd02) {
        this.f12916a = xd0;
        this.f12917b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R40(((C4373t40) this.f12916a).zzb(), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmh)).intValue(), (ScheduledExecutorService) this.f12917b.zzb());
    }
}
