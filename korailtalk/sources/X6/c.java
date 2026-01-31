package X6;

import R6.G;
import R6.r;
import W6.g;
import W6.h;
import Y6.j;
import f7.l;
import f7.p;
import f7.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes3.dex */
public class c {

    public static final class a extends j {

        /* renamed from: b */
        private int f5469b;

        /* renamed from: c */
        final /* synthetic */ l f5470c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W6.d dVar, l lVar) {
            super(dVar);
            this.f5470c = lVar;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Y6.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i8 = this.f5469b;
            if (i8 == 0) {
                this.f5469b = 1;
                r.throwOnFailure(obj);
                Intrinsics.checkNotNull(this.f5470c, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((l) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.f5470c, 1)).invoke(this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f5469b = 2;
            r.throwOnFailure(obj);
            return obj;
        }
    }

    public static final class b extends Y6.d {

        /* renamed from: d */
        private int f5471d;

        /* renamed from: e */
        final /* synthetic */ l f5472e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(W6.d dVar, g gVar, l lVar) {
            super(dVar, gVar);
            this.f5472e = lVar;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Y6.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i8 = this.f5471d;
            if (i8 == 0) {
                this.f5471d = 1;
                r.throwOnFailure(obj);
                Intrinsics.checkNotNull(this.f5472e, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((l) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.f5472e, 1)).invoke(this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f5471d = 2;
            r.throwOnFailure(obj);
            return obj;
        }
    }

    /* renamed from: X6.c$c */
    public static final class C0086c extends j {

        /* renamed from: b */
        private int f5473b;

        /* renamed from: c */
        final /* synthetic */ p f5474c;

        /* renamed from: d */
        final /* synthetic */ Object f5475d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0086c(W6.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f5474c = pVar;
            this.f5475d = obj;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Y6.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i8 = this.f5473b;
            if (i8 == 0) {
                this.f5473b = 1;
                r.throwOnFailure(obj);
                Intrinsics.checkNotNull(this.f5474c, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.f5474c, 2)).invoke(this.f5475d, this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f5473b = 2;
            r.throwOnFailure(obj);
            return obj;
        }
    }

    public static final class d extends Y6.d {

        /* renamed from: d */
        private int f5476d;

        /* renamed from: e */
        final /* synthetic */ p f5477e;

        /* renamed from: f */
        final /* synthetic */ Object f5478f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(W6.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f5477e = pVar;
            this.f5478f = obj;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Y6.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i8 = this.f5476d;
            if (i8 == 0) {
                this.f5476d = 1;
                r.throwOnFailure(obj);
                Intrinsics.checkNotNull(this.f5477e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.f5477e, 2)).invoke(this.f5478f, this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f5476d = 2;
            r.throwOnFailure(obj);
            return obj;
        }
    }

    public static final class e extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(W6.d dVar) {
            super(dVar);
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Y6.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            r.throwOnFailure(obj);
            return obj;
        }
    }

    public static final class f extends Y6.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(W6.d dVar, g gVar) {
            super(dVar, gVar);
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Y6.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            r.throwOnFailure(obj);
            return obj;
        }
    }

    private static final W6.d a(W6.d dVar) {
        g context = dVar.getContext();
        return context == h.INSTANCE ? new e(dVar) : new f(dVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> W6.d<G> createCoroutineUnintercepted(l lVar, W6.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        W6.d<?> dVarProbeCoroutineCreated = Y6.h.probeCoroutineCreated(completion);
        if (lVar instanceof Y6.a) {
            return ((Y6.a) lVar).create(dVarProbeCoroutineCreated);
        }
        g context = dVarProbeCoroutineCreated.getContext();
        return context == h.INSTANCE ? new a(dVarProbeCoroutineCreated, lVar) : new b(dVarProbeCoroutineCreated, context, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> W6.d<T> intercepted(W6.d<? super T> dVar) {
        W6.d<T> dVar2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Y6.d dVar3 = dVar instanceof Y6.d ? (Y6.d) dVar : null;
        return (dVar3 == null || (dVar2 = (W6.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }

    public static final <T> Object wrapWithContinuationImpl(l lVar, W6.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((l) TypeIntrinsics.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(a(Y6.h.probeCoroutineCreated(completion)));
    }

    public static final <R, T> Object wrapWithContinuationImpl(p pVar, R r8, W6.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((p) TypeIntrinsics.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r8, a(Y6.h.probeCoroutineCreated(completion)));
    }

    public static final <R, P, T> Object wrapWithContinuationImpl(q qVar, R r8, P p8, W6.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((q) TypeIntrinsics.beforeCheckcastToFunctionOfArity(qVar, 3)).invoke(r8, p8, a(Y6.h.probeCoroutineCreated(completion)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> W6.d<G> createCoroutineUnintercepted(p pVar, R r8, W6.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        W6.d<?> dVarProbeCoroutineCreated = Y6.h.probeCoroutineCreated(completion);
        if (pVar instanceof Y6.a) {
            return ((Y6.a) pVar).create(r8, dVarProbeCoroutineCreated);
        }
        g context = dVarProbeCoroutineCreated.getContext();
        if (context == h.INSTANCE) {
            return new C0086c(dVarProbeCoroutineCreated, pVar, r8);
        }
        return new d(dVarProbeCoroutineCreated, context, pVar, r8);
    }
}
