package n7;

import R6.AbstractC0747a;
import W6.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import n7.InterfaceC6008t0;
import s7.AbstractC6237D;
import s7.AbstractC6259u;
import s7.C6260v;

/* loaded from: classes3.dex */
public class B0 implements InterfaceC6008t0, InterfaceC6011v, J0 {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f34273a = AtomicReferenceFieldUpdater.newUpdater(B0.class, Object.class, "_state");

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f34274b = AtomicReferenceFieldUpdater.newUpdater(B0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    private static final class a extends C5998o {

        /* renamed from: f */
        private final B0 f34275f;

        public a(W6.d<Object> dVar, B0 b02) {
            super(dVar, 1);
            this.f34275f = b02;
        }

        @Override // n7.C5998o
        public Throwable getContinuationCancellationCause(InterfaceC6008t0 interfaceC6008t0) {
            Throwable rootCause;
            Object state$kotlinx_coroutines_core = this.f34275f.getState$kotlinx_coroutines_core();
            return (!(state$kotlinx_coroutines_core instanceof c) || (rootCause = ((c) state$kotlinx_coroutines_core).getRootCause()) == null) ? state$kotlinx_coroutines_core instanceof C5966B ? ((C5966B) state$kotlinx_coroutines_core).cause : interfaceC6008t0.getCancellationException() : rootCause;
        }

        @Override // n7.C5998o
        protected String l() {
            return "AwaitContinuation";
        }
    }

    private static final class b extends A0 {

        /* renamed from: d */
        private final B0 f34276d;

        /* renamed from: e */
        private final c f34277e;

        /* renamed from: f */
        private final C6009u f34278f;

        /* renamed from: g */
        private final Object f34279g;

        public b(B0 b02, c cVar, C6009u c6009u, Object obj) {
            this.f34276d = b02;
            this.f34277e = cVar;
            this.f34278f = c6009u;
            this.f34279g = obj;
        }

        @Override // n7.A0, n7.AbstractC5968D, f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return R6.G.INSTANCE;
        }

        @Override // n7.AbstractC5968D
        public void invoke(Throwable th) {
            this.f34276d.m(this.f34277e, this.f34278f, this.f34279g);
        }
    }

    private static final class c implements InterfaceC5999o0 {

        /* renamed from: b */
        private static final AtomicIntegerFieldUpdater f34280b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: c */
        private static final AtomicReferenceFieldUpdater f34281c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: d */
        private static final AtomicReferenceFieldUpdater f34282d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a */
        private final G0 f34283a;

        public c(G0 g02, boolean z8, Throwable th) {
            this.f34283a = g02;
            this._isCompleting = z8 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList a() {
            return new ArrayList(4);
        }

        private final Object b() {
            return f34282d.get(this);
        }

        private final void c(Object obj) {
            f34282d.set(this, obj);
        }

        public final void addExceptionLocked(Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
                return;
            }
            if (th == rootCause) {
                return;
            }
            Object objB = b();
            if (objB == null) {
                c(th);
                return;
            }
            if (objB instanceof Throwable) {
                if (th == objB) {
                    return;
                }
                ArrayList arrayListA = a();
                arrayListA.add(objB);
                arrayListA.add(th);
                c(arrayListA);
                return;
            }
            if (objB instanceof ArrayList) {
                ((ArrayList) objB).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objB).toString());
        }

        @Override // n7.InterfaceC5999o0
        public G0 getList() {
            return this.f34283a;
        }

        public final Throwable getRootCause() {
            return (Throwable) f34281c.get(this);
        }

        @Override // n7.InterfaceC5999o0
        public boolean isActive() {
            return getRootCause() == null;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        public final boolean isCompleting() {
            return f34280b.get(this) != 0;
        }

        public final boolean isSealed() {
            return b() == C0.f34298d;
        }

        public final List<Throwable> sealLocked(Throwable th) {
            ArrayList arrayListA;
            Object objB = b();
            if (objB == null) {
                arrayListA = a();
            } else if (objB instanceof Throwable) {
                ArrayList arrayListA2 = a();
                arrayListA2.add(objB);
                arrayListA = arrayListA2;
            } else {
                if (!(objB instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objB).toString());
                }
                arrayListA = (ArrayList) objB;
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayListA.add(0, rootCause);
            }
            if (th != null && !Intrinsics.areEqual(th, rootCause)) {
                arrayListA.add(th);
            }
            c(C0.f34298d);
            return arrayListA;
        }

