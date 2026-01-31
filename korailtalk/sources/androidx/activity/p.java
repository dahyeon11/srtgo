package androidx.activity;

import R6.G;
import f7.InterfaceC5519a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6241a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5519a f6242b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6243c;

    /* renamed from: d, reason: collision with root package name */
    private int f6244d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6245e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6246f;

    /* renamed from: g, reason: collision with root package name */
    private final List f6247g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f6248h;

    public p(Executor executor, InterfaceC5519a reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f6241a = executor;
        this.f6242b = reportFullyDrawn;
        this.f6243c = new Object();
        this.f6247g = new ArrayList();
        this.f6248h = new Runnable() { // from class: androidx.activity.o
            @Override // java.lang.Runnable
            public final void run() {
                p.c(this.f6240a);
            }
        };
    }

    private final void b() {
        if (this.f6245e || this.f6244d != 0) {
            return;
        }
        this.f6245e = true;
        this.f6241a.execute(this.f6248h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f6243c) {
            try {
                this$0.f6245e = false;
                if (this$0.f6244d == 0 && !this$0.f6246f) {
                    this$0.f6242b.invoke();
                    this$0.fullyDrawnReported();
                }
                G g8 = G.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void addOnReportDrawnListener(InterfaceC5519a callback) {
        boolean z8;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f6243c) {
            if (this.f6246f) {
                z8 = true;
            } else {
                this.f6247g.add(callback);
                z8 = false;
            }
        }
        if (z8) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.f6243c) {
            try {
                if (!this.f6246f) {
                    this.f6244d++;
                }
                G g8 = G.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void fullyDrawnReported() {
        synchronized (this.f6243c) {
            try {
                this.f6246f = true;
                Iterator it = this.f6247g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5519a) it.next()).invoke();
                }
                this.f6247g.clear();
                G g8 = G.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z8;
        synchronized (this.f6243c) {
            z8 = this.f6246f;
        }
        return z8;
    }

    public final void removeOnReportDrawnListener(InterfaceC5519a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f6243c) {
            this.f6247g.remove(callback);
            G g8 = G.INSTANCE;
        }
    }

    public final void removeReporter() {
        int i8;
        synchronized (this.f6243c) {
            try {
                if (!this.f6246f && (i8 = this.f6244d) > 0) {
                    this.f6244d = i8 - 1;
                    b();
                }
                G g8 = G.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
