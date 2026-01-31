package n7;

import f7.InterfaceC5519a;
import u7.ExecutorC6421a;

/* renamed from: n7.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5987i0 {
    public static final AbstractC5981f0 createEventLoop() {
        return new C5980f(Thread.currentThread());
    }

    public static final boolean isIoDispatcherThread(Thread thread) {
        if (thread instanceof ExecutorC6421a.c) {
            return ((ExecutorC6421a.c) thread).isIo();
        }
        return false;
    }

    public static final void platformAutoreleasePool(InterfaceC5519a interfaceC5519a) {
        interfaceC5519a.invoke();
    }

    public static final long processNextEventInCurrentThread() {
        AbstractC5981f0 abstractC5981f0CurrentOrNull$kotlinx_coroutines_core = R0.INSTANCE.currentOrNull$kotlinx_coroutines_core();
        if (abstractC5981f0CurrentOrNull$kotlinx_coroutines_core != null) {
            return abstractC5981f0CurrentOrNull$kotlinx_coroutines_core.processNextEvent();
        }
        return Long.MAX_VALUE;
    }

    public static final long runSingleTaskFromCurrentSystemDispatcher() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof ExecutorC6421a.c) {
            return ((ExecutorC6421a.c) threadCurrentThread).runSingleTask();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + threadCurrentThread);
    }
}
