package v7;

import R6.G;
import S6.r;
import f7.p;
import f7.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import n7.AbstractC5992l;
import n7.InterfaceC5973b0;
import n7.InterfaceC5996n;
import s7.H;
import v7.InterfaceC6454c;

/* loaded from: classes3.dex */
public class k extends AbstractC5992l implements InterfaceC6454c, m {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37337f = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "state");

    /* renamed from: a, reason: collision with root package name */
    private final W6.g f37338a;

    /* renamed from: c, reason: collision with root package name */
    private Object f37340c;
    private volatile Object state = n.f37356b;

    /* renamed from: b, reason: collision with root package name */
    private List f37339b = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    private int f37341d = -1;

    /* renamed from: e, reason: collision with root package name */
    private Object f37342e = n.f37359e;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final q f37343a;

        /* renamed from: b, reason: collision with root package name */
        private final q f37344b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f37345c;
        public final Object clauseObject;

        /* renamed from: d, reason: collision with root package name */
        private final Object f37346d;
        public Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final q onCancellationConstructor;

        public a(Object obj, q qVar, q qVar2, Object obj2, Object obj3, q qVar3) {
            this.clauseObject = obj;
            this.f37343a = qVar;
            this.f37344b = qVar2;
            this.f37345c = obj2;
            this.f37346d = obj3;
            this.onCancellationConstructor = qVar3;
        }

        public final f7.l createOnCancellationAction(l lVar, Object obj) {
            q qVar = this.onCancellationConstructor;
            if (qVar != null) {
                return (f7.l) qVar.invoke(lVar, this.f37345c, obj);
            }
            return null;
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            k kVar = k.this;
            if (obj instanceof H) {
                ((H) obj).onCancellation(this.indexInSegment, null, kVar.getContext());
                return;
            }
            InterfaceC5973b0 interfaceC5973b0 = obj instanceof InterfaceC5973b0 ? (InterfaceC5973b0) obj : null;
            if (interfaceC5973b0 != null) {
                interfaceC5973b0.dispose();
            }
        }

        public final Object invokeBlock(Object obj, W6.d<Object> dVar) {
            Object obj2 = this.f37346d;
            if (this.f37345c == n.getPARAM_CLAUSE_0()) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((f7.l) obj2).invoke(dVar);
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, dVar);
        }

        public final Object processResult(Object obj) {
            return this.f37344b.invoke(this.clauseObject, this.f37345c, obj);
        }

        public final boolean tryRegisterAsWaiter(k kVar) {
            this.f37343a.invoke(this.clauseObject, kVar, this.f37345c);
            return kVar.f37342e == n.f37359e;
        }
    }

    static final class b extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f37348d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f37349e;

        /* renamed from: g, reason: collision with root package name */
        int f37351g;

        b(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f37349e = obj;
            this.f37351g |= Integer.MIN_VALUE;
            return k.this.e(this);
        }
    }

    static final class c extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f37352d;

        /* renamed from: f, reason: collision with root package name */
        int f37354f;

        c(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f37352d = obj;
            this.f37354f |= Integer.MIN_VALUE;
            return k.this.j(null, null, this);
        }
    }

    public k(W6.g gVar) {
        this.f37338a = gVar;
    }

    private final void a(Object obj) {
        List list = this.f37339b;
        Intrinsics.checkNotNull(list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).clauseObject == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    private final void b(a aVar) {
        List<a> list = this.f37339b;
        if (list == null) {
            return;
        }
        for (a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.dispose();
            }
        }
        f37337f.set(this, n.f37357c);
        this.f37342e = n.f37359e;
        this.f37339b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(W6.d dVar) {
        Object obj = f37337f.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f37342e;
        b(aVar);
        return aVar.invokeBlock(aVar.processResult(obj2), dVar);
    }

    static /* synthetic */ Object d(k kVar, W6.d dVar) {
        return kVar.i() ? kVar.c(dVar) : kVar.e(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(W6.d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof v7.k.b
            if (r0 == 0) goto L13
            r0 = r6
            v7.k$b r0 = (v7.k.b) r0
            int r1 = r0.f37351g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37351g = r1
            goto L18
        L13:
            v7.k$b r0 = new v7.k$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37349e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37351g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            R6.r.throwOnFailure(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f37348d
            v7.k r2 = (v7.k) r2
            R6.r.throwOnFailure(r6)
            goto L4b
        L3c:
            R6.r.throwOnFailure(r6)
            r0.f37348d = r5
            r0.f37351g = r4
            java.lang.Object r6 = r5.m(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f37348d = r6
            r0.f37351g = r3
            java.lang.Object r6 = r2.c(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.k.e(W6.d):java.lang.Object");
    }

    private final a f(Object obj) {
        List list = this.f37339b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).clauseObject == obj) {
                obj2 = next;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        Object obj = f37337f.get(this);
        return obj == n.f37356b || (obj instanceof List);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        return f37337f.get(this) == n.f37358d;
    }

    private final boolean i() {
        return f37337f.get(this) instanceof a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(v7.k.a r5, java.lang.Object r6, W6.d r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof v7.k.c
            if (r0 == 0) goto L13
            r0 = r7
            v7.k$c r0 = (v7.k.c) r0
            int r1 = r0.f37354f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37354f = r1
            goto L18
        L13:
            v7.k$c r0 = new v7.k$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37352d
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37354f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            R6.r.throwOnFailure(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            R6.r.throwOnFailure(r7)
            java.lang.Object r6 = r5.processResult(r6)
            r0.f37354f = r3
            java.lang.Object r7 = r5.invokeBlock(r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.k.j(v7.k$a, java.lang.Object, W6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Object obj) {
        a aVarF = f(obj);
        Intrinsics.checkNotNull(aVarF);
        aVarF.disposableHandleOrSegment = null;
        aVarF.indexInSegment = -1;
        register(aVarF, true);
    }

    private final int l(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37337f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof InterfaceC5996n) {
                a aVarF = f(obj);
                if (aVarF == null) {
                    continue;
                } else {
                    f7.l lVarCreateOnCancellationAction = aVarF.createOnCancellationAction(this, obj2);
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, aVarF)) {
                        this.f37342e = obj2;
                        if (n.b((InterfaceC5996n) obj3, lVarCreateOnCancellationAction)) {
                            return 0;
                        }
                        this.f37342e = null;
                        return 2;
                    }
                }
            } else {
                if (Intrinsics.areEqual(obj3, n.f37357c) ? true : obj3 instanceof a) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj3, n.f37358d)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, n.f37356b)) {
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, r.listOf(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, r.plus((Collection<? extends Object>) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r0 = r0.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 != X6.b.getCOROUTINE_SUSPENDED()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        Y6.h.probeCoroutineSuspended(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r0 != X6.b.getCOROUTINE_SUSPENDED()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return R6.G.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(W6.d r6) {
        /*
            r5 = this;
            n7.o r0 = new n7.o
            W6.d r1 = X6.b.intercepted(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getState$FU$p()
        L11:
            java.lang.Object r2 = r1.get(r5)
            s7.K r3 = v7.n.access$getSTATE_REG$p()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = access$getState$FU$p()
            boolean r2 = androidx.concurrent.futures.b.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            r0.invokeOnCancellation(r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = access$getState$FU$p()
            s7.K r4 = v7.n.access$getSTATE_REG$p()
            boolean r3 = androidx.concurrent.futures.b.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            access$reregisterClause(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof v7.k.a
            if (r1 == 0) goto L79
            R6.G r1 = R6.G.INSTANCE
            v7.k$a r2 = (v7.k.a) r2
            java.lang.Object r3 = access$getInternalResult$p(r5)
            f7.l r2 = r2.createOnCancellationAction(r5, r3)
            r0.resume(r1, r2)
        L62:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L6f
            Y6.h.probeCoroutineSuspended(r6)
        L6f:
            java.lang.Object r6 = X6.b.getCOROUTINE_SUSPENDED()
            if (r0 != r6) goto L76
            return r0
        L76:
            R6.G r6 = R6.G.INSTANCE
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.k.m(W6.d):java.lang.Object");
    }

    public static /* synthetic */ void register$default(k kVar, a aVar, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        kVar.register(aVar, z8);
    }

    @Override // v7.m, v7.l
    public void disposeOnCompletion(InterfaceC5973b0 interfaceC5973b0) {
        this.f37340c = interfaceC5973b0;
    }

    public Object doSelect(W6.d<Object> dVar) {
        return d(this, dVar);
    }

    @Override // v7.m, v7.l
    public W6.g getContext() {
        return this.f37338a;
    }

    @Override // n7.AbstractC5992l, n7.AbstractC5994m, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return G.INSTANCE;
    }

    @Override // v7.m, n7.W0
    public void invokeOnCancellation(H h8, int i8) {
        this.f37340c = h8;
        this.f37341d = i8;
    }

    @Override // v7.InterfaceC6454c
    public void onTimeout(long j8, f7.l lVar) {
        InterfaceC6454c.a.onTimeout(this, j8, lVar);
    }

    public final void register(v7.k.a aVar, boolean z8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37337f;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z8) {
            a(aVar.clauseObject);
        }
        if (!aVar.tryRegisterAsWaiter(this)) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z8) {
            List list = this.f37339b;
            Intrinsics.checkNotNull(list);
            list.add(aVar);
        }
        aVar.disposableHandleOrSegment = this.f37340c;
        aVar.indexInSegment = this.f37341d;
        this.f37340c = null;
        this.f37341d = -1;
    }

    @Override // v7.m, v7.l
    public void selectInRegistrationPhase(Object obj) {
        this.f37342e = obj;
    }

    @Override // v7.m, v7.l
    public boolean trySelect(Object obj, Object obj2) {
        return l(obj, obj2) == 0;
    }

    public final o trySelectDetailed(Object obj, Object obj2) {
        return n.a(l(obj, obj2));
    }

    @Override // v7.InterfaceC6454c
    public <P, Q> void invoke(h hVar, p pVar) {
        InterfaceC6454c.a.invoke(this, hVar, pVar);
    }

    @Override // v7.InterfaceC6454c
    public void invoke(d dVar, f7.l lVar) {
        register$default(this, new a(dVar.getClauseObject(), dVar.getRegFunc(), dVar.getProcessResFunc(), n.getPARAM_CLAUSE_0(), lVar, dVar.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // v7.InterfaceC6454c
    public <Q> void invoke(f fVar, p pVar) {
        register$default(this, new a(fVar.getClauseObject(), fVar.getRegFunc(), fVar.getProcessResFunc(), null, pVar, fVar.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // v7.InterfaceC6454c
    public <P, Q> void invoke(h hVar, P p8, p pVar) {
        register$default(this, new a(hVar.getClauseObject(), hVar.getRegFunc(), hVar.getProcessResFunc(), p8, pVar, hVar.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // n7.AbstractC5994m
    public void invoke(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37337f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == n.f37357c) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, n.f37358d));
        List list = this.f37339b;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).dispose();
        }
        this.f37342e = n.f37359e;
        this.f37339b = null;
    }
}
