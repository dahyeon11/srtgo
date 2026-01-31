package r7;

import R6.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import n7.L;
import n7.M;
import p7.EnumC6064b;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;

/* renamed from: r7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6193j extends AbstractC6191h {

    /* renamed from: b, reason: collision with root package name */
    private final f7.q f35830b;

    /* renamed from: r7.j$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f35831e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f35832f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6148j f35834h;

        /* renamed from: r7.j$a$a, reason: collision with other inner class name */
        static final class C0401a implements InterfaceC6148j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f35835a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f35836b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C6193j f35837c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6148j f35838d;

            /* renamed from: r7.j$a$a$a, reason: collision with other inner class name */
            static final class C0402a extends Y6.l implements f7.p {

                /* renamed from: e, reason: collision with root package name */
                int f35839e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C6193j f35840f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC6148j f35841g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Object f35842h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0402a(C6193j c6193j, InterfaceC6148j interfaceC6148j, Object obj, W6.d dVar) {
                    super(2, dVar);
                    this.f35840f = c6193j;
                    this.f35841g = interfaceC6148j;
                    this.f35842h = obj;
                }

                @Override // Y6.a
                public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                    return new C0402a(this.f35840f, this.f35841g, this.f35842h, dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                    int i8 = this.f35839e;
                    if (i8 == 0) {
                        R6.r.throwOnFailure(obj);
                        f7.q qVar = this.f35840f.f35830b;
                        InterfaceC6148j interfaceC6148j = this.f35841g;
                        Object obj2 = this.f35842h;
                        this.f35839e = 1;
                        if (qVar.invoke(interfaceC6148j, obj2, this) == coroutine_suspended) {
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
                public final Object invoke(L l8, W6.d<? super G> dVar) {
                    return ((C0402a) create(l8, dVar)).invokeSuspend(G.INSTANCE);
                }
            }

            /* renamed from: r7.j$a$a$b */
            static final class b extends Y6.d {

                /* renamed from: d, reason: collision with root package name */
                Object f35843d;

                /* renamed from: e, reason: collision with root package name */
                Object f35844e;

                /* renamed from: f, reason: collision with root package name */
                Object f35845f;

                /* renamed from: g, reason: collision with root package name */
                /* synthetic */ Object f35846g;

                /* renamed from: i, reason: collision with root package name */
                int f35848i;

                b(W6.d dVar) {
                    super(dVar);
                }

                @Override // Y6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35846g = obj;
                    this.f35848i |= Integer.MIN_VALUE;
                    return C0401a.this.emit(null, this);
                }
            }

            C0401a(Ref.ObjectRef objectRef, L l8, C6193j c6193j, InterfaceC6148j interfaceC6148j) {
                this.f35835a = objectRef;
                this.f35836b = l8;
                this.f35837c = c6193j;
                this.f35838d = interfaceC6148j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r8v2, types: [T, n7.t0] */
            @Override // q7.InterfaceC6148j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof r7.C6193j.a.C0401a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    r7.j$a$a$b r0 = (r7.C6193j.a.C0401a.b) r0
                    int r1 = r0.f35848i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35848i = r1
                    goto L18
                L13:
                    r7.j$a$a$b r0 = new r7.j$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f35846g
                    java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f35848i
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f35845f
                    n7.t0 r8 = (n7.InterfaceC6008t0) r8
                    java.lang.Object r8 = r0.f35844e
                    java.lang.Object r0 = r0.f35843d
                    r7.j$a$a r0 = (r7.C6193j.a.C0401a) r0
                    R6.r.throwOnFailure(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    R6.r.throwOnFailure(r9)
                    kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f35835a
                    T r9 = r9.element
                    n7.t0 r9 = (n7.InterfaceC6008t0) r9
                    if (r9 == 0) goto L5d
                    r7.l r2 = new r7.l
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f35843d = r7
                    r0.f35844e = r8
                    r0.f35845f = r9
                    r0.f35848i = r3
                    java.lang.Object r9 = r9.join(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f35835a
                    n7.L r1 = r0.f35836b
                    n7.N r3 = n7.N.UNDISPATCHED
                    r7.j$a$a$a r4 = new r7.j$a$a$a
                    r7.j r2 = r0.f35837c
                    q7.j r0 = r0.f35838d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    n7.t0 r8 = n7.AbstractC5982g.launch$default(r1, r2, r3, r4, r5, r6)
                    r9.element = r8
                    R6.G r8 = R6.G.INSTANCE
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: r7.C6193j.a.C0401a.emit(java.lang.Object, W6.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6148j interfaceC6148j, W6.d dVar) {
            super(2, dVar);
            this.f35834h = interfaceC6148j;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            a aVar = C6193j.this.new a(this.f35834h, dVar);
            aVar.f35832f = obj;
            return aVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35831e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                L l8 = (L) this.f35832f;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                C6193j c6193j = C6193j.this;
                InterfaceC6147i interfaceC6147i = c6193j.f35826a;
                C0401a c0401a = new C0401a(objectRef, l8, c6193j, this.f35834h);
                this.f35831e = 1;
                if (interfaceC6147i.collect(c0401a, this) == coroutine_suspended) {
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
        public final Object invoke(L l8, W6.d<? super G> dVar) {
            return ((a) create(l8, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    public /* synthetic */ C6193j(f7.q qVar, InterfaceC6147i interfaceC6147i, W6.g gVar, int i8, EnumC6064b enumC6064b, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, interfaceC6147i, (i9 & 4) != 0 ? W6.h.INSTANCE : gVar, (i9 & 8) != 0 ? -2 : i8, (i9 & 16) != 0 ? EnumC6064b.SUSPEND : enumC6064b);
    }

    @Override // r7.AbstractC6188e
    protected AbstractC6188e d(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return new C6193j(this.f35830b, this.f35826a, gVar, i8, enumC6064b);
    }

    @Override // r7.AbstractC6191h
    protected Object h(InterfaceC6148j interfaceC6148j, W6.d dVar) {
        Object objCoroutineScope = M.coroutineScope(new a(interfaceC6148j, null), dVar);
        return objCoroutineScope == X6.b.getCOROUTINE_SUSPENDED() ? objCoroutineScope : G.INSTANCE;
    }

    public C6193j(f7.q qVar, InterfaceC6147i interfaceC6147i, W6.g gVar, int i8, EnumC6064b enumC6064b) {
        super(interfaceC6147i, gVar, i8, enumC6064b);
        this.f35830b = qVar;
    }
}
