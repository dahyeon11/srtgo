package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Fb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1335Fb {

    /* renamed from: a, reason: collision with root package name */
    private long f13043a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f13044b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f13045c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f13046d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f13047e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f13048f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f13049g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f13050h = -1;

    private static DisplayMetrics a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean b(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final long zza() {
        return this.f13049g;
    }

    public final long zzb() {
        return this.f13047e;
    }

    public final long zzc() {
        return this.f13043a;
    }

    public final long zzd() {
        return this.f13045c;
    }

    public final long zze() {
        return this.f13050h;
    }

    public final long zzf() {
        return this.f13048f;
    }

    public final long zzg() {
        return this.f13044b;
    }

    public final long zzh() {
        return this.f13046d;
    }

    public final void zzi() {
        this.f13050h = this.f13049g;
        this.f13049g = SystemClock.uptimeMillis();
    }

    public final void zzj() {
        this.f13044b = this.f13043a;
        this.f13043a = SystemClock.uptimeMillis();
    }

    public final void zzk(Context context, View view) {
        this.f13046d = this.f13045c;
        this.f13045c = SystemClock.uptimeMillis();
        long j8 = this.f13047e;
        if (j8 != -1) {
            this.f13048f = j8;
        }
        DisplayMetrics displayMetricsA = a(context);
        int i8 = displayMetricsA.widthPixels * displayMetricsA.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsA.widthPixels) * Math.min(view.getHeight(), displayMetricsA.heightPixels);
            if (iMin + iMin >= i8 || (iMin == 0 && b(view))) {
                this.f13047e = this.f13045c;
                return;
            }
        }
        this.f13047e = -1L;
    }
}
