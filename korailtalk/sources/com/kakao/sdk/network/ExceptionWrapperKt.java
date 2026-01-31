package com.kakao.sdk.network;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ExceptionWrapperKt {
    public static final Throwable getOrigin(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return th instanceof ExceptionWrapper ? ((ExceptionWrapper) th).getOrigin() : th;
    }
}
