package q7;

import R6.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import n7.C5998o;
import r7.AbstractC6186c;
import r7.AbstractC6187d;

/* renamed from: q7.V */
/* loaded from: classes3.dex */
final class C6135V extends AbstractC6187d {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f35227a = AtomicReferenceFieldUpdater.newUpdater(C6135V.class, Object.class, "_state");
    private volatile Object _state;

    public final Object awaitPending(W6.d<? super R6.G> dVar) {
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        if (!androidx.concurrent.futures.b.a(f35227a, this, AbstractC6134U.f35225a, c5998o)) {
            q.a aVar = R6.q.Companion;
            c5998o.resumeWith(R6.q.m67constructorimpl(R6.G.INSTANCE));
        }
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
    }

    public final void makePending() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35227a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == AbstractC6134U.f35226b) {
                return;
            }
            if (obj == AbstractC6134U.f35225a) {
                if (androidx.concurrent.futures.b.a(f35227a, this, obj, AbstractC6134U.f35226b)) {
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f35227a, this, obj, AbstractC6134U.f35225a)) {
                q.a aVar = R6.q.Companion;
                ((C5998o) obj).resumeWith(R6.q.m67constructorimpl(R6.G.INSTANCE));
                return;
            }
        }
    }

    public final boolean takePending() {
        Object andSet = f35227a.getAndSet(this, AbstractC6134U.f35225a);
        Intrinsics.checkNotNull(andSet);
        return andSet == AbstractC6134U.f35226b;
    }

    @Override // r7.AbstractC6187d
    public boolean allocateLocked(C6133T c6133t) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35227a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, AbstractC6134U.f35225a);
        return true;
    }

    @Override // r7.AbstractC6187d
    public W6.d<R6.G>[] freeLocked(C6133T c6133t) {
        f35227a.set(this, null);
        return AbstractC6186c.EMPTY_RESUMES;
    }
}
