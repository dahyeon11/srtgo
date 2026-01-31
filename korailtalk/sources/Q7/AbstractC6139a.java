package q7;

/* renamed from: q7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6139a implements InterfaceC6147i, InterfaceC6141c {

    /* renamed from: q7.a$a, reason: collision with other inner class name */
    static final class C0380a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35241d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35242e;

        /* renamed from: g, reason: collision with root package name */
        int f35244g;

        C0380a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35242e = obj;
            this.f35244g |= Integer.MIN_VALUE;
            return AbstractC6139a.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q7.InterfaceC6147i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(q7.InterfaceC6148j r6, W6.d<? super R6.G> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q7.AbstractC6139a.C0380a
            if (r0 == 0) goto L13
            r0 = r7
            q7.a$a r0 = (q7.AbstractC6139a.C0380a) r0
            int r1 = r0.f35244g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35244g = r1
            goto L18
        L13:
            q7.a$a r0 = new q7.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35242e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35244g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f35241d
            r7.v r6 = (r7.v) r6
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            R6.r.throwOnFailure(r7)
            r7.v r7 = new r7.v
            W6.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f35241d = r7     // Catch: java.lang.Throwable -> L55
            r0.f35244g = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.collectSafely(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            R6.G r6 = R6.G.INSTANCE
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6139a.collect(q7.j, W6.d):java.lang.Object");
    }

    public abstract Object collectSafely(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar);
}
