package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.dv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2641dv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f18704a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18705b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f18706c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2986gv f18707d;

    RunnableC2641dv(AbstractC2986gv abstractC2986gv, String str, String str2, int i8) {
        this.f18704a = str;
        this.f18705b = str2;
        this.f18706c = i8;
        this.f18707d = abstractC2986gv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.r.CATEGORY_EVENT, "precacheComplete");
        map.put("src", this.f18704a);
        map.put("cachedSrc", this.f18705b);
        map.put("totalBytes", Integer.toString(this.f18706c));
        AbstractC2986gv.a(this.f18707d, "onPrecacheEvent", map);
    }
}
