package v7;

import R6.G;
import f7.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import n7.W;

/* renamed from: v7.a */
/* loaded from: classes3.dex */
final class C6452a {

    /* renamed from: a */
    private final long f37322a;

    /* renamed from: v7.a$a */
    public static final class RunnableC0428a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ l f37323a;

        /* renamed from: b */
        final /* synthetic */ C6452a f37324b;

        public RunnableC0428a(l lVar, C6452a c6452a) {
            this.f37323a = lVar;
            this.f37324b = c6452a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f37323a.trySelect(this.f37324b, G.INSTANCE);
        }
    }

    /* renamed from: v7.a$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements q {
        public static final b INSTANCE = new b();

        b() {
            super(3, C6452a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // f7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((C6452a) obj, (l) obj2, obj3);
            return G.INSTANCE;
        }

        public final void invoke(C6452a c6452a, l lVar, Object obj) {
            c6452a.a(lVar, obj);
        }
    }

    public C6452a(long j8) {
        this.f37322a = j8;
    }

    public final void a(l lVar, Object obj) {
        if (this.f37322a <= 0) {
            lVar.selectInRegistrationPhase(G.INSTANCE);
            return;
        }
        RunnableC0428a runnableC0428a = new RunnableC0428a(lVar, this);
        Intrinsics.checkNotNull(lVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        W6.g context = lVar.getContext();
        lVar.disposeOnCompletion(W.getDelay(context).invokeOnTimeout(this.f37322a, runnableC0428a, context));
    }

    public final d getSelectClause() {
        b bVar = b.INSTANCE;
        Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new e(this, (q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bVar, 3), null, 4, null);
    }

    public static /* synthetic */ void getSelectClause$annotations() {
    }
}
