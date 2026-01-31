package p7;

import R6.G;
import R6.q;
import n7.AbstractC5984h;
import n7.L;
import p7.C6071i;

/* renamed from: p7.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6075m {

    /* renamed from: p7.m$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f34689e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6099x f34690f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f34691g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6099x interfaceC6099x, Object obj, W6.d dVar) {
            super(2, dVar);
            this.f34690f = interfaceC6099x;
            this.f34691g = obj;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            return new a(this.f34690f, this.f34691g, dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f34689e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6099x interfaceC6099x = this.f34690f;
                Object obj2 = this.f34691g;
                this.f34689e = 1;
                if (interfaceC6099x.send(obj2, this) == coroutine_suspended) {
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
            return ((a) create(l8, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    /* renamed from: p7.m$b */
    static final class b extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f34692e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f34693f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6099x f34694g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f34695h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6099x interfaceC6099x, Object obj, W6.d dVar) {
            super(2, dVar);
            this.f34694g = interfaceC6099x;
            this.f34695h = obj;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            b bVar = new b(this.f34694g, this.f34695h, dVar);
            bVar.f34693f = obj;
            return bVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM67constructorimpl;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f34692e;
            try {
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6099x interfaceC6099x = this.f34694g;
                    Object obj2 = this.f34695h;
                    q.a aVar = R6.q.Companion;
                    this.f34692e = 1;
                    if (interfaceC6099x.send(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R6.r.throwOnFailure(obj);
                }
                objM67constructorimpl = R6.q.m67constructorimpl(G.INSTANCE);
            } catch (Throwable th) {
                q.a aVar2 = R6.q.Companion;
                objM67constructorimpl = R6.q.m67constructorimpl(R6.r.createFailure(th));
            }
            return C6071i.m540boximpl(R6.q.m73isSuccessimpl(objM67constructorimpl) ? C6071i.Companion.m555successJP2dKIU(G.INSTANCE) : C6071i.Companion.m553closedJP2dKIU(R6.q.m70exceptionOrNullimpl(objM67constructorimpl)));
        }

        @Override // f7.p
        public final Object invoke(L l8, W6.d<? super C6071i> dVar) {
            return ((b) create(l8, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    public static final /* synthetic */ void sendBlocking(InterfaceC6099x interfaceC6099x, Object obj) {
        if (C6071i.m550isSuccessimpl(interfaceC6099x.mo535trySendJP2dKIU(obj))) {
            return;
        }
        AbstractC5984h.runBlocking$default(null, new a(interfaceC6099x, obj, null), 1, null);
    }

    public static final <E> Object trySendBlocking(InterfaceC6099x interfaceC6099x, E e8) {
        Object objMo535trySendJP2dKIU = interfaceC6099x.mo535trySendJP2dKIU(e8);
        if (objMo535trySendJP2dKIU instanceof C6071i.c) {
            return ((C6071i) AbstractC5984h.runBlocking$default(null, new b(interfaceC6099x, e8, null), 1, null)).m552unboximpl();
        }
        return C6071i.Companion.m555successJP2dKIU(G.INSTANCE);
    }
}
