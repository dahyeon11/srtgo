package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class A2 implements InterfaceC2769f1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f12136a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2769f1 f12137b;

    public A2(long j8, InterfaceC2769f1 interfaceC2769f1) {
        this.f12136a = j8;
        this.f12137b = interfaceC2769f1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769f1
    public final void zzD() {
        this.f12137b.zzD();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769f1
    public final void zzO(C1 c12) {
        this.f12137b.zzO(new C5052z2(this, c12, c12));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769f1
    public final K1 zzw(int i8, int i9) {
        return this.f12137b.zzw(i8, i9);
    }
}
