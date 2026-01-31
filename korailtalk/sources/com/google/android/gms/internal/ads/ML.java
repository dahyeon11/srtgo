package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class ML implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f14628a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NL f14629b;

    ML(NL nl, View view) {
        this.f14628a = view;
        this.f14629b = nl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfj)).booleanValue()) {
            G1.u.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f14629b.e(this.f14628a, (C2597dX) obj);
    }
}
