package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class MF0 implements InterfaceC3372kG0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14563a;

    /* renamed from: b, reason: collision with root package name */
    private final PM0 f14564b;

    /* renamed from: c, reason: collision with root package name */
    private RG f14565c;

    public MF0(Object obj, IM0 im0) {
        this.f14563a = obj;
        this.f14564b = im0;
        this.f14565c = im0.zzC();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3372kG0
    public final RG zza() {
        return this.f14565c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3372kG0
    public final Object zzb() {
        return this.f14563a;
    }

    public final void zzc(RG rg) {
        this.f14565c = rg;
    }
}
