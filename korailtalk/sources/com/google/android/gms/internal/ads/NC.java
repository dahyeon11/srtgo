package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class NC implements InterfaceC3941pG, InterfaceC1992Vc {

    /* renamed from: a */
    private final C4654va0 f14804a;

    /* renamed from: b */
    private final TF f14805b;

    /* renamed from: c */
    private final C5080zG f14806c;

    /* renamed from: d */
    private final AtomicBoolean f14807d = new AtomicBoolean();

    /* renamed from: e */
    private final AtomicBoolean f14808e = new AtomicBoolean();

    public NC(C4654va0 c4654va0, TF tf, C5080zG c5080zG) {
        this.f14804a = c4654va0;
        this.f14805b = tf;
        this.f14806c = c5080zG;
    }

    private final void a() {
        if (this.f14807d.compareAndSet(false, true)) {
            this.f14805b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
    public final void zzdp(C1951Uc c1951Uc) {
        if (this.f14804a.zzf == 1 && c1951Uc.zzj) {
            a();
        }
        if (c1951Uc.zzj && this.f14808e.compareAndSet(false, true)) {
            this.f14806c.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final synchronized void zzs() {
        if (this.f14804a.zzf != 1) {
            a();
        }
    }
}
