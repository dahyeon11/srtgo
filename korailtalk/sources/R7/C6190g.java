package r7;

import R6.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.InterfaceC6008t0;
import n7.L;
import p7.AbstractC6094s;
import p7.EnumC6064b;
import p7.InterfaceC6096u;
import p7.InterfaceC6098w;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;
import w7.AbstractC6478c;
import w7.InterfaceC6476a;

/* renamed from: r7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6190g extends AbstractC6188e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6147i f35811a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35812b;

    /* renamed from: r7.g$a */
    static final class a implements InterfaceC6148j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6008t0 f35813a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6476a f35814b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6096u f35815c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ y f35816d;

        /* renamed from: r7.g$a$a, reason: collision with other inner class name */
        static final class C0400a extends Y6.l implements f7.p {

            /* renamed from: e, reason: collision with root package name */
            int f35817e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6147i f35818f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ y f35819g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC6476a f35820h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0400a(InterfaceC6147i interfaceC6147i, y yVar, InterfaceC6476a interfaceC6476a, W6.d dVar) {
                super(2, dVar);
                this.f35818f = interfaceC6147i;
                this.f35819g = yVar;
                this.f35820h = interfaceC6476a;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return new C0400a(this.f35818f, this.f35819g, this.f35820h, dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35817e;
                try {
                    if (i8 == 0) {
                        R6.r.throwOnFailure(obj);
                        InterfaceC6147i interfaceC6147i = this.f35818f;
                        y yVar = this.f35819g;
                        this.f35817e = 1;
                        if (interfaceC6147i.collect(yVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        R6.r.throwOnFailure(obj);
                    }
                    this.f35820h.release();
                    return G.INSTANCE;
                } catch (Throwable th) {
                    this.f35820h.release();
                    throw th;
                }
            }

            @Override // f7.p
            public final Object invoke(L l8, W6.d<? super G> dVar) {
                return ((C0400a) create(l8, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        /* renamed from: r7.g$a$b */
        static final class b extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            Object f35821d;

            /* renamed from: e, reason: collision with root package name */
            Object f35822e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f35823f;

            /* renamed from: h, reason: collision with root package name */
            int f35825h;

            b(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35823f = obj;
                this.f35825h |= Integer.MIN_VALUE;
                return a.this.emit((InterfaceC6147i) null, (W6.d<? super G>) this);
            }
        }

        a(InterfaceC6008t0 interfaceC6008t0, InterfaceC6476a interfaceC6476a, InterfaceC6096u interfaceC6096u, y yVar) {
            this.f35813a = interfaceC6008t0;
            this.f35814b = interfaceC6476a;
            this.f35815c = interfaceC6096u;
            this.f35816d = yVar;
        }

        @Override // q7.InterfaceC6148j
        public /* bridge */ /* synthetic */ Object emit(Object obj, W6.d dVar) {
            return emit((InterfaceC6147i) obj, (W6.d<? super G>) dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(q7.InterfaceC6147i r8, W6.d<? super R6.G> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof r7.C6190g.a.b
                if (r0 == 0) goto L13
                r0 = r9
                r7.g$a$b r0 = (r7.C6190g.a.b) r0
                int r1 = r0.f35825h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f35825h = r1
                goto L18
            L13:
                r7.g$a$b r0 = new r7.g$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f35823f
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f35825h
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f35822e
                q7.i r8 = (q7.InterfaceC6147i) r8
                java.lang.Object r0 = r0.f35821d
                r7.g$a r0 = (r7.C6190g.a) r0
                R6.r.throwOnFailure(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                R6.r.throwOnFailure(r9)
                n7.t0 r9 = r7.f35813a
                if (r9 == 0) goto L43
                n7.AbstractC6016x0.ensureActive(r9)
            L43:
                w7.a r9 = r7.f35814b
                r0.f35821d = r7
                r0.f35822e = r8
                r0.f35825h = r3
                java.lang.Object r9 = r9.acquire(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                p7.u r1 = r0.f35815c
                r7.g$a$a r4 = new r7.g$a$a
                r7.y r9 = r0.f35816d
                w7.a r0 = r0.f35814b
                r2 = 0
                r4.<init>(r8, r9, r0, r2)
                r5 = 3
                r6 = 0
                r3 = 0
                n7.AbstractC5982g.launch$default(r1, r2, r3, r4, r5, r6)
                R6.G r8 = R6.G.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.C6190g.a.emit(q7.i, W6.d):java.lang.Object");
        }
    }

    public /* synthetic */ C6190g(InterfaceC6147i interfaceC6147i, int i8, W6.g gVar, int i9, EnumC6064b enumC6064b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6147i, i8, (i10 & 4) != 0 ? W6.h.INSTANCE : gVar, (i10 & 8) != 0 ? -2 : i9, (i10 & 16) != 0 ? EnumC6064b.SUSPEND : enumC6064b);
    }

    @Override // r7.AbstractC6188e
    protected String a() {
        return "concurrency=" + this.f35812b;
    }

    @Override // r7.AbstractC6188e
    protected Object c(InterfaceC6096u interfaceC6096u, W6.d dVar) {
        Object objCollect = this.f35811a.collect(new a((InterfaceC6008t0) dVar.getContext().get(InterfaceC6008t0.Key), AbstractC6478c.Semaphore$default(this.f35812b, 0, 2, null), interfaceC6096u, new y(interfaceC6096u)), dVar);
        return objCollect == X6.b.getCOROUTINE_SUSPENDED() ? objCollect : G.INSTANCE;
    }

    @Override // r7.AbstractC6188e
    protected AbstractC6188e d(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return new C6190g(this.f35811a, this.f35812b, gVar, i8, enumC6064b);
    }

    @Override // r7.AbstractC6188e
    public InterfaceC6098w produceImpl(L l8) {
        return AbstractC6094s.produce(l8, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    public C6190g(InterfaceC6147i interfaceC6147i, int i8, W6.g gVar, int i9, EnumC6064b enumC6064b) {
        super(gVar, i9, enumC6064b);
        this.f35811a = interfaceC6147i;
        this.f35812b = i8;
    }
}
