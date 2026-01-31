package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ob, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1703Ob {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f15130e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    private long f15131a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f15132b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f15133c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15134d = false;

    C1703Ob(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C1621Mb(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static C1703Ob zzd(Context context, Executor executor) {
        return new C1703Ob(context, executor, f15130e);
    }

    public final long zzb() {
        long j8 = this.f15133c;
        this.f15133c = -1L;
        return j8;
    }

    public final long zzc() {
        if (this.f15134d) {
            return this.f15132b - this.f15131a;
        }
        return -1L;
    }

    public final void zzh() {
        if (this.f15134d) {
            this.f15132b = System.currentTimeMillis();
        }
    }
}
