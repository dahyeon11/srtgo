package r7;

import R6.G;
import W6.e;
import kotlin.jvm.internal.Intrinsics;
import p7.EnumC6064b;
import p7.InterfaceC6096u;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;

/* renamed from: r7.h */
/* loaded from: classes3.dex */
public abstract class AbstractC6191h extends AbstractC6188e {

    /* renamed from: a */
    protected final InterfaceC6147i f35826a;

    /* renamed from: r7.h$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35827e;

        /* renamed from: f */
        /* synthetic */ Object f35828f;

        a(W6.d dVar) {
            super(2, dVar);
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            a aVar = AbstractC6191h.this.new a(dVar);
            aVar.f35828f = obj;
            return aVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35827e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35828f;
                AbstractC6191h abstractC6191h = AbstractC6191h.this;
                this.f35827e = 1;
                if (abstractC6191h.h(interfaceC6148j, this) == coroutine_suspended) {
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
        public final Object invoke(InterfaceC6148j interfaceC6148j, W6.d<? super G> dVar) {
            return ((a) create(interfaceC6148j, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    public AbstractC6191h(InterfaceC6147i interfaceC6147i, W6.g gVar, int i8, EnumC6064b enumC6064b) {
        super(gVar, i8, enumC6064b);
        this.f35826a = interfaceC6147i;
    }

    static /* synthetic */ Object e(AbstractC6191h abstractC6191h, InterfaceC6148j interfaceC6148j, W6.d dVar) {
        if (abstractC6191h.capacity == -3) {
            W6.g context = dVar.getContext();
            W6.g gVarPlus = context.plus(abstractC6191h.context);
            if (Intrinsics.areEqual(gVarPlus, context)) {
                Object objH = abstractC6191h.h(interfaceC6148j, dVar);
                return objH == X6.b.getCOROUTINE_SUSPENDED() ? objH : G.INSTANCE;
            }
            e.b bVar = W6.e.Key;
            if (Intrinsics.areEqual(gVarPlus.get(bVar), context.get(bVar))) {
                Object objG = abstractC6191h.g(interfaceC6148j, gVarPlus, dVar);
                return objG == X6.b.getCOROUTINE_SUSPENDED() ? objG : G.INSTANCE;
            }
        }
        Object objCollect = super.collect(interfaceC6148j, dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : G.INSTANCE;
    }

    static /* synthetic */ Object f(AbstractC6191h abstractC6191h, InterfaceC6096u interfaceC6096u, W6.d dVar) {
        Object objH = abstractC6191h.h(new y(interfaceC6096u), dVar);
        return objH == X6.b.getCOROUTINE_SUSPENDED() ? objH : G.INSTANCE;
    }

    public final Object g(InterfaceC6148j interfaceC6148j, W6.g gVar, W6.d dVar) {
        Object objWithContextUndispatched$default = AbstractC6189f.withContextUndispatched$default(gVar, AbstractC6189f.a(interfaceC6148j, dVar.getContext()), null, new a(null), dVar, 4, null);
        return objWithContextUndispatched$default == X6.b.getCOROUTINE_SUSPENDED() ? objWithContextUndispatched$default : G.INSTANCE;
    }

    @Override // r7.AbstractC6188e
    protected Object c(InterfaceC6096u interfaceC6096u, W6.d dVar) {
        return f(this, interfaceC6096u, dVar);
    }

    @Override // r7.AbstractC6188e, r7.r, q7.InterfaceC6147i
    public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super G> dVar) {
        return e(this, interfaceC6148j, dVar);
    }

    protected abstract Object h(InterfaceC6148j interfaceC6148j, W6.d dVar);

    @Override // r7.AbstractC6188e
    public String toString() {
        return this.f35826a + " -> " + super.toString();
    }
}
