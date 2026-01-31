package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2470cN0 implements PO0 {

    /* renamed from: a, reason: collision with root package name */
    private final PO0 f18301a;

    /* renamed from: b, reason: collision with root package name */
    private final TH f18302b;

    public C2470cN0(PO0 po0, TH th) {
        this.f18301a = po0;
        this.f18302b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2470cN0)) {
            return false;
        }
        C2470cN0 c2470cN0 = (C2470cN0) obj;
        return this.f18301a.equals(c2470cN0.f18301a) && this.f18302b.equals(c2470cN0.f18302b);
    }

    public final int hashCode() {
        return ((this.f18302b.hashCode() + 527) * 31) + this.f18301a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final int zza(int i8) {
        return this.f18301a.zza(i8);
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final int zzb(int i8) {
        return this.f18301a.zzb(i8);
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final int zzc() {
        return this.f18301a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final Q5 zzd(int i8) {
        return this.f18302b.zzb(this.f18301a.zza(i8));
    }

    @Override // com.google.android.gms.internal.ads.PO0, com.google.android.gms.internal.ads.TO0
    public final TH zze() {
        return this.f18302b;
    }
}
