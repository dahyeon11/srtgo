package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class QC {

    /* renamed from: a, reason: collision with root package name */
    private final SG f15748a;

    /* renamed from: b, reason: collision with root package name */
    private final C2345bI f15749b;

    public QC(SG sg, C2345bI c2345bI) {
        this.f15748a = sg;
        this.f15749b = c2345bI;
    }

    final C2345bI a() {
        return this.f15749b;
    }

    final C4630vJ b() {
        C2345bI c2345bI = this.f15749b;
        return c2345bI != null ? new C4630vJ(c2345bI, AbstractC4805wt.zzf) : new C4630vJ(new PC(this), AbstractC4805wt.zzf);
    }

    public final SG zza() {
        return this.f15748a;
    }
}
