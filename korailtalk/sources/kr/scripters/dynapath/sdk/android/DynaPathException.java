package kr.scripters.dynapath.sdk.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class DynaPathException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private int f33811a;

    public DynaPathException() {
    }

    public final int getCode() {
        return this.f33811a;
    }

    public final void setCode(int i8) {
        this.f33811a = i8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynaPathException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynaPathException(int i8, String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f33811a = i8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynaPathException(String message, Throwable cause) {
        super(message, cause);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynaPathException(int i8, String message, Throwable cause) {
        super(message, cause);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f33811a = i8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynaPathException(Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
