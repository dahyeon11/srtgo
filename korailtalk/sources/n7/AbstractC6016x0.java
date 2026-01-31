package n7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* renamed from: n7.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6016x0 {
    /* renamed from: Job, reason: collision with other method in class */
    public static final InterfaceC6019z m528Job(InterfaceC6008t0 interfaceC6008t0) {
        return z0.m530Job(interfaceC6008t0);
    }

    public static final Object cancelAndJoin(InterfaceC6008t0 interfaceC6008t0, W6.d<? super R6.G> dVar) {
        return z0.cancelAndJoin(interfaceC6008t0, dVar);
    }

    public static final void cancelFutureOnCancellation(InterfaceC5996n interfaceC5996n, Future<?> future) {
        AbstractC6018y0.cancelFutureOnCancellation(interfaceC5996n, future);
    }

    public static final InterfaceC5973b0 cancelFutureOnCompletion(InterfaceC6008t0 interfaceC6008t0, Future<?> future) {
        return AbstractC6018y0.cancelFutureOnCompletion(interfaceC6008t0, future);
    }

    public static final InterfaceC5973b0 disposeOnCompletion(InterfaceC6008t0 interfaceC6008t0, InterfaceC5973b0 interfaceC5973b0) {
        return z0.disposeOnCompletion(interfaceC6008t0, interfaceC5973b0);
    }

    public static final void ensureActive(W6.g gVar) {
        z0.ensureActive(gVar);
    }

    public static final InterfaceC6008t0 getJob(W6.g gVar) {
        return z0.getJob(gVar);
    }

    public static final boolean isActive(W6.g gVar) {
        return z0.isActive(gVar);
    }

    public static final void cancel(W6.g gVar, CancellationException cancellationException) {
        z0.cancel(gVar, cancellationException);
    }

    public static final void ensureActive(InterfaceC6008t0 interfaceC6008t0) {
        z0.ensureActive(interfaceC6008t0);
    }

    public static final void cancel(InterfaceC6008t0 interfaceC6008t0, String str, Throwable th) {
        z0.cancel(interfaceC6008t0, str, th);
    }

    public static final void cancelChildren(W6.g gVar, CancellationException cancellationException) {
        z0.cancelChildren(gVar, cancellationException);
    }

    public static final void cancelChildren(InterfaceC6008t0 interfaceC6008t0, CancellationException cancellationException) {
        z0.cancelChildren(interfaceC6008t0, cancellationException);
    }
}
