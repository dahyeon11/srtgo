package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;

/* renamed from: com.google.android.gms.internal.ads.s60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4263s60 {
    private static boolean a(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static void zza(boolean z8, String str) throws R50 {
        if (!z8) {
            throw new R50(str);
        }
    }

    public static boolean zzb(Context context) {
        int i8 = AbstractC2281am0.zza;
        if (i8 < 24) {
            return false;
        }
        if (i8 < 26 && ("samsung".equals(AbstractC2281am0.zzc) || "XT1650".equals(AbstractC2281am0.zzd))) {
            return false;
        }
        if (i8 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return a("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzc() {
        return a("EGL_KHR_surfaceless_context");
    }
}
