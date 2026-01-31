package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Yh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2126Yh0 extends AbstractC2044Wh0 {

    /* renamed from: h, reason: collision with root package name */
    private static C2126Yh0 f17409h;

    private C2126Yh0(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final C2126Yh0 zzj(Context context) {
        C2126Yh0 c2126Yh0;
        synchronized (C2126Yh0.class) {
            try {
                if (f17409h == null) {
                    f17409h = new C2126Yh0(context);
                }
                c2126Yh0 = f17409h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2126Yh0;
    }

    public final C2003Vh0 zzh(long j8, boolean z8) {
        C2003Vh0 c2003Vh0B;
        synchronized (C2126Yh0.class) {
            c2003Vh0B = b(null, null, j8, z8);
        }
        return c2003Vh0B;
    }

    public final C2003Vh0 zzi(String str, String str2, long j8, boolean z8) {
        C2003Vh0 c2003Vh0B;
        synchronized (C2126Yh0.class) {
            c2003Vh0B = b(str, str2, j8, z8);
        }
        return c2003Vh0B;
    }

    public final void zzk() {
        synchronized (C2126Yh0.class) {
            f(false);
        }
    }

    public final void zzl() {
        synchronized (C2126Yh0.class) {
            f(true);
        }
    }
}
