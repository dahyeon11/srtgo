package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class E70 {
    /* JADX WARN: Multi-variable type inference failed */
    public static N50 zza(C3012h70 c3012h70, I40 i40, ScheduledExecutorService scheduledExecutorService, int i8) {
        if (i8 == 0) {
            c3012h70 = i40;
        }
        return new R40(c3012h70, 0L, scheduledExecutorService);
    }

    public static N50 zzb(C4151r70 c4151r70, ScheduledExecutorService scheduledExecutorService) {
        return new R40(c4151r70, ((Long) H1.C.zzc().zza(AbstractC4439th.zzee)).longValue(), scheduledExecutorService);
    }

    public static N50 zzc(N70 n70, ScheduledExecutorService scheduledExecutorService) {
        return new R40(n70, 0L, scheduledExecutorService);
    }
}
