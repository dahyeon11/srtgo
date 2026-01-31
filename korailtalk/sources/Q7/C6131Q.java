package q7;

import java.util.List;

/* renamed from: q7.Q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6131Q implements InterfaceC6128N {

    /* renamed from: a, reason: collision with root package name */
    private final long f35207a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35208b;

    /* renamed from: q7.Q$a */
    static final class a extends Y6.l implements f7.q {

        /* renamed from: e, reason: collision with root package name */
        int f35209e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f35210f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ int f35211g;

        a(W6.d dVar) {
            super(3, dVar);
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC6148j) obj, ((Number) obj2).intValue(), (W6.d<? super R6.G>) obj3);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r9.f35209e
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f35210f
                q7.j r1 = (q7.InterfaceC6148j) r1
                R6.r.throwOnFailure(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f35210f
                q7.j r1 = (q7.InterfaceC6148j) r1
                R6.r.throwOnFailure(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f35210f
                q7.j r1 = (q7.InterfaceC6148j) r1
                R6.r.throwOnFailure(r10)
                goto L64
            L38:
                R6.r.throwOnFailure(r10)
                goto L9c
            L3c:
                R6.r.throwOnFailure(r10)
                java.lang.Object r10 = r9.f35210f
                r1 = r10
                q7.j r1 = (q7.InterfaceC6148j) r1
                int r10 = r9.f35211g
                if (r10 <= 0) goto L53
                q7.L r10 = q7.EnumC6126L.START
                r9.f35209e = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                q7.Q r10 = q7.C6131Q.this
                long r6 = q7.C6131Q.access$getStopTimeout$p(r10)
                r9.f35210f = r1
                r9.f35209e = r5
                java.lang.Object r10 = n7.W.delay(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                q7.Q r10 = q7.C6131Q.this
                long r5 = q7.C6131Q.access$getReplayExpiration$p(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                q7.L r10 = q7.EnumC6126L.STOP
                r9.f35210f = r1
                r9.f35209e = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                q7.Q r10 = q7.C6131Q.this
                long r4 = q7.C6131Q.access$getReplayExpiration$p(r10)
                r9.f35210f = r1
                r9.f35209e = r3
                java.lang.Object r10 = n7.W.delay(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                q7.L r10 = q7.EnumC6126L.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f35210f = r3
                r9.f35209e = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                R6.G r10 = R6.G.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.C6131Q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(InterfaceC6148j interfaceC6148j, int i8, W6.d<? super R6.G> dVar) {
            a aVar = C6131Q.this.new a(dVar);
            aVar.f35210f = interfaceC6148j;
            aVar.f35211g = i8;
            return aVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.Q$b */
    static final class b extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f35213e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f35214f;

        b(W6.d dVar) {
            super(2, dVar);
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f35214f = obj;
            return bVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            X6.b.getCOROUTINE_SUSPENDED();
            if (this.f35213e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R6.r.throwOnFailure(obj);
            return Y6.b.boxBoolean(((EnumC6126L) this.f35214f) != EnumC6126L.START);
        }

        @Override // f7.p
        public final Object invoke(EnumC6126L enumC6126L, W6.d<? super Boolean> dVar) {
            return ((b) create(enumC6126L, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    public C6131Q(long j8, long j9) {
        this.f35207a = j8;
        this.f35208b = j9;
        if (j8 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j8 + " ms) cannot be negative").toString());
        }
        if (j9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j9 + " ms) cannot be negative").toString());
    }

    @Override // q7.InterfaceC6128N
    public InterfaceC6147i command(InterfaceC6132S interfaceC6132S) {
        return AbstractC6149k.distinctUntilChanged(AbstractC6149k.dropWhile(AbstractC6149k.transformLatest(interfaceC6132S, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6131Q) {
            C6131Q c6131q = (C6131Q) obj;
            if (this.f35207a == c6131q.f35207a && this.f35208b == c6131q.f35208b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f35207a) * 31) + Long.hashCode(this.f35208b);
    }

    public String toString() {
        List listCreateListBuilder = S6.r.createListBuilder(2);
        if (this.f35207a > 0) {
            listCreateListBuilder.add("stopTimeout=" + this.f35207a + "ms");
        }
        if (this.f35208b < Long.MAX_VALUE) {
            listCreateListBuilder.add("replayExpiration=" + this.f35208b + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + S6.r.joinToString$default(S6.r.build(listCreateListBuilder), null, null, null, 0, null, null, 63, null) + ')';
    }
}
