package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Zh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2167Zh0 extends AbstractC2044Wh0 {

    /* renamed from: h, reason: collision with root package name */
    private static C2167Zh0 f17627h;

    private C2167Zh0(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final C2167Zh0 zzi(Context context) {
        C2167Zh0 c2167Zh0;
        synchronized (C2167Zh0.class) {
            try {
                if (f17627h == null) {
                    f17627h = new C2167Zh0(context);
                }
                c2167Zh0 = f17627h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2167Zh0;
    }

    public final C2003Vh0 zzh(long j8, boolean z8) {
        synchronized (C2167Zh0.class) {
            try {
                if (zzo()) {
                    return b(null, null, j8, z8);
                }
                return new C2003Vh0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        synchronized (C2167Zh0.class) {
            try {
                if (g(false)) {
                    f(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzk() throws IOException {
        this.f17057f.e("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.f17057f.e("paidv2_user_option");
    }

    public final void zzm(boolean z8) throws IOException {
        this.f17057f.d("paidv2_user_option", Boolean.valueOf(z8));
    }

    public final void zzn(boolean z8) throws IOException {
        this.f17057f.d("paidv2_publisher_option", Boolean.valueOf(z8));
        if (z8) {
            return;
        }
        zzj();
    }

    public final boolean zzo() {
        return this.f17057f.f("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.f17057f.f("paidv2_user_option", true);
    }
}
