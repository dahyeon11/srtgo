package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class I {

    /* renamed from: a, reason: collision with root package name */
    private static List f31968a;

    /* renamed from: b, reason: collision with root package name */
    private static List f31969b;

    /* renamed from: c, reason: collision with root package name */
    private static List f31970c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f31971d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f31972e;

    static synchronized List a() {
        f31972e = true;
        return f31968a;
    }

    static synchronized List b() {
        f31972e = true;
        return f31969b;
    }

    static synchronized List c() {
        f31972e = true;
        return f31970c;
    }

    static synchronized void d(List list, List list2, List list3) {
        if (f31972e) {
            throw new IllegalStateException("Set cannot be called after any get call");
        }
        if (f31971d) {
            throw new IllegalStateException("Global interceptors and tracers are already set");
        }
        e3.w.checkNotNull(list);
        e3.w.checkNotNull(list2);
        e3.w.checkNotNull(list3);
        f31968a = Collections.unmodifiableList(new ArrayList(list));
        f31969b = Collections.unmodifiableList(new ArrayList(list2));
        f31970c = Collections.unmodifiableList(new ArrayList(list3));
        f31971d = true;
    }
}
