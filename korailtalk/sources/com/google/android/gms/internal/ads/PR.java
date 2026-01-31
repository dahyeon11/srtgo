package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes2.dex */
final class PR implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RR f15330a;

    PR(RR rr) {
        this.f15330a = rr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        synchronized (this) {
            this.f15330a.f16102c = true;
            this.f15330a.q("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (G1.u.zzB().elapsedRealtime() - this.f15330a.f16103d));
            this.f15330a.f16104e.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.f15330a.f16102c = true;
            this.f15330a.q("com.google.android.gms.ads.MobileAds", true, "", (int) (G1.u.zzB().elapsedRealtime() - this.f15330a.f16103d));
            this.f15330a.f16108i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.OR
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    RR.i(this.zza.f15330a, str);
                }
            });
        }
    }
}
