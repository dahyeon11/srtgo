package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.k10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3342k10 implements NG {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f20344a = new AtomicReference();

    public final void zza(H1.L0 l02) {
        this.f20344a.set(l02);
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final void zzh(final H1.f2 f2Var) {
        X80.zza(this.f20344a, new W80() { // from class: com.google.android.gms.internal.ads.j10
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.L0) obj).zze(f2Var);
            }
        });
    }
}
