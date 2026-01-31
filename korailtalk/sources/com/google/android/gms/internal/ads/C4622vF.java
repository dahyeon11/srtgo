package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.vF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4622vF implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4508uF f23193a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23194b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f23195c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f23196d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f23197e;

    public C4622vF(C4508uF c4508uF, XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f23193a = c4508uF;
        this.f23194b = xd0;
        this.f23195c = xd02;
        this.f23196d = xd03;
        this.f23197e = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.f23194b.zzb();
        L1.a aVarZza = ((C4357sx) this.f23195c).zza();
        C4654va0 c4654va0Zza = ((C4049qD) this.f23196d).zza();
        C3778ns c3778ns = new C3778ns();
        C3892os c3892os = c4654va0Zza.zzB;
        if (c3892os == null) {
            return null;
        }
        C1129Aa0 c1129Aa0 = c4654va0Zza.zzt;
        return new C3664ms(context, aVarZza, c3892os, c1129Aa0 == null ? null : c1129Aa0.zzb, c3778ns);
    }
}
