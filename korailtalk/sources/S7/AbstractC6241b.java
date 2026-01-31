package s7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: s7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6241b extends AbstractC6237D {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36339a = AtomicReferenceFieldUpdater.newUpdater(AbstractC6241b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC6240a.NO_DECISION;

    private final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36339a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC6240a.NO_DECISION;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract void complete(Object obj, Object obj2);

    @Override // s7.AbstractC6237D
    public final Object perform(Object obj) {
        Object objA = f36339a.get(this);
        if (objA == AbstractC6240a.NO_DECISION) {
            objA = a(prepare(obj));
        }
        complete(obj, objA);
        return objA;
    }

    public abstract Object prepare(Object obj);

    @Override // s7.AbstractC6237D
    public AbstractC6241b getAtomicOp() {
        return this;
    }
}
