package r0;

import R6.G;
import R6.r;
import Y6.l;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.C;
import f7.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n7.AbstractC5986i;
import n7.C5971a0;
import n7.L;
import n7.M;
import q0.AbstractC6103b;
import t0.AbstractC6328N;
import t0.C6330P;
import t0.C6332S;
import t0.C6336d;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6168a {
    public static final b Companion = new b(null);

    /* renamed from: r0.a$a, reason: collision with other inner class name */
    private static final class C0397a extends AbstractC6168a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC6328N f35707a;

        /* renamed from: r0.a$a$a, reason: collision with other inner class name */
        static final class C0398a extends l implements p {

            /* renamed from: e, reason: collision with root package name */
            int f35708e;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C6336d f35710g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0398a(C6336d c6336d, W6.d dVar) {
                super(2, dVar);
                this.f35710g = c6336d;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return C0397a.this.new C0398a(this.f35710g, dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35708e;
                if (i8 == 0) {
                    r.throwOnFailure(obj);
                    AbstractC6328N abstractC6328N = C0397a.this.f35707a;
                    C6336d c6336d = this.f35710g;
                    this.f35708e = 1;
                    if (abstractC6328N.deleteRegistrations(c6336d, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.throwOnFailure(obj);
                }
                return G.INSTANCE;
            }

            @Override // f7.p
            public final Object invoke(L l8, W6.d<? super G> dVar) {
                return ((C0398a) create(l8, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        /* renamed from: r0.a$a$b */
        static final class b extends l implements p {

            /* renamed from: e, reason: collision with root package name */
            int f35711e;

            b(W6.d dVar) {
                super(2, dVar);
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return C0397a.this.new b(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35711e;
                if (i8 == 0) {
                    r.throwOnFailure(obj);
                    AbstractC6328N abstractC6328N = C0397a.this.f35707a;
                    this.f35711e = 1;
                    obj = abstractC6328N.getMeasurementApiStatus(this);
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
            public final Object invoke(L l8, W6.d<? super Integer> dVar) {
                return ((b) create(l8, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        /* renamed from: r0.a$a$c */
        static final class c extends l implements p {

            /* renamed from: e, reason: collision with root package name */
            int f35713e;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Uri f35715g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InputEvent f35716h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, W6.d dVar) {
                super(2, dVar);
                this.f35715g = uri;
                this.f35716h = inputEvent;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return C0397a.this.new c(this.f35715g, this.f35716h, dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35713e;
                if (i8 == 0) {
                    r.throwOnFailure(obj);
                    AbstractC6328N abstractC6328N = C0397a.this.f35707a;
                    Uri uri = this.f35715g;
                    InputEvent inputEvent = this.f35716h;
                    this.f35713e = 1;
                    if (abstractC6328N.registerSource(uri, inputEvent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.throwOnFailure(obj);
                }
                return G.INSTANCE;
            }

            @Override // f7.p
            public final Object invoke(L l8, W6.d<? super G> dVar) {
                return ((c) create(l8, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        /* renamed from: r0.a$a$d */
        static final class d extends l implements p {

            /* renamed from: e, reason: collision with root package name */
            int f35717e;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Uri f35719g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, W6.d dVar) {
                super(2, dVar);
                this.f35719g = uri;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return C0397a.this.new d(this.f35719g, dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35717e;
                if (i8 == 0) {
                    r.throwOnFailure(obj);
                    AbstractC6328N abstractC6328N = C0397a.this.f35707a;
                    Uri uri = this.f35719g;
                    this.f35717e = 1;
                    if (abstractC6328N.registerTrigger(uri, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.throwOnFailure(obj);
                }
                return G.INSTANCE;
            }

            @Override // f7.p
            public final Object invoke(L l8, W6.d<? super G> dVar) {
                return ((d) create(l8, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        /* renamed from: r0.a$a$e */
        static final class e extends l implements p {

            /* renamed from: e, reason: collision with root package name */
            int f35720e;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C6330P f35722g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(C6330P c6330p, W6.d dVar) {
                super(2, dVar);
                this.f35722g = c6330p;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return C0397a.this.new e(this.f35722g, dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35720e;
                if (i8 == 0) {
                    r.throwOnFailure(obj);
                    AbstractC6328N abstractC6328N = C0397a.this.f35707a;
                    C6330P c6330p = this.f35722g;
                    this.f35720e = 1;
                    if (abstractC6328N.registerWebSource(c6330p, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.throwOnFailure(obj);
                }
                return G.INSTANCE;
            }

            @Override // f7.p
            public final Object invoke(L l8, W6.d<? super G> dVar) {
                return ((e) create(l8, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        /* renamed from: r0.a$a$f */
        static final class f extends l implements p {

            /* renamed from: e, reason: collision with root package name */
            int f35723e;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C6332S f35725g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(C6332S c6332s, W6.d dVar) {
                super(2, dVar);
                this.f35725g = c6332s;
            }

            @Override // Y6.a
            public final W6.d<G> create(Object obj, W6.d<?> dVar) {
                return C0397a.this.new f(this.f35725g, dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f35723e;
                if (i8 == 0) {
                    r.throwOnFailure(obj);
                    AbstractC6328N abstractC6328N = C0397a.this.f35707a;
                    C6332S c6332s = this.f35725g;
                    this.f35723e = 1;
                    if (abstractC6328N.registerWebTrigger(c6332s, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.throwOnFailure(obj);
                }
                return G.INSTANCE;
            }

            @Override // f7.p
            public final Object invoke(L l8, W6.d<? super G> dVar) {
                return ((f) create(l8, dVar)).invokeSuspend(G.INSTANCE);
            }
        }

        public C0397a(AbstractC6328N mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f35707a = mMeasurementManager;
        }

        @Override // r0.AbstractC6168a
        public C deleteRegistrationsAsync(C6336d deletionRequest) {
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            return AbstractC6103b.asListenableFuture$default(AbstractC5986i.async$default(M.CoroutineScope(C5971a0.getDefault()), null, null, new C0398a(deletionRequest, null), 3, null), null, 1, null);
        }

        @Override // r0.AbstractC6168a
        public C getMeasurementApiStatusAsync() {
            return AbstractC6103b.asListenableFuture$default(AbstractC5986i.async$default(M.CoroutineScope(C5971a0.getDefault()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // r0.AbstractC6168a
        public C registerSourceAsync(Uri attributionSource, InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            return AbstractC6103b.asListenableFuture$default(AbstractC5986i.async$default(M.CoroutineScope(C5971a0.getDefault()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // r0.AbstractC6168a
        public C registerTriggerAsync(Uri trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            return AbstractC6103b.asListenableFuture$default(AbstractC5986i.async$default(M.CoroutineScope(C5971a0.getDefault()), null, null, new d(trigger, null), 3, null), null, 1, null);
        }

        @Override // r0.AbstractC6168a
        public C registerWebSourceAsync(C6330P request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return AbstractC6103b.asListenableFuture$default(AbstractC5986i.async$default(M.CoroutineScope(C5971a0.getDefault()), null, null, new e(request, null), 3, null), null, 1, null);
        }

        @Override // r0.AbstractC6168a
        public C registerWebTriggerAsync(C6332S request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return AbstractC6103b.asListenableFuture$default(AbstractC5986i.async$default(M.CoroutineScope(C5971a0.getDefault()), null, null, new f(request, null), 3, null), null, 1, null);
        }
    }

    /* renamed from: r0.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6168a from(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC6328N abstractC6328NObtain = AbstractC6328N.Companion.obtain(context);
            if (abstractC6328NObtain != null) {
                return new C0397a(abstractC6328NObtain);
            }
            return null;
        }

        private b() {
        }
    }

    public static final AbstractC6168a from(Context context) {
        return Companion.from(context);
    }

    public abstract C deleteRegistrationsAsync(C6336d c6336d);

    public abstract C getMeasurementApiStatusAsync();

    public abstract C registerSourceAsync(Uri uri, InputEvent inputEvent);

    public abstract C registerTriggerAsync(Uri uri);

    public abstract C registerWebSourceAsync(C6330P c6330p);

    public abstract C registerWebTriggerAsync(C6332S c6332s);
}
