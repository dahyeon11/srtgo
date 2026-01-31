package q7;

import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import r7.C6184a;

/* renamed from: q7.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6160v {

    /* renamed from: q7.v$a */
    static final class a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35513d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35514e;

        /* renamed from: f, reason: collision with root package name */
        int f35515f;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35514e = obj;
            this.f35515f |= Integer.MIN_VALUE;
            return AbstractC6160v.collectWhile(null, null, this);
        }
    }

    /* renamed from: q7.v$b */
    public static final class b implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.p f35516a;

        /* renamed from: q7.v$b$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f35517d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f35518e;

            /* renamed from: g, reason: collision with root package name */
            int f35520g;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35518e = obj;
                this.f35520g |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(f7.p pVar) {
            this.f35516a = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q7.AbstractC6160v.b.a
                if (r0 == 0) goto L13
                r0 = r6
                q7.v$b$a r0 = (q7.AbstractC6160v.b.a) r0
                int r1 = r0.f35520g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35520g = r1
                goto L18
            L13:
                q7.v$b$a r0 = new q7.v$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35518e
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35520g
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f35517d
                q7.v$b r5 = (q7.AbstractC6160v.b) r5
                R6.r.throwOnFailure(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                R6.r.throwOnFailure(r6)
                f7.p r6 = r4.f35516a
                r0.f35517d = r4
                r0.f35520g = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L51
                R6.G r5 = R6.G.INSTANCE
                return r5
            L51:
                r7.a r6 = new r7.a
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.b.emit(java.lang.Object, W6.d):java.lang.Object");
        }

        public Object emit$$forInline(T t8, W6.d<? super R6.G> dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            if (((Boolean) this.f35516a.invoke(t8, dVar)).booleanValue()) {
                return R6.G.INSTANCE;
            }
            throw new C6184a(this);
        }
    }

    /* renamed from: q7.v$c */
    public static final class c implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35522b;

        public c(InterfaceC6147i interfaceC6147i, int i8) {
            this.f35521a = interfaceC6147i;
            this.f35522b = i8;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            Object objCollect = this.f35521a.collect(new d(new Ref.IntRef(), this.f35522b, interfaceC6148j), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.v$d */
    static final class d implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f35523a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35524b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35525c;

        /* renamed from: q7.v$d$a */
        static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35526d;

            /* renamed from: f, reason: collision with root package name */
            int f35528f;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35526d = obj;
                this.f35528f |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        d(Ref.IntRef intRef, int i8, InterfaceC6148j interfaceC6148j) {
            this.f35523a = intRef;
            this.f35524b = i8;
            this.f35525c = interfaceC6148j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, W6.d<? super R6.G> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q7.AbstractC6160v.d.a
                if (r0 == 0) goto L13
                r0 = r7
                q7.v$d$a r0 = (q7.AbstractC6160v.d.a) r0
                int r1 = r0.f35528f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35528f = r1
                goto L18
            L13:
                q7.v$d$a r0 = new q7.v$d$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35526d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35528f
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
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f35523a
                int r2 = r7.element
                int r4 = r5.f35524b
                if (r2 < r4) goto L4a
                q7.j r7 = r5.f35525c
                r0.f35528f = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                R6.G r6 = R6.G.INSTANCE
                return r6
            L4a:
                int r2 = r2 + r3
                r7.element = r2
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.d.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.v$e */
    public static final class e implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35529a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f7.p f35530b;

        public e(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f35529a = interfaceC6147i;
            this.f35530b = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            Object objCollect = this.f35529a.collect(new f(new Ref.BooleanRef(), interfaceC6148j, this.f35530b), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.v$f */
    static final class f implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f35531a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35532b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f7.p f35533c;

        /* renamed from: q7.v$f$a */
        static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f35534d;

            /* renamed from: e, reason: collision with root package name */
            Object f35535e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f35536f;

            /* renamed from: h, reason: collision with root package name */
            int f35538h;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35536f = obj;
                this.f35538h |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        f(Ref.BooleanRef booleanRef, InterfaceC6148j interfaceC6148j, f7.p pVar) {
            this.f35531a = booleanRef;
            this.f35532b = interfaceC6148j;
            this.f35533c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q7.AbstractC6160v.f.a
                if (r0 == 0) goto L13
                r0 = r8
                q7.v$f$a r0 = (q7.AbstractC6160v.f.a) r0
                int r1 = r0.f35538h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35538h = r1
                goto L18
            L13:
                q7.v$f$a r0 = new q7.v$f$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f35536f
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35538h
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                R6.r.throwOnFailure(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f35535e
                java.lang.Object r2 = r0.f35534d
                q7.v$f r2 = (q7.AbstractC6160v.f) r2
                R6.r.throwOnFailure(r8)
                goto L6c
            L41:
                R6.r.throwOnFailure(r8)
                goto L59
            L45:
                R6.r.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f35531a
                boolean r8 = r8.element
                if (r8 == 0) goto L5c
                q7.j r8 = r6.f35532b
                r0.f35538h = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                R6.G r7 = R6.G.INSTANCE
                return r7
            L5c:
                f7.p r8 = r6.f35533c
                r0.f35534d = r6
                r0.f35535e = r7
                r0.f35538h = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f35531a
                r8.element = r5
                q7.j r8 = r2.f35532b
                r2 = 0
                r0.f35534d = r2
                r0.f35535e = r2
                r0.f35538h = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                R6.G r7 = R6.G.INSTANCE
                return r7
            L8b:
                R6.G r7 = R6.G.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.f.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.v$g */
    static final class g extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35539d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35540e;

        /* renamed from: f, reason: collision with root package name */
        int f35541f;

        g(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35540e = obj;
            this.f35541f |= Integer.MIN_VALUE;
            return AbstractC6160v.a(null, null, this);
        }
    }

    /* renamed from: q7.v$h */
    public static final class h implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35543b;

        /* renamed from: q7.v$h$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35544d;

            /* renamed from: e, reason: collision with root package name */
            int f35545e;

            /* renamed from: g, reason: collision with root package name */
            Object f35547g;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35544d = obj;
                this.f35545e |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(InterfaceC6147i interfaceC6147i, int i8) {
            this.f35542a = interfaceC6147i;
            this.f35543b = i8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q7.AbstractC6160v.h.a
                if (r0 == 0) goto L13
                r0 = r8
                q7.v$h$a r0 = (q7.AbstractC6160v.h.a) r0
                int r1 = r0.f35545e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35545e = r1
                goto L18
            L13:
                q7.v$h$a r0 = new q7.v$h$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f35544d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35545e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.f35547g
                q7.j r7 = (q7.InterfaceC6148j) r7
                R6.r.throwOnFailure(r8)     // Catch: r7.C6184a -> L2d
                goto L56
            L2d:
                r8 = move-exception
                goto L53
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                R6.r.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
                r8.<init>()
                q7.i r2 = r6.f35542a     // Catch: r7.C6184a -> L2d
                q7.v$i r4 = new q7.v$i     // Catch: r7.C6184a -> L2d
                int r5 = r6.f35543b     // Catch: r7.C6184a -> L2d
                r4.<init>(r8, r5, r7)     // Catch: r7.C6184a -> L2d
                r0.f35547g = r7     // Catch: r7.C6184a -> L2d
                r0.f35545e = r3     // Catch: r7.C6184a -> L2d
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: r7.C6184a -> L2d
                if (r7 != r1) goto L56
                return r1
            L53:
                r7.q.checkOwnership(r8, r7)
            L56:
                R6.G r7 = R6.G.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.h.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.v$i */
    static final class i implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f35548a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35549b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35550c;

        /* renamed from: q7.v$i$a */
        static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35551d;

            /* renamed from: f, reason: collision with root package name */
            int f35553f;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35551d = obj;
                this.f35553f |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        i(Ref.IntRef intRef, int i8, InterfaceC6148j interfaceC6148j) {
            this.f35548a = intRef;
            this.f35549b = i8;
            this.f35550c = interfaceC6148j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, W6.d<? super R6.G> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q7.AbstractC6160v.i.a
                if (r0 == 0) goto L13
                r0 = r7
                q7.v$i$a r0 = (q7.AbstractC6160v.i.a) r0
                int r1 = r0.f35553f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35553f = r1
                goto L18
            L13:
                q7.v$i$a r0 = new q7.v$i$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35551d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35553f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                R6.r.throwOnFailure(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                R6.r.throwOnFailure(r7)
                goto L51
            L38:
                R6.r.throwOnFailure(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f35548a
                int r2 = r7.element
                int r2 = r2 + r4
                r7.element = r2
                int r7 = r5.f35549b
                if (r2 >= r7) goto L54
                q7.j r7 = r5.f35550c
                r0.f35553f = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                R6.G r6 = R6.G.INSTANCE
                return r6
            L54:
                q7.j r7 = r5.f35550c
                r0.f35553f = r3
                java.lang.Object r6 = q7.AbstractC6160v.access$emitAbort$FlowKt__LimitKt(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.i.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.v$j */
    public static final class j implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35554a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f7.p f35555b;

        /* renamed from: q7.v$j$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35556d;

            /* renamed from: e, reason: collision with root package name */
            int f35557e;

            /* renamed from: g, reason: collision with root package name */
            Object f35559g;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35556d = obj;
                this.f35557e |= Integer.MIN_VALUE;
                return j.this.collect(null, this);
            }
        }

        public j(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f35554a = interfaceC6147i;
            this.f35555b = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r6, W6.d<? super R6.G> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q7.AbstractC6160v.j.a
                if (r0 == 0) goto L13
                r0 = r7
                q7.v$j$a r0 = (q7.AbstractC6160v.j.a) r0
                int r1 = r0.f35557e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35557e = r1
                goto L18
            L13:
                q7.v$j$a r0 = new q7.v$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35556d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35557e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f35559g
                q7.v$k r6 = (q7.AbstractC6160v.k) r6
                R6.r.throwOnFailure(r7)     // Catch: r7.C6184a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                R6.r.throwOnFailure(r7)
                q7.i r7 = r5.f35554a
                q7.v$k r2 = new q7.v$k
                f7.p r4 = r5.f35555b
                r2.<init>(r4, r6)
                r0.f35559g = r2     // Catch: r7.C6184a -> L4e
                r0.f35557e = r3     // Catch: r7.C6184a -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: r7.C6184a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                r7.q.checkOwnership(r7, r6)
            L53:
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.j.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.v$k */
    public static final class k implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.p f35560a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35561b;

        /* renamed from: q7.v$k$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f35562d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f35563e;

            /* renamed from: f, reason: collision with root package name */
            int f35564f;

            /* renamed from: h, reason: collision with root package name */
            Object f35566h;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35563e = obj;
                this.f35564f |= Integer.MIN_VALUE;
                return k.this.emit(null, this);
            }
        }

        public k(f7.p pVar, InterfaceC6148j interfaceC6148j) {
            this.f35560a = pVar;
            this.f35561b = interfaceC6148j;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q7.AbstractC6160v.k.a
                if (r0 == 0) goto L13
                r0 = r9
                q7.v$k$a r0 = (q7.AbstractC6160v.k.a) r0
                int r1 = r0.f35564f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35564f = r1
                goto L18
            L13:
                q7.v$k$a r0 = new q7.v$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f35563e
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35564f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f35562d
                q7.v$k r8 = (q7.AbstractC6160v.k) r8
                R6.r.throwOnFailure(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f35566h
                java.lang.Object r2 = r0.f35562d
                q7.v$k r2 = (q7.AbstractC6160v.k) r2
                R6.r.throwOnFailure(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                R6.r.throwOnFailure(r9)
                f7.p r9 = r7.f35560a
                r0.f35562d = r7
                r0.f35566h = r8
                r0.f35564f = r4
                r2 = 6
                kotlin.jvm.internal.InlineMarker.mark(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.InlineMarker.mark(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                q7.j r2 = r8.f35561b
                r0.f35562d = r8
                r5 = 0
                r0.f35566h = r5
                r0.f35564f = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                R6.G r8 = R6.G.INSTANCE
                return r8
            L81:
                r7.a r9 = new r7.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.k.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.v$l */
    static final class l extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f35567e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f35568f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35569g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f7.q f35570h;

        /* renamed from: q7.v$l$a */
        public static final class a implements InterfaceC6148j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f7.q f35571a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6148j f35572b;

            /* renamed from: q7.v$l$a$a, reason: collision with other inner class name */
            public static final class C0391a extends Y6.d {

                /* renamed from: d, reason: collision with root package name */
                Object f35573d;

                /* renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f35574e;

                /* renamed from: f, reason: collision with root package name */
                int f35575f;

                public C0391a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35574e = obj;
                    this.f35575f |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(f7.q qVar, InterfaceC6148j interfaceC6148j) {
                this.f35571a = qVar;
                this.f35572b = interfaceC6148j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object emit(T r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof q7.AbstractC6160v.l.a.C0391a
                    if (r0 == 0) goto L13
                    r0 = r6
                    q7.v$l$a$a r0 = (q7.AbstractC6160v.l.a.C0391a) r0
                    int r1 = r0.f35575f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35575f = r1
                    goto L18
                L13:
                    q7.v$l$a$a r0 = new q7.v$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f35574e
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35575f
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f35573d
                    q7.v$l$a r5 = (q7.AbstractC6160v.l.a) r5
                    R6.r.throwOnFailure(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    R6.r.throwOnFailure(r6)
                    f7.q r6 = r4.f35571a
                    q7.j r2 = r4.f35572b
                    r0.f35573d = r4
                    r0.f35575f = r3
                    r3 = 6
                    kotlin.jvm.internal.InlineMarker.mark(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.InlineMarker.mark(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    R6.G r5 = R6.G.INSTANCE
                    return r5
                L5b:
                    r7.a r6 = new r7.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.l.a.emit(java.lang.Object, W6.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC6147i interfaceC6147i, f7.q qVar, W6.d dVar) {
            super(2, dVar);
            this.f35569g = interfaceC6147i;
            this.f35570h = qVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            l lVar = new l(this.f35569g, this.f35570h, dVar);
            lVar.f35568f = obj;
            return lVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35567e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35568f;
                InterfaceC6147i interfaceC6147i = this.f35569g;
                a aVar2 = new a(this.f35570h, interfaceC6148j);
                try {
                    this.f35568f = aVar2;
                    this.f35567e = 1;
                    if (interfaceC6147i.collect(aVar2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (C6184a e8) {
                    e = e8;
                    aVar = aVar2;
                    r7.q.checkOwnership(e, aVar);
                    return R6.G.INSTANCE;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.f35568f;
                try {
                    R6.r.throwOnFailure(obj);
                } catch (C6184a e9) {
                    e = e9;
                    r7.q.checkOwnership(e, aVar);
                    return R6.G.INSTANCE;
                }
            }
            return R6.G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            return ((l) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(q7.InterfaceC6148j r4, java.lang.Object r5, W6.d r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof q7.AbstractC6160v.g
            if (r0 == 0) goto L13
            r0 = r6
            q7.v$g r0 = (q7.AbstractC6160v.g) r0
            int r1 = r0.f35541f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35541f = r1
            goto L18
        L13:
            q7.v$g r0 = new q7.v$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35540e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35541f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f35539d
            q7.j r4 = (q7.InterfaceC6148j) r4
            R6.r.throwOnFailure(r6)
            goto L43
        L35:
            R6.r.throwOnFailure(r6)
            r0.f35539d = r4
            r0.f35541f = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r7.a r5 = new r7.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.a(q7.j, java.lang.Object, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object collectWhile(q7.InterfaceC6147i r4, f7.p r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof q7.AbstractC6160v.a
            if (r0 == 0) goto L13
            r0 = r6
            q7.v$a r0 = (q7.AbstractC6160v.a) r0
            int r1 = r0.f35515f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35515f = r1
            goto L18
        L13:
            q7.v$a r0 = new q7.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35514e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35515f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f35513d
            q7.v$b r4 = (q7.AbstractC6160v.b) r4
            R6.r.throwOnFailure(r6)     // Catch: r7.C6184a -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            R6.r.throwOnFailure(r6)
            q7.v$b r6 = new q7.v$b
            r6.<init>(r5)
            r0.f35513d = r6     // Catch: r7.C6184a -> L4a
            r0.f35515f = r3     // Catch: r7.C6184a -> L4a
            java.lang.Object r4 = r4.collect(r6, r0)     // Catch: r7.C6184a -> L4a
            if (r4 != r1) goto L4f
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            r7.q.checkOwnership(r5, r4)
        L4f:
            R6.G r4 = R6.G.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6160v.collectWhile(q7.i, f7.p, W6.d):java.lang.Object");
    }

    public static final <T> InterfaceC6147i drop(InterfaceC6147i interfaceC6147i, int i8) {
        if (i8 >= 0) {
            return new c(interfaceC6147i, i8);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i8).toString());
    }

    public static final <T> InterfaceC6147i dropWhile(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return new e(interfaceC6147i, pVar);
    }

    public static final <T> InterfaceC6147i take(InterfaceC6147i interfaceC6147i, int i8) {
        if (i8 > 0) {
            return new h(interfaceC6147i, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " should be positive").toString());
    }

    public static final <T> InterfaceC6147i takeWhile(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return new j(interfaceC6147i, pVar);
    }

    public static final <T, R> InterfaceC6147i transformWhile(InterfaceC6147i interfaceC6147i, f7.q qVar) {
        return AbstractC6149k.flow(new l(interfaceC6147i, qVar, null));
    }
}
