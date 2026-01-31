package r7;

import R6.G;
import q7.InterfaceC6148j;
import s7.O;

/* renamed from: r7.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6183B implements InterfaceC6148j {

    /* renamed from: a, reason: collision with root package name */
    private final W6.g f35794a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f35795b;

    /* renamed from: c, reason: collision with root package name */
    private final f7.p f35796c;

    /* renamed from: r7.B$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f35797e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f35798f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35799g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            super(2, dVar);
            this.f35799g = interfaceC6148j;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            a aVar = new a(this.f35799g, dVar);
            aVar.f35798f = obj;
            return aVar;
        }

        @Override // f7.p
        public final Object invoke(Object obj, W6.d<? super G> dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(G.INSTANCE);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35797e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                Object obj2 = this.f35798f;
                InterfaceC6148j interfaceC6148j = this.f35799g;
                this.f35797e = 1;
                if (interfaceC6148j.emit(obj2, this) == coroutine_suspended) {
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
    }

    public C6183B(InterfaceC6148j interfaceC6148j, W6.g gVar) {
        this.f35794a = gVar;
        this.f35795b = O.threadContextElements(gVar);
        this.f35796c = new a(interfaceC6148j, null);
    }

    @Override // q7.InterfaceC6148j
    public Object emit(Object obj, W6.d<? super G> dVar) {
        Object objWithContextUndispatched = AbstractC6189f.withContextUndispatched(this.f35794a, obj, this.f35795b, this.f35796c, dVar);
        return objWithContextUndispatched == X6.b.getCOROUTINE_SUSPENDED() ? objWithContextUndispatched : G.INSTANCE;
    }
}
