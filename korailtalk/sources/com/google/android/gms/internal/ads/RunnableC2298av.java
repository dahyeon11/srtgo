package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.av, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2298av implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f18053a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18054b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f18055c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f18056d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC2986gv f18057e;

    RunnableC2298av(AbstractC2986gv abstractC2986gv, String str, String str2, int i8, int i9, boolean z8) {
        this.f18053a = str;
        this.f18054b = str2;
        this.f18055c = i8;
        this.f18056d = i9;
        this.f18057e = abstractC2986gv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.r.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f18053a);
        map.put("cachedSrc", this.f18054b);
        map.put("bytesLoaded", Integer.toString(this.f18055c));
        map.put("totalBytes", Integer.toString(this.f18056d));
        map.put("cacheReady", "0");
        AbstractC2986gv.a(this.f18057e, "onPrecacheEvent", map);
    }
}
