package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: com.google.android.gms.internal.ads.sK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4291sK0 {
    public static void zza(AudioTrack audioTrack, C2577dJ0 c2577dJ0) {
        LogSessionId logSessionIdZza = c2577dJ0.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdZza);
    }
}
