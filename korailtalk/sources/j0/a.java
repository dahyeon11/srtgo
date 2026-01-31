package J0;

import H0.l;
import H0.t;
import P0.r;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d */
    static final String f2517d = l.tagWithPrefix("DelayedWorkTracker");

    /* renamed from: a */
    final b f2518a;

    /* renamed from: b */
    private final t f2519b;

    /* renamed from: c */
    private final Map f2520c = new HashMap();

    /* renamed from: J0.a$a */
    class RunnableC0042a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ r f2521a;

        RunnableC0042a(r rVar) {
            this.f2521a = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.get().debug(a.f2517d, String.format("Scheduling work %s", this.f2521a.id), new Throwable[0]);
            a.this.f2518a.schedule(this.f2521a);
        }
    }

    public a(b bVar, t tVar) {
        this.f2518a = bVar;
        this.f2519b = tVar;
    }

    public void schedule(r rVar) {
        Runnable runnable = (Runnable) this.f2520c.remove(rVar.id);
        if (runnable != null) {
            this.f2519b.cancel(runnable);
        }
        RunnableC0042a runnableC0042a = new RunnableC0042a(rVar);
        this.f2520c.put(rVar.id, runnableC0042a);
        this.f2519b.scheduleWithDelay(rVar.calculateNextRunTime() - System.currentTimeMillis(), runnableC0042a);
    }

    public void unschedule(String str) {
        Runnable runnable = (Runnable) this.f2520c.remove(str);
        if (runnable != null) {
            this.f2519b.cancel(runnable);
        }
    }
}
