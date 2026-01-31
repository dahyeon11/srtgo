package q7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import n7.AbstractC5982g;
import n7.AbstractC5986i;
import n7.AbstractC6016x0;
import n7.AbstractC6017y;
import n7.InterfaceC6008t0;
import n7.InterfaceC6013w;

/* renamed from: q7.z */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6164z {

    /* renamed from: q7.z$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35688e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC6128N f35689f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6147i f35690g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC6117C f35691h;

        /* renamed from: i */
        final /* synthetic */ Object f35692i;

        /* renamed from: q7.z$a$a */
        static final class C0395a extends Y6.l implements f7.p {

            /* renamed from: e */
            int f35693e;

            /* renamed from: f */
            /* synthetic */ int f35694f;

            C0395a(W6.d dVar) {
                super(2, dVar);
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
                C0395a c0395a = new C0395a(dVar);
                c0395a.f35694f = ((Number) obj).intValue();
                return c0395a;
            }

            public final Object invoke(int i8, W6.d<? super Boolean> dVar) {
                return ((C0395a) create(Integer.valueOf(i8), dVar)).invokeSuspend(R6.G.INSTANCE);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                X6.b.getCOROUTINE_SUSPENDED();
                if (this.f35693e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
                return Y6.b.boxBoolean(this.f35694f > 0);
            }

            @Override // f7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (W6.d<? super Boolean>) obj2);
            }
        }

        /* renamed from: q7.z$a$b */
        static final class b extends Y6.l implements f7.p {

            /* renamed from: e */
            int f35695e;

            /* renamed from: f */
            /* synthetic */ Object f35696f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC6147i f35697g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC6117C f35698h;

            /* renamed from: i */
            final /* synthetic */ Object f35699i;

            /* renamed from: q7.z$a$b$a */
            public /* synthetic */ class C0396a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC6126L.values().length];
                    try {
                        iArr[EnumC6126L.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC6126L.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC6126L.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC6147i interfaceC6147i, InterfaceC6117C interfaceC6117C, Object obj, W6.d dVar) {
                super(2, dVar);
                this.f35697g = interfaceC6147i;
                this.f35698h = interfaceC6117C;
                this.f35699i = obj;
            }

            @Override // Y6.a
            public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
                b bVar = new b(this.f35697g, this.f35698h, this.f35699i, dVar);
                bVar.f35696f = obj;
                return bVar;
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35695e;
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    int i9 = C0396a.$EnumSwitchMapping$0[((EnumC6126L) this.f35696f).ordinal()];
                    if (i9 == 1) {
                        InterfaceC6147i interfaceC6147i = this.f35697g;
                        InterfaceC6117C interfaceC6117C = this.f35698h;
                        this.f35695e = 1;
                        if (interfaceC6147i.collect(interfaceC6117C, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i9 == 3) {
                        Object obj2 = this.f35699i;
                        if (obj2 == AbstractC6124J.NO_VALUE) {
                            this.f35698h.resetReplayCache();
                        } else {
                            this.f35698h.tryEmit(obj2);
                        }
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
            public final Object invoke(EnumC6126L enumC6126L, W6.d<? super R6.G> dVar) {
                return ((b) create(enumC6126L, dVar)).invokeSuspend(R6.G.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6128N interfaceC6128N, InterfaceC6147i interfaceC6147i, InterfaceC6117C interfaceC6117C, Object obj, W6.d dVar) {
            super(2, dVar);
            this.f35689f = interfaceC6128N;
            this.f35690g = interfaceC6147i;
            this.f35691h = interfaceC6117C;
            this.f35692i = obj;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            return new a(this.f35689f, this.f35690g, this.f35691h, this.f35692i, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0068 A[RETURN] */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r7.f35688e
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                R6.r.throwOnFailure(r8)
                goto L5c
            L21:
                R6.r.throwOnFailure(r8)
                goto L8d
            L25:
                R6.r.throwOnFailure(r8)
                q7.N r8 = r7.f35689f
                q7.N$a r1 = q7.InterfaceC6128N.Companion
                q7.N r6 = r1.getEagerly()
                if (r8 != r6) goto L3f
                q7.i r8 = r7.f35690g
                q7.C r1 = r7.f35691h
                r7.f35688e = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                q7.N r8 = r7.f35689f
                q7.N r1 = r1.getLazily()
                r5 = 0
                if (r8 != r1) goto L69
                q7.C r8 = r7.f35691h
                q7.S r8 = r8.getSubscriptionCount()
                q7.z$a$a r1 = new q7.z$a$a
                r1.<init>(r5)
                r7.f35688e = r4
                java.lang.Object r8 = q7.AbstractC6149k.first(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                q7.i r8 = r7.f35690g
                q7.C r1 = r7.f35691h
                r7.f35688e = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                q7.N r8 = r7.f35689f
                q7.C r1 = r7.f35691h
                q7.S r1 = r1.getSubscriptionCount()
                q7.i r8 = r8.command(r1)
                q7.i r8 = q7.AbstractC6149k.distinctUntilChanged(r8)
                q7.z$a$b r1 = new q7.z$a$b
                q7.i r3 = r7.f35690g
                q7.C r4 = r7.f35691h
                java.lang.Object r6 = r7.f35692i
                r1.<init>(r3, r4, r6, r5)
                r7.f35688e = r2
                java.lang.Object r8 = q7.AbstractC6149k.collectLatest(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                R6.G r8 = R6.G.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6164z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(n7.L l8, W6.d<? super R6.G> dVar) {
            return ((a) create(l8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: q7.z$b */
    static final class b extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35700e;

        /* renamed from: f */
        private /* synthetic */ Object f35701f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6147i f35702g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC6013w f35703h;

        /* renamed from: q7.z$b$a */
        static final class a implements InterfaceC6148j {

            /* renamed from: a */
            final /* synthetic */ Ref.ObjectRef f35704a;

            /* renamed from: b */
            final /* synthetic */ n7.L f35705b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC6013w f35706c;

            a(Ref.ObjectRef objectRef, n7.L l8, InterfaceC6013w interfaceC6013w) {
                this.f35704a = objectRef;
                this.f35705b = l8;
                this.f35706c = interfaceC6013w;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, q7.D, q7.S] */
            @Override // q7.InterfaceC6148j
            public final Object emit(Object obj, W6.d<? super R6.G> dVar) {
                R6.G g8;
                InterfaceC6118D interfaceC6118D = (InterfaceC6118D) this.f35704a.element;
                if (interfaceC6118D != null) {
                    interfaceC6118D.setValue(obj);
                    g8 = R6.G.INSTANCE;
                } else {
                    g8 = null;
                }
                if (g8 == null) {
                    n7.L l8 = this.f35705b;
                    Ref.ObjectRef objectRef = this.f35704a;
                    InterfaceC6013w interfaceC6013w = this.f35706c;
                    ?? MutableStateFlow = AbstractC6134U.MutableStateFlow(obj);
                    interfaceC6013w.complete(new C6120F(MutableStateFlow, AbstractC6016x0.getJob(l8.getCoroutineContext())));
                    objectRef.element = MutableStateFlow;
                }
                return R6.G.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6147i interfaceC6147i, InterfaceC6013w interfaceC6013w, W6.d dVar) {
            super(2, dVar);
            this.f35702g = interfaceC6147i;
            this.f35703h = interfaceC6013w;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            b bVar = new b(this.f35702g, this.f35703h, dVar);
            bVar.f35701f = obj;
            return bVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35700e;
            try {
                if (i8 == 0) {
                    R6.r.throwOnFailure(obj);
                    n7.L l8 = (n7.L) this.f35701f;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    InterfaceC6147i interfaceC6147i = this.f35702g;
                    a aVar = new a(objectRef, l8, this.f35703h);
                    this.f35700e = 1;
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
            } catch (Throwable th) {
                this.f35703h.completeExceptionally(th);
                throw th;
            }
        }

        @Override // f7.p
        public final Object invoke(n7.L l8, W6.d<? super R6.G> dVar) {
            return ((b) create(l8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final q7.C6127M a(q7.InterfaceC6147i r7, int r8) {
        /*
            p7.e$b r0 = p7.InterfaceC6067e.Factory
            int r0 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            int r0 = j7.s.coerceAtLeast(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof r7.AbstractC6188e
            if (r1 == 0) goto L3c
            r1 = r7
            r7.e r1 = (r7.AbstractC6188e) r1
            q7.i r2 = r1.dropChannelOperators()
            if (r2 == 0) goto L3c
            q7.M r7 = new q7.M
            int r3 = r1.capacity
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            p7.b r4 = r1.onBufferOverflow
            p7.b r5 = p7.EnumC6064b.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            p7.b r8 = r1.onBufferOverflow
            W6.g r1 = r1.context
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            q7.M r8 = new q7.M
            p7.b r1 = p7.EnumC6064b.SUSPEND
            W6.h r2 = W6.h.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.AbstractC6164z.a(q7.i, int):q7.M");
    }

    public static final <T> InterfaceC6122H asSharedFlow(InterfaceC6117C interfaceC6117C) {
        return new C6119E(interfaceC6117C, null);
    }

    public static final <T> InterfaceC6132S asStateFlow(InterfaceC6118D interfaceC6118D) {
        return new C6120F(interfaceC6118D, null);
    }

    private static final InterfaceC6008t0 b(n7.L l8, W6.g gVar, InterfaceC6147i interfaceC6147i, InterfaceC6117C interfaceC6117C, InterfaceC6128N interfaceC6128N, Object obj) {
        return AbstractC5982g.launch(l8, gVar, Intrinsics.areEqual(interfaceC6128N, InterfaceC6128N.Companion.getEagerly()) ? n7.N.DEFAULT : n7.N.UNDISPATCHED, new a(interfaceC6128N, interfaceC6147i, interfaceC6117C, obj, null));
    }

    private static final void c(n7.L l8, W6.g gVar, InterfaceC6147i interfaceC6147i, InterfaceC6013w interfaceC6013w) {
        AbstractC5986i.launch$default(l8, gVar, null, new b(interfaceC6147i, interfaceC6013w, null), 2, null);
    }

    public static final <T> InterfaceC6122H onSubscription(InterfaceC6122H interfaceC6122H, f7.p pVar) {
        return new C6137X(interfaceC6122H, pVar);
    }

    public static final <T> InterfaceC6122H shareIn(InterfaceC6147i interfaceC6147i, n7.L l8, InterfaceC6128N interfaceC6128N, int i8) {
        C6127M c6127mA = a(interfaceC6147i, i8);
        InterfaceC6117C interfaceC6117CMutableSharedFlow = AbstractC6124J.MutableSharedFlow(i8, c6127mA.extraBufferCapacity, c6127mA.onBufferOverflow);
        return new C6119E(interfaceC6117CMutableSharedFlow, b(l8, c6127mA.context, c6127mA.upstream, interfaceC6117CMutableSharedFlow, interfaceC6128N, AbstractC6124J.NO_VALUE));
    }

    public static /* synthetic */ InterfaceC6122H shareIn$default(InterfaceC6147i interfaceC6147i, n7.L l8, InterfaceC6128N interfaceC6128N, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return AbstractC6149k.shareIn(interfaceC6147i, l8, interfaceC6128N, i8);
    }

    public static final <T> InterfaceC6132S stateIn(InterfaceC6147i interfaceC6147i, n7.L l8, InterfaceC6128N interfaceC6128N, T t8) {
        C6127M c6127mA = a(interfaceC6147i, 1);
        InterfaceC6118D interfaceC6118DMutableStateFlow = AbstractC6134U.MutableStateFlow(t8);
        return new C6120F(interfaceC6118DMutableStateFlow, b(l8, c6127mA.context, c6127mA.upstream, interfaceC6118DMutableStateFlow, interfaceC6128N, t8));
    }

    public static final <T> Object stateIn(InterfaceC6147i interfaceC6147i, n7.L l8, W6.d<? super InterfaceC6132S> dVar) {
        C6127M c6127mA = a(interfaceC6147i, 1);
        InterfaceC6013w interfaceC6013wCompletableDeferred$default = AbstractC6017y.CompletableDeferred$default(null, 1, null);
        c(l8, c6127mA.context, c6127mA.upstream, interfaceC6013wCompletableDeferred$default);
        return interfaceC6013wCompletableDeferred$default.await(dVar);
    }
}
