package r7;

import R6.G;
import W6.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n7.AbstractC6016x0;
import q7.InterfaceC6148j;

/* loaded from: classes3.dex */
public final class v extends Y6.d implements InterfaceC6148j, Y6.e {
    public final W6.g collectContext;
    public final int collectContextSize;
    public final InterfaceC6148j collector;

    /* renamed from: d */
    private W6.g f35920d;

    /* renamed from: e */
    private W6.d f35921e;

    static final class a extends Lambda implements f7.p {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        public final Integer invoke(int i8, g.b bVar) {
            return Integer.valueOf(i8 + 1);
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public v(InterfaceC6148j interfaceC6148j, W6.g gVar) {
        super(s.INSTANCE, W6.h.INSTANCE);
        this.collector = interfaceC6148j;
        this.collectContext = gVar;
        this.collectContextSize = ((Number) gVar.fold(0, a.INSTANCE)).intValue();
    }

    private final void a(W6.g gVar, W6.g gVar2, Object obj) {
        if (gVar2 instanceof C6197n) {
            c((C6197n) gVar2, obj);
        }
        x.checkContext(this, gVar);
    }

    private final Object b(W6.d dVar, Object obj) {
        W6.g context = dVar.getContext();
        AbstractC6016x0.ensureActive(context);
        W6.g gVar = this.f35920d;
        if (gVar != context) {
            a(context, gVar, obj);
            this.f35920d = context;
        }
        this.f35921e = dVar;
        f7.q qVar = w.f35922a;
        InterfaceC6148j interfaceC6148j = this.collector;
        Intrinsics.checkNotNull(interfaceC6148j, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = qVar.invoke(interfaceC6148j, obj, this);
        if (!Intrinsics.areEqual(objInvoke, X6.b.getCOROUTINE_SUSPENDED())) {
            this.f35921e = null;
        }
        return objInvoke;
    }

    private final void c(C6197n c6197n, Object obj) {
        throw new IllegalStateException(l7.r.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c6197n.f35913e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // q7.InterfaceC6148j
    public Object emit(Object obj, W6.d<? super G> dVar) {
        try {
            Object objB = b(dVar, obj);
            if (objB == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return objB == X6.b.getCOROUTINE_SUSPENDED() ? objB : G.INSTANCE;
        } catch (Throwable th) {
            this.f35920d = new C6197n(th, dVar.getContext());
            throw th;
        }
    }

    @Override // Y6.a, Y6.e
    public Y6.e getCallerFrame() {
        W6.d dVar = this.f35921e;
        if (dVar instanceof Y6.e) {
            return (Y6.e) dVar;
        }
        return null;
    }

    @Override // Y6.d, Y6.a, W6.d
    public W6.g getContext() {
        W6.g gVar = this.f35920d;
        return gVar == null ? W6.h.INSTANCE : gVar;
    }

    @Override // Y6.a, Y6.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Y6.a
    public Object invokeSuspend(Object obj) {
        Throwable thM70exceptionOrNullimpl = R6.q.m70exceptionOrNullimpl(obj);
        if (thM70exceptionOrNullimpl != null) {
            this.f35920d = new C6197n(thM70exceptionOrNullimpl, getContext());
        }
        W6.d dVar = this.f35921e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return X6.b.getCOROUTINE_SUSPENDED();
    }

    @Override // Y6.d, Y6.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
