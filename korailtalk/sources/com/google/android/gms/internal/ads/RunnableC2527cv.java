package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.cv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2527cv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f18359a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18360b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f18361c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f18362d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f18363e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f18364f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f18365g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f18366h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f18367i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ AbstractC2986gv f18368j;

    RunnableC2527cv(AbstractC2986gv abstractC2986gv, String str, String str2, int i8, int i9, long j8, long j9, boolean z8, int i10, int i11) {
        this.f18359a = str;
        this.f18360b = str2;
        this.f18361c = i8;
        this.f18362d = i9;
        this.f18363e = j8;
        this.f18364f = j9;
        this.f18365g = z8;
        this.f18366h = i10;
        this.f18367i = i11;
        this.f18368j = abstractC2986gv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.r.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f18359a);
        map.put("cachedSrc", this.f18360b);
        map.put("bytesLoaded", Integer.toString(this.f18361c));
        map.put("totalBytes", Integer.toString(this.f18362d));
        map.put("bufferedDuration", Long.toString(this.f18363e));
        map.put("totalDuration", Long.toString(this.f18364f));
        map.put("cacheReady", true != this.f18365g ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f18366h));
        map.put("playerPreparedCount", Integer.toString(this.f18367i));
        AbstractC2986gv.a(this.f18368j, "onPrecacheEvent", map);
    }
}
