package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class H60 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13278a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13279b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f13280c;

    public H60(InterfaceC2748er interfaceC2748er, Context context, String str, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f13278a = context;
        this.f13279b = str;
        this.f13280c = interfaceExecutorServiceC1974Un0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f13280c.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.G60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new I60(new JSONObject());
            }
        });
    }
}
