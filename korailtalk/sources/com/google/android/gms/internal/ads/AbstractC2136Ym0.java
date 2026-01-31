package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.Ym0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2136Ym0 {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j8, Object obj2, Object obj3) {
        while (!AbstractC2095Xm0.a(unsafe, obj, j8, obj2, obj3)) {
            if (unsafe.getObject(obj, j8) != obj2) {
                return false;
            }
        }
        return true;
    }
}
