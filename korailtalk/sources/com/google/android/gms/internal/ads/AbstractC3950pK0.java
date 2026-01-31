package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.pK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3950pK0 {
    public static void zza(AudioTrack audioTrack, AJ0 aj0) {
        audioTrack.setPreferredDevice(aj0 == null ? null : aj0.zza);
    }
}
