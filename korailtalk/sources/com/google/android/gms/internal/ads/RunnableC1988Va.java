package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Va, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1988Va implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2029Wa f16870a;

    RunnableC1988Va(C2029Wa c2029Wa) {
        this.f16870a = c2029Wa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f16870a.f17016b != null) {
            return;
        }
        synchronized (C2029Wa.f17012c) {
            if (this.f16870a.f17016b != null) {
                return;
            }
            boolean z8 = false;
            try {
                zBooleanValue = ((Boolean) AbstractC4439th.zzcy.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    C2029Wa.f17013d = C2271ah0.zzb(this.f16870a.f17015a.f12813a, "ADSHIELD", null);
                    z8 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z8 = zBooleanValue;
            }
            this.f16870a.f17016b = Boolean.valueOf(z8);
            C2029Wa.f17012c.open();
        }
    }
}
