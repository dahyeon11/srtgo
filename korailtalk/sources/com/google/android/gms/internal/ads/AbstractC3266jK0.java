package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.jK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3266jK0 {
    public static EJ0 zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z8) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return EJ0.zza;
        }
        BJ0 bj0 = new BJ0();
        boolean z9 = false;
        if (AbstractC2281am0.zza > 32 && playbackOffloadSupport == 2) {
            z9 = true;
        }
        bj0.zza(true);
        bj0.zzb(z9);
        bj0.zzc(z8);
        return bj0.zzd();
    }
}
