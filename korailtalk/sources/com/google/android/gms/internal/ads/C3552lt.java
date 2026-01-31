package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3552lt {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20780a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f20782c = 1;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f20781b = 0;

    /* synthetic */ C3552lt(AbstractC3438kt abstractC3438kt) {
    }

    public final void zza() {
        long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
        synchronized (this.f20780a) {
            try {
                if (this.f20782c == 3) {
                    if (this.f20781b + ((Long) H1.C.zzc().zza(AbstractC4439th.zzgg)).longValue() <= jCurrentTimeMillis) {
                        this.f20782c = 1;
                    }
                }
            } finally {
            }
        }
        long jCurrentTimeMillis2 = G1.u.zzB().currentTimeMillis();
        synchronized (this.f20780a) {
            try {
                if (this.f20782c != 2) {
                    return;
                }
                this.f20782c = 3;
                if (this.f20782c == 3) {
                    this.f20781b = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
