package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3798o10 implements InterfaceC4709w10 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC3912p10 f21382a;

    C3798o10(BinderC3912p10 binderC3912p10) {
        this.f21382a = binderC3912p10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final void zza() {
        synchronized (this.f21382a) {
            this.f21382a.f21622j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C2463cK c2463cK = (C2463cK) obj;
        synchronized (this.f21382a) {
            this.f21382a.f21622j = c2463cK;
            this.f21382a.f21622j.zzj();
        }
    }
}
