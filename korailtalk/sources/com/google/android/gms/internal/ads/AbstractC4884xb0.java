package com.google.android.gms.internal.ads;

import I2.AbstractC0608l;
import android.content.Context;
import i2.AbstractC5683p;

/* renamed from: com.google.android.gms.internal.ads.xb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4884xb0 {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC0608l f23764a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f23765b = new Object();
    public static X1.b zzb;

    public static AbstractC0608l zza(Context context) {
        AbstractC0608l abstractC0608l;
        zzb(context, false);
        synchronized (f23765b) {
            abstractC0608l = f23764a;
        }
        return abstractC0608l;
    }

    public static void zzb(Context context, boolean z8) {
        synchronized (f23765b) {
            try {
                if (zzb == null) {
                    zzb = X1.a.getClient(context);
                }
                AbstractC0608l abstractC0608l = f23764a;
                if (abstractC0608l == null || ((abstractC0608l.isComplete() && !f23764a.isSuccessful()) || (z8 && f23764a.isComplete()))) {
                    f23764a = ((X1.b) AbstractC5683p.checkNotNull(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
