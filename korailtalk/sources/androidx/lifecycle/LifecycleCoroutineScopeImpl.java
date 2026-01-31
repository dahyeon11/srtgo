package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import n7.AbstractC5986i;
import n7.C5971a0;
import n7.z0;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC1022k implements InterfaceC1023l {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1019h f9986a;

    /* renamed from: b, reason: collision with root package name */
    private final W6.g f9987b;

    static final class a extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f9988e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9989f;

        a(W6.d dVar) {
            super(2, dVar);
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            a aVar = LifecycleCoroutineScopeImpl.this.new a(dVar);
            aVar.f9989f = obj;
            return aVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            X6.b.getCOROUTINE_SUSPENDED();
            if (this.f9988e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R6.r.throwOnFailure(obj);
            n7.L l8 = (n7.L) this.f9989f;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(AbstractC1019h.b.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                z0.cancel$default(l8.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
            }
            return R6.G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(n7.L l8, W6.d<? super R6.G> dVar) {
            return ((a) create(l8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    public LifecycleCoroutineScopeImpl(AbstractC1019h lifecycle, W6.g coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f9986a = lifecycle;
        this.f9987b = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() == AbstractC1019h.b.DESTROYED) {
            z0.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // androidx.lifecycle.AbstractC1022k, n7.L
    public W6.g getCoroutineContext() {
        return this.f9987b;
    }

    @Override // androidx.lifecycle.AbstractC1022k
    public AbstractC1019h getLifecycle$lifecycle_common() {
        return this.f9986a;
    }

    @Override // androidx.lifecycle.InterfaceC1023l
    public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(AbstractC1019h.b.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            z0.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public final void register() {
        AbstractC5986i.launch$default(this, C5971a0.getMain().getImmediate(), null, new a(null), 2, null);
    }
}
