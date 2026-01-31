package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1372Fy implements InterfaceC3847oR {

    /* renamed from: a, reason: collision with root package name */
    private final Long f13088a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13089b;

    /* renamed from: c, reason: collision with root package name */
    private final C2190Zx f13090c;

    /* renamed from: d, reason: collision with root package name */
    private final C1536Jy f13091d;

    /* renamed from: e, reason: collision with root package name */
    private final C1372Fy f13092e = this;

    /* synthetic */ C1372Fy(C2190Zx c2190Zx, C1536Jy c1536Jy, Long l8, String str, AbstractC1331Ey abstractC1331Ey) {
        this.f13090c = c2190Zx;
        this.f13091d = c1536Jy;
        this.f13088a = l8;
        this.f13089b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3847oR
    public final C4986yR zza() {
        C1536Jy c1536Jy = this.f13091d;
        return AbstractC5100zR.zza(this.f13088a.longValue(), c1536Jy.f13711a, C4302sR.zzc(c1536Jy.f13712b), this.f13090c, this.f13089b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3847oR
    public final CR zzb() {
        C1536Jy c1536Jy = this.f13091d;
        return DR.zza(this.f13088a.longValue(), c1536Jy.f13711a, C4302sR.zzc(c1536Jy.f13712b), this.f13090c, this.f13089b);
    }
}
