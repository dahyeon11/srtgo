package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tn0 */
/* loaded from: classes2.dex */
final class C4452tn0 extends AbstractC4566un0 {

    /* renamed from: e */
    private final Callable f22924e;

    /* renamed from: f */
    final /* synthetic */ C4680vn0 f22925f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4452tn0(C4680vn0 c4680vn0, Callable callable, Executor executor) {
        super(c4680vn0, executor);
        this.f22925f = c4680vn0;
        this.f22924e = callable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final Object a() {
        return this.f22924e.call();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1892Sn0
    final String b() {
        return this.f22924e.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4566un0
    final void h(Object obj) {
        this.f22925f.zzc(obj);
    }
}
