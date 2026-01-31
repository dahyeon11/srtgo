package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class KQ {

    /* renamed from: a */
    private final Map f13802a = new ConcurrentHashMap();

    /* renamed from: b */
    final /* synthetic */ LQ f13803b;

    KQ(LQ lq) {
        this.f13803b = lq;
    }

    static /* bridge */ /* synthetic */ KQ a(KQ kq) {
        kq.f13802a.putAll(kq.f13803b.f14287c);
        return kq;
    }

    final /* synthetic */ void b() {
        this.f13803b.f14285a.zzf(this.f13802a);
    }

    final /* synthetic */ void c() {
        this.f13803b.f14285a.zze(this.f13802a);
    }

    public final KQ zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f13802a.put(str, str2);
        }
        return this;
    }

    public final KQ zzc(C4654va0 c4654va0) {
        zzb("aai", c4654va0.zzx);
        zzb("request_id", c4654va0.zzao);
        zzb("ad_format", C4654va0.zza(c4654va0.zzb));
        return this;
    }

    public final KQ zzd(C4996ya0 c4996ya0) {
        zzb("gqi", c4996ya0.zzb);
        return this;
    }

    public final String zze() {
        return this.f13803b.f14285a.b(this.f13802a);
    }

    public final void zzf() {
        this.f13803b.f14286b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.HQ
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b();
            }
        });
    }

    public final void zzg() {
        this.f13803b.f14286b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.JQ
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.c();
            }
        });
    }
}
