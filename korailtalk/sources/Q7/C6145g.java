package q7;

import kotlin.jvm.internal.Ref;

/* renamed from: q7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6145g implements InterfaceC6147i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6147i f35259a;
    public final f7.p areEquivalent;
    public final f7.l keySelector;

    /* renamed from: q7.g$a */
    static final class a implements InterfaceC6148j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f35261b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35262c;

        /* renamed from: q7.g$a$a, reason: collision with other inner class name */
        static final class C0382a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35263d;

            /* renamed from: f, reason: collision with root package name */
            int f35265f;

            C0382a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35263d = obj;
                this.f35265f |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(Ref.ObjectRef objectRef, InterfaceC6148j interfaceC6148j) {
            this.f35261b = objectRef;
            this.f35262c = interfaceC6148j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
        @Override // q7.InterfaceC6148j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, W6.d<? super R6.G> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q7.C6145g.a.C0382a
                if (r0 == 0) goto L13
                r0 = r7
                q7.g$a$a r0 = (q7.C6145g.a.C0382a) r0
                int r1 = r0.f35265f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35265f = r1
                goto L18
            L13:
                q7.g$a$a r0 = new q7.g$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f35263d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35265f
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                R6.r.throwOnFailure(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                R6.r.throwOnFailure(r7)
                q7.g r7 = q7.C6145g.this
                f7.l r7 = r7.keySelector
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f35261b
                T r2 = r2.element
                s7.K r4 = r7.u.NULL
                if (r2 == r4) goto L58
                q7.g r4 = q7.C6145g.this
                f7.p r4 = r4.areEquivalent
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                R6.G r6 = R6.G.INSTANCE
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f35261b
                r2.element = r7
                q7.j r7 = r5.f35262c
                r0.f35265f = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                R6.G r6 = R6.G.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.C6145g.a.emit(java.lang.Object, W6.d):java.lang.Object");
        }
    }

    public C6145g(InterfaceC6147i interfaceC6147i, f7.l lVar, f7.p pVar) {
        this.f35259a = interfaceC6147i;
        this.keySelector = lVar;
        this.areEquivalent = pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, s7.K] */
    @Override // q7.InterfaceC6147i
    public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = r7.u.NULL;
        Object objCollect = this.f35259a.collect(new a(objectRef, interfaceC6148j), dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : R6.G.INSTANCE;
    }
}
