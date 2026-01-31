package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
final class CK0 {

    /* renamed from: a, reason: collision with root package name */
    private Exception f12516a;

    /* renamed from: b, reason: collision with root package name */
    private long f12517b;

    public CK0(long j8) {
    }

    public final void zza() {
        this.f12516a = null;
    }

    public final void zzb(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f12516a == null) {
            this.f12516a = exc;
            this.f12517b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f12517b) {
            Exception exc2 = this.f12516a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f12516a;
            this.f12516a = null;
            throw exc3;
        }
    }
}
