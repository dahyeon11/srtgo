package q7;

import R6.C0751e;
import kotlin.jvm.internal.Ref;

/* renamed from: q7.P, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6130P implements InterfaceC6128N {

    /* renamed from: q7.P$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f35199e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f35200f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6132S f35201g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6132S interfaceC6132S, W6.d dVar) {
            super(2, dVar);
            this.f35201g = interfaceC6132S;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            a aVar = new a(this.f35201g, dVar);
            aVar.f35200f = obj;
            return aVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35199e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6148j interfaceC6148j = (InterfaceC6148j) this.f35200f;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                InterfaceC6132S interfaceC6132S = this.f35201g;
                C0378a c0378a = new C0378a(booleanRef, interfaceC6148j);
                this.f35199e = 1;
                if (interfaceC6132S.collect(c0378a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
            }
            throw new C0751e();
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
            return ((a) create(interfaceC6148j, dVar)).invokeSuspend(R6.G.INSTANCE);
        }

        /* renamed from: q7.P$a$a, reason: collision with other inner class name */
        static final class C0378a implements InterfaceC6148j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f35202a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6148j f35203b;

            /* renamed from: q7.P$a$a$a, reason: collision with other inner class name */
            static final class C0379a extends Y6.d {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f35204d;

                /* renamed from: f, reason: collision with root package name */
                int f35206f;

                C0379a(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35204d = obj;
                    this.f35206f |= Integer.MIN_VALUE;
                    return C0378a.this.emit(0, this);
                }
            }

            C0378a(Ref.BooleanRef booleanRef, InterfaceC6148j interfaceC6148j) {
                this.f35202a = booleanRef;
                this.f35203b = interfaceC6148j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(int r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof q7.C6130P.a.C0378a.C0379a
                    if (r0 == 0) goto L13
                    r0 = r6
                    q7.P$a$a$a r0 = (q7.C6130P.a.C0378a.C0379a) r0
                    int r1 = r0.f35206f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35206f = r1
                    goto L18
                L13:
                    q7.P$a$a$a r0 = new q7.P$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f35204d
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35206f
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    R6.r.throwOnFailure(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    R6.r.throwOnFailure(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f35202a
                    boolean r6 = r5.element
                    if (r6 != 0) goto L4e
                    r5.element = r3
                    q7.j r5 = r4.f35203b
                    q7.L r6 = q7.EnumC6126L.START
                    r0.f35206f = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    R6.G r5 = R6.G.INSTANCE
                    return r5
                L4e:
                    R6.G r5 = R6.G.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.C6130P.a.C0378a.emit(int, W6.d):java.lang.Object");
            }

            @Override // q7.InterfaceC6148j
            public /* bridge */ /* synthetic */ Object emit(Object obj, W6.d dVar) {
                return emit(((Number) obj).intValue(), (W6.d<? super R6.G>) dVar);
            }
        }
    }

    @Override // q7.InterfaceC6128N
    public InterfaceC6147i command(InterfaceC6132S interfaceC6132S) {
        return AbstractC6149k.flow(new a(interfaceC6132S, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
