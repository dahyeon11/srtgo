package q7;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import m7.C5914a;
import n7.S0;
import p7.AbstractC6094s;
import p7.C6071i;
import p7.InterfaceC6096u;
import p7.InterfaceC6098w;
import r7.AbstractC6199p;
import r7.C6195l;

/* renamed from: q7.r */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6156r {

    /* renamed from: q7.r$a */
    static final class a extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ long f35369a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8) {
            super(1);
            this.f35369a = j8;
        }

        @Override // f7.l
        public final Long invoke(T t8) {
            return Long.valueOf(this.f35369a);
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((a) obj);
        }
    }

    /* renamed from: q7.r$b */
    static final class b extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ f7.l f35370a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f7.l lVar) {
            super(1);
            this.f35370a = lVar;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((b) obj);
        }

        @Override // f7.l
        public final Long invoke(T t8) {
            return Long.valueOf(n7.W.m527toDelayMillisLRDsOJo(((C5914a) this.f35370a.invoke(t8)).m474unboximpl()));
        }
    }

    /* renamed from: q7.r$c */
    static final class c extends Y6.l implements f7.q {

        /* renamed from: e */
        Object f35371e;

        /* renamed from: f */
        Object f35372f;

        /* renamed from: g */
        int f35373g;

        /* renamed from: h */
        private /* synthetic */ Object f35374h;

        /* renamed from: i */
        /* synthetic */ Object f35375i;

        /* renamed from: j */
        final /* synthetic */ f7.l f35376j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC6147i f35377k;

        /* renamed from: q7.r$c$a */
        static final class a extends Y6.l implements f7.l {

            /* renamed from: e */
            int f35378e;

            /* renamed from: f */
            final /* synthetic */ InterfaceC6148j f35379f;

            /* renamed from: g */
            final /* synthetic */ Ref.ObjectRef f35380g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6148j interfaceC6148j, Ref.ObjectRef objectRef, W6.d dVar) {
                super(1, dVar);
                this.f35379f = interfaceC6148j;
                this.f35380g = objectRef;
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(W6.d<?> dVar) {
                return new a(this.f35379f, this.f35380g, dVar);
            }

            @Override // f7.l
            public final Object invoke(W6.d<? super R6.G> dVar) {
                return ((a) create(dVar)).invokeSuspend(R6.G.INSTANCE);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35378e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6148j interfaceC6148j = this.f35379f;
                    s7.K k8 = r7.u.NULL;
                    Object obj2 = this.f35380g.element;
                    if (obj2 == k8) {
                        obj2 = null;
                    }
                    this.f35378e = 1;
                    if (interfaceC6148j.emit(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R6.r.throwOnFailure(obj);
                }
                this.f35380g.element = null;
                return R6.G.INSTANCE;
            }
        }

        /* renamed from: q7.r$c$b */
        static final class b extends Y6.l implements f7.p {

            /* renamed from: e */
            Object f35381e;

            /* renamed from: f */
            int f35382f;

            /* renamed from: g */
            /* synthetic */ Object f35383g;

            /* renamed from: h */
            final /* synthetic */ Ref.ObjectRef f35384h;

            /* renamed from: i */
            final /* synthetic */ InterfaceC6148j f35385i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ref.ObjectRef objectRef, InterfaceC6148j interfaceC6148j, W6.d dVar) {
                super(2, dVar);
                this.f35384h = objectRef;
                this.f35385i = interfaceC6148j;
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
                b bVar = new b(this.f35384h, this.f35385i, dVar);
                bVar.f35383g = obj;
                return bVar;
            }

            @Override // f7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m564invokeWpGqRn0(((C6071i) obj).m552unboximpl(), (W6.d) obj2);
            }

            /* renamed from: invoke-WpGqRn0 */
            public final Object m564invokeWpGqRn0(Object obj, W6.d<? super R6.G> dVar) {
                return ((b) create(C6071i.m540boximpl(obj), dVar)).invokeSuspend(R6.G.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v6, types: [T, s7.K] */
            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Ref.ObjectRef objectRef;
                Ref.ObjectRef objectRef2;
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35382f;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    ?? M552unboximpl = ((C6071i) this.f35383g).m552unboximpl();
                    objectRef = this.f35384h;
                    boolean z8 = M552unboximpl instanceof C6071i.c;
                    if (!z8) {
                        objectRef.element = M552unboximpl;
                    }
                    InterfaceC6148j interfaceC6148j = this.f35385i;
                    if (z8) {
                        Throwable thM544exceptionOrNullimpl = C6071i.m544exceptionOrNullimpl(M552unboximpl);
                        if (thM544exceptionOrNullimpl != null) {
                            throw thM544exceptionOrNullimpl;
                        }
                        Object obj2 = objectRef.element;
                        if (obj2 != null) {
                            if (obj2 == r7.u.NULL) {
                                obj2 = null;
                            }
                            this.f35383g = M552unboximpl;
                            this.f35381e = objectRef;
                            this.f35382f = 1;
                            if (interfaceC6148j.emit(obj2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef2 = objectRef;
                        }
                        objectRef.element = r7.u.DONE;
                    }
                    return R6.G.INSTANCE;
                }
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) this.f35381e;
                R6.r.throwOnFailure(obj);
                objectRef = objectRef2;
                objectRef.element = r7.u.DONE;
                return R6.G.INSTANCE;
            }
        }

        /* renamed from: q7.r$c$c */
        static final class C0386c extends Y6.l implements f7.p {

            /* renamed from: e */
            int f35386e;

            /* renamed from: f */
            private /* synthetic */ Object f35387f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC6147i f35388g;

            /* renamed from: q7.r$c$c$a */
            static final class a implements InterfaceC6148j {

                /* renamed from: a */
                final /* synthetic */ InterfaceC6096u f35389a;

                /* renamed from: q7.r$c$c$a$a */
                static final class C0387a extends Y6.d {

                    /* renamed from: d */
                    /* synthetic */ Object f35390d;

                    /* renamed from: f */
                    int f35392f;

                    C0387a(W6.d dVar) {
                        super(dVar);
                    }

                    @Override // Y6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f35390d = obj;
                        this.f35392f |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                a(InterfaceC6096u interfaceC6096u) {
                    this.f35389a = interfaceC6096u;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
                @Override // q7.InterfaceC6148j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof q7.AbstractC6156r.c.C0386c.a.C0387a
                        if (r0 == 0) goto L13
                        r0 = r6
                        q7.r$c$c$a$a r0 = (q7.AbstractC6156r.c.C0386c.a.C0387a) r0
                        int r1 = r0.f35392f
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f35392f = r1
                        goto L18
                    L13:
                        q7.r$c$c$a$a r0 = new q7.r$c$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f35390d
                        java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f35392f
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        R6.r.throwOnFailure(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        R6.r.throwOnFailure(r6)
                        p7.u r6 = r4.f35389a
                        if (r5 != 0) goto L3a
                        s7.K r5 = r7.u.NULL
                    L3a:
                        r0.f35392f = r3
                        java.lang.Object r5 = r6.send(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        R6.G r5 = R6.G.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6156r.c.C0386c.a.emit(java.lang.Object, W6.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0386c(InterfaceC6147i interfaceC6147i, W6.d dVar) {
                super(2, dVar);
                this.f35388g = interfaceC6147i;
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
                C0386c c0386c = new C0386c(this.f35388g, dVar);
                c0386c.f35387f = obj;
                return c0386c;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35386e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6096u interfaceC6096u = (InterfaceC6096u) this.f35387f;
                    InterfaceC6147i interfaceC6147i = this.f35388g;
                    a aVar = new a(interfaceC6096u);
                    this.f35386e = 1;
                    if (interfaceC6147i.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R6.r.throwOnFailure(obj);
                }
                return R6.G.INSTANCE;
            }

            @Override // f7.p
            public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d<? super R6.G> dVar) {
                return ((C0386c) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f7.l lVar, InterfaceC6147i interfaceC6147i, W6.d dVar) {
            super(3, dVar);
            this.f35376j = lVar;
            this.f35377k = interfaceC6147i;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00e2 -> B:48:0x001e). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6156r.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.q
        public final Object invoke(n7.L l8, InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            c cVar = new c(this.f35376j, this.f35377k, dVar);
            cVar.f35374h = l8;
            cVar.f35375i = interfaceC6148j;
            return cVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.r$d */
    static final class d extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35393e;

        /* renamed from: f */
        private /* synthetic */ Object f35394f;

        /* renamed from: g */
        final /* synthetic */ long f35395g;

        /* renamed from: h */
        final /* synthetic */ long f35396h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j8, long j9, W6.d dVar) {
            super(2, dVar);
            this.f35395g = j8;
            this.f35396h = j9;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            d dVar2 = new d(this.f35395g, this.f35396h, dVar);
            dVar2.f35394f = obj;
            return dVar2;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:38:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x005c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x005a -> B:36:0x003f). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r7.f35393e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f35394f
                p7.u r1 = (p7.InterfaceC6096u) r1
                R6.r.throwOnFailure(r8)
                goto L50
            L22:
                java.lang.Object r1 = r7.f35394f
                p7.u r1 = (p7.InterfaceC6096u) r1
                R6.r.throwOnFailure(r8)
                goto L3f
            L2a:
                R6.r.throwOnFailure(r8)
                java.lang.Object r8 = r7.f35394f
                r1 = r8
                p7.u r1 = (p7.InterfaceC6096u) r1
                long r5 = r7.f35395g
                r7.f35394f = r1
                r7.f35393e = r4
                java.lang.Object r8 = n7.W.delay(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                p7.x r8 = r1.getChannel()
                R6.G r4 = R6.G.INSTANCE
                r7.f35394f = r1
                r7.f35393e = r3
                java.lang.Object r8 = r8.send(r4, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                long r4 = r7.f35396h
                r7.f35394f = r1
                r7.f35393e = r2
                java.lang.Object r8 = n7.W.delay(r4, r7)
                if (r8 != r0) goto L3f
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6156r.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d<? super R6.G> dVar) {
            return ((d) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.r$e */
    static final class e extends Y6.l implements f7.q {

        /* renamed from: e */
        Object f35397e;

        /* renamed from: f */
        Object f35398f;

        /* renamed from: g */
        int f35399g;

        /* renamed from: h */
        private /* synthetic */ Object f35400h;

        /* renamed from: i */
        /* synthetic */ Object f35401i;

        /* renamed from: j */
        final /* synthetic */ long f35402j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC6147i f35403k;

        /* renamed from: q7.r$e$a */
        static final class a extends Y6.l implements f7.p {

            /* renamed from: e */
            int f35404e;

            /* renamed from: f */
            /* synthetic */ Object f35405f;

            /* renamed from: g */
            final /* synthetic */ Ref.ObjectRef f35406g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC6098w f35407h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.ObjectRef objectRef, InterfaceC6098w interfaceC6098w, W6.d dVar) {
                super(2, dVar);
                this.f35406g = objectRef;
                this.f35407h = interfaceC6098w;
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
                a aVar = new a(this.f35406g, this.f35407h, dVar);
                aVar.f35405f = obj;
                return aVar;
            }

            @Override // f7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m565invokeWpGqRn0(((C6071i) obj).m552unboximpl(), (W6.d) obj2);
            }

            /* renamed from: invoke-WpGqRn0 */
            public final Object m565invokeWpGqRn0(Object obj, W6.d<? super R6.G> dVar) {
                return ((a) create(C6071i.m540boximpl(obj), dVar)).invokeSuspend(R6.G.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v8, types: [T, s7.K] */
            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                X6.b.getCOROUTINE_SUSPENDED();
                if (this.f35404e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
                ?? M552unboximpl = ((C6071i) this.f35405f).m552unboximpl();
                Ref.ObjectRef objectRef = this.f35406g;
                boolean z8 = M552unboximpl instanceof C6071i.c;
                if (!z8) {
                    objectRef.element = M552unboximpl;
                }
                InterfaceC6098w interfaceC6098w = this.f35407h;
                if (z8) {
                    Throwable thM544exceptionOrNullimpl = C6071i.m544exceptionOrNullimpl(M552unboximpl);
                    if (thM544exceptionOrNullimpl != null) {
                        throw thM544exceptionOrNullimpl;
                    }
                    interfaceC6098w.cancel((CancellationException) new C6195l());
                    objectRef.element = r7.u.DONE;
                }
                return R6.G.INSTANCE;
            }
        }

        /* renamed from: q7.r$e$b */
        static final class b extends Y6.l implements f7.p {

            /* renamed from: e */
            int f35408e;

            /* renamed from: f */
            final /* synthetic */ Ref.ObjectRef f35409f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC6148j f35410g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ref.ObjectRef objectRef, InterfaceC6148j interfaceC6148j, W6.d dVar) {
                super(2, dVar);
                this.f35409f = objectRef;
                this.f35410g = interfaceC6148j;
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
                return new b(this.f35409f, this.f35410g, dVar);
            }

            @Override // f7.p
            public final Object invoke(R6.G g8, W6.d<? super R6.G> dVar) {
                return ((b) create(g8, dVar)).invokeSuspend(R6.G.INSTANCE);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35408e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    Ref.ObjectRef objectRef = this.f35409f;
                    Object obj2 = objectRef.element;
                    if (obj2 == null) {
                        return R6.G.INSTANCE;
                    }
                    objectRef.element = null;
                    InterfaceC6148j interfaceC6148j = this.f35410g;
                    if (obj2 == r7.u.NULL) {
                        obj2 = null;
                    }
                    this.f35408e = 1;
                    if (interfaceC6148j.emit(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R6.r.throwOnFailure(obj);
                }
                return R6.G.INSTANCE;
            }
        }

        /* renamed from: q7.r$e$c */
        static final class c extends Y6.l implements f7.p {

            /* renamed from: e */
            int f35411e;

            /* renamed from: f */
            private /* synthetic */ Object f35412f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC6147i f35413g;

            /* renamed from: q7.r$e$c$a */
            static final class a implements InterfaceC6148j {

                /* renamed from: a */
                final /* synthetic */ InterfaceC6096u f35414a;

                /* renamed from: q7.r$e$c$a$a */
                static final class C0388a extends Y6.d {

                    /* renamed from: d */
                    /* synthetic */ Object f35415d;

                    /* renamed from: f */
                    int f35417f;

                    C0388a(W6.d dVar) {
                        super(dVar);
                    }

                    @Override // Y6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f35415d = obj;
                        this.f35417f |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                a(InterfaceC6096u interfaceC6096u) {
                    this.f35414a = interfaceC6096u;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
                @Override // q7.InterfaceC6148j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof q7.AbstractC6156r.e.c.a.C0388a
                        if (r0 == 0) goto L13
                        r0 = r6
                        q7.r$e$c$a$a r0 = (q7.AbstractC6156r.e.c.a.C0388a) r0
                        int r1 = r0.f35417f
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f35417f = r1
                        goto L18
                    L13:
                        q7.r$e$c$a$a r0 = new q7.r$e$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f35415d
                        java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f35417f
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        R6.r.throwOnFailure(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        R6.r.throwOnFailure(r6)
                        p7.u r6 = r4.f35414a
                        if (r5 != 0) goto L3a
                        s7.K r5 = r7.u.NULL
                    L3a:
                        r0.f35417f = r3
                        java.lang.Object r5 = r6.send(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        R6.G r5 = R6.G.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6156r.e.c.a.emit(java.lang.Object, W6.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC6147i interfaceC6147i, W6.d dVar) {
                super(2, dVar);
                this.f35413g = interfaceC6147i;
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
                c cVar = new c(this.f35413g, dVar);
                cVar.f35412f = obj;
                return cVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35411e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    InterfaceC6096u interfaceC6096u = (InterfaceC6096u) this.f35412f;
                    InterfaceC6147i interfaceC6147i = this.f35413g;
                    a aVar = new a(interfaceC6096u);
                    this.f35411e = 1;
                    if (interfaceC6147i.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R6.r.throwOnFailure(obj);
                }
                return R6.G.INSTANCE;
            }

            @Override // f7.p
            public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d<? super R6.G> dVar) {
                return ((c) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j8, InterfaceC6147i interfaceC6147i, W6.d dVar) {
            super(3, dVar);
            this.f35402j = j8;
            this.f35403k = interfaceC6147i;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6148j interfaceC6148j;
            InterfaceC6098w interfaceC6098w;
            Ref.ObjectRef objectRef;
            InterfaceC6098w interfaceC6098wFixedPeriodTicker$default;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35399g;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                n7.L l8 = (n7.L) this.f35400h;
                InterfaceC6148j interfaceC6148j2 = (InterfaceC6148j) this.f35401i;
                InterfaceC6098w interfaceC6098wProduce$default = AbstractC6094s.produce$default(l8, null, -1, new c(this.f35403k, null), 1, null);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                interfaceC6148j = interfaceC6148j2;
                interfaceC6098w = interfaceC6098wProduce$default;
                objectRef = objectRef2;
                interfaceC6098wFixedPeriodTicker$default = AbstractC6156r.fixedPeriodTicker$default(l8, this.f35402j, 0L, 2, null);
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC6098wFixedPeriodTicker$default = (InterfaceC6098w) this.f35398f;
                objectRef = (Ref.ObjectRef) this.f35397e;
                interfaceC6098w = (InterfaceC6098w) this.f35401i;
                interfaceC6148j = (InterfaceC6148j) this.f35400h;
                R6.r.throwOnFailure(obj);
            }
            while (objectRef.element != r7.u.DONE) {
                v7.k kVar = new v7.k(getContext());
                kVar.invoke(interfaceC6098w.getOnReceiveCatching(), new a(objectRef, interfaceC6098wFixedPeriodTicker$default, null));
                kVar.invoke(interfaceC6098wFixedPeriodTicker$default.getOnReceive(), new b(objectRef, interfaceC6148j, null));
                this.f35400h = interfaceC6148j;
                this.f35401i = interfaceC6098w;
                this.f35397e = objectRef;
                this.f35398f = interfaceC6098wFixedPeriodTicker$default;
                this.f35399g = 1;
                if (kVar.doSelect(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return R6.G.INSTANCE;
        }

        @Override // f7.q
        public final Object invoke(n7.L l8, InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            e eVar = new e(this.f35402j, this.f35403k, dVar);
            eVar.f35400h = l8;
            eVar.f35401i = interfaceC6148j;
            return eVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.r$f */
    static final class f extends Y6.l implements f7.q {

        /* renamed from: e */
        long f35418e;

        /* renamed from: f */
        int f35419f;

        /* renamed from: g */
        private /* synthetic */ Object f35420g;

        /* renamed from: h */
        /* synthetic */ Object f35421h;

        /* renamed from: i */
        final /* synthetic */ long f35422i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC6147i f35423j;

        /* renamed from: q7.r$f$a */
        static final class a extends Y6.l implements f7.p {

            /* renamed from: e */
            int f35424e;

            /* renamed from: f */
            /* synthetic */ Object f35425f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC6148j f35426g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6148j interfaceC6148j, W6.d dVar) {
                super(2, dVar);
                this.f35426g = interfaceC6148j;
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
                a aVar = new a(this.f35426g, dVar);
                aVar.f35425f = obj;
                return aVar;
            }

            @Override // f7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m566invokeWpGqRn0(((C6071i) obj).m552unboximpl(), (W6.d) obj2);
            }

            /* renamed from: invoke-WpGqRn0 */
            public final Object m566invokeWpGqRn0(Object obj, W6.d<? super Boolean> dVar) {
                return ((a) create(C6071i.m540boximpl(obj), dVar)).invokeSuspend(R6.G.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
            @Override // Y6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
                /*
                    r4 = this;
                    java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f35424e
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.f35425f
                    R6.r.throwOnFailure(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    R6.r.throwOnFailure(r5)
                    java.lang.Object r5 = r4.f35425f
                    p7.i r5 = (p7.C6071i) r5
                    java.lang.Object r5 = r5.m552unboximpl()
                    q7.j r1 = r4.f35426g
                    boolean r3 = r5 instanceof p7.C6071i.c
                    if (r3 != 0) goto L37
                    r4.f35425f = r5
                    r4.f35424e = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof p7.C6071i.a
                    if (r0 == 0) goto L45
                    p7.C6071i.m544exceptionOrNullimpl(r5)
                    r5 = 0
                    java.lang.Boolean r5 = Y6.b.boxBoolean(r5)
                    return r5
                L45:
                    java.lang.Boolean r5 = Y6.b.boxBoolean(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6156r.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: q7.r$f$b */
        static final class b extends Y6.l implements f7.l {

            /* renamed from: e */
            int f35427e;

            /* renamed from: f */
            final /* synthetic */ long f35428f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j8, W6.d dVar) {
                super(1, dVar);
                this.f35428f = j8;
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(W6.d<?> dVar) {
                return new b(this.f35428f, dVar);
            }

            @Override // f7.l
            public final Object invoke(W6.d<?> dVar) {
                return ((b) create(dVar)).invokeSuspend(R6.G.INSTANCE);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                X6.b.getCOROUTINE_SUSPENDED();
                if (this.f35427e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
                throw new S0("Timed out waiting for " + ((Object) C5914a.m468toStringimpl(this.f35428f)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j8, InterfaceC6147i interfaceC6147i, W6.d dVar) {
            super(3, dVar);
            this.f35422i = j8;
            this.f35423j = interfaceC6147i;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0074 -> B:34:0x0077). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r9.f35419f
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.f35418e
                java.lang.Object r1 = r9.f35421h
                p7.w r1 = (p7.InterfaceC6098w) r1
                java.lang.Object r6 = r9.f35420g
                q7.j r6 = (q7.InterfaceC6148j) r6
                R6.r.throwOnFailure(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                R6.r.throwOnFailure(r10)
                java.lang.Object r10 = r9.f35420g
                n7.L r10 = (n7.L) r10
                java.lang.Object r1 = r9.f35421h
                q7.j r1 = (q7.InterfaceC6148j) r1
                long r4 = r9.f35422i
                m7.a$a r6 = m7.C5914a.Companion
                long r6 = r6.m501getZEROUwyO8pc()
                int r4 = m7.C5914a.m423compareToLRDsOJo(r4, r6)
                if (r4 <= 0) goto L82
                q7.i r4 = r9.f35423j
                r5 = 0
                r6 = 2
                q7.i r4 = q7.AbstractC6149k.buffer$default(r4, r5, r3, r6, r3)
                p7.w r10 = q7.AbstractC6149k.produceIn(r4, r10)
                long r4 = r9.f35422i
                r6 = r1
                r1 = r10
            L4b:
                v7.k r10 = new v7.k
                W6.g r7 = r9.getContext()
                r10.<init>(r7)
                v7.f r7 = r1.getOnReceiveCatching()
                q7.r$f$a r8 = new q7.r$f$a
                r8.<init>(r6, r3)
                r10.invoke(r7, r8)
                q7.r$f$b r7 = new q7.r$f$b
                r7.<init>(r4, r3)
                v7.AbstractC6453b.m592onTimeout8Mi8wO0(r10, r4, r7)
                r9.f35420g = r6
                r9.f35421h = r1
                r9.f35418e = r4
                r9.f35419f = r2
                java.lang.Object r10 = r10.doSelect(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                R6.G r10 = R6.G.INSTANCE
                return r10
            L82:
                n7.S0 r10 = new n7.S0
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6156r.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.q
        public final Object invoke(n7.L l8, InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            f fVar = new f(this.f35422i, this.f35423j, dVar);
            fVar.f35420g = l8;
            fVar.f35421h = interfaceC6148j;
            return fVar.invokeSuspend(R6.G.INSTANCE);
        }
    }

    private static final InterfaceC6147i a(InterfaceC6147i interfaceC6147i, f7.l lVar) {
        return AbstractC6199p.scopedFlow(new c(lVar, interfaceC6147i, null));
    }

    private static final InterfaceC6147i b(InterfaceC6147i interfaceC6147i, long j8) {
        return AbstractC6199p.scopedFlow(new f(j8, interfaceC6147i, null));
    }

    public static final <T> InterfaceC6147i debounce(InterfaceC6147i interfaceC6147i, long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? interfaceC6147i : a(interfaceC6147i, new a(j8));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* renamed from: debounce-HG0u8IE */
    public static final <T> InterfaceC6147i m561debounceHG0u8IE(InterfaceC6147i interfaceC6147i, long j8) {
        return AbstractC6149k.debounce(interfaceC6147i, n7.W.m527toDelayMillisLRDsOJo(j8));
    }

    public static final <T> InterfaceC6147i debounceDuration(InterfaceC6147i interfaceC6147i, f7.l lVar) {
        return a(interfaceC6147i, new b(lVar));
    }

    public static final InterfaceC6098w fixedPeriodTicker(n7.L l8, long j8, long j9) {
        if (j8 < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j8 + " ms").toString());
        }
        if (j9 >= 0) {
            return AbstractC6094s.produce$default(l8, null, 0, new d(j9, j8, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j9 + " ms").toString());
    }

    public static /* synthetic */ InterfaceC6098w fixedPeriodTicker$default(n7.L l8, long j8, long j9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j9 = j8;
        }
        return AbstractC6149k.fixedPeriodTicker(l8, j8, j9);
    }

    public static final <T> InterfaceC6147i sample(InterfaceC6147i interfaceC6147i, long j8) {
        if (j8 > 0) {
            return AbstractC6199p.scopedFlow(new e(j8, interfaceC6147i, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    /* renamed from: sample-HG0u8IE */
    public static final <T> InterfaceC6147i m562sampleHG0u8IE(InterfaceC6147i interfaceC6147i, long j8) {
        return AbstractC6149k.sample(interfaceC6147i, n7.W.m527toDelayMillisLRDsOJo(j8));
    }

    /* renamed from: timeout-HG0u8IE */
    public static final <T> InterfaceC6147i m563timeoutHG0u8IE(InterfaceC6147i interfaceC6147i, long j8) {
        return b(interfaceC6147i, j8);
    }

    public static final <T> InterfaceC6147i debounce(InterfaceC6147i interfaceC6147i, f7.l lVar) {
        return a(interfaceC6147i, lVar);
    }
}
