package s0;

import R6.G;
import R6.r;
import Y6.l;
import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.d;
import com.google.common.util.concurrent.C;
import f7.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n7.AbstractC5986i;
import n7.C5971a0;
import n7.L;
import n7.M;
import q0.AbstractC6103b;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6206a {
    public static final b Companion = new b(null);

    /* renamed from: s0.a$a, reason: collision with other inner class name */
    private static final class C0418a extends AbstractC6206a {

        /* renamed from: a, reason: collision with root package name */
        private final d f36130a;

        /* renamed from: s0.a$a$a, reason: collision with other inner class name */
        static final class C0419a extends l implements p {

            /* renamed from: e, reason: collision with root package name */
            int f36131e;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.a f36133g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0419a(androidx.privacysandbox.ads.adservices.topics.a aVar, W6.d dVar) {
                super(2, dVar);
                this.f36133g = aVar;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return C0418a.this.new C0419a(this.f36133g, dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f36131e;
                if (i8 == 0) {
                    r.throwOnFailure(obj);
                    d dVar = C0418a.this.f36130a;
                    androidx.privacysandbox.ads.adservices.topics.a aVar = this.f36133g;
                    this.f36131e = 1;
                    obj = dVar.getTopics(aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.throwOnFailure(obj);
                }
                return obj;
            }

            @Override // f7.p
            public final Object invoke(L l8, W6.d<? super androidx.privacysandbox.ads.adservices.topics.b> dVar) {
                return ((C0419a) create(l8, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        public C0418a(d mTopicsManager) {
            Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
            this.f36130a = mTopicsManager;
        }

        @Override // s0.AbstractC6206a
        public C getTopicsAsync(androidx.privacysandbox.ads.adservices.topics.a request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return AbstractC6103b.asListenableFuture$default(AbstractC5986i.async$default(M.CoroutineScope(C5971a0.getMain()), null, null, new C0419a(request, null), 3, null), null, 1, null);
        }
    }

    /* renamed from: s0.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6206a from(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            d dVarObtain = d.Companion.obtain(context);
            if (dVarObtain != null) {
                return new C0418a(dVarObtain);
            }
            return null;
        }

        private b() {
        }
    }

    public static final AbstractC6206a from(Context context) {
        return Companion.from(context);
    }

    public abstract C getTopicsAsync(androidx.privacysandbox.ads.adservices.topics.a aVar);
}
