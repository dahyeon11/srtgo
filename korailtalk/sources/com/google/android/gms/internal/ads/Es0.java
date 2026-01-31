package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class Es0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Es0 f12871b = new Es0();

    /* renamed from: c, reason: collision with root package name */
    private static final Ds0 f12872c = new Ds0(null);

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f12873a = new AtomicReference();

    public static Es0 zza() {
        return f12871b;
    }

    public final Ou0 zzb() {
        Ou0 ou0 = (Ou0) this.f12873a.get();
        return ou0 == null ? f12872c : ou0;
    }
}
