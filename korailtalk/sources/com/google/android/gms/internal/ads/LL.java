package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class LL implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14281a = "Google";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NL f14282b;

    LL(NL nl, String str, boolean z8) {
        this.f14282b = nl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfj)).booleanValue()) {
            G1.u.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f14282b.f14890k.zzT((InterfaceC2065Wv) obj);
        NL nl = this.f14282b;
        C1203Bt c1203BtZzp = nl.f14890k.zzp();
        C2597dX c2597dXZzf = nl.zzf(this.f14281a, true);
        if (c2597dXZzf != null && c1203BtZzp != null) {
            c1203BtZzp.zzc(c2597dXZzf);
        } else if (c1203BtZzp != null) {
            c1203BtZzp.cancel(false);
        }
    }
}
