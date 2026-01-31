package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.hK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3038hK0 {
    public static EJ0 zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z8) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return EJ0.zza;
        }
        BJ0 bj0 = new BJ0();
        bj0.zza(true);
        bj0.zzc(z8);
        return bj0.zzd();
    }
}
