package r7;

import R6.G;
import n7.L;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;
import t7.AbstractC6369b;

/* renamed from: r7.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6199p {

    /* renamed from: r7.p$a */
    public static final class a implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.q f35914a;

        public a(f7.q qVar) {
            this.f35914a = qVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super G> dVar) {
            Object objFlowScope = AbstractC6199p.flowScope(new b(this.f35914a, interfaceC6148j, null), dVar);
            return objFlowScope == X6.b.getCOROUTINE_SUSPENDED() ? objFlowScope : G.INSTANCE;
        }
    }

    /* renamed from: r7.p$b */
    static final class b extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f35915e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f35916f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f7.q f35917g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35918h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f7.q qVar, InterfaceC6148j interfaceC6148j, W6.d dVar) {
            super(2, dVar);
            this.f35917g = qVar;
            this.f35918h = interfaceC6148j;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            b bVar = new b(this.f35917g, this.f35918h, dVar);
            bVar.f35916f = obj;
            return bVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35915e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                L l8 = (L) this.f35916f;
                f7.q qVar = this.f35917g;
                InterfaceC6148j interfaceC6148j = this.f35918h;
                this.f35915e = 1;
                if (qVar.invoke(l8, interfaceC6148j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
            }
            return G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(L l8, W6.d<? super G> dVar) {
            return ((b) create(l8, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    public static final <R> Object flowScope(f7.p pVar, W6.d<? super R> dVar) {
        C6198o c6198o = new C6198o(dVar.getContext(), dVar);
        Object objStartUndispatchedOrReturn = AbstractC6369b.startUndispatchedOrReturn(c6198o, c6198o, pVar);
        if (objStartUndispatchedOrReturn == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return objStartUndispatchedOrReturn;
    }

    public static final <R> InterfaceC6147i scopedFlow(f7.q qVar) {
        return new a(qVar);
    }
}
