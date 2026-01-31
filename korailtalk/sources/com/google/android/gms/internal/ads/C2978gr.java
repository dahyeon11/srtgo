package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.gr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2978gr {

    /* renamed from: A, reason: collision with root package name */
    private int f19411A;

    /* renamed from: B, reason: collision with root package name */
    private final String f19412B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f19413C;

    /* renamed from: a, reason: collision with root package name */
    private int f19414a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19415b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19416c;

    /* renamed from: d, reason: collision with root package name */
    private int f19417d;

    /* renamed from: e, reason: collision with root package name */
    private int f19418e;

    /* renamed from: f, reason: collision with root package name */
    private int f19419f;

    /* renamed from: g, reason: collision with root package name */
    private String f19420g;

    /* renamed from: h, reason: collision with root package name */
    private int f19421h;

    /* renamed from: i, reason: collision with root package name */
    private int f19422i;

    /* renamed from: j, reason: collision with root package name */
    private int f19423j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19424k;

    /* renamed from: l, reason: collision with root package name */
    private int f19425l;

    /* renamed from: m, reason: collision with root package name */
    private double f19426m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19427n;

    /* renamed from: o, reason: collision with root package name */
    private String f19428o;

    /* renamed from: p, reason: collision with root package name */
    private String f19429p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f19430q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f19431r;

    /* renamed from: s, reason: collision with root package name */
    private final String f19432s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f19433t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f19434u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f19435v;

    /* renamed from: w, reason: collision with root package name */
    private final String f19436w;

    /* renamed from: x, reason: collision with root package name */
    private final String f19437x;

    /* renamed from: y, reason: collision with root package name */
    private float f19438y;

    /* renamed from: z, reason: collision with root package name */
    private int f19439z;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2978gr(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.AbstractC4439th.zza(r7)
            r6.b(r7)
            r6.d(r7)
            r6.c(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = a(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = r3
            goto L24
        L23:
            r2 = r4
        L24:
            r6.f19430q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = a(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = r4
        L30:
            r6.f19431r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f19432s = r2
            G1.u.zzp()
            H1.C0591z.zzb()
            boolean r2 = L1.g.zzs()
            r6.f19433t = r2
            boolean r2 = o2.j.isLatchsky(r7)
            r6.f19434u = r2
            boolean r2 = o2.j.isSidewinder(r7)
            r6.f19435v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f19436w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = a(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L63
        L61:
            r0 = r2
            goto L8a
        L63:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L68
            goto L61
        L68:
            q2.d r3 = q2.e.packageManager(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 == 0) goto L61
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
        L8a:
            r6.f19437x = r0
            q2.d r0 = q2.e.packageManager(r7)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto Lb0
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r4.<init>()     // Catch: java.lang.Exception -> Lb0
            r4.append(r3)     // Catch: java.lang.Exception -> Lb0
            r4.append(r1)     // Catch: java.lang.Exception -> Lb0
            r4.append(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            r6.f19412B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lb9
            goto Lcb
        Lb9:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto Lcb
            float r0 = r7.density
            r6.f19438y = r0
            int r0 = r7.widthPixels
            r6.f19439z = r0
            int r7 = r7.heightPixels
            r6.f19411A = r7
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2978gr.<init>(android.content.Context):void");
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            G1.u.zzo().zzw(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f19414a = audioManager.getMode();
                this.f19415b = audioManager.isMusicActive();
                this.f19416c = audioManager.isSpeakerphoneOn();
                this.f19417d = audioManager.getStreamVolume(3);
                this.f19418e = audioManager.getRingerMode();
                this.f19419f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                G1.u.zzo().zzw(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f19414a = -2;
        this.f19415b = false;
        this.f19416c = false;
        this.f19417d = 0;
        this.f19418e = 2;
        this.f19419f = 0;
    }

    private final void c(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkW)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver == null) {
            this.f19426m = -1.0d;
            this.f19427n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra(androidx.core.app.r.CATEGORY_STATUS, -1);
            this.f19426m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.f19427n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f19420g = r2
            boolean r2 = o2.n.isAtLeastR()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.kh r2 = com.google.android.gms.internal.ads.AbstractC4439th.zziF
            com.google.android.gms.internal.ads.rh r4 = H1.C.zzc()
            java.lang.Object r2 = r4.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f19422i = r2
            int r0 = r0.getPhoneType()
            r5.f19423j = r0
            r0 = -2
            r5.f19421h = r0
            r5.f19424k = r3
            r0 = -1
            r5.f19425l = r0
            G1.u.zzp()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = K1.K0.zzA(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.f19421h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f19425l = r6
            goto L69
        L67:
            r5.f19421h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f19424k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2978gr.d(android.content.Context):void");
    }

    public final C3093hr zza() {
        return new C3093hr(this.f19414a, this.f19430q, this.f19431r, this.f19420g, this.f19432s, this.f19433t, this.f19434u, this.f19435v, this.f19415b, this.f19416c, this.f19436w, this.f19437x, this.f19412B, this.f19417d, this.f19421h, this.f19422i, this.f19423j, this.f19418e, this.f19419f, this.f19438y, this.f19439z, this.f19411A, this.f19426m, this.f19427n, this.f19424k, this.f19425l, this.f19428o, this.f19413C, this.f19429p);
    }

    public C2978gr(Context context, C3093hr c3093hr) {
        AbstractC4439th.zza(context);
        b(context);
        d(context);
        c(context);
        this.f19428o = Build.FINGERPRINT;
        this.f19429p = Build.DEVICE;
        this.f19413C = C1838Rh.zzg(context);
        this.f19430q = c3093hr.zza;
        this.f19431r = c3093hr.zzb;
        this.f19432s = c3093hr.zzd;
        this.f19433t = c3093hr.zze;
        this.f19434u = c3093hr.zzf;
        this.f19435v = c3093hr.zzg;
        this.f19436w = c3093hr.zzh;
        this.f19437x = c3093hr.zzi;
        this.f19412B = c3093hr.zzj;
        this.f19438y = c3093hr.zzm;
        this.f19439z = c3093hr.zzn;
        this.f19411A = c3093hr.zzo;
    }
}
