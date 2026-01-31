package com.google.android.gms.internal.ads;

import com.j256.ormlite.stmt.query.SimpleComparison;

/* renamed from: com.google.android.gms.internal.ads.cl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2508cl0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18349a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18350b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18351c;

    C2508cl0(Object obj, Object obj2, Object obj3) {
        this.f18349a = obj;
        this.f18350b = obj2;
        this.f18351c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f18351c;
        Object obj2 = this.f18350b;
        Object obj3 = this.f18349a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + SimpleComparison.EQUAL_TO_OPERATION + String.valueOf(obj2) + " and " + String.valueOf(obj3) + SimpleComparison.EQUAL_TO_OPERATION + String.valueOf(obj));
    }
}
