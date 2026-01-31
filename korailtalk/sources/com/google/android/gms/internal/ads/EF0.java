package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* loaded from: classes2.dex */
abstract class EF0 {
    public static C2577dJ0 zza(Context context, NF0 nf0, boolean z8, String str) {
        ZI0 zi0Zzb = ZI0.zzb(context);
        if (zi0Zzb == null) {
            AbstractC2834fc0.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new C2577dJ0(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z8) {
            nf0.zzz(zi0Zzb);
        }
        return new C2577dJ0(zi0Zzb.zza(), str);
    }
}
