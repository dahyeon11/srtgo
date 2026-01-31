package n7;

import java.util.concurrent.Future;

/* renamed from: n7.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6018y0 {
    public static final void cancelFutureOnCancellation(InterfaceC5996n interfaceC5996n, Future<?> future) {
        interfaceC5996n.invokeOnCancellation(new C5988j(future));
    }

    public static final InterfaceC5973b0 cancelFutureOnCompletion(InterfaceC6008t0 interfaceC6008t0, Future<?> future) {
        return interfaceC6008t0.invokeOnCompletion(new C5990k(future));
    }
}
