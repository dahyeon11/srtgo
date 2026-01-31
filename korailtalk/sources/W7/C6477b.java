package w7;

import R6.G;
import Y6.h;
import f7.l;
import f7.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n7.AbstractC6002q;
import n7.C5998o;
import n7.InterfaceC5996n;
import n7.W0;
import p7.AbstractC6072j;
import s7.AbstractC6244e;
import s7.H;
import s7.I;

/* renamed from: w7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6477b implements InterfaceC6476a {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37461c = AtomicReferenceFieldUpdater.newUpdater(C6477b.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f37462d = AtomicLongFieldUpdater.newUpdater(C6477b.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37463e = AtomicReferenceFieldUpdater.newUpdater(C6477b.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f37464f = AtomicLongFieldUpdater.newUpdater(C6477b.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37465g = AtomicIntegerFieldUpdater.newUpdater(C6477b.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    private final int f37466a;

    /* renamed from: b, reason: collision with root package name */
    private final l f37467b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* renamed from: w7.b$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements p {
        public static final a INSTANCE = new a();

        a() {
            super(2, AbstractC6478c.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (C6479d) obj2);
        }

        public final C6479d invoke(long j8, C6479d c6479d) {
            return AbstractC6478c.a(j8, c6479d);
        }
    }

    /* renamed from: w7.b$b, reason: collision with other inner class name */
    static final class C0432b extends Lambda implements l {
        C0432b() {
            super(1);
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return G.INSTANCE;
        }

        public final void invoke(Throwable th) {
            C6477b.this.release();
        }
    }

    /* renamed from: w7.b$c */
    /* synthetic */ class c extends FunctionReferenceImpl implements p {
        public static final c INSTANCE = new c();

        c() {
            super(2, AbstractC6478c.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (C6479d) obj2);
        }

        public final C6479d invoke(long j8, C6479d c6479d) {
            return AbstractC6478c.a(j8, c6479d);
        }
    }

    public C6477b(int i8, int i9) {
        this.f37466a = i8;
        if (i8 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i8).toString());
        }
        if (i9 < 0 || i9 > i8) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i8).toString());
        }
        C6479d c6479d = new C6479d(0L, null, 2);
        this.head = c6479d;
        this.tail = c6479d;
        this._availablePermits = i8 - i9;
        this.f37467b = new C0432b();
    }

    static /* synthetic */ Object b(C6477b c6477b, W6.d dVar) {
        if (c6477b.f() > 0) {
            return G.INSTANCE;
        }
        Object objC = c6477b.c(dVar);
        return objC == X6.b.getCOROUTINE_SUSPENDED() ? objC : G.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(W6.d dVar) {
        C5998o orCreateCancellableContinuation = AbstractC6002q.getOrCreateCancellableContinuation(X6.b.intercepted(dVar));
        try {
            if (!d(orCreateCancellableContinuation)) {
                a(orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            return result == X6.b.getCOROUTINE_SUSPENDED() ? result : G.INSTANCE;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(W0 w02) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37463e;
        C6479d c6479d = (C6479d) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f37464f.getAndIncrement(this);
        a aVar = a.INSTANCE;
        long j8 = andIncrement / AbstractC6478c.f37474f;
        loop0: while (true) {
            objFindSegmentInternal = AbstractC6244e.findSegmentInternal(c6479d, j8, aVar);
            if (!I.m578isClosedimpl(objFindSegmentInternal)) {
                H hM576getSegmentimpl = I.m576getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    H h8 = (H) atomicReferenceFieldUpdater.get(this);
                    if (h8.id >= hM576getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!hM576getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, h8, hM576getSegmentimpl)) {
                        if (h8.decPointers$kotlinx_coroutines_core()) {
                            h8.remove();
                        }
                    } else if (hM576getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        hM576getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        C6479d c6479d2 = (C6479d) I.m576getSegmentimpl(objFindSegmentInternal);
        int i8 = (int) (andIncrement % AbstractC6478c.f37474f);
        if (AbstractC6072j.a(c6479d2.getAcquirers(), i8, null, w02)) {
            w02.invokeOnCancellation(c6479d2, i8);
            return true;
        }
        if (!AbstractC6072j.a(c6479d2.getAcquirers(), i8, AbstractC6478c.f37470b, AbstractC6478c.f37471c)) {
            return false;
        }
        if (w02 instanceof InterfaceC5996n) {
            Intrinsics.checkNotNull(w02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC5996n) w02).resume(G.INSTANCE, this.f37467b);
        } else {
            if (!(w02 instanceof v7.l)) {
                throw new IllegalStateException(("unexpected: " + w02).toString());
            }
            ((v7.l) w02).selectInRegistrationPhase(G.INSTANCE);
        }
        return true;
    }

    private final void e() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        int i9;
        do {
            atomicIntegerFieldUpdater = f37465g;
            i8 = atomicIntegerFieldUpdater.get(this);
            i9 = this.f37466a;
            if (i8 <= i9) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, i9));
    }

    private final int f() {
        int andDecrement;
        do {
            andDecrement = f37465g.getAndDecrement(this);
        } while (andDecrement > this.f37466a);
        return andDecrement;
    }

    private final boolean g(Object obj) {
        if (!(obj instanceof InterfaceC5996n)) {
            if (obj instanceof v7.l) {
                return ((v7.l) obj).trySelect(this, G.INSTANCE);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC5996n interfaceC5996n = (InterfaceC5996n) obj;
        Object objTryResume = interfaceC5996n.tryResume(G.INSTANCE, null, this.f37467b);
        if (objTryResume == null) {
            return false;
        }
        interfaceC5996n.completeResume(objTryResume);
        return true;
    }

    private final boolean h() {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37461c;
        C6479d c6479d = (C6479d) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f37462d.getAndIncrement(this);
        long j8 = andIncrement / AbstractC6478c.f37474f;
        c cVar = c.INSTANCE;
        loop0: while (true) {
            objFindSegmentInternal = AbstractC6244e.findSegmentInternal(c6479d, j8, cVar);
            if (I.m578isClosedimpl(objFindSegmentInternal)) {
                break;
            }
            H hM576getSegmentimpl = I.m576getSegmentimpl(objFindSegmentInternal);
            while (true) {
                H h8 = (H) atomicReferenceFieldUpdater.get(this);
                if (h8.id >= hM576getSegmentimpl.id) {
                    break loop0;
                }
                if (!hM576getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, h8, hM576getSegmentimpl)) {
                    if (h8.decPointers$kotlinx_coroutines_core()) {
                        h8.remove();
                    }
                } else if (hM576getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    hM576getSegmentimpl.remove();
                }
            }
        }
        C6479d c6479d2 = (C6479d) I.m576getSegmentimpl(objFindSegmentInternal);
        c6479d2.cleanPrev();
        if (c6479d2.id > j8) {
            return false;
        }
        int i8 = (int) (andIncrement % AbstractC6478c.f37474f);
        Object andSet = c6479d2.getAcquirers().getAndSet(i8, AbstractC6478c.f37470b);
        if (andSet != null) {
            if (andSet == AbstractC6478c.f37473e) {
                return false;
            }
            return g(andSet);
        }
        int i9 = AbstractC6478c.f37469a;
        for (int i10 = 0; i10 < i9; i10++) {
            if (c6479d2.getAcquirers().get(i8) == AbstractC6478c.f37471c) {
                return true;
            }
        }
        return !AbstractC6072j.a(c6479d2.getAcquirers(), i8, AbstractC6478c.f37470b, AbstractC6478c.f37472d);
    }

    protected final void a(InterfaceC5996n interfaceC5996n) {
        while (f() <= 0) {
            Intrinsics.checkNotNull(interfaceC5996n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (d((W0) interfaceC5996n)) {
                return;
            }
        }
        interfaceC5996n.resume(G.INSTANCE, this.f37467b);
    }

    @Override // w7.InterfaceC6476a
    public Object acquire(W6.d<? super G> dVar) {
        return b(this, dVar);
    }

    @Override // w7.InterfaceC6476a
    public int getAvailablePermits() {
        return Math.max(f37465g.get(this), 0);
    }

    @Override // w7.InterfaceC6476a
    public void release() {
        do {
            int andIncrement = f37465g.getAndIncrement(this);
            if (andIncrement >= this.f37466a) {
                e();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f37466a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!h());
    }

    @Override // w7.InterfaceC6476a
    public boolean tryAcquire() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37465g;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > this.f37466a) {
                e();
            } else {
                if (i8 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    return true;
                }
            }
        }
    }
}
