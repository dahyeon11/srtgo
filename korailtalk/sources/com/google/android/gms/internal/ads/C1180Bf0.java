package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Bf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1180Bf0 {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f12300a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f12301b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f12302c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private AbstractAsyncTaskC1139Af0 f12303d = null;

    public C1180Bf0() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f12300a = linkedBlockingQueue;
        this.f12301b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void a() {
        AbstractAsyncTaskC1139Af0 abstractAsyncTaskC1139Af0 = (AbstractAsyncTaskC1139Af0) this.f12302c.poll();
        this.f12303d = abstractAsyncTaskC1139Af0;
        if (abstractAsyncTaskC1139Af0 != null) {
            abstractAsyncTaskC1139Af0.executeOnExecutor(this.f12301b, new Object[0]);
        }
    }

    public final void zza(AbstractAsyncTaskC1139Af0 abstractAsyncTaskC1139Af0) {
        this.f12303d = null;
        a();
    }

    public final void zzb(AbstractAsyncTaskC1139Af0 abstractAsyncTaskC1139Af0) {
        abstractAsyncTaskC1139Af0.zzb(this);
        this.f12302c.add(abstractAsyncTaskC1139Af0);
        if (this.f12303d == null) {
            a();
        }
    }
}
