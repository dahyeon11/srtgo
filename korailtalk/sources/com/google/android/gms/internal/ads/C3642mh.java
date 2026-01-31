package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.mh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3642mh {
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e8) {
            L1.n.zzk("", e8);
            return null;
        }
    }
}
