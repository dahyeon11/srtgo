package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class Lz0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Jz0 f14506a;

    /* renamed from: b, reason: collision with root package name */
    private static final Jz0 f14507b;

    static {
        Jz0 jz0 = null;
        try {
            jz0 = (Jz0) Class.forName("com.google.protobuf.E0").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f14506a = jz0;
        f14507b = new Jz0();
    }

    static Jz0 a() {
        return f14506a;
    }

    static Jz0 b() {
        return f14507b;
    }
}
