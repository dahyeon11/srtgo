package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.internal.ads.nf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3753nf0 {

    /* renamed from: a, reason: collision with root package name */
    private static int f21330a = 2;

    public static void zza(Context context) {
        context.registerReceiver(new C3639mf0(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (AbstractC3184if0.zza() != EnumC5118ze0.CTV) {
            return 2;
        }
        return f21330a;
    }
}
