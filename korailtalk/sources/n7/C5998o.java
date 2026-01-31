package n7;

import R6.C0751e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import n7.InterfaceC6008t0;
import s7.C6251l;

/* renamed from: n7.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5998o extends Y implements InterfaceC5996n, Y6.e, W0 {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34344c = AtomicIntegerFieldUpdater.newUpdater(C5998o.class, "_decisionAndIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34345d = AtomicReferenceFieldUpdater.newUpdater(C5998o.class, Object.class, "_state");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34346e = AtomicReferenceFieldUpdater.newUpdater(C5998o.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: a, reason: collision with root package name */
    private final W6.d f34347a;

    /* renamed from: b, reason: collision with root package name */
    private final W6.g f34348b;

    public C5998o(W6.d<Object> dVar, int i8) {
        super(i8);
        this.f34347a = dVar;
        this.f34348b = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C5976d.INSTANCE;
    }

    private final Void a(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void b(s7.H h8, Throwable th) {
        int i8 = f34344c.get(this) & 536870911;
        if (i8 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            h8.onCancellation(i8, th, getContext());
        } catch (Throwable th2) {
            K.handleCoroutineException(getContext(), new C5969E("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean c(Throwable th) {
        if (!isReusable()) {
            return false;
        }
        W6.d dVar = this.f34347a;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C6251l) dVar).postponeCancellation(th);
    }

    private final void d() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    private final void e(int i8) {
        if (p()) {
            return;
        }
        Z.dispatch(this, i8);
    }

    private final InterfaceC5973b0 f() {
        return (InterfaceC5973b0) f34346e.get(this);
    }

    private final String g() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return state$kotlinx_coroutines_core instanceof I0 ? "Active" : state$kotlinx_coroutines_core instanceof r ? "Cancelled" : "Completed";
    }

    private final InterfaceC5973b0 h() {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) getContext().get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 == null) {
            return null;
        }
        InterfaceC5973b0 interfaceC5973b0InvokeOnCompletion$default = InterfaceC6008t0.a.invokeOnCompletion$default(interfaceC6008t0, true, false, new C6005s(this), 2, null);
        androidx.concurrent.futures.b.a(f34346e, this, null, interfaceC5973b0InvokeOnCompletion$default);
        return interfaceC5973b0InvokeOnCompletion$default;
    }

    private final void i(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34345d;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C5976d)) {
                if (obj2 instanceof AbstractC5992l ? true : obj2 instanceof s7.H) {
                    k(obj, obj2);
                } else {
                    if (obj2 instanceof C5966B) {
                        C5966B c5966b = (C5966B) obj2;
                        if (!c5966b.makeHandled()) {
                            k(obj, obj2);
                        }
                        if (obj2 instanceof r) {
                            if (!(obj2 instanceof C5966B)) {
                                c5966b = null;
                            }
                            Throwable th = c5966b != null ? c5966b.cause : null;
                            if (obj instanceof AbstractC5992l) {
                                callCancelHandler((AbstractC5992l) obj, th);
                                return;
                            } else {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                b((s7.H) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C5965A) {
                        C5965A c5965a = (C5965A) obj2;
                        if (c5965a.cancelHandler != null) {
                            k(obj, obj2);
                        }
                        if (obj instanceof s7.H) {
                            return;
                        }
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC5992l abstractC5992l = (AbstractC5992l) obj;
                        if (c5965a.getCancelled()) {
                            callCancelHandler(abstractC5992l, c5965a.cancelCause);
                            return;
                        } else {
                            if (androidx.concurrent.futures.b.a(f34345d, this, obj2, C5965A.copy$default(c5965a, null, abstractC5992l, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof s7.H) {
                            return;
                        }
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f34345d, this, obj2, new C5965A(obj2, (AbstractC5992l) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (androidx.concurrent.futures.b.a(f34345d, this, obj2, obj)) {
                return;
            }
        }
    }

    private final boolean isReusable() {
        if (Z.isReusableMode(this.resumeMode)) {
            W6.d dVar = this.f34347a;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C6251l) dVar).isReusable()) {
                return true;
            }
        }
        return false;
    }

    private final AbstractC5992l j(f7.l lVar) {
        return lVar instanceof AbstractC5992l ? (AbstractC5992l) lVar : new C6003q0(lVar);
    }

    private final void k(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void m(Object obj, int i8, f7.l lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34345d;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof I0)) {
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.makeResumed()) {
                        if (lVar != null) {
                            callOnCancellation(lVar, rVar.cause);
                            return;
                        }
                        return;
                    }
                }
                a(obj);
                throw new C0751e();
            }
        } while (!androidx.concurrent.futures.b.a(f34345d, this, obj2, o((I0) obj2, obj, i8, lVar, null)));
        d();
        e(i8);
    }

    static /* synthetic */ void n(C5998o c5998o, Object obj, int i8, f7.l lVar, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i9 & 4) != 0) {
            lVar = null;
        }
        c5998o.m(obj, i8, lVar);
    }

    private final Object o(I0 i02, Object obj, int i8, f7.l lVar, Object obj2) {
        if (obj instanceof C5966B) {
            return obj;
        }
        if (!Z.isCancellableMode(i8) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(i02 instanceof AbstractC5992l) && obj2 == null) {
            return obj;
        }
        return new C5965A(obj, i02 instanceof AbstractC5992l ? (AbstractC5992l) i02 : null, lVar, obj2, null, 16, null);
    }

    private final boolean p() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34344c;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f34344c.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
        return true;
    }

    private final s7.K q(Object obj, Object obj2, f7.l lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34345d;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof I0)) {
                if ((obj3 instanceof C5965A) && obj2 != null && ((C5965A) obj3).idempotentResume == obj2) {
                    return AbstractC6000p.RESUME_TOKEN;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f34345d, this, obj3, o((I0) obj3, obj, this.resumeMode, lVar, obj2)));
        d();
        return AbstractC6000p.RESUME_TOKEN;
    }

    private final boolean r() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34344c;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f34344c.compareAndSet(this, i8, 536870912 + (536870911 & i8)));
        return true;
    }

    public final void callCancelHandler(AbstractC5992l abstractC5992l, Throwable th) {
        try {
            abstractC5992l.invoke(th);
        } catch (Throwable th2) {
            K.handleCoroutineException(getContext(), new C5969E("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void callOnCancellation(f7.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            K.handleCoroutineException(getContext(), new C5969E("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // n7.InterfaceC5996n
    public boolean cancel(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34345d;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof I0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f34345d, this, obj, new r(this, th, (obj instanceof AbstractC5992l) || (obj instanceof s7.H))));
        I0 i02 = (I0) obj;
        if (i02 instanceof AbstractC5992l) {
            callCancelHandler((AbstractC5992l) obj, th);
        } else if (i02 instanceof s7.H) {
            b((s7.H) obj, th);
        }
        d();
        e(this.resumeMode);
        return true;
    }

    @Override // n7.Y
    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34345d;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof I0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C5966B) {
                return;
            }
            if (obj2 instanceof C5965A) {
                C5965A c5965a = (C5965A) obj2;
                if (c5965a.getCancelled()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (androidx.concurrent.futures.b.a(f34345d, this, obj2, C5965A.copy$default(c5965a, null, null, null, null, th, 15, null))) {
                    c5965a.invokeHandlers(this, th);
                    return;
                }
            } else {
                if (androidx.concurrent.futures.b.a(f34345d, this, obj2, new C5965A(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            }
        }
    }

    @Override // n7.InterfaceC5996n
    public void completeResume(Object obj) {
        e(this.resumeMode);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        InterfaceC5973b0 interfaceC5973b0F = f();
        if (interfaceC5973b0F == null) {
            return;
        }
        interfaceC5973b0F.dispose();
        f34346e.set(this, H0.INSTANCE);
    }

    @Override // Y6.e
    public Y6.e getCallerFrame() {
        W6.d dVar = this.f34347a;
        if (dVar instanceof Y6.e) {
            return (Y6.e) dVar;
        }
        return null;
    }

    @Override // n7.InterfaceC5996n, W6.d
    public W6.g getContext() {
        return this.f34348b;
    }

    public Throwable getContinuationCancellationCause(InterfaceC6008t0 interfaceC6008t0) {
        return interfaceC6008t0.getCancellationException();
    }

    @Override // n7.Y
    public final W6.d<Object> getDelegate$kotlinx_coroutines_core() {
        return this.f34347a;
    }

    @Override // n7.Y
    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public final Object getResult() {
        InterfaceC6008t0 interfaceC6008t0;
        boolean zIsReusable = isReusable();
        if (r()) {
            if (f() == null) {
                h();
            }
            if (zIsReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return X6.b.getCOROUTINE_SUSPENDED();
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof C5966B) {
            throw ((C5966B) state$kotlinx_coroutines_core).cause;
        }
        if (!Z.isCancellableMode(this.resumeMode) || (interfaceC6008t0 = (InterfaceC6008t0) getContext().get(InterfaceC6008t0.Key)) == null || interfaceC6008t0.isActive()) {
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        CancellationException cancellationException = interfaceC6008t0.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
        throw cancellationException;
    }

    @Override // Y6.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object getState$kotlinx_coroutines_core() {
        return f34345d.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n7.Y
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof C5965A ? (T) ((C5965A) obj).result : obj;
    }

    @Override // n7.InterfaceC5996n
    public void initCancellability() {
        InterfaceC5973b0 interfaceC5973b0H = h();
        if (interfaceC5973b0H != null && isCompleted()) {
            interfaceC5973b0H.dispose();
            f34346e.set(this, H0.INSTANCE);
        }
    }

    @Override // n7.W0
    public void invokeOnCancellation(s7.H h8, int i8) {
        int i9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34344c;
        do {
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i8));
        i(h8);
    }

    @Override // n7.InterfaceC5996n
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof I0;
    }

    @Override // n7.InterfaceC5996n
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof r;
    }

    @Override // n7.InterfaceC5996n
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof I0);
    }

    protected String l() {
        return "CancellableContinuation";
    }

    public final void parentCancelled$kotlinx_coroutines_core(Throwable th) {
        if (c(th)) {
            return;
        }
        cancel(th);
        d();
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable thTryReleaseClaimedContinuation;
        W6.d dVar = this.f34347a;
        C6251l c6251l = dVar instanceof C6251l ? (C6251l) dVar : null;
        if (c6251l == null || (thTryReleaseClaimedContinuation = c6251l.tryReleaseClaimedContinuation(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(thTryReleaseClaimedContinuation);
    }

    public final boolean resetStateReusable() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34345d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C5965A) && ((C5965A) obj).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        f34344c.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C5976d.INSTANCE);
        return true;
    }

    @Override // n7.InterfaceC5996n
    public void resume(Object obj, f7.l lVar) {
        m(obj, this.resumeMode, lVar);
    }

    @Override // n7.InterfaceC5996n
    public void resumeUndispatched(I i8, Object obj) {
        W6.d dVar = this.f34347a;
        C6251l c6251l = dVar instanceof C6251l ? (C6251l) dVar : null;
        n(this, obj, (c6251l != null ? c6251l.dispatcher : null) == i8 ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // n7.InterfaceC5996n
    public void resumeUndispatchedWithException(I i8, Throwable th) {
        W6.d dVar = this.f34347a;
        byte b9 = 0;
        C6251l c6251l = dVar instanceof C6251l ? (C6251l) dVar : null;
        n(this, new C5966B(th, false, 2, b9 == true ? 1 : 0), (c6251l != null ? c6251l.dispatcher : null) == i8 ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // n7.InterfaceC5996n, W6.d
    public void resumeWith(Object obj) {
        n(this, F.toState(obj, this), this.resumeMode, null, 4, null);
    }

    @Override // n7.Y
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    public String toString() {
        return l() + '(' + P.toDebugString(this.f34347a) + "){" + g() + "}@" + P.getHexAddress(this);
    }

    @Override // n7.InterfaceC5996n
    public Object tryResume(Object obj, Object obj2) {
        return q(obj, obj2, null);
    }

    @Override // n7.InterfaceC5996n
    public Object tryResumeWithException(Throwable th) {
        return q(new C5966B(th, false, 2, null), null, null);
    }

    @Override // n7.InterfaceC5996n
    public Object tryResume(Object obj, Object obj2, f7.l lVar) {
        return q(obj, obj2, lVar);
    }

    @Override // n7.InterfaceC5996n
    public void invokeOnCancellation(f7.l lVar) {
        i(j(lVar));
    }
}
