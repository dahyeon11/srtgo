package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class L {

    /* renamed from: a, reason: collision with root package name */
    static final Class f26187a = c();

    private static final M a(String str) {
        Class cls = f26187a;
        if (cls == null) {
            return null;
        }
        try {
            return (M) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean b(M m8) {
        Class cls = f26187a;
        return cls != null && cls.isAssignableFrom(m8.getClass());
    }

    static Class c() {
        try {
            K k8 = K.f26173j;
            return K.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static M create() {
        M mA = a("newInstance");
        return mA != null ? mA : new M();
    }

    public static M createEmpty() {
        M mA = a("getEmptyRegistry");
        return mA != null ? mA : M.f26215e;
    }
}
