package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ht */
/* loaded from: classes2.dex */
final class C1449Ht implements InterfaceC1319En0 {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1367Ft f13368a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC1285Dt f13369b;

    C1449Ht(C1490It c1490It, InterfaceC1367Ft interfaceC1367Ft, InterfaceC1285Dt interfaceC1285Dt) {
        this.f13368a = interfaceC1367Ft;
        this.f13369b = interfaceC1285Dt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        this.f13369b.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zzb(Object obj) {
        this.f13368a.zza(obj);
    }
}
