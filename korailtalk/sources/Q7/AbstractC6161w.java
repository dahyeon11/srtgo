package q7;

import S6.AbstractC0765i;
import kotlin.jvm.internal.InlineMarker;
import r7.C6190g;
import r7.C6193j;
import r7.C6194k;

/* renamed from: q7.w */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6161w {

    /* renamed from: a */
    private static final int f35577a = s7.L.systemProp(AbstractC6149k.DEFAULT_CONCURRENCY_PROPERTY_NAME, 16, 1, Integer.MAX_VALUE);

    /* renamed from: q7.w$a */
    public static final class a implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35578a;

        /* renamed from: b */
        final /* synthetic */ f7.p f35579b;

        /* renamed from: q7.w$a$a */
        public static final class C0392a implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f35580a;

            /* renamed from: b */
            final /* synthetic */ f7.p f35581b;

            /* renamed from: q7.w$a$a$a */
            public static final class C0393a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f35582d;

                /* renamed from: e */
                int f35583e;

                /* renamed from: f */
                Object f35584f;

                public C0393a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35582d = obj;
                    this.f35583e |= Integer.MIN_VALUE;
                    return C0392a.this.emit(null, this);
                }
            }

            public C0392a(InterfaceC6148j interfaceC6148j, f7.p pVar) {
                this.f35580a = interfaceC6148j;
                this.f35581b = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, W6.d r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof q7.AbstractC6161w.a.C0392a.C0393a
                    if (r0 == 0) goto L13
                    r0 = r8
                    q7.w$a$a$a r0 = (q7.AbstractC6161w.a.C0392a.C0393a) r0
                    int r1 = r0.f35583e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35583e = r1
                    goto L18
                L13:
                    q7.w$a$a$a r0 = new q7.w$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f35582d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35583e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    R6.r.throwOnFailure(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f35584f
                    q7.j r7 = (q7.InterfaceC6148j) r7
                    R6.r.throwOnFailure(r8)
                    goto L51
                L3c:
                    R6.r.throwOnFailure(r8)
                    q7.j r8 = r6.f35580a
                    f7.p r2 = r6.f35581b
                    r0.f35584f = r8
                    r0.f35583e = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f35584f = r2
                    r0.f35583e = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    R6.G r7 = R6.G.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6161w.a.C0392a.emit(java.lang.Object, W6.d):java.lang.Object");
            }
        }

        public a(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f35578a = interfaceC6147i;
            this.f35579b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCollect = this.f35578a.collect(new C0392a(interfaceC6148j, this.f35579b), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.w$b */
    public static final class b extends Y6.l implements f7.q {

        /* renamed from: e */
        int f35586e;

        /* renamed from: f */
        private /* synthetic */ Object f35587f;

        /* renamed from: g */
        /* synthetic */ Object f35588g;

        /* renamed from: h */
        final /* synthetic */ f7.p f35589h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f7.p pVar, W6.d<? super b> dVar) {
            super(3, dVar);
            this.f35589h = pVar;
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC6148j) obj, (InterfaceC6148j) obj2, (W6.d<? super R6.G>) obj3);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6148j interfaceC6148j;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35586e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                interfaceC6148j = (InterfaceC6148j) this.f35587f;
                Object obj2 = this.f35588g;
                f7.p pVar = this.f35589h;
                this.f35587f = interfaceC6148j;
                this.f35586e = 1;
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
                interfaceC6148j = (InterfaceC6148j) this.f35587f;
                R6.r.throwOnFailure(obj);
            }
            this.f35587f = null;
            this.f35586e = 2;
            if (AbstractC6149k.emitAll(interfaceC6148j, (InterfaceC6147i) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return R6.G.INSTANCE;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35587f;
            InterfaceC6147i interfaceC6147i = (InterfaceC6147i) this.f35589h.invoke(this.f35588g, this);
            InlineMarker.mark(0);
            AbstractC6149k.emitAll(interfaceC6148j, interfaceC6147i, this);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }

        public final Object invoke(InterfaceC6148j interfaceC6148j, T t8, W6.d<? super R6.G> dVar) {
            b bVar = new b(this.f35589h, dVar);
            bVar.f35587f = interfaceC6148j;
            bVar.f35588g = t8;
            return bVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.w$c */
    public static final class c implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35590a;

        /* renamed from: b */
        final /* synthetic */ f7.p f35591b;

        /* renamed from: q7.w$c$a */
        public static final class a implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f35592a;

            /* renamed from: b */
            final /* synthetic */ f7.p f35593b;

            /* renamed from: q7.w$c$a$a */
            public static final class C0394a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f35594d;

                /* renamed from: e */
                int f35595e;

                /* renamed from: f */
                Object f35596f;

                public C0394a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35594d = obj;
                    this.f35595e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC6148j interfaceC6148j, f7.p pVar) {
                this.f35592a = interfaceC6148j;
                this.f35593b = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, W6.d r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof q7.AbstractC6161w.c.a.C0394a
                    if (r0 == 0) goto L13
                    r0 = r8
                    q7.w$c$a$a r0 = (q7.AbstractC6161w.c.a.C0394a) r0
                    int r1 = r0.f35595e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35595e = r1
                    goto L18
                L13:
                    q7.w$c$a$a r0 = new q7.w$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f35594d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35595e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    R6.r.throwOnFailure(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f35596f
                    q7.j r7 = (q7.InterfaceC6148j) r7
                    R6.r.throwOnFailure(r8)
                    goto L51
                L3c:
                    R6.r.throwOnFailure(r8)
                    q7.j r8 = r6.f35592a
                    f7.p r2 = r6.f35593b
                    r0.f35596f = r8
                    r0.f35595e = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f35596f = r2
                    r0.f35595e = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    R6.G r7 = R6.G.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6161w.c.a.emit(java.lang.Object, W6.d):java.lang.Object");
            }
        }

        public c(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f35590a = interfaceC6147i;
            this.f35591b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCollect = this.f35590a.collect(new a(interfaceC6148j, this.f35591b), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.w$d */
    public static final class d implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35598a;

        public d(InterfaceC6147i interfaceC6147i) {
            this.f35598a = interfaceC6147i;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            Object objCollect = this.f35598a.collect(new e(interfaceC6148j), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.w$e */
    static final class e implements InterfaceC6148j {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6148j f35599a;

        /* renamed from: q7.w$e$a */
        static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35600d;

            /* renamed from: f */
            int f35602f;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35600d = obj;
                this.f35602f |= Integer.MIN_VALUE;
                return e.this.emit((InterfaceC6147i) null, (W6.d<? super R6.G>) this);
            }
        }

        e(InterfaceC6148j interfaceC6148j) {
            this.f35599a = interfaceC6148j;
        }

        @Override // q7.InterfaceC6148j
        public /* bridge */ /* synthetic */ Object emit(Object obj, W6.d dVar) {
            return emit((InterfaceC6147i) obj, (W6.d<? super R6.G>) dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(q7.InterfaceC6147i r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q7.AbstractC6161w.e.a
                if (r0 == 0) goto L13
                r0 = r6
                q7.w$e$a r0 = (q7.AbstractC6161w.e.a) r0
                int r1 = r0.f35602f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35602f = r1
                goto L18
            L13:
                q7.w$e$a r0 = new q7.w$e$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35600d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35602f
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                R6.r.throwOnFailure(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                R6.r.throwOnFailure(r6)
                q7.j r6 = r4.f35599a
                r0.f35602f = r3
                java.lang.Object r5 = q7.AbstractC6149k.emitAll(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                R6.G r5 = R6.G.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6161w.e.emit(q7.i, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.w$f */
    static final class f extends Y6.l implements f7.q {

        /* renamed from: e */
        int f35603e;

        /* renamed from: f */
        private /* synthetic */ Object f35604f;

        /* renamed from: g */
        /* synthetic */ Object f35605g;

        /* renamed from: h */
        final /* synthetic */ f7.p f35606h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(f7.p pVar, W6.d dVar) {
            super(3, dVar);
            this.f35606h = pVar;
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC6148j) obj, (InterfaceC6148j) obj2, (W6.d<? super R6.G>) obj3);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6148j interfaceC6148j;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35603e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                interfaceC6148j = (InterfaceC6148j) this.f35604f;
                Object obj2 = this.f35605g;
                f7.p pVar = this.f35606h;
                this.f35604f = interfaceC6148j;
                this.f35603e = 1;
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
                interfaceC6148j = (InterfaceC6148j) this.f35604f;
                R6.r.throwOnFailure(obj);
            }
            this.f35604f = null;
            this.f35603e = 2;
            if (interfaceC6148j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return R6.G.INSTANCE;
        }

        public final Object invoke(InterfaceC6148j interfaceC6148j, T t8, W6.d<? super R6.G> dVar) {
            f fVar = new f(this.f35606h, dVar);
            fVar.f35604f = interfaceC6148j;
            fVar.f35605g = t8;
            return fVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    public static final <T, R> InterfaceC6147i flatMapConcat(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return AbstractC6149k.flattenConcat(new a(interfaceC6147i, pVar));
    }

    public static final <T, R> InterfaceC6147i flatMapLatest(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return AbstractC6149k.transformLatest(interfaceC6147i, new b(pVar, null));
    }

    public static final <T, R> InterfaceC6147i flatMapMerge(InterfaceC6147i interfaceC6147i, int i8, f7.p pVar) {
        return AbstractC6149k.flattenMerge(new c(interfaceC6147i, pVar), i8);
    }

    public static /* synthetic */ InterfaceC6147i flatMapMerge$default(InterfaceC6147i interfaceC6147i, int i8, f7.p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = f35577a;
        }
        return AbstractC6149k.flatMapMerge(interfaceC6147i, i8, pVar);
    }

    public static final <T> InterfaceC6147i flattenConcat(InterfaceC6147i interfaceC6147i) {
        return new d(interfaceC6147i);
    }

    public static final <T> InterfaceC6147i flattenMerge(InterfaceC6147i interfaceC6147i, int i8) {
        if (i8 > 0) {
            return i8 == 1 ? AbstractC6149k.flattenConcat(interfaceC6147i) : new C6190g(interfaceC6147i, i8, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i8).toString());
    }

    public static /* synthetic */ InterfaceC6147i flattenMerge$default(InterfaceC6147i interfaceC6147i, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = f35577a;
        }
        return AbstractC6149k.flattenMerge(interfaceC6147i, i8);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return f35577a;
    }

    public static final <T, R> InterfaceC6147i mapLatest(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return AbstractC6149k.transformLatest(interfaceC6147i, new f(pVar, null));
    }

    public static final <T> InterfaceC6147i merge(Iterable<? extends InterfaceC6147i> iterable) {
        return new C6194k(iterable, null, 0, null, 14, null);
    }

    public static final <T, R> InterfaceC6147i transformLatest(InterfaceC6147i interfaceC6147i, f7.q qVar) {
        return new C6193j(qVar, interfaceC6147i, null, 0, null, 28, null);
    }

    public static final <T> InterfaceC6147i merge(InterfaceC6147i... interfaceC6147iArr) {
        return AbstractC6149k.merge((Iterable<? extends InterfaceC6147i>) AbstractC0765i.asIterable(interfaceC6147iArr));
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY$annotations() {
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }
}
