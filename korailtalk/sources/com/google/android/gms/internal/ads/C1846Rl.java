package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1846Rl implements InterfaceC3997pn0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1519Jl f16150a;

    C1846Rl(C2010Vl c2010Vl, C1519Jl c1519Jl) {
        this.f16150a = c1519Jl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C zza(Object obj) {
        C1203Bt c1203Bt = new C1203Bt();
        ((C1764Pl) obj).zze(this.f16150a, new BinderC1805Ql(this, c1203Bt));
        return c1203Bt;
    }
}
