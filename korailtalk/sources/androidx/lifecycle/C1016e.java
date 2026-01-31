package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;
import n7.C5971a0;
import n7.F0;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016e {

    /* renamed from: b, reason: collision with root package name */
    private boolean f10028b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10029c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f10027a = true;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f10030d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1016e this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.c(runnable);
    }

    private final void c(Runnable runnable) {
        if (!this.f10030d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        drainQueue();
    }

    public final boolean canRun() {
        return this.f10028b || !this.f10027a;
    }

    public final void dispatchAndEnqueue(W6.g context, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        F0 immediate = C5971a0.getMain().getImmediate();
        if (immediate.isDispatchNeeded(context) || canRun()) {
            immediate.mo570dispatch(context, new Runnable() { // from class: androidx.lifecycle.d
                @Override // java.lang.Runnable
                public final void run() {
                    C1016e.b(this.f10025a, runnable);
                }
            });
        } else {
            c(runnable);
        }
    }

    public final void drainQueue() {
        if (this.f10029c) {
            return;
        }
        try {
            this.f10029c = true;
            while (!this.f10030d.isEmpty() && canRun()) {
                Runnable runnable = (Runnable) this.f10030d.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f10029c = false;
        }
    }

    public final void finish() {
        this.f10028b = true;
        drainQueue();
    }

    public final void pause() {
        this.f10027a = true;
    }

    public final void resume() {
        if (this.f10027a) {
            if (this.f10028b) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.f10027a = false;
            drainQueue();
        }
    }
}
