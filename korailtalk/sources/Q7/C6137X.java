package q7;

import java.util.List;

/* renamed from: q7.X, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6137X implements InterfaceC6122H {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6122H f35235a;

    /* renamed from: b, reason: collision with root package name */
    private final f7.p f35236b;

    /* renamed from: q7.X$a */
    static final class a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f35237d;

        /* renamed from: f, reason: collision with root package name */
        int f35239f;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35237d = obj;
            this.f35239f |= Integer.MIN_VALUE;
            return C6137X.this.collect(null, this);
        }
    }

    public C6137X(InterfaceC6122H interfaceC6122H, f7.p pVar) {
        this.f35235a = interfaceC6122H;
        this.f35236b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q7.InterfaceC6122H, q7.InterfaceC6147i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(q7.InterfaceC6148j r6, W6.d<?> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q7.C6137X.a
            if (r0 == 0) goto L13
            r0 = r7
            q7.X$a r0 = (q7.C6137X.a) r0
            int r1 = r0.f35239f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35239f = r1
            goto L18
        L13:
            q7.X$a r0 = new q7.X$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35237d
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35239f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            R6.r.throwOnFailure(r7)
            goto L46
        L31:
            R6.r.throwOnFailure(r7)
            q7.H r7 = r5.f35235a
            q7.W r2 = new q7.W
            f7.p r4 = r5.f35236b
            r2.<init>(r6, r4)
            r0.f35239f = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            R6.e r6 = new R6.e
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C6137X.collect(q7.j, W6.d):java.lang.Object");
    }

    @Override // q7.InterfaceC6122H
    public List<Object> getReplayCache() {
        return this.f35235a.getReplayCache();
    }
}
