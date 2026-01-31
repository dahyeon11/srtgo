package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class O80 implements InterfaceC2490cc0 {
    public final InterfaceC3244j90 zza;
    public final C3472l90 zzb;
    public final H1.Y1 zzc;
    public final String zzd;
    public final Executor zze;
    public final H1.j2 zzf;
    public final InterfaceC1827Rb0 zzg;

    public O80(InterfaceC3244j90 interfaceC3244j90, C3472l90 c3472l90, H1.Y1 y12, String str, Executor executor, H1.j2 j2Var, InterfaceC1827Rb0 interfaceC1827Rb0) {
        this.zza = interfaceC3244j90;
        this.zzb = c3472l90;
        this.zzc = y12;
        this.zzd = str;
        this.zze = executor;
        this.zzf = j2Var;
        this.zzg = interfaceC1827Rb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2490cc0
    public final InterfaceC1827Rb0 zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2490cc0
    public final Executor zzb() {
        return this.zze;
    }
}
