package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1393Gj0 extends AbstractC4786wj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13194a;

    C1393Gj0(Object obj) {
        this.f13194a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1393Gj0) {
            return this.f13194a.equals(((C1393Gj0) obj).f13194a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13194a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f13194a.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4786wj0
    public final AbstractC4786wj0 zza(InterfaceC3875oj0 interfaceC3875oj0) {
        Object objApply = interfaceC3875oj0.apply(this.f13194a);
        AbstractC1188Bj0.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new C1393Gj0(objApply);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4786wj0
    public final Object zzb(Object obj) {
        return this.f13194a;
    }
}
