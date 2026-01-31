package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class P7 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f15214a;

    public P7(Handler handler) {
        this.f15214a = new N7(this, handler);
    }

    public final void zza(Z7 z72, C2898g8 c2898g8) {
        z72.zzm("post-error");
        ((N7) this.f15214a).f14801a.post(new O7(z72, C2554d8.zza(c2898g8), null));
    }

    public final void zzb(Z7 z72, C2554d8 c2554d8, Runnable runnable) {
        z72.zzq();
        z72.zzm("post-response");
        ((N7) this.f15214a).f14801a.post(new O7(z72, c2554d8, runnable));
    }
}
