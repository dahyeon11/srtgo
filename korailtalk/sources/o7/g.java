package o7;

import R6.q;
import R6.r;
import Y6.h;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import n7.C5971a0;
import n7.C5998o;
import n7.InterfaceC5996n;

/* loaded from: classes3.dex */
public abstract class g {
    public static final e Main;
    private static volatile Choreographer choreographer;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5996n f34490a;

        public a(InterfaceC5996n interfaceC5996n) {
            this.f34490a = interfaceC5996n;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.e(this.f34490a);
        }
    }

    static {
        Object objM67constructorimpl;
        try {
            q.a aVar = q.Companion;
            objM67constructorimpl = q.m67constructorimpl(new d(asHandler(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            q.a aVar2 = q.Companion;
            objM67constructorimpl = q.m67constructorimpl(r.createFailure(th));
        }
        Main = (e) (q.m72isFailureimpl(objM67constructorimpl) ? null : objM67constructorimpl);
    }

    public static final Handler asHandler(Looper looper, boolean z8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!z8) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final Object awaitFrame(W6.d<? super Long> dVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return b(dVar);
        }
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        c(choreographer2, c5998o);
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b(W6.d dVar) {
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            e(c5998o);
        } else {
            C5971a0.getMain().mo570dispatch(c5998o.getContext(), new a(c5998o));
        }
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Choreographer choreographer2, final InterfaceC5996n interfaceC5996n) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: o7.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                g.d(interfaceC5996n, j8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5996n interfaceC5996n, long j8) {
        interfaceC5996n.resumeUndispatched(C5971a0.getMain(), Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5996n interfaceC5996n) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        c(choreographer2, interfaceC5996n);
    }

    public static final e from(Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static /* synthetic */ e from$default(Handler handler, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    public static final e from(Handler handler, String str) {
        return new d(handler, str);
    }

    public static /* synthetic */ void getMain$annotations() {
    }
}
