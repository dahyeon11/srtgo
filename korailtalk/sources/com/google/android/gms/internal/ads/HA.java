package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class HA implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3865oe0 f13283a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13284b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IA f13285c;

    HA(IA ia, C3865oe0 c3865oe0, String str) {
        this.f13283a = c3865oe0;
        this.f13284b = str;
        this.f13285c = ia;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(final Throwable th) {
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = this.f13285c.f13421e;
        final C3865oe0 c3865oe0 = this.f13283a;
        final String str = this.f13284b;
        interfaceExecutorServiceC1974Un0.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.FA
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzko)).booleanValue();
                HA ha = this.zza;
                Throwable th2 = th;
                if (zBooleanValue) {
                    IA ia = ha.f13285c;
                    ia.f13425i = C4116qq.zzc(ia.f13417a);
                    ha.f13285c.f13425i.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    IA ia2 = ha.f13285c;
                    ia2.f13424h = C4116qq.zza(ia2.f13417a);
                    ha.f13285c.f13424h.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                c3865oe0.zzc(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        IA ia = this.f13285c;
        final C3865oe0 c3865oe0 = this.f13283a;
        final String str = (String) obj;
        ia.f13421e.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.GA
            @Override // java.lang.Runnable
            public final void run() {
                c3865oe0.zzc(str, null);
            }
        });
    }
}
