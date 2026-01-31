package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* loaded from: classes2.dex */
abstract class ML0 {
    public static void zza(C4977yL0 c4977yL0, C2577dJ0 c2577dJ0) {
        LogSessionId logSessionIdZza = c2577dJ0.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c4977yL0.zzb.setString("log-session-id", logSessionIdZza.getStringId());
    }
}
