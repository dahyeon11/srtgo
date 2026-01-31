package n7;

import W6.e;
import W6.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s7.AbstractC6257s;
import s7.C6251l;

/* loaded from: classes3.dex */
public abstract class I extends W6.a implements W6.e {
    public static final a Key = new a(null);

    public static final class a extends W6.b {

        /* renamed from: n7.I$a$a */
        static final class C0354a extends Lambda implements f7.l {
            public static final C0354a INSTANCE = new C0354a();

            C0354a() {
                super(1);
            }

            @Override // f7.l
            public final I invoke(g.b bVar) {
                if (bVar instanceof I) {
                    return (I) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(W6.e.Key, C0354a.INSTANCE);
        }
    }

    public I() {
        super(W6.e.Key);
    }

    /* renamed from: dispatch */
    public abstract void mo570dispatch(W6.g gVar, Runnable runnable);

    public void dispatchYield(W6.g gVar, Runnable runnable) {
        mo570dispatch(gVar, runnable);
    }

    @Override // W6.a, W6.g.b, W6.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) e.a.get(this, cVar);
    }

    @Override // W6.e
    public final <T> W6.d<T> interceptContinuation(W6.d<? super T> dVar) {
        return new C6251l(this, dVar);
    }

    public boolean isDispatchNeeded(W6.g gVar) {
        return true;
    }

    public I limitedParallelism(int i8) {
        AbstractC6257s.checkParallelism(i8);
        return new s7.r(this, i8);
    }

    @Override // W6.a, W6.g.b, W6.g
    public W6.g minusKey(g.c cVar) {
        return e.a.minusKey(this, cVar);
    }

    @Override // W6.e
    public final void releaseInterceptedContinuation(W6.d<?> dVar) {
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C6251l) dVar).release();
    }

    public String toString() {
        return P.getClassSimpleName(this) + '@' + P.getHexAddress(this);
    }

    public final I plus(I i8) {
        return i8;
    }
}
