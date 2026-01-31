package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4386tB {

    /* renamed from: a, reason: collision with root package name */
    private final LQ f22792a;

    /* renamed from: b, reason: collision with root package name */
    private final C1457Ia0 f22793b;

    C4386tB(LQ lq, C1457Ia0 c1457Ia0) {
        this.f22792a = lq;
        this.f22793b = c1457Ia0;
    }

    public final void zza(long j8, int i8) {
        KQ kqZza = this.f22792a.zza();
        kqZza.zzd(this.f22793b.zzb.zzb);
        kqZza.zzb("action", "ad_closed");
        kqZza.zzb("show_time", String.valueOf(j8));
        kqZza.zzb("ad_format", "app_open_ad");
        int i9 = i8 - 1;
        kqZza.zzb("acr", i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        kqZza.zzf();
    }
}
