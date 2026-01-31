package q7;

import kotlin.jvm.internal.Ref;

/* renamed from: q7.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6155q {

    /* renamed from: q7.q$a */
    static final class a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35356d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35357e;

        /* renamed from: f, reason: collision with root package name */
        int f35358f;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35357e = obj;
            this.f35358f |= Integer.MIN_VALUE;
            return AbstractC6149k.count(null, this);
        }
    }

    /* renamed from: q7.q$b */
    static final class b implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f35359a;

        b(Ref.IntRef intRef) {
            this.f35359a = intRef;
        }

        @Override // q7.InterfaceC6148j
        public final Object emit(Object obj, W6.d<? super R6.G> dVar) {
            this.f35359a.element++;
            return R6.G.INSTANCE;
        }
    }

    /* renamed from: q7.q$c */
    static final class c extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35360d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35361e;

        /* renamed from: f, reason: collision with root package name */
        int f35362f;

        c(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35361e = obj;
            this.f35362f |= Integer.MIN_VALUE;
            return AbstractC6149k.count(null, null, this);
        }
    }

    /* renamed from: q7.q$d */
    static final class d implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.p f35363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f35364b;

        /* renamed from: q7.q$d$a */
        static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f35365d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f35366e;

            /* renamed from: g, reason: collision with root package name */
            int f35368g;

            a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35366e = obj;
                this.f35368g |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        d(f7.p pVar, Ref.IntRef intRef) {
            this.f35363a = pVar;
            this.f35364b = intRef;
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
                boolean r0 = r6 instanceof q7.AbstractC6155q.d.a
                if (r0 == 0) goto L13
                r0 = r6
                q7.q$d$a r0 = (q7.AbstractC6155q.d.a) r0
                int r1 = r0.f35368g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35368g = r1
                goto L18
            L13:
                q7.q$d$a r0 = new q7.q$d$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35366e
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35368g
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f35365d
                q7.q$d r5 = (q7.AbstractC6155q.d) r5
                R6.r.throwOnFailure(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                R6.r.throwOnFailure(r6)
                f7.p r6 = r4.f35363a
                r0.f35365d = r4
                r0.f35368g = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                kotlin.jvm.internal.Ref$IntRef r5 = r5.f35364b
                int r6 = r5.element
                int r6 = r6 + r3
                r5.element = r6
            L55:
                R6.G r5 = R6.G.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6155q.d.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object count(q7.InterfaceC6147i r4, W6.d<? super java.lang.Integer> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof q7.AbstractC6155q.a
            if (r0 == 0) goto L13
            r0 = r5
            q7.q$a r0 = (q7.AbstractC6155q.a) r0
            int r1 = r0.f35358f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35358f = r1
            goto L18
        L13:
            q7.q$a r0 = new q7.q$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35357e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35358f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f35356d
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            R6.r.throwOnFailure(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            R6.r.throwOnFailure(r5)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            q7.q$b r2 = new q7.q$b
            r2.<init>(r5)
            r0.f35356d = r5
            r0.f35358f = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = Y6.b.boxInt(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6155q.count(q7.i, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object count(q7.InterfaceC6147i r4, f7.p r5, W6.d<? super java.lang.Integer> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof q7.AbstractC6155q.c
            if (r0 == 0) goto L13
            r0 = r6
            q7.q$c r0 = (q7.AbstractC6155q.c) r0
            int r1 = r0.f35362f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35362f = r1
            goto L18
        L13:
            q7.q$c r0 = new q7.q$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35361e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35362f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f35360d
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            R6.r.throwOnFailure(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            R6.r.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$IntRef r6 = new kotlin.jvm.internal.Ref$IntRef
            r6.<init>()
            q7.q$d r2 = new q7.q$d
            r2.<init>(r5, r6)
            r0.f35360d = r6
            r0.f35362f = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r6
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = Y6.b.boxInt(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6155q.count(q7.i, f7.p, W6.d):java.lang.Object");
    }
}
