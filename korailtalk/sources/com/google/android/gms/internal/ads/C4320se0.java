package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.se0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4320se0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f22678a;

    final void a(Context context) {
        AbstractC3981pf0.zzc(context, "Application Context cannot be null");
        if (this.f22678a) {
            return;
        }
        this.f22678a = true;
        C2079Xe0.zzb().zzd(context);
        C1710Oe0.zza().zzd(context);
        AbstractC3184if0.zzb(context);
        AbstractC3297jf0.zzd(context);
        AbstractC3753nf0.zza(context);
        C1956Ue0.zzb().zzc(context);
        C1669Ne0.zza().zzd(context);
    }

    final boolean b() {
        return this.f22678a;
    }
}
