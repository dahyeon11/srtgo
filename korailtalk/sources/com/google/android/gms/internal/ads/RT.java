package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
final class RT implements YG {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16118a;

    /* renamed from: b, reason: collision with root package name */
    private final C1407Gs f16119b;

    RT(Context context, C1407Gs c1407Gs) {
        this.f16118a = context;
        this.f16119b = c1407Gs;
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdn(C2519cr c2519cr) {
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdo(C1457Ia0 c1457Ia0) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(c1457Ia0.zzb.zzb.zzd)) {
            return;
        }
        this.f16119b.zzm(this.f16118a, c1457Ia0.zza.zza.zzd);
        this.f16119b.zzi(this.f16118a, c1457Ia0.zzb.zzb.zzd);
    }
}
