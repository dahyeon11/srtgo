package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import n7.AbstractC5986i;
import n7.InterfaceC6008t0;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1022k implements n7.L {

    /* renamed from: androidx.lifecycle.k$a */
    static final class a extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f10039e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f7.p f10041g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f10041g = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            return AbstractC1022k.this.new a(this.f10041g, dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f10039e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                AbstractC1019h lifecycle$lifecycle_common = AbstractC1022k.this.getLifecycle$lifecycle_common();
                f7.p pVar = this.f10041g;
                this.f10039e = 1;
                if (x.whenCreated(lifecycle$lifecycle_common, pVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
            }
            return R6.G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(n7.L l8, W6.d<? super R6.G> dVar) {
            return ((a) create(l8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: androidx.lifecycle.k$b */
    static final class b extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f10042e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f7.p f10044g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f10044g = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            return AbstractC1022k.this.new b(this.f10044g, dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f10042e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                AbstractC1019h lifecycle$lifecycle_common = AbstractC1022k.this.getLifecycle$lifecycle_common();
                f7.p pVar = this.f10044g;
                this.f10042e = 1;
                if (x.whenResumed(lifecycle$lifecycle_common, pVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
            }
            return R6.G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(n7.L l8, W6.d<? super R6.G> dVar) {
            return ((b) create(l8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: androidx.lifecycle.k$c */
    static final class c extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f10045e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f7.p f10047g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f10047g = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            return AbstractC1022k.this.new c(this.f10047g, dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f10045e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                AbstractC1019h lifecycle$lifecycle_common = AbstractC1022k.this.getLifecycle$lifecycle_common();
                f7.p pVar = this.f10047g;
                this.f10045e = 1;
                if (x.whenStarted(lifecycle$lifecycle_common, pVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
            }
            return R6.G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(n7.L l8, W6.d<? super R6.G> dVar) {
            return ((c) create(l8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    @Override // n7.L
    public abstract /* synthetic */ W6.g getCoroutineContext();

    public abstract AbstractC1019h getLifecycle$lifecycle_common();

    public final InterfaceC6008t0 launchWhenCreated(f7.p block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return AbstractC5986i.launch$default(this, null, null, new a(block, null), 3, null);
    }

    public final InterfaceC6008t0 launchWhenResumed(f7.p block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return AbstractC5986i.launch$default(this, null, null, new b(block, null), 3, null);
    }

    public final InterfaceC6008t0 launchWhenStarted(f7.p block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return AbstractC5986i.launch$default(this, null, null, new c(block, null), 3, null);
    }
}
