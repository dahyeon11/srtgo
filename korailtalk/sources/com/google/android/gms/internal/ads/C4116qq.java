package com.google.android.gms.internal.ads;

import H1.C0591z;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.kakao.sdk.common.Constants;
import f2.C5398h;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.qq */
/* loaded from: classes2.dex */
public final class C4116qq implements InterfaceC4343sq {

    /* renamed from: k */
    private static final Object f22011k = new Object();

    /* renamed from: l */
    static InterfaceC4343sq f22012l;

    /* renamed from: m */
    static InterfaceC4343sq f22013m;

    /* renamed from: n */
    static Boolean f22014n;
    public static InterfaceC4343sq zza;

    /* renamed from: a */
    private final Object f22015a;

    /* renamed from: b */
    private final Context f22016b;

    /* renamed from: c */
    private final WeakHashMap f22017c;

    /* renamed from: d */
    private final ExecutorService f22018d;

    /* renamed from: e */
    private final L1.a f22019e;

    /* renamed from: f */
    private final PackageInfo f22020f;

    /* renamed from: g */
    private final String f22021g;

    /* renamed from: h */
    private final String f22022h;

    /* renamed from: i */
    private final AtomicBoolean f22023i;

    /* renamed from: j */
    private boolean f22024j;

    /* JADX WARN: Removed duplicated region for block: B:47:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected C4116qq(android.content.Context r3, L1.a r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f22015a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.f22017c = r0
            com.google.android.gms.internal.ads.AbstractC1594Lh0.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.f22018d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f22023i = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.f22016b = r3
            r2.f22019e = r4
            com.google.android.gms.internal.ads.kh r4 = com.google.android.gms.internal.ads.AbstractC4439th.zzhS
            com.google.android.gms.internal.ads.rh r0 = H1.C.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = L1.g.zza
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L61
        L52:
            q2.d r4 = q2.e.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r2.f22020f = r3
            com.google.android.gms.internal.ads.kh r3 = com.google.android.gms.internal.ads.AbstractC4439th.zzhQ
            com.google.android.gms.internal.ads.rh r4 = H1.C.zzc()
            java.lang.Object r4 = r4.zza(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L80
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L81
        L80:
            r4 = r1
        L81:
            r2.f22021g = r4
            com.google.android.gms.internal.ads.rh r4 = H1.C.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb0
            android.content.Context r3 = r2.f22016b
            android.os.Handler r4 = L1.g.zza
            if (r3 != 0) goto L9a
            goto Lb1
        L9a:
            q2.d r3 = q2.e.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r3 != 0) goto La9
            goto Lb1
        La9:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            goto Lb1
        Lb0:
            r0 = r1
        Lb1:
            r2.f22022h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4116qq.<init>(android.content.Context, L1.a):void");
    }

    private final void b() {
        Thread.setDefaultUncaughtExceptionHandler(new C3888oq(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void c() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f22015a) {
            this.f22017c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C4002pq(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean d() {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmJ)).booleanValue()) {
            if (((Boolean) AbstractC5125zi.zze.zze()).booleanValue()) {
                if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhM)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (f22011k) {
            try {
                if (f22014n == null) {
                    f22014n = Boolean.valueOf(C0591z.zze().nextInt(100) < ((Integer) H1.C.zzc().zza(AbstractC4439th.zzmG)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f22014n.booleanValue()) {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhM)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static InterfaceC4343sq zza(Context context) {
        synchronized (f22011k) {
            try {
                if (zza == null) {
                    if (d()) {
                        zza = new C4116qq(context, L1.a.forPackage());
                    } else {
                        zza = new C4229rq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static InterfaceC4343sq zzb(Context context, L1.a aVar) {
        synchronized (f22011k) {
            try {
                if (f22013m == null) {
                    boolean z8 = false;
                    if (((Boolean) AbstractC3189ii.zzc.zze()).booleanValue()) {
                        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhM)).booleanValue() || ((Boolean) AbstractC3189ii.zza.zze()).booleanValue()) {
                            z8 = true;
                        }
                    }
                    if (d()) {
                        C4116qq c4116qq = new C4116qq(context, aVar);
                        c4116qq.c();
                        c4116qq.b();
                        f22013m = c4116qq;
                    } else if (z8) {
                        C4116qq c4116qq2 = new C4116qq(context, aVar, true);
                        c4116qq2.c();
                        c4116qq2.b();
                        f22013m = c4116qq2;
                    } else {
                        f22013m = new C4229rq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f22013m;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:25:0x0003, B:27:0x0007, B:29:0x0019, B:31:0x002b, B:34:0x0039, B:35:0x0040), top: B:40:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.InterfaceC4343sq zzc(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C4116qq.f22011k
            monitor-enter(r0)
            com.google.android.gms.internal.ads.sq r1 = com.google.android.gms.internal.ads.C4116qq.f22012l     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L40
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzhN     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzhM     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            com.google.android.gms.internal.ads.qq r1 = new com.google.android.gms.internal.ads.qq     // Catch: java.lang.Throwable -> L37
            L1.a r2 = L1.a.forPackage()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C4116qq.f22012l = r1     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r3 = move-exception
            goto L44
        L39:
            com.google.android.gms.internal.ads.rq r3 = new com.google.android.gms.internal.ads.rq     // Catch: java.lang.Throwable -> L37
            r3.<init>()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C4116qq.f22012l = r3     // Catch: java.lang.Throwable -> L37
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.sq r3 = com.google.android.gms.internal.ads.C4116qq.f22012l
            return r3
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4116qq.zzc(android.content.Context):com.google.android.gms.internal.ads.sq");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:25:0x0003, B:27:0x0007, B:29:0x0019, B:31:0x002b, B:34:0x0035, B:35:0x003c), top: B:40:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.InterfaceC4343sq zzd(android.content.Context r3, L1.a r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C4116qq.f22011k
            monitor-enter(r0)
            com.google.android.gms.internal.ads.sq r1 = com.google.android.gms.internal.ads.C4116qq.f22012l     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L3c
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzhN     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzhM     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            com.google.android.gms.internal.ads.qq r1 = new com.google.android.gms.internal.ads.qq     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.C4116qq.f22012l = r1     // Catch: java.lang.Throwable -> L33
            goto L3c
        L33:
            r3 = move-exception
            goto L40
        L35:
            com.google.android.gms.internal.ads.rq r3 = new com.google.android.gms.internal.ads.rq     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.C4116qq.f22012l = r3     // Catch: java.lang.Throwable -> L33
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.sq r3 = com.google.android.gms.internal.ads.C4116qq.f22012l
            return r3
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4116qq.zzd(android.content.Context, L1.a):com.google.android.gms.internal.ads.sq");
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return AbstractC1802Qj0.zzc(L1.g.zzg(zze(th)));
    }

    protected final void a(Thread thread, Throwable th) {
        if (th != null) {
            boolean zZzp = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzp |= L1.g.zzp(stackTraceElement.getClassName());
                    zEquals |= C4116qq.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzp || zEquals) {
                return;
            }
            if (!this.f22024j) {
                zzh(th, "");
            }
            if (this.f22023i.getAndSet(true) || !((Boolean) AbstractC3189ii.zzc.zze()).booleanValue()) {
                return;
            }
            AbstractC2499ch.zzc(this.f22016b);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4343sq
    public final void zzh(Throwable th, String str) {
        if (this.f22024j) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4343sq
    public final void zzi(Throwable th, String str, float f8) {
        Throwable th2;
        String packageName;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo memoryInfoZzc;
        if (this.f22024j) {
            return;
        }
        Handler handler = L1.g.zza;
        boolean zIsCallerInstantApp = false;
        if (((Boolean) AbstractC5125zi.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z8 = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcj)).booleanValue() && stackTrace != null && stackTrace.length == 0 && L1.g.zzp(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (L1.g.zzp(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z8 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z8) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strZze = zze(th);
            String strZzf = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zziP)).booleanValue() ? zzf(th) : "";
            double d9 = f8;
            double dRandom = Math.random();
            int i8 = f8 > 0.0f ? (int) (1.0f / f8) : 1;
            if (dRandom < d9) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    zIsCallerInstantApp = q2.e.packageManager(this.f22016b).isCallerInstantApp();
                } catch (Throwable th4) {
                    L1.n.zzh("Error fetching instant app info", th4);
                }
                try {
                    packageName = this.f22016b.getPackageName();
                } catch (Throwable unused) {
                    L1.n.zzj("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(Constants.SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter(com.kakao.sdk.user.Constants.ID, "gmob-apps-report-exception").appendQueryParameter(Constants.OS, Build.VERSION.RELEASE);
                int i9 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i9));
                String str2 = Build.MANUFACTURER;
                String str3 = Build.MODEL;
                if (!str3.startsWith(str2)) {
                    str3 = str2 + Q7.X.SPACE + str3;
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter(Constants.DEVICE, str3).appendQueryParameter("js", this.f22019e.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze).appendQueryParameter("eids", TextUtils.join(",", H1.C.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "636244245").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i8)).appendQueryParameter("pb_tm", String.valueOf(AbstractC5125zi.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(C5398h.getInstance().getApkVersion(this.f22016b))).appendQueryParameter("lite", true != this.f22019e.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter3.appendQueryParameter("hash", strZzf);
                }
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhR)).booleanValue() && (memoryInfoZzc = L1.g.zzc(this.f22016b)) != null) {
                    builderAppendQueryParameter3.appendQueryParameter("available_memory", Long.toString(memoryInfoZzc.availMem));
                    builderAppendQueryParameter3.appendQueryParameter("total_memory", Long.toString(memoryInfoZzc.totalMem));
                    builderAppendQueryParameter3.appendQueryParameter("is_low_memory", true != memoryInfoZzc.lowMemory ? "0" : "1");
                }
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhQ)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.f22021g)) {
                        builderAppendQueryParameter3.appendQueryParameter("countrycode", this.f22021g);
                    }
                    if (!TextUtils.isEmpty(this.f22022h)) {
                        builderAppendQueryParameter3.appendQueryParameter("psv", this.f22022h);
                    }
                    Context context = this.f22016b;
                    if (i9 >= 26) {
                        packageInfo = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = q2.e.packageManager(context).getPackageInfo("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (packageInfo != null) {
                        builderAppendQueryParameter3.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                        builderAppendQueryParameter3.appendQueryParameter("wvvn", packageInfo.versionName);
                        builderAppendQueryParameter3.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                PackageInfo packageInfo2 = this.f22020f;
                if (packageInfo2 != null) {
                    builderAppendQueryParameter3.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                    builderAppendQueryParameter3.appendQueryParameter("appvn", this.f22020f.versionName);
                }
                arrayList2.add(builderAppendQueryParameter3.toString());
                for (final String str4 : arrayList2) {
                    final L1.s sVar = new L1.s(null);
                    this.f22018d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nq
                        @Override // java.lang.Runnable
                        public final void run() {
                            sVar.zza(str4);
                        }
                    });
                }
            }
        }
    }

    protected C4116qq(Context context, L1.a aVar, boolean z8) {
        this(context, aVar);
        this.f22024j = true;
    }
}
