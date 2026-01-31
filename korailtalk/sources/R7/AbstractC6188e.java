package r7;

import R6.G;
import java.util.ArrayList;
import n7.L;
import n7.M;
import n7.N;
import n7.P;
import p7.AbstractC6094s;
import p7.EnumC6064b;
import p7.InterfaceC6096u;
import p7.InterfaceC6098w;
import q7.AbstractC6149k;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;

/* renamed from: r7.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6188e implements r {
    public final int capacity;
    public final W6.g context;
    public final EnumC6064b onBufferOverflow;

    /* renamed from: r7.e$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35804e;

        /* renamed from: f */
        private /* synthetic */ Object f35805f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6148j f35806g;

        /* renamed from: h */
        final /* synthetic */ AbstractC6188e f35807h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6148j interfaceC6148j, AbstractC6188e abstractC6188e, W6.d dVar) {
            super(2, dVar);
            this.f35806g = interfaceC6148j;
            this.f35807h = abstractC6188e;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            a aVar = new a(this.f35806g, this.f35807h, dVar);
            aVar.f35805f = obj;
            return aVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35804e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                L l8 = (L) this.f35805f;
                InterfaceC6148j interfaceC6148j = this.f35806g;
                InterfaceC6098w interfaceC6098wProduceImpl = this.f35807h.produceImpl(l8);
                this.f35804e = 1;
                if (AbstractC6149k.emitAll(interfaceC6148j, interfaceC6098wProduceImpl, this) == coroutine_suspended) {
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

    /* renamed from: r7.e$b */
    static final class b extends Y6.l implements f7.p {

        /* renamed from: e */
        int f35808e;

        /* renamed from: f */
        /* synthetic */ Object f35809f;

        b(W6.d dVar) {
            super(2, dVar);
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            b bVar = AbstractC6188e.this.new b(dVar);
            bVar.f35809f = obj;
            return bVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35808e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6096u interfaceC6096u = (InterfaceC6096u) this.f35809f;
                AbstractC6188e abstractC6188e = AbstractC6188e.this;
                this.f35808e = 1;
                if (abstractC6188e.c(interfaceC6096u, this) == coroutine_suspended) {
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
            return ((b) create(interfaceC6096u, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    public AbstractC6188e(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        this.context = gVar;
        this.capacity = i8;
        this.onBufferOverflow = enumC6064b;
    }

    static /* synthetic */ Object b(AbstractC6188e abstractC6188e, InterfaceC6148j interfaceC6148j, W6.d dVar) {
        Object objCoroutineScope = M.coroutineScope(new a(interfaceC6148j, abstractC6188e, null), dVar);
        return objCoroutineScope == X6.b.getCOROUTINE_SUSPENDED() ? objCoroutineScope : G.INSTANCE;
    }

    protected String a() {
        return null;
    }

    protected abstract Object c(InterfaceC6096u interfaceC6096u, W6.d dVar);

    @Override // r7.r, q7.InterfaceC6147i
    public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super G> dVar) {
        return b(this, interfaceC6148j, dVar);
    }

    protected abstract AbstractC6188e d(W6.g gVar, int i8, EnumC6064b enumC6064b);

    public InterfaceC6147i dropChannelOperators() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    @Override // r7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q7.InterfaceC6147i fuse(W6.g r2, int r3, p7.EnumC6064b r4) {
        /*
            r1 = this;
            W6.g r0 = r1.context
            W6.g r2 = r2.plus(r0)
            p7.b r0 = p7.EnumC6064b.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.capacity
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            p7.b r4 = r1.onBufferOverflow
        L25:
            W6.g r0 = r1.context
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.capacity
            if (r3 != r0) goto L36
            p7.b r0 = r1.onBufferOverflow
            if (r4 != r0) goto L36
            return r1
        L36:
            r7.e r2 = r1.d(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.AbstractC6188e.fuse(W6.g, int, p7.b):q7.i");
    }

    public final f7.p getCollectToFun$kotlinx_coroutines_core() {
        return new b(null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i8 = this.capacity;
        if (i8 == -3) {
            return -2;
        }
        return i8;
    }

    public InterfaceC6098w produceImpl(L l8) {
        return AbstractC6094s.produce$default(l8, this.context, getProduceCapacity$kotlinx_coroutines_core(), this.onBufferOverflow, N.ATOMIC, null, getCollectToFun$kotlinx_coroutines_core(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strA = a();
        if (strA != null) {
            arrayList.add(strA);
        }
        if (this.context != W6.h.INSTANCE) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != EnumC6064b.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return P.getClassSimpleName(this) + '[' + S6.r.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
