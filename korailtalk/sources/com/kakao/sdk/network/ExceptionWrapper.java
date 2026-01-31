package com.kakao.sdk.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ExceptionWrapper extends IOException {
    private final Throwable origin;

    public ExceptionWrapper(Throwable origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    public final Throwable getOrigin() {
        return this.origin;
    }
}
