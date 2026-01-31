package q7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import n7.InterfaceC6008t0;

/* renamed from: q7.u */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6159u {

    /* renamed from: q7.u$a */
    public static final class a implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35481a;

        /* renamed from: b */
        final /* synthetic */ f7.q f35482b;

        /* renamed from: q7.u$a$a */
        public static final class C0390a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35483d;

            /* renamed from: e */
            int f35484e;

            /* renamed from: g */
            Object f35486g;

            /* renamed from: h */
            Object f35487h;

            public C0390a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35483d = obj;
                this.f35484e |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(InterfaceC6147i interfaceC6147i, f7.q qVar) {
            this.f35481a = interfaceC6147i;
            this.f35482b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r6, W6.d<? super R6.G> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q7.AbstractC6159u.a.C0390a
                if (r0 == 0) goto L13
                r0 = r7
                q7.u$a$a r0 = (q7.AbstractC6159u.a.C0390a) r0
                int r1 = r0.f35484e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35484e = r1
                goto L18
            L13:
                q7.u$a$a r0 = new q7.u$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35483d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35484e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                R6.r.throwOnFailure(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f35487h
                q7.j r6 = (q7.InterfaceC6148j) r6
                java.lang.Object r2 = r0.f35486g
                q7.u$a r2 = (q7.AbstractC6159u.a) r2
                R6.r.throwOnFailure(r7)
                goto L53
            L40:
                R6.r.throwOnFailure(r7)
                q7.i r7 = r5.f35481a
                r0.f35486g = r5
                r0.f35487h = r6
                r0.f35484e = r4
                java.lang.Object r7 = q7.AbstractC6149k.catchImpl(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                f7.q r2 = r2.f35482b
                r4 = 0
                r0.f35486g = r4
                r0.f35487h = r4
                r0.f35484e = r3
                r3 = 6
                kotlin.jvm.internal.InlineMarker.mark(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.InlineMarker.mark(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6159u.a.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.u$b */
    static final class b extends Y6.d {

        /* renamed from: d */
        Object f35488d;

        /* renamed from: e */
        /* synthetic */ Object f35489e;

        /* renamed from: f */
        int f35490f;

        b(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35489e = obj;
            this.f35490f |= Integer.MIN_VALUE;
            return AbstractC6149k.catchImpl(null, null, this);
        }
    }

    /* renamed from: q7.u$c */
    static final class c implements InterfaceC6148j {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6148j f35491a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f35492b;

        /* renamed from: q7.u$c$a */
        static final class a extends Y6.d {

            /* renamed from: d */
            Object f35493d;

            /* renamed from: e */
            /* synthetic */ Object f35494e;

            /* renamed from: g */
            int f35496g;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35494e = obj;
                this.f35496g |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        c(InterfaceC6148j interfaceC6148j, Ref.ObjectRef objectRef) {
            this.f35491a = interfaceC6148j;
            this.f35492b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable] */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q7.AbstractC6159u.c.a
                if (r0 == 0) goto L13
                r0 = r6
                q7.u$c$a r0 = (q7.AbstractC6159u.c.a) r0
                int r1 = r0.f35496g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35496g = r1
                goto L18
            L13:
                q7.u$c$a r0 = new q7.u$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35494e
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35496g
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f35493d
                q7.u$c r5 = (q7.AbstractC6159u.c) r5
                R6.r.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                R6.r.throwOnFailure(r6)
                q7.j r6 = r4.f35491a     // Catch: java.lang.Throwable -> L4a
                r0.f35493d = r4     // Catch: java.lang.Throwable -> L4a
                r0.f35496g = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                R6.G r5 = R6.G.INSTANCE
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.Ref$ObjectRef r5 = r5.f35492b
                r5.element = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6159u.c.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* renamed from: q7.u$d */
    static final class d extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35497e;

        d(W6.d dVar) {
            super(2, dVar);
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            return new d(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            X6.b.getCOROUTINE_SUSPENDED();
            if (this.f35497e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R6.r.throwOnFailure(obj);
            return Y6.b.boxBoolean(true);
        }

        @Override // f7.p
        public final Object invoke(Throwable th, W6.d<? super Boolean> dVar) {
            return ((d) create(th, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.u$e */
    static final class e extends Y6.l implements f7.r {

        /* renamed from: e */
        int f35498e;

        /* renamed from: f */
        /* synthetic */ Object f35499f;

        /* renamed from: g */
        /* synthetic */ long f35500g;

        /* renamed from: h */
        final /* synthetic */ long f35501h;

        /* renamed from: i */
        final /* synthetic */ f7.p f35502i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j8, f7.p pVar, W6.d dVar) {
            super(4, dVar);
            this.f35501h = j8;
            this.f35502i = pVar;
        }

        @Override // f7.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((InterfaceC6148j) obj, (Throwable) obj2, ((Number) obj3).longValue(), (W6.d<? super Boolean>) obj4);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35498e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                Throwable th = (Throwable) this.f35499f;
                if (this.f35500g < this.f35501h) {
                    f7.p pVar = this.f35502i;
                    this.f35498e = 1;
                    obj = pVar.invoke(th, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Y6.b.boxBoolean(z);
            }
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R6.r.throwOnFailure(obj);
            boolean z8 = ((Boolean) obj).booleanValue();
            return Y6.b.boxBoolean(z8);
        }

        public final Object invoke(InterfaceC6148j interfaceC6148j, Throwable th, long j8, W6.d<? super Boolean> dVar) {
            e eVar = new e(this.f35501h, this.f35502i, dVar);
            eVar.f35499f = th;
            eVar.f35500g = j8;
            return eVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.u$f */
    public static final class f implements InterfaceC6147i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6147i f35503a;

        /* renamed from: b */
        final /* synthetic */ f7.r f35504b;

        /* renamed from: q7.u$f$a */
        public static final class a extends Y6.d {

            /* renamed from: d */
            /* synthetic */ Object f35505d;

            /* renamed from: e */
            int f35506e;

            /* renamed from: g */
            Object f35508g;

            /* renamed from: h */
            Object f35509h;

            /* renamed from: i */
            Object f35510i;

            /* renamed from: j */
            long f35511j;

            /* renamed from: k */
            int f35512k;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35505d = obj;
                this.f35506e |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC6147i interfaceC6147i, f7.r rVar) {
            this.f35503a = interfaceC6147i;
            this.f35504b = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00ae  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0076 -> B:66:0x00a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0097 -> B:63:0x009a). Please report as a decompilation issue!!! */
        @Override // q7.InterfaceC6147i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q7.InterfaceC6148j r12, W6.d<? super R6.G> r13) throws java.lang.Throwable {
            /*
                r11 = this;
                boolean r0 = r13 instanceof q7.AbstractC6159u.f.a
                if (r0 == 0) goto L13
                r0 = r13
                q7.u$f$a r0 = (q7.AbstractC6159u.f.a) r0
                int r1 = r0.f35506e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35506e = r1
                goto L18
            L13:
                q7.u$f$a r0 = new q7.u$f$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f35505d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35506e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.f35511j
                java.lang.Object r12 = r0.f35510i
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f35509h
                q7.j r2 = (q7.InterfaceC6148j) r2
                java.lang.Object r7 = r0.f35508g
                q7.u$f r7 = (q7.AbstractC6159u.f) r7
                R6.r.throwOnFailure(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.f35512k
                long r5 = r0.f35511j
                java.lang.Object r2 = r0.f35509h
                q7.j r2 = (q7.InterfaceC6148j) r2
                java.lang.Object r7 = r0.f35508g
                q7.u$f r7 = (q7.AbstractC6159u.f) r7
                R6.r.throwOnFailure(r13)
                goto L74
            L52:
                R6.r.throwOnFailure(r13)
                r5 = 0
                r13 = r11
            L58:
                q7.i r2 = r13.f35503a
                r0.f35508g = r13
                r0.f35509h = r12
                r7 = 0
                r0.f35510i = r7
                r0.f35511j = r5
                r7 = 0
                r0.f35512k = r7
                r0.f35506e = r4
                java.lang.Object r2 = q7.AbstractC6149k.catchImpl(r2, r12, r0)
                if (r2 != r1) goto L6f
                return r1
            L6f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L74:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto La6
                f7.r r12 = r7.f35504b
                java.lang.Long r8 = Y6.b.boxLong(r5)
                r0.f35508g = r7
                r0.f35509h = r2
                r0.f35510i = r13
                r0.f35511j = r5
                r0.f35506e = r3
                r9 = 6
                kotlin.jvm.internal.InlineMarker.mark(r9)
                java.lang.Object r12 = r12.invoke(r2, r13, r8, r0)
                r8 = 7
                kotlin.jvm.internal.InlineMarker.mark(r8)
                if (r12 != r1) goto L97
                return r1
            L97:
                r10 = r13
                r13 = r12
                r12 = r10
            L9a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La8
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
            La6:
                r13 = r7
                goto La9
            La8:
                throw r12
            La9:
                if (r12 != 0) goto Lae
                R6.G r12 = R6.G.INSTANCE
                return r12
            Lae:
                r12 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6159u.f.collect(q7.j, W6.d):java.lang.Object");
        }
    }

    private static final boolean a(Throwable th, W6.g gVar) {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) gVar.get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 == null || !interfaceC6008t0.isCancelled()) {
            return false;
        }
        return b(th, interfaceC6008t0.getCancellationException());
    }

    private static final boolean b(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.areEqual(th2, th);
    }

    /* renamed from: catch */
    public static final <T> InterfaceC6147i m567catch(InterfaceC6147i interfaceC6147i, f7.q qVar) {
        return new a(interfaceC6147i, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object catchImpl(q7.InterfaceC6147i r4, q7.InterfaceC6148j r5, W6.d<? super java.lang.Throwable> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof q7.AbstractC6159u.b
            if (r0 == 0) goto L13
            r0 = r6
            q7.u$b r0 = (q7.AbstractC6159u.b) r0
            int r1 = r0.f35490f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35490f = r1
            goto L18
        L13:
            q7.u$b r0 = new q7.u$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35489e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35490f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f35488d
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            R6.r.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            R6.r.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            q7.u$c r2 = new q7.u$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f35488d = r6     // Catch: java.lang.Throwable -> L51
            r0.f35490f = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = b(r5, r4)
            if (r6 != 0) goto L76
            W6.g r6 = r0.getContext()
            boolean r6 = a(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            R6.AbstractC0747a.addSuppressed(r4, r5)
            throw r4
        L72:
            R6.AbstractC0747a.addSuppressed(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6159u.catchImpl(q7.i, q7.j, W6.d):java.lang.Object");
    }

    public static final <T> InterfaceC6147i retry(InterfaceC6147i interfaceC6147i, long j8, f7.p pVar) {
        if (j8 > 0) {
            return AbstractC6149k.retryWhen(interfaceC6147i, new e(j8, pVar, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j8).toString());
    }

    public static /* synthetic */ InterfaceC6147i retry$default(InterfaceC6147i interfaceC6147i, long j8, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = Long.MAX_VALUE;
        }
        if ((i8 & 2) != 0) {
            pVar = new d(null);
        }
        return AbstractC6149k.retry(interfaceC6147i, j8, pVar);
    }

    public static final <T> InterfaceC6147i retryWhen(InterfaceC6147i interfaceC6147i, f7.r rVar) {
        return new f(interfaceC6147i, rVar);
    }
}
