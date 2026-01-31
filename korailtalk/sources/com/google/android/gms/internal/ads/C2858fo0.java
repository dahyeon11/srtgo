package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.fo0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2858fo0 extends TimeoutException {
    /* synthetic */ C2858fo0(String str, AbstractC2743eo0 abstractC2743eo0) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
