package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class TA implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16420a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UA f16421b;

    TA(UA ua, String str) {
        this.f16420a = str;
        this.f16421b = ua;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        UA ua = this.f16421b;
        ua.f16602h.zza(ua.f16601g.zzd(ua.f16599e, ua.f16600f, false, this.f16420a, null, ua.j()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        UA ua = this.f16421b;
        ua.f16602h.zza(ua.f16601g.zzd(ua.f16599e, ua.f16600f, false, this.f16420a, (String) obj, ua.j()));
    }
}
