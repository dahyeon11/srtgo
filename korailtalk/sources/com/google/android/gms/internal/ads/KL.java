package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class KL implements InterfaceC1992Vc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13788a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NL f13789b;

    KL(NL nl, String str) {
        this.f13788a = str;
        this.f13789b = nl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
    public final void zzdp(C1951Uc c1951Uc) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbK)).booleanValue()) {
            if (c1951Uc.zzj) {
                NL nl = this.f13789b;
                nl.f14886E.put(this.f13788a, Boolean.TRUE);
                NL nl2 = this.f13789b;
                nl2.zzB(nl2.f14900u.zzf(), this.f13789b.f14900u.zzl(), this.f13789b.f14900u.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c1951Uc.zzj) {
                    NL nl3 = this.f13789b;
                    if (nl3.f14900u == null) {
                        return;
                    }
                    nl3.f14886E.put(this.f13788a, Boolean.TRUE);
                    NL nl4 = this.f13789b;
                    nl4.zzB(nl4.f14900u.zzf(), this.f13789b.f14900u.zzl(), this.f13789b.f14900u.zzm(), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
