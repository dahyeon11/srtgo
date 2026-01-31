package r7;

import R6.G;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import q7.InterfaceC6148j;

/* loaded from: classes3.dex */
public abstract class w {

    /* renamed from: a */
    private static final f7.q f35922a;

    /* synthetic */ class a extends FunctionReferenceImpl implements f7.q {
        public static final a INSTANCE = new a();

        a() {
            super(3, InterfaceC6148j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // f7.q
        public final Object invoke(InterfaceC6148j interfaceC6148j, Object obj, W6.d<? super G> dVar) {
            return interfaceC6148j.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.INSTANCE;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f35922a = (f7.q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(aVar, 3);
    }
}
