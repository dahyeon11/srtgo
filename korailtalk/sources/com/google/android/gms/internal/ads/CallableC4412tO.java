package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC4412tO implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final G1.a f22830a;

    /* renamed from: b, reason: collision with root package name */
    private final C3558lw f22831b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f22832c;

    /* renamed from: d, reason: collision with root package name */
    private final LQ f22833d;

    /* renamed from: e, reason: collision with root package name */
    private final C4535uW f22834e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f22835f;

    /* renamed from: g, reason: collision with root package name */
    private final C2487cb f22836g;

    /* renamed from: h, reason: collision with root package name */
    private final L1.a f22837h;

    /* renamed from: i, reason: collision with root package name */
    private final C3865oe0 f22838i;

    /* renamed from: j, reason: collision with root package name */
    private final GW f22839j;

    /* renamed from: k, reason: collision with root package name */
    private final C1989Va0 f22840k;

    public CallableC4412tO(Context context, Executor executor, C2487cb c2487cb, L1.a aVar, G1.a aVar2, C3558lw c3558lw, C4535uW c4535uW, C3865oe0 c3865oe0, LQ lq, GW gw, C1989Va0 c1989Va0) {
        this.f22832c = context;
        this.f22835f = executor;
        this.f22836g = c2487cb;
        this.f22837h = aVar;
        this.f22830a = aVar2;
        this.f22831b = c3558lw;
        this.f22834e = c4535uW;
        this.f22838i = c3865oe0;
        this.f22833d = lq;
        this.f22839j = gw;
        this.f22840k = c1989Va0;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C4754wO c4754wO = new C4754wO(this);
        c4754wO.zzk();
        return c4754wO;
    }
}
