package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.google.android.gms.internal.ads.or, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3890or extends ContextWrapper {
    public static Context zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