        public final void setCompleting(boolean z8) {
            f34280b.set(this, z8 ? 1 : 0);
        }

        public final void setRootCause(Throwable th) {
            f34281c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + b() + ", list=" + getList() + ']';
        }
    }

    private final class d extends A0 {

        /* renamed from: d */
        private final v7.l f34284d;

        public d(v7.l lVar) {
            this.f34284d = lVar;
        }

        @Override // n7.A0, n7.AbstractC5968D, f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return R6.G.INSTANCE;
        }

        @Override // n7.AbstractC5968D
        public void invoke(Throwable th) {
            Object state$kotlinx_coroutines_core = B0.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof C5966B)) {
                state$kotlinx_coroutines_core = C0.unboxState(state$kotlinx_coroutines_core);
            }
            this.f34284d.trySelect(B0.this, state$kotlinx_coroutines_core);
        }
    }

    private final class e extends A0 {

        /* renamed from: d */
        private final v7.l f34286d;

        public e(v7.l lVar) {
            this.f34286d = lVar;
        }

        @Override // n7.A0, n7.AbstractC5968D, f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return R6.G.INSTANCE;
        }

        @Override // n7.AbstractC5968D
        public void invoke(Throwable th) {
            this.f34286d.trySelect(B0.this, R6.G.INSTANCE);
        }
    }

    public static final class f extends C6260v.a {

        /* renamed from: b */
        final /* synthetic */ B0 f34288b;

        /* renamed from: c */
        final /* synthetic */ Object f34289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C6260v c6260v, B0 b02, Object obj) {
            super(c6260v);
            this.f34288b = b02;
            this.f34289c = obj;
        }

        @Override // s7.AbstractC6241b
        public Object prepare(C6260v c6260v) {
            if (this.f34288b.getState$kotlinx_coroutines_core() == this.f34289c) {
                return null;
            }
            return AbstractC6259u.getCONDITION_FALSE();
        }
    }

    static final class g extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f34290c;

        /* renamed from: d */
        Object f34291d;

        /* renamed from: e */
        int f34292e;

        /* renamed from: f */
        private /* synthetic */ Object f34293f;

        g(W6.d dVar) {
            super(2, dVar);
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            g gVar = B0.this.new g(dVar);
            gVar.f34293f = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x006b -> B:57:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x007e -> B:57:0x0081). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r6.f34292e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f34291d
                s7.v r1 = (s7.C6260v) r1
                java.lang.Object r3 = r6.f34290c
                s7.t r3 = (s7.C6258t) r3
                java.lang.Object r4 = r6.f34293f
                k7.o r4 = (k7.o) r4
                R6.r.throwOnFailure(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                R6.r.throwOnFailure(r7)
                goto L86
            L2a:
                R6.r.throwOnFailure(r7)
                java.lang.Object r7 = r6.f34293f
                k7.o r7 = (k7.o) r7
                n7.B0 r1 = n7.B0.this
                java.lang.Object r1 = r1.getState$kotlinx_coroutines_core()
                boolean r4 = r1 instanceof n7.C6009u
                if (r4 == 0) goto L48
                n7.u r1 = (n7.C6009u) r1
                n7.v r1 = r1.childJob
                r6.f34292e = r3
                java.lang.Object r7 = r7.yield(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof n7.InterfaceC5999o0
                if (r3 == 0) goto L86
                n7.o0 r1 = (n7.InterfaceC5999o0) r1
                n7.G0 r1 = r1.getList()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.getNext()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
                s7.v r3 = (s7.C6260v) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof n7.C6009u
                if (r7 == 0) goto L81
                r7 = r1
                n7.u r7 = (n7.C6009u) r7
                n7.v r7 = r7.childJob
                r6.f34293f = r4
                r6.f34290c = r3
                r6.f34291d = r1
                r6.f34292e = r2
                java.lang.Object r7 = r4.yield(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                s7.v r1 = r1.getNextNode()
                goto L63
            L86:
                R6.G r7 = R6.G.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: n7.B0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(k7.o oVar, W6.d<? super R6.G> dVar) {
            return ((g) create(oVar, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* synthetic */ class h extends FunctionReferenceImpl implements f7.q {
        public static final h INSTANCE = new h();

        h() {
            super(3, B0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((B0) obj, (v7.l) obj2, obj3);
            return R6.G.INSTANCE;
        }

        public final void invoke(B0 b02, v7.l lVar, Object obj) {
            b02.F(lVar, obj);
        }
    }

    /* synthetic */ class i extends FunctionReferenceImpl implements f7.q {
        public static final i INSTANCE = new i();

        i() {
            super(3, B0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // f7.q
        public final Object invoke(B0 b02, Object obj, Object obj2) {
            return b02.E(obj, obj2);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements f7.q {
        public static final j INSTANCE = new j();

        j() {
            super(3, B0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((B0) obj, (v7.l) obj2, obj3);
            return R6.G.INSTANCE;
        }

        public final void invoke(B0 b02, v7.l lVar, Object obj) {
            b02.L(lVar, obj);
        }
    }

    public B0(boolean z8) {
        this._state = z8 ? C0.f34300f : C0.f34299e;
    }

    private final A0 A(f7.l lVar, boolean z8) {
        A0 c6006s0;
        if (z8) {
            c6006s0 = lVar instanceof AbstractC6012v0 ? (AbstractC6012v0) lVar : null;
            if (c6006s0 == null) {
                c6006s0 = new C6004r0(lVar);
            }
        } else {
            c6006s0 = lVar instanceof A0 ? (A0) lVar : null;
            if (c6006s0 == null) {
                c6006s0 = new C6006s0(lVar);
            }
        }
        c6006s0.setJob(this);
        return c6006s0;
    }

    private final C6009u B(C6260v c6260v) {
        while (c6260v.isRemoved()) {
            c6260v = c6260v.getPrevNode();
        }
        while (true) {
            c6260v = c6260v.getNextNode();
            if (!c6260v.isRemoved()) {
                if (c6260v instanceof C6009u) {
                    return (C6009u) c6260v;
                }
                if (c6260v instanceof G0) {
                    return null;
                }
            }
        }
    }

    private final void C(G0 g02, Throwable th) throws Throwable {
        G(th);
        Object next = g02.getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C5969E c5969e = null;
        for (C6260v nextNode = (C6260v) next; !Intrinsics.areEqual(nextNode, g02); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof AbstractC6012v0) {
                A0 a02 = (A0) nextNode;
                try {
                    a02.invoke(th);
                } catch (Throwable th2) {
                    if (c5969e != null) {
                        AbstractC0747a.addSuppressed(c5969e, th2);
                    } else {
                        c5969e = new C5969E("Exception in completion handler " + a02 + " for " + this, th2);
                        R6.G g8 = R6.G.INSTANCE;
                    }
                }
            }
        }
        if (c5969e != null) {
            handleOnCompletionException$kotlinx_coroutines_core(c5969e);
        }
        j(th);
    }

    private final void D(G0 g02, Throwable th) throws Throwable {
        Object next = g02.getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C5969E c5969e = null;
        for (C6260v nextNode = (C6260v) next; !Intrinsics.areEqual(nextNode, g02); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof A0) {
                A0 a02 = (A0) nextNode;
                try {
                    a02.invoke(th);
                } catch (Throwable th2) {
                    if (c5969e != null) {
                        AbstractC0747a.addSuppressed(c5969e, th2);
                    } else {
                        c5969e = new C5969E("Exception in completion handler " + a02 + " for " + this, th2);
                        R6.G g8 = R6.G.INSTANCE;
                    }
                }
            }
        }
        if (c5969e != null) {
            handleOnCompletionException$kotlinx_coroutines_core(c5969e);
        }
    }

    public final Object E(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof C5966B) {
            throw ((C5966B) obj2).cause;
        }
        return obj2;
    }

    public final void F(v7.l lVar, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof InterfaceC5999o0)) {
                if (!(state$kotlinx_coroutines_core instanceof C5966B)) {
                    state$kotlinx_coroutines_core = C0.unboxState(state$kotlinx_coroutines_core);
                }
                lVar.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (M(state$kotlinx_coroutines_core) < 0);
        lVar.disposeOnCompletion(invokeOnCompletion(new d(lVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [n7.n0] */
    private final void J(C5979e0 c5979e0) {
        G0 g02 = new G0();
        if (!c5979e0.isActive()) {
            g02 = new C5997n0(g02);
        }
        androidx.concurrent.futures.b.a(f34273a, this, c5979e0, g02);
    }

    private final void K(A0 a02) {
        a02.addOneIfEmpty(new G0());
        androidx.concurrent.futures.b.a(f34273a, this, a02, a02.getNextNode());
    }

    public final void L(v7.l lVar, Object obj) {
        if (x()) {
            lVar.disposeOnCompletion(invokeOnCompletion(new e(lVar)));
        } else {
            lVar.selectInRegistrationPhase(R6.G.INSTANCE);
        }
    }

    private final int M(Object obj) {
        if (obj instanceof C5979e0) {
            if (((C5979e0) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f34273a, this, obj, C0.f34300f)) {
                return -1;
            }
            I();
            return 1;
        }
        if (!(obj instanceof C5997n0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f34273a, this, obj, ((C5997n0) obj).getList())) {
            return -1;
        }
        I();
        return 1;
    }

    private final String N(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC5999o0 ? ((InterfaceC5999o0) obj).isActive() ? "Active" : "New" : obj instanceof C5966B ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.isCancelling() ? "Cancelling" : cVar.isCompleting() ? "Completing" : "Active";
    }

    private final boolean P(InterfaceC5999o0 interfaceC5999o0, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f34273a, this, interfaceC5999o0, C0.boxIncomplete(obj))) {
            return false;
        }
        G(null);
        H(obj);
        l(interfaceC5999o0, obj);
        return true;
    }

    private final boolean Q(InterfaceC5999o0 interfaceC5999o0, Throwable th) throws Throwable {
        G0 g0T = t(interfaceC5999o0);
        if (g0T == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f34273a, this, interfaceC5999o0, new c(g0T, false, th))) {
            return false;
        }
        C(g0T, th);
        return true;
    }

    private final Object R(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC5999o0) ? C0.f34295a : ((!(obj instanceof C5979e0) && !(obj instanceof A0)) || (obj instanceof C6009u) || (obj2 instanceof C5966B)) ? S((InterfaceC5999o0) obj, obj2) : P((InterfaceC5999o0) obj, obj2) ? obj2 : C0.f34296b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object S(InterfaceC5999o0 interfaceC5999o0, Object obj) throws Throwable {
        G0 g0T = t(interfaceC5999o0);
        if (g0T == null) {
            return C0.f34296b;
        }
        c cVar = interfaceC5999o0 instanceof c ? (c) interfaceC5999o0 : null;
        if (cVar == null) {
            cVar = new c(g0T, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.isCompleting()) {
                return C0.f34295a;
            }
            cVar.setCompleting(true);
            if (cVar != interfaceC5999o0 && !androidx.concurrent.futures.b.a(f34273a, this, interfaceC5999o0, cVar)) {
                return C0.f34296b;
            }
            boolean zIsCancelling = cVar.isCancelling();
            C5966B c5966b = obj instanceof C5966B ? (C5966B) obj : null;
            if (c5966b != null) {
                cVar.addExceptionLocked(c5966b.cause);
            }
            ?? rootCause = zIsCancelling ? 0 : cVar.getRootCause();
            objectRef.element = rootCause;
            R6.G g8 = R6.G.INSTANCE;
            if (rootCause != 0) {
                C(g0T, rootCause);
            }
            C6009u c6009uP = p(interfaceC5999o0);
            return (c6009uP == null || !T(cVar, c6009uP, obj)) ? o(cVar, obj) : C0.COMPLETING_WAITING_CHILDREN;
        }
    }

    private final boolean T(c cVar, C6009u c6009u, Object obj) {
        while (InterfaceC6008t0.a.invokeOnCompletion$default(c6009u.childJob, false, false, new b(this, cVar, c6009u, obj), 1, null) == H0.INSTANCE) {
            c6009u = B(c6009u);
            if (c6009u == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean d(Object obj, G0 g02, A0 a02) {
        int iTryCondAddNext;
        f fVar = new f(a02, this, obj);
        do {
            iTryCondAddNext = g02.getPrevNode().tryCondAddNext(a02, g02, fVar);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public static /* synthetic */ C6010u0 defaultCancellationException$kotlinx_coroutines_core$default(B0 b02, String str, Throwable th, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i8 & 1) != 0) {
            str = null;
        }
        if ((i8 & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = b02.k();
        }
        return new C6010u0(str, th, b02);
    }

    private final void e(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC0747a.addSuppressed(th, th2);
            }
        }
    }

    public final Object h(W6.d dVar) {
        a aVar = new a(X6.b.intercepted(dVar), this);
        aVar.initCancellability();
        AbstractC6002q.disposeOnCancellation(aVar, invokeOnCompletion(new K0(aVar)));
        Object result = aVar.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    private final Object i(Object obj) {
        Object objR;
        do {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof InterfaceC5999o0) || ((state$kotlinx_coroutines_core instanceof c) && ((c) state$kotlinx_coroutines_core).isCompleting())) {
                return C0.f34295a;
            }
            objR = R(state$kotlinx_coroutines_core, new C5966B(n(obj), false, 2, null));
        } while (objR == C0.f34296b);
        return objR;
    }

    private final boolean j(Throwable th) {
        if (w()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        InterfaceC6007t parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == H0.INSTANCE) ? z8 : parentHandle$kotlinx_coroutines_core.childCancelled(th) || z8;
    }

    private final void l(InterfaceC5999o0 interfaceC5999o0, Object obj) throws Throwable {
        InterfaceC6007t parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(H0.INSTANCE);
        }
        C5966B c5966b = obj instanceof C5966B ? (C5966B) obj : null;
        Throwable th = c5966b != null ? c5966b.cause : null;
        if (!(interfaceC5999o0 instanceof A0)) {
            G0 list = interfaceC5999o0.getList();
            if (list != null) {
                D(list, th);
                return;
            }
            return;
        }
        try {
            ((A0) interfaceC5999o0).invoke(th);
        } catch (Throwable th2) {
            handleOnCompletionException$kotlinx_coroutines_core(new C5969E("Exception in completion handler " + interfaceC5999o0 + " for " + this, th2));
        }
    }

    public final void m(c cVar, C6009u c6009u, Object obj) {
        C6009u c6009uB = B(c6009u);
        if (c6009uB == null || !T(cVar, c6009uB, obj)) {
            f(o(cVar, obj));
        }
    }

    private final Throwable n(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C6010u0(k(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((J0) obj).getChildJobCancellationCause();
    }

    private final Object o(c cVar, Object obj) throws Throwable {
        boolean zIsCancelling;
        Throwable thR;
        C5966B c5966b = obj instanceof C5966B ? (C5966B) obj : null;
        Throwable th = c5966b != null ? c5966b.cause : null;
        synchronized (cVar) {
            zIsCancelling = cVar.isCancelling();
            List<Throwable> listSealLocked = cVar.sealLocked(th);
            thR = r(cVar, listSealLocked);
            if (thR != null) {
                e(thR, listSealLocked);
            }
        }
        if (thR != null && thR != th) {
            obj = new C5966B(thR, false, 2, null);
        }
        if (thR != null && (j(thR) || u(thR))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C5966B) obj).makeHandled();
        }
        if (!zIsCancelling) {
            G(thR);
        }
        H(obj);
        androidx.concurrent.futures.b.a(f34273a, this, cVar, C0.boxIncomplete(obj));
        l(cVar, obj);
        return obj;
    }

    private final C6009u p(InterfaceC5999o0 interfaceC5999o0) {
        C6009u c6009u = interfaceC5999o0 instanceof C6009u ? (C6009u) interfaceC5999o0 : null;
        if (c6009u != null) {
            return c6009u;
        }
        G0 list = interfaceC5999o0.getList();
        if (list != null) {
            return B(list);
        }
        return null;
    }

    private final Throwable q(Object obj) {
        C5966B c5966b = obj instanceof C5966B ? (C5966B) obj : null;
        if (c5966b != null) {
            return c5966b.cause;
        }
        return null;
    }

    private final Throwable r(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.isCancelling()) {
                return new C6010u0(k(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof S0) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof S0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final G0 t(InterfaceC5999o0 interfaceC5999o0) {
        G0 list = interfaceC5999o0.getList();
        if (list != null) {
            return list;
        }
        if (interfaceC5999o0 instanceof C5979e0) {
            return new G0();
        }
        if (interfaceC5999o0 instanceof A0) {
            K((A0) interfaceC5999o0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC5999o0).toString());
    }

    public static /* synthetic */ CancellationException toCancellationException$default(B0 b02, Throwable th, String str, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i8 & 1) != 0) {
            str = null;
        }
        return b02.O(th, str);
    }

    private final boolean x() {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof InterfaceC5999o0)) {
                return false;
            }
        } while (M(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    public final Object y(W6.d dVar) {
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        AbstractC6002q.disposeOnCancellation(c5998o, invokeOnCompletion(new L0(c5998o)));
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
    }

    private final Object z(Object obj) throws Throwable {
        Throwable thN = null;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof c) {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((c) state$kotlinx_coroutines_core).isSealed()) {
                        return C0.f34297c;
                    }
                    boolean zIsCancelling = ((c) state$kotlinx_coroutines_core).isCancelling();
                    if (obj != null || !zIsCancelling) {
                        if (thN == null) {
                            thN = n(obj);
                        }
                        ((c) state$kotlinx_coroutines_core).addExceptionLocked(thN);
                    }
                    Throwable rootCause = zIsCancelling ? null : ((c) state$kotlinx_coroutines_core).getRootCause();
                    if (rootCause != null) {
                        C(((c) state$kotlinx_coroutines_core).getList(), rootCause);
                    }
                    return C0.f34295a;
                }
            }
            if (!(state$kotlinx_coroutines_core instanceof InterfaceC5999o0)) {
                return C0.f34297c;
            }
            if (thN == null) {
                thN = n(obj);
            }
            InterfaceC5999o0 interfaceC5999o0 = (InterfaceC5999o0) state$kotlinx_coroutines_core;
            if (!interfaceC5999o0.isActive()) {
                Object objR = R(state$kotlinx_coroutines_core, new C5966B(thN, false, 2, null));
                if (objR == C0.f34295a) {
                    throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                }
                if (objR != C0.f34296b) {
                    return objR;
                }
            } else if (Q(interfaceC5999o0, thN)) {
                return C0.f34295a;
            }
        }
    }

    protected final CancellationException O(Throwable th, String str) {
        CancellationException c6010u0 = th instanceof CancellationException ? (CancellationException) th : null;
        if (c6010u0 == null) {
            if (str == null) {
                str = k();
            }
            c6010u0 = new C6010u0(str, th, this);
        }
        return c6010u0;
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final InterfaceC6007t attachChild(InterfaceC6011v interfaceC6011v) {
        InterfaceC5973b0 interfaceC5973b0InvokeOnCompletion$default = InterfaceC6008t0.a.invokeOnCompletion$default(this, true, false, new C6009u(interfaceC6011v), 2, null);
        Intrinsics.checkNotNull(interfaceC5973b0InvokeOnCompletion$default, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC6007t) interfaceC5973b0InvokeOnCompletion$default;
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final boolean cancelCoroutine(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(Object obj) throws Throwable {
        Object objZ = C0.f34295a;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (objZ = i(obj)) == C0.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objZ == C0.f34295a) {
            objZ = z(obj);
        }
        if (objZ == C0.f34295a || objZ == C0.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objZ == C0.f34297c) {
            return false;
        }
        f(objZ);
        return true;
    }

    public void cancelInternal(Throwable th) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(th);
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    public final C6010u0 defaultCancellationException$kotlinx_coroutines_core(String str, Throwable th) {
        if (str == null) {
            str = k();
        }
        return new C6010u0(str, th, this);
    }

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    public <R> R fold(R r8, f7.p pVar) {
        return (R) InterfaceC6008t0.a.fold(this, r8, pVar);
    }

    protected final Object g(W6.d dVar) throws Throwable {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof InterfaceC5999o0)) {
                if (state$kotlinx_coroutines_core instanceof C5966B) {
                    throw ((C5966B) state$kotlinx_coroutines_core).cause;
                }
                return C0.unboxState(state$kotlinx_coroutines_core);
            }
        } while (M(state$kotlinx_coroutines_core) < 0);
        return h(dVar);
    }

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) InterfaceC6008t0.a.get(this, cVar);
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final CancellationException getCancellationException() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof c)) {
            if (state$kotlinx_coroutines_core instanceof InterfaceC5999o0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (state$kotlinx_coroutines_core instanceof C5966B) {
                return toCancellationException$default(this, ((C5966B) state$kotlinx_coroutines_core).cause, null, 1, null);
            }
            return new C6010u0(P.getClassSimpleName(this) + " has completed normally", null, this);
        }
        Throwable rootCause = ((c) state$kotlinx_coroutines_core).getRootCause();
        if (rootCause != null) {
            CancellationException cancellationExceptionO = O(rootCause, P.getClassSimpleName(this) + " is cancelling");
            if (cancellationExceptionO != null) {
                return cancellationExceptionO;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // n7.J0
    public CancellationException getChildJobCancellationCause() {
        CancellationException rootCause;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof c) {
            rootCause = ((c) state$kotlinx_coroutines_core).getRootCause();
        } else if (state$kotlinx_coroutines_core instanceof C5966B) {
            rootCause = ((C5966B) state$kotlinx_coroutines_core).cause;
        } else {
            if (state$kotlinx_coroutines_core instanceof InterfaceC5999o0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            rootCause = null;
        }
        CancellationException cancellationException = rootCause instanceof CancellationException ? rootCause : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C6010u0("Parent job is " + N(state$kotlinx_coroutines_core), rootCause, this);
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final k7.m getChildren() {
        return k7.p.sequence(new g(null));
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() throws Throwable {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof InterfaceC5999o0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (state$kotlinx_coroutines_core instanceof C5966B) {
            throw ((C5966B) state$kotlinx_coroutines_core).cause;
        }
        return C0.unboxState(state$kotlinx_coroutines_core);
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof InterfaceC5999o0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return q(state$kotlinx_coroutines_core);
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override // n7.InterfaceC6008t0, W6.g.b
    public final g.c getKey() {
        return InterfaceC6008t0.Key;
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final v7.d getOnJoin() {
        j jVar = j.INSTANCE;
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new v7.e(this, (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jVar, 3), null, 4, null);
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public InterfaceC6008t0 getParent() {
        InterfaceC6007t parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    public final InterfaceC6007t getParentHandle$kotlinx_coroutines_core() {
        return (InterfaceC6007t) f34274b.get(this);
    }

    public final Object getState$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34273a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC6237D)) {
                return obj;
            }
            ((AbstractC6237D) obj).perform(this);
        }
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final InterfaceC5973b0 invokeOnCompletion(f7.l lVar) {
        return invokeOnCompletion(false, true, lVar);
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof InterfaceC5999o0) && ((InterfaceC5999o0) state$kotlinx_coroutines_core).isActive();
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof C5966B) || ((state$kotlinx_coroutines_core instanceof c) && ((c) state$kotlinx_coroutines_core).isCancelling());
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof InterfaceC5999o0);
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof C5966B;
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final Object join(W6.d<? super R6.G> dVar) {
        if (x()) {
            Object objY = y(dVar);
            return objY == X6.b.getCOROUTINE_SUSPENDED() ? objY : R6.G.INSTANCE;
        }
        AbstractC6016x0.ensureActive(dVar.getContext());
        return R6.G.INSTANCE;
    }

    public String k() {
        return "Job was cancelled";
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) {
        Object objR;
        do {
            objR = R(getState$kotlinx_coroutines_core(), obj);
            if (objR == C0.f34295a) {
                return false;
            }
            if (objR == C0.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        } while (objR == C0.f34296b);
        f(objR);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) {
        Object objR;
        do {
            objR = R(getState$kotlinx_coroutines_core(), obj);
            if (objR == C0.f34295a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, q(obj));
            }
        } while (objR == C0.f34296b);
        return objR;
    }

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    public W6.g minusKey(g.c cVar) {
        return InterfaceC6008t0.a.minusKey(this, cVar);
    }

    public String nameString$kotlinx_coroutines_core() {
        return P.getClassSimpleName(this);
    }

    @Override // n7.InterfaceC6011v
    public final void parentCancelled(J0 j02) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(j02);
    }

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    public W6.g plus(W6.g gVar) {
        return InterfaceC6008t0.a.plus(this, gVar);
    }

    public final void removeNode$kotlinx_coroutines_core(A0 a02) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof A0)) {
                if (!(state$kotlinx_coroutines_core instanceof InterfaceC5999o0) || ((InterfaceC5999o0) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                a02.mo591remove();
                return;
            }
            if (state$kotlinx_coroutines_core != a02) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f34273a, this, state$kotlinx_coroutines_core, C0.f34300f));
    }

    protected final v7.f s() {
        h hVar = h.INSTANCE;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        f7.q qVar = (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(hVar, 3);
        i iVar = i.INSTANCE;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new v7.g(this, qVar, (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(iVar, 3), null, 8, null);
    }

    public final void setParentHandle$kotlinx_coroutines_core(InterfaceC6007t interfaceC6007t) {
        f34274b.set(this, interfaceC6007t);
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final boolean start() {
        int iM;
        do {
            iM = M(getState$kotlinx_coroutines_core());
            if (iM == 0) {
                return false;
            }
        } while (iM != 1);
        return true;
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + N(getState$kotlinx_coroutines_core()) + '}';
    }

    public String toString() {
        return toDebugString() + '@' + P.getHexAddress(this);
    }

    protected boolean u(Throwable th) {
        return false;
    }

    protected final void v(InterfaceC6008t0 interfaceC6008t0) {
        if (interfaceC6008t0 == null) {
            setParentHandle$kotlinx_coroutines_core(H0.INSTANCE);
            return;
        }
        interfaceC6008t0.start();
        InterfaceC6007t interfaceC6007tAttachChild = interfaceC6008t0.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(interfaceC6007tAttachChild);
        if (isCompleted()) {
            interfaceC6007tAttachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(H0.INSTANCE);
        }
    }

    protected boolean w() {
        return false;
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public /* synthetic */ boolean cancel(Throwable th) throws Throwable {
        Throwable c6010u0;
        if (th == null || (c6010u0 = toCancellationException$default(this, th, null, 1, null)) == null) {
            c6010u0 = new C6010u0(k(), null, this);
        }
        cancelInternal(c6010u0);
        return true;
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final InterfaceC5973b0 invokeOnCompletion(boolean z8, boolean z9, f7.l lVar) {
        A0 a0A = A(lVar, z8);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof C5979e0) {
                C5979e0 c5979e0 = (C5979e0) state$kotlinx_coroutines_core;
                if (!c5979e0.isActive()) {
                    J(c5979e0);
                } else if (androidx.concurrent.futures.b.a(f34273a, this, state$kotlinx_coroutines_core, a0A)) {
                    return a0A;
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof InterfaceC5999o0)) {
                    if (z9) {
                        C5966B c5966b = state$kotlinx_coroutines_core instanceof C5966B ? (C5966B) state$kotlinx_coroutines_core : null;
                        lVar.invoke(c5966b != null ? c5966b.cause : null);
                    }
                    return H0.INSTANCE;
                }
                G0 list = ((InterfaceC5999o0) state$kotlinx_coroutines_core).getList();
                if (list == null) {
                    Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    K((A0) state$kotlinx_coroutines_core);
                } else {
                    InterfaceC5973b0 interfaceC5973b0 = H0.INSTANCE;
                    if (z8 && (state$kotlinx_coroutines_core instanceof c)) {
                        synchronized (state$kotlinx_coroutines_core) {
                            try {
                                rootCause = ((c) state$kotlinx_coroutines_core).getRootCause();
                                if (rootCause == null || ((lVar instanceof C6009u) && !((c) state$kotlinx_coroutines_core).isCompleting())) {
                                    if (d(state$kotlinx_coroutines_core, list, a0A)) {
                                        if (rootCause == null) {
                                            return a0A;
                                        }
                                        interfaceC5973b0 = a0A;
                                    }
                                }
                                R6.G g8 = R6.G.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (rootCause != null) {
                        if (z9) {
                            lVar.invoke(rootCause);
                        }
                        return interfaceC5973b0;
                    }
                    if (d(state$kotlinx_coroutines_core, list, a0A)) {
                        return a0A;
                    }
                }
            }
        }
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public InterfaceC6008t0 plus(InterfaceC6008t0 interfaceC6008t0) {
        return InterfaceC6008t0.a.plus((InterfaceC6008t0) this, interfaceC6008t0);
    }

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new C6010u0(k(), null, this);
        }
        cancelInternal(cancellationException);
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    protected void I() {
    }

    protected void G(Throwable th) {
    }

    protected void H(Object obj) {
    }

    protected void f(Object obj) {
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) throws Throwable {
        throw th;
    }
}
