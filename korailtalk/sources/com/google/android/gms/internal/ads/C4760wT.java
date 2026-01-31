package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.wT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4760wT implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4874xT f23514a;

    C4760wT(C4874xT c4874xT) {
        this.f23514a = c4874xT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgs)).booleanValue()) {
            Matcher matcher = C4874xT.f23714h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f23514a.f23719e.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C1457Ia0 c1457Ia0 = (C1457Ia0) obj;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgs)).booleanValue()) {
            this.f23514a.f23719e.zzi(c1457Ia0.zzb.zzb.zze);
            this.f23514a.f23719e.zzj(c1457Ia0.zzb.zzb.zzf);
        }
    }
}
