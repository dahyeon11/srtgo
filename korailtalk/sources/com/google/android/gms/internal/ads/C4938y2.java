package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4938y2 extends C4025q1 {

    /* renamed from: b, reason: collision with root package name */
    private final long f23821b;

    public C4938y2(InterfaceC2540d1 interfaceC2540d1, long j8) {
        super(interfaceC2540d1);
        F10.zzd(interfaceC2540d1.zzf() >= j8);
        this.f23821b = j8;
    }

    @Override // com.google.android.gms.internal.ads.C4025q1, com.google.android.gms.internal.ads.InterfaceC2540d1
    public final long zzd() {
        return super.zzd() - this.f23821b;
    }

    @Override // com.google.android.gms.internal.ads.C4025q1, com.google.android.gms.internal.ads.InterfaceC2540d1
    public final long zze() {
        return super.zze() - this.f23821b;
    }

    @Override // com.google.android.gms.internal.ads.C4025q1, com.google.android.gms.internal.ads.InterfaceC2540d1
    public final long zzf() {
        return super.zzf() - this.f23821b;
    }
}
