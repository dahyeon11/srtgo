package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f10755a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f10756b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private Runnable f10757c;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f10758a;

        a(Runnable runnable) {
            this.f10758a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f10758a.run();
            } finally {
                m.this.a();
            }
        }
    }

    m(Executor executor) {
        this.f10755a = executor;
    }

    synchronized void a() {
        Runnable runnable = (Runnable) this.f10756b.poll();
        this.f10757c = runnable;
        if (runnable != null) {
            this.f10755a.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f10756b.offer(new a(runnable));
        if (this.f10757c == null) {
            a();
        }
    }
}
