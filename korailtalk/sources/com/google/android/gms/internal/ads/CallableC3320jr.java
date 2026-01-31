package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.jr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC3320jr implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f20319a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3548lr f20320b;

    CallableC3320jr(C3548lr c3548lr, Context context) {
        this.f20319a = context;
        this.f20320b = c3548lr;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.lr r0 = r5.f20320b
            java.util.WeakHashMap r0 = com.google.android.gms.internal.ads.C3548lr.a(r0)
            android.content.Context r1 = r5.f20319a
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.kr r0 = (com.google.android.gms.internal.ads.C3434kr) r0
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.ai r1 = com.google.android.gms.internal.ads.AbstractC2730ei.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = r0.zza
            long r3 = r3 + r1
            o2.f r1 = G1.u.zzB()
            long r1 = r1.currentTimeMillis()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L3a
        L2c:
            android.content.Context r1 = r5.f20319a
            com.google.android.gms.internal.ads.hr r0 = r0.zzb
            com.google.android.gms.internal.ads.gr r2 = new com.google.android.gms.internal.ads.gr
            r2.<init>(r1, r0)
            com.google.android.gms.internal.ads.hr r0 = r2.zza()
            goto L45
        L3a:
            android.content.Context r0 = r5.f20319a
            com.google.android.gms.internal.ads.gr r1 = new com.google.android.gms.internal.ads.gr
            r1.<init>(r0)
            com.google.android.gms.internal.ads.hr r0 = r1.zza()
        L45:
            com.google.android.gms.internal.ads.lr r1 = r5.f20320b
            android.content.Context r2 = r5.f20319a
            java.util.WeakHashMap r3 = com.google.android.gms.internal.ads.C3548lr.a(r1)
            com.google.android.gms.internal.ads.kr r4 = new com.google.android.gms.internal.ads.kr
            r4.<init>(r1, r0)
            r3.put(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CallableC3320jr.call():java.lang.Object");
    }
}
