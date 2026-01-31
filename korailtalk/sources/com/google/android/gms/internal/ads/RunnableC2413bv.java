package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.bv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2413bv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f18199a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18200b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f18201c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f18202d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f18203e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f18204f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f18205g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f18206h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f18207i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f18208j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ AbstractC2986gv f18209k;

    RunnableC2413bv(AbstractC2986gv abstractC2986gv, String str, String str2, long j8, long j9, long j10, long j11, long j12, boolean z8, int i8, int i9) {
        this.f18199a = str;
        this.f18200b = str2;
        this.f18201c = j8;
        this.f18202d = j9;
        this.f18203e = j10;
        this.f18204f = j11;
        this.f18205g = j12;
        this.f18206h = z8;
        this.f18207i = i8;
        this.f18208j = i9;
        this.f18209k = abstractC2986gv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.r.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f18199a);
        map.put("cachedSrc", this.f18200b);
        map.put("bufferedDuration", Long.toString(this.f18201c));
        map.put("totalDuration", Long.toString(this.f18202d));
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f18203e));
            map.put("qoeCachedBytes", Long.toString(this.f18204f));
            map.put("totalBytes", Long.toString(this.f18205g));
            map.put("reportTime", Long.toString(G1.u.zzB().currentTimeMillis()));
        }
        map.put("cacheReady", true != this.f18206h ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f18207i));
        map.put("playerPreparedCount", Integer.toString(this.f18208j));
        AbstractC2986gv.a(this.f18209k, "onPrecacheEvent", map);
    }
}
