package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* loaded from: classes2.dex */
abstract class KL0 {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f13790a;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9, double d9) {
        if (AbstractC2281am0.zza < 29) {
            return 0;
        }
        Boolean bool = f13790a;
        if (bool == null || !bool.booleanValue()) {
            return JL0.zza(videoCapabilities, i8, i9, d9);
        }
        return 0;
    }
}
