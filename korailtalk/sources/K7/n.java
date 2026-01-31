package k7;

import R6.G;
import R6.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
final class n extends o implements Iterator, W6.d, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    private int f33703a;

    /* renamed from: b, reason: collision with root package name */
    private Object f33704b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f33705c;

    /* renamed from: d, reason: collision with root package name */
    private W6.d f33706d;

    private final Throwable a() {
        int i8 = this.f33703a;
        if (i8 == 4) {
            return new NoSuchElementException();
        }
        if (i8 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f33703a);
    }

    private final Object b() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // W6.d
    public W6.g getContext() {
        return W6.h.INSTANCE;
    }

    public final W6.d<G> getNextStep() {
        return this.f33706d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i8 = this.f33703a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        return true;
                    }
                    if (i8 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f33705c;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.f33703a = 2;
                    return true;
                }
                this.f33705c = null;
            }
            this.f33703a = 5;
            W6.d dVar = this.f33706d;
            Intrinsics.checkNotNull(dVar);
            this.f33706d = null;
            q.a aVar = R6.q.Companion;
            dVar.resumeWith(R6.q.m67constructorimpl(G.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i8 = this.f33703a;
        if (i8 == 0 || i8 == 1) {
            return b();
        }
        if (i8 == 2) {
            this.f33703a = 1;
            Iterator it = this.f33705c;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i8 != 3) {
            throw a();
        }
        this.f33703a = 0;
        Object obj = this.f33704b;
        this.f33704b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // W6.d
    public void resumeWith(Object obj) throws Throwable {
        R6.r.throwOnFailure(obj);
        this.f33703a = 4;
    }

    public final void setNextStep(W6.d<? super G> dVar) {
        this.f33706d = dVar;
    }

    @Override // k7.o
    public Object yield(Object obj, W6.d<? super G> dVar) {
        this.f33704b = obj;
        this.f33703a = 3;
        this.f33706d = dVar;
        Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return coroutine_suspended == X6.b.getCOROUTINE_SUSPENDED() ? coroutine_suspended : G.INSTANCE;
    }

    @Override // k7.o
    public Object yieldAll(Iterator<Object> it, W6.d<? super G> dVar) {
        if (!it.hasNext()) {
            return G.INSTANCE;
        }
        this.f33705c = it;
        this.f33703a = 2;
        this.f33706d = dVar;
        Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return coroutine_suspended == X6.b.getCOROUTINE_SUSPENDED() ? coroutine_suspended : G.INSTANCE;
    }
}
