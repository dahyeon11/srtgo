package q7;

import p7.InterfaceC6063a;
import p7.InterfaceC6098w;
import r7.AbstractC6189f;

/* renamed from: q7.m */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6151m {

    /* renamed from: q7.m$a */
    public static final class a implements InterfaceC6147i {
        public a(InterfaceC6063a interfaceC6063a) {
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            throw null;
        }
    }

    /* renamed from: q7.m$b */
    static final class b extends Y6.d {

        /* renamed from: d */
        Object f35335d;

        /* renamed from: e */
        Object f35336e;

        /* renamed from: f */
        Object f35337f;

        /* renamed from: g */
        boolean f35338g;

        /* renamed from: h */
        /* synthetic */ Object f35339h;

        /* renamed from: i */
        int f35340i;

        b(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35339h = obj;
            this.f35340i |= Integer.MIN_VALUE;
            return AbstractC6151m.a(null, null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:59:0x0036, B:70:0x0062, B:74:0x0077, B:76:0x007f, B:66:0x0054, B:69:0x005e), top: B:88:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0091 -> B:60:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(q7.InterfaceC6148j r6, p7.InterfaceC6098w r7, boolean r8, W6.d r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof q7.AbstractC6151m.b
            if (r0 == 0) goto L13
            r0 = r9
            q7.m$b r0 = (q7.AbstractC6151m.b) r0
            int r1 = r0.f35340i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35340i = r1
            goto L18
        L13:
            q7.m$b r0 = new q7.m$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f35339h
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35340i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f35338g
            java.lang.Object r6 = r0.f35337f
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r7 = r0.f35336e
            p7.w r7 = (p7.InterfaceC6098w) r7
            java.lang.Object r2 = r0.f35335d
            q7.j r2 = (q7.InterfaceC6148j) r2
            R6.r.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f35338g
            java.lang.Object r6 = r0.f35337f
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r7 = r0.f35336e
            p7.w r7 = (p7.InterfaceC6098w) r7
            java.lang.Object r2 = r0.f35335d
            q7.j r2 = (q7.InterfaceC6148j) r2
            R6.r.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            R6.r.throwOnFailure(r9)
            q7.AbstractC6149k.ensureActive(r6)
            p7.g r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f35335d = r6     // Catch: java.lang.Throwable -> L3c
            r0.f35336e = r7     // Catch: java.lang.Throwable -> L3c
            r0.f35337f = r9     // Catch: java.lang.Throwable -> L3c
            r0.f35338g = r8     // Catch: java.lang.Throwable -> L3c
            r0.f35340i = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f35335d = r2     // Catch: java.lang.Throwable -> L3c
            r0.f35336e = r7     // Catch: java.lang.Throwable -> L3c
            r0.f35337f = r6     // Catch: java.lang.Throwable -> L3c
            r0.f35338g = r8     // Catch: java.lang.Throwable -> L3c
            r0.f35340i = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            p7.AbstractC6074l.cancelConsumed(r7, r6)
        L9a:
            R6.G r6 = R6.G.INSTANCE
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            p7.AbstractC6074l.cancelConsumed(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6151m.a(q7.j, p7.w, boolean, W6.d):java.lang.Object");
    }

    public static final <T> InterfaceC6147i asFlow(InterfaceC6063a interfaceC6063a) {
        return new a(interfaceC6063a);
    }

    public static final <T> InterfaceC6147i consumeAsFlow(InterfaceC6098w interfaceC6098w) {
        return new C6143e(interfaceC6098w, true, null, 0, null, 28, null);
    }

    public static final <T> Object emitAll(InterfaceC6148j interfaceC6148j, InterfaceC6098w interfaceC6098w, W6.d<? super R6.G> dVar) throws Throwable {
        Object objA = a(interfaceC6148j, interfaceC6098w, true, dVar);
        return objA == X6.b.getCOROUTINE_SUSPENDED() ? objA : R6.G.INSTANCE;
    }

    public static final <T> InterfaceC6098w produceIn(InterfaceC6147i interfaceC6147i, n7.L l8) {
        return AbstractC6189f.asChannelFlow(interfaceC6147i).produceImpl(l8);
    }

    public static final <T> InterfaceC6147i receiveAsFlow(InterfaceC6098w interfaceC6098w) {
        return new C6143e(interfaceC6098w, false, null, 0, null, 28, null);
    }
}
