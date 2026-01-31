package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import n7.AbstractC5982g;
import n7.C5971a0;
import n7.InterfaceC6008t0;

/* loaded from: classes.dex */
public abstract class x {

    static final class a extends Y6.l implements f7.p {

        /* renamed from: e, reason: collision with root package name */
        int f10066e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f10067f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC1019h f10068g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AbstractC1019h.b f10069h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ f7.p f10070i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC1019h abstractC1019h, AbstractC1019h.b bVar, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f10068g = abstractC1019h;
            this.f10069h = bVar;
            this.f10070i = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            a aVar = new a(this.f10068g, this.f10069h, this.f10070i, dVar);
            aVar.f10067f = obj;
            return aVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C1021j c1021j;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f10066e;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1021j = (C1021j) this.f10067f;
                try {
                    R6.r.throwOnFailure(obj);
                    c1021j.finish();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    c1021j.finish();
                    throw th;
                }
            }
            R6.r.throwOnFailure(obj);
            InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) ((n7.L) this.f10067f).getCoroutineContext().get(InterfaceC6008t0.Key);
            if (interfaceC6008t0 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            w wVar = new w();
            C1021j c1021j2 = new C1021j(this.f10068g, this.f10069h, wVar.dispatchQueue, interfaceC6008t0);
            try {
                f7.p pVar = this.f10070i;
                this.f10067f = c1021j2;
                this.f10066e = 1;
                obj = AbstractC5982g.withContext(wVar, pVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c1021j = c1021j2;
                c1021j.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c1021j = c1021j2;
                c1021j.finish();
                throw th;
            }
        }

        @Override // f7.p
        public final Object invoke(n7.L l8, W6.d<? super T> dVar) {
            return ((a) create(l8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    public static final <T> Object whenCreated(InterfaceC1025n interfaceC1025n, f7.p pVar, W6.d<? super T> dVar) {
        return whenCreated(interfaceC1025n.getLifecycle(), pVar, dVar);
    }

    public static final <T> Object whenResumed(InterfaceC1025n interfaceC1025n, f7.p pVar, W6.d<? super T> dVar) {
        return whenResumed(interfaceC1025n.getLifecycle(), pVar, dVar);
    }

    public static final <T> Object whenStarted(InterfaceC1025n interfaceC1025n, f7.p pVar, W6.d<? super T> dVar) {
        return whenStarted(interfaceC1025n.getLifecycle(), pVar, dVar);
    }

    public static final <T> Object whenStateAtLeast(AbstractC1019h abstractC1019h, AbstractC1019h.b bVar, f7.p pVar, W6.d<? super T> dVar) {
        return AbstractC5982g.withContext(C5971a0.getMain().getImmediate(), new a(abstractC1019h, bVar, pVar, null), dVar);
    }

    public static final <T> Object whenCreated(AbstractC1019h abstractC1019h, f7.p pVar, W6.d<? super T> dVar) {
        return whenStateAtLeast(abstractC1019h, AbstractC1019h.b.CREATED, pVar, dVar);
    }

    public static final <T> Object whenResumed(AbstractC1019h abstractC1019h, f7.p pVar, W6.d<? super T> dVar) {
        return whenStateAtLeast(abstractC1019h, AbstractC1019h.b.RESUMED, pVar, dVar);
    }

    public static final <T> Object whenStarted(AbstractC1019h abstractC1019h, f7.p pVar, W6.d<? super T> dVar) {
        return whenStateAtLeast(abstractC1019h, AbstractC1019h.b.STARTED, pVar, dVar);
    }
}
