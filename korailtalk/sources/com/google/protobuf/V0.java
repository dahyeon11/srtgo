package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class V0 {

    /* renamed from: a, reason: collision with root package name */
    private static final S0 f26336a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final S0 f26337b = new U0();

    static S0 a() {
        return f26336a;
    }

    static S0 b() {
        return f26337b;
    }

    private static S0 c() {
        try {
            return (S0) T0.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
