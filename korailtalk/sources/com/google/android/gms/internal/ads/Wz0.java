package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class Wz0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Vz0 f17088a;

    /* renamed from: b, reason: collision with root package name */
    private static final Vz0 f17089b;

    static {
        Vz0 vz0 = null;
        try {
            vz0 = (Vz0) Class.forName("com.google.protobuf.T0").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f17088a = vz0;
        f17089b = new Vz0();
    }

    static Vz0 a() {
        return f17088a;
    }

    static Vz0 b() {
        return f17089b;
    }
}
