package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ua0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4540ua0 {

    /* renamed from: a, reason: collision with root package name */
    private final o2.f f23075a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f23076b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile int f23078d = 1;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f23077c = 0;

    public C4540ua0(o2.f fVar) {
        this.f23075a = fVar;
    }

    private final void a() {
        long jCurrentTimeMillis = this.f23075a.currentTimeMillis();
        synchronized (this.f23076b) {
            try {
                if (this.f23078d == 3) {
                    if (this.f23077c + ((Long) H1.C.zzc().zza(AbstractC4439th.zzgg)).longValue() <= jCurrentTimeMillis) {
                        this.f23078d = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b(int i8, int i9) {
        a();
        Object obj = this.f23076b;
        long jCurrentTimeMillis = this.f23075a.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f23078d != i8) {
                    return;
                }
                this.f23078d = i9;
                if (this.f23078d == 3) {
                    this.f23077c = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        b(2, 3);
    }

    public final void zzb(boolean z8) {
        if (z8) {
            b(1, 2);
        } else {
            b(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z8;
        synchronized (this.f23076b) {
            a();
            z8 = this.f23078d == 3;
        }
        return z8;
    }

    public final boolean zzd() {
        boolean z8;
        synchronized (this.f23076b) {
            a();
            z8 = this.f23078d == 2;
        }
        return z8;
    }
}
