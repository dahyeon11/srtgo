package q7;

import kotlin.jvm.internal.InlineMarker;
import n7.AbstractC5986i;
import n7.InterfaceC6008t0;

/* renamed from: q7.n */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6152n {

    /* renamed from: q7.n$a */
    public static final class a implements InterfaceC6148j {

        /* renamed from: a */
        final /* synthetic */ f7.p f35341a;

        /* renamed from: q7.n$a$a */
        public static final class C0385a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35342d;

            /* renamed from: f */
            int f35344f;

            public C0385a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35342d = obj;
                this.f35344f |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(f7.p pVar) {
            this.f35341a = pVar;
        }

        @Override // q7.InterfaceC6148j
        public Object emit(T t8, W6.d<? super R6.G> dVar) {
            Object objInvoke = this.f35341a.invoke(t8, dVar);
            return objInvoke == X6.b.getCOROUTINE_SUSPENDED() ? objInvoke : R6.G.INSTANCE;
        }

        public Object emit$$forInline(T t8, W6.d<? super R6.G> dVar) {
            InlineMarker.mark(4);
            new C0385a(dVar);
            InlineMarker.mark(5);
            this.f35341a.invoke(t8, dVar);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.n$b */
    public static final class b implements InterfaceC6148j {

        /* renamed from: a */
        private int f35345a;

        /* renamed from: b */
        final /* synthetic */ f7.q f35346b;

        /* renamed from: q7.n$b$a */
        public static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35347d;

            /* renamed from: f */
            int f35349f;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35347d = obj;
                this.f35349f |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(f7.q qVar) {
            this.f35346b = qVar;
        }

        @Override // q7.InterfaceC6148j
        public Object emit(T t8, W6.d<? super R6.G> dVar) {
            f7.q qVar = this.f35346b;
            int i8 = this.f35345a;
            this.f35345a = i8 + 1;
            if (i8 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objInvoke = qVar.invoke(Y6.b.boxInt(i8), t8, dVar);
            return objInvoke == X6.b.getCOROUTINE_SUSPENDED() ? objInvoke : R6.G.INSTANCE;
        }

        public Object emit$$forInline(T t8, W6.d<? super R6.G> dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            f7.q qVar = this.f35346b;
            int i8 = this.f35345a;
            this.f35345a = i8 + 1;
            if (i8 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            qVar.invoke(Integer.valueOf(i8), t8, dVar);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.n$c */
    static final class c extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35350e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC6147i f35351f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6147i interfaceC6147i, W6.d dVar) {
            super(2, dVar);
            this.f35351f = interfaceC6147i;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            return new c(this.f35351f, dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35350e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6147i interfaceC6147i = this.f35351f;
                this.f35350e = 1;
                if (AbstractC6149k.collect(interfaceC6147i, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
            }
            return R6.G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(n7.L l8, W6.d<? super R6.G> dVar) {
            return ((c) create(l8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    public static final Object collect(InterfaceC6147i interfaceC6147i, W6.d<? super R6.G> dVar) {
        Object objCollect = interfaceC6147i.collect(r7.t.INSTANCE, dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
    }

    public static final <T> Object collectIndexed(InterfaceC6147i interfaceC6147i, f7.q qVar, W6.d<? super R6.G> dVar) {
        Object objCollect = interfaceC6147i.collect(new b(qVar), dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
    }

    public static final <T> Object collectLatest(InterfaceC6147i interfaceC6147i, f7.p pVar, W6.d<? super R6.G> dVar) {
        Object objCollect = AbstractC6149k.collect(AbstractC6154p.buffer$default(AbstractC6149k.mapLatest(interfaceC6147i, pVar), 0, null, 2, null), dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
    }

    public static final <T> Object emitAll(InterfaceC6148j interfaceC6148j, InterfaceC6147i interfaceC6147i, W6.d<? super R6.G> dVar) {
        AbstractC6149k.ensureActive(interfaceC6148j);
        Object objCollect = interfaceC6147i.collect(interfaceC6148j, dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
    }

    public static final <T> InterfaceC6008t0 launchIn(InterfaceC6147i interfaceC6147i, n7.L l8) {
        return AbstractC5986i.launch$default(l8, null, null, new c(interfaceC6147i, null), 3, null);
    }

    public static final /* synthetic */ <T> Object collect(InterfaceC6147i interfaceC6147i, f7.p pVar, W6.d<? super R6.G> dVar) {
        Object objCollect = interfaceC6147i.collect(new a(pVar), dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
    }
}
