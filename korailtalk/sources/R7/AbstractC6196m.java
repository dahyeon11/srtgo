package r7;

import R6.G;
import f7.InterfaceC5519a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n7.InterfaceC6008t0;
import n7.InterfaceC6019z;
import n7.L;
import n7.M;
import n7.z0;
import p7.AbstractC6094s;
import p7.InterfaceC6067e;
import p7.InterfaceC6096u;
import p7.InterfaceC6098w;
import p7.InterfaceC6099x;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;
import s7.O;

/* renamed from: r7.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6196m {

    /* renamed from: r7.m$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        Object f35853e;

        /* renamed from: f, reason: collision with root package name */
        Object f35854f;

        /* renamed from: g, reason: collision with root package name */
        int f35855g;

        /* renamed from: h, reason: collision with root package name */
        int f35856h;

        /* renamed from: i, reason: collision with root package name */
        int f35857i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f35858j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i[] f35859k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5519a f35860l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ f7.q f35861m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35862n;

        /* renamed from: r7.m$a$a, reason: collision with other inner class name */
        static final class C0403a extends Y6.l implements f7.p {

            /* renamed from: e, reason: collision with root package name */
            int f35863e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6147i[] f35864f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f35865g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f35866h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC6067e f35867i;

            /* renamed from: r7.m$a$a$a, reason: collision with other inner class name */
            static final class C0404a implements InterfaceC6148j {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC6067e f35868a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f35869b;

                /* renamed from: r7.m$a$a$a$a, reason: collision with other inner class name */
                static final class C0405a extends Y6.d {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f35870d;

                    /* renamed from: f, reason: collision with root package name */
                    int f35872f;

                    C0405a(W6.d dVar) {
                        super(dVar);
                    }

                    @Override // Y6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f35870d = obj;
                        this.f35872f |= Integer.MIN_VALUE;
                        return C0404a.this.emit(null, this);
                    }
                }

                C0404a(InterfaceC6067e interfaceC6067e, int i8) {
                    this.f35868a = interfaceC6067e;
                    this.f35869b = i8;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // q7.InterfaceC6148j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof r7.AbstractC6196m.a.C0403a.C0404a.C0405a
                        if (r0 == 0) goto L13
                        r0 = r8
                        r7.m$a$a$a$a r0 = (r7.AbstractC6196m.a.C0403a.C0404a.C0405a) r0
                        int r1 = r0.f35872f
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f35872f = r1
                        goto L18
                    L13:
                        r7.m$a$a$a$a r0 = new r7.m$a$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f35870d
                        java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f35872f
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        R6.r.throwOnFailure(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        R6.r.throwOnFailure(r8)
                        goto L4d
                    L38:
                        R6.r.throwOnFailure(r8)
                        p7.e r8 = r6.f35868a
                        S6.J r2 = new S6.J
                        int r5 = r6.f35869b
                        r2.<init>(r5, r7)
                        r0.f35872f = r4
                        java.lang.Object r7 = r8.send(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f35872f = r3
                        java.lang.Object r7 = n7.Y0.yield(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        R6.G r7 = R6.G.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: r7.AbstractC6196m.a.C0403a.C0404a.emit(java.lang.Object, W6.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0403a(InterfaceC6147i[] interfaceC6147iArr, int i8, AtomicInteger atomicInteger, InterfaceC6067e interfaceC6067e, W6.d dVar) {
                super(2, dVar);
                this.f35864f = interfaceC6147iArr;
                this.f35865g = i8;
                this.f35866h = atomicInteger;
                this.f35867i = interfaceC6067e;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return new C0403a(this.f35864f, this.f35865g, this.f35866h, this.f35867i, dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                AtomicInteger atomicInteger;
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35863e;
                try {
                    if (i8 == 0) {
                        R6.r.throwOnFailure(obj);
                        InterfaceC6147i[] interfaceC6147iArr = this.f35864f;
                        int i9 = this.f35865g;
                        InterfaceC6147i interfaceC6147i = interfaceC6147iArr[i9];
                        C0404a c0404a = new C0404a(this.f35867i, i9);
                        this.f35863e = 1;
                        if (interfaceC6147i.collect(c0404a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        R6.r.throwOnFailure(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        InterfaceC6099x.a.close$default(this.f35867i, null, 1, null);
                    }
                    return G.INSTANCE;
                } finally {
                    if (this.f35866h.decrementAndGet() == 0) {
                        InterfaceC6099x.a.close$default(this.f35867i, null, 1, null);
                    }
                }
            }

            @Override // f7.p
            public final Object invoke(L l8, W6.d<? super G> dVar) {
                return ((C0403a) create(l8, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6147i[] interfaceC6147iArr, InterfaceC5519a interfaceC5519a, f7.q qVar, InterfaceC6148j interfaceC6148j, W6.d dVar) {
            super(2, dVar);
            this.f35859k = interfaceC6147iArr;
            this.f35860l = interfaceC5519a;
            this.f35861m = qVar;
            this.f35862n = interfaceC6148j;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            a aVar = new a(this.f35859k, this.f35860l, this.f35861m, this.f35862n, dVar);
            aVar.f35858j = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[LOOP:0: B:28:0x00ca->B:48:?, LOOP_START, PHI: r6 r10
  0x00ca: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:25:0x00c5, B:48:?] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r10v8 S6.J) = (r10v7 S6.J), (r10v21 S6.J) binds: [B:25:0x00c5, B:48:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0135 -> B:45:0x0137). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.AbstractC6196m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(L l8, W6.d<? super G> dVar) {
            return ((a) create(l8, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    /* renamed from: r7.m$b */
    public static final class b implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35874b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f7.q f35875c;

        public b(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.q qVar) {
            this.f35873a = interfaceC6147i;
            this.f35874b = interfaceC6147i2;
            this.f35875c = qVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super G> dVar) {
            Object objCoroutineScope = M.coroutineScope(new c(interfaceC6148j, this.f35873a, this.f35874b, this.f35875c, null), dVar);
            return objCoroutineScope == X6.b.getCOROUTINE_SUSPENDED() ? objCoroutineScope : G.INSTANCE;
        }
    }

    /* renamed from: r7.m$c */
    static final class c extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f35876e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f35877f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35878g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35879h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35880i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ f7.q f35881j;

        /* renamed from: r7.m$c$a */
        static final class a extends Lambda implements f7.l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6019z f35882a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6148j f35883b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6019z interfaceC6019z, InterfaceC6148j interfaceC6148j) {
                super(1);
                this.f35882a = interfaceC6019z;
                this.f35883b = interfaceC6148j;
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return G.INSTANCE;
            }

            public final void invoke(Throwable th) {
                if (this.f35882a.isActive()) {
                    this.f35882a.cancel((CancellationException) new C6184a(this.f35883b));
                }
            }
        }

        /* renamed from: r7.m$c$b */
        static final class b extends Y6.l implements f7.p {

            /* renamed from: e, reason: collision with root package name */
            int f35884e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6147i f35885f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ W6.g f35886g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f35887h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC6098w f35888i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC6148j f35889j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ f7.q f35890k;

            /* renamed from: r7.m$c$b$a */
            static final class a implements InterfaceC6148j {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ W6.g f35891a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f35892b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC6098w f35893c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC6148j f35894d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ f7.q f35895e;

                /* renamed from: r7.m$c$b$a$a, reason: collision with other inner class name */
                static final class C0406a extends Y6.l implements f7.p {

                    /* renamed from: e, reason: collision with root package name */
                    Object f35896e;

                    /* renamed from: f, reason: collision with root package name */
                    int f35897f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6098w f35898g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6148j f35899h;

                    /* renamed from: i, reason: collision with root package name */
                    final /* synthetic */ f7.q f35900i;

                    /* renamed from: j, reason: collision with root package name */
                    final /* synthetic */ Object f35901j;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0406a(InterfaceC6098w interfaceC6098w, InterfaceC6148j interfaceC6148j, f7.q qVar, Object obj, W6.d dVar) {
                        super(2, dVar);
                        this.f35898g = interfaceC6098w;
                        this.f35899h = interfaceC6148j;
                        this.f35900i = qVar;
                        this.f35901j = obj;
                    }

                    @Override // Y6.a
                    public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                        return new C0406a(this.f35898g, this.f35899h, this.f35900i, this.f35901j, dVar);
                    }

                    @Override // f7.p
                    public final Object invoke(G g8, W6.d<? super G> dVar) {
                        return ((C0406a) create(g8, dVar)).invokeSuspend(G.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
                    @Override // Y6.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                        /*
                            r8 = this;
                            java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                            int r1 = r8.f35897f
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L30
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L1e
                            if (r1 != r3) goto L16
                            R6.r.throwOnFailure(r9)
                            goto L6f
                        L16:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L1e:
                            java.lang.Object r1 = r8.f35896e
                            q7.j r1 = (q7.InterfaceC6148j) r1
                            R6.r.throwOnFailure(r9)
                            goto L64
                        L26:
                            R6.r.throwOnFailure(r9)
                            p7.i r9 = (p7.C6071i) r9
                            java.lang.Object r9 = r9.m552unboximpl()
                            goto L3e
                        L30:
                            R6.r.throwOnFailure(r9)
                            p7.w r9 = r8.f35898g
                            r8.f35897f = r5
                            java.lang.Object r9 = r9.mo533receiveCatchingJP2dKIU(r8)
                            if (r9 != r0) goto L3e
                            return r0
                        L3e:
                            q7.j r1 = r8.f35899h
                            boolean r5 = r9 instanceof p7.C6071i.c
                            if (r5 == 0) goto L50
                            java.lang.Throwable r9 = p7.C6071i.m544exceptionOrNullimpl(r9)
                            if (r9 != 0) goto L4f
                            r7.a r9 = new r7.a
                            r9.<init>(r1)
                        L4f:
                            throw r9
                        L50:
                            f7.q r5 = r8.f35900i
                            java.lang.Object r6 = r8.f35901j
                            s7.K r7 = r7.u.NULL
                            if (r9 != r7) goto L59
                            r9 = r2
                        L59:
                            r8.f35896e = r1
                            r8.f35897f = r4
                            java.lang.Object r9 = r5.invoke(r6, r9, r8)
                            if (r9 != r0) goto L64
                            return r0
                        L64:
                            r8.f35896e = r2
                            r8.f35897f = r3
                            java.lang.Object r9 = r1.emit(r9, r8)
                            if (r9 != r0) goto L6f
                            return r0
                        L6f:
                            R6.G r9 = R6.G.INSTANCE
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: r7.AbstractC6196m.c.b.a.C0406a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* renamed from: r7.m$c$b$a$b, reason: collision with other inner class name */
                static final class C0407b extends Y6.d {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f35902d;

                    /* renamed from: f, reason: collision with root package name */
                    int f35904f;

                    C0407b(W6.d dVar) {
                        super(dVar);
                    }

                    @Override // Y6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f35902d = obj;
                        this.f35904f |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                a(W6.g gVar, Object obj, InterfaceC6098w interfaceC6098w, InterfaceC6148j interfaceC6148j, f7.q qVar) {
                    this.f35891a = gVar;
                    this.f35892b = obj;
                    this.f35893c = interfaceC6098w;
                    this.f35894d = interfaceC6148j;
                    this.f35895e = qVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // q7.InterfaceC6148j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r13, W6.d<? super R6.G> r14) throws java.lang.Throwable {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof r7.AbstractC6196m.c.b.a.C0407b
                        if (r0 == 0) goto L13
                        r0 = r14
                        r7.m$c$b$a$b r0 = (r7.AbstractC6196m.c.b.a.C0407b) r0
                        int r1 = r0.f35904f
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f35904f = r1
                        goto L18
                    L13:
                        r7.m$c$b$a$b r0 = new r7.m$c$b$a$b
                        r0.<init>(r14)
                    L18:
                        java.lang.Object r14 = r0.f35902d
                        java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f35904f
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        R6.r.throwOnFailure(r14)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L31:
                        R6.r.throwOnFailure(r14)
                        W6.g r14 = r12.f35891a
                        R6.G r2 = R6.G.INSTANCE
                        java.lang.Object r4 = r12.f35892b
                        r7.m$c$b$a$a r11 = new r7.m$c$b$a$a
                        p7.w r6 = r12.f35893c
                        q7.j r7 = r12.f35894d
                        f7.q r8 = r12.f35895e
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.f35904f = r3
                        java.lang.Object r13 = r7.AbstractC6189f.withContextUndispatched(r14, r2, r4, r11, r0)
                        if (r13 != r1) goto L51
                        return r1
                    L51:
                        R6.G r13 = R6.G.INSTANCE
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: r7.AbstractC6196m.c.b.a.emit(java.lang.Object, W6.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC6147i interfaceC6147i, W6.g gVar, Object obj, InterfaceC6098w interfaceC6098w, InterfaceC6148j interfaceC6148j, f7.q qVar, W6.d dVar) {
                super(2, dVar);
                this.f35885f = interfaceC6147i;
                this.f35886g = gVar;
                this.f35887h = obj;
                this.f35888i = interfaceC6098w;
                this.f35889j = interfaceC6148j;
                this.f35890k = qVar;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return new b(this.f35885f, this.f35886g, this.f35887h, this.f35888i, this.f35889j, this.f35890k, dVar);
            }

            @Override // f7.p
            public final Object invoke(G g8, W6.d<? super G> dVar) {
                return ((b) create(g8, dVar)).invokeSuspend(G.INSTANCE);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35884e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6147i interfaceC6147i = this.f35885f;
                    a aVar = new a(this.f35886g, this.f35887h, this.f35888i, this.f35889j, this.f35890k);
                    this.f35884e = 1;
                    if (interfaceC6147i.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R6.r.throwOnFailure(obj);
                }
                return G.INSTANCE;
            }
        }

        /* renamed from: r7.m$c$c, reason: collision with other inner class name */
        static final class C0408c extends Y6.l implements f7.p {

            /* renamed from: e, reason: collision with root package name */
            int f35905e;

            /* renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f35906f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC6147i f35907g;

            /* renamed from: r7.m$c$c$a */
            static final class a implements InterfaceC6148j {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC6096u f35908a;

                /* renamed from: r7.m$c$c$a$a, reason: collision with other inner class name */
                static final class C0409a extends Y6.d {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f35909d;

                    /* renamed from: f, reason: collision with root package name */
                    int f35911f;

                    C0409a(W6.d dVar) {
                        super(dVar);
                    }

                    @Override // Y6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f35909d = obj;
                        this.f35911f |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                a(InterfaceC6096u interfaceC6096u) {
                    this.f35908a = interfaceC6096u;
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
                        boolean r0 = r6 instanceof r7.AbstractC6196m.c.C0408c.a.C0409a
                        if (r0 == 0) goto L13
                        r0 = r6
                        r7.m$c$c$a$a r0 = (r7.AbstractC6196m.c.C0408c.a.C0409a) r0
                        int r1 = r0.f35911f
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f35911f = r1
                        goto L18
                    L13:
                        r7.m$c$c$a$a r0 = new r7.m$c$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f35909d
                        java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f35911f
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        R6.r.throwOnFailure(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        R6.r.throwOnFailure(r6)
                        p7.u r6 = r4.f35908a
                        p7.x r6 = r6.getChannel()
                        if (r5 != 0) goto L3e
                        s7.K r5 = r7.u.NULL
                    L3e:
                        r0.f35911f = r3
                        java.lang.Object r5 = r6.send(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        R6.G r5 = R6.G.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: r7.AbstractC6196m.c.C0408c.a.emit(java.lang.Object, W6.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0408c(InterfaceC6147i interfaceC6147i, W6.d dVar) {
                super(2, dVar);
                this.f35907g = interfaceC6147i;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                C0408c c0408c = new C0408c(this.f35907g, dVar);
                c0408c.f35906f = obj;
                return c0408c;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35905e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6096u interfaceC6096u = (InterfaceC6096u) this.f35906f;
                    InterfaceC6147i interfaceC6147i = this.f35907g;
                    a aVar = new a(interfaceC6096u);
                    this.f35905e = 1;
                    if (interfaceC6147i.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R6.r.throwOnFailure(obj);
                }
                return G.INSTANCE;
            }

            @Override // f7.p
            public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d<? super G> dVar) {
                return ((C0408c) create(interfaceC6096u, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6148j interfaceC6148j, InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.q qVar, W6.d dVar) {
            super(2, dVar);
            this.f35878g = interfaceC6148j;
            this.f35879h = interfaceC6147i;
            this.f35880i = interfaceC6147i2;
            this.f35881j = qVar;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            c cVar = new c(this.f35878g, this.f35879h, this.f35880i, this.f35881j, dVar);
            cVar.f35877f = obj;
            return cVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6098w interfaceC6098w;
            InterfaceC6098w interfaceC6098w2;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35876e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                L l8 = (L) this.f35877f;
                InterfaceC6098w interfaceC6098wProduce$default = AbstractC6094s.produce$default(l8, null, 0, new C0408c(this.f35879h, null), 3, null);
                InterfaceC6019z interfaceC6019zM531Job$default = z0.m531Job$default((InterfaceC6008t0) null, 1, (Object) null);
                Intrinsics.checkNotNull(interfaceC6098wProduce$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
                ((InterfaceC6099x) interfaceC6098wProduce$default).invokeOnClose(new a(interfaceC6019zM531Job$default, this.f35878g));
                try {
                    W6.g coroutineContext = l8.getCoroutineContext();
                    Object objThreadContextElements = O.threadContextElements(coroutineContext);
                    W6.g gVarPlus = l8.getCoroutineContext().plus(interfaceC6019zM531Job$default);
                    G g8 = G.INSTANCE;
                    b bVar = new b(this.f35880i, coroutineContext, objThreadContextElements, interfaceC6098wProduce$default, this.f35878g, this.f35881j, null);
                    this.f35877f = interfaceC6098wProduce$default;
                    this.f35876e = 1;
                    interfaceC6098w = interfaceC6098wProduce$default;
                    try {
                        if (AbstractC6189f.withContextUndispatched$default(gVarPlus, g8, null, bVar, this, 4, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        interfaceC6098w2 = interfaceC6098w;
                    } catch (C6184a e8) {
                        e = e8;
                        interfaceC6098w2 = interfaceC6098w;
                        q.checkOwnership(e, this.f35878g);
                        InterfaceC6098w.a.cancel$default(interfaceC6098w2, (CancellationException) null, 1, (Object) null);
                        return G.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC6098w2 = interfaceC6098w;
                        InterfaceC6098w.a.cancel$default(interfaceC6098w2, (CancellationException) null, 1, (Object) null);
                        throw th;
                    }
                } catch (C6184a e9) {
                    e = e9;
                    interfaceC6098w = interfaceC6098wProduce$default;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC6098w = interfaceC6098wProduce$default;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC6098w2 = (InterfaceC6098w) this.f35877f;
                try {
                    try {
                        R6.r.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        InterfaceC6098w.a.cancel$default(interfaceC6098w2, (CancellationException) null, 1, (Object) null);
                        throw th;
                    }
                } catch (C6184a e10) {
                    e = e10;
                    q.checkOwnership(e, this.f35878g);
                    InterfaceC6098w.a.cancel$default(interfaceC6098w2, (CancellationException) null, 1, (Object) null);
                    return G.INSTANCE;
                }
            }
            InterfaceC6098w.a.cancel$default(interfaceC6098w2, (CancellationException) null, 1, (Object) null);
            return G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(L l8, W6.d<? super G> dVar) {
            return ((c) create(l8, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    public static final <R, T> Object combineInternal(InterfaceC6148j interfaceC6148j, InterfaceC6147i[] interfaceC6147iArr, InterfaceC5519a interfaceC5519a, f7.q qVar, W6.d<? super G> dVar) {
        Object objFlowScope = AbstractC6199p.flowScope(new a(interfaceC6147iArr, interfaceC5519a, qVar, interfaceC6148j, null), dVar);
        return objFlowScope == X6.b.getCOROUTINE_SUSPENDED() ? objFlowScope : G.INSTANCE;
    }

    public static final <T1, T2, R> InterfaceC6147i zipImpl(InterfaceC6147i interfaceC6147i, InterfaceC6147i interfaceC6147i2, f7.q qVar) {
        return new b(interfaceC6147i2, interfaceC6147i, qVar);
    }
}
