package R6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: R6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0748b {
    public static void addSuppressed(Throwable th, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th != exception) {
            a7.b.IMPLEMENTATIONS.addSuppressed(th, exception);
        }
    }

    public static final StackTraceElement[] getStackTrace(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNull(stackTrace);
        return stackTrace;
    }

    public static final List<Throwable> getSuppressedExceptions(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return a7.b.IMPLEMENTATIONS.getSuppressed(th);
    }

    public static final String stackTraceToString(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th) {
    }

    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th) {
    }
}
