package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class N40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f14794a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14795b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f14796c;

    public N40(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Context context, Set set) {
        this.f14794a = interfaceExecutorServiceC1974Un0;
        this.f14795b = context;
        this.f14796c = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.O40 a() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzeZ
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzfk
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r3.f14796c
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L56
        L46:
            android.content.Context r0 = r3.f14795b
            com.google.android.gms.internal.ads.O40 r1 = new com.google.android.gms.internal.ads.O40
            com.google.android.gms.internal.ads.YW r2 = G1.u.zzA()
            java.lang.String r0 = r2.zzf(r0)
            r1.<init>(r0)
            return r1
        L56:
            com.google.android.gms.internal.ads.O40 r0 = new com.google.android.gms.internal.ads.O40
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.N40.a():com.google.android.gms.internal.ads.O40");
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f14794a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.L40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
