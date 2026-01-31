package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dy */
/* loaded from: classes2.dex */
final class C1290Dy implements InterfaceC3733nR {

    /* renamed from: a */
    private final C2190Zx f12717a;

    /* renamed from: b */
    private final C1536Jy f12718b;

    /* renamed from: c */
    private Long f12719c;

    /* renamed from: d */
    private String f12720d;

    /* synthetic */ C1290Dy(C2190Zx c2190Zx, C1536Jy c1536Jy, AbstractC1249Cy abstractC1249Cy) {
        this.f12717a = c2190Zx;
        this.f12718b = c1536Jy;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3733nR
    public final /* synthetic */ InterfaceC3733nR zza(String str) {
        str.getClass();
        this.f12720d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3733nR
    public final /* bridge */ /* synthetic */ InterfaceC3733nR zzb(long j8) {
        this.f12719c = Long.valueOf(j8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3733nR
    public final InterfaceC3847oR zzc() {
        OD0.zzc(this.f12719c, Long.class);
        OD0.zzc(this.f12720d, String.class);
        return new C1372Fy(this.f12717a, this.f12718b, this.f12719c, this.f12720d, null);
    }
}
