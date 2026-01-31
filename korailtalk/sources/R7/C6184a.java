package r7;

import java.util.concurrent.CancellationException;
import q7.InterfaceC6148j;

/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6184a extends CancellationException {
    public final transient InterfaceC6148j owner;

    public C6184a(InterfaceC6148j interfaceC6148j) {
        super("Flow was aborted, no more elements needed");
        this.owner = interfaceC6148j;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
