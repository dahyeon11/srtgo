package com.squareup.picasso;

/* loaded from: classes.dex */
public enum p {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);


    /* renamed from: a, reason: collision with root package name */
    final int f29828a;

    p(int i8) {
        this.f29828a = i8;
    }

    public static boolean isOfflineOnly(int i8) {
        return (i8 & OFFLINE.f29828a) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i8) {
        return (i8 & NO_CACHE.f29828a) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i8) {
        return (i8 & NO_STORE.f29828a) == 0;
    }
}
