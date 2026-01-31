package q7;

import R6.C0751e;
import kotlin.jvm.internal.Lambda;

/* renamed from: q7.x */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6162x {

    /* renamed from: q7.x$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35607e;

        /* renamed from: f */
        final /* synthetic */ long f35608f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8, W6.d dVar) {
            super(2, dVar);
            this.f35608f = j8;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            return new a(this.f35608f, dVar);
        }

        public final Object invoke(T t8, W6.d<? super R6.G> dVar) {
            return ((a) create(t8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35607e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                long j8 = this.f35608f;
                this.f35607e = 1;
                if (n7.W.delay(j8, this) == coroutine_suspended) {
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
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((a) obj, (W6.d<? super R6.G>) obj2);
        }
    }

    /* renamed from: q7.x$b */
    static final class b extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35609e;

        /* renamed from: f */
        final /* synthetic */ long f35610f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j8, W6.d dVar) {
            super(2, dVar);
            this.f35610f = j8;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            return new b(this.f35610f, dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35609e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                long j8 = this.f35610f;
                this.f35609e = 1;
                if (n7.W.delay(j8, this) == coroutine_suspended) {
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
        public final Object invoke(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            return ((b) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.x$c */
    static final class c extends Lambda implements f7.l {
        public static final c INSTANCE = new c();

        c() {
            super(1);
        }

        @Override // f7.l
        public final Boolean invoke(Throwable th) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: q7.x$d */
    static final class d extends Y6.l implements f7.q {

        /* renamed from: e */
        int f35611e;

        /* renamed from: f */
        private /* synthetic */ Object f35612f;

        /* renamed from: g */
        /* synthetic */ Object f35613g;

        /* renamed from: h */
        final /* synthetic */ f7.l f35614h;

        /* renamed from: i */
        final /* synthetic */ Object f35615i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f7.l lVar, Object obj, W6.d dVar) {
            super(3, dVar);
            this.f35614h = lVar;
            this.f35615i = obj;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35611e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35612f;
                Throwable th = (Throwable) this.f35613g;
                if (!((Boolean) this.f35614h.invoke(th)).booleanValue()) {
                    throw th;
                }
                Object obj2 = this.f35615i;
                this.f35612f = null;
                this.f35611e = 1;
                if (interfaceC6148j.emit(obj2, this) == coroutine_suspended) {
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

        @Override // f7.q
        public final Object invoke(InterfaceC6148j interfaceC6148j, Throwable th, W6.d<? super R6.G> dVar) {
            d dVar2 = new d(this.f35614h, this.f35615i, dVar);
            dVar2.f35612f = interfaceC6148j;
            dVar2.f35613g = th;
            return dVar2.invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.x$e */
    public static final class e extends Y6.l implements f7.q {

        /* renamed from: e */
        int f35616e;

        /* renamed from: f */
        private /* synthetic */ Object f35617f;

        /* renamed from: g */
        /* synthetic */ Object f35618g;

        /* renamed from: h */
        final /* synthetic */ f7.p f35619h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f7.p pVar, W6.d dVar) {
            super(3, dVar);
            this.f35619h = pVar;
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC6148j) obj, (InterfaceC6148j) obj2, (W6.d<? super R6.G>) obj3);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6148j interfaceC6148j;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35616e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                interfaceC6148j = (InterfaceC6148j) this.f35617f;
                Object obj2 = this.f35618g;
                f7.p pVar = this.f35619h;
                this.f35617f = interfaceC6148j;
                this.f35616e = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R6.r.throwOnFailure(obj);
                    return R6.G.INSTANCE;
                }
                interfaceC6148j = (InterfaceC6148j) this.f35617f;
                R6.r.throwOnFailure(obj);
            }
            this.f35617f = null;
            this.f35616e = 2;
            if (AbstractC6149k.emitAll(interfaceC6148j, (InterfaceC6147i) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return R6.G.INSTANCE;
        }

        public final Object invoke(InterfaceC6148j interfaceC6148j, T t8, W6.d<? super R6.G> dVar) {
            e eVar = new e(this.f35619h, dVar);
            eVar.f35617f = interfaceC6148j;
            eVar.f35618g = t8;
            return eVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    public static final <T> InterfaceC6147i cache(InterfaceC6147i interfaceC6147i) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T1, T2, R> InterfaceC6147i combineLatest(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.q qVar) {
        return AbstractC6149k.combine(interfaceC6147i, interfaceC6147i2, qVar);
    }

    public static final <T, R> InterfaceC6147i compose(InterfaceC6147i interfaceC6147i, f7.l lVar) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T, R> InterfaceC6147i concatMap(InterfaceC6147i interfaceC6147i, f7.l lVar) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i concatWith(InterfaceC6147i interfaceC6147i, T t8) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i delayEach(InterfaceC6147i interfaceC6147i, long j8) {
        return AbstractC6149k.onEach(interfaceC6147i, new a(j8, null));
    }

    public static final <T> InterfaceC6147i delayFlow(InterfaceC6147i interfaceC6147i, long j8) {
        return AbstractC6149k.onStart(interfaceC6147i, new b(j8, null));
    }

    public static final <T, R> InterfaceC6147i flatMap(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i flatten(InterfaceC6147i interfaceC6147i) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> void forEach(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i merge(InterfaceC6147i interfaceC6147i) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    public static final <T> InterfaceC6147i observeOn(InterfaceC6147i interfaceC6147i, W6.g gVar) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i onErrorResume(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i onErrorResumeNext(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i onErrorReturn(InterfaceC6147i interfaceC6147i, T t8) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static /* synthetic */ InterfaceC6147i onErrorReturn$default(InterfaceC6147i interfaceC6147i, Object obj, f7.l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            lVar = c.INSTANCE;
        }
        return AbstractC6149k.onErrorReturn(interfaceC6147i, obj, lVar);
    }

    public static final <T> InterfaceC6147i publish(InterfaceC6147i interfaceC6147i) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i publishOn(InterfaceC6147i interfaceC6147i, W6.g gVar) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i replay(InterfaceC6147i interfaceC6147i) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T, R> InterfaceC6147i scanFold(InterfaceC6147i interfaceC6147i, R r8, f7.q qVar) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i scanReduce(InterfaceC6147i interfaceC6147i, f7.q qVar) {
        return AbstractC6149k.runningReduce(interfaceC6147i, qVar);
    }

    public static final <T> InterfaceC6147i skip(InterfaceC6147i interfaceC6147i, int i8) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i startWith(InterfaceC6147i interfaceC6147i, T t8) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> void subscribe(InterfaceC6147i interfaceC6147i) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i subscribeOn(InterfaceC6147i interfaceC6147i, W6.g gVar) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T, R> InterfaceC6147i switchMap(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return AbstractC6149k.transformLatest(interfaceC6147i, new e(pVar, null));
    }

    public static final <T1, T2, T3, R> InterfaceC6147i combineLatest(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, InterfaceC6147i interfaceC6147i3, f7.r rVar) {
        return AbstractC6149k.combine(interfaceC6147i, interfaceC6147i2, interfaceC6147i3, rVar);
    }

    public static final <T> InterfaceC6147i concatWith(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i onErrorReturn(InterfaceC6147i interfaceC6147i, T t8, f7.l lVar) {
        return AbstractC6149k.m557catch(interfaceC6147i, new d(lVar, t8, null));
    }

    public static final <T> InterfaceC6147i publish(InterfaceC6147i interfaceC6147i, int i8) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i replay(InterfaceC6147i interfaceC6147i, int i8) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> InterfaceC6147i startWith(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T> void subscribe(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T1, T2, T3, T4, R> InterfaceC6147i combineLatest(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, InterfaceC6147i interfaceC6147i3, InterfaceC6147i interfaceC6147i4, f7.s sVar) {
        return AbstractC6149k.combine(interfaceC6147i, interfaceC6147i2, interfaceC6147i3, interfaceC6147i4, sVar);
    }

    public static final <T> void subscribe(InterfaceC6147i interfaceC6147i, f7.p pVar, f7.p pVar2) {
        AbstractC6149k.noImpl();
        throw new C0751e();
    }

    public static final <T1, T2, T3, T4, T5, R> InterfaceC6147i combineLatest(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, InterfaceC6147i interfaceC6147i3, InterfaceC6147i interfaceC6147i4, InterfaceC6147i interfaceC6147i5, f7.t tVar) {
        return AbstractC6149k.combine(interfaceC6147i, interfaceC6147i2, interfaceC6147i3, interfaceC6147i4, interfaceC6147i5, tVar);
    }
}
