package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1747Pc0 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1297Ec0 f15383a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1829Rc0 f15384b;

    C1747Pc0(C1829Rc0 c1829Rc0, C1297Ec0 c1297Ec0) {
        this.f15383a = c1297Ec0;
        this.f15384b = c1829Rc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        this.f15384b.f16140f.f16311c.zzb(this.f15383a, th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zzb(Object obj) {
        this.f15384b.f16140f.f16311c.zzd(this.f15383a);
    }
}
