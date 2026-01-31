package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class B extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f25737a;

    B(String str) {
        super(str);
        this.f25737a = a(str);
    }

    private final int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }

    public final int getErrorCode() {
        return this.f25737a;
    }
}
