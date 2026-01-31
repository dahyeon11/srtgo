package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.o20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3800o20 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f21399a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private C3686n20 f21400b;

    final C3686n20 a() {
        return this.f21400b;
    }

    final void b(C3686n20 c3686n20) {
        this.f21400b = c3686n20;
    }

    public final void zzc(boolean z8) {
        this.f21399a.set(true);
    }

    public final boolean zzd() {
        return this.f21399a.get();
    }
}
