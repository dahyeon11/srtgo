package p7;

import R6.AbstractC0747a;
import R6.G;
import R6.q;
import f7.InterfaceC5519a;
import j3.AbstractC5822d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import m7.AbstractC5916c;
import n7.AbstractC6002q;
import n7.C5998o;
import n7.InterfaceC5996n;
import n7.P;
import n7.W0;
import p7.InterfaceC6067e;
import p7.InterfaceC6069g;
import s7.AbstractC6236C;
import s7.AbstractC6244e;
import s7.AbstractC6245f;
import s7.C6256q;
import s7.H;
import s7.I;
import s7.J;
import s7.U;

/* renamed from: p7.c */
/* loaded from: classes3.dex */
public class C6065c implements InterfaceC6067e {

    /* renamed from: c */
    private static final AtomicLongFieldUpdater f34632c = AtomicLongFieldUpdater.newUpdater(C6065c.class, "sendersAndCloseStatus");

    /* renamed from: d */
    private static final AtomicLongFieldUpdater f34633d = AtomicLongFieldUpdater.newUpdater(C6065c.class, "receivers");

    /* renamed from: e */
    private static final AtomicLongFieldUpdater f34634e = AtomicLongFieldUpdater.newUpdater(C6065c.class, "bufferEnd");

    /* renamed from: f */
    private static final AtomicLongFieldUpdater f34635f = AtomicLongFieldUpdater.newUpdater(C6065c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater f34636g = AtomicReferenceFieldUpdater.newUpdater(C6065c.class, Object.class, "sendSegment");

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f34637h = AtomicReferenceFieldUpdater.newUpdater(C6065c.class, Object.class, "receiveSegment");

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f34638i = AtomicReferenceFieldUpdater.newUpdater(C6065c.class, Object.class, "bufferEndSegment");

    /* renamed from: j */
    private static final AtomicReferenceFieldUpdater f34639j = AtomicReferenceFieldUpdater.newUpdater(C6065c.class, Object.class, "_closeCause");

    /* renamed from: k */
    private static final AtomicReferenceFieldUpdater f34640k = AtomicReferenceFieldUpdater.newUpdater(C6065c.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a */
    private final int f34641a;

    /* renamed from: b */
    private final f7.q f34642b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    public final f7.l onUndeliveredElement;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* renamed from: p7.c$a */
    private final class a implements InterfaceC6069g, W0 {

        /* renamed from: a */
        private Object f34643a = AbstractC6066d.f34675n;

        /* renamed from: b */
        private C5998o f34644b;

        public a() {
        }

        public final Object a(C6073k c6073k, int i8, long j8, W6.d dVar) {
            Boolean boolBoxBoolean;
            C6065c c6065c = C6065c.this;
            C5998o orCreateCancellableContinuation = AbstractC6002q.getOrCreateCancellableContinuation(X6.b.intercepted(dVar));
            try {
                this.f34644b = orCreateCancellableContinuation;
                Object objM0 = c6065c.m0(c6073k, i8, j8, this);
                if (objM0 == AbstractC6066d.f34672k) {
                    c6065c.O(this, c6073k, i8);
                } else {
                    f7.l lVarBindCancellationFun = null;
                    if (objM0 == AbstractC6066d.f34674m) {
                        if (j8 < c6065c.getSendersCounter$kotlinx_coroutines_core()) {
                            c6073k.cleanPrev();
                        }
                        C6073k c6073k2 = (C6073k) C6065c.f34637h.get(c6065c);
                        while (true) {
                            if (c6065c.isClosedForReceive()) {
                                c();
                                break;
                            }
                            long andIncrement = C6065c.f34633d.getAndIncrement(c6065c);
                            int i9 = AbstractC6066d.SEGMENT_SIZE;
                            long j9 = andIncrement / i9;
                            int i10 = (int) (andIncrement % i9);
                            if (c6073k2.id != j9) {
                                C6073k c6073kL = c6065c.l(j9, c6073k2);
                                if (c6073kL != null) {
                                    c6073k2 = c6073kL;
                                }
                            }
                            Object objM02 = c6065c.m0(c6073k2, i10, andIncrement, this);
                            if (objM02 == AbstractC6066d.f34672k) {
                                c6065c.O(this, c6073k2, i10);
                                break;
                            }
                            if (objM02 == AbstractC6066d.f34674m) {
                                if (andIncrement < c6065c.getSendersCounter$kotlinx_coroutines_core()) {
                                    c6073k2.cleanPrev();
                                }
                            } else {
                                if (objM02 == AbstractC6066d.f34673l) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c6073k2.cleanPrev();
                                this.f34643a = objM02;
                                this.f34644b = null;
                                boolBoxBoolean = Y6.b.boxBoolean(true);
                                f7.l lVar = c6065c.onUndeliveredElement;
                                if (lVar != null) {
                                    lVarBindCancellationFun = AbstractC6236C.bindCancellationFun(lVar, objM02, orCreateCancellableContinuation.getContext());
                                }
                            }
                        }
                    } else {
                        c6073k.cleanPrev();
                        this.f34643a = objM0;
                        this.f34644b = null;
                        boolBoxBoolean = Y6.b.boxBoolean(true);
                        f7.l lVar2 = c6065c.onUndeliveredElement;
                        if (lVar2 != null) {
                            lVarBindCancellationFun = AbstractC6236C.bindCancellationFun(lVar2, objM0, orCreateCancellableContinuation.getContext());
                        }
                    }
                    orCreateCancellableContinuation.resume(boolBoxBoolean, lVarBindCancellationFun);
                }
                Object result = orCreateCancellableContinuation.getResult();
                if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                    Y6.h.probeCoroutineSuspended(dVar);
                }
                return result;
            } catch (Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }

        private final boolean b() throws Throwable {
            this.f34643a = AbstractC6066d.getCHANNEL_CLOSED();
            Throwable thO = C6065c.this.o();
            if (thO == null) {
                return false;
            }
            throw J.recoverStackTrace(thO);
        }

        public final void c() {
            C5998o c5998o = this.f34644b;
            Intrinsics.checkNotNull(c5998o);
            this.f34644b = null;
            this.f34643a = AbstractC6066d.getCHANNEL_CLOSED();
            Throwable thO = C6065c.this.o();
            if (thO == null) {
                q.a aVar = R6.q.Companion;
                c5998o.resumeWith(R6.q.m67constructorimpl(Boolean.FALSE));
            } else {
                q.a aVar2 = R6.q.Companion;
                c5998o.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(thO)));
            }
        }

        @Override // p7.InterfaceC6069g
        public Object hasNext(W6.d<? super Boolean> dVar) {
            C6073k c6073k;
            C6065c c6065c = C6065c.this;
            C6073k c6073k2 = (C6073k) C6065c.f34637h.get(c6065c);
            while (!c6065c.isClosedForReceive()) {
                long andIncrement = C6065c.f34633d.getAndIncrement(c6065c);
                int i8 = AbstractC6066d.SEGMENT_SIZE;
                long j8 = andIncrement / i8;
                int i9 = (int) (andIncrement % i8);
                if (c6073k2.id != j8) {
                    C6073k c6073kL = c6065c.l(j8, c6073k2);
                    if (c6073kL == null) {
                        continue;
                    } else {
                        c6073k = c6073kL;
                    }
                } else {
                    c6073k = c6073k2;
                }
                Object objM0 = c6065c.m0(c6073k, i9, andIncrement, null);
                if (objM0 == AbstractC6066d.f34672k) {
                    throw new IllegalStateException("unreachable");
                }
                if (objM0 != AbstractC6066d.f34674m) {
                    if (objM0 == AbstractC6066d.f34673l) {
                        return a(c6073k, i9, andIncrement, dVar);
                    }
                    c6073k.cleanPrev();
                    this.f34643a = objM0;
                    return Y6.b.boxBoolean(true);
                }
                if (andIncrement < c6065c.getSendersCounter$kotlinx_coroutines_core()) {
                    c6073k.cleanPrev();
                }
                c6073k2 = c6073k;
            }
            return Y6.b.boxBoolean(b());
        }

        @Override // n7.W0
        public void invokeOnCancellation(H h8, int i8) {
            C5998o c5998o = this.f34644b;
            if (c5998o != null) {
                c5998o.invokeOnCancellation(h8, i8);
            }
        }

        @Override // p7.InterfaceC6069g
        public /* synthetic */ Object next(W6.d dVar) {
            return InterfaceC6069g.a.next(this, dVar);
        }

        public final boolean tryResumeHasNext(Object obj) {
            C5998o c5998o = this.f34644b;
            Intrinsics.checkNotNull(c5998o);
            this.f34644b = null;
            this.f34643a = obj;
            Boolean bool = Boolean.TRUE;
            f7.l lVar = C6065c.this.onUndeliveredElement;
            return AbstractC6066d.e(c5998o, bool, lVar != null ? AbstractC6236C.bindCancellationFun(lVar, obj, c5998o.getContext()) : null);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            C5998o c5998o = this.f34644b;
            Intrinsics.checkNotNull(c5998o);
            this.f34644b = null;
            this.f34643a = AbstractC6066d.getCHANNEL_CLOSED();
            Throwable thO = C6065c.this.o();
            if (thO == null) {
                q.a aVar = R6.q.Companion;
                c5998o.resumeWith(R6.q.m67constructorimpl(Boolean.FALSE));
            } else {
                q.a aVar2 = R6.q.Companion;
                c5998o.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(thO)));
            }
        }

        @Override // p7.InterfaceC6069g
        public Object next() throws Throwable {
            Object obj = this.f34643a;
            if (obj == AbstractC6066d.f34675n) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f34643a = AbstractC6066d.f34675n;
            if (obj != AbstractC6066d.getCHANNEL_CLOSED()) {
                return obj;
            }
            throw J.recoverStackTrace(C6065c.this.p());
        }
    }

    /* renamed from: p7.c$b */
    private static final class b implements W0 {

        /* renamed from: a */
        private final InterfaceC5996n f34646a;

        /* renamed from: b */
        private final /* synthetic */ C5998o f34647b;

        public b(InterfaceC5996n interfaceC5996n) {
            this.f34646a = interfaceC5996n;
            Intrinsics.checkNotNull(interfaceC5996n, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f34647b = (C5998o) interfaceC5996n;
        }

        public final InterfaceC5996n getCont() {
            return this.f34646a;
        }

        @Override // n7.W0
        public void invokeOnCancellation(H h8, int i8) {
            this.f34647b.invokeOnCancellation(h8, i8);
        }
    }

    /* renamed from: p7.c$c */
    /* synthetic */ class C0365c extends FunctionReferenceImpl implements f7.q {
        public static final C0365c INSTANCE = new C0365c();

        C0365c() {
            super(3, C6065c.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((C6065c) obj, (v7.l) obj2, obj3);
            return G.INSTANCE;
        }

        public final void invoke(C6065c c6065c, v7.l lVar, Object obj) {
            c6065c.Y(lVar, obj);
        }
    }

    /* renamed from: p7.c$d */
    /* synthetic */ class d extends FunctionReferenceImpl implements f7.q {
        public static final d INSTANCE = new d();

        d() {
            super(3, C6065c.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // f7.q
        public final Object invoke(C6065c c6065c, Object obj, Object obj2) {
            return c6065c.Q(obj, obj2);
        }
    }

    /* renamed from: p7.c$e */
    /* synthetic */ class e extends FunctionReferenceImpl implements f7.q {
        public static final e INSTANCE = new e();

        e() {
            super(3, C6065c.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((C6065c) obj, (v7.l) obj2, obj3);
            return G.INSTANCE;
        }

        public final void invoke(C6065c c6065c, v7.l lVar, Object obj) {
            c6065c.Y(lVar, obj);
        }
    }

    /* renamed from: p7.c$f */
    /* synthetic */ class f extends FunctionReferenceImpl implements f7.q {
        public static final f INSTANCE = new f();

        f() {
            super(3, C6065c.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // f7.q
        public final Object invoke(C6065c c6065c, Object obj, Object obj2) {
            return c6065c.R(obj, obj2);
        }
    }

    /* renamed from: p7.c$g */
    /* synthetic */ class g extends FunctionReferenceImpl implements f7.q {
        public static final g INSTANCE = new g();

        g() {
            super(3, C6065c.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((C6065c) obj, (v7.l) obj2, obj3);
            return G.INSTANCE;
        }

        public final void invoke(C6065c c6065c, v7.l lVar, Object obj) {
            c6065c.Y(lVar, obj);
        }
    }

    /* renamed from: p7.c$h */
    /* synthetic */ class h extends FunctionReferenceImpl implements f7.q {
        public static final h INSTANCE = new h();

        h() {
            super(3, C6065c.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // f7.q
        public final Object invoke(C6065c c6065c, Object obj, Object obj2) {
            return c6065c.S(obj, obj2);
        }
    }

    /* renamed from: p7.c$i */
    /* synthetic */ class i extends FunctionReferenceImpl implements f7.q {
        public static final i INSTANCE = new i();

        i() {
            super(3, C6065c.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((C6065c) obj, (v7.l) obj2, obj3);
            return G.INSTANCE;
        }

        public final void invoke(C6065c c6065c, v7.l lVar, Object obj) {
            c6065c.Z(lVar, obj);
        }
    }

    /* renamed from: p7.c$j */
    /* synthetic */ class j extends FunctionReferenceImpl implements f7.q {
        public static final j INSTANCE = new j();

        j() {
            super(3, C6065c.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // f7.q
        public final Object invoke(C6065c c6065c, Object obj, Object obj2) {
            return c6065c.T(obj, obj2);
        }
    }

    /* renamed from: p7.c$k */
    static final class k extends Lambda implements f7.q {

        /* renamed from: p7.c$k$a */
        static final class a extends Lambda implements f7.l {

            /* renamed from: a */
            final /* synthetic */ Object f34649a;

            /* renamed from: b */
            final /* synthetic */ C6065c f34650b;

            /* renamed from: c */
            final /* synthetic */ v7.l f34651c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C6065c c6065c, v7.l lVar) {
                super(1);
                this.f34649a = obj;
                this.f34650b = c6065c;
                this.f34651c = lVar;
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return G.INSTANCE;
            }

            public final void invoke(Throwable th) {
                if (this.f34649a != AbstractC6066d.getCHANNEL_CLOSED()) {
                    AbstractC6236C.callUndeliveredElement(this.f34650b.onUndeliveredElement, this.f34649a, this.f34651c.getContext());
                }
            }
        }

        k() {
            super(3);
        }

        @Override // f7.q
        public final f7.l invoke(v7.l lVar, Object obj, Object obj2) {
            return new a(obj2, C6065c.this, lVar);
        }
    }

    /* renamed from: p7.c$l */
    static final class l extends Y6.d {

        /* renamed from: d */
        /* synthetic */ Object f34652d;

        /* renamed from: f */
        int f34654f;

        l(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f34652d = obj;
            this.f34654f |= Integer.MIN_VALUE;
            Object objV = C6065c.V(C6065c.this, this);
            return objV == X6.b.getCOROUTINE_SUSPENDED() ? objV : C6071i.m540boximpl(objV);
        }
    }

    /* renamed from: p7.c$m */
    static final class m extends Y6.d {

        /* renamed from: d */
        Object f34655d;

        /* renamed from: e */
        Object f34656e;

        /* renamed from: f */
        int f34657f;

        /* renamed from: g */
        long f34658g;

        /* renamed from: h */
        /* synthetic */ Object f34659h;

        /* renamed from: j */
        int f34661j;

        m(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f34659h = obj;
            this.f34661j |= Integer.MIN_VALUE;
            Object objW = C6065c.this.W(null, 0, 0L, this);
            return objW == X6.b.getCOROUTINE_SUSPENDED() ? objW : C6071i.m540boximpl(objW);
        }
    }

    /* renamed from: p7.c$n */
    public static final class n extends Lambda implements f7.r {
        public static final n INSTANCE = new n();

        public n() {
            super(4);
        }

        @Override // f7.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((C6073k) obj, ((Number) obj2).intValue(), obj3, ((Number) obj4).longValue());
        }

        public final Void invoke(C6073k c6073k, int i8, Object obj, long j8) {
            throw new IllegalStateException("unexpected");
        }
    }

    public C6065c(int i8, f7.l lVar) {
        this.f34641a = i8;
        this.onUndeliveredElement = lVar;
        if (i8 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i8 + ", should be >=0").toString());
        }
        this.bufferEnd = AbstractC6066d.d(i8);
        this.completedExpandBuffersAndPauseFlag = n();
        C6073k c6073k = new C6073k(0L, null, this, 3);
        this.sendSegment = c6073k;
        this.receiveSegment = c6073k;
        if (z()) {
            c6073k = AbstractC6066d.f34662a;
            Intrinsics.checkNotNull(c6073k, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = c6073k;
        this.f34642b = lVar != null ? new k() : null;
        this._closeCause = AbstractC6066d.f34678q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x003c, code lost:
    
        r8 = (p7.C6073k) r8.getPrev();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long A(p7.C6073k r8) {
        /*
            r7 = this;
        L0:
            int r0 = p7.AbstractC6066d.SEGMENT_SIZE
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.id
            int r5 = p7.AbstractC6066d.SEGMENT_SIZE
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.getReceiversCounter$kotlinx_coroutines_core()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.getState$kotlinx_coroutines_core(r0)
            if (r1 == 0) goto L2c
            s7.K r2 = p7.AbstractC6066d.access$getIN_BUFFER$p()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            s7.K r2 = p7.AbstractC6066d.BUFFERED
            if (r1 != r2) goto L39
            return r3
        L2c:
            s7.K r2 = p7.AbstractC6066d.getCHANNEL_CLOSED()
            boolean r1 = r8.casState$kotlinx_coroutines_core(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.onSlotCleaned()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            s7.f r8 = r8.getPrev()
            p7.k r8 = (p7.C6073k) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.A(p7.k):long");
    }

    private final void B() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f34632c;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (((int) (j8 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, AbstractC6066d.b(1152921504606846975L & j8, 1)));
    }

    private final void C() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f34632c;
        do {
            j8 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, AbstractC6066d.b(1152921504606846975L & j8, 3)));
    }

    private final void D() {
        long j8;
        long jB;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f34632c;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j8 >> 60);
            if (i8 == 0) {
                jB = AbstractC6066d.b(j8 & 1152921504606846975L, 2);
            } else if (i8 != 1) {
                return;
            } else {
                jB = AbstractC6066d.b(j8 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, jB));
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void E(long r5, p7.C6073k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.id
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            s7.f r0 = r7.getNext()
            p7.k r0 = (p7.C6073k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.isRemoved()
            if (r5 == 0) goto L22
            s7.f r5 = r7.getNext()
            p7.k r5 = (p7.C6073k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p7.C6065c.f34638i
        L24:
            java.lang.Object r6 = r5.get(r4)
            s7.H r6 = (s7.H) r6
            long r0 = r6.id
            long r2 = r7.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.tryIncPointers$kotlinx_coroutines_core()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = androidx.concurrent.futures.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.decPointers$kotlinx_coroutines_core()
            if (r5 == 0) goto L49
            r6.remove()
        L49:
            return
        L4a:
            boolean r6 = r7.decPointers$kotlinx_coroutines_core()
            if (r6 == 0) goto L24
            r7.remove()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.E(long, p7.k):void");
    }

    public final void G(InterfaceC5996n interfaceC5996n) {
        q.a aVar = R6.q.Companion;
        interfaceC5996n.resumeWith(R6.q.m67constructorimpl(C6071i.m540boximpl(C6071i.Companion.m553closedJP2dKIU(o()))));
    }

    public final void H(InterfaceC5996n interfaceC5996n) {
        q.a aVar = R6.q.Companion;
        interfaceC5996n.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(p())));
    }

    private final void I(v7.l lVar) {
        lVar.selectInRegistrationPhase(AbstractC6066d.getCHANNEL_CLOSED());
    }

    private final void J(Object obj, v7.l lVar) {
        f7.l lVar2 = this.onUndeliveredElement;
        if (lVar2 != null) {
            AbstractC6236C.callUndeliveredElement(lVar2, obj, lVar.getContext());
        }
        lVar.selectInRegistrationPhase(AbstractC6066d.getCHANNEL_CLOSED());
    }

    public final Object K(Object obj, W6.d dVar) {
        U uCallUndeliveredElementCatchingException$default;
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        f7.l lVar = this.onUndeliveredElement;
        if (lVar == null || (uCallUndeliveredElementCatchingException$default = AbstractC6236C.callUndeliveredElementCatchingException$default(lVar, obj, null, 2, null)) == null) {
            Throwable thQ = q();
            q.a aVar = R6.q.Companion;
            c5998o.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(thQ)));
        } else {
            AbstractC0747a.addSuppressed(uCallUndeliveredElementCatchingException$default, q());
            q.a aVar2 = R6.q.Companion;
            c5998o.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(uCallUndeliveredElementCatchingException$default)));
        }
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result == X6.b.getCOROUTINE_SUSPENDED() ? result : G.INSTANCE;
    }

    public final void L(Object obj, InterfaceC5996n interfaceC5996n) {
        f7.l lVar = this.onUndeliveredElement;
        if (lVar != null) {
            AbstractC6236C.callUndeliveredElement(lVar, obj, interfaceC5996n.getContext());
        }
        Throwable thQ = q();
        q.a aVar = R6.q.Companion;
        interfaceC5996n.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(thQ)));
    }

    public final void O(W0 w02, C6073k c6073k, int i8) {
        N();
        w02.invokeOnCancellation(c6073k, i8);
    }

    public final void P(W0 w02, C6073k c6073k, int i8) {
        w02.invokeOnCancellation(c6073k, i8 + AbstractC6066d.SEGMENT_SIZE);
    }

    public final Object Q(Object obj, Object obj2) throws Throwable {
        if (obj2 != AbstractC6066d.getCHANNEL_CLOSED()) {
            return obj2;
        }
        throw p();
    }

    public final Object R(Object obj, Object obj2) {
        return C6071i.m540boximpl(obj2 == AbstractC6066d.getCHANNEL_CLOSED() ? C6071i.Companion.m553closedJP2dKIU(o()) : C6071i.Companion.m555successJP2dKIU(obj2));
    }

    public final Object S(Object obj, Object obj2) throws Throwable {
        if (obj2 != AbstractC6066d.getCHANNEL_CLOSED()) {
            return obj2;
        }
        if (o() == null) {
            return null;
        }
        throw p();
    }

    public final Object T(Object obj, Object obj2) throws Throwable {
        if (obj2 != AbstractC6066d.getCHANNEL_CLOSED()) {
            return this;
        }
        throw q();
    }

    static /* synthetic */ Object U(C6065c c6065c, W6.d dVar) throws Throwable {
        C6073k c6073k = (C6073k) f34637h.get(c6065c);
        while (!c6065c.isClosedForReceive()) {
            long andIncrement = f34633d.getAndIncrement(c6065c);
            int i8 = AbstractC6066d.SEGMENT_SIZE;
            long j8 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (c6073k.id != j8) {
                C6073k c6073kL = c6065c.l(j8, c6073k);
                if (c6073kL == null) {
                    continue;
                } else {
                    c6073k = c6073kL;
                }
            }
            Object objM0 = c6065c.m0(c6073k, i9, andIncrement, null);
            if (objM0 == AbstractC6066d.f34672k) {
                throw new IllegalStateException("unexpected");
            }
            if (objM0 != AbstractC6066d.f34674m) {
                if (objM0 == AbstractC6066d.f34673l) {
                    return c6065c.X(c6073k, i9, andIncrement, dVar);
                }
                c6073k.cleanPrev();
                return objM0;
            }
            if (andIncrement < c6065c.getSendersCounter$kotlinx_coroutines_core()) {
                c6073k.cleanPrev();
            }
        }
        throw J.recoverStackTrace(c6065c.p());
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object V(p7.C6065c r13, W6.d r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof p7.C6065c.l
            if (r0 == 0) goto L14
            r0 = r14
            p7.c$l r0 = (p7.C6065c.l) r0
            int r1 = r0.f34654f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f34654f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p7.c$l r0 = new p7.c$l
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f34652d
            java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
            int r1 = r6.f34654f
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            R6.r.throwOnFailure(r14)
            p7.i r14 = (p7.C6071i) r14
            java.lang.Object r13 = r14.m552unboximpl()
            goto Lb2
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            R6.r.throwOnFailure(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = access$getReceiveSegment$FU$p()
            java.lang.Object r14 = r14.get(r13)
            p7.k r14 = (p7.C6073k) r14
        L47:
            boolean r1 = r13.isClosedForReceive()
            if (r1 == 0) goto L58
            p7.i$b r14 = p7.C6071i.Companion
            java.lang.Throwable r13 = r13.o()
            java.lang.Object r13 = r14.m553closedJP2dKIU(r13)
            goto Lb2
        L58:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getReceivers$FU$p()
            long r4 = r1.getAndIncrement(r13)
            int r1 = p7.AbstractC6066d.SEGMENT_SIZE
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.id
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            p7.k r1 = access$findSegmentReceive(r13, r7, r14)
            if (r1 != 0) goto L76
            goto L47
        L76:
            r14 = r1
        L77:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = access$updateCellReceive(r7, r8, r9, r10, r12)
            s7.K r7 = p7.AbstractC6066d.access$getSUSPEND$p()
            if (r1 == r7) goto Lb3
            s7.K r7 = p7.AbstractC6066d.access$getFAILED$p()
            if (r1 != r7) goto L98
            long r7 = r13.getSendersCounter$kotlinx_coroutines_core()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L47
            r14.cleanPrev()
            goto L47
        L98:
            s7.K r7 = p7.AbstractC6066d.access$getSUSPEND_NO_WAITER$p()
            if (r1 != r7) goto La9
            r6.f34654f = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.W(r2, r3, r4, r6)
            if (r13 != r0) goto Lb2
            return r0
        La9:
            r14.cleanPrev()
            p7.i$b r13 = p7.C6071i.Companion
            java.lang.Object r13 = r13.m555successJP2dKIU(r1)
        Lb2:
            return r13
        Lb3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.V(p7.c, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W(p7.C6073k r11, int r12, long r13, W6.d r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.W(p7.k, int, long, W6.d):java.lang.Object");
    }

    public final Object X(C6073k c6073k, int i8, long j8, W6.d dVar) {
        C5998o orCreateCancellableContinuation = AbstractC6002q.getOrCreateCancellableContinuation(X6.b.intercepted(dVar));
        try {
            Object objM0 = m0(c6073k, i8, j8, orCreateCancellableContinuation);
            if (objM0 == AbstractC6066d.f34672k) {
                O(orCreateCancellableContinuation, c6073k, i8);
            } else {
                f7.l lVarBindCancellationFun = null;
                lVarBindCancellationFun = null;
                if (objM0 == AbstractC6066d.f34674m) {
                    if (j8 < getSendersCounter$kotlinx_coroutines_core()) {
                        c6073k.cleanPrev();
                    }
                    C6073k c6073k2 = (C6073k) f34637h.get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            H(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = f34633d.getAndIncrement(this);
                        int i9 = AbstractC6066d.SEGMENT_SIZE;
                        long j9 = andIncrement / i9;
                        int i10 = (int) (andIncrement % i9);
                        if (c6073k2.id != j9) {
                            C6073k c6073kL = l(j9, c6073k2);
                            if (c6073kL != null) {
                                c6073k2 = c6073kL;
                            }
                        }
                        objM0 = m0(c6073k2, i10, andIncrement, orCreateCancellableContinuation);
                        if (objM0 == AbstractC6066d.f34672k) {
                            C5998o c5998o = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                            if (c5998o != null) {
                                O(c5998o, c6073k2, i10);
                            }
                        } else if (objM0 == AbstractC6066d.f34674m) {
                            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                c6073k2.cleanPrev();
                            }
                        } else {
                            if (objM0 == AbstractC6066d.f34673l) {
                                throw new IllegalStateException("unexpected");
                            }
                            c6073k2.cleanPrev();
                            f7.l lVar = this.onUndeliveredElement;
                            if (lVar != null) {
                                lVarBindCancellationFun = AbstractC6236C.bindCancellationFun(lVar, objM0, orCreateCancellableContinuation.getContext());
                            }
                        }
                    }
                } else {
                    c6073k.cleanPrev();
                    f7.l lVar2 = this.onUndeliveredElement;
                    if (lVar2 != null) {
                        lVarBindCancellationFun = AbstractC6236C.bindCancellationFun(lVar2, objM0, orCreateCancellableContinuation.getContext());
                    }
                }
                orCreateCancellableContinuation.resume(objM0, lVarBindCancellationFun);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    public final void Y(v7.l lVar, Object obj) {
        C6073k c6073k = (C6073k) f34637h.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = f34633d.getAndIncrement(this);
            int i8 = AbstractC6066d.SEGMENT_SIZE;
            long j8 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (c6073k.id != j8) {
                C6073k c6073kL = l(j8, c6073k);
                if (c6073kL == null) {
                    continue;
                } else {
                    c6073k = c6073kL;
                }
            }
            Object objM0 = m0(c6073k, i9, andIncrement, lVar);
            if (objM0 == AbstractC6066d.f34672k) {
                W0 w02 = lVar instanceof W0 ? (W0) lVar : null;
                if (w02 != null) {
                    O(w02, c6073k, i9);
                    return;
                }
                return;
            }
            if (objM0 != AbstractC6066d.f34674m) {
                if (objM0 == AbstractC6066d.f34673l) {
                    throw new IllegalStateException("unexpected");
                }
                c6073k.cleanPrev();
                lVar.selectInRegistrationPhase(objM0);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                c6073k.cleanPrev();
            }
        }
        I(lVar);
    }

    private final boolean a(long j8) {
        return j8 < n() || j8 < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.f34641a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x00b3, code lost:
    
        r12 = (p7.C6073k) r12.getPrev();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a0(p7.C6073k r12) {
        /*
            r11 = this;
            f7.l r0 = r11.onUndeliveredElement
            r1 = 0
            r2 = 1
            java.lang.Object r3 = s7.C6256q.m583constructorimpl$default(r1, r2, r1)
        L8:
            int r4 = p7.AbstractC6066d.SEGMENT_SIZE
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.id
            int r8 = p7.AbstractC6066d.SEGMENT_SIZE
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.getState$kotlinx_coroutines_core(r4)
            s7.K r9 = p7.AbstractC6066d.access$getDONE_RCV$p()
            if (r8 == r9) goto Lbb
            s7.K r9 = p7.AbstractC6066d.BUFFERED
            if (r8 != r9) goto L48
            long r9 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            s7.K r9 = p7.AbstractC6066d.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.getElement$kotlinx_coroutines_core(r4)
            s7.U r1 = s7.AbstractC6236C.callUndeliveredElementCatchingException(r0, r5, r1)
        L40:
            r12.cleanElement$kotlinx_coroutines_core(r4)
            r12.onSlotCleaned()
            goto Laf
        L48:
            s7.K r9 = p7.AbstractC6066d.access$getIN_BUFFER$p()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof n7.W0
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof p7.C6100y
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            s7.K r9 = p7.AbstractC6066d.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto Lbb
            s7.K r9 = p7.AbstractC6066d.access$getRESUMING_BY_RCV$p()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            s7.K r9 = p7.AbstractC6066d.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof p7.C6100y
            if (r9 == 0) goto L80
            r9 = r8
            p7.y r9 = (p7.C6100y) r9
            n7.W0 r9 = r9.waiter
            goto L83
        L80:
            r9 = r8
            n7.W0 r9 = (n7.W0) r9
        L83:
            s7.K r10 = p7.AbstractC6066d.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.getElement$kotlinx_coroutines_core(r4)
            s7.U r1 = s7.AbstractC6236C.callUndeliveredElementCatchingException(r0, r5, r1)
        L97:
            java.lang.Object r3 = s7.C6256q.m588plusFjFbRPM(r3, r9)
            r12.cleanElement$kotlinx_coroutines_core(r4)
            r12.onSlotCleaned()
            goto Laf
        La2:
            s7.K r9 = p7.AbstractC6066d.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.onSlotCleaned()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            s7.f r12 = r12.getPrev()
            p7.k r12 = (p7.C6073k) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            n7.W0 r3 = (n7.W0) r3
            r11.c0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            n7.W0 r0 = (n7.W0) r0
            r11.c0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.a0(p7.k):void");
    }

    private final void b0(W0 w02) {
        d0(w02, true);
    }

    private final void c(C6073k c6073k, long j8) {
        Object objM583constructorimpl$default = C6256q.m583constructorimpl$default(null, 1, null);
        loop0: while (c6073k != null) {
            for (int i8 = AbstractC6066d.SEGMENT_SIZE - 1; -1 < i8; i8--) {
                if ((c6073k.id * AbstractC6066d.SEGMENT_SIZE) + i8 < j8) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i8);
                    if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != AbstractC6066d.f34664c) {
                        if (!(state$kotlinx_coroutines_core instanceof C6100y)) {
                            if (!(state$kotlinx_coroutines_core instanceof W0)) {
                                break;
                            }
                            if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.getCHANNEL_CLOSED())) {
                                objM583constructorimpl$default = C6256q.m588plusFjFbRPM(objM583constructorimpl$default, state$kotlinx_coroutines_core);
                                c6073k.onCancelledRequest(i8, true);
                                break;
                            }
                        } else {
                            if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.getCHANNEL_CLOSED())) {
                                objM583constructorimpl$default = C6256q.m588plusFjFbRPM(objM583constructorimpl$default, ((C6100y) state$kotlinx_coroutines_core).waiter);
                                c6073k.onCancelledRequest(i8, true);
                                break;
                            }
                        }
                    } else {
                        if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.getCHANNEL_CLOSED())) {
                            c6073k.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            c6073k = (C6073k) c6073k.getPrev();
        }
        if (objM583constructorimpl$default != null) {
            if (!(objM583constructorimpl$default instanceof ArrayList)) {
                b0((W0) objM583constructorimpl$default);
                return;
            }
            Intrinsics.checkNotNull(objM583constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) objM583constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                b0((W0) arrayList.get(size));
            }
        }
    }

    private final void c0(W0 w02) {
        d0(w02, false);
    }

    private final C6073k d() {
        Object obj = f34638i.get(this);
        C6073k c6073k = (C6073k) f34636g.get(this);
        if (c6073k.id > ((C6073k) obj).id) {
            obj = c6073k;
        }
        C6073k c6073k2 = (C6073k) f34637h.get(this);
        if (c6073k2.id > ((C6073k) obj).id) {
            obj = c6073k2;
        }
        return (C6073k) AbstractC6244e.close((AbstractC6245f) obj);
    }

    private final void d0(W0 w02, boolean z8) {
        if (w02 instanceof b) {
            InterfaceC5996n cont = ((b) w02).getCont();
            q.a aVar = R6.q.Companion;
            cont.resumeWith(R6.q.m67constructorimpl(Boolean.FALSE));
            return;
        }
        if (w02 instanceof InterfaceC5996n) {
            W6.d dVar = (W6.d) w02;
            q.a aVar2 = R6.q.Companion;
            dVar.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(z8 ? p() : q())));
        } else if (w02 instanceof C6097v) {
            C5998o c5998o = ((C6097v) w02).cont;
            q.a aVar3 = R6.q.Companion;
            c5998o.resumeWith(R6.q.m67constructorimpl(C6071i.m540boximpl(C6071i.Companion.m553closedJP2dKIU(o()))));
        } else if (w02 instanceof a) {
            ((a) w02).tryResumeHasNextOnClosedChannel();
        } else {
            if (w02 instanceof v7.l) {
                ((v7.l) w02).trySelect(this, AbstractC6066d.getCHANNEL_CLOSED());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + w02).toString());
        }
    }

    static /* synthetic */ Object e0(C6065c c6065c, Object obj, W6.d dVar) {
        C6073k c6073k = (C6073k) f34636g.get(c6065c);
        while (true) {
            long andIncrement = f34632c.getAndIncrement(c6065c);
            long j8 = 1152921504606846975L & andIncrement;
            boolean zX = c6065c.x(andIncrement);
            int i8 = AbstractC6066d.SEGMENT_SIZE;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (c6073k.id != j9) {
                C6073k c6073kM = c6065c.m(j9, c6073k);
                if (c6073kM != null) {
                    c6073k = c6073kM;
                } else if (zX) {
                    Object objK = c6065c.K(obj, dVar);
                    if (objK == X6.b.getCOROUTINE_SUSPENDED()) {
                        return objK;
                    }
                }
            }
            int iO0 = c6065c.o0(c6073k, i9, obj, j8, null, zX);
            if (iO0 == 0) {
                c6073k.cleanPrev();
                break;
            }
            if (iO0 == 1) {
                break;
            }
            if (iO0 != 2) {
                if (iO0 == 3) {
                    Object objG0 = c6065c.g0(c6073k, i9, obj, j8, dVar);
                    if (objG0 == X6.b.getCOROUTINE_SUSPENDED()) {
                        return objG0;
                    }
                } else if (iO0 == 4) {
                    if (j8 < c6065c.getReceiversCounter$kotlinx_coroutines_core()) {
                        c6073k.cleanPrev();
                    }
                    Object objK2 = c6065c.K(obj, dVar);
                    if (objK2 == X6.b.getCOROUTINE_SUSPENDED()) {
                        return objK2;
                    }
                } else if (iO0 == 5) {
                    c6073k.cleanPrev();
                }
            } else if (zX) {
                c6073k.onSlotCleaned();
                Object objK3 = c6065c.K(obj, dVar);
                if (objK3 == X6.b.getCOROUTINE_SUSPENDED()) {
                    return objK3;
                }
            }
        }
        return G.INSTANCE;
    }

    private final void f(long j8) {
        a0(g(j8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00a6, code lost:
    
        r0 = R6.q.Companion;
        r9.resumeWith(R6.q.m67constructorimpl(Y6.b.boxBoolean(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object f0(p7.C6065c r18, java.lang.Object r19, W6.d r20) {
        /*
            r8 = r18
            n7.o r9 = new n7.o
            W6.d r0 = X6.b.intercepted(r20)
            r10 = 1
            r9.<init>(r0, r10)
            r9.initCancellability()
            f7.l r0 = r8.onUndeliveredElement
            if (r0 != 0) goto Lc8
            p7.c$b r11 = new p7.c$b
            r11.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r8)
            p7.k r0 = (p7.C6073k) r0
        L22:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r12 = r1 & r3
            boolean r14 = access$isClosedForSend0(r8, r1)
            int r1 = p7.AbstractC6066d.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r12 / r2
            long r4 = (long) r1
            long r4 = r12 % r4
            int r15 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r16 = 0
            if (r1 == 0) goto L5f
            p7.k r1 = access$findSegmentSend(r8, r2, r0)
            if (r1 != 0) goto L5d
            if (r14 == 0) goto L22
        L4e:
            R6.q$a r0 = R6.q.Companion
            java.lang.Boolean r0 = Y6.b.boxBoolean(r16)
            java.lang.Object r0 = R6.q.m67constructorimpl(r0)
            r9.resumeWith(r0)
            goto Lba
        L5d:
            r7 = r1
            goto L60
        L5f:
            r7 = r0
        L60:
            r0 = r18
            r1 = r7
            r2 = r15
            r3 = r19
            r4 = r12
            r6 = r11
            r17 = r7
            r7 = r14
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb4
            if (r0 == r10) goto La6
            r1 = 2
            if (r0 == r1) goto L9a
            r1 = 3
            if (r0 == r1) goto L92
            r1 = 4
            if (r0 == r1) goto L86
            r1 = 5
            if (r0 == r1) goto L80
            goto L83
        L80:
            r17.cleanPrev()
        L83:
            r0 = r17
            goto L22
        L86:
            long r0 = r18.getReceiversCounter$kotlinx_coroutines_core()
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4e
            r17.cleanPrev()
            goto L4e
        L92:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)
            throw r0
        L9a:
            if (r14 == 0) goto La0
            r17.onSlotCleaned()
            goto L4e
        La0:
            r0 = r17
            access$prepareSenderForSuspension(r8, r11, r0, r15)
            goto Lba
        La6:
            R6.q$a r0 = R6.q.Companion
            java.lang.Boolean r0 = Y6.b.boxBoolean(r10)
            java.lang.Object r0 = R6.q.m67constructorimpl(r0)
            r9.resumeWith(r0)
            goto Lba
        Lb4:
            r0 = r17
            r0.cleanPrev()
            goto La6
        Lba:
            java.lang.Object r0 = r9.getResult()
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lc7
            Y6.h.probeCoroutineSuspended(r20)
        Lc7:
            return r0
        Lc8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.f0(p7.c, java.lang.Object, W6.d):java.lang.Object");
    }

    private final C6073k g(long j8) {
        C6073k c6073kD = d();
        if (y()) {
            long jA = A(c6073kD);
            if (jA != -1) {
                i(jA);
            }
        }
        c(c6073kD, j8);
        return c6073kD;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g0(p7.C6073k r21, int r22, java.lang.Object r23, long r24, W6.d r26) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.g0(p7.k, int, java.lang.Object, long, W6.d):java.lang.Object");
    }

    private final void h() {
        isClosedForSend();
    }

    private final boolean h0(long j8) {
        if (x(j8)) {
            return false;
        }
        return !a(j8 & 1152921504606846975L);
    }

    private final boolean i0(Object obj, Object obj2) {
        if (obj instanceof v7.l) {
            return ((v7.l) obj).trySelect(this, obj2);
        }
        if (obj instanceof C6097v) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C6097v c6097v = (C6097v) obj;
            C5998o c5998o = c6097v.cont;
            C6071i c6071iM540boximpl = C6071i.m540boximpl(C6071i.Companion.m555successJP2dKIU(obj2));
            f7.l lVar = this.onUndeliveredElement;
            return AbstractC6066d.e(c5998o, c6071iM540boximpl, lVar != null ? AbstractC6236C.bindCancellationFun(lVar, obj2, c6097v.cont.getContext()) : null);
        }
        if (obj instanceof a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).tryResumeHasNext(obj2);
        }
        if (obj instanceof InterfaceC5996n) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC5996n interfaceC5996n = (InterfaceC5996n) obj;
            f7.l lVar2 = this.onUndeliveredElement;
            return AbstractC6066d.e(interfaceC5996n, obj2, lVar2 != null ? AbstractC6236C.bindCancellationFun(lVar2, obj2, interfaceC5996n.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final void j() {
        if (z()) {
            return;
        }
        C6073k c6073k = (C6073k) f34638i.get(this);
        while (true) {
            long andIncrement = f34634e.getAndIncrement(this);
            int i8 = AbstractC6066d.SEGMENT_SIZE;
            long j8 = andIncrement / i8;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (c6073k.id < j8 && c6073k.getNext() != null) {
                    E(j8, c6073k);
                }
                s(this, 0L, 1, null);
                return;
            }
            if (c6073k.id != j8) {
                C6073k c6073kK = k(j8, c6073k, andIncrement);
                if (c6073kK == null) {
                    continue;
                } else {
                    c6073k = c6073kK;
                }
            }
            if (k0(c6073k, (int) (andIncrement % i8), andIncrement)) {
                s(this, 0L, 1, null);
                return;
            }
            s(this, 0L, 1, null);
        }
    }

    private final boolean j0(Object obj, C6073k c6073k, int i8) {
        if (obj instanceof InterfaceC5996n) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC6066d.f((InterfaceC5996n) obj, G.INSTANCE, null, 2, null);
        }
        if (obj instanceof v7.l) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            v7.o oVarTrySelectDetailed = ((v7.k) obj).trySelectDetailed(this, G.INSTANCE);
            if (oVarTrySelectDetailed == v7.o.REREGISTER) {
                c6073k.cleanElement$kotlinx_coroutines_core(i8);
            }
            return oVarTrySelectDetailed == v7.o.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return AbstractC6066d.f(((b) obj).getCont(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final C6073k k(long j8, C6073k c6073k, long j9) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34638i;
        f7.p pVar = (f7.p) AbstractC6066d.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = AbstractC6244e.findSegmentInternal(c6073k, j8, pVar);
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
        if (I.m578isClosedimpl(objFindSegmentInternal)) {
            h();
            E(j8, c6073k);
            s(this, 0L, 1, null);
            return null;
        }
        C6073k c6073k2 = (C6073k) I.m576getSegmentimpl(objFindSegmentInternal);
        long j10 = c6073k2.id;
        if (j10 <= j8) {
            return c6073k2;
        }
        int i8 = AbstractC6066d.SEGMENT_SIZE;
        if (f34634e.compareAndSet(this, j9 + 1, i8 * j10)) {
            r((c6073k2.id * i8) - j9);
            return null;
        }
        s(this, 0L, 1, null);
        return null;
    }

    private final boolean k0(C6073k c6073k, int i8, long j8) {
        Object state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i8);
        if (!(state$kotlinx_coroutines_core instanceof W0) || j8 < f34633d.get(this) || !c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.f34666e)) {
            return l0(c6073k, i8, j8);
        }
        if (j0(state$kotlinx_coroutines_core, c6073k, i8)) {
            c6073k.setState$kotlinx_coroutines_core(i8, AbstractC6066d.BUFFERED);
            return true;
        }
        c6073k.setState$kotlinx_coroutines_core(i8, AbstractC6066d.f34669h);
        c6073k.onCancelledRequest(i8, false);
        return false;
    }

    public final C6073k l(long j8, C6073k c6073k) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34637h;
        f7.p pVar = (f7.p) AbstractC6066d.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = AbstractC6244e.findSegmentInternal(c6073k, j8, pVar);
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
        if (I.m578isClosedimpl(objFindSegmentInternal)) {
            h();
            if (c6073k.id * AbstractC6066d.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            c6073k.cleanPrev();
            return null;
        }
        C6073k c6073k2 = (C6073k) I.m576getSegmentimpl(objFindSegmentInternal);
        if (!z() && j8 <= n() / AbstractC6066d.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f34638i;
            while (true) {
                H h9 = (H) atomicReferenceFieldUpdater2.get(this);
                if (h9.id >= c6073k2.id || !c6073k2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, h9, c6073k2)) {
                    if (h9.decPointers$kotlinx_coroutines_core()) {
                        h9.remove();
                    }
                } else if (c6073k2.decPointers$kotlinx_coroutines_core()) {
                    c6073k2.remove();
                }
            }
        }
        long j9 = c6073k2.id;
        if (j9 <= j8) {
            return c6073k2;
        }
        int i8 = AbstractC6066d.SEGMENT_SIZE;
        q0(j9 * i8);
        if (c6073k2.id * i8 >= getSendersCounter$kotlinx_coroutines_core()) {
            return null;
        }
        c6073k2.cleanPrev();
        return null;
    }

    private final boolean l0(C6073k c6073k, int i8, long j8) {
        while (true) {
            Object state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i8);
            if (state$kotlinx_coroutines_core instanceof W0) {
                if (j8 < f34633d.get(this)) {
                    if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, new C6100y((W0) state$kotlinx_coroutines_core))) {
                        return true;
                    }
                } else if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.f34666e)) {
                    if (j0(state$kotlinx_coroutines_core, c6073k, i8)) {
                        c6073k.setState$kotlinx_coroutines_core(i8, AbstractC6066d.BUFFERED);
                        return true;
                    }
                    c6073k.setState$kotlinx_coroutines_core(i8, AbstractC6066d.f34669h);
                    c6073k.onCancelledRequest(i8, false);
                    return false;
                }
            } else {
                if (state$kotlinx_coroutines_core == AbstractC6066d.f34669h) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.f34664c)) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == AbstractC6066d.BUFFERED || state$kotlinx_coroutines_core == AbstractC6066d.f34667f || state$kotlinx_coroutines_core == AbstractC6066d.f34668g || state$kotlinx_coroutines_core == AbstractC6066d.f34670i || state$kotlinx_coroutines_core == AbstractC6066d.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != AbstractC6066d.f34665d) {
                        throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                    }
                }
            }
        }
    }

    public final C6073k m(long j8, C6073k c6073k) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34636g;
        f7.p pVar = (f7.p) AbstractC6066d.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = AbstractC6244e.findSegmentInternal(c6073k, j8, pVar);
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
        if (I.m578isClosedimpl(objFindSegmentInternal)) {
            h();
            if (c6073k.id * AbstractC6066d.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            c6073k.cleanPrev();
            return null;
        }
        C6073k c6073k2 = (C6073k) I.m576getSegmentimpl(objFindSegmentInternal);
        long j9 = c6073k2.id;
        if (j9 <= j8) {
            return c6073k2;
        }
        int i8 = AbstractC6066d.SEGMENT_SIZE;
        r0(j9 * i8);
        if (c6073k2.id * i8 >= getReceiversCounter$kotlinx_coroutines_core()) {
            return null;
        }
        c6073k2.cleanPrev();
        return null;
    }

    public final Object m0(C6073k c6073k, int i8, long j8, Object obj) {
        Object state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i8);
        if (state$kotlinx_coroutines_core == null) {
            if (j8 >= (f34632c.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC6066d.f34673l;
                }
                if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, obj)) {
                    j();
                    return AbstractC6066d.f34672k;
                }
            }
        } else if (state$kotlinx_coroutines_core == AbstractC6066d.BUFFERED && c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.f34668g)) {
            j();
            return c6073k.retrieveElement$kotlinx_coroutines_core(i8);
        }
        return n0(c6073k, i8, j8, obj);
    }

    private final long n() {
        return f34634e.get(this);
    }

    private final Object n0(C6073k c6073k, int i8, long j8, Object obj) {
        while (true) {
            Object state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i8);
            if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == AbstractC6066d.f34664c) {
                if (j8 < (f34632c.get(this) & 1152921504606846975L)) {
                    if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.f34667f)) {
                        j();
                        return AbstractC6066d.f34674m;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC6066d.f34673l;
                    }
                    if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, obj)) {
                        j();
                        return AbstractC6066d.f34672k;
                    }
                }
            } else {
                if (state$kotlinx_coroutines_core != AbstractC6066d.BUFFERED) {
                    if (state$kotlinx_coroutines_core != AbstractC6066d.f34669h && state$kotlinx_coroutines_core != AbstractC6066d.f34667f) {
                        if (state$kotlinx_coroutines_core == AbstractC6066d.getCHANNEL_CLOSED()) {
                            j();
                            return AbstractC6066d.f34674m;
                        }
                        if (state$kotlinx_coroutines_core != AbstractC6066d.f34666e && c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.f34665d)) {
                            boolean z8 = state$kotlinx_coroutines_core instanceof C6100y;
                            if (z8) {
                                state$kotlinx_coroutines_core = ((C6100y) state$kotlinx_coroutines_core).waiter;
                            }
                            if (j0(state$kotlinx_coroutines_core, c6073k, i8)) {
                                c6073k.setState$kotlinx_coroutines_core(i8, AbstractC6066d.f34668g);
                                j();
                                return c6073k.retrieveElement$kotlinx_coroutines_core(i8);
                            }
                            c6073k.setState$kotlinx_coroutines_core(i8, AbstractC6066d.f34669h);
                            c6073k.onCancelledRequest(i8, false);
                            if (z8) {
                                j();
                            }
                            return AbstractC6066d.f34674m;
                        }
                    }
                    return AbstractC6066d.f34674m;
                }
                if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.f34668g)) {
                    j();
                    return c6073k.retrieveElement$kotlinx_coroutines_core(i8);
                }
            }
        }
    }

    public final int o0(C6073k c6073k, int i8, Object obj, long j8, Object obj2, boolean z8) {
        c6073k.storeElement$kotlinx_coroutines_core(i8, obj);
        if (z8) {
            return p0(c6073k, i8, obj, j8, obj2, z8);
        }
        Object state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i8);
        if (state$kotlinx_coroutines_core == null) {
            if (a(j8)) {
                if (c6073k.casState$kotlinx_coroutines_core(i8, null, AbstractC6066d.BUFFERED)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c6073k.casState$kotlinx_coroutines_core(i8, null, obj2)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof W0) {
            c6073k.cleanElement$kotlinx_coroutines_core(i8);
            if (i0(state$kotlinx_coroutines_core, obj)) {
                c6073k.setState$kotlinx_coroutines_core(i8, AbstractC6066d.f34668g);
                M();
                return 0;
            }
            if (c6073k.getAndSetState$kotlinx_coroutines_core(i8, AbstractC6066d.f34670i) != AbstractC6066d.f34670i) {
                c6073k.onCancelledRequest(i8, true);
            }
            return 5;
        }
        return p0(c6073k, i8, obj, j8, obj2, z8);
    }

    public final Throwable p() {
        Throwable thO = o();
        return thO == null ? new C6091p(AbstractC6074l.DEFAULT_CLOSE_MESSAGE) : thO;
    }

    private final int p0(C6073k c6073k, int i8, Object obj, long j8, Object obj2, boolean z8) {
        while (true) {
            Object state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i8);
            if (state$kotlinx_coroutines_core == null) {
                if (!a(j8) || z8) {
                    if (z8) {
                        if (c6073k.casState$kotlinx_coroutines_core(i8, null, AbstractC6066d.f34669h)) {
                            c6073k.onCancelledRequest(i8, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c6073k.casState$kotlinx_coroutines_core(i8, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c6073k.casState$kotlinx_coroutines_core(i8, null, AbstractC6066d.BUFFERED)) {
                    return 1;
                }
            } else {
                if (state$kotlinx_coroutines_core != AbstractC6066d.f34664c) {
                    if (state$kotlinx_coroutines_core == AbstractC6066d.f34670i) {
                        c6073k.cleanElement$kotlinx_coroutines_core(i8);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == AbstractC6066d.f34667f) {
                        c6073k.cleanElement$kotlinx_coroutines_core(i8);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == AbstractC6066d.getCHANNEL_CLOSED()) {
                        c6073k.cleanElement$kotlinx_coroutines_core(i8);
                        h();
                        return 4;
                    }
                    c6073k.cleanElement$kotlinx_coroutines_core(i8);
                    if (state$kotlinx_coroutines_core instanceof C6100y) {
                        state$kotlinx_coroutines_core = ((C6100y) state$kotlinx_coroutines_core).waiter;
                    }
                    if (i0(state$kotlinx_coroutines_core, obj)) {
                        c6073k.setState$kotlinx_coroutines_core(i8, AbstractC6066d.f34668g);
                        M();
                        return 0;
                    }
                    if (c6073k.getAndSetState$kotlinx_coroutines_core(i8, AbstractC6066d.f34670i) != AbstractC6066d.f34670i) {
                        c6073k.onCancelledRequest(i8, true);
                    }
                    return 5;
                }
                if (c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.BUFFERED)) {
                    return 1;
                }
            }
        }
    }

    private final void q0(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f34633d;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            if (j9 >= j8) {
                return;
            }
        } while (!f34633d.compareAndSet(this, j9, j8));
    }

    private final void r(long j8) {
        if ((f34635f.addAndGet(this, j8) & AbstractC5822d.MAX_POWER_OF_TWO) != 0) {
            while ((f34635f.get(this) & AbstractC5822d.MAX_POWER_OF_TWO) != 0) {
            }
        }
    }

    private final void r0(long j8) {
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f34632c;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            j10 = 1152921504606846975L & j9;
            if (j10 >= j8) {
                return;
            }
        } while (!f34632c.compareAndSet(this, j9, AbstractC6066d.b(j10, (int) (j9 >> 60))));
    }

    static /* synthetic */ void s(C6065c c6065c, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i8 & 1) != 0) {
            j8 = 1;
        }
        c6065c.r(j8);
    }

    public static /* synthetic */ Object sendImpl$default(C6065c c6065c, Object obj, Object obj2, InterfaceC5519a interfaceC5519a, f7.p pVar, InterfaceC5519a interfaceC5519a2, f7.r rVar, int i8, Object obj3) {
        C6073k c6073k;
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        f7.r rVar2 = (i8 & 32) != 0 ? n.INSTANCE : rVar;
        C6073k c6073k2 = (C6073k) f34636g.get(c6065c);
        while (true) {
            long andIncrement = f34632c.getAndIncrement(c6065c);
            long j8 = andIncrement & 1152921504606846975L;
            boolean zX = c6065c.x(andIncrement);
            int i9 = AbstractC6066d.SEGMENT_SIZE;
            long j9 = j8 / i9;
            int i10 = (int) (j8 % i9);
            if (c6073k2.id != j9) {
                C6073k c6073kM = c6065c.m(j9, c6073k2);
                if (c6073kM != null) {
                    c6073k = c6073kM;
                } else if (zX) {
                    return interfaceC5519a2.invoke();
                }
            } else {
                c6073k = c6073k2;
            }
            int iO0 = c6065c.o0(c6073k, i10, obj, j8, obj2, zX);
            if (iO0 == 0) {
                c6073k.cleanPrev();
                return interfaceC5519a.invoke();
            }
            if (iO0 == 1) {
                return interfaceC5519a.invoke();
            }
            if (iO0 == 2) {
                if (zX) {
                    c6073k.onSlotCleaned();
                    return interfaceC5519a2.invoke();
                }
                W0 w02 = obj2 instanceof W0 ? (W0) obj2 : null;
                if (w02 != null) {
                    c6065c.P(w02, c6073k, i10);
                }
                return pVar.invoke(c6073k, Integer.valueOf(i10));
            }
            if (iO0 == 3) {
                return rVar2.invoke(c6073k, Integer.valueOf(i10), obj, Long.valueOf(j8));
            }
            if (iO0 == 4) {
                if (j8 < c6065c.getReceiversCounter$kotlinx_coroutines_core()) {
                    c6073k.cleanPrev();
                }
                return interfaceC5519a2.invoke();
            }
            if (iO0 == 5) {
                c6073k.cleanPrev();
            }
            c6073k2 = c6073k;
        }
    }

    private final void t() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34640k;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? AbstractC6066d.f34676o : AbstractC6066d.f34677p));
        if (obj == null) {
            return;
        }
        ((f7.l) obj).invoke(o());
    }

    private final boolean u(C6073k c6073k, int i8, long j8) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i8);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != AbstractC6066d.f34664c) {
                if (state$kotlinx_coroutines_core == AbstractC6066d.BUFFERED) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == AbstractC6066d.f34669h || state$kotlinx_coroutines_core == AbstractC6066d.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == AbstractC6066d.f34668g || state$kotlinx_coroutines_core == AbstractC6066d.f34667f) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == AbstractC6066d.f34666e) {
                    return true;
                }
                return state$kotlinx_coroutines_core != AbstractC6066d.f34665d && j8 == getReceiversCounter$kotlinx_coroutines_core();
            }
        } while (!c6073k.casState$kotlinx_coroutines_core(i8, state$kotlinx_coroutines_core, AbstractC6066d.f34667f));
        j();
        return false;
    }

    private final boolean v(long j8, boolean z8) {
        int i8 = (int) (j8 >> 60);
        if (i8 == 0 || i8 == 1) {
            return false;
        }
        if (i8 == 2) {
            g(j8 & 1152921504606846975L);
            if (z8 && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        } else {
            if (i8 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i8).toString());
            }
            f(j8 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean w(long j8) {
        return v(j8, true);
    }

    public final boolean x(long j8) {
        return v(j8, false);
    }

    private final boolean z() {
        long jN = n();
        return jN == 0 || jN == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0082, code lost:
    
        r14.selectInRegistrationPhase(R6.G.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void Z(v7.l r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r13)
            p7.k r0 = (p7.C6073k) r0
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r1 = access$isClosedForSend0(r13, r1)
            int r2 = p7.AbstractC6066d.SEGMENT_SIZE
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.id
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L39
            p7.k r5 = access$findSegmentSend(r13, r5, r0)
            if (r5 != 0) goto L38
            if (r1 == 0) goto La
        L33:
            r13.J(r15, r14)
            goto L8c
        L38:
            r0 = r5
        L39:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = access$updateCellSend(r5, r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L88
            r6 = 1
            if (r5 == r6) goto L82
            r6 = 2
            if (r5 == r6) goto L6e
            r1 = 3
            if (r5 == r1) goto L66
            r1 = 4
            if (r5 == r1) goto L5a
            r1 = 5
            if (r5 == r1) goto L56
            goto La
        L56:
            r0.cleanPrev()
            goto La
        L5a:
            long r1 = r13.getReceiversCounter$kotlinx_coroutines_core()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L33
            r0.cleanPrev()
            goto L33
        L66:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            r14.<init>(r15)
            throw r14
        L6e:
            if (r1 == 0) goto L74
            r0.onSlotCleaned()
            goto L33
        L74:
            boolean r15 = r14 instanceof n7.W0
            if (r15 == 0) goto L7b
            n7.W0 r14 = (n7.W0) r14
            goto L7c
        L7b:
            r14 = 0
        L7c:
            if (r14 == 0) goto L8c
            access$prepareSenderForSuspension(r13, r14, r0, r2)
            goto L8c
        L82:
            R6.G r15 = R6.G.INSTANCE
            r14.selectInRegistrationPhase(r15)
            goto L8c
        L88:
            r0.cleanPrev()
            goto L82
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.Z(v7.l, java.lang.Object):void");
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public final boolean cancel(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return e(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        if (z()) {
            if (f34638i.get(this) != AbstractC6066d.f34662a) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((C6073k) f34637h.get(this)).id > ((C6073k) f34638i.get(this)).id) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        List listListOf = S6.r.listOf((Object[]) new C6073k[]{f34637h.get(this), f34636g.get(this), f34638i.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((C6073k) obj) != AbstractC6066d.f34662a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j8 = ((C6073k) next).id;
            do {
                Object next2 = it.next();
                long j9 = ((C6073k) next2).id;
                if (j8 > j9) {
                    next = next2;
                    j8 = j9;
                }
            } while (it.hasNext());
        }
        C6073k c6073k = (C6073k) next;
        if (c6073k.getPrev() != null) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (c6073k.getNext() != null) {
            AbstractC6245f next3 = c6073k.getNext();
            Intrinsics.checkNotNull(next3);
            if (((C6073k) next3).getPrev() != null) {
                AbstractC6245f next4 = c6073k.getNext();
                Intrinsics.checkNotNull(next4);
                if (((C6073k) next4).getPrev() != c6073k) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i8 = AbstractC6066d.SEGMENT_SIZE;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i10);
                if (!Intrinsics.areEqual(state$kotlinx_coroutines_core, AbstractC6066d.BUFFERED) && !(state$kotlinx_coroutines_core instanceof W0)) {
                    if (Intrinsics.areEqual(state$kotlinx_coroutines_core, AbstractC6066d.f34670i) ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, AbstractC6066d.f34669h) ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, AbstractC6066d.getCHANNEL_CLOSED())) {
                        if (!(c6073k.getElement$kotlinx_coroutines_core(i10) == null)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        i9++;
                    } else {
                        if (!(Intrinsics.areEqual(state$kotlinx_coroutines_core, AbstractC6066d.f34667f) ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, AbstractC6066d.f34668g))) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                        }
                        if (!(c6073k.getElement$kotlinx_coroutines_core(i10) == null)) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
            if (i9 == AbstractC6066d.SEGMENT_SIZE) {
                if (!(c6073k == f34637h.get(this) || c6073k == f34636g.get(this) || c6073k == f34638i.get(this))) {
                    throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
                }
            }
            AbstractC6245f next5 = c6073k.getNext();
            Intrinsics.checkNotNull(next5);
            c6073k = (C6073k) next5;
        }
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public boolean close(Throwable th) {
        return e(th, false);
    }

    protected boolean e(Throwable th, boolean z8) {
        if (z8) {
            B();
        }
        boolean zA = androidx.concurrent.futures.b.a(f34639j, this, AbstractC6066d.f34678q, th);
        if (z8) {
            C();
        } else {
            D();
        }
        h();
        F();
        if (zA) {
            t();
        }
        return zA;
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public v7.f getOnReceive() {
        C0365c c0365c = C0365c.INSTANCE;
        Intrinsics.checkNotNull(c0365c, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        f7.q qVar = (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(c0365c, 3);
        d dVar = d.INSTANCE;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new v7.g(this, qVar, (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(dVar, 3), this.f34642b);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public v7.f getOnReceiveCatching() {
        e eVar = e.INSTANCE;
        Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        f7.q qVar = (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(eVar, 3);
        f fVar = f.INSTANCE;
        Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new v7.g(this, qVar, (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(fVar, 3), this.f34642b);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public v7.f getOnReceiveOrNull() {
        g gVar = g.INSTANCE;
        Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        f7.q qVar = (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(gVar, 3);
        h hVar = h.INSTANCE;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new v7.g(this, qVar, (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(hVar, 3), this.f34642b);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public v7.h getOnSend() {
        i iVar = i.INSTANCE;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        f7.q qVar = (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(iVar, 3);
        j jVar = j.INSTANCE;
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new v7.i(this, qVar, (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jVar, 3), null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return f34633d.get(this);
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return f34632c.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34637h;
            C6073k c6073kL = (C6073k) atomicReferenceFieldUpdater.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i8 = AbstractC6066d.SEGMENT_SIZE;
            long j8 = receiversCounter$kotlinx_coroutines_core / i8;
            if (c6073kL.id == j8 || (c6073kL = l(j8, c6073kL)) != null) {
                c6073kL.cleanPrev();
                if (u(c6073kL, (int) (receiversCounter$kotlinx_coroutines_core % i8), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                f34633d.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, receiversCounter$kotlinx_coroutines_core + 1);
            } else if (((C6073k) atomicReferenceFieldUpdater.get(this)).id < j8) {
                return false;
            }
        }
    }

    protected final void i(long j8) {
        U uCallUndeliveredElementCatchingException$default;
        C6073k c6073k = (C6073k) f34637h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f34633d;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(this.f34641a + j9, n())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, j9 + 1)) {
                int i8 = AbstractC6066d.SEGMENT_SIZE;
                long j10 = j9 / i8;
                int i9 = (int) (j9 % i8);
                if (c6073k.id != j10) {
                    C6073k c6073kL = l(j10, c6073k);
                    if (c6073kL == null) {
                        continue;
                    } else {
                        c6073k = c6073kL;
                    }
                }
                Object objM0 = m0(c6073k, i9, j9, null);
                if (objM0 != AbstractC6066d.f34674m) {
                    c6073k.cleanPrev();
                    f7.l lVar = this.onUndeliveredElement;
                    if (lVar != null && (uCallUndeliveredElementCatchingException$default = AbstractC6236C.callUndeliveredElementCatchingException$default(lVar, objM0, null, 2, null)) != null) {
                        throw uCallUndeliveredElementCatchingException$default;
                    }
                } else if (j9 < getSendersCounter$kotlinx_coroutines_core()) {
                    c6073k.cleanPrev();
                }
            }
        }
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public void invokeOnClose(f7.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34640k;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, lVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != AbstractC6066d.f34676o) {
                if (obj == AbstractC6066d.f34677p) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f34640k, this, AbstractC6066d.f34676o, AbstractC6066d.f34677p));
        lVar.invoke(o());
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public boolean isClosedForReceive() {
        return w(f34632c.get(this));
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public boolean isClosedForSend() {
        return x(f34632c.get(this));
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public InterfaceC6069g iterator() {
        return new a();
    }

    protected final Throwable o() {
        return (Throwable) f34639j.get(this);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public boolean offer(Object obj) {
        return InterfaceC6067e.a.offer(this, obj);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public Object poll() {
        return InterfaceC6067e.a.poll(this);
    }

    protected final Throwable q() {
        Throwable thO = o();
        return thO == null ? new C6092q(AbstractC6074l.DEFAULT_CLOSE_MESSAGE) : thO;
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public Object receive(W6.d<Object> dVar) {
        return U(this, dVar);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    /* renamed from: receiveCatching-JP2dKIU */
    public Object mo533receiveCatchingJP2dKIU(W6.d<? super C6071i> dVar) {
        return V(this, dVar);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public Object receiveOrNull(W6.d<Object> dVar) {
        return InterfaceC6067e.a.receiveOrNull(this, dVar);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public Object send(Object obj, W6.d<? super G> dVar) {
        return e0(this, obj, dVar);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(Object obj, W6.d<? super Boolean> dVar) {
        return f0(this, obj, dVar);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return h0(f34632c.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x01dc, code lost:
    
        r3 = (p7.C6073k) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x01e3, code lost:
    
        if (r3 != null) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        String strValueOf;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S=");
        sb2.append(getSendersCounter$kotlinx_coroutines_core());
        sb2.append(",R=");
        sb2.append(getReceiversCounter$kotlinx_coroutines_core());
        sb2.append(",B=");
        sb2.append(n());
        sb2.append(",B'=");
        sb2.append(f34635f.get(this));
        sb2.append(",C=");
        AtomicLongFieldUpdater atomicLongFieldUpdater = f34632c;
        sb2.append((int) (atomicLongFieldUpdater.get(this) >> 60));
        sb2.append(',');
        sb.append(sb2.toString());
        int i8 = (int) (atomicLongFieldUpdater.get(this) >> 60);
        if (i8 == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i8 == 2) {
            sb.append("CLOSED,");
        } else if (i8 == 3) {
            sb.append("CANCELLED,");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SEND_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34636g;
        sb3.append(P.getHexAddress(atomicReferenceFieldUpdater.get(this)));
        sb3.append(",RCV_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f34637h;
        sb3.append(P.getHexAddress(atomicReferenceFieldUpdater2.get(this)));
        sb.append(sb3.toString());
        if (!z()) {
            sb.append(",EB_SEGM=" + P.getHexAddress(f34638i.get(this)));
        }
        sb.append("  ");
        List listListOf = S6.r.listOf((Object[]) new C6073k[]{atomicReferenceFieldUpdater2.get(this), atomicReferenceFieldUpdater.get(this), f34638i.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((C6073k) obj) != AbstractC6066d.f34662a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j8 = ((C6073k) next).id;
            do {
                Object next2 = it.next();
                long j9 = ((C6073k) next2).id;
                if (j8 > j9) {
                    next = next2;
                    j8 = j9;
                }
            } while (it.hasNext());
        }
        C6073k c6073k = (C6073k) next;
        do {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(P.getHexAddress(c6073k));
            sb4.append("=[");
            sb4.append(c6073k.isRemoved() ? "*" : "");
            sb4.append(c6073k.id);
            sb4.append(",prev=");
            C6073k c6073k2 = (C6073k) c6073k.getPrev();
            sb4.append(c6073k2 != null ? P.getHexAddress(c6073k2) : null);
            sb4.append(',');
            sb.append(sb4.toString());
            int i9 = AbstractC6066d.SEGMENT_SIZE;
            for (int i10 = 0; i10 < i9; i10++) {
                Object state$kotlinx_coroutines_core = c6073k.getState$kotlinx_coroutines_core(i10);
                Object element$kotlinx_coroutines_core = c6073k.getElement$kotlinx_coroutines_core(i10);
                if (state$kotlinx_coroutines_core instanceof InterfaceC5996n) {
                    strValueOf = "cont";
                } else if (state$kotlinx_coroutines_core instanceof v7.l) {
                    strValueOf = "select";
                } else if (state$kotlinx_coroutines_core instanceof C6097v) {
                    strValueOf = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof b) {
                    strValueOf = "send(broadcast)";
                } else if (state$kotlinx_coroutines_core instanceof C6100y) {
                    strValueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    strValueOf = String.valueOf(state$kotlinx_coroutines_core);
                }
                sb.append('[' + i10 + "]=(" + strValueOf + ',' + element$kotlinx_coroutines_core + "),");
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("next=");
            C6073k c6073k3 = (C6073k) c6073k.getNext();
            sb5.append(c6073k3 != null ? P.getHexAddress(c6073k3) : null);
            sb5.append("]  ");
            sb.append(sb5.toString());
            c6073k = (C6073k) c6073k.getNext();
        } while (c6073k != null);
        return sb.toString();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    /* renamed from: tryReceive-PtdJZtk */
    public Object mo534tryReceivePtdJZtk() {
        C6073k c6073k;
        long j8 = f34633d.get(this);
        long j9 = f34632c.get(this);
        if (w(j9)) {
            return C6071i.Companion.m553closedJP2dKIU(o());
        }
        if (j8 >= (j9 & 1152921504606846975L)) {
            return C6071i.Companion.m554failurePtdJZtk();
        }
        Object obj = AbstractC6066d.f34670i;
        C6073k c6073k2 = (C6073k) f34637h.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = f34633d.getAndIncrement(this);
            int i8 = AbstractC6066d.SEGMENT_SIZE;
            long j10 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (c6073k2.id != j10) {
                C6073k c6073kL = l(j10, c6073k2);
                if (c6073kL == null) {
                    continue;
                } else {
                    c6073k = c6073kL;
                }
            } else {
                c6073k = c6073k2;
            }
            Object objM0 = m0(c6073k, i9, andIncrement, obj);
            if (objM0 == AbstractC6066d.f34672k) {
                W0 w02 = obj instanceof W0 ? (W0) obj : null;
                if (w02 != null) {
                    O(w02, c6073k, i9);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                c6073k.onSlotCleaned();
                return C6071i.Companion.m554failurePtdJZtk();
            }
            if (objM0 != AbstractC6066d.f34674m) {
                if (objM0 == AbstractC6066d.f34673l) {
                    throw new IllegalStateException("unexpected");
                }
                c6073k.cleanPrev();
                return C6071i.Companion.m555successJP2dKIU(objM0);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                c6073k.cleanPrev();
            }
            c6073k2 = c6073k;
        }
        return C6071i.Companion.m553closedJP2dKIU(o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        return p7.C6071i.Companion.m555successJP2dKIU(R6.G.INSTANCE);
     */
    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    /* renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo535trySendJP2dKIU(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p7.C6065c.f34632c
            long r0 = r0.get(r14)
            boolean r0 = r14.h0(r0)
            if (r0 == 0) goto L13
            p7.i$b r15 = p7.C6071i.Companion
            java.lang.Object r15 = r15.m554failurePtdJZtk()
            return r15
        L13:
            s7.K r8 = p7.AbstractC6066d.access$getINTERRUPTED_SEND$p()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r14)
            p7.k r0 = (p7.C6073k) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = access$isClosedForSend0(r14, r1)
            int r1 = p7.AbstractC6066d.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            p7.k r1 = access$findSegmentSend(r14, r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L21
        L4b:
            p7.i$b r15 = p7.C6071i.Companion
            java.lang.Throwable r0 = r14.q()
            java.lang.Object r15 = r15.m553closedJP2dKIU(r0)
            goto Lba
        L57:
            r13 = r1
            goto L5a
        L59:
            r13 = r0
        L5a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb6
            r1 = 1
            if (r0 == r1) goto Lad
            r1 = 2
            if (r0 == r1) goto L90
            r1 = 3
            if (r0 == r1) goto L88
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L77
            goto L7a
        L77:
            r13.cleanPrev()
        L7a:
            r0 = r13
            goto L21
        L7c:
            long r0 = r14.getReceiversCounter$kotlinx_coroutines_core()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4b
            r13.cleanPrev()
            goto L4b
        L88:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L90:
            if (r11 == 0) goto L96
            r13.onSlotCleaned()
            goto L4b
        L96:
            boolean r15 = r8 instanceof n7.W0
            if (r15 == 0) goto L9d
            n7.W0 r8 = (n7.W0) r8
            goto L9e
        L9d:
            r8 = 0
        L9e:
            if (r8 == 0) goto La3
            access$prepareSenderForSuspension(r14, r8, r13, r12)
        La3:
            r13.onSlotCleaned()
            p7.i$b r15 = p7.C6071i.Companion
            java.lang.Object r15 = r15.m554failurePtdJZtk()
            goto Lba
        Lad:
            p7.i$b r15 = p7.C6071i.Companion
            R6.G r0 = R6.G.INSTANCE
            java.lang.Object r15 = r15.m555successJP2dKIU(r0)
            goto Lba
        Lb6:
            r13.cleanPrev()
            goto Lad
        Lba:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6065c.mo535trySendJP2dKIU(java.lang.Object):java.lang.Object");
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        if (z()) {
            return;
        }
        while (n() <= j8) {
        }
        int i8 = AbstractC6066d.f34663b;
        for (int i9 = 0; i9 < i8; i9++) {
            long jN = n();
            if (jN == (AbstractC5916c.MAX_MILLIS & f34635f.get(this)) && jN == n()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f34635f;
        do {
            j9 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, AbstractC6066d.a(j9 & AbstractC5916c.MAX_MILLIS, true)));
        while (true) {
            long jN2 = n();
            atomicLongFieldUpdater = f34635f;
            long j11 = atomicLongFieldUpdater.get(this);
            long j12 = j11 & AbstractC5916c.MAX_MILLIS;
            boolean z8 = (AbstractC5822d.MAX_POWER_OF_TWO & j11) != 0;
            if (jN2 == j12 && jN2 == n()) {
                break;
            } else if (!z8) {
                atomicLongFieldUpdater.compareAndSet(this, j11, AbstractC6066d.a(j12, true));
            }
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, AbstractC6066d.a(j10 & AbstractC5916c.MAX_MILLIS, false)));
    }

    protected boolean y() {
        return false;
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public final void cancel(CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    public /* synthetic */ C6065c(int i8, f7.l lVar, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i8, (i9 & 2) != 0 ? null : lVar);
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    protected void F() {
    }

    protected void M() {
    }

    protected void N() {
    }
}
