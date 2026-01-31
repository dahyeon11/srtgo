package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;

/* renamed from: com.google.android.gms.internal.ads.Ym, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2135Ym extends C1490It {

    /* renamed from: c, reason: collision with root package name */
    private final Object f17418c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C2626dn f17419d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17420e;

    public C2135Ym(C2626dn c2626dn) {
        this.f17419d = c2626dn;
    }

    public final void zzb() {
        AbstractC0667v0.zza("release: Trying to acquire lock");
        synchronized (this.f17418c) {
            try {
                AbstractC0667v0.zza("release: Lock acquired");
                if (this.f17420e) {
                    AbstractC0667v0.zza("release: Lock already released");
                    return;
                }
                this.f17420e = true;
                zzj(new C2012Vm(this), new C1326Et());
                zzj(new C2053Wm(this), new C2094Xm(this));
                AbstractC0667v0.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
