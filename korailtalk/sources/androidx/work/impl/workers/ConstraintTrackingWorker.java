package androidx.work.impl.workers;

import H0.l;
import I0.i;
import L0.c;
import L0.d;
import P0.r;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {
    public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";

    /* renamed from: k, reason: collision with root package name */
    private static final String f11263k = l.tagWithPrefix("ConstraintTrkngWrkr");

    /* renamed from: f, reason: collision with root package name */
    private WorkerParameters f11264f;

    /* renamed from: g, reason: collision with root package name */
    final Object f11265g;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f11266h;

    /* renamed from: i, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f11267i;

    /* renamed from: j, reason: collision with root package name */
    private ListenableWorker f11268j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.c();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f11270a;

        b(C c9) {
            this.f11270a = c9;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f11265g) {
                try {
                    if (ConstraintTrackingWorker.this.f11266h) {
                        ConstraintTrackingWorker.this.b();
                    } else {
                        ConstraintTrackingWorker.this.f11267i.setFuture(this.f11270a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f11264f = workerParameters;
        this.f11265g = new Object();
        this.f11266h = false;
        this.f11267i = androidx.work.impl.utils.futures.c.create();
    }

    void a() {
        this.f11267i.set(ListenableWorker.a.failure());
    }

    void b() {
        this.f11267i.set(ListenableWorker.a.retry());
    }

    void c() {
        String string = getInputData().getString(ARGUMENT_CLASS_NAME);
        if (TextUtils.isEmpty(string)) {
            l.get().error(f11263k, "No worker to delegate to.", new Throwable[0]);
            a();
            return;
        }
        ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), string, this.f11264f);
        this.f11268j = listenableWorkerCreateWorkerWithDefaultFallback;
        if (listenableWorkerCreateWorkerWithDefaultFallback == null) {
            l.get().debug(f11263k, "No worker to delegate to.", new Throwable[0]);
            a();
            return;
        }
        r workSpec = getWorkDatabase().workSpecDao().getWorkSpec(getId().toString());
        if (workSpec == null) {
            a();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.replace(Collections.singletonList(workSpec));
        if (!dVar.areAllConstraintsMet(getId().toString())) {
            l.get().debug(f11263k, String.format("Constraints not met for delegate %s. Requesting retry.", string), new Throwable[0]);
            b();
            return;
        }
        l.get().debug(f11263k, String.format("Constraints met for delegate %s", string), new Throwable[0]);
        try {
            C cStartWork = this.f11268j.startWork();
            cStartWork.addListener(new b(cStartWork), getBackgroundExecutor());
        } catch (Throwable th) {
            l lVar = l.get();
            String str = f11263k;
            lVar.debug(str, String.format("Delegated worker %s threw exception in startWork.", string), th);
            synchronized (this.f11265g) {
                try {
                    if (this.f11266h) {
                        l.get().debug(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        b();
                    } else {
                        a();
                    }
                } finally {
                }
            }
        }
    }

    public ListenableWorker getDelegate() {
        return this.f11268j;
    }

    @Override // androidx.work.ListenableWorker
    public R0.a getTaskExecutor() {
        return i.getInstance(getApplicationContext()).getWorkTaskExecutor();
    }

    public WorkDatabase getWorkDatabase() {
        return i.getInstance(getApplicationContext()).getWorkDatabase();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f11268j;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // L0.c
    public void onAllConstraintsMet(List<String> list) {
    }

    @Override // L0.c
    public void onAllConstraintsNotMet(List<String> list) {
        l.get().debug(f11263k, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f11265g) {
            this.f11266h = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f11268j;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f11268j.stop();
    }

    @Override // androidx.work.ListenableWorker
    public C startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f11267i;
    }
}
