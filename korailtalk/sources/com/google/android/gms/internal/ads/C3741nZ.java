package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.nZ */
/* loaded from: classes2.dex */
public final class C3741nZ implements InterfaceC3997pn0 {

    /* renamed from: a */
    private final C2263ad0 f21305a;

    /* renamed from: b */
    private final BF f21306b;

    /* renamed from: c */
    private final C3409ke0 f21307c;

    /* renamed from: d */
    private final C3865oe0 f21308d;

    /* renamed from: e */
    private final Executor f21309e;

    /* renamed from: f */
    private final ScheduledExecutorService f21310f;

    /* renamed from: g */
    private final InterfaceC2335bD f21311g;

    /* renamed from: h */
    private final C2943gZ f21312h;

    /* renamed from: i */
    private final C3739nX f21313i;

    /* renamed from: j */
    private final Context f21314j;

    /* renamed from: k */
    private final RunnableC4660vd0 f21315k;

    /* renamed from: l */
    private final PY f21316l;

    /* renamed from: m */
    private final FQ f21317m;

    C3741nZ(Context context, C2263ad0 c2263ad0, C2943gZ c2943gZ, BF bf, C3409ke0 c3409ke0, C3865oe0 c3865oe0, InterfaceC2335bD interfaceC2335bD, Executor executor, ScheduledExecutorService scheduledExecutorService, C3739nX c3739nX, RunnableC4660vd0 runnableC4660vd0, PY py, FQ fq) {
        this.f21314j = context;
        this.f21305a = c2263ad0;
        this.f21312h = c2943gZ;
        this.f21306b = bf;
        this.f21307c = c3409ke0;
        this.f21308d = c3865oe0;
        this.f21311g = interfaceC2335bD;
        this.f21309e = executor;
        this.f21310f = scheduledExecutorService;
        this.f21313i = c3739nX;
        this.f21315k = runnableC4660vd0;
        this.f21316l = py;
        this.f21317m = fq;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String b(com.google.android.gms.internal.ads.C1457Ia0 r5) {
        /*
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzfC
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.Ha0 r2 = r5.zzb
            com.google.android.gms.internal.ads.ya0 r2 = r2.zzb
            int r2 = r2.zze
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.kh r2 = com.google.android.gms.internal.ads.AbstractC4439th.zzfB
            com.google.android.gms.internal.ads.rh r3 = H1.C.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            com.google.android.gms.internal.ads.Ha0 r5 = r5.zzb
            com.google.android.gms.internal.ads.ya0 r5 = r5.zzb
            com.google.android.gms.internal.ads.xa0 r5 = r5.zzi
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.zza()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3741nZ.b(com.google.android.gms.internal.ads.Ia0):java.lang.String");
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(C4654va0 c4654va0, C1457Ia0 c1457Ia0, InterfaceC3171iX interfaceC3171iX, Throwable th) {
        InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(this.f21314j, EnumC1217Cd0.CUI_NAME_ADREQUEST_MEDIATION_ADAPTER);
        interfaceC3407kd0Zza.zze(c4654va0.zzF);
        interfaceC3407kd0Zza.zzj();
        com.google.common.util.concurrent.C cZzo = AbstractC1483In0.zzo(interfaceC3171iX.zza(c1457Ia0, c4654va0), c4654va0.zzS, TimeUnit.MILLISECONDS, this.f21310f);
        this.f21312h.e(c1457Ia0, c4654va0, cZzo, this.f21307c);
        AbstractC4546ud0.zzb(cZzo, this.f21315k, interfaceC3407kd0Zza);
        return cZzo;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x008b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.common.util.concurrent.C zza(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3741nZ.zza(java.lang.Object):com.google.common.util.concurrent.C");
    }
}
