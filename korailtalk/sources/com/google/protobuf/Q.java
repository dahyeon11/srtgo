package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final N f26275a = new P();

    /* renamed from: b, reason: collision with root package name */
    private static final N f26276b = c();

    static N a() {
        N n8 = f26276b;
        if (n8 != null) {
            return n8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static N b() {
        return f26275a;
    }

    private static N c() {
        try {
            int i8 = O.f26236b;
            return (N) O.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
