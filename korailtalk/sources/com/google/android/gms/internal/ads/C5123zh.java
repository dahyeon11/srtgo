package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.zh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5123zh {
    public static final void zza(C5009yh c5009yh, C4781wh c4781wh) {
        if (c4781wh.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(c4781wh.b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        c5009yh.zzd(c4781wh.a(), c4781wh.b(), c4781wh.c(), c4781wh.d());
    }
}
