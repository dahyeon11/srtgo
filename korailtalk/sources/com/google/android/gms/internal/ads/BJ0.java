package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class BJ0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12262a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12263b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12264c;

    public final BJ0 zza(boolean z8) {
        this.f12262a = true;
        return this;
    }

    public final BJ0 zzb(boolean z8) {
        this.f12263b = z8;
        return this;
    }

    public final BJ0 zzc(boolean z8) {
        this.f12264c = z8;
        return this;
    }

    public final EJ0 zzd() {
        if (this.f12262a || !(this.f12263b || this.f12264c)) {
            return new EJ0(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
