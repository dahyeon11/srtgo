package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    private static final D0 f26148a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final D0 f26149b = new F0();

    static D0 a() {
        return f26148a;
    }

    static D0 b() {
        return f26149b;
    }

    private static D0 c() {
        try {
            return (D0) E0.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
