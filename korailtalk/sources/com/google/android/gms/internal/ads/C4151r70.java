package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.r70, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4151r70 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f22381a;

    /* renamed from: b, reason: collision with root package name */
    final Context f22382b;

    /* renamed from: c, reason: collision with root package name */
    final C2059Wp f22383c;

    public C4151r70(C2059Wp c2059Wp, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f22383c = c2059Wp;
        this.f22381a = scheduledExecutorService;
        this.f22382b = context;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzm(AbstractC1483In0.zzo(AbstractC1483In0.zzh(new Bundle()), ((Long) H1.C.zzc().zza(AbstractC4439th.zzee)).longValue(), TimeUnit.MILLISECONDS, this.f22381a), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.q70
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return new C4265s70((Bundle) obj);
            }
        }, AbstractC4805wt.zza);
    }
}
