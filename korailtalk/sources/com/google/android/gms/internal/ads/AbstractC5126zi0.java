package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.zi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5126zi0 {
    public static InterfaceC5012yi0 zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new C1145Ai0(new C1391Gi0(context));
    }
}
