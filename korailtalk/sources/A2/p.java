package A2;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class p extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    private final int f73a;

    public p(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f73a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == p.class) {
            if (this == obj) {
                return true;
            }
            p pVar = (p) obj;
            if (this.f73a == pVar.f73a && get() == pVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f73a;
    }
}
