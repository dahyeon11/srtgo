package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class GT implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f13158a;

    GT(Context context) {
        this.f13158a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        if (((Boolean) AbstractC3189ii.zzh.zze()).booleanValue() && (th instanceof K1.C)) {
            AbstractC2499ch.zze(this.f13158a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) AbstractC3189ii.zzj.zze()).booleanValue()) {
            AbstractC2499ch.zze(this.f13158a);
        }
    }
}
