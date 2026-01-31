package p7;

/* renamed from: p7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6069g {

    /* renamed from: p7.g$a */
    public static final class a {

        /* renamed from: p7.g$a$a, reason: collision with other inner class name */
        static final class C0366a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f34682d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f34683e;

            /* renamed from: f, reason: collision with root package name */
            int f34684f;

            C0366a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f34683e = obj;
                this.f34684f |= Integer.MIN_VALUE;
                return a.next(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ java.lang.Object next(p7.InterfaceC6069g r4, W6.d r5) throws java.lang.Throwable {
            /*
                boolean r0 = r5 instanceof p7.InterfaceC6069g.a.C0366a
                if (r0 == 0) goto L13
                r0 = r5
                p7.g$a$a r0 = (p7.InterfaceC6069g.a.C0366a) r0
                int r1 = r0.f34684f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34684f = r1
                goto L18
            L13:
                p7.g$a$a r0 = new p7.g$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f34683e
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f34684f
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f34682d
                p7.g r4 = (p7.InterfaceC6069g) r4
                R6.r.throwOnFailure(r5)
                goto L43
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                R6.r.throwOnFailure(r5)
                r0.f34682d = r4
                r0.f34684f = r3
                java.lang.Object r5 = r4.hasNext(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L50
                java.lang.Object r4 = r4.next()
                return r4
            L50:
                p7.p r4 = new p7.p
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.InterfaceC6069g.a.next(p7.g, W6.d):java.lang.Object");
        }
    }

    Object hasNext(W6.d<? super Boolean> dVar);

    Object next();

    /* synthetic */ Object next(W6.d dVar);
}
