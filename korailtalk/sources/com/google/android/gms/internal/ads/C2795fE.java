package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2795fE implements InterfaceC4059qI, InterfaceC3941pG {

    /* renamed from: a, reason: collision with root package name */
    private final o2.f f19139a;

    /* renamed from: b, reason: collision with root package name */
    private final C3025hE f19140b;

    /* renamed from: c, reason: collision with root package name */
    private final C1825Ra0 f19141c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19142d;

    C2795fE(o2.f fVar, C3025hE c3025hE, C1825Ra0 c1825Ra0, String str) {
        this.f19139a = fVar;
        this.f19140b = c3025hE;
        this.f19141c = c1825Ra0;
        this.f19142d = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4059qI
    public final void zza() {
        this.f19140b.zze(this.f19142d, this.f19139a.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final void zzs() {
        C1825Ra0 c1825Ra0 = this.f19141c;
        this.f19140b.zzd(c1825Ra0.zzf, this.f19142d, this.f19139a.elapsedRealtime());
    }
}
