package q7;

import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;

/* renamed from: q7.A */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6115A {

    /* renamed from: q7.A$a */
    public static final class a implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f34964a;

        /* renamed from: b */
        final /* synthetic */ f7.p f34965b;

        /* renamed from: q7.A$a$a */
        public static final class C0371a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f34966d;

            /* renamed from: e */
            int f34967e;

            public C0371a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f34966d = obj;
                this.f34967e |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        /* renamed from: q7.A$a$b */
        public static final class b implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f34969a;

            /* renamed from: b */
            final /* synthetic */ f7.p f34970b;

            /* renamed from: q7.A$a$b$a */
            public static final class C0372a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f34971d;

                /* renamed from: e */
                int f34972e;

                /* renamed from: g */
                Object f34974g;

                /* renamed from: h */
                Object f34975h;

                public C0372a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f34971d = obj;
                    this.f34972e |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(InterfaceC6148j interfaceC6148j, f7.p pVar) {
                this.f34969a = interfaceC6148j;
                this.f34970b = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof q7.AbstractC6115A.a.b.C0372a
                    if (r0 == 0) goto L13
                    r0 = r8
                    q7.A$a$b$a r0 = (q7.AbstractC6115A.a.b.C0372a) r0
                    int r1 = r0.f34972e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34972e = r1
                    goto L18
                L13:
                    q7.A$a$b$a r0 = new q7.A$a$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f34971d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f34972e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    R6.r.throwOnFailure(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f34975h
                    q7.j r7 = (q7.InterfaceC6148j) r7
                    java.lang.Object r2 = r0.f34974g
                    R6.r.throwOnFailure(r8)
                    goto L56
                L3e:
                    R6.r.throwOnFailure(r8)
                    q7.j r8 = r6.f34969a
                    f7.p r2 = r6.f34970b
                    r0.f34974g = r7
                    r0.f34975h = r8
                    r0.f34972e = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L6c
                    r8 = 0
                    r0.f34974g = r8
                    r0.f34975h = r8
                    r0.f34972e = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    R6.G r7 = R6.G.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.a.b.emit(java.lang.Object, W6.d):java.lang.Object");
            }

            public final Object emit$$forInline(Object obj, W6.d dVar) {
                InlineMarker.mark(4);
                new C0372a(dVar);
                InlineMarker.mark(5);
                InterfaceC6148j interfaceC6148j = this.f34969a;
                if (((Boolean) this.f34970b.invoke(obj, dVar)).booleanValue()) {
                    InlineMarker.mark(0);
                    interfaceC6148j.emit(obj, dVar);
                    InlineMarker.mark(1);
                }
                return R6.G.INSTANCE;
            }
        }

        public a(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f34964a = interfaceC6147i;
            this.f34965b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCollect = this.f34964a.collect(new b(interfaceC6148j, this.f34965b), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }

        public Object collect$$forInline(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            InlineMarker.mark(4);
            new C0371a(dVar);
            InlineMarker.mark(5);
            InterfaceC6147i interfaceC6147i = this.f34964a;
            b bVar = new b(interfaceC6148j, this.f34965b);
            InlineMarker.mark(0);
            interfaceC6147i.collect(bVar, dVar);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$b */
    public static final class b implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f34976a;

        /* renamed from: q7.A$b$a */
        public static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f34977d;

            /* renamed from: e */
            int f34978e;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f34977d = obj;
                this.f34978e |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* renamed from: q7.A$b$b */
        public static final class C0373b implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f34980a;

            /* renamed from: q7.A$b$b$a */
            public static final class a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f34981d;

                /* renamed from: e */
                int f34982e;

                public a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f34981d = obj;
                    this.f34982e |= Integer.MIN_VALUE;
                    return C0373b.this.emit(null, this);
                }
            }

            public C0373b(InterfaceC6148j interfaceC6148j) {
                this.f34980a = interfaceC6148j;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, W6.d r7) throws java.lang.Throwable {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof q7.AbstractC6115A.b.C0373b.a
                    if (r0 == 0) goto L13
                    r0 = r7
                    q7.A$b$b$a r0 = (q7.AbstractC6115A.b.C0373b.a) r0
                    int r1 = r0.f34982e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34982e = r1
                    goto L18
                L13:
                    q7.A$b$b$a r0 = new q7.A$b$b$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f34981d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f34982e
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    R6.r.throwOnFailure(r7)
                    goto L47
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    R6.r.throwOnFailure(r7)
                    q7.j r7 = r5.f34980a
                    r2 = 3
                    java.lang.String r4 = "R"
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r2, r4)
                    if (r6 == 0) goto L47
                    r0.f34982e = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L47
                    return r1
                L47:
                    R6.G r6 = R6.G.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.b.C0373b.emit(java.lang.Object, W6.d):java.lang.Object");
            }

            public final Object emit$$forInline(Object obj, W6.d dVar) {
                InlineMarker.mark(4);
                new a(dVar);
                InlineMarker.mark(5);
                InterfaceC6148j interfaceC6148j = this.f34980a;
                Intrinsics.reifiedOperationMarker(3, "R");
                if (obj != null) {
                    InlineMarker.mark(0);
                    interfaceC6148j.emit(obj, dVar);
                    InlineMarker.mark(1);
                }
                return R6.G.INSTANCE;
            }
        }

        public b(InterfaceC6147i interfaceC6147i) {
            this.f34976a = interfaceC6147i;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            InterfaceC6147i interfaceC6147i = this.f34976a;
            Intrinsics.needClassReification();
            Object objCollect = interfaceC6147i.collect(new C0373b(interfaceC6148j), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }

        public Object collect$$forInline(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            InterfaceC6147i interfaceC6147i = this.f34976a;
            Intrinsics.needClassReification();
            C0373b c0373b = new C0373b(interfaceC6148j);
            InlineMarker.mark(0);
            interfaceC6147i.collect(c0373b, dVar);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$c */
    public static final class c implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f34984a;

        /* renamed from: b */
        final /* synthetic */ KClass f34985b;

        /* renamed from: q7.A$c$a */
        public static final class a implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f34986a;

            /* renamed from: b */
            final /* synthetic */ KClass f34987b;

            /* renamed from: q7.A$c$a$a */
            public static final class C0374a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f34988d;

                /* renamed from: e */
                int f34989e;

                public C0374a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f34988d = obj;
                    this.f34989e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC6148j interfaceC6148j, KClass kClass) {
                this.f34986a = interfaceC6148j;
                this.f34987b = kClass;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, W6.d r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof q7.AbstractC6115A.c.a.C0374a
                    if (r0 == 0) goto L13
                    r0 = r6
                    q7.A$c$a$a r0 = (q7.AbstractC6115A.c.a.C0374a) r0
                    int r1 = r0.f34989e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34989e = r1
                    goto L18
                L13:
                    q7.A$c$a$a r0 = new q7.A$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f34988d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f34989e
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    R6.r.throwOnFailure(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    R6.r.throwOnFailure(r6)
                    q7.j r6 = r4.f34986a
                    kotlin.reflect.KClass r2 = r4.f34987b
                    boolean r2 = r2.isInstance(r5)
                    if (r2 == 0) goto L47
                    r0.f34989e = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    R6.G r5 = R6.G.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.c.a.emit(java.lang.Object, W6.d):java.lang.Object");
            }
        }

        public c(InterfaceC6147i interfaceC6147i, KClass kClass) {
            this.f34984a = interfaceC6147i;
            this.f34985b = kClass;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCollect = this.f34984a.collect(new a(interfaceC6148j, this.f34985b), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$d */
    public static final class d implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f34991a;

        /* renamed from: b */
        final /* synthetic */ f7.p f34992b;

        /* renamed from: q7.A$d$a */
        public static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f34993d;

            /* renamed from: e */
            int f34994e;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f34993d = obj;
                this.f34994e |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        /* renamed from: q7.A$d$b */
        public static final class b implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f34996a;

            /* renamed from: b */
            final /* synthetic */ f7.p f34997b;

            /* renamed from: q7.A$d$b$a */
            public static final class a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f34998d;

                /* renamed from: e */
                int f34999e;

                /* renamed from: g */
                Object f35001g;

                /* renamed from: h */
                Object f35002h;

                public a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f34998d = obj;
                    this.f34999e |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(InterfaceC6148j interfaceC6148j, f7.p pVar) {
                this.f34996a = interfaceC6148j;
                this.f34997b = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof q7.AbstractC6115A.d.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    q7.A$d$b$a r0 = (q7.AbstractC6115A.d.b.a) r0
                    int r1 = r0.f34999e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34999e = r1
                    goto L18
                L13:
                    q7.A$d$b$a r0 = new q7.A$d$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f34998d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f34999e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    R6.r.throwOnFailure(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f35002h
                    q7.j r7 = (q7.InterfaceC6148j) r7
                    java.lang.Object r2 = r0.f35001g
                    R6.r.throwOnFailure(r8)
                    goto L56
                L3e:
                    R6.r.throwOnFailure(r8)
                    q7.j r8 = r6.f34996a
                    f7.p r2 = r6.f34997b
                    r0.f35001g = r7
                    r0.f35002h = r8
                    r0.f34999e = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L6c
                    r8 = 0
                    r0.f35001g = r8
                    r0.f35002h = r8
                    r0.f34999e = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    R6.G r7 = R6.G.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.d.b.emit(java.lang.Object, W6.d):java.lang.Object");
            }

            public final Object emit$$forInline(Object obj, W6.d dVar) {
                InlineMarker.mark(4);
                new a(dVar);
                InlineMarker.mark(5);
                InterfaceC6148j interfaceC6148j = this.f34996a;
                if (!((Boolean) this.f34997b.invoke(obj, dVar)).booleanValue()) {
                    InlineMarker.mark(0);
                    interfaceC6148j.emit(obj, dVar);
                    InlineMarker.mark(1);
                }
                return R6.G.INSTANCE;
            }
        }

        public d(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f34991a = interfaceC6147i;
            this.f34992b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCollect = this.f34991a.collect(new b(interfaceC6148j, this.f34992b), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }

        public Object collect$$forInline(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            InterfaceC6147i interfaceC6147i = this.f34991a;
            b bVar = new b(interfaceC6148j, this.f34992b);
            InlineMarker.mark(0);
            interfaceC6147i.collect(bVar, dVar);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$e */
    public static final class e implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35003a;

        /* renamed from: q7.A$e$a */
        public static final class a implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f35004a;

            /* renamed from: q7.A$e$a$a */
            public static final class C0375a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f35005d;

                /* renamed from: e */
                int f35006e;

                public C0375a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35005d = obj;
                    this.f35006e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC6148j interfaceC6148j) {
                this.f35004a = interfaceC6148j;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof q7.AbstractC6115A.e.a.C0375a
                    if (r0 == 0) goto L13
                    r0 = r6
                    q7.A$e$a$a r0 = (q7.AbstractC6115A.e.a.C0375a) r0
                    int r1 = r0.f35006e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35006e = r1
                    goto L18
                L13:
                    q7.A$e$a$a r0 = new q7.A$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f35005d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35006e
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    R6.r.throwOnFailure(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    R6.r.throwOnFailure(r6)
                    q7.j r6 = r4.f35004a
                    if (r5 == 0) goto L41
                    r0.f35006e = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    R6.G r5 = R6.G.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.e.a.emit(java.lang.Object, W6.d):java.lang.Object");
            }
        }

        public e(InterfaceC6147i interfaceC6147i) {
            this.f35003a = interfaceC6147i;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCollect = this.f35003a.collect(new a(interfaceC6148j), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$f */
    public static final class f implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35008a;

        /* renamed from: b */
        final /* synthetic */ f7.p f35009b;

        /* renamed from: q7.A$f$a */
        public static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35010d;

            /* renamed from: e */
            int f35011e;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35010d = obj;
                this.f35011e |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        /* renamed from: q7.A$f$b */
        public static final class b implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f35013a;

            /* renamed from: b */
            final /* synthetic */ f7.p f35014b;

            /* renamed from: q7.A$f$b$a */
            public static final class a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f35015d;

                /* renamed from: e */
                int f35016e;

                /* renamed from: g */
                Object f35018g;

                public a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35015d = obj;
                    this.f35016e |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(InterfaceC6148j interfaceC6148j, f7.p pVar) {
                this.f35013a = interfaceC6148j;
                this.f35014b = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof q7.AbstractC6115A.f.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    q7.A$f$b$a r0 = (q7.AbstractC6115A.f.b.a) r0
                    int r1 = r0.f35016e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35016e = r1
                    goto L18
                L13:
                    q7.A$f$b$a r0 = new q7.A$f$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f35015d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35016e
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
                    java.lang.Object r7 = r0.f35018g
                    q7.j r7 = (q7.InterfaceC6148j) r7
                    R6.r.throwOnFailure(r8)
                    goto L51
                L3c:
                    R6.r.throwOnFailure(r8)
                    q7.j r8 = r6.f35013a
                    f7.p r2 = r6.f35014b
                    r0.f35018g = r8
                    r0.f35016e = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f35018g = r2
                    r0.f35016e = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    R6.G r7 = R6.G.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.f.b.emit(java.lang.Object, W6.d):java.lang.Object");
            }

            public final Object emit$$forInline(Object obj, W6.d dVar) {
                InlineMarker.mark(4);
                new a(dVar);
                InlineMarker.mark(5);
                InterfaceC6148j interfaceC6148j = this.f35013a;
                Object objInvoke = this.f35014b.invoke(obj, dVar);
                InlineMarker.mark(0);
                interfaceC6148j.emit(objInvoke, dVar);
                InlineMarker.mark(1);
                return R6.G.INSTANCE;
            }
        }

        public f(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f35008a = interfaceC6147i;
            this.f35009b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCollect = this.f35008a.collect(new b(interfaceC6148j, this.f35009b), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }

        public Object collect$$forInline(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            InterfaceC6147i interfaceC6147i = this.f35008a;
            b bVar = new b(interfaceC6148j, this.f35009b);
            InlineMarker.mark(0);
            interfaceC6147i.collect(bVar, dVar);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$g */
    public static final class g implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35019a;

        /* renamed from: b */
        final /* synthetic */ f7.p f35020b;

        /* renamed from: q7.A$g$a */
        public static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35021d;

            /* renamed from: e */
            int f35022e;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35021d = obj;
                this.f35022e |= Integer.MIN_VALUE;
                return g.this.collect(null, this);
            }
        }

        /* renamed from: q7.A$g$b */
        public static final class b implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f35024a;

            /* renamed from: b */
            final /* synthetic */ f7.p f35025b;

            /* renamed from: q7.A$g$b$a */
            public static final class a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f35026d;

                /* renamed from: e */
                int f35027e;

                /* renamed from: g */
                Object f35029g;

                public a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35026d = obj;
                    this.f35027e |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(InterfaceC6148j interfaceC6148j, f7.p pVar) {
                this.f35024a = interfaceC6148j;
                this.f35025b = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof q7.AbstractC6115A.g.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    q7.A$g$b$a r0 = (q7.AbstractC6115A.g.b.a) r0
                    int r1 = r0.f35027e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35027e = r1
                    goto L18
                L13:
                    q7.A$g$b$a r0 = new q7.A$g$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f35026d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35027e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    R6.r.throwOnFailure(r8)
                    goto L60
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f35029g
                    q7.j r7 = (q7.InterfaceC6148j) r7
                    R6.r.throwOnFailure(r8)
                    goto L51
                L3c:
                    R6.r.throwOnFailure(r8)
                    q7.j r8 = r6.f35024a
                    f7.p r2 = r6.f35025b
                    r0.f35029g = r8
                    r0.f35027e = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    if (r8 != 0) goto L54
                    goto L60
                L54:
                    r2 = 0
                    r0.f35029g = r2
                    r0.f35027e = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L60
                    return r1
                L60:
                    R6.G r7 = R6.G.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.g.b.emit(java.lang.Object, W6.d):java.lang.Object");
            }

            public final Object emit$$forInline(Object obj, W6.d dVar) {
                InlineMarker.mark(4);
                new a(dVar);
                InlineMarker.mark(5);
                InterfaceC6148j interfaceC6148j = this.f35024a;
                Object objInvoke = this.f35025b.invoke(obj, dVar);
                if (objInvoke != null) {
                    InlineMarker.mark(0);
                    interfaceC6148j.emit(objInvoke, dVar);
                    InlineMarker.mark(1);
                }
                return R6.G.INSTANCE;
            }
        }

        public g(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f35019a = interfaceC6147i;
            this.f35020b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCollect = this.f35019a.collect(new b(interfaceC6148j, this.f35020b), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }

        public Object collect$$forInline(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            InterfaceC6147i interfaceC6147i = this.f35019a;
            b bVar = new b(interfaceC6148j, this.f35020b);
            InlineMarker.mark(0);
            interfaceC6147i.collect(bVar, dVar);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$h */
    public static final class h implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35030a;

        /* renamed from: b */
        final /* synthetic */ f7.p f35031b;

        /* renamed from: q7.A$h$a */
        public static final class a implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6148j f35032a;

            /* renamed from: b */
            final /* synthetic */ f7.p f35033b;

            /* renamed from: q7.A$h$a$a */
            public static final class C0376a extends Y6.d {

                /* renamed from: d */
                /* synthetic */ Object f35034d;

                /* renamed from: e */
                int f35035e;

                /* renamed from: g */
                Object f35037g;

                /* renamed from: h */
                Object f35038h;

                public C0376a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35034d = obj;
                    this.f35035e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC6148j interfaceC6148j, f7.p pVar) {
                this.f35032a = interfaceC6148j;
                this.f35033b = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, W6.d<? super R6.G> r7) throws java.lang.Throwable {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof q7.AbstractC6115A.h.a.C0376a
                    if (r0 == 0) goto L13
                    r0 = r7
                    q7.A$h$a$a r0 = (q7.AbstractC6115A.h.a.C0376a) r0
                    int r1 = r0.f35035e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35035e = r1
                    goto L18
                L13:
                    q7.A$h$a$a r0 = new q7.A$h$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f35034d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35035e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    R6.r.throwOnFailure(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f35038h
                    q7.j r6 = (q7.InterfaceC6148j) r6
                    java.lang.Object r2 = r0.f35037g
                    R6.r.throwOnFailure(r7)
                    goto L5c
                L3e:
                    R6.r.throwOnFailure(r7)
                    q7.j r7 = r5.f35032a
                    f7.p r2 = r5.f35033b
                    r0.f35037g = r6
                    r0.f35038h = r7
                    r0.f35035e = r4
                    r4 = 6
                    kotlin.jvm.internal.InlineMarker.mark(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.InlineMarker.mark(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f35037g = r7
                    r0.f35038h = r7
                    r0.f35035e = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    R6.G r6 = R6.G.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.h.a.emit(java.lang.Object, W6.d):java.lang.Object");
            }
        }

        public h(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f35030a = interfaceC6147i;
            this.f35031b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            Object objCollect = this.f35030a.collect(new a(interfaceC6148j, this.f35031b), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$i */
    public static final class i implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ Object f35039a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC6147i f35040b;

        /* renamed from: c */
        final /* synthetic */ f7.q f35041c;

        /* renamed from: q7.A$i$a */
        public static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35042d;

            /* renamed from: e */
            int f35043e;

            /* renamed from: g */
            Object f35045g;

            /* renamed from: h */
            Object f35046h;

            /* renamed from: i */
            Object f35047i;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35042d = obj;
                this.f35043e |= Integer.MIN_VALUE;
                return i.this.collect(null, this);
            }
        }

        public i(Object obj, InterfaceC6147i interfaceC6147i, f7.q qVar) {
            this.f35039a = obj;
            this.f35040b = interfaceC6147i;
            this.f35041c = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q7.AbstractC6115A.i.a
                if (r0 == 0) goto L13
                r0 = r8
                q7.A$i$a r0 = (q7.AbstractC6115A.i.a) r0
                int r1 = r0.f35043e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35043e = r1
                goto L18
            L13:
                q7.A$i$a r0 = new q7.A$i$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f35042d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35043e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                R6.r.throwOnFailure(r8)
                goto L7b
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f35047i
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                java.lang.Object r2 = r0.f35046h
                q7.j r2 = (q7.InterfaceC6148j) r2
                java.lang.Object r4 = r0.f35045g
                q7.A$i r4 = (q7.AbstractC6115A.i) r4
                R6.r.throwOnFailure(r8)
                goto L62
            L44:
                R6.r.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                java.lang.Object r2 = r6.f35039a
                r8.element = r2
                r0.f35045g = r6
                r0.f35046h = r7
                r0.f35047i = r8
                r0.f35043e = r4
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L5f
                return r1
            L5f:
                r4 = r6
                r2 = r7
                r7 = r8
            L62:
                q7.i r8 = r4.f35040b
                q7.A$j r5 = new q7.A$j
                f7.q r4 = r4.f35041c
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.f35045g = r7
                r0.f35046h = r7
                r0.f35047i = r7
                r0.f35043e = r3
                java.lang.Object r7 = r8.collect(r5, r0)
                if (r7 != r1) goto L7b
                return r1
            L7b:
                R6.G r7 = R6.G.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.i.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.A$j */
    static final class j implements InterfaceC6148j {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f35048a;

        /* renamed from: b */
        final /* synthetic */ f7.q f35049b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC6148j f35050c;

        /* renamed from: q7.A$j$a */
        static final class a extends Y6.d {

            /* renamed from: d */
            Object f35051d;

            /* renamed from: e */
            Object f35052e;

            /* renamed from: f */
            /* synthetic */ Object f35053f;

            /* renamed from: h */
            int f35055h;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35053f = obj;
                this.f35055h |= Integer.MIN_VALUE;
                return j.this.emit(null, this);
            }
        }

        j(Ref.ObjectRef objectRef, f7.q qVar, InterfaceC6148j interfaceC6148j) {
            this.f35048a = objectRef;
            this.f35049b = qVar;
            this.f35050c = interfaceC6148j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q7.AbstractC6115A.j.a
                if (r0 == 0) goto L13
                r0 = r9
                q7.A$j$a r0 = (q7.AbstractC6115A.j.a) r0
                int r1 = r0.f35055h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35055h = r1
                goto L18
            L13:
                q7.A$j$a r0 = new q7.A$j$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f35053f
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35055h
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                R6.r.throwOnFailure(r9)
                goto L70
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f35052e
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                java.lang.Object r2 = r0.f35051d
                q7.A$j r2 = (q7.AbstractC6115A.j) r2
                R6.r.throwOnFailure(r9)
                goto L5a
            L40:
                R6.r.throwOnFailure(r9)
                kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f35048a
                f7.q r2 = r7.f35049b
                T r5 = r9.element
                r0.f35051d = r7
                r0.f35052e = r9
                r0.f35055h = r4
                java.lang.Object r8 = r2.invoke(r5, r8, r0)
                if (r8 != r1) goto L56
                return r1
            L56:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L5a:
                r8.element = r9
                q7.j r8 = r2.f35050c
                kotlin.jvm.internal.Ref$ObjectRef r9 = r2.f35048a
                T r9 = r9.element
                r2 = 0
                r0.f35051d = r2
                r0.f35052e = r2
                r0.f35055h = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L70
                return r1
            L70:
                R6.G r8 = R6.G.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.j.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.A$k */
    public static final class k implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35056a;

        /* renamed from: b */
        final /* synthetic */ f7.q f35057b;

        public k(InterfaceC6147i interfaceC6147i, f7.q qVar) {
            this.f35056a = interfaceC6147i;
            this.f35057b = qVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, s7.K] */
        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r7.u.NULL;
            Object objCollect = this.f35056a.collect(new l(objectRef, this.f35057b, interfaceC6148j), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$l */
    static final class l implements InterfaceC6148j {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f35058a;

        /* renamed from: b */
        final /* synthetic */ f7.q f35059b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC6148j f35060c;

        /* renamed from: q7.A$l$a */
        static final class a extends Y6.d {

            /* renamed from: d */
            Object f35061d;

            /* renamed from: e */
            Object f35062e;

            /* renamed from: f */
            /* synthetic */ Object f35063f;

            /* renamed from: h */
            int f35065h;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35063f = obj;
                this.f35065h |= Integer.MIN_VALUE;
                return l.this.emit(null, this);
            }
        }

        l(Ref.ObjectRef objectRef, f7.q qVar, InterfaceC6148j interfaceC6148j) {
            this.f35058a = objectRef;
            this.f35059b = qVar;
            this.f35060c = interfaceC6148j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0078 A[RETURN] */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q7.AbstractC6115A.l.a
                if (r0 == 0) goto L13
                r0 = r9
                q7.A$l$a r0 = (q7.AbstractC6115A.l.a) r0
                int r1 = r0.f35065h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35065h = r1
                goto L18
            L13:
                q7.A$l$a r0 = new q7.A$l$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f35063f
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35065h
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                R6.r.throwOnFailure(r9)
                goto L79
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f35062e
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                java.lang.Object r2 = r0.f35061d
                q7.A$l r2 = (q7.AbstractC6115A.l) r2
                R6.r.throwOnFailure(r9)
                goto L60
            L40:
                R6.r.throwOnFailure(r9)
                kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f35058a
                T r2 = r9.element
                s7.K r5 = r7.u.NULL
                if (r2 != r5) goto L4d
                r2 = r7
                goto L63
            L4d:
                f7.q r5 = r7.f35059b
                r0.f35061d = r7
                r0.f35062e = r9
                r0.f35065h = r4
                java.lang.Object r8 = r5.invoke(r2, r8, r0)
                if (r8 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L60:
                r6 = r9
                r9 = r8
                r8 = r6
            L63:
                r9.element = r8
                q7.j r8 = r2.f35060c
                kotlin.jvm.internal.Ref$ObjectRef r9 = r2.f35058a
                T r9 = r9.element
                r2 = 0
                r0.f35061d = r2
                r0.f35062e = r2
                r0.f35065h = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L79
                return r1
            L79:
                R6.G r8 = R6.G.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.l.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.A$m */
    public static final class m implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35066a;

        public m(InterfaceC6147i interfaceC6147i) {
            this.f35066a = interfaceC6147i;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            Object objCollect = this.f35066a.collect(new n(interfaceC6148j, new Ref.IntRef()), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.A$n */
    static final class n implements InterfaceC6148j {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6148j f35067a;

        /* renamed from: b */
        final /* synthetic */ Ref.IntRef f35068b;

        /* renamed from: q7.A$n$a */
        static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35069d;

            /* renamed from: f */
            int f35071f;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35069d = obj;
                this.f35071f |= Integer.MIN_VALUE;
                return n.this.emit(null, this);
            }
        }

        n(InterfaceC6148j interfaceC6148j, Ref.IntRef intRef) {
            this.f35067a = interfaceC6148j;
            this.f35068b = intRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q7.AbstractC6115A.n.a
                if (r0 == 0) goto L13
                r0 = r9
                q7.A$n$a r0 = (q7.AbstractC6115A.n.a) r0
                int r1 = r0.f35071f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35071f = r1
                goto L18
            L13:
                q7.A$n$a r0 = new q7.A$n$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f35069d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35071f
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                R6.r.throwOnFailure(r9)
                goto L4e
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                R6.r.throwOnFailure(r9)
                q7.j r9 = r7.f35067a
                S6.J r2 = new S6.J
                kotlin.jvm.internal.Ref$IntRef r4 = r7.f35068b
                int r5 = r4.element
                int r6 = r5 + 1
                r4.element = r6
                if (r5 < 0) goto L51
                r2.<init>(r5, r8)
                r0.f35071f = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                R6.G r8 = R6.G.INSTANCE
                return r8
            L51:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6115A.n.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    public static final <T> InterfaceC6147i filter(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return new a(interfaceC6147i, pVar);
    }

    public static final /* synthetic */ <R> InterfaceC6147i filterIsInstance(InterfaceC6147i interfaceC6147i) {
        Intrinsics.needClassReification();
        return new b(interfaceC6147i);
    }

    public static final <T> InterfaceC6147i filterNot(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return new d(interfaceC6147i, pVar);
    }

    public static final <T> InterfaceC6147i filterNotNull(InterfaceC6147i interfaceC6147i) {
        return new e(interfaceC6147i);
    }

    public static final <T, R> InterfaceC6147i map(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return new f(interfaceC6147i, pVar);
    }

    public static final <T, R> InterfaceC6147i mapNotNull(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return new g(interfaceC6147i, pVar);
    }

    public static final <T> InterfaceC6147i onEach(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return new h(interfaceC6147i, pVar);
    }

    public static final <T, R> InterfaceC6147i runningFold(InterfaceC6147i interfaceC6147i, R r8, f7.q qVar) {
        return new i(r8, interfaceC6147i, qVar);
    }

    public static final <T> InterfaceC6147i runningReduce(InterfaceC6147i interfaceC6147i, f7.q qVar) {
        return new k(interfaceC6147i, qVar);
    }

    public static final <T, R> InterfaceC6147i scan(InterfaceC6147i interfaceC6147i, R r8, f7.q qVar) {
        return AbstractC6149k.runningFold(interfaceC6147i, r8, qVar);
    }

    public static final <T> InterfaceC6147i withIndex(InterfaceC6147i interfaceC6147i) {
        return new m(interfaceC6147i);
    }

    public static final <R> InterfaceC6147i filterIsInstance(InterfaceC6147i interfaceC6147i, KClass<R> kClass) {
        return new c(interfaceC6147i, kClass);
    }
}
