package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0667v0;
import K1.InterfaceC0671x0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.mt */
/* loaded from: classes2.dex */
public final class C3666mt {

    /* renamed from: a */
    private final Object f21016a = new Object();

    /* renamed from: b */
    private final K1.A0 f21017b;

    /* renamed from: c */
    private final C4122qt f21018c;

    /* renamed from: d */
    private boolean f21019d;

    /* renamed from: e */
    private Context f21020e;

    /* renamed from: f */
    private L1.a f21021f;

    /* renamed from: g */
    private String f21022g;

    /* renamed from: h */
    private C5009yh f21023h;

    /* renamed from: i */
    private Boolean f21024i;

    /* renamed from: j */
    private final AtomicInteger f21025j;

    /* renamed from: k */
    private final AtomicInteger f21026k;

    /* renamed from: l */
    private final C3552lt f21027l;

    /* renamed from: m */
    private final Object f21028m;

    /* renamed from: n */
    private com.google.common.util.concurrent.C f21029n;

    /* renamed from: o */
    private final AtomicBoolean f21030o;

    public C3666mt() {
        K1.A0 a02 = new K1.A0();
        this.f21017b = a02;
        this.f21018c = new C4122qt(C0591z.zzd(), a02);
        this.f21019d = false;
        this.f21023h = null;
        this.f21024i = null;
        this.f21025j = new AtomicInteger(0);
        this.f21026k = new AtomicInteger(0);
        this.f21027l = new C3552lt(null);
        this.f21028m = new Object();
        this.f21030o = new AtomicBoolean();
    }

    final /* synthetic */ ArrayList e() {
        Context contextZza = AbstractC3890or.zza(this.f21020e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = q2.e.packageManager(contextZza).getPackageInfo(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i8 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i8] & 2) != 0) {
                        arrayList.add(strArr[i8]);
                    }
                    i8++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final boolean zzA(Context context) {
        if (o2.n.isAtLeastO()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzix)).booleanValue()) {
                return this.f21030o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final int zza() {
        return this.f21026k.get();
    }

    public final int zzb() {
        return this.f21025j.get();
    }

    public final Context zzd() {
        return this.f21020e;
    }

    public final Resources zze() {
        if (this.f21021f.isClientJar) {
            return this.f21020e.getResources();
        }
        try {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkQ)).booleanValue()) {
                return L1.r.zza(this.f21020e).getResources();
            }
            L1.r.zza(this.f21020e).getResources();
            return null;
        } catch (L1.q e8) {
            L1.n.zzk("Cannot load resource from dynamite apk or local jar", e8);
            return null;
        }
    }

    public final C5009yh zzg() {
        C5009yh c5009yh;
        synchronized (this.f21016a) {
            c5009yh = this.f21023h;
        }
        return c5009yh;
    }

    public final C4122qt zzh() {
        return this.f21018c;
    }

    public final InterfaceC0671x0 zzi() {
        K1.A0 a02;
        synchronized (this.f21016a) {
            a02 = this.f21017b;
        }
        return a02;
    }

    public final com.google.common.util.concurrent.C zzk() {
        if (this.f21020e != null) {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcJ)).booleanValue()) {
                synchronized (this.f21028m) {
                    try {
                        com.google.common.util.concurrent.C c9 = this.f21029n;
                        if (c9 != null) {
                            return c9;
                        }
                        com.google.common.util.concurrent.C cZzb = AbstractC4805wt.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.gt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.zza.e();
                            }
                        });
                        this.f21029n = cZzb;
                        return cZzb;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return AbstractC1483In0.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.f21016a) {
            bool = this.f21024i;
        }
        return bool;
    }

    public final String zzn() {
        return this.f21022g;
    }

    public final void zzq() {
        this.f21027l.zza();
    }

    public final void zzr() {
        this.f21025j.decrementAndGet();
    }

    public final void zzs() {
        this.f21026k.incrementAndGet();
    }

    public final void zzt() {
        this.f21025j.incrementAndGet();
    }

    public final void zzu(Context context, L1.a aVar) {
        C5009yh c5009yh;
        synchronized (this.f21016a) {
            try {
                if (!this.f21019d) {
                    this.f21020e = context.getApplicationContext();
                    this.f21021f = aVar;
                    G1.u.zzb().zzc(this.f21018c);
                    this.f21017b.zzs(this.f21020e);
                    C4116qq.zzb(this.f21020e, this.f21021f);
                    G1.u.zze();
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbY)).booleanValue()) {
                        c5009yh = new C5009yh();
                    } else {
                        AbstractC0667v0.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c5009yh = null;
                    }
                    this.f21023h = c5009yh;
                    if (c5009yh != null) {
                        AbstractC5147zt.zza(new C3097ht(this).zzb(), "AppState.registerCsiReporter");
                    }
                    if (o2.n.isAtLeastO()) {
                        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzix)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new C3324jt(this));
                            } catch (RuntimeException e8) {
                                L1.n.zzk("Failed to register network callback", e8);
                                this.f21030o.set(true);
                            }
                        }
                    }
                    this.f21019d = true;
                    zzk();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G1.u.zzp().zzc(context, aVar.afmaVersion);
    }

    public final void zzv(Throwable th, String str) {
        C4116qq.zzb(this.f21020e, this.f21021f).zzi(th, str, ((Double) AbstractC5125zi.zzg.zze()).floatValue());
    }

    public final void zzw(Throwable th, String str) {
        C4116qq.zzb(this.f21020e, this.f21021f).zzh(th, str);
    }

    public final void zzx(Throwable th, String str) {
        C4116qq.zzd(this.f21020e, this.f21021f).zzh(th, str);
    }

    public final void zzy(Boolean bool) {
        synchronized (this.f21016a) {
            this.f21024i = bool;
        }
    }

    public final void zzz(String str) {
        this.f21022g = str;
    }
}
