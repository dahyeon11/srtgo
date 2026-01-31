package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.dl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2622dl {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18671a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18672b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f18673c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f18674d = new AtomicBoolean(false);

    public final synchronized float zza() {
        return this.f18673c;
    }

    public final synchronized void zzb(boolean z8, float f8) {
        this.f18672b = z8;
        this.f18673c = f8;
    }

    public final synchronized void zzc(boolean z8) {
        this.f18671a = z8;
        this.f18674d.set(true);
    }

    public final synchronized boolean zzd() {
        return this.f18672b;
    }

    public final synchronized boolean zze(boolean z8) {
        if (!this.f18674d.get()) {
            return z8;
        }
        return this.f18671a;
    }
}
