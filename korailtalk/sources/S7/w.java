package s7;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36370a = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_cur");
    private volatile Object _cur;

    public w(boolean z8) {
        this._cur = new x(8, z8);
    }

    public final boolean addLast(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36370a;
        while (true) {
            x xVar = (x) atomicReferenceFieldUpdater.get(this);
            int iAddLast = xVar.addLast(obj);
            if (iAddLast == 0) {
                return true;
            }
            if (iAddLast == 1) {
                androidx.concurrent.futures.b.a(f36370a, this, xVar, xVar.next());
            } else if (iAddLast == 2) {
                return false;
            }
        }
    }

    public final void close() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36370a;
        while (true) {
            x xVar = (x) atomicReferenceFieldUpdater.get(this);
            if (xVar.close()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f36370a, this, xVar, xVar.next());
            }
        }
    }

    public final int getSize() {
        return ((x) f36370a.get(this)).getSize();
    }

    public final boolean isClosed() {
        return ((x) f36370a.get(this)).isClosed();
    }

    public final boolean isEmpty() {
        return ((x) f36370a.get(this)).isEmpty();
    }

    public final <R> List<R> map(f7.l lVar) {
        return ((x) f36370a.get(this)).map(lVar);
    }

    public final Object removeFirstOrNull() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36370a;
        while (true) {
            x xVar = (x) atomicReferenceFieldUpdater.get(this);
            Object objRemoveFirstOrNull = xVar.removeFirstOrNull();
            if (objRemoveFirstOrNull != x.REMOVE_FROZEN) {
                return objRemoveFirstOrNull;
            }
            androidx.concurrent.futures.b.a(f36370a, this, xVar, xVar.next());
        }
    }
}
