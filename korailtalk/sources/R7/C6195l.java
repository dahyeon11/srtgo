package r7;

import java.util.concurrent.CancellationException;

/* renamed from: r7.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6195l extends CancellationException {
    public C6195l() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
