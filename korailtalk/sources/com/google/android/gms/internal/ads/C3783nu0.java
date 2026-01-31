package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3783nu0 implements InterfaceC1689No0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3325jt0 f21370a;

    /* renamed from: b, reason: collision with root package name */
    private final Nu0 f21371b;

    /* renamed from: c, reason: collision with root package name */
    private final Nu0 f21372c;

    /* synthetic */ C3783nu0(C3325jt0 c3325jt0, AbstractC3669mu0 abstractC3669mu0) {
        Nu0 nu0Zza;
        this.f21370a = c3325jt0;
        if (c3325jt0.zzg()) {
            Ou0 ou0Zzb = Es0.zza().zzb();
            Tu0 tu0Zza = AbstractC4690vs0.zza(c3325jt0);
            this.f21371b = ou0Zzb.zza(tu0Zza, "mac", "compute");
            nu0Zza = ou0Zzb.zza(tu0Zza, "mac", "verify");
        } else {
            nu0Zza = AbstractC4690vs0.zza;
            this.f21371b = nu0Zza;
        }
        this.f21372c = nu0Zza;
    }
}
