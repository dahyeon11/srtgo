package q7;

import f7.InterfaceC5519a;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r7.AbstractC6196m;

/* renamed from: q7.B */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6116B {

    /* renamed from: q7.B$a */
    public static final class a implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i[] f35072a;

        /* renamed from: b */
        final /* synthetic */ f7.r f35073b;

        /* renamed from: q7.B$a$a */
        public static final class C0377a extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35074e;

            /* renamed from: f */
            private /* synthetic */ Object f35075f;

            /* renamed from: g */
            /* synthetic */ Object f35076g;

            /* renamed from: h */
            final /* synthetic */ f7.r f35077h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0377a(W6.d dVar, f7.r rVar) {
                super(3, dVar);
                this.f35077h = rVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC6148j interfaceC6148j;
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35074e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    interfaceC6148j = (InterfaceC6148j) this.f35075f;
                    Object[] objArr = (Object[]) this.f35076g;
                    f7.r rVar = this.f35077h;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f35075f = interfaceC6148j;
                    this.f35074e = 1;
                    InlineMarker.mark(6);
                    obj = rVar.invoke(obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
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
                    interfaceC6148j = (InterfaceC6148j) this.f35075f;
                    R6.r.throwOnFailure(obj);
                }
                this.f35075f = null;
                this.f35074e = 2;
                if (interfaceC6148j.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return R6.G.INSTANCE;
            }

            @Override // f7.q
            public final Object invoke(InterfaceC6148j interfaceC6148j, Object[] objArr, W6.d<? super R6.G> dVar) {
                C0377a c0377a = new C0377a(dVar, this.f35077h);
                c0377a.f35075f = interfaceC6148j;
                c0377a.f35076g = objArr;
                return c0377a.invokeSuspend(R6.G.INSTANCE);
            }
        }

        public a(InterfaceC6147i[] interfaceC6147iArr, f7.r rVar) {
            this.f35072a = interfaceC6147iArr;
            this.f35073b = rVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCombineInternal = AbstractC6196m.combineInternal(interfaceC6148j, this.f35072a, AbstractC6116B.a(), new C0377a(null, this.f35073b), dVar);
            return objCombineInternal == X6.b.getCOROUTINE_SUSPENDED() ? objCombineInternal : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.B$b */
    public static final class b implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i[] f35078a;

        /* renamed from: b */
        final /* synthetic */ f7.s f35079b;

        /* renamed from: q7.B$b$a */
        public static final class a extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35080e;

            /* renamed from: f */
            private /* synthetic */ Object f35081f;

            /* renamed from: g */
            /* synthetic */ Object f35082g;

            /* renamed from: h */
            final /* synthetic */ f7.s f35083h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(W6.d dVar, f7.s sVar) {
                super(3, dVar);
                this.f35083h = sVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC6148j interfaceC6148j;
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35080e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    interfaceC6148j = (InterfaceC6148j) this.f35081f;
                    Object[] objArr = (Object[]) this.f35082g;
                    f7.s sVar = this.f35083h;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f35081f = interfaceC6148j;
                    this.f35080e = 1;
                    InlineMarker.mark(6);
                    obj = sVar.invoke(obj2, obj3, obj4, obj5, this);
                    InlineMarker.mark(7);
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
                    interfaceC6148j = (InterfaceC6148j) this.f35081f;
                    R6.r.throwOnFailure(obj);
                }
                this.f35081f = null;
                this.f35080e = 2;
                if (interfaceC6148j.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return R6.G.INSTANCE;
            }

            @Override // f7.q
            public final Object invoke(InterfaceC6148j interfaceC6148j, Object[] objArr, W6.d<? super R6.G> dVar) {
                a aVar = new a(dVar, this.f35083h);
                aVar.f35081f = interfaceC6148j;
                aVar.f35082g = objArr;
                return aVar.invokeSuspend(R6.G.INSTANCE);
            }
        }

        public b(InterfaceC6147i[] interfaceC6147iArr, f7.s sVar) {
            this.f35078a = interfaceC6147iArr;
            this.f35079b = sVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCombineInternal = AbstractC6196m.combineInternal(interfaceC6148j, this.f35078a, AbstractC6116B.a(), new a(null, this.f35079b), dVar);
            return objCombineInternal == X6.b.getCOROUTINE_SUSPENDED() ? objCombineInternal : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.B$c */
    public static final class c implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i[] f35084a;

        /* renamed from: b */
        final /* synthetic */ f7.t f35085b;

        /* renamed from: q7.B$c$a */
        public static final class a extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35086e;

            /* renamed from: f */
            private /* synthetic */ Object f35087f;

            /* renamed from: g */
            /* synthetic */ Object f35088g;

            /* renamed from: h */
            final /* synthetic */ f7.t f35089h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(W6.d dVar, f7.t tVar) {
                super(3, dVar);
                this.f35089h = tVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC6148j interfaceC6148j;
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35086e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    interfaceC6148j = (InterfaceC6148j) this.f35087f;
                    Object[] objArr = (Object[]) this.f35088g;
                    f7.t tVar = this.f35089h;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f35087f = interfaceC6148j;
                    this.f35086e = 1;
                    InlineMarker.mark(6);
                    obj = tVar.invoke(obj2, obj3, obj4, obj5, obj6, this);
                    InlineMarker.mark(7);
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
                    interfaceC6148j = (InterfaceC6148j) this.f35087f;
                    R6.r.throwOnFailure(obj);
                }
                this.f35087f = null;
                this.f35086e = 2;
                if (interfaceC6148j.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return R6.G.INSTANCE;
            }

            @Override // f7.q
            public final Object invoke(InterfaceC6148j interfaceC6148j, Object[] objArr, W6.d<? super R6.G> dVar) {
                a aVar = new a(dVar, this.f35089h);
                aVar.f35087f = interfaceC6148j;
                aVar.f35088g = objArr;
                return aVar.invokeSuspend(R6.G.INSTANCE);
            }
        }

        public c(InterfaceC6147i[] interfaceC6147iArr, f7.t tVar) {
            this.f35084a = interfaceC6147iArr;
            this.f35085b = tVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCombineInternal = AbstractC6196m.combineInternal(interfaceC6148j, this.f35084a, AbstractC6116B.a(), new a(null, this.f35085b), dVar);
            return objCombineInternal == X6.b.getCOROUTINE_SUSPENDED() ? objCombineInternal : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.B$d */
    public static final class d implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35090a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC6147i f35091b;

        /* renamed from: c */
        final /* synthetic */ f7.q f35092c;

        public d(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.q qVar) {
            this.f35090a = interfaceC6147i;
            this.f35091b = interfaceC6147i2;
            this.f35092c = qVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            Object objCombineInternal = AbstractC6196m.combineInternal(interfaceC6148j, new InterfaceC6147i[]{this.f35090a, this.f35091b}, AbstractC6116B.a(), new g(this.f35092c, null), dVar);
            return objCombineInternal == X6.b.getCOROUTINE_SUSPENDED() ? objCombineInternal : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.B$e */
    public static final class e implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i[] f35093a;

        /* renamed from: b */
        final /* synthetic */ f7.p f35094b;

        /* renamed from: q7.B$e$a */
        public static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35095d;

            /* renamed from: e */
            int f35096e;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35095d = obj;
                this.f35096e |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(InterfaceC6147i[] interfaceC6147iArr, f7.p pVar) {
            this.f35093a = interfaceC6147iArr;
            this.f35094b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            InterfaceC6147i[] interfaceC6147iArr = this.f35093a;
            Intrinsics.needClassReification();
            h hVar = new h(this.f35093a);
            Intrinsics.needClassReification();
            Object objCombineInternal = AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, hVar, new i(this.f35094b, null), dVar);
            return objCombineInternal == X6.b.getCOROUTINE_SUSPENDED() ? objCombineInternal : R6.G.INSTANCE;
        }

        public Object collect$$forInline(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            InterfaceC6147i[] interfaceC6147iArr = this.f35093a;
            Intrinsics.needClassReification();
            h hVar = new h(this.f35093a);
            Intrinsics.needClassReification();
            i iVar = new i(this.f35094b, null);
            InlineMarker.mark(0);
            AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, hVar, iVar, dVar);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.B$f */
    public static final class f implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i[] f35098a;

        /* renamed from: b */
        final /* synthetic */ f7.p f35099b;

        /* renamed from: q7.B$f$a */
        public static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35100d;

            /* renamed from: e */
            int f35101e;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35100d = obj;
                this.f35101e |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC6147i[] interfaceC6147iArr, f7.p pVar) {
            this.f35098a = interfaceC6147iArr;
            this.f35099b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            InterfaceC6147i[] interfaceC6147iArr = this.f35098a;
            Intrinsics.needClassReification();
            j jVar = new j(this.f35098a);
            Intrinsics.needClassReification();
            Object objCombineInternal = AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, jVar, new k(this.f35099b, null), dVar);
            return objCombineInternal == X6.b.getCOROUTINE_SUSPENDED() ? objCombineInternal : R6.G.INSTANCE;
        }

        public Object collect$$forInline(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            InterfaceC6147i[] interfaceC6147iArr = this.f35098a;
            Intrinsics.needClassReification();
            j jVar = new j(this.f35098a);
            Intrinsics.needClassReification();
            k kVar = new k(this.f35099b, null);
            InlineMarker.mark(0);
            AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, jVar, kVar, dVar);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.B$g */
    static final class g extends Y6.l implements f7.q {

        /* renamed from: e */
        int f35103e;

        /* renamed from: f */
        private /* synthetic */ Object f35104f;

        /* renamed from: g */
        /* synthetic */ Object f35105g;

        /* renamed from: h */
        final /* synthetic */ f7.q f35106h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(f7.q qVar, W6.d dVar) {
            super(3, dVar);
            this.f35106h = qVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6148j interfaceC6148j;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35103e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                interfaceC6148j = (InterfaceC6148j) this.f35104f;
                Object[] objArr = (Object[]) this.f35105g;
                f7.q qVar = this.f35106h;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f35104f = interfaceC6148j;
                this.f35103e = 1;
                obj = qVar.invoke(obj2, obj3, this);
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
                interfaceC6148j = (InterfaceC6148j) this.f35104f;
                R6.r.throwOnFailure(obj);
            }
            this.f35104f = null;
            this.f35103e = 2;
            if (interfaceC6148j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return R6.G.INSTANCE;
        }

        @Override // f7.q
        public final Object invoke(InterfaceC6148j interfaceC6148j, Object[] objArr, W6.d<? super R6.G> dVar) {
            g gVar = new g(this.f35106h, dVar);
            gVar.f35104f = interfaceC6148j;
            gVar.f35105g = objArr;
            return gVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$h */
    static final class h extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i[] f35107a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC6147i[] interfaceC6147iArr) {
            super(0);
            this.f35107a = interfaceC6147iArr;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
        @Override // f7.InterfaceC5519a
        public final T[] invoke() {
            int length = this.f35107a.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return new Object[length];
        }
    }

    /* renamed from: q7.B$i */
    public static final class i extends Y6.l implements f7.q {

        /* renamed from: e */
        int f35108e;

        /* renamed from: f */
        private /* synthetic */ Object f35109f;

        /* renamed from: g */
        /* synthetic */ Object f35110g;

        /* renamed from: h */
        final /* synthetic */ f7.p f35111h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f7.p pVar, W6.d<? super i> dVar) {
            super(3, dVar);
            this.f35111h = pVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6148j interfaceC6148j;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35108e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                interfaceC6148j = (InterfaceC6148j) this.f35109f;
                Object[] objArr = (Object[]) this.f35110g;
                f7.p pVar = this.f35111h;
                this.f35109f = interfaceC6148j;
                this.f35108e = 1;
                obj = pVar.invoke(objArr, this);
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
                interfaceC6148j = (InterfaceC6148j) this.f35109f;
                R6.r.throwOnFailure(obj);
            }
            this.f35109f = null;
            this.f35108e = 2;
            if (interfaceC6148j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return R6.G.INSTANCE;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35109f;
            Object objInvoke = this.f35111h.invoke((Object[]) this.f35110g, this);
            InlineMarker.mark(0);
            interfaceC6148j.emit(objInvoke, this);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }

        @Override // f7.q
        public final Object invoke(InterfaceC6148j interfaceC6148j, T[] tArr, W6.d<? super R6.G> dVar) {
            Intrinsics.needClassReification();
            i iVar = new i(this.f35111h, dVar);
            iVar.f35109f = interfaceC6148j;
            iVar.f35110g = tArr;
            return iVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$j */
    static final class j extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i[] f35112a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC6147i[] interfaceC6147iArr) {
            super(0);
            this.f35112a = interfaceC6147iArr;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
        @Override // f7.InterfaceC5519a
        public final T[] invoke() {
            int length = this.f35112a.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return new Object[length];
        }
    }

    /* renamed from: q7.B$k */
    public static final class k extends Y6.l implements f7.q {

        /* renamed from: e */
        int f35113e;

        /* renamed from: f */
        private /* synthetic */ Object f35114f;

        /* renamed from: g */
        /* synthetic */ Object f35115g;

        /* renamed from: h */
        final /* synthetic */ f7.p f35116h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f7.p pVar, W6.d<? super k> dVar) {
            super(3, dVar);
            this.f35116h = pVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6148j interfaceC6148j;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35113e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                interfaceC6148j = (InterfaceC6148j) this.f35114f;
                Object[] objArr = (Object[]) this.f35115g;
                f7.p pVar = this.f35116h;
                this.f35114f = interfaceC6148j;
                this.f35113e = 1;
                obj = pVar.invoke(objArr, this);
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
                interfaceC6148j = (InterfaceC6148j) this.f35114f;
                R6.r.throwOnFailure(obj);
            }
            this.f35114f = null;
            this.f35113e = 2;
            if (interfaceC6148j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return R6.G.INSTANCE;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35114f;
            Object objInvoke = this.f35116h.invoke((Object[]) this.f35115g, this);
            InlineMarker.mark(0);
            interfaceC6148j.emit(objInvoke, this);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }

        @Override // f7.q
        public final Object invoke(InterfaceC6148j interfaceC6148j, T[] tArr, W6.d<? super R6.G> dVar) {
            Intrinsics.needClassReification();
            k kVar = new k(this.f35116h, dVar);
            kVar.f35114f = interfaceC6148j;
            kVar.f35115g = tArr;
            return kVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$l */
    public static final class l extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35117e;

        /* renamed from: f */
        private /* synthetic */ Object f35118f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6147i[] f35119g;

        /* renamed from: h */
        final /* synthetic */ f7.r f35120h;

        /* renamed from: q7.B$l$a */
        public static final class a extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35121e;

            /* renamed from: f */
            private /* synthetic */ Object f35122f;

            /* renamed from: g */
            /* synthetic */ Object f35123g;

            /* renamed from: h */
            final /* synthetic */ f7.r f35124h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(W6.d dVar, f7.r rVar) {
                super(3, dVar);
                this.f35124h = rVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35121e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35122f;
                    Object[] objArr = (Object[]) this.f35123g;
                    f7.r rVar = this.f35124h;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f35121e = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = rVar.invoke(interfaceC6148j, obj2, obj3, this);
                    InlineMarker.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
            public final Object invoke(InterfaceC6148j interfaceC6148j, Object[] objArr, W6.d<? super R6.G> dVar) {
                a aVar = new a(dVar, this.f35124h);
                aVar.f35122f = interfaceC6148j;
                aVar.f35123g = objArr;
                return aVar.invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC6147i[] interfaceC6147iArr, W6.d dVar, f7.r rVar) {
            super(2, dVar);
            this.f35119g = interfaceC6147iArr;
            this.f35120h = rVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            l lVar = new l(this.f35119g, dVar, this.f35120h);
            lVar.f35118f = obj;
            return lVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35117e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35118f;
                InterfaceC6147i[] interfaceC6147iArr = this.f35119g;
                InterfaceC5519a interfaceC5519aA = AbstractC6116B.a();
                a aVar = new a(null, this.f35120h);
                this.f35117e = 1;
                if (AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, interfaceC5519aA, aVar, this) == coroutine_suspended) {
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
            return ((l) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$m */
    public static final class m extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35125e;

        /* renamed from: f */
        private /* synthetic */ Object f35126f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6147i[] f35127g;

        /* renamed from: h */
        final /* synthetic */ f7.r f35128h;

        /* renamed from: q7.B$m$a */
        public static final class a extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35129e;

            /* renamed from: f */
            private /* synthetic */ Object f35130f;

            /* renamed from: g */
            /* synthetic */ Object f35131g;

            /* renamed from: h */
            final /* synthetic */ f7.r f35132h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(W6.d dVar, f7.r rVar) {
                super(3, dVar);
                this.f35132h = rVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35129e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35130f;
                    Object[] objArr = (Object[]) this.f35131g;
                    f7.r rVar = this.f35132h;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f35129e = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = rVar.invoke(interfaceC6148j, obj2, obj3, this);
                    InlineMarker.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
            public final Object invoke(InterfaceC6148j interfaceC6148j, Object[] objArr, W6.d<? super R6.G> dVar) {
                a aVar = new a(dVar, this.f35132h);
                aVar.f35130f = interfaceC6148j;
                aVar.f35131g = objArr;
                return aVar.invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC6147i[] interfaceC6147iArr, W6.d dVar, f7.r rVar) {
            super(2, dVar);
            this.f35127g = interfaceC6147iArr;
            this.f35128h = rVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            m mVar = new m(this.f35127g, dVar, this.f35128h);
            mVar.f35126f = obj;
            return mVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35125e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35126f;
                InterfaceC6147i[] interfaceC6147iArr = this.f35127g;
                InterfaceC5519a interfaceC5519aA = AbstractC6116B.a();
                a aVar = new a(null, this.f35128h);
                this.f35125e = 1;
                if (AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, interfaceC5519aA, aVar, this) == coroutine_suspended) {
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
            return ((m) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$n */
    public static final class n extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35133e;

        /* renamed from: f */
        private /* synthetic */ Object f35134f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6147i[] f35135g;

        /* renamed from: h */
        final /* synthetic */ f7.s f35136h;

        /* renamed from: q7.B$n$a */
        public static final class a extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35137e;

            /* renamed from: f */
            private /* synthetic */ Object f35138f;

            /* renamed from: g */
            /* synthetic */ Object f35139g;

            /* renamed from: h */
            final /* synthetic */ f7.s f35140h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(W6.d dVar, f7.s sVar) {
                super(3, dVar);
                this.f35140h = sVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35137e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35138f;
                    Object[] objArr = (Object[]) this.f35139g;
                    f7.s sVar = this.f35140h;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f35137e = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = sVar.invoke(interfaceC6148j, obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
            public final Object invoke(InterfaceC6148j interfaceC6148j, Object[] objArr, W6.d<? super R6.G> dVar) {
                a aVar = new a(dVar, this.f35140h);
                aVar.f35138f = interfaceC6148j;
                aVar.f35139g = objArr;
                return aVar.invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC6147i[] interfaceC6147iArr, W6.d dVar, f7.s sVar) {
            super(2, dVar);
            this.f35135g = interfaceC6147iArr;
            this.f35136h = sVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            n nVar = new n(this.f35135g, dVar, this.f35136h);
            nVar.f35134f = obj;
            return nVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35133e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35134f;
                InterfaceC6147i[] interfaceC6147iArr = this.f35135g;
                InterfaceC5519a interfaceC5519aA = AbstractC6116B.a();
                a aVar = new a(null, this.f35136h);
                this.f35133e = 1;
                if (AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, interfaceC5519aA, aVar, this) == coroutine_suspended) {
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
            return ((n) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$o */
    public static final class o extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35141e;

        /* renamed from: f */
        private /* synthetic */ Object f35142f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6147i[] f35143g;

        /* renamed from: h */
        final /* synthetic */ f7.t f35144h;

        /* renamed from: q7.B$o$a */
        public static final class a extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35145e;

            /* renamed from: f */
            private /* synthetic */ Object f35146f;

            /* renamed from: g */
            /* synthetic */ Object f35147g;

            /* renamed from: h */
            final /* synthetic */ f7.t f35148h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(W6.d dVar, f7.t tVar) {
                super(3, dVar);
                this.f35148h = tVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35145e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35146f;
                    Object[] objArr = (Object[]) this.f35147g;
                    f7.t tVar = this.f35148h;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f35145e = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = tVar.invoke(interfaceC6148j, obj2, obj3, obj4, obj5, this);
                    InlineMarker.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
            public final Object invoke(InterfaceC6148j interfaceC6148j, Object[] objArr, W6.d<? super R6.G> dVar) {
                a aVar = new a(dVar, this.f35148h);
                aVar.f35146f = interfaceC6148j;
                aVar.f35147g = objArr;
                return aVar.invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC6147i[] interfaceC6147iArr, W6.d dVar, f7.t tVar) {
            super(2, dVar);
            this.f35143g = interfaceC6147iArr;
            this.f35144h = tVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            o oVar = new o(this.f35143g, dVar, this.f35144h);
            oVar.f35142f = obj;
            return oVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35141e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35142f;
                InterfaceC6147i[] interfaceC6147iArr = this.f35143g;
                InterfaceC5519a interfaceC5519aA = AbstractC6116B.a();
                a aVar = new a(null, this.f35144h);
                this.f35141e = 1;
                if (AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, interfaceC5519aA, aVar, this) == coroutine_suspended) {
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
            return ((o) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$p */
    public static final class p extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35149e;

        /* renamed from: f */
        private /* synthetic */ Object f35150f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6147i[] f35151g;

        /* renamed from: h */
        final /* synthetic */ f7.u f35152h;

        /* renamed from: q7.B$p$a */
        public static final class a extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35153e;

            /* renamed from: f */
            private /* synthetic */ Object f35154f;

            /* renamed from: g */
            /* synthetic */ Object f35155g;

            /* renamed from: h */
            final /* synthetic */ f7.u f35156h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(W6.d dVar, f7.u uVar) {
                super(3, dVar);
                this.f35156h = uVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35153e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35154f;
                    Object[] objArr = (Object[]) this.f35155g;
                    f7.u uVar = this.f35156h;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f35153e = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = uVar.invoke(interfaceC6148j, obj2, obj3, obj4, obj5, obj6, this);
                    InlineMarker.mark(7);
                    if (objInvoke == coroutine_suspended) {
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
            public final Object invoke(InterfaceC6148j interfaceC6148j, Object[] objArr, W6.d<? super R6.G> dVar) {
                a aVar = new a(dVar, this.f35156h);
                aVar.f35154f = interfaceC6148j;
                aVar.f35155g = objArr;
                return aVar.invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC6147i[] interfaceC6147iArr, W6.d dVar, f7.u uVar) {
            super(2, dVar);
            this.f35151g = interfaceC6147iArr;
            this.f35152h = uVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            p pVar = new p(this.f35151g, dVar, this.f35152h);
            pVar.f35150f = obj;
            return pVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35149e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35150f;
                InterfaceC6147i[] interfaceC6147iArr = this.f35151g;
                InterfaceC5519a interfaceC5519aA = AbstractC6116B.a();
                a aVar = new a(null, this.f35152h);
                this.f35149e = 1;
                if (AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, interfaceC5519aA, aVar, this) == coroutine_suspended) {
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
            return ((p) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$q */
    public static final class q extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35157e;

        /* renamed from: f */
        private /* synthetic */ Object f35158f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6147i[] f35159g;

        /* renamed from: h */
        final /* synthetic */ f7.q f35160h;

        /* renamed from: q7.B$q$a */
        public static final class a extends Lambda implements InterfaceC5519a {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6147i[] f35161a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6147i[] interfaceC6147iArr) {
                super(0);
                this.f35161a = interfaceC6147iArr;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
            @Override // f7.InterfaceC5519a
            public final T[] invoke() {
                int length = this.f35161a.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return new Object[length];
            }
        }

        /* renamed from: q7.B$q$b */
        public static final class b extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35162e;

            /* renamed from: f */
            private /* synthetic */ Object f35163f;

            /* renamed from: g */
            /* synthetic */ Object f35164g;

            /* renamed from: h */
            final /* synthetic */ f7.q f35165h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f7.q qVar, W6.d<? super b> dVar) {
                super(3, dVar);
                this.f35165h = qVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35162e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35163f;
                    Object[] objArr = (Object[]) this.f35164g;
                    f7.q qVar = this.f35165h;
                    this.f35163f = null;
                    this.f35162e = 1;
                    if (qVar.invoke(interfaceC6148j, objArr, this) == coroutine_suspended) {
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

            public final Object invokeSuspend$$forInline(Object obj) {
                this.f35165h.invoke((InterfaceC6148j) this.f35163f, (Object[]) this.f35164g, this);
                return R6.G.INSTANCE;
            }

            @Override // f7.q
            public final Object invoke(InterfaceC6148j interfaceC6148j, T[] tArr, W6.d<? super R6.G> dVar) {
                Intrinsics.needClassReification();
                b bVar = new b(this.f35165h, dVar);
                bVar.f35163f = interfaceC6148j;
                bVar.f35164g = tArr;
                return bVar.invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC6147i[] interfaceC6147iArr, f7.q qVar, W6.d<? super q> dVar) {
            super(2, dVar);
            this.f35159g = interfaceC6147iArr;
            this.f35160h = qVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            q qVar = new q(this.f35159g, this.f35160h, dVar);
            qVar.f35158f = obj;
            return qVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35157e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35158f;
                InterfaceC6147i[] interfaceC6147iArr = this.f35159g;
                Intrinsics.needClassReification();
                a aVar = new a(this.f35159g);
                Intrinsics.needClassReification();
                b bVar = new b(this.f35160h, null);
                this.f35157e = 1;
                if (AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, aVar, bVar, this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35158f;
            InterfaceC6147i[] interfaceC6147iArr = this.f35159g;
            Intrinsics.needClassReification();
            a aVar = new a(this.f35159g);
            Intrinsics.needClassReification();
            b bVar = new b(this.f35160h, null);
            InlineMarker.mark(0);
            AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, aVar, bVar, this);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            return ((q) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$r */
    public static final class r extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35166e;

        /* renamed from: f */
        private /* synthetic */ Object f35167f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6147i[] f35168g;

        /* renamed from: h */
        final /* synthetic */ f7.q f35169h;

        /* renamed from: q7.B$r$a */
        public static final class a extends Lambda implements InterfaceC5519a {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6147i[] f35170a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6147i[] interfaceC6147iArr) {
                super(0);
                this.f35170a = interfaceC6147iArr;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
            @Override // f7.InterfaceC5519a
            public final T[] invoke() {
                int length = this.f35170a.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return new Object[length];
            }
        }

        /* renamed from: q7.B$r$b */
        public static final class b extends Y6.l implements f7.q {

            /* renamed from: e */
            int f35171e;

            /* renamed from: f */
            private /* synthetic */ Object f35172f;

            /* renamed from: g */
            /* synthetic */ Object f35173g;

            /* renamed from: h */
            final /* synthetic */ f7.q f35174h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f7.q qVar, W6.d<? super b> dVar) {
                super(3, dVar);
                this.f35174h = qVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35171e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35172f;
                    Object[] objArr = (Object[]) this.f35173g;
                    f7.q qVar = this.f35174h;
                    this.f35172f = null;
                    this.f35171e = 1;
                    if (qVar.invoke(interfaceC6148j, objArr, this) == coroutine_suspended) {
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

            public final Object invokeSuspend$$forInline(Object obj) {
                this.f35174h.invoke((InterfaceC6148j) this.f35172f, (Object[]) this.f35173g, this);
                return R6.G.INSTANCE;
            }

            @Override // f7.q
            public final Object invoke(InterfaceC6148j interfaceC6148j, T[] tArr, W6.d<? super R6.G> dVar) {
                Intrinsics.needClassReification();
                b bVar = new b(this.f35174h, dVar);
                bVar.f35172f = interfaceC6148j;
                bVar.f35173g = tArr;
                return bVar.invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC6147i[] interfaceC6147iArr, f7.q qVar, W6.d<? super r> dVar) {
            super(2, dVar);
            this.f35168g = interfaceC6147iArr;
            this.f35169h = qVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            r rVar = new r(this.f35168g, this.f35169h, dVar);
            rVar.f35167f = obj;
            return rVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35166e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35167f;
                InterfaceC6147i[] interfaceC6147iArr = this.f35168g;
                Intrinsics.needClassReification();
                a aVar = new a(this.f35168g);
                Intrinsics.needClassReification();
                b bVar = new b(this.f35169h, null);
                this.f35166e = 1;
                if (AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, aVar, bVar, this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35167f;
            InterfaceC6147i[] interfaceC6147iArr = this.f35168g;
            Intrinsics.needClassReification();
            a aVar = new a(this.f35168g);
            Intrinsics.needClassReification();
            b bVar = new b(this.f35169h, null);
            InlineMarker.mark(0);
            AbstractC6196m.combineInternal(interfaceC6148j, interfaceC6147iArr, aVar, bVar, this);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            return ((r) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.B$s */
    static final class s extends Lambda implements InterfaceC5519a {
        public static final s INSTANCE = new s();

        s() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public final Void invoke() {
            return null;
        }
    }

    public static final InterfaceC5519a a() {
        return s.INSTANCE;
    }

    public static final <T1, T2, R> InterfaceC6147i combine(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.q qVar) {
        return AbstractC6149k.flowCombine(interfaceC6147i, interfaceC6147i2, qVar);
    }

    public static final <T1, T2, R> InterfaceC6147i combineTransform(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.r rVar) {
        return AbstractC6149k.flow(new m(new InterfaceC6147i[]{interfaceC6147i, interfaceC6147i2}, null, rVar));
    }

    public static final <T1, T2, R> InterfaceC6147i flowCombine(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.q qVar) {
        return new d(interfaceC6147i, interfaceC6147i2, qVar);
    }

    public static final <T1, T2, R> InterfaceC6147i flowCombineTransform(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.r rVar) {
        return AbstractC6149k.flow(new l(new InterfaceC6147i[]{interfaceC6147i, interfaceC6147i2}, null, rVar));
    }

    public static final <T1, T2, R> InterfaceC6147i zip(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.q qVar) {
        return AbstractC6196m.zipImpl(interfaceC6147i, interfaceC6147i2, qVar);
    }

    public static final <T1, T2, T3, R> InterfaceC6147i combine(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, InterfaceC6147i interfaceC6147i3, f7.r rVar) {
        return new a(new InterfaceC6147i[]{interfaceC6147i, interfaceC6147i2, interfaceC6147i3}, rVar);
    }

    public static final <T1, T2, T3, R> InterfaceC6147i combineTransform(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, InterfaceC6147i interfaceC6147i3, f7.s sVar) {
        return AbstractC6149k.flow(new n(new InterfaceC6147i[]{interfaceC6147i, interfaceC6147i2, interfaceC6147i3}, null, sVar));
    }

    public static final <T1, T2, T3, T4, R> InterfaceC6147i combine(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, InterfaceC6147i interfaceC6147i3, InterfaceC6147i interfaceC6147i4, f7.s sVar) {
        return new b(new InterfaceC6147i[]{interfaceC6147i, interfaceC6147i2, interfaceC6147i3, interfaceC6147i4}, sVar);
    }

    public static final <T1, T2, T3, T4, R> InterfaceC6147i combineTransform(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, InterfaceC6147i interfaceC6147i3, InterfaceC6147i interfaceC6147i4, f7.t tVar) {
        return AbstractC6149k.flow(new o(new InterfaceC6147i[]{interfaceC6147i, interfaceC6147i2, interfaceC6147i3, interfaceC6147i4}, null, tVar));
    }

    public static final <T1, T2, T3, T4, T5, R> InterfaceC6147i combine(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, InterfaceC6147i interfaceC6147i3, InterfaceC6147i interfaceC6147i4, InterfaceC6147i interfaceC6147i5, f7.t tVar) {
        return new c(new InterfaceC6147i[]{interfaceC6147i, interfaceC6147i2, interfaceC6147i3, interfaceC6147i4, interfaceC6147i5}, tVar);
    }

    public static final <T1, T2, T3, T4, T5, R> InterfaceC6147i combineTransform(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, InterfaceC6147i interfaceC6147i3, InterfaceC6147i interfaceC6147i4, InterfaceC6147i interfaceC6147i5, f7.u uVar) {
        return AbstractC6149k.flow(new p(new InterfaceC6147i[]{interfaceC6147i, interfaceC6147i2, interfaceC6147i3, interfaceC6147i4, interfaceC6147i5}, null, uVar));
    }

    public static final /* synthetic */ <T, R> InterfaceC6147i combine(Iterable<? extends InterfaceC6147i> iterable, f7.p pVar) {
        InterfaceC6147i[] interfaceC6147iArr = (InterfaceC6147i[]) S6.r.toList(iterable).toArray(new InterfaceC6147i[0]);
        Intrinsics.needClassReification();
        return new f(interfaceC6147iArr, pVar);
    }

    public static final /* synthetic */ <T, R> InterfaceC6147i combineTransform(InterfaceC6147i[] interfaceC6147iArr, f7.q qVar) {
        Intrinsics.needClassReification();
        return AbstractC6149k.flow(new q(interfaceC6147iArr, qVar, null));
    }

    public static final /* synthetic */ <T, R> InterfaceC6147i combineTransform(Iterable<? extends InterfaceC6147i> iterable, f7.q qVar) {
        InterfaceC6147i[] interfaceC6147iArr = (InterfaceC6147i[]) S6.r.toList(iterable).toArray(new InterfaceC6147i[0]);
        Intrinsics.needClassReification();
        return AbstractC6149k.flow(new r(interfaceC6147iArr, qVar, null));
    }

    public static final /* synthetic */ <T, R> InterfaceC6147i combine(InterfaceC6147i[] interfaceC6147iArr, f7.p pVar) {
        Intrinsics.needClassReification();
        return new e(interfaceC6147iArr, pVar);
    }
}
