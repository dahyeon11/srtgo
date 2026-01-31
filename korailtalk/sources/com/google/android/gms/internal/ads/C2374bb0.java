package com.google.android.gms.internal.ads;

import H1.C0591z;

/* renamed from: com.google.android.gms.internal.ads.bb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2374bb0 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2065Wv f18157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IA f18158b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3865oe0 f18159c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4535uW f18160d;

    C2374bb0(InterfaceC2065Wv interfaceC2065Wv, IA ia, C3865oe0 c3865oe0, C4535uW c4535uW) {
        this.f18157a = interfaceC2065Wv;
        this.f18158b = ia;
        this.f18159c = c3865oe0;
        this.f18160d = c4535uW;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.f18157a.zzD().zzaj) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzka)).booleanValue() && this.f18158b != null && IA.zzj(str)) {
                this.f18158b.zzi(str, this.f18159c, C0591z.zze());
                return;
            } else {
                this.f18159c.zzc(str, null);
                return;
            }
        }
        long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
        String str2 = this.f18157a.zzR().zzb;
        int i8 = 2;
        if (!G1.u.zzo().zzA(this.f18157a.getContext())) {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgx)).booleanValue() || !this.f18157a.zzD().zzT) {
                i8 = 1;
            }
        }
        this.f18160d.zzd(new C4877xW(jCurrentTimeMillis, str2, str, i8));
    }
}
