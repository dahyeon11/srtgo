package n7;

import W6.g;
import java.util.concurrent.CancellationException;

/* renamed from: n7.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6008t0 extends g.b {
    public static final b Key = b.f34354a;

    /* renamed from: n7.t0$a */
    public static final class a {
        public static /* synthetic */ void cancel$default(InterfaceC6008t0 interfaceC6008t0, CancellationException cancellationException, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC6008t0.cancel(cancellationException);
        }

        public static <R> R fold(InterfaceC6008t0 interfaceC6008t0, R r8, f7.p pVar) {
            return (R) g.b.a.fold(interfaceC6008t0, r8, pVar);
        }

        public static <E extends g.b> E get(InterfaceC6008t0 interfaceC6008t0, g.c cVar) {
            return (E) g.b.a.get(interfaceC6008t0, cVar);
        }

        public static /* synthetic */ InterfaceC5973b0 invokeOnCompletion$default(InterfaceC6008t0 interfaceC6008t0, boolean z8, boolean z9, f7.l lVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            if ((i8 & 2) != 0) {
                z9 = true;
            }
            return interfaceC6008t0.invokeOnCompletion(z8, z9, lVar);
        }

        public static W6.g minusKey(InterfaceC6008t0 interfaceC6008t0, g.c cVar) {
            return g.b.a.minusKey(interfaceC6008t0, cVar);
        }

        public static W6.g plus(InterfaceC6008t0 interfaceC6008t0, W6.g gVar) {
            return g.b.a.plus(interfaceC6008t0, gVar);
        }

        public static /* synthetic */ boolean cancel$default(InterfaceC6008t0 interfaceC6008t0, Throwable th, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                th = null;
            }
            return interfaceC6008t0.cancel(th);
        }

        public static InterfaceC6008t0 plus(InterfaceC6008t0 interfaceC6008t0, InterfaceC6008t0 interfaceC6008t02) {
            return interfaceC6008t02;
        }

        public static /* synthetic */ void getParent$annotations() {
        }
    }

    /* renamed from: n7.t0$b */
    public static final class b implements g.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f34354a = new b();

        private b() {
        }
    }

    InterfaceC6007t attachChild(InterfaceC6011v interfaceC6011v);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    @Override // W6.g.b, W6.g
    /* synthetic */ Object fold(Object obj, f7.p pVar);

    @Override // W6.g.b, W6.g
    /* synthetic */ g.b get(g.c cVar);

    CancellationException getCancellationException();

    k7.m getChildren();

    @Override // W6.g.b
    /* synthetic */ g.c getKey();

    v7.d getOnJoin();

    InterfaceC6008t0 getParent();

    InterfaceC5973b0 invokeOnCompletion(f7.l lVar);

    InterfaceC5973b0 invokeOnCompletion(boolean z8, boolean z9, f7.l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(W6.d<? super R6.G> dVar);

    @Override // W6.g.b, W6.g
    /* synthetic */ W6.g minusKey(g.c cVar);

    @Override // W6.g.b, W6.g
    /* synthetic */ W6.g plus(W6.g gVar);

    InterfaceC6008t0 plus(InterfaceC6008t0 interfaceC6008t0);

    boolean start();
}
