package com.google.android.gms.internal.ads;

import R1.C0746z;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.pE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3937pE implements YG, PJ {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC2060Wq f21692a;

    /* renamed from: c, reason: collision with root package name */
    private final Context f21694c;

    /* renamed from: d, reason: collision with root package name */
    private final RunnableC5002yd0 f21695d;

    /* renamed from: e, reason: collision with root package name */
    private final L1.a f21696e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f21697f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21698g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21699h = false;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f21693b = new AtomicBoolean();

    C3937pE(Context context, RunnableC5002yd0 runnableC5002yd0, L1.a aVar, Executor executor) {
        this.f21694c = context;
        this.f21695d = runnableC5002yd0;
        this.f21696e = aVar;
        this.f21697f = executor;
    }

    final /* synthetic */ void a() {
        AbstractC2499ch.zze(this.f21694c);
        this.f21699h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f21693b
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La5
        Lb:
            com.google.android.gms.internal.ads.ai r0 = com.google.android.gms.internal.ads.AbstractC4100qi.zzk
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L68
        L1c:
            com.google.android.gms.internal.ads.ai r0 = com.google.android.gms.internal.ads.AbstractC4100qi.zzl
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L68
        L2c:
            com.google.android.gms.internal.ads.ai r0 = com.google.android.gms.internal.ads.AbstractC4100qi.zzj
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L68
        L3c:
            com.google.android.gms.internal.ads.mt r0 = G1.u.zzo()
            K1.x0 r0 = r0.zzi()
            com.google.android.gms.internal.ads.ft r0 = r0.zzh()
            java.lang.String r0 = r0.zzc()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L60
            goto L1a
        L60:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L68:
            int r3 = r3 + (-1)
            if (r3 == r1) goto L80
            if (r3 == r2) goto L6f
            goto La5
        L6f:
            android.content.Context r0 = r5.f21694c
            com.google.android.gms.internal.ads.yd0 r2 = r5.f21695d
            com.google.android.gms.internal.ads.jn r3 = G1.u.zzf()
            L1.a r4 = L1.a.forPackage()
            com.google.android.gms.internal.ads.tn r0 = r3.zzb(r0, r4, r2)
            goto L90
        L80:
            android.content.Context r0 = r5.f21694c
            com.google.android.gms.internal.ads.yd0 r2 = r5.f21695d
            com.google.android.gms.internal.ads.jn r3 = G1.u.zzf()
            L1.a r4 = L1.a.forPackage()
            com.google.android.gms.internal.ads.tn r0 = r3.zza(r0, r4, r2)
        L90:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.nn r3 = com.google.android.gms.internal.ads.AbstractC4110qn.zza
            com.google.android.gms.internal.ads.in r0 = r0.zza(r2, r3, r3)
            android.content.Context r2 = r5.f21694c
            L1.a r3 = r5.f21696e
            com.google.android.gms.internal.ads.Yq r4 = new com.google.android.gms.internal.ads.Yq
            r4.<init>(r2, r0, r3)
            r5.f21692a = r4
            r5.f21698g = r1
        La5:
            boolean r0 = r5.f21698g
            if (r0 != 0) goto Laa
            goto Ld3
        Laa:
            com.google.android.gms.internal.ads.Wq r0 = r5.f21692a
            if (r0 == 0) goto Ld3
            com.google.common.util.concurrent.C r0 = r0.zza()
            boolean r1 = r5.f21699h
            if (r1 != 0) goto Lce
            com.google.android.gms.internal.ads.ai r1 = com.google.android.gms.internal.ads.AbstractC3189ii.zzi
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lce
            com.google.android.gms.internal.ads.oE r1 = new com.google.android.gms.internal.ads.oE
            r1.<init>()
            java.util.concurrent.Executor r2 = r5.f21697f
            r0.addListener(r1, r2)
        Lce:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.AbstractC5147zt.zza(r0, r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3937pE.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdn(C2519cr c2519cr) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdo(C1457Ia0 c1457Ia0) {
    }

    @Override // com.google.android.gms.internal.ads.PJ
    public final void zze(C0746z c0746z) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.PJ
    public final void zzf(String str) {
        zzd();
    }
}
