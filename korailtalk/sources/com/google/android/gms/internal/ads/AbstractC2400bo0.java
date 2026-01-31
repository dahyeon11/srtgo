package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bo0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2400bo0 {
    static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
