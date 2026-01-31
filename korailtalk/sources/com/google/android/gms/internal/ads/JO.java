package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class JO implements InterfaceC4333sl {

    /* renamed from: a, reason: collision with root package name */
    private final C3144iG f13635a;

    /* renamed from: b, reason: collision with root package name */
    private final C1242Cr f13636b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13637c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13638d;

    public JO(C3144iG c3144iG, C4654va0 c4654va0) {
        this.f13635a = c3144iG;
        this.f13636b = c4654va0.zzm;
        this.f13637c = c4654va0.zzk;
        this.f13638d = c4654va0.zzl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4333sl
    public final void zza(C1242Cr c1242Cr) {
        int i8;
        String str;
        C1242Cr c1242Cr2 = this.f13636b;
        if (c1242Cr2 != null) {
            c1242Cr = c1242Cr2;
        }
        if (c1242Cr != null) {
            str = c1242Cr.zza;
            i8 = c1242Cr.zzb;
        } else {
            i8 = 1;
            str = "";
        }
        this.f13635a.zzd(new BinderC3776nr(str, i8), this.f13637c, this.f13638d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4333sl
    public final void zzb() {
        this.f13635a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4333sl
    public final void zzc() {
        this.f13635a.zzf();
    }
}
