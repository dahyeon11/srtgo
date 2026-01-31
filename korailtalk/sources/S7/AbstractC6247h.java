package s7;

import java.util.Collection;
import java.util.ServiceLoader;

/* renamed from: s7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6247h {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection f36345a = k7.p.toList(k7.p.asSequence(ServiceLoader.load(n7.J.class, n7.J.class.getClassLoader()).iterator()));

    public static final void ensurePlatformExceptionHandlerLoaded(n7.J j8) {
        if (!f36345a.contains(j8)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader");
        }
    }

    public static final Collection<n7.J> getPlatformExceptionHandlers() {
        return f36345a;
    }

    public static final void propagateExceptionFinalResort(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
