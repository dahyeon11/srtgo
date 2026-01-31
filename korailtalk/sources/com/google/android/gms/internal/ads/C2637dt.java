package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.dt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2637dt {

    /* renamed from: a, reason: collision with root package name */
    private long f18695a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f18696b = -1;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2752et f18697c;

    public C2637dt(C2752et c2752et) {
        this.f18697c = c2752et;
    }

    public final long zza() {
        return this.f18696b;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f18695a);
        bundle.putLong("tclose", this.f18696b);
        return bundle;
    }

    public final void zzc() {
        this.f18696b = this.f18697c.f18839a.elapsedRealtime();
    }

    public final void zzd() {
        this.f18695a = this.f18697c.f18839a.elapsedRealtime();
    }
}
