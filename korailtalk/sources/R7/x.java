package r7;

import R6.G;
import W6.g;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n7.InterfaceC6008t0;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;

/* loaded from: classes3.dex */
public abstract class x {

    static final class a extends Lambda implements f7.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f35923a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v vVar) {
            super(2);
            this.f35923a = vVar;
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (g.b) obj2);
        }

        public final Integer invoke(int i8, g.b bVar) {
            g.c key = bVar.getKey();
            g.b bVar2 = this.f35923a.collectContext.get(key);
            if (key != InterfaceC6008t0.Key) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i8 + 1);
            }
            InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) bVar2;
            Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC6008t0 interfaceC6008t0TransitiveCoroutineParent = x.transitiveCoroutineParent((InterfaceC6008t0) bVar, interfaceC6008t0);
            if (interfaceC6008t0TransitiveCoroutineParent == interfaceC6008t0) {
                if (interfaceC6008t0 != null) {
                    i8++;
                }
                return Integer.valueOf(i8);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC6008t0TransitiveCoroutineParent + ", expected child of " + interfaceC6008t0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }

    public static final class b implements InterfaceC6147i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.p f35924a;

        public static final class a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f35925d;

            /* renamed from: f, reason: collision with root package name */
            int f35927f;

            public a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f35925d = obj;
                this.f35927f |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(f7.p pVar) {
            this.f35924a = pVar;
        }

        @Override // q7.InterfaceC6147i
        public Object collect(InterfaceC6148j interfaceC6148j, W6.d<? super G> dVar) {
            Object objInvoke = this.f35924a.invoke(interfaceC6148j, dVar);
            return objInvoke == X6.b.getCOROUTINE_SUSPENDED() ? objInvoke : G.INSTANCE;
        }

        public Object collect$$forInline(InterfaceC6148j interfaceC6148j, W6.d<? super G> dVar) {
            InlineMarker.mark(4);
            new a(dVar);
            InlineMarker.mark(5);
            this.f35924a.invoke(interfaceC6148j, dVar);
            return G.INSTANCE;
        }
    }

    public static final void checkContext(v vVar, W6.g gVar) {
        if (((Number) gVar.fold(0, new a(vVar))).intValue() == vVar.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.collectContext + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC6008t0 transitiveCoroutineParent(InterfaceC6008t0 interfaceC6008t0, InterfaceC6008t0 interfaceC6008t02) {
        while (interfaceC6008t0 != null) {
            if (interfaceC6008t0 == interfaceC6008t02) {
                return interfaceC6008t0;
            }
            if (!(interfaceC6008t0 instanceof s7.G)) {
                return interfaceC6008t0;
            }
            interfaceC6008t0 = interfaceC6008t0.getParent();
        }
        return null;
    }

    public static final <T> InterfaceC6147i unsafeFlow(f7.p pVar) {
        return new b(pVar);
    }
}
