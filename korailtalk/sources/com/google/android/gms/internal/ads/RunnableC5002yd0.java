package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import f2.C5398h;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.yd0 */
/* loaded from: classes2.dex */
public final class RunnableC5002yd0 implements Runnable {
    public static Boolean zzb;

    /* renamed from: a */
    private final Context f23970a;

    /* renamed from: b */
    private final L1.a f23971b;

    /* renamed from: e */
    private int f23974e;

    /* renamed from: f */
    private final C4756wP f23975f;

    /* renamed from: g */
    private final List f23976g;

    /* renamed from: i */
    private final C5104zV f23978i;

    /* renamed from: j */
    private final C3662mr f23979j;
    public static final Object zza = new Object();

    /* renamed from: k */
    private static final Object f23968k = new Object();

    /* renamed from: l */
    private static final Object f23969l = new Object();

    /* renamed from: c */
    private final C1790Qd0 f23972c = C1913Td0.zzc();

    /* renamed from: d */
    private String f23973d = "";

    /* renamed from: h */
    private boolean f23977h = false;

    public RunnableC5002yd0(Context context, L1.a aVar, C4756wP c4756wP, C5104zV c5104zV, C3662mr c3662mr) {
        this.f23970a = context;
        this.f23971b = aVar;
        this.f23975f = c4756wP;
        this.f23978i = c5104zV;
        this.f23979j = c3662mr;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziQ)).booleanValue()) {
            this.f23976g = K1.K0.zzd();
        } else {
            this.f23976g = AbstractC2394bl0.zzm();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) AbstractC3302ji.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) AbstractC3302ji.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    final /* synthetic */ void a(C3863od0 c3863od0) {
        synchronized (f23969l) {
            try {
                if (!this.f23977h) {
                    this.f23977h = true;
                    if (zza()) {
                        try {
                            G1.u.zzp();
                            this.f23973d = K1.K0.zzp(this.f23970a);
                        } catch (RemoteException e8) {
                            G1.u.zzo().zzw(e8, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.f23974e = C5398h.getInstance().getApkVersion(this.f23970a);
                        int iIntValue = ((Integer) H1.C.zzc().zza(AbstractC4439th.zziL)).intValue();
                        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlP)).booleanValue()) {
                            long j8 = iIntValue;
                            AbstractC4805wt.zzd.scheduleWithFixedDelay(this, j8, j8, TimeUnit.MILLISECONDS);
                        } else {
                            long j9 = iIntValue;
                            AbstractC4805wt.zzd.scheduleAtFixedRate(this, j9, j9, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && c3863od0 != null) {
            synchronized (f23968k) {
                try {
                    if (this.f23972c.zza() >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zziM)).intValue()) {
                        return;
                    }
                    C1135Ad0 c1135Ad0Zza = C1708Od0.zza();
                    c1135Ad0Zza.zzk(c3863od0.zzd());
                    c1135Ad0Zza.zzu(c3863od0.zzo());
                    c1135Ad0Zza.zzh(c3863od0.zzb());
                    c1135Ad0Zza.zzn(EnumC1504Jd0.OS_ANDROID);
                    c1135Ad0Zza.zzr(this.f23971b.afmaVersion);
                    c1135Ad0Zza.zzb(this.f23973d);
                    c1135Ad0Zza.zzo(Build.VERSION.RELEASE);
                    c1135Ad0Zza.zzv(Build.VERSION.SDK_INT);
                    c1135Ad0Zza.zzm(c3863od0.zzf());
                    c1135Ad0Zza.zzl(c3863od0.zza());
                    c1135Ad0Zza.zzf(this.f23974e);
                    c1135Ad0Zza.zze(c3863od0.zze());
                    c1135Ad0Zza.zzc(c3863od0.zzh());
                    c1135Ad0Zza.zzg(c3863od0.zzj());
                    c1135Ad0Zza.zzi(c3863od0.zzk());
                    c1135Ad0Zza.zzj(this.f23975f.zzb(c3863od0.zzk()));
                    c1135Ad0Zza.zzp(c3863od0.zzl());
                    c1135Ad0Zza.zzq(c3863od0.zzg());
                    c1135Ad0Zza.zzd(c3863od0.zzi());
                    c1135Ad0Zza.zzw(c3863od0.zzn());
                    c1135Ad0Zza.zzs(c3863od0.zzm());
                    c1135Ad0Zza.zzt(c3863od0.zzc());
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziQ)).booleanValue()) {
                        c1135Ad0Zza.zza(this.f23976g);
                    }
                    C1790Qd0 c1790Qd0 = this.f23972c;
                    C1831Rd0 c1831Rd0Zza = C1872Sd0.zza();
                    c1831Rd0Zza.zza(c1135Ad0Zza);
                    c1790Qd0.zzb(c1831Rd0Zza);
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaV;
        if (zza()) {
            Object obj = f23968k;
            synchronized (obj) {
                try {
                    if (this.f23972c.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrZzaV = ((C1913Td0) this.f23972c.zzbr()).zzaV();
                            this.f23972c.zzc();
                        }
                        new C4990yV(this.f23970a, this.f23971b.afmaVersion, this.f23979j, Binder.getCallingUid()).zza(new C4762wV((String) H1.C.zzc().zza(AbstractC4439th.zziK), 60000, new HashMap(), bArrZzaV, "application/x-protobuf", false));
                    } catch (Exception e8) {
                        if ((e8 instanceof RS) && ((RS) e8).zza() == 3) {
                            return;
                        }
                        G1.u.zzo().zzv(e8, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(final C3863od0 c3863od0) {
        AbstractC4805wt.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.xd0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.a(c3863od0);
            }
        });
    }
}
