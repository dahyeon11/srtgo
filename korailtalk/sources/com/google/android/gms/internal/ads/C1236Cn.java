package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1236Cn {

    /* renamed from: a, reason: collision with root package name */
    private final C2740en f12574a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.common.util.concurrent.C f12575b;

    C1236Cn(C2740en c2740en) {
        this.f12574a = c2740en;
    }

    private final void a() {
        if (this.f12575b == null) {
            final C1203Bt c1203Bt = new C1203Bt();
            this.f12575b = c1203Bt;
            this.f12574a.zzb(null).zzj(new InterfaceC1367Ft() { // from class: com.google.android.gms.internal.ads.zn
                @Override // com.google.android.gms.internal.ads.InterfaceC1367Ft
                public final void zza(Object obj) {
                    c1203Bt.zzc((InterfaceC2855fn) obj);
                }
            }, new InterfaceC1285Dt() { // from class: com.google.android.gms.internal.ads.An
                @Override // com.google.android.gms.internal.ads.InterfaceC1285Dt
                public final void zza() {
                    c1203Bt.zzd(new C3085hn("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final C1359Fn zza(String str, InterfaceC3654mn interfaceC3654mn, InterfaceC3426kn interfaceC3426kn) {
        a();
        return new C1359Fn(this.f12575b, "google.afma.activeView.handleUpdate", interfaceC3654mn, interfaceC3426kn);
    }

    public final void zzb(final String str, final InterfaceC2278al interfaceC2278al) {
        a();
        this.f12575b = AbstractC1483In0.zzn(this.f12575b, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.Bn
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                InterfaceC2855fn interfaceC2855fn = (InterfaceC2855fn) obj;
                interfaceC2855fn.zzq(str, interfaceC2278al);
                return AbstractC1483In0.zzh(interfaceC2855fn);
            }
        }, AbstractC4805wt.zzf);
    }

    public final void zzc(final String str, final InterfaceC2278al interfaceC2278al) {
        this.f12575b = AbstractC1483In0.zzm(this.f12575b, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.yn
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                InterfaceC2855fn interfaceC2855fn = (InterfaceC2855fn) obj;
                interfaceC2855fn.zzr(str, interfaceC2278al);
                return interfaceC2855fn;
            }
        }, AbstractC4805wt.zzf);
    }
}
