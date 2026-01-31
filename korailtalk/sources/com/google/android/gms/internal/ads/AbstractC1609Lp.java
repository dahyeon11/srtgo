package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Lp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1609Lp {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f14353a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private static String f14354b = "media3.common";

    public static synchronized String zza() {
        return f14354b;
    }

    public static synchronized void zzb(String str) {
        if (f14353a.add(str)) {
            f14354b = f14354b + ", " + str;
        }
    }
}
