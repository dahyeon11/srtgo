package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4637vM0 implements IN0 {

    /* renamed from: a, reason: collision with root package name */
    private final IN0 f23217a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2394bl0 f23218b;

    public C4637vM0(IN0 in0, List list) {
        this.f23217a = in0;
        this.f23218b = AbstractC2394bl0.zzk(list);
    }

    public final AbstractC2394bl0 zza() {
        return this.f23218b;
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final long zzb() {
        return this.f23217a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final long zzc() {
        return this.f23217a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final void zzm(long j8) {
        this.f23217a.zzm(j8);
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final boolean zzo(C2685eG0 c2685eG0) {
        return this.f23217a.zzo(c2685eG0);
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final boolean zzp() {
        return this.f23217a.zzp();
    }
}
