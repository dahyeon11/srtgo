package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes2.dex */
abstract class X {
    public static void zza(Surface surface, float f8) {
        try {
            surface.setFrameRate(f8, f8 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e8) {
            AbstractC2834fc0.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e8);
        }
    }
}
