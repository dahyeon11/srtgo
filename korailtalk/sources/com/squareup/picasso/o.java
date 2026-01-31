package com.squareup.picasso;

/* loaded from: classes.dex */
public enum o {
    NO_CACHE(1),
    NO_STORE(2);


    /* renamed from: a, reason: collision with root package name */
    final int f29826a;

    o(int i8) {
        this.f29826a = i8;
    }

    static boolean a(int i8) {
        return (i8 & NO_CACHE.f29826a) == 0;
    }

    static boolean b(int i8) {
        return (i8 & NO_STORE.f29826a) == 0;
    }
}
