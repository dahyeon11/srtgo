package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ev, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2756ev implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f18851a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18852b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f18853c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2986gv f18854d;

    RunnableC2756ev(AbstractC2986gv abstractC2986gv, String str, String str2, long j8) {
        this.f18851a = str;
        this.f18852b = str2;
        this.f18853c = j8;
        this.f18854d = abstractC2986gv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.r.CATEGORY_EVENT, "precacheComplete");
        map.put("src", this.f18851a);
        map.put("cachedSrc", this.f18852b);
        map.put("totalDuration", Long.toString(this.f18853c));
        AbstractC2986gv.a(this.f18854d, "onPrecacheEvent", map);
    }
}
