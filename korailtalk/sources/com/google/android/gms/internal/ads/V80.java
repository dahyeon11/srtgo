package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class V80 implements InterfaceC3358k90 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1418Hb0 f16783a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f16784b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1319En0 f16785c = new T80(this);

    public V80(InterfaceC1418Hb0 interfaceC1418Hb0, Executor executor) {
        this.f16783a = interfaceC1418Hb0;
        this.f16784b = executor;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(InterfaceC2797fF interfaceC2797fF, C2786f90 c2786f90) {
        InterfaceC1418Hb0 interfaceC1418Hb0 = this.f16783a;
        InterfaceC1827Rb0 interfaceC1827Rb0 = c2786f90.zzb;
        C2519cr c2519cr = c2786f90.zza;
        C1786Qb0 c1786Qb0Zzb = interfaceC1418Hb0.zzb(interfaceC1827Rb0);
        if (c1786Qb0Zzb != null && c2519cr != null) {
            AbstractC1483In0.zzr(interfaceC2797fF.zzb().zzh(c2519cr), this.f16785c, this.f16784b);
        }
        return AbstractC1483In0.zzh(new U80(interfaceC1827Rb0, c2519cr, c1786Qb0Zzb));
    }

    public final com.google.common.util.concurrent.C zzb(C3472l90 c3472l90, InterfaceC3244j90 interfaceC3244j90, final InterfaceC2797fF interfaceC2797fF) {
        return AbstractC1483In0.zze(AbstractC1483In0.zzn(AbstractC5136zn0.zzu(new C2901g90(this.f16783a, interfaceC2797fF, this.f16784b).zzc()), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.R80
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a(interfaceC2797fF, (C2786f90) obj);
            }
        }, this.f16784b), Exception.class, new S80(this), this.f16784b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C zzc(C3472l90 c3472l90, InterfaceC3244j90 interfaceC3244j90, Object obj) {
        return zzb(c3472l90, interfaceC3244j90, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
