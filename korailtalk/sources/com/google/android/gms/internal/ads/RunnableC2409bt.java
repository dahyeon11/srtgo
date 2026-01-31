package com.google.android.gms.internal.ads;

import android.content.Context;
import f2.C5399i;
import f2.C5400j;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.bt */
/* loaded from: classes2.dex */
final class RunnableC2409bt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f18189a;

    /* renamed from: b */
    final /* synthetic */ C1203Bt f18190b;

    RunnableC2409bt(C2523ct c2523ct, Context context, C1203Bt c1203Bt) {
        this.f18189a = context;
        this.f18190b = c1203Bt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18190b.zzc(D1.a.getAdvertisingIdInfo(this.f18189a));
        } catch (C5399i | C5400j | IOException | IllegalStateException e8) {
            this.f18190b.zzd(e8);
            L1.n.zzh("Exception while getting advertising Id info", e8);
        }
    }
}
