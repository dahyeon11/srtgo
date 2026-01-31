package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Dn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1278Dn0 extends AbstractFutureC1196Bn0 implements com.google.common.util.concurrent.C {
    protected AbstractC1278Dn0() {
    }

    @Override // com.google.common.util.concurrent.C
    public final void addListener(Runnable runnable, Executor executor) {
        c().addListener(runnable, executor);
    }

    protected abstract com.google.common.util.concurrent.C c();
}
