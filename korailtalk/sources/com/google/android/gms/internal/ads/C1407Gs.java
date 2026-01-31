package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Gs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1407Gs {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f13203a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f13204b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f13205c = null;

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f13206d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f13207e = new AtomicInteger(-1);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f13208f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f13209g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentMap f13210h = new ConcurrentHashMap(9);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f13211i = new AtomicReference(null);

    /* renamed from: j, reason: collision with root package name */
    private final BlockingQueue f13212j = new ArrayBlockingQueue(20);

    /* renamed from: k, reason: collision with root package name */
    private final Object f13213k = new Object();

    static final boolean b(Context context) throws NoSuchFieldException, ClassNotFoundException {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzai)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) H1.C.zzc().zza(AbstractC4439th.zzaj)).intValue()) {
            return false;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzak)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object c(String str, Context context) throws NoSuchMethodException, SecurityException {
        if (!h(context, "com.google.android.gms.measurement.AppMeasurement", this.f13208f, true)) {
            return null;
        }
        try {
            return d(context, str).invoke(this.f13208f.get(), null);
        } catch (Exception unused) {
            g(str, true);
            return null;
        }
    }

    private final Method d(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = (Method) this.f13210h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.f13210h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            g(str, false);
            return null;
        }
    }

    private final void e(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (h(context, "com.google.android.gms.measurement.AppMeasurement", this.f13208f, true)) {
            Method declaredMethod = (Method) this.f13210h.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f13210h.put(str2, declaredMethod);
                } catch (Exception unused) {
                    g(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f13208f.get(), str);
                AbstractC0667v0.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                g(str2, false);
            }
        }
    }

    private final void f(Context context, String str, String str2, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e8) {
                L1.n.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e8);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (h(context, "com.google.android.gms.measurement.AppMeasurement", this.f13208f, true)) {
                Method declaredMethod = (Method) this.f13210h.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f13210h.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        g("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f13208f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    g("logEventInternal", true);
                }
            }
        }
    }

    private final void g(String str, boolean z8) {
        if (this.f13206d.get()) {
            return;
        }
        L1.n.zzj("Invoke Firebase method " + str + " error.");
        if (z8) {
            L1.n.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f13206d.set(true);
        }
    }

    private final boolean h(Context context, String str, AtomicReference atomicReference, boolean z8) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            AbstractC1284Ds.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            g("getInstance", z8);
            return false;
        }
    }

    final /* synthetic */ String a(Context context) {
        return (String) c("getAppInstanceId", context);
    }

    public final String zza(Context context) {
        Object objC;
        if (zzp(context) && (objC = c("generateEventId", context)) != null) {
            return objC.toString();
        }
        return null;
    }

    public final String zzb(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!zzp(context)) {
            return null;
        }
        long jLongValue = ((Long) H1.C.zzc().zza(AbstractC4439th.zzag)).longValue();
        if (jLongValue < 0) {
            return (String) c("getAppInstanceId", context);
        }
        if (this.f13203a.get() == null) {
            if (o2.e.isPackageSide()) {
                threadPoolExecutor = AbstractC1594Lh0.zza().zzc(((Integer) H1.C.zzc().zza(AbstractC4439th.zzah)).intValue(), new ThreadFactoryC1366Fs(this), 2);
            } else {
                AbstractC3414kh abstractC3414kh = AbstractC4439th.zzah;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) H1.C.zzc().zza(abstractC3414kh)).intValue(), ((Integer) H1.C.zzc().zza(abstractC3414kh)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC1366Fs(this));
            }
            AbstractC1284Ds.zza(this.f13203a, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.f13203a.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.Es
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.a(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzc(Context context) {
        if (zzp(context) && h(context, "com.google.android.gms.measurement.AppMeasurement", this.f13208f, true)) {
            try {
                String str = (String) d(context, "getCurrentScreenName").invoke(this.f13208f.get(), null);
                if (str == null) {
                    str = (String) d(context, "getCurrentScreenClass").invoke(this.f13208f.get(), null);
                }
                return str == null ? "" : str;
            } catch (Exception unused) {
                g("getCurrentScreenName", false);
            }
        }
        return "";
    }

    public final String zzd(Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.f13204b) {
            try {
                String str = this.f13205c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) c("getGmpAppId", context);
                this.f13205c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context)) {
            e(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzg(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context)) {
            e(context, str, "endAdUnitExposure");
        }
    }

    public final void zzh(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f(context, "_aa", str, null);
    }

    public final void zzi(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f(context, "_aq", str, null);
    }

    public final void zzj(Context context, String str, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str2 : map.keySet()) {
                bundle.putString(str2, (String) map.get(str2));
            }
        }
        f(context, "_ac", str, bundle);
    }

    public final void zzk(Context context, String str, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str2 : map.keySet()) {
                bundle.putString(str2, (String) map.get(str2));
            }
        }
        f(context, "_ai", str, bundle);
    }

    public final void zzl(Context context, String str, String str2, String str3, int i8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i8);
            f(context, "_ar", str, bundle);
            AbstractC0667v0.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i8);
        }
    }

    public final void zzm(Context context, H1.Y1 y12) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzan)).booleanValue() && zzp(context) && b(context)) {
            synchronized (this.f13213k) {
            }
        }
    }

    public final void zzn(Context context, H1.M1 m12) {
        AbstractC1448Hs.zzd(context).b().zzc(m12);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzan)).booleanValue() && zzp(context) && b(context)) {
            synchronized (this.f13213k) {
            }
        }
    }

    @Deprecated
    public final void zzo(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context) && (context instanceof Activity) && h(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f13209g, false)) {
            Method declaredMethod = (Method) this.f13210h.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.f13210h.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    g("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f13209g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                g("setCurrentScreen", false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzp(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzaa
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f13206d
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzal
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f13207e
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            H1.C0591z.zzb()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = L1.g.zzt(r5, r0)
            if (r0 != 0) goto L59
            H1.C0591z.zzb()
            boolean r5 = L1.g.zzu(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            L1.n.zzj(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f13207e
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f13207e
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f13207e
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1407Gs.zzp(android.content.Context):boolean");
    }
}
