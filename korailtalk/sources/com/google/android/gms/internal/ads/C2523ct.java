package com.google.android.gms.internal.ads;

import H1.C0591z;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ct, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2523ct {
    public final com.google.common.util.concurrent.C zza(Context context, int i8) {
        C1203Bt c1203Bt = new C1203Bt();
        C0591z.zzb();
        if (L1.g.zzu(context)) {
            AbstractC4805wt.zza.execute(new RunnableC2409bt(this, context, c1203Bt));
        }
        return c1203Bt;
    }
}
