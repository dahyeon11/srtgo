package s7;

import R6.C0751e;
import f7.InterfaceC5519a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6245f {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36342a = AtomicReferenceFieldUpdater.newUpdater(AbstractC6245f.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36343b = AtomicReferenceFieldUpdater.newUpdater(AbstractC6245f.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC6245f(AbstractC6245f abstractC6245f) {
        this._prev = abstractC6245f;
    }

    private final AbstractC6245f a() {
        AbstractC6245f prev = getPrev();
        while (prev != null && prev.isRemoved()) {
            prev = (AbstractC6245f) f36343b.get(prev);
        }
        return prev;
    }

    private final AbstractC6245f b() {
        AbstractC6245f next = getNext();
        Intrinsics.checkNotNull(next);
        while (next.isRemoved()) {
            AbstractC6245f next2 = next.getNext();
            if (next2 == null) {
                return next;
            }
            next = next2;
        }
        return next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c() {
        return f36342a.get(this);
    }

    public final void cleanPrev() {
        f36343b.lazySet(this, null);
    }

    public final AbstractC6245f getNext() {
        Object objC = c();
        if (objC == AbstractC6244e.f36341a) {
            return null;
        }
        return (AbstractC6245f) objC;
    }

    public final AbstractC6245f getPrev() {
        return (AbstractC6245f) f36343b.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        return androidx.concurrent.futures.b.a(f36342a, this, null, AbstractC6244e.f36341a);
    }

    public final AbstractC6245f nextOrIfClosed(InterfaceC5519a interfaceC5519a) {
        Object objC = c();
        if (objC != AbstractC6244e.f36341a) {
            return (AbstractC6245f) objC;
        }
        interfaceC5519a.invoke();
        throw new C0751e();
    }

    public final void remove() {
        Object obj;
        if (isTail()) {
            return;
        }
        while (true) {
            AbstractC6245f abstractC6245fA = a();
            AbstractC6245f abstractC6245fB = b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36343b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC6245fB);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC6245fB, obj, ((AbstractC6245f) obj) == null ? null : abstractC6245fA));
            if (abstractC6245fA != null) {
                f36342a.set(abstractC6245fA, abstractC6245fB);
            }
            if (!abstractC6245fB.isRemoved() || abstractC6245fB.isTail()) {
                if (abstractC6245fA == null || !abstractC6245fA.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(AbstractC6245f abstractC6245f) {
        return androidx.concurrent.futures.b.a(f36342a, this, null, abstractC6245f);
    }
}
