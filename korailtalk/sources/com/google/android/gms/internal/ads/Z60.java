package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Z60 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceExecutorServiceC1974Un0 f17497a;

    /* renamed from: b, reason: collision with root package name */
    final Context f17498b;

    /* renamed from: c, reason: collision with root package name */
    final C3522le f17499c;

    public Z60(C3522le c3522le, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Context context) {
        this.f17499c = c3522le;
        this.f17497a = interfaceExecutorServiceC1974Un0;
        this.f17498b = context;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f17497a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.Y60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2209a70(new JSONObject());
            }
        });
    }
}
