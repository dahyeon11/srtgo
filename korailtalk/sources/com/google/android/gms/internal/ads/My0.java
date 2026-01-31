package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class My0 {

    /* renamed from: a */
    private static final Jy0 f14756a = new Ly0();

    /* renamed from: b */
    private static final Jy0 f14757b;

    static {
        Jy0 jy0 = null;
        try {
            jy0 = (Jy0) Class.forName("com.google.protobuf.O").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f14757b = jy0;
    }

    static Jy0 a() {
        Jy0 jy0 = f14757b;
        if (jy0 != null) {
            return jy0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static Jy0 b() {
        return f14756a;
    }
}
