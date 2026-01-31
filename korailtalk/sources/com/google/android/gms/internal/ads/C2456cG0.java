package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2456cG0 {

    /* renamed from: a, reason: collision with root package name */
    private long f18276a;

    /* renamed from: b, reason: collision with root package name */
    private float f18277b;

    /* renamed from: c, reason: collision with root package name */
    private long f18278c;

    public C2456cG0() {
        this.f18276a = -9223372036854775807L;
        this.f18277b = -3.4028235E38f;
        this.f18278c = -9223372036854775807L;
    }

    public final C2456cG0 zzd(long j8) {
        boolean z8 = true;
        if (j8 < 0) {
            if (j8 == -9223372036854775807L) {
                j8 = -9223372036854775807L;
            } else {
                z8 = false;
            }
        }
        F10.zzd(z8);
        this.f18278c = j8;
        return this;
    }

    public final C2456cG0 zze(long j8) {
        this.f18276a = j8;
        return this;
    }

    public final C2456cG0 zzf(float f8) {
        boolean z8 = true;
        if (f8 <= 0.0f && f8 != -3.4028235E38f) {
            z8 = false;
        }
        F10.zzd(z8);
        this.f18277b = f8;
        return this;
    }

    public final C2685eG0 zzg() {
        return new C2685eG0(this, null);
    }

    /* synthetic */ C2456cG0(C2685eG0 c2685eG0, AbstractC2342bG0 abstractC2342bG0) {
        this.f18276a = c2685eG0.zza;
        this.f18277b = c2685eG0.zzb;
        this.f18278c = c2685eG0.zzc;
    }
}
