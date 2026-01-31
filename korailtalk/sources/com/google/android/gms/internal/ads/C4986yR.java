package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.yR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4986yR implements InterfaceC3619mR {

    /* renamed from: a, reason: collision with root package name */
    private final long f23938a;

    /* renamed from: b, reason: collision with root package name */
    private final BinderC3912p10 f23939b;

    C4986yR(long j8, Context context, C4188rR c4188rR, AbstractC2302ax abstractC2302ax, String str) {
        this.f23938a = j8;
        InterfaceC4953y90 interfaceC4953y90Zzv = abstractC2302ax.zzv();
        interfaceC4953y90Zzv.zzc(context);
        interfaceC4953y90Zzv.zza(new H1.d2());
        interfaceC4953y90Zzv.zzb(str);
        BinderC3912p10 binderC3912p10Zza = interfaceC4953y90Zzv.zzd().zza();
        this.f23939b = binderC3912p10Zza;
        binderC3912p10Zza.zzD(new BinderC4872xR(this, c4188rR));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3619mR
    public final void zza() {
        this.f23939b.zzx();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3619mR
    public final void zzb(H1.Y1 y12) {
        this.f23939b.zzab(y12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3619mR
    public final void zzc() {
        this.f23939b.zzW(r2.b.wrap(null));
    }
}
