package Q0;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.C;

/* loaded from: classes.dex */
public class s implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    static final String f3954g = H0.l.tagWithPrefix("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f3955a = androidx.work.impl.utils.futures.c.create();

    /* renamed from: b, reason: collision with root package name */
    final Context f3956b;

    /* renamed from: c, reason: collision with root package name */
    final P0.r f3957c;

    /* renamed from: d, reason: collision with root package name */
    final ListenableWorker f3958d;

    /* renamed from: e, reason: collision with root package name */
    final H0.h f3959e;

    /* renamed from: f, reason: collision with root package name */
    final R0.a f3960f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f3961a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f3961a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3961a.setFuture(s.this.f3958d.getForegroundInfoAsync());
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f3963a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f3963a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                H0.g gVar = (H0.g) this.f3963a.get();
                if (gVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", s.this.f3957c.workerClassName));
                }
                H0.l.get().debug(s.f3954g, String.format("Updating notification for %s", s.this.f3957c.workerClassName), new Throwable[0]);
                s.this.f3958d.setRunInForeground(true);
                s sVar = s.this;
                sVar.f3955a.setFuture(sVar.f3959e.setForegroundAsync(sVar.f3956b, sVar.f3958d.getId(), gVar));
            } catch (Throwable th) {
                s.this.f3955a.setException(th);
            }
        }
    }

    public s(Context context, P0.r rVar, ListenableWorker listenableWorker, H0.h hVar, R0.a aVar) {
        this.f3956b = context;
        this.f3957c = rVar;
        this.f3958d = listenableWorker;
        this.f3959e = hVar;
        this.f3960f = aVar;
    }

    public C getFuture() {
        return this.f3955a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f3957c.expedited || androidx.core.os.a.isAtLeastS()) {
            this.f3955a.set(null);
            return;
        }
        androidx.work.impl.utils.futures.c cVarCreate = androidx.work.impl.utils.futures.c.create();
        this.f3960f.getMainThreadExecutor().execute(new a(cVarCreate));
        cVarCreate.addListener(new b(cVarCreate), this.f3960f.getMainThreadExecutor());
    }
}
