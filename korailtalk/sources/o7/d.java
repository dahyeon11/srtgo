package o7;

import R6.G;
import android.os.Handler;
import android.os.Looper;
import f7.l;
import j7.s;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m7.AbstractC5916c;
import n7.AbstractC6016x0;
import n7.C5971a0;
import n7.H0;
import n7.InterfaceC5973b0;
import n7.InterfaceC5996n;
import n7.V;

/* loaded from: classes3.dex */
public final class d extends e implements V {
    private volatile d _immediate;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f34481b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34482c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34483d;

    /* renamed from: e, reason: collision with root package name */
    private final d f34484e;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5996n f34485a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f34486b;

        public a(InterfaceC5996n interfaceC5996n, d dVar) {
            this.f34485a = interfaceC5996n;
            this.f34486b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f34485a.resumeUndispatched(this.f34486b, G.INSTANCE);
        }
    }

    static final class b extends Lambda implements l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f34488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f34488b = runnable;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return G.INSTANCE;
        }

        public final void invoke(Throwable th) {
            d.this.f34481b.removeCallbacks(this.f34488b);
        }
    }

    private d(Handler handler, String str, boolean z8) {
        super(null);
        this.f34481b = handler;
        this.f34482c = str;
        this.f34483d = z8;
        this._immediate = z8 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f34484e = dVar;
    }

    private final void e(W6.g gVar, Runnable runnable) {
        AbstractC6016x0.cancel(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C5971a0.getIO().mo570dispatch(gVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d dVar, Runnable runnable) {
        dVar.f34481b.removeCallbacks(runnable);
    }

    @Override // n7.I
    /* renamed from: dispatch */
    public void mo570dispatch(W6.g gVar, Runnable runnable) {
        if (this.f34481b.post(runnable)) {
            return;
        }
        e(gVar, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f34481b == this.f34481b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f34481b);
    }

    @Override // o7.e, n7.V
    public InterfaceC5973b0 invokeOnTimeout(long j8, final Runnable runnable, W6.g gVar) {
        if (this.f34481b.postDelayed(runnable, s.coerceAtMost(j8, AbstractC5916c.MAX_MILLIS))) {
            return new InterfaceC5973b0() { // from class: o7.c
                @Override // n7.InterfaceC5973b0
                public final void dispose() {
                    d.f(this.f34479a, runnable);
                }
            };
        }
        e(gVar, runnable);
        return H0.INSTANCE;
    }

    @Override // n7.I
    public boolean isDispatchNeeded(W6.g gVar) {
        return (this.f34483d && Intrinsics.areEqual(Looper.myLooper(), this.f34481b.getLooper())) ? false : true;
    }

    @Override // o7.e, n7.V
    /* renamed from: scheduleResumeAfterDelay */
    public void mo571scheduleResumeAfterDelay(long j8, InterfaceC5996n interfaceC5996n) {
        a aVar = new a(interfaceC5996n, this);
        if (this.f34481b.postDelayed(aVar, s.coerceAtMost(j8, AbstractC5916c.MAX_MILLIS))) {
            interfaceC5996n.invokeOnCancellation(new b(aVar));
        } else {
            e(interfaceC5996n.getContext(), aVar);
        }
    }

    @Override // n7.F0, n7.I
    public String toString() {
        String strB = b();
        if (strB != null) {
            return strB;
        }
        String string = this.f34482c;
        if (string == null) {
            string = this.f34481b.toString();
        }
        if (!this.f34483d) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // o7.e, n7.F0
    public d getImmediate() {
        return this.f34484e;
    }

    public /* synthetic */ d(Handler handler, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i8 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}
