package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ou, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3896ou {

    /* renamed from: b, reason: collision with root package name */
    private long f21575b;

    /* renamed from: a, reason: collision with root package name */
    private final long f21574a = TimeUnit.MILLISECONDS.toNanos(((Long) H1.C.zzc().zza(AbstractC4439th.zzD)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f21576c = true;

    C3896ou() {
    }

    public final void zza(SurfaceTexture surfaceTexture, final InterfaceC2186Zt interfaceC2186Zt) {
        if (interfaceC2186Zt == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f21576c) {
            long j8 = timestamp - this.f21575b;
            if (Math.abs(j8) < this.f21574a) {
                return;
            }
        }
        this.f21576c = false;
        this.f21575b = timestamp;
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.nu
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2186Zt.zzk();
            }
        });
    }

    public final void zzb() {
        this.f21576c = true;
    }
}
