package q7;

import f7.InterfaceC5519a;
import java.util.Iterator;

/* renamed from: q7.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6150l {

    /* renamed from: q7.l$a */
    public static final class a implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j7.o f35266a;

        /* renamed from: q7.l$a$a, reason: collision with other inner class name */
        public static final class C0383a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35267d;

            /* renamed from: e, reason: collision with root package name */
            int f35268e;

            /* renamed from: g, reason: collision with root package name */
            Object f35270g;

            /* renamed from: h, reason: collision with root package name */
            Object f35271h;

            public C0383a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35267d = obj;
                this.f35268e |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(j7.o oVar) {
            this.f35266a = oVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q7.AbstractC6150l.a.C0383a
                if (r0 == 0) goto L13
                r0 = r9
                q7.l$a$a r0 = (q7.AbstractC6150l.a.C0383a) r0
                int r1 = r0.f35268e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35268e = r1
                goto L18
            L13:
                q7.l$a$a r0 = new q7.l$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f35267d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35268e
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r8 = r0.f35271h
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.f35270g
                q7.j r2 = (q7.InterfaceC6148j) r2
                R6.r.throwOnFailure(r9)
                r9 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3a:
                R6.r.throwOnFailure(r9)
                j7.o r9 = r7.f35266a
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L46:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L64
                r2 = r8
                S6.N r2 = (S6.N) r2
                long r4 = r2.nextLong()
                java.lang.Long r2 = Y6.b.boxLong(r4)
                r0.f35270g = r9
                r0.f35271h = r8
                r0.f35268e = r3
                java.lang.Object r2 = r9.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                R6.G r8 = R6.G.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.a.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$b */
    public static final class b implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5519a f35272a;

        public b(InterfaceC5519a interfaceC5519a) {
            this.f35272a = interfaceC5519a;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            Object objEmit = interfaceC6148j.emit(this.f35272a.invoke(), dVar);
            return objEmit == X6.b.getCOROUTINE_SUSPENDED() ? objEmit : R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.l$c */
    public static final class c implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.l f35273a;

        /* renamed from: q7.l$c$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35274d;

            /* renamed from: e, reason: collision with root package name */
            int f35275e;

            /* renamed from: g, reason: collision with root package name */
            Object f35277g;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35274d = obj;
                this.f35275e |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(f7.l lVar) {
            this.f35273a = lVar;
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
                boolean r0 = r7 instanceof q7.AbstractC6150l.c.a
                if (r0 == 0) goto L13
                r0 = r7
                q7.l$c$a r0 = (q7.AbstractC6150l.c.a) r0
                int r1 = r0.f35275e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35275e = r1
                goto L18
            L13:
                q7.l$c$a r0 = new q7.l$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35274d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35275e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                R6.r.throwOnFailure(r7)
                goto L60
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f35277g
                q7.j r6 = (q7.InterfaceC6148j) r6
                R6.r.throwOnFailure(r7)
                goto L54
            L3c:
                R6.r.throwOnFailure(r7)
                f7.l r7 = r5.f35273a
                r0.f35277g = r6
                r0.f35275e = r4
                r2 = 6
                kotlin.jvm.internal.InlineMarker.mark(r2)
                java.lang.Object r7 = r7.invoke(r0)
                r2 = 7
                kotlin.jvm.internal.InlineMarker.mark(r2)
                if (r7 != r1) goto L54
                return r1
            L54:
                r2 = 0
                r0.f35277g = r2
                r0.f35275e = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L60
                return r1
            L60:
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.c.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$d */
    public static final class d implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f35278a;

        /* renamed from: q7.l$d$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35279d;

            /* renamed from: e, reason: collision with root package name */
            int f35280e;

            /* renamed from: g, reason: collision with root package name */
            Object f35282g;

            /* renamed from: h, reason: collision with root package name */
            Object f35283h;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35279d = obj;
                this.f35280e |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public d(Iterable iterable) {
            this.f35278a = iterable;
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
                boolean r0 = r7 instanceof q7.AbstractC6150l.d.a
                if (r0 == 0) goto L13
                r0 = r7
                q7.l$d$a r0 = (q7.AbstractC6150l.d.a) r0
                int r1 = r0.f35280e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35280e = r1
                goto L18
            L13:
                q7.l$d$a r0 = new q7.l$d$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35279d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35280e
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f35283h
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f35282g
                q7.j r2 = (q7.InterfaceC6148j) r2
                R6.r.throwOnFailure(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                R6.r.throwOnFailure(r7)
                java.lang.Iterable r7 = r5.f35278a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.f35282g = r7
                r0.f35283h = r6
                r0.f35280e = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.d.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$e */
    public static final class e implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f35284a;

        /* renamed from: q7.l$e$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35285d;

            /* renamed from: e, reason: collision with root package name */
            int f35286e;

            /* renamed from: g, reason: collision with root package name */
            Object f35288g;

            /* renamed from: h, reason: collision with root package name */
            Object f35289h;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35285d = obj;
                this.f35286e |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(Iterator it) {
            this.f35284a = it;
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
                boolean r0 = r7 instanceof q7.AbstractC6150l.e.a
                if (r0 == 0) goto L13
                r0 = r7
                q7.l$e$a r0 = (q7.AbstractC6150l.e.a) r0
                int r1 = r0.f35286e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35286e = r1
                goto L18
            L13:
                q7.l$e$a r0 = new q7.l$e$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35285d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35286e
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f35289h
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f35288g
                q7.j r2 = (q7.InterfaceC6148j) r2
                R6.r.throwOnFailure(r7)
                r7 = r2
                goto L42
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                R6.r.throwOnFailure(r7)
                java.util.Iterator r7 = r5.f35284a
                r4 = r7
                r7 = r6
                r6 = r4
            L42:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L59
                java.lang.Object r2 = r6.next()
                r0.f35288g = r7
                r0.f35289h = r6
                r0.f35286e = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L42
                return r1
            L59:
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.e.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$f */
    public static final class f implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k7.m f35290a;

        /* renamed from: q7.l$f$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35291d;

            /* renamed from: e, reason: collision with root package name */
            int f35292e;

            /* renamed from: g, reason: collision with root package name */
            Object f35294g;

            /* renamed from: h, reason: collision with root package name */
            Object f35295h;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35291d = obj;
                this.f35292e |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(k7.m mVar) {
            this.f35290a = mVar;
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
                boolean r0 = r7 instanceof q7.AbstractC6150l.f.a
                if (r0 == 0) goto L13
                r0 = r7
                q7.l$f$a r0 = (q7.AbstractC6150l.f.a) r0
                int r1 = r0.f35292e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35292e = r1
                goto L18
            L13:
                q7.l$f$a r0 = new q7.l$f$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35291d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35292e
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f35295h
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f35294g
                q7.j r2 = (q7.InterfaceC6148j) r2
                R6.r.throwOnFailure(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                R6.r.throwOnFailure(r7)
                k7.m r7 = r5.f35290a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.f35294g = r7
                r0.f35295h = r6
                r0.f35292e = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.f.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$g */
    public static final class g implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f35296a;

        /* renamed from: q7.l$g$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35297d;

            /* renamed from: e, reason: collision with root package name */
            int f35298e;

            /* renamed from: g, reason: collision with root package name */
            Object f35300g;

            /* renamed from: h, reason: collision with root package name */
            Object f35301h;

            /* renamed from: i, reason: collision with root package name */
            int f35302i;

            /* renamed from: j, reason: collision with root package name */
            int f35303j;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35297d = obj;
                this.f35298e |= Integer.MIN_VALUE;
                return g.this.collect(null, this);
            }
        }

        public g(Object[] objArr) {
            this.f35296a = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:19:0x005f). Please report as a decompilation issue!!! */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q7.AbstractC6150l.g.a
                if (r0 == 0) goto L13
                r0 = r9
                q7.l$g$a r0 = (q7.AbstractC6150l.g.a) r0
                int r1 = r0.f35298e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35298e = r1
                goto L18
            L13:
                q7.l$g$a r0 = new q7.l$g$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f35297d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35298e
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f35303j
                int r2 = r0.f35302i
                java.lang.Object r4 = r0.f35301h
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.f35300g
                q7.j r5 = (q7.InterfaceC6148j) r5
                R6.r.throwOnFailure(r9)
                r9 = r5
                goto L5f
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                R6.r.throwOnFailure(r9)
                java.lang.Object[] r9 = r7.f35296a
                int r2 = r9.length
                r4 = 0
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r4
                r4 = r6
            L4a:
                if (r2 >= r8) goto L61
                r5 = r4[r2]
                r0.f35300g = r9
                r0.f35301h = r4
                r0.f35302i = r2
                r0.f35303j = r8
                r0.f35298e = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L5f
                return r1
            L5f:
                int r2 = r2 + r3
                goto L4a
            L61:
                R6.G r8 = R6.G.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.g.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$h */
    public static final class h implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f35304a;

        /* renamed from: q7.l$h$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35305d;

            /* renamed from: e, reason: collision with root package name */
            int f35306e;

            /* renamed from: g, reason: collision with root package name */
            Object f35308g;

            /* renamed from: h, reason: collision with root package name */
            Object f35309h;

            /* renamed from: i, reason: collision with root package name */
            int f35310i;

            /* renamed from: j, reason: collision with root package name */
            int f35311j;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35305d = obj;
                this.f35306e |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(int[] iArr) {
            this.f35304a = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q7.AbstractC6150l.h.a
                if (r0 == 0) goto L13
                r0 = r9
                q7.l$h$a r0 = (q7.AbstractC6150l.h.a) r0
                int r1 = r0.f35306e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35306e = r1
                goto L18
            L13:
                q7.l$h$a r0 = new q7.l$h$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f35305d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35306e
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f35311j
                int r2 = r0.f35310i
                java.lang.Object r4 = r0.f35309h
                int[] r4 = (int[]) r4
                java.lang.Object r5 = r0.f35308g
                q7.j r5 = (q7.InterfaceC6148j) r5
                R6.r.throwOnFailure(r9)
                r9 = r5
                goto L63
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                R6.r.throwOnFailure(r9)
                int[] r9 = r7.f35304a
                int r2 = r9.length
                r4 = 0
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r4
                r4 = r6
            L4a:
                if (r2 >= r8) goto L65
                r5 = r4[r2]
                java.lang.Integer r5 = Y6.b.boxInt(r5)
                r0.f35308g = r9
                r0.f35309h = r4
                r0.f35310i = r2
                r0.f35311j = r8
                r0.f35306e = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                int r2 = r2 + r3
                goto L4a
            L65:
                R6.G r8 = R6.G.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.h.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$i */
    public static final class i implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long[] f35312a;

        /* renamed from: q7.l$i$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35313d;

            /* renamed from: e, reason: collision with root package name */
            int f35314e;

            /* renamed from: g, reason: collision with root package name */
            Object f35316g;

            /* renamed from: h, reason: collision with root package name */
            Object f35317h;

            /* renamed from: i, reason: collision with root package name */
            int f35318i;

            /* renamed from: j, reason: collision with root package name */
            int f35319j;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35313d = obj;
                this.f35314e |= Integer.MIN_VALUE;
                return i.this.collect(null, this);
            }
        }

        public i(long[] jArr) {
            this.f35312a = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r9, W6.d<? super R6.G> r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof q7.AbstractC6150l.i.a
                if (r0 == 0) goto L13
                r0 = r10
                q7.l$i$a r0 = (q7.AbstractC6150l.i.a) r0
                int r1 = r0.f35314e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35314e = r1
                goto L18
            L13:
                q7.l$i$a r0 = new q7.l$i$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f35313d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35314e
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r9 = r0.f35319j
                int r2 = r0.f35318i
                java.lang.Object r4 = r0.f35317h
                long[] r4 = (long[]) r4
                java.lang.Object r5 = r0.f35316g
                q7.j r5 = (q7.InterfaceC6148j) r5
                R6.r.throwOnFailure(r10)
                r10 = r5
                goto L63
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                R6.r.throwOnFailure(r10)
                long[] r10 = r8.f35312a
                int r2 = r10.length
                r4 = 0
                r7 = r10
                r10 = r9
                r9 = r2
                r2 = r4
                r4 = r7
            L4a:
                if (r2 >= r9) goto L65
                r5 = r4[r2]
                java.lang.Long r5 = Y6.b.boxLong(r5)
                r0.f35316g = r10
                r0.f35317h = r4
                r0.f35318i = r2
                r0.f35319j = r9
                r0.f35314e = r3
                java.lang.Object r5 = r10.emit(r5, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                int r2 = r2 + r3
                goto L4a
            L65:
                R6.G r9 = R6.G.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.i.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$j */
    public static final class j implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j7.l f35320a;

        /* renamed from: q7.l$j$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35321d;

            /* renamed from: e, reason: collision with root package name */
            int f35322e;

            /* renamed from: g, reason: collision with root package name */
            Object f35324g;

            /* renamed from: h, reason: collision with root package name */
            Object f35325h;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35321d = obj;
                this.f35322e |= Integer.MIN_VALUE;
                return j.this.collect(null, this);
            }
        }

        public j(j7.l lVar) {
            this.f35320a = lVar;
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
                boolean r0 = r7 instanceof q7.AbstractC6150l.j.a
                if (r0 == 0) goto L13
                r0 = r7
                q7.l$j$a r0 = (q7.AbstractC6150l.j.a) r0
                int r1 = r0.f35322e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35322e = r1
                goto L18
            L13:
                q7.l$j$a r0 = new q7.l$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35321d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35322e
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f35325h
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f35324g
                q7.j r2 = (q7.InterfaceC6148j) r2
                R6.r.throwOnFailure(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                R6.r.throwOnFailure(r7)
                j7.l r7 = r5.f35320a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L64
                r2 = r6
                S6.M r2 = (S6.M) r2
                int r2 = r2.nextInt()
                java.lang.Integer r2 = Y6.b.boxInt(r2)
                r0.f35324g = r7
                r0.f35325h = r6
                r0.f35322e = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.j.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$k */
    public static final class k implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f35326a;

        /* renamed from: q7.l$k$a */
        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35327d;

            /* renamed from: e, reason: collision with root package name */
            int f35328e;

            /* renamed from: g, reason: collision with root package name */
            Object f35330g;

            /* renamed from: h, reason: collision with root package name */
            Object f35331h;

            /* renamed from: i, reason: collision with root package name */
            int f35332i;

            /* renamed from: j, reason: collision with root package name */
            int f35333j;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35327d = obj;
                this.f35328e |= Integer.MIN_VALUE;
                return k.this.collect(null, this);
            }
        }

        public k(Object[] objArr) {
            this.f35326a = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q7.AbstractC6150l.k.a
                if (r0 == 0) goto L13
                r0 = r9
                q7.l$k$a r0 = (q7.AbstractC6150l.k.a) r0
                int r1 = r0.f35328e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35328e = r1
                goto L18
            L13:
                q7.l$k$a r0 = new q7.l$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f35327d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35328e
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f35333j
                int r2 = r0.f35332i
                java.lang.Object r4 = r0.f35331h
                q7.j r4 = (q7.InterfaceC6148j) r4
                java.lang.Object r5 = r0.f35330g
                q7.l$k r5 = (q7.AbstractC6150l.k) r5
                R6.r.throwOnFailure(r9)
                r9 = r4
                goto L60
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                R6.r.throwOnFailure(r9)
                java.lang.Object[] r9 = r7.f35326a
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L49:
                if (r2 >= r8) goto L62
                java.lang.Object[] r4 = r5.f35326a
                r4 = r4[r2]
                r0.f35330g = r5
                r0.f35331h = r9
                r0.f35332i = r2
                r0.f35333j = r8
                r0.f35328e = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L60
                return r1
            L60:
                int r2 = r2 + r3
                goto L49
            L62:
                R6.G r8 = R6.G.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6150l.k.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.l$l, reason: collision with other inner class name */
    public static final class C0384l implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f35334a;

        public C0384l(Object obj) {
            this.f35334a = obj;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            Object objEmit = interfaceC6148j.emit(this.f35334a, dVar);
            return objEmit == X6.b.getCOROUTINE_SUSPENDED() ? objEmit : R6.G.INSTANCE;
        }
    }

    public static final <T> InterfaceC6147i asFlow(InterfaceC5519a interfaceC5519a) {
        return new b(interfaceC5519a);
    }

    public static final <T> InterfaceC6147i callbackFlow(f7.p pVar) {
        return new C6140b(pVar, null, 0, null, 14, null);
    }

    public static final <T> InterfaceC6147i channelFlow(f7.p pVar) {
        return new C6144f(pVar, null, 0, null, 14, null);
    }

    public static final <T> InterfaceC6147i emptyFlow() {
        return C6146h.INSTANCE;
    }

    public static final <T> InterfaceC6147i flow(f7.p pVar) {
        return new C6121G(pVar);
    }

    public static final <T> InterfaceC6147i flowOf(T... tArr) {
        return new k(tArr);
    }

    public static final <T> InterfaceC6147i asFlow(f7.l lVar) {
        return new c(lVar);
    }

    public static final <T> InterfaceC6147i flowOf(T t8) {
        return new C0384l(t8);
    }

    public static final <T> InterfaceC6147i asFlow(Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    public static final <T> InterfaceC6147i asFlow(Iterator<? extends T> it) {
        return new e(it);
    }

    public static final <T> InterfaceC6147i asFlow(k7.m mVar) {
        return new f(mVar);
    }

    public static final <T> InterfaceC6147i asFlow(T[] tArr) {
        return new g(tArr);
    }

    public static final InterfaceC6147i asFlow(int[] iArr) {
        return new h(iArr);
    }

    public static final InterfaceC6147i asFlow(long[] jArr) {
        return new i(jArr);
    }

    public static final InterfaceC6147i asFlow(j7.l lVar) {
        return new j(lVar);
    }

    public static final InterfaceC6147i asFlow(j7.o oVar) {
        return new a(oVar);
    }
}
