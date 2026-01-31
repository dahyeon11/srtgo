package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.e60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2665e60 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0671x0 f18729a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18730b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f18731c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f18732d;

    /* renamed from: e, reason: collision with root package name */
    private final C2941gX f18733e;

    /* renamed from: f, reason: collision with root package name */
    private final C1825Ra0 f18734f;

    /* renamed from: g, reason: collision with root package name */
    private final L1.a f18735g;

    C2665e60(InterfaceC0671x0 interfaceC0671x0, Context context, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, ScheduledExecutorService scheduledExecutorService, C2941gX c2941gX, C1825Ra0 c1825Ra0, L1.a aVar) {
        this.f18729a = interfaceC0671x0;
        this.f18730b = context;
        this.f18731c = interfaceExecutorServiceC1974Un0;
        this.f18732d = scheduledExecutorService;
        this.f18733e = c2941gX;
        this.f18734f = c1825Ra0;
        this.f18735g = aVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(final Throwable th) {
        this.f18731c.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.b60
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzku)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    G1.u.zzo().zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    G1.u.zzo().zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return AbstractC1483In0.zzh(th instanceof SecurityException ? new C2895g60("", 2, null) : th instanceof IllegalStateException ? new C2895g60("", 3, null) : th instanceof IllegalArgumentException ? new C2895g60("", 4, null) : th instanceof TimeoutException ? new C2895g60("", 5, null) : new C2895g60("", 0, null));
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.f18730b.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.google.android.gms.internal.ads.N50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.C zzb() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzkt
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lfc
            K1.x0 r0 = r5.f18729a
            boolean r0 = r0.zzT()
            if (r0 == 0) goto Lfc
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzkx
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.Ra0 r0 = r5.f18734f
            y1.x$b r1 = y1.x.b.DISABLED
            int r1 = r1.getValue()
            H1.Y1 r0 = r0.zzd
            int r0 = r0.zzy
            if (r0 == r1) goto Lfc
        L3a:
            L1.a r0 = r5.f18735g
            int r0 = r0.clientJarVersion
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzkr
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfc
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzks
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfc
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzkp
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L77
            goto La0
        L77:
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzkq
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L8a
            goto Lfc
        L8a:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.content.Context r1 = r5.f18730b
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lfc
        La0:
            com.google.android.gms.internal.ads.gX r0 = r5.f18733e     // Catch: java.lang.Exception -> Lc1
            r1 = 0
            com.google.common.util.concurrent.C r0 = r0.zza(r1)     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzkv     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Exception -> Lc1
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lc1
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc1
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.ScheduledExecutorService r4 = r5.f18732d     // Catch: java.lang.Exception -> Lc1
            com.google.common.util.concurrent.C r0 = com.google.android.gms.internal.ads.AbstractC1483In0.zzo(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lc1:
            r0 = move-exception
            com.google.common.util.concurrent.C r0 = com.google.android.gms.internal.ads.AbstractC1483In0.zzg(r0)
        Lc6:
            com.google.android.gms.internal.ads.zn0 r0 = com.google.android.gms.internal.ads.AbstractC5136zn0.zzu(r0)
            com.google.android.gms.internal.ads.c60 r1 = new com.google.android.gms.internal.ads.c60
            r1.<init>()
            com.google.android.gms.internal.ads.Un0 r2 = r5.f18731c
            com.google.common.util.concurrent.C r0 = com.google.android.gms.internal.ads.AbstractC1483In0.zzn(r0, r1, r2)
            com.google.android.gms.internal.ads.d60 r1 = new com.google.android.gms.internal.ads.d60
            r1.<init>()
            com.google.android.gms.internal.ads.Un0 r2 = r5.f18731c
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.common.util.concurrent.C r0 = com.google.android.gms.internal.ads.AbstractC1483In0.zzf(r0, r3, r1, r2)
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzkv
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.f18732d
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.C r0 = com.google.android.gms.internal.ads.AbstractC1483In0.zzo(r0, r1, r4, r3)
            return r0
        Lfc:
            com.google.android.gms.internal.ads.g60 r0 = new com.google.android.gms.internal.ads.g60
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            com.google.common.util.concurrent.C r0 = com.google.android.gms.internal.ads.AbstractC1483In0.zzh(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2665e60.zzb():com.google.common.util.concurrent.C");
    }
}
