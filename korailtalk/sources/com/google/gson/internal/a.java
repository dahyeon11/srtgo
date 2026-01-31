package com.google.gson.internal;

/* loaded from: classes2.dex */
public abstract class a {
    public static void checkArgument(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    @Deprecated
    public static <T> T checkNotNull(T t8) {
        t8.getClass();
        return t8;
    }
}
