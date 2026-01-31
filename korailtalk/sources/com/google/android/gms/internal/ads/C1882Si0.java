package com.google.android.gms.internal.ads;

import I2.C0609m;

/* renamed from: com.google.android.gms.internal.ads.Si0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1882Si0 extends AbstractRunnableC1759Pi0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0609m f16325b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractRunnableC1759Pi0 f16326c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2275aj0 f16327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1882Si0(C2275aj0 c2275aj0, C0609m c0609m, C0609m c0609m2, AbstractRunnableC1759Pi0 abstractRunnableC1759Pi0) {
        super(c0609m);
        this.f16325b = c0609m2;
        this.f16326c = abstractRunnableC1759Pi0;
        this.f16327d = c2275aj0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1759Pi0
    public final void zza() {
        synchronized (this.f16327d.f18012f) {
            try {
                C2275aj0.k(this.f16327d, this.f16325b);
                if (this.f16327d.f18017k.getAndIncrement() > 0) {
                    this.f16327d.f18008b.zzc("Already connected to the service.", new Object[0]);
                }
                C2275aj0.m(this.f16327d, this.f16326c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
