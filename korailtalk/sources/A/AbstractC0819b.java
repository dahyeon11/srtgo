package a;

import Q7.C;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0819b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5754a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement a(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f5754a + C.PACKAGE_SEPARATOR_CHAR + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final String getARTIFICIAL_FRAME_PACKAGE_NAME() {
        return f5754a;
    }
}
