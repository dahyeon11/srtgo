package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5052z2 extends C4138r1 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1 f24099b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ A2 f24100c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5052z2(A2 a22, C1 c12, C1 c13) {
        super(c12);
        this.f24099b = c13;
        this.f24100c = a22;
    }

    @Override // com.google.android.gms.internal.ads.C4138r1, com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        A1 a1Zzg = this.f24099b.zzg(j8);
        D1 d12 = a1Zzg.zza;
        D1 d13 = new D1(d12.zzb, d12.zzc + this.f24100c.f12136a);
        D1 d14 = a1Zzg.zzb;
        return new A1(d13, new D1(d14.zzb, d14.zzc + this.f24100c.f12136a));
    }
}
