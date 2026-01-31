package q7;

import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import r7.C6184a;

/* renamed from: q7.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6163y {

    /* renamed from: q7.y$a */
    public static final class a implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35620a;

        public a(Ref.ObjectRef objectRef) {
            this.f35620a = objectRef;
        }

        @Override // q7.InterfaceC6148j
        public Object emit(T t8, W6.d<? super R6.G> dVar) {
            this.f35620a.element = t8;
            throw new C6184a(this);
        }
    }

    /* renamed from: q7.y$b */
    public static final class b implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.p f35621a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35622b;

        /* renamed from: q7.y$b$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f35623d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f35624e;

            /* renamed from: f, reason: collision with root package name */
            int f35625f;

            /* renamed from: h, reason: collision with root package name */
            Object f35627h;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35624e = obj;
                this.f35625f |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(f7.p pVar, Ref.ObjectRef objectRef) {
            this.f35621a = pVar;
            this.f35622b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q7.AbstractC6163y.b.a
                if (r0 == 0) goto L13
                r0 = r6
                q7.y$b$a r0 = (q7.AbstractC6163y.b.a) r0
                int r1 = r0.f35625f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35625f = r1
                goto L18
            L13:
                q7.y$b$a r0 = new q7.y$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35624e
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35625f
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f35627h
                java.lang.Object r0 = r0.f35623d
                q7.y$b r0 = (q7.AbstractC6163y.b) r0
                R6.r.throwOnFailure(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                R6.r.throwOnFailure(r6)
                f7.p r6 = r4.f35621a
                r0.f35623d = r4
                r0.f35627h = r5
                r0.f35625f = r3
                r2 = 6
                kotlin.jvm.internal.InlineMarker.mark(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.InlineMarker.mark(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                R6.G r5 = R6.G.INSTANCE
                return r5
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f35622b
                r6.element = r5
                r7.a r5 = new r7.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.b.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.y$c */
    static final class c extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35628d;

        /* renamed from: e, reason: collision with root package name */
        Object f35629e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f35630f;

        /* renamed from: g, reason: collision with root package name */
        int f35631g;

        c(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35630f = obj;
            this.f35631g |= Integer.MIN_VALUE;
            return AbstractC6149k.first(null, this);
        }
    }

    /* renamed from: q7.y$d */
    static final class d extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35632d;

        /* renamed from: e, reason: collision with root package name */
        Object f35633e;

        /* renamed from: f, reason: collision with root package name */
        Object f35634f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f35635g;

        /* renamed from: h, reason: collision with root package name */
        int f35636h;

        d(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35635g = obj;
            this.f35636h |= Integer.MIN_VALUE;
            return AbstractC6149k.first(null, null, this);
        }
    }

    /* renamed from: q7.y$e */
    public static final class e implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35637a;

        public e(Ref.ObjectRef objectRef) {
            this.f35637a = objectRef;
        }

        @Override // q7.InterfaceC6148j
        public Object emit(T t8, W6.d<? super R6.G> dVar) {
            this.f35637a.element = t8;
            throw new C6184a(this);
        }
    }

    /* renamed from: q7.y$f */
    public static final class f implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.p f35638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35639b;

        /* renamed from: q7.y$f$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f35640d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f35641e;

            /* renamed from: f, reason: collision with root package name */
            int f35642f;

            /* renamed from: h, reason: collision with root package name */
            Object f35644h;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35641e = obj;
                this.f35642f |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(f7.p pVar, Ref.ObjectRef objectRef) {
            this.f35638a = pVar;
            this.f35639b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q7.AbstractC6163y.f.a
                if (r0 == 0) goto L13
                r0 = r6
                q7.y$f$a r0 = (q7.AbstractC6163y.f.a) r0
                int r1 = r0.f35642f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35642f = r1
                goto L18
            L13:
                q7.y$f$a r0 = new q7.y$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35641e
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35642f
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f35644h
                java.lang.Object r0 = r0.f35640d
                q7.y$f r0 = (q7.AbstractC6163y.f) r0
                R6.r.throwOnFailure(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                R6.r.throwOnFailure(r6)
                f7.p r6 = r4.f35638a
                r0.f35640d = r4
                r0.f35644h = r5
                r0.f35642f = r3
                r2 = 6
                kotlin.jvm.internal.InlineMarker.mark(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.InlineMarker.mark(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                R6.G r5 = R6.G.INSTANCE
                return r5
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f35639b
                r6.element = r5
                r7.a r5 = new r7.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.f.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.y$g */
    static final class g extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35645d;

        /* renamed from: e, reason: collision with root package name */
        Object f35646e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f35647f;

        /* renamed from: g, reason: collision with root package name */
        int f35648g;

        g(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35647f = obj;
            this.f35648g |= Integer.MIN_VALUE;
            return AbstractC6149k.firstOrNull(null, this);
        }
    }

    /* renamed from: q7.y$h */
    static final class h extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35649d;

        /* renamed from: e, reason: collision with root package name */
        Object f35650e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f35651f;

        /* renamed from: g, reason: collision with root package name */
        int f35652g;

        h(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35651f = obj;
            this.f35652g |= Integer.MIN_VALUE;
            return AbstractC6149k.firstOrNull(null, null, this);
        }
    }

    /* renamed from: q7.y$i */
    static final class i extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35653d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35654e;

        /* renamed from: f, reason: collision with root package name */
        int f35655f;

        i(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35654e = obj;
            this.f35655f |= Integer.MIN_VALUE;
            return AbstractC6163y.fold(null, null, null, this);
        }
    }

    /* renamed from: q7.y$j */
    public static final class j implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35656a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f7.q f35657b;

        /* renamed from: q7.y$j$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f35658d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f35659e;

            /* renamed from: g, reason: collision with root package name */
            int f35661g;

            public a(W6.d<? super a> dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35659e = obj;
                this.f35661g |= Integer.MIN_VALUE;
                return j.this.emit(null, this);
            }
        }

        public j(Ref.ObjectRef<Object> objectRef, f7.q qVar) {
            this.f35656a = objectRef;
            this.f35657b = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q7.AbstractC6163y.j.a
                if (r0 == 0) goto L13
                r0 = r8
                q7.y$j$a r0 = (q7.AbstractC6163y.j.a) r0
                int r1 = r0.f35661g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35661g = r1
                goto L18
            L13:
                q7.y$j$a r0 = new q7.y$j$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f35659e
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35661g
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f35658d
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                R6.r.throwOnFailure(r8)
                goto L4c
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                R6.r.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$ObjectRef r8 = r6.f35656a
                f7.q r2 = r6.f35657b
                T r4 = r8.element
                r0.f35658d = r8
                r0.f35661g = r3
                java.lang.Object r7 = r2.invoke(r4, r7, r0)
                if (r7 != r1) goto L49
                return r1
            L49:
                r5 = r8
                r8 = r7
                r7 = r5
            L4c:
                r7.element = r8
                R6.G r7 = R6.G.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.j.emit(java.lang.Object, W6.d):java.lang.Object");
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
        public final Object emit$$forInline(Object obj, W6.d<? super R6.G> dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            Ref.ObjectRef objectRef = this.f35656a;
            objectRef.element = this.f35657b.invoke(objectRef.element, obj, dVar);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.y$k */
    static final class k extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35662d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35663e;

        /* renamed from: f, reason: collision with root package name */
        int f35664f;

        k(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35663e = obj;
            this.f35664f |= Integer.MIN_VALUE;
            return AbstractC6149k.last(null, this);
        }
    }

    /* renamed from: q7.y$l */
    static final class l implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35665a;

        l(Ref.ObjectRef objectRef) {
            this.f35665a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q7.InterfaceC6148j
        public final Object emit(Object obj, W6.d<? super R6.G> dVar) {
            this.f35665a.element = obj;
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.y$m */
    static final class m extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35666d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35667e;

        /* renamed from: f, reason: collision with root package name */
        int f35668f;

        m(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35667e = obj;
            this.f35668f |= Integer.MIN_VALUE;
            return AbstractC6149k.lastOrNull(null, this);
        }
    }

    /* renamed from: q7.y$n */
    static final class n implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35669a;

        n(Ref.ObjectRef objectRef) {
            this.f35669a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q7.InterfaceC6148j
        public final Object emit(Object obj, W6.d<? super R6.G> dVar) {
            this.f35669a.element = obj;
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.y$o */
    static final class o extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35670d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35671e;

        /* renamed from: f, reason: collision with root package name */
        int f35672f;

        o(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35671e = obj;
            this.f35672f |= Integer.MIN_VALUE;
            return AbstractC6149k.reduce(null, null, this);
        }
    }

    /* renamed from: q7.y$p */
    static final class p implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35673a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f7.q f35674b;

        /* renamed from: q7.y$p$a */
        static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f35675d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f35676e;

            /* renamed from: g, reason: collision with root package name */
            int f35678g;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35676e = obj;
                this.f35678g |= Integer.MIN_VALUE;
                return p.this.emit(null, this);
            }
        }

        p(Ref.ObjectRef objectRef, f7.q qVar) {
            this.f35673a = objectRef;
            this.f35674b = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q7.AbstractC6163y.p.a
                if (r0 == 0) goto L13
                r0 = r8
                q7.y$p$a r0 = (q7.AbstractC6163y.p.a) r0
                int r1 = r0.f35678g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35678g = r1
                goto L18
            L13:
                q7.y$p$a r0 = new q7.y$p$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f35676e
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35678g
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f35675d
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                R6.r.throwOnFailure(r8)
                goto L50
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                R6.r.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$ObjectRef r8 = r6.f35673a
                T r2 = r8.element
                s7.K r4 = r7.u.NULL
                if (r2 == r4) goto L53
                f7.q r4 = r6.f35674b
                r0.f35675d = r8
                r0.f35678g = r3
                java.lang.Object r7 = r4.invoke(r2, r7, r0)
                if (r7 != r1) goto L4d
                return r1
            L4d:
                r5 = r8
                r8 = r7
                r7 = r5
            L50:
                r5 = r8
                r8 = r7
                r7 = r5
            L53:
                r8.element = r7
                R6.G r7 = R6.G.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.p.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.y$q */
    static final class q extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35679d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35680e;

        /* renamed from: f, reason: collision with root package name */
        int f35681f;

        q(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35680e = obj;
            this.f35681f |= Integer.MIN_VALUE;
            return AbstractC6149k.single(null, this);
        }
    }

    /* renamed from: q7.y$r */
    static final class r implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35682a;

        r(Ref.ObjectRef objectRef) {
            this.f35682a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q7.InterfaceC6148j
        public final Object emit(Object obj, W6.d<? super R6.G> dVar) {
            Ref.ObjectRef objectRef = this.f35682a;
            if (objectRef.element != r7.u.NULL) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            objectRef.element = obj;
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.y$s */
    public static final class s implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35683a;

        public s(Ref.ObjectRef objectRef) {
            this.f35683a = objectRef;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, s7.K] */
        @Override // q7.InterfaceC6148j
        public Object emit(T t8, W6.d<? super R6.G> dVar) {
            Ref.ObjectRef objectRef = this.f35683a;
            T t9 = objectRef.element;
            ?? r12 = r7.u.NULL;
            if (t9 == r12) {
                objectRef.element = t8;
                return R6.G.INSTANCE;
            }
            objectRef.element = r12;
            throw new C6184a(this);
        }
    }

    /* renamed from: q7.y$t */
    static final class t extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35684d;

        /* renamed from: e, reason: collision with root package name */
        Object f35685e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f35686f;

        /* renamed from: g, reason: collision with root package name */
        int f35687g;

        t(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35686f = obj;
            this.f35687g |= Integer.MIN_VALUE;
            return AbstractC6149k.singleOrNull(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object first(q7.InterfaceC6147i r4, W6.d<? super T> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof q7.AbstractC6163y.c
            if (r0 == 0) goto L13
            r0 = r5
            q7.y$c r0 = (q7.AbstractC6163y.c) r0
            int r1 = r0.f35631g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35631g = r1
            goto L18
        L13:
            q7.y$c r0 = new q7.y$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35630f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35631g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f35629e
            q7.y$a r4 = (q7.AbstractC6163y.a) r4
            java.lang.Object r0 = r0.f35628d
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            R6.r.throwOnFailure(r5)     // Catch: r7.C6184a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            R6.r.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            s7.K r2 = r7.u.NULL
            r5.element = r2
            q7.y$a r2 = new q7.y$a
            r2.<init>(r5)
            r0.f35628d = r5     // Catch: r7.C6184a -> L5b
            r0.f35629e = r2     // Catch: r7.C6184a -> L5b
            r0.f35631g = r3     // Catch: r7.C6184a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: r7.C6184a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            r7.q.checkOwnership(r5, r4)
        L62:
            T r4 = r0.element
            s7.K r5 = r7.u.NULL
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.first(q7.i, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object firstOrNull(q7.InterfaceC6147i r4, W6.d<? super T> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof q7.AbstractC6163y.g
            if (r0 == 0) goto L13
            r0 = r5
            q7.y$g r0 = (q7.AbstractC6163y.g) r0
            int r1 = r0.f35648g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35648g = r1
            goto L18
        L13:
            q7.y$g r0 = new q7.y$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35647f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35648g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f35646e
            q7.y$e r4 = (q7.AbstractC6163y.e) r4
            java.lang.Object r0 = r0.f35645d
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            R6.r.throwOnFailure(r5)     // Catch: r7.C6184a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            R6.r.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            q7.y$e r2 = new q7.y$e
            r2.<init>(r5)
            r0.f35645d = r5     // Catch: r7.C6184a -> L57
            r0.f35646e = r2     // Catch: r7.C6184a -> L57
            r0.f35648g = r3     // Catch: r7.C6184a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: r7.C6184a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            r7.q.checkOwnership(r5, r4)
        L5e:
            T r4 = r0.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.firstOrNull(q7.i, W6.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, R> java.lang.Object fold(q7.InterfaceC6147i r4, R r5, f7.q r6, W6.d<? super R> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof q7.AbstractC6163y.i
            if (r0 == 0) goto L13
            r0 = r7
            q7.y$i r0 = (q7.AbstractC6163y.i) r0
            int r1 = r0.f35655f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35655f = r1
            goto L18
        L13:
            q7.y$i r0 = new q7.y$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35654e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35655f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f35653d
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            R6.r.throwOnFailure(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            R6.r.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.element = r5
            q7.y$j r5 = new q7.y$j
            r5.<init>(r7, r6)
            r0.f35653d = r7
            r0.f35655f = r3
            java.lang.Object r4 = r4.collect(r5, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r7
        L50:
            T r4 = r4.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.fold(q7.i, java.lang.Object, f7.q, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object last(q7.InterfaceC6147i r4, W6.d<? super T> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof q7.AbstractC6163y.k
            if (r0 == 0) goto L13
            r0 = r5
            q7.y$k r0 = (q7.AbstractC6163y.k) r0
            int r1 = r0.f35664f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35664f = r1
            goto L18
        L13:
            q7.y$k r0 = new q7.y$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35663e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35664f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f35662d
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            R6.r.throwOnFailure(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            R6.r.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            s7.K r2 = r7.u.NULL
            r5.element = r2
            q7.y$l r2 = new q7.y$l
            r2.<init>(r5)
            r0.f35662d = r5
            r0.f35664f = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.element
            s7.K r5 = r7.u.NULL
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.last(q7.i, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object lastOrNull(q7.InterfaceC6147i r4, W6.d<? super T> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof q7.AbstractC6163y.m
            if (r0 == 0) goto L13
            r0 = r5
            q7.y$m r0 = (q7.AbstractC6163y.m) r0
            int r1 = r0.f35668f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35668f = r1
            goto L18
        L13:
            q7.y$m r0 = new q7.y$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35667e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35668f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f35666d
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            R6.r.throwOnFailure(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            R6.r.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            q7.y$n r2 = new q7.y$n
            r2.<init>(r5)
            r0.f35666d = r5
            r0.f35668f = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            T r4 = r4.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.lastOrNull(q7.i, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, s7.K] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S, T extends S> java.lang.Object reduce(q7.InterfaceC6147i r4, f7.q r5, W6.d<? super S> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof q7.AbstractC6163y.o
            if (r0 == 0) goto L13
            r0 = r6
            q7.y$o r0 = (q7.AbstractC6163y.o) r0
            int r1 = r0.f35672f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35672f = r1
            goto L18
        L13:
            q7.y$o r0 = new q7.y$o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35671e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35672f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f35670d
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            R6.r.throwOnFailure(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            R6.r.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            s7.K r2 = r7.u.NULL
            r6.element = r2
            q7.y$p r2 = new q7.y$p
            r2.<init>(r6, r5)
            r0.f35670d = r6
            r0.f35672f = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r6
        L52:
            T r4 = r4.element
            s7.K r5 = r7.u.NULL
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Empty flow can't be reduced"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.reduce(q7.i, f7.q, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object single(q7.InterfaceC6147i r4, W6.d<? super T> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof q7.AbstractC6163y.q
            if (r0 == 0) goto L13
            r0 = r5
            q7.y$q r0 = (q7.AbstractC6163y.q) r0
            int r1 = r0.f35681f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35681f = r1
            goto L18
        L13:
            q7.y$q r0 = new q7.y$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35680e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35681f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f35679d
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            R6.r.throwOnFailure(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            R6.r.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            s7.K r2 = r7.u.NULL
            r5.element = r2
            q7.y$r r2 = new q7.y$r
            r2.<init>(r5)
            r0.f35679d = r5
            r0.f35681f = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.element
            s7.K r5 = r7.u.NULL
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.single(q7.i, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object singleOrNull(q7.InterfaceC6147i r4, W6.d<? super T> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof q7.AbstractC6163y.t
            if (r0 == 0) goto L13
            r0 = r5
            q7.y$t r0 = (q7.AbstractC6163y.t) r0
            int r1 = r0.f35687g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35687g = r1
            goto L18
        L13:
            q7.y$t r0 = new q7.y$t
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35686f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35687g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f35685e
            q7.y$s r4 = (q7.AbstractC6163y.s) r4
            java.lang.Object r0 = r0.f35684d
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            R6.r.throwOnFailure(r5)     // Catch: r7.C6184a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            R6.r.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            s7.K r2 = r7.u.NULL
            r5.element = r2
            q7.y$s r2 = new q7.y$s
            r2.<init>(r5)
            r0.f35684d = r5     // Catch: r7.C6184a -> L5b
            r0.f35685e = r2     // Catch: r7.C6184a -> L5b
            r0.f35687g = r3     // Catch: r7.C6184a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: r7.C6184a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            r7.q.checkOwnership(r5, r4)
        L62:
            T r4 = r0.element
            s7.K r5 = r7.u.NULL
            if (r4 != r5) goto L69
            r4 = 0
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.singleOrNull(q7.i, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object first(q7.InterfaceC6147i r4, f7.p r5, W6.d<? super T> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof q7.AbstractC6163y.d
            if (r0 == 0) goto L13
            r0 = r6
            q7.y$d r0 = (q7.AbstractC6163y.d) r0
            int r1 = r0.f35636h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35636h = r1
            goto L18
        L13:
            q7.y$d r0 = new q7.y$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35635g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35636h
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f35634f
            q7.y$b r4 = (q7.AbstractC6163y.b) r4
            java.lang.Object r5 = r0.f35633e
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r0 = r0.f35632d
            f7.p r0 = (f7.p) r0
            R6.r.throwOnFailure(r6)     // Catch: r7.C6184a -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            R6.r.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            s7.K r2 = r7.u.NULL
            r6.element = r2
            q7.y$b r2 = new q7.y$b
            r2.<init>(r5, r6)
            r0.f35632d = r5     // Catch: r7.C6184a -> L62
            r0.f35633e = r6     // Catch: r7.C6184a -> L62
            r0.f35634f = r2     // Catch: r7.C6184a -> L62
            r0.f35636h = r3     // Catch: r7.C6184a -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: r7.C6184a -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            r7.q.checkOwnership(r6, r4)
        L6a:
            T r4 = r5.element
            s7.K r5 = r7.u.NULL
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.first(q7.i, f7.p, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object firstOrNull(q7.InterfaceC6147i r4, f7.p r5, W6.d<? super T> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof q7.AbstractC6163y.h
            if (r0 == 0) goto L13
            r0 = r6
            q7.y$h r0 = (q7.AbstractC6163y.h) r0
            int r1 = r0.f35652g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35652g = r1
            goto L18
        L13:
            q7.y$h r0 = new q7.y$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35651f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35652g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f35650e
            q7.y$f r4 = (q7.AbstractC6163y.f) r4
            java.lang.Object r5 = r0.f35649d
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            R6.r.throwOnFailure(r6)     // Catch: r7.C6184a -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            R6.r.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            q7.y$f r2 = new q7.y$f
            r2.<init>(r5, r6)
            r0.f35649d = r6     // Catch: r7.C6184a -> L57
            r0.f35650e = r2     // Catch: r7.C6184a -> L57
            r0.f35652g = r3     // Catch: r7.C6184a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: r7.C6184a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            r7.q.checkOwnership(r6, r4)
        L5e:
            T r4 = r5.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6163y.firstOrNull(q7.i, f7.p, W6.d):java.lang.Object");
    }
}
