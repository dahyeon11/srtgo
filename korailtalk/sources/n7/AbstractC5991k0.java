package n7;

import R6.AbstractC0747a;
import java.util.concurrent.CancellationException;

/* renamed from: n7.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5991k0 {
    public static final CancellationException CancellationException(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void addSuppressedThrowable(Throwable th, Throwable th2) {
        AbstractC0747a.addSuppressed(th, th2);
    }
}
