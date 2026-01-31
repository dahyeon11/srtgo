package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.ads.vh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4667vh {
    public static Object zza(InterfaceC1843Rj0 interfaceC1843Rj0) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return interfaceC1843Rj0.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
