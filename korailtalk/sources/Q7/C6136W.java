package q7;

/* renamed from: q7.W, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6136W implements InterfaceC6148j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6148j f35228a;

    /* renamed from: b, reason: collision with root package name */
    private final f7.p f35229b;

    /* renamed from: q7.W$a */
    static final class a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35230d;

        /* renamed from: e, reason: collision with root package name */
        Object f35231e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f35232f;

        /* renamed from: h, reason: collision with root package name */
        int f35234h;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35232f = obj;
            this.f35234h |= Integer.MIN_VALUE;
            return C6136W.this.onSubscription(this);
        }
    }

    public C6136W(InterfaceC6148j interfaceC6148j, f7.p pVar) {
        this.f35228a = interfaceC6148j;
        this.f35229b = pVar;
    }

    @Override // q7.InterfaceC6148j
    public Object emit(Object obj, W6.d<? super R6.G> dVar) {
        return this.f35228a.emit(obj, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [r7.v] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onSubscription(W6.d<? super R6.G> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof q7.C6136W.a
            if (r0 == 0) goto L13
            r0 = r7
            q7.W$a r0 = (q7.C6136W.a) r0
            int r1 = r0.f35234h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35234h = r1
            goto L18
        L13:
            q7.W$a r0 = new q7.W$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35232f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35234h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            R6.r.throwOnFailure(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f35231e
            r7.v r2 = (r7.v) r2
            java.lang.Object r4 = r0.f35230d
            q7.W r4 = (q7.C6136W) r4
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            R6.r.throwOnFailure(r7)
            r7.v r2 = new r7.v
            q7.j r7 = r6.f35228a
            W6.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            f7.p r7 = r6.f35229b     // Catch: java.lang.Throwable -> L40
            r0.f35230d = r6     // Catch: java.lang.Throwable -> L40
            r0.f35231e = r2     // Catch: java.lang.Throwable -> L40
            r0.f35234h = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            q7.j r7 = r4.f35228a
            boolean r2 = r7 instanceof q7.C6136W
            if (r2 == 0) goto L7c
            q7.W r7 = (q7.C6136W) r7
            r2 = 0
            r0.f35230d = r2
            r0.f35231e = r2
            r0.f35234h = r3
            java.lang.Object r7 = r7.onSubscription(r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            R6.G r7 = R6.G.INSTANCE
            return r7
        L7c:
            R6.G r7 = R6.G.INSTANCE
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C6136W.onSubscription(W6.d):java.lang.Object");
    }
}
