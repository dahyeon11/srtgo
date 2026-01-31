package n7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n7.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5966B {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34272a = AtomicIntegerFieldUpdater.newUpdater(C5966B.class, "_handled");
    private volatile int _handled;
    public final Throwable cause;

    public C5966B(Throwable th, boolean z8) {
        this.cause = th;
        this._handled = z8 ? 1 : 0;
    }

    public final boolean getHandled() {
        return f34272a.get(this) != 0;
    }

    public final boolean makeHandled() {
        return f34272a.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return P.getClassSimpleName(this) + '[' + this.cause + ']';
    }

    public /* synthetic */ C5966B(Throwable th, boolean z8, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i8 & 2) != 0 ? false : z8);
    }
}
