package q7;

import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;

/* renamed from: q7.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6158t {

    /* renamed from: q7.t$a */
    static final class a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35431d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35432e;

        /* renamed from: f, reason: collision with root package name */
        int f35433f;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35432e = obj;
            this.f35433f |= Integer.MIN_VALUE;
            return AbstractC6158t.a(null, null, null, this);
        }
    }

    /* renamed from: q7.t$b */
    public static final class b implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35434a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f7.q f35435b;

        /* renamed from: q7.t$b$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35436d;

            /* renamed from: e, reason: collision with root package name */
            int f35437e;

            /* renamed from: g, reason: collision with root package name */
            Object f35439g;

            /* renamed from: h, reason: collision with root package name */
            Object f35440h;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35436d = obj;
                this.f35437e |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC6147i interfaceC6147i, f7.q qVar) {
            this.f35434a = interfaceC6147i;
            this.f35435b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r9, W6.d<? super R6.G> r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof q7.AbstractC6158t.b.a
                if (r0 == 0) goto L13
                r0 = r10
                q7.t$b$a r0 = (q7.AbstractC6158t.b.a) r0
                int r1 = r0.f35437e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35437e = r1
                goto L18
            L13:
                q7.t$b$a r0 = new q7.t$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f35436d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35437e
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f35439g
                r7.v r9 = (r7.v) r9
                R6.r.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f35439g
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                R6.r.throwOnFailure(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f35440h
                q7.j r9 = (q7.InterfaceC6148j) r9
                java.lang.Object r2 = r0.f35439g
                q7.t$b r2 = (q7.AbstractC6158t.b) r2
                R6.r.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                R6.r.throwOnFailure(r10)
                q7.i r10 = r8.f35434a     // Catch: java.lang.Throwable -> L96
                r0.f35439g = r8     // Catch: java.lang.Throwable -> L96
                r0.f35440h = r9     // Catch: java.lang.Throwable -> L96
                r0.f35437e = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                r7.v r10 = new r7.v
                W6.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                f7.q r9 = r2.f35435b     // Catch: java.lang.Throwable -> L8e
                r0.f35439g = r10     // Catch: java.lang.Throwable -> L8e
                r0.f35440h = r6     // Catch: java.lang.Throwable -> L8e
                r0.f35437e = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.InlineMarker.mark(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                R6.G r9 = R6.G.INSTANCE
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                q7.Y r10 = new q7.Y
                r10.<init>(r9)
                f7.q r2 = r2.f35435b
                r0.f35439g = r9
                r0.f35440h = r6
                r0.f35437e = r4
                java.lang.Object r10 = q7.AbstractC6158t.access$invokeSafely$FlowKt__EmittersKt(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6158t.b.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.t$c */
    public static final class c implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35441a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f7.p f35442b;

        /* renamed from: q7.t$c$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35443d;

            /* renamed from: e, reason: collision with root package name */
            int f35444e;

            /* renamed from: g, reason: collision with root package name */
            Object f35446g;

            /* renamed from: h, reason: collision with root package name */
            Object f35447h;

            /* renamed from: i, reason: collision with root package name */
            Object f35448i;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35443d = obj;
                this.f35444e |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(InterfaceC6147i interfaceC6147i, f7.p pVar) {
            this.f35441a = interfaceC6147i;
            this.f35442b = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, q7.j] */
        /* JADX WARN: Type inference failed for: r7v1, types: [r7.v] */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v7, types: [r7.v] */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q7.AbstractC6158t.c.a
                if (r0 == 0) goto L13
                r0 = r8
                q7.t$c$a r0 = (q7.AbstractC6158t.c.a) r0
                int r1 = r0.f35444e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35444e = r1
                goto L18
            L13:
                q7.t$c$a r0 = new q7.t$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f35443d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35444e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r7 = r0.f35446g
                r7.v r7 = (r7.v) r7
                R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L30
                goto L94
            L30:
                r8 = move-exception
                goto L98
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3a:
                java.lang.Object r7 = r0.f35448i
                kotlin.jvm.internal.Ref$BooleanRef r7 = (kotlin.jvm.internal.Ref.BooleanRef) r7
                java.lang.Object r2 = r0.f35447h
                q7.j r2 = (q7.InterfaceC6148j) r2
                java.lang.Object r4 = r0.f35446g
                q7.t$c r4 = (q7.AbstractC6158t.c) r4
                R6.r.throwOnFailure(r8)
                goto L6d
            L4a:
                R6.r.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
                r8.<init>()
                r8.element = r4
                q7.i r2 = r6.f35441a
                q7.t$d r5 = new q7.t$d
                r5.<init>(r8, r7)
                r0.f35446g = r6
                r0.f35447h = r7
                r0.f35448i = r8
                r0.f35444e = r4
                java.lang.Object r2 = r2.collect(r5, r0)
                if (r2 != r1) goto L6a
                return r1
            L6a:
                r4 = r6
                r2 = r7
                r7 = r8
            L6d:
                boolean r7 = r7.element
                if (r7 == 0) goto L9c
                r7.v r7 = new r7.v
                W6.g r8 = r0.getContext()
                r7.<init>(r2, r8)
                f7.p r8 = r4.f35442b     // Catch: java.lang.Throwable -> L30
                r0.f35446g = r7     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r0.f35447h = r2     // Catch: java.lang.Throwable -> L30
                r0.f35448i = r2     // Catch: java.lang.Throwable -> L30
                r0.f35444e = r3     // Catch: java.lang.Throwable -> L30
                r2 = 6
                kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L30
                r0 = 7
                kotlin.jvm.internal.InlineMarker.mark(r0)     // Catch: java.lang.Throwable -> L30
                if (r8 != r1) goto L94
                return r1
            L94:
                r7.releaseIntercepted()
                goto L9c
            L98:
                r7.releaseIntercepted()
                throw r8
            L9c:
                R6.G r7 = R6.G.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6158t.c.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.t$d */
    static final class d implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f35449a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35450b;

        /* renamed from: q7.t$d$a */
        static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35451d;

            /* renamed from: f, reason: collision with root package name */
            int f35453f;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35451d = obj;
                this.f35453f |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        d(Ref.BooleanRef booleanRef, InterfaceC6148j interfaceC6148j) {
            this.f35449a = booleanRef;
            this.f35450b = interfaceC6148j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q7.AbstractC6158t.d.a
                if (r0 == 0) goto L13
                r0 = r6
                q7.t$d$a r0 = (q7.AbstractC6158t.d.a) r0
                int r1 = r0.f35453f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35453f = r1
                goto L18
            L13:
                q7.t$d$a r0 = new q7.t$d$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35451d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35453f
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                R6.r.throwOnFailure(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                R6.r.throwOnFailure(r6)
                kotlin.jvm.internal.Ref$BooleanRef r6 = r4.f35449a
                r2 = 0
                r6.element = r2
                q7.j r6 = r4.f35450b
                r0.f35453f = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                R6.G r5 = R6.G.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6158t.d.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.t$e */
    public static final class e implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.p f35454a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35455b;

        /* renamed from: q7.t$e$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35456d;

            /* renamed from: e, reason: collision with root package name */
            int f35457e;

            /* renamed from: g, reason: collision with root package name */
            Object f35459g;

            /* renamed from: h, reason: collision with root package name */
            Object f35460h;

            /* renamed from: i, reason: collision with root package name */
            Object f35461i;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35456d = obj;
                this.f35457e |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(f7.p pVar, InterfaceC6147i interfaceC6147i) {
            this.f35454a = pVar;
            this.f35455b = interfaceC6147i;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q7.AbstractC6158t.e.a
                if (r0 == 0) goto L13
                r0 = r8
                q7.t$e$a r0 = (q7.AbstractC6158t.e.a) r0
                int r1 = r0.f35457e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35457e = r1
                goto L18
            L13:
                q7.t$e$a r0 = new q7.t$e$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f35456d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35457e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                R6.r.throwOnFailure(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f35461i
                r7.v r7 = (r7.v) r7
                java.lang.Object r2 = r0.f35460h
                q7.j r2 = (q7.InterfaceC6148j) r2
                java.lang.Object r4 = r0.f35459g
                q7.t$e r4 = (q7.AbstractC6158t.e) r4
                R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                R6.r.throwOnFailure(r8)
                r7.v r8 = new r7.v
                W6.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                f7.p r2 = r6.f35454a     // Catch: java.lang.Throwable -> L86
                r0.f35459g = r6     // Catch: java.lang.Throwable -> L86
                r0.f35460h = r7     // Catch: java.lang.Throwable -> L86
                r0.f35461i = r8     // Catch: java.lang.Throwable -> L86
                r0.f35457e = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                q7.i r7 = r4.f35455b
                r8 = 0
                r0.f35459g = r8
                r0.f35460h = r8
                r0.f35461i = r8
                r0.f35457e = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                R6.G r7 = R6.G.INSTANCE
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6158t.e.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.t$f */
    public static final class f extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f35462e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f35463f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35464g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f7.q f35465h;

        /* renamed from: q7.t$f$a */
        public static final class a implements InterfaceC6148j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f7.q f35466a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6148j f35467b;

            /* renamed from: q7.t$f$a$a, reason: collision with other inner class name */
            public static final class C0389a extends Y6.d {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f35468d;

                /* renamed from: f, reason: collision with root package name */
                int f35470f;

                public C0389a(W6.d<? super C0389a> dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35468d = obj;
                    this.f35470f |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(f7.q qVar, InterfaceC6148j interfaceC6148j) {
                this.f35466a = qVar;
                this.f35467b = interfaceC6148j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof q7.AbstractC6158t.f.a.C0389a
                    if (r0 == 0) goto L13
                    r0 = r6
                    q7.t$f$a$a r0 = (q7.AbstractC6158t.f.a.C0389a) r0
                    int r1 = r0.f35470f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35470f = r1
                    goto L18
                L13:
                    q7.t$f$a$a r0 = new q7.t$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f35468d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35470f
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
                    f7.q r6 = r4.f35466a
                    q7.j r2 = r4.f35467b
                    r0.f35470f = r3
                    java.lang.Object r5 = r6.invoke(r2, r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    R6.G r5 = R6.G.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6158t.f.a.emit(java.lang.Object, W6.d):java.lang.Object");
            }

            public final Object emit$$forInline(Object obj, W6.d<? super R6.G> dVar) {
                InlineMarker.mark(4);
                new C0389a(dVar);
                InlineMarker.mark(5);
                this.f35466a.invoke(this.f35467b, obj, dVar);
                return R6.G.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC6147i interfaceC6147i, f7.q qVar, W6.d<? super f> dVar) {
            super(2, dVar);
            this.f35464g = interfaceC6147i;
            this.f35465h = qVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            f fVar = new f(this.f35464g, this.f35465h, dVar);
            fVar.f35463f = obj;
            return fVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35462e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35463f;
                InterfaceC6147i interfaceC6147i = this.f35464g;
                a aVar = new a(this.f35465h, interfaceC6148j);
                this.f35462e = 1;
                if (interfaceC6147i.collect(aVar, this) == coroutine_suspended) {
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
            InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35463f;
            InterfaceC6147i interfaceC6147i = this.f35464g;
            a aVar = new a(this.f35465h, interfaceC6148j);
            InlineMarker.mark(0);
            interfaceC6147i.collect(aVar, this);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            return ((f) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.t$g */
    public static final class g implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35471a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f7.q f35472b;

        /* renamed from: q7.t$g$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35473d;

            /* renamed from: e, reason: collision with root package name */
            int f35474e;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35473d = obj;
                this.f35474e |= Integer.MIN_VALUE;
                return g.this.collect(null, this);
            }
        }

        public g(InterfaceC6147i interfaceC6147i, f7.q qVar) {
            this.f35471a = interfaceC6147i;
            this.f35472b = qVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            Object objCollect = this.f35471a.collect(new h(this.f35472b, interfaceC6148j), dVar);
            return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
        }

        public Object collect$$forInline(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            InterfaceC6147i interfaceC6147i = this.f35471a;
            h hVar = new h(this.f35472b, interfaceC6148j);
            InlineMarker.mark(0);
            interfaceC6147i.collect(hVar, dVar);
            InlineMarker.mark(1);
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.t$h */
    public static final class h implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.q f35476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35477b;

        /* renamed from: q7.t$h$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35478d;

            /* renamed from: f, reason: collision with root package name */
            int f35480f;

            public a(W6.d<? super a> dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35478d = obj;
                this.f35480f |= Integer.MIN_VALUE;
                return h.this.emit(null, this);
            }
        }

        public h(f7.q qVar, InterfaceC6148j interfaceC6148j) {
            this.f35476a = qVar;
            this.f35477b = interfaceC6148j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q7.AbstractC6158t.h.a
                if (r0 == 0) goto L13
                r0 = r6
                q7.t$h$a r0 = (q7.AbstractC6158t.h.a) r0
                int r1 = r0.f35480f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35480f = r1
                goto L18
            L13:
                q7.t$h$a r0 = new q7.t$h$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35478d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35480f
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
                f7.q r6 = r4.f35476a
                q7.j r2 = r4.f35477b
                r0.f35480f = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                R6.G r5 = R6.G.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6158t.h.emit(java.lang.Object, W6.d):java.lang.Object");
        }

        public final Object emit$$forInline(Object obj, W6.d<? super R6.G> dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            this.f35476a.invoke(this.f35477b, obj, dVar);
            return R6.G.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(q7.InterfaceC6148j r4, f7.q r5, java.lang.Throwable r6, W6.d r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof q7.AbstractC6158t.a
            if (r0 == 0) goto L13
            r0 = r7
            q7.t$a r0 = (q7.AbstractC6158t.a) r0
            int r1 = r0.f35433f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35433f = r1
            goto L18
        L13:
            q7.t$a r0 = new q7.t$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35432e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35433f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f35431d
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            R6.r.throwOnFailure(r7)
            r0.f35431d = r6     // Catch: java.lang.Throwable -> L2e
            r0.f35433f = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            R6.G r4 = R6.G.INSTANCE
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            R6.AbstractC0747a.addSuppressed(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6158t.a(q7.j, f7.q, java.lang.Throwable, W6.d):java.lang.Object");
    }

    public static final void ensureActive(InterfaceC6148j interfaceC6148j) {
        if (interfaceC6148j instanceof C6138Y) {
            throw ((C6138Y) interfaceC6148j).f35240e;
        }
    }

    public static final <T> InterfaceC6147i onCompletion(InterfaceC6147i interfaceC6147i, f7.q qVar) {
        return new b(interfaceC6147i, qVar);
    }

    public static final <T> InterfaceC6147i onEmpty(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return new c(interfaceC6147i, pVar);
    }

    public static final <T> InterfaceC6147i onStart(InterfaceC6147i interfaceC6147i, f7.p pVar) {
        return new e(pVar, interfaceC6147i);
    }

    public static final <T, R> InterfaceC6147i transform(InterfaceC6147i interfaceC6147i, f7.q qVar) {
        return AbstractC6149k.flow(new f(interfaceC6147i, qVar, null));
    }

    public static final <T, R> InterfaceC6147i unsafeTransform(InterfaceC6147i interfaceC6147i, f7.q qVar) {
        return new g(interfaceC6147i, qVar);
    }
}
