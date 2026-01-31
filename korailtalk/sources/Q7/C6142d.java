package q7;

/* renamed from: q7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6142d implements InterfaceC6141c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6147i f35250a;

    /* renamed from: q7.d$a */
    static final class a implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35251a;

        /* renamed from: q7.d$a$a, reason: collision with other inner class name */
        static final class C0381a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35252d;

            /* renamed from: f, reason: collision with root package name */
            int f35254f;

            C0381a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35252d = obj;
                this.f35254f |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(InterfaceC6148j interfaceC6148j) {
            this.f35251a = interfaceC6148j;
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
                boolean r0 = r6 instanceof q7.C6142d.a.C0381a
                if (r0 == 0) goto L13
                r0 = r6
                q7.d$a$a r0 = (q7.C6142d.a.C0381a) r0
                int r1 = r0.f35254f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35254f = r1
                goto L18
            L13:
                q7.d$a$a r0 = new q7.d$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f35252d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35254f
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                R6.r.throwOnFailure(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                R6.r.throwOnFailure(r6)
                W6.g r6 = r0.getContext()
                n7.AbstractC6016x0.ensureActive(r6)
                q7.j r6 = r4.f35251a
                r0.f35254f = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                R6.G r5 = R6.G.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.C6142d.a.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    public C6142d(InterfaceC6147i interfaceC6147i) {
        this.f35250a = interfaceC6147i;
    }

    @Override // q7.InterfaceC6141c, q7.InterfaceC6147i
    public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
        Object objCollect = this.f35250a.collect(new a(interfaceC6148j), dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
    }
}
