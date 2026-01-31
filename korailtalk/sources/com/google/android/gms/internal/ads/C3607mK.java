package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.mK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3607mK implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2922gK f20874a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20875b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f20876c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f20877d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f20878e;

    public C3607mK(C2922gK c2922gK, XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f20874a = c2922gK;
        this.f20875b = xd0;
        this.f20876c = xd02;
        this.f20877d = xd03;
        this.f20878e = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f20875b.zzb();
        final L1.a aVarZza = ((C4357sx) this.f20876c).zza();
        final C4654va0 c4654va0Zza = ((C4049qD) this.f20877d).zza();
        final C1825Ra0 c1825Ra0Zza = ((C4053qF) this.f20878e).zza();
        return new C4630vJ(new InterfaceC3941pG() { // from class: com.google.android.gms.internal.ads.eK
            @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
            public final void zzs() {
                G1.u.zzs().zzn(context, aVarZza.afmaVersion, c4654va0Zza.zzD.toString(), c1825Ra0Zza.zzf);
            }
        }, AbstractC4805wt.zzf);
    }
}
