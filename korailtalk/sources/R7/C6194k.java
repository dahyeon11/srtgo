package r7;

import R6.G;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.AbstractC5986i;
import n7.L;
import p7.AbstractC6094s;
import p7.EnumC6064b;
import p7.InterfaceC6096u;
import p7.InterfaceC6098w;
import q7.InterfaceC6147i;

/* renamed from: r7.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6194k extends AbstractC6188e {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f35849a;

    /* renamed from: r7.k$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f35850e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6147i f35851f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ y f35852g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6147i interfaceC6147i, y yVar, W6.d dVar) {
            super(2, dVar);
            this.f35851f = interfaceC6147i;
            this.f35852g = yVar;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            return new a(this.f35851f, this.f35852g, dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f35850e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                InterfaceC6147i interfaceC6147i = this.f35851f;
                y yVar = this.f35852g;
                this.f35850e = 1;
                if (interfaceC6147i.collect(yVar, this) == coroutine_suspended) {
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

    public /* synthetic */ C6194k(Iterable iterable, W6.g gVar, int i8, EnumC6064b enumC6064b, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i9 & 2) != 0 ? W6.h.INSTANCE : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? EnumC6064b.SUSPEND : enumC6064b);
    }

    @Override // r7.AbstractC6188e
    protected Object c(InterfaceC6096u interfaceC6096u, W6.d dVar) {
        y yVar = new y(interfaceC6096u);
        Iterator it = this.f35849a.iterator();
        while (it.hasNext()) {
            AbstractC5986i.launch$default(interfaceC6096u, null, null, new a((InterfaceC6147i) it.next(), yVar, null), 3, null);
        }
        return G.INSTANCE;
    }

    @Override // r7.AbstractC6188e
    protected AbstractC6188e d(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return new C6194k(this.f35849a, gVar, i8, enumC6064b);
    }

    @Override // r7.AbstractC6188e
    public InterfaceC6098w produceImpl(L l8) {
        return AbstractC6094s.produce(l8, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    public C6194k(Iterable<? extends InterfaceC6147i> iterable, W6.g gVar, int i8, EnumC6064b enumC6064b) {
        super(gVar, i8, enumC6064b);
        this.f35849a = iterable;
    }
}
