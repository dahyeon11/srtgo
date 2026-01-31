package n7;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n7.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6010u0 extends CancellationException implements G {
    public final transient InterfaceC6008t0 job;

    public C6010u0(String str, Throwable th, InterfaceC6008t0 interfaceC6008t0) {
        super(str);
        this.job = interfaceC6008t0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C6010u0) {
                C6010u0 c6010u0 = (C6010u0) obj;
                if (!Intrinsics.areEqual(c6010u0.getMessage(), getMessage()) || !Intrinsics.areEqual(c6010u0.job, this.job) || !Intrinsics.areEqual(c6010u0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }

    @Override // n7.G
    public C6010u0 createCopy() {
        return null;
    }
}
