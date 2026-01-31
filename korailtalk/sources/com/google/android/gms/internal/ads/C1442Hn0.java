package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Hn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1442Hn0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13361a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2394bl0 f13362b;

    /* synthetic */ C1442Hn0(boolean z8, AbstractC2394bl0 abstractC2394bl0, AbstractC1401Gn0 abstractC1401Gn0) {
        this.f13361a = z8;
        this.f13362b = abstractC2394bl0;
    }

    public final com.google.common.util.concurrent.C zza(Callable callable, Executor executor) {
        return new C4680vn0(this.f13362b, this.f13361a, executor, callable);
    }
}
