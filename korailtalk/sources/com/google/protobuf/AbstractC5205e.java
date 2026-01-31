package com.google.protobuf;

/* renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5205e {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f26404a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f26405b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f26406c;

    static {
        f26406c = (f26404a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f26405b;
    }

    static boolean c() {
        return f26404a || !(f26405b == null || f26406c);
    }
}
