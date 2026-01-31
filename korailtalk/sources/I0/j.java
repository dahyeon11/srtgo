package I0;

import H0.l;
import H0.v;
import P0.r;
import P0.s;
import P0.v;
import Q0.t;
import Q0.u;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.common.util.concurrent.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    static final String f1946t = l.tagWithPrefix("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    Context f1947a;

    /* renamed from: b, reason: collision with root package name */
    private String f1948b;

    /* renamed from: c, reason: collision with root package name */
    private List f1949c;

    /* renamed from: d, reason: collision with root package name */
    private WorkerParameters.a f1950d;

    /* renamed from: e, reason: collision with root package name */
    r f1951e;

    /* renamed from: f, reason: collision with root package name */
    ListenableWorker f1952f;

    /* renamed from: g, reason: collision with root package name */
    R0.a f1953g;

    /* renamed from: i, reason: collision with root package name */
    private androidx.work.a f1955i;

    /* renamed from: j, reason: collision with root package name */
    private O0.a f1956j;

    /* renamed from: k, reason: collision with root package name */
    private WorkDatabase f1957k;

    /* renamed from: l, reason: collision with root package name */
    private s f1958l;

    /* renamed from: m, reason: collision with root package name */
    private P0.b f1959m;

    /* renamed from: n, reason: collision with root package name */
    private v f1960n;

    /* renamed from: o, reason: collision with root package name */
    private List f1961o;

    /* renamed from: p, reason: collision with root package name */
    private String f1962p;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f1965s;

    /* renamed from: h, reason: collision with root package name */
    ListenableWorker.a f1954h = ListenableWorker.a.failure();

    /* renamed from: q, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f1963q = androidx.work.impl.utils.futures.c.create();

    /* renamed from: r, reason: collision with root package name */
    C f1964r = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f1966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f1967b;

        a(C c9, androidx.work.impl.utils.futures.c cVar) {
            this.f1966a = c9;
            this.f1967b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1966a.get();
                l.get().debug(j.f1946t, String.format("Starting work for %s", j.this.f1951e.workerClassName), new Throwable[0]);
                j jVar = j.this;
                jVar.f1964r = jVar.f1952f.startWork();
                this.f1967b.setFuture(j.this.f1964r);
            } catch (Throwable th) {
                this.f1967b.setException(th);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f1969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1970b;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f1969a = cVar;
            this.f1970b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f1969a.get();
                    if (aVar == null) {
                        l.get().error(j.f1946t, String.format("%s returned a null result. Treating it as a failure.", j.this.f1951e.workerClassName), new Throwable[0]);
                    } else {
                        l.get().debug(j.f1946t, String.format("%s returned a %s result.", j.this.f1951e.workerClassName, aVar), new Throwable[0]);
                        j.this.f1954h = aVar;
                    }
                } catch (InterruptedException e8) {
                    e = e8;
                    l.get().error(j.f1946t, String.format("%s failed because it threw an exception/error", this.f1970b), e);
                } catch (CancellationException e9) {
                    l.get().info(j.f1946t, String.format("%s was cancelled", this.f1970b), e9);
                } catch (ExecutionException e10) {
                    e = e10;
                    l.get().error(j.f1946t, String.format("%s failed because it threw an exception/error", this.f1970b), e);
                }
                j.this.d();
            } catch (Throwable th) {
                j.this.d();
                throw th;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Context f1972a;

        /* renamed from: b, reason: collision with root package name */
        ListenableWorker f1973b;

        /* renamed from: c, reason: collision with root package name */
        O0.a f1974c;

        /* renamed from: d, reason: collision with root package name */
        R0.a f1975d;

        /* renamed from: e, reason: collision with root package name */
        androidx.work.a f1976e;

        /* renamed from: f, reason: collision with root package name */
        WorkDatabase f1977f;

        /* renamed from: g, reason: collision with root package name */
        String f1978g;

        /* renamed from: h, reason: collision with root package name */
        List f1979h;

        /* renamed from: i, reason: collision with root package name */
        WorkerParameters.a f1980i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, R0.a aVar2, O0.a aVar3, WorkDatabase workDatabase, String str) {
            this.f1972a = context.getApplicationContext();
            this.f1975d = aVar2;
            this.f1974c = aVar3;
            this.f1976e = aVar;
            this.f1977f = workDatabase;
            this.f1978g = str;
        }

        public j build() {
            return new j(this);
        }

        public c withRuntimeExtras(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f1980i = aVar;
            }
            return this;
        }

        public c withSchedulers(List<e> list) {
            this.f1979h = list;
            return this;
        }

        public c withWorker(ListenableWorker listenableWorker) {
            this.f1973b = listenableWorker;
            return this;
        }
    }

    j(c cVar) {
        this.f1947a = cVar.f1972a;
        this.f1953g = cVar.f1975d;
        this.f1956j = cVar.f1974c;
        this.f1948b = cVar.f1978g;
        this.f1949c = cVar.f1979h;
        this.f1950d = cVar.f1980i;
        this.f1952f = cVar.f1973b;
        this.f1955i = cVar.f1976e;
        WorkDatabase workDatabase = cVar.f1977f;
        this.f1957k = workDatabase;
        this.f1958l = workDatabase.workSpecDao();
        this.f1959m = this.f1957k.dependencyDao();
        this.f1960n = this.f1957k.workTagDao();
    }

    private String a(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f1948b);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z8 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z8) {
                z8 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void b(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            l.get().info(f1946t, String.format("Worker result SUCCESS for %s", this.f1962p), new Throwable[0]);
            if (this.f1951e.isPeriodic()) {
                f();
                return;
            } else {
                k();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            l.get().info(f1946t, String.format("Worker result RETRY for %s", this.f1962p), new Throwable[0]);
            e();
            return;
        }
        l.get().info(f1946t, String.format("Worker result FAILURE for %s", this.f1962p), new Throwable[0]);
        if (this.f1951e.isPeriodic()) {
            f();
        } else {
            j();
        }
    }

    private void c(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f1958l.getState(str2) != v.a.CANCELLED) {
                this.f1958l.setState(v.a.FAILED, str2);
            }
            linkedList.addAll(this.f1959m.getDependentWorkIds(str2));
        }
    }

    private void e() {
        this.f1957k.beginTransaction();
        try {
            this.f1958l.setState(v.a.ENQUEUED, this.f1948b);
            this.f1958l.setPeriodStartTime(this.f1948b, System.currentTimeMillis());
            this.f1958l.markWorkSpecScheduled(this.f1948b, -1L);
            this.f1957k.setTransactionSuccessful();
        } finally {
            this.f1957k.endTransaction();
            g(true);
        }
    }

    private void f() {
        this.f1957k.beginTransaction();
        try {
            this.f1958l.setPeriodStartTime(this.f1948b, System.currentTimeMillis());
            this.f1958l.setState(v.a.ENQUEUED, this.f1948b);
            this.f1958l.resetWorkSpecRunAttemptCount(this.f1948b);
            this.f1958l.markWorkSpecScheduled(this.f1948b, -1L);
            this.f1957k.setTransactionSuccessful();
        } finally {
            this.f1957k.endTransaction();
            g(false);
        }
    }

    private void g(boolean z8) {
        ListenableWorker listenableWorker;
        this.f1957k.beginTransaction();
        try {
            if (!this.f1957k.workSpecDao().hasUnfinishedWork()) {
                Q0.h.setComponentEnabled(this.f1947a, RescheduleReceiver.class, false);
            }
            if (z8) {
                this.f1958l.setState(v.a.ENQUEUED, this.f1948b);
                this.f1958l.markWorkSpecScheduled(this.f1948b, -1L);
            }
            if (this.f1951e != null && (listenableWorker = this.f1952f) != null && listenableWorker.isRunInForeground()) {
                this.f1956j.stopForeground(this.f1948b);
            }
            this.f1957k.setTransactionSuccessful();
            this.f1957k.endTransaction();
            this.f1963q.set(Boolean.valueOf(z8));
        } catch (Throwable th) {
            this.f1957k.endTransaction();
            throw th;
        }
    }

    private void h() {
        v.a state = this.f1958l.getState(this.f1948b);
        if (state == v.a.RUNNING) {
            l.get().debug(f1946t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f1948b), new Throwable[0]);
            g(true);
        } else {
            l.get().debug(f1946t, String.format("Status for %s is %s; not doing any work", this.f1948b, state), new Throwable[0]);
            g(false);
        }
    }

    private void i() {
        androidx.work.b bVarMerge;
        if (l()) {
            return;
        }
        this.f1957k.beginTransaction();
        try {
            r workSpec = this.f1958l.getWorkSpec(this.f1948b);
            this.f1951e = workSpec;
            if (workSpec == null) {
                l.get().error(f1946t, String.format("Didn't find WorkSpec for id %s", this.f1948b), new Throwable[0]);
                g(false);
                this.f1957k.setTransactionSuccessful();
                return;
            }
            if (workSpec.state != v.a.ENQUEUED) {
                h();
                this.f1957k.setTransactionSuccessful();
                l.get().debug(f1946t, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f1951e.workerClassName), new Throwable[0]);
                return;
            }
            if (workSpec.isPeriodic() || this.f1951e.isBackedOff()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                r rVar = this.f1951e;
                if (rVar.periodStartTime != 0 && jCurrentTimeMillis < rVar.calculateNextRunTime()) {
                    l.get().debug(f1946t, String.format("Delaying execution for %s because it is being executed before schedule.", this.f1951e.workerClassName), new Throwable[0]);
                    g(true);
                    this.f1957k.setTransactionSuccessful();
                    return;
                }
            }
            this.f1957k.setTransactionSuccessful();
            this.f1957k.endTransaction();
            if (this.f1951e.isPeriodic()) {
                bVarMerge = this.f1951e.input;
            } else {
                H0.j jVarCreateInputMergerWithDefaultFallback = this.f1955i.getInputMergerFactory().createInputMergerWithDefaultFallback(this.f1951e.inputMergerClassName);
                if (jVarCreateInputMergerWithDefaultFallback == null) {
                    l.get().error(f1946t, String.format("Could not create Input Merger %s", this.f1951e.inputMergerClassName), new Throwable[0]);
                    j();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f1951e.input);
                    arrayList.addAll(this.f1958l.getInputsFromPrerequisites(this.f1948b));
                    bVarMerge = jVarCreateInputMergerWithDefaultFallback.merge(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f1948b), bVarMerge, this.f1961o, this.f1950d, this.f1951e.runAttemptCount, this.f1955i.getExecutor(), this.f1953g, this.f1955i.getWorkerFactory(), new u(this.f1957k, this.f1953g), new t(this.f1957k, this.f1956j, this.f1953g));
            if (this.f1952f == null) {
                this.f1952f = this.f1955i.getWorkerFactory().createWorkerWithDefaultFallback(this.f1947a, this.f1951e.workerClassName, workerParameters);
            }
            ListenableWorker listenableWorker = this.f1952f;
            if (listenableWorker == null) {
                l.get().error(f1946t, String.format("Could not create Worker %s", this.f1951e.workerClassName), new Throwable[0]);
                j();
                return;
            }
            if (listenableWorker.isUsed()) {
                l.get().error(f1946t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f1951e.workerClassName), new Throwable[0]);
                j();
                return;
            }
            this.f1952f.setUsed();
            if (!m()) {
                h();
                return;
            }
            if (l()) {
                return;
            }
            androidx.work.impl.utils.futures.c cVarCreate = androidx.work.impl.utils.futures.c.create();
            Q0.s sVar = new Q0.s(this.f1947a, this.f1951e, this.f1952f, workerParameters.getForegroundUpdater(), this.f1953g);
            this.f1953g.getMainThreadExecutor().execute(sVar);
            C future = sVar.getFuture();
            future.addListener(new a(future, cVarCreate), this.f1953g.getMainThreadExecutor());
            cVarCreate.addListener(new b(cVarCreate, this.f1962p), this.f1953g.getBackgroundExecutor());
        } finally {
            this.f1957k.endTransaction();
        }
    }

    private void k() {
        this.f1957k.beginTransaction();
        try {
            this.f1958l.setState(v.a.SUCCEEDED, this.f1948b);
            this.f1958l.setOutput(this.f1948b, ((ListenableWorker.a.c) this.f1954h).getOutputData());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f1959m.getDependentWorkIds(this.f1948b)) {
                if (this.f1958l.getState(str) == v.a.BLOCKED && this.f1959m.hasCompletedAllPrerequisites(str)) {
                    l.get().info(f1946t, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f1958l.setState(v.a.ENQUEUED, str);
                    this.f1958l.setPeriodStartTime(str, jCurrentTimeMillis);
                }
            }
            this.f1957k.setTransactionSuccessful();
            this.f1957k.endTransaction();
            g(false);
        } catch (Throwable th) {
            this.f1957k.endTransaction();
            g(false);
            throw th;
        }
    }

    private boolean l() {
        if (!this.f1965s) {
            return false;
        }
        l.get().debug(f1946t, String.format("Work interrupted for %s", this.f1962p), new Throwable[0]);
        if (this.f1958l.getState(this.f1948b) == null) {
            g(false);
        } else {
            g(!r0.isFinished());
        }
        return true;
    }

    private boolean m() {
        boolean z8;
        this.f1957k.beginTransaction();
        try {
            if (this.f1958l.getState(this.f1948b) == v.a.ENQUEUED) {
                this.f1958l.setState(v.a.RUNNING, this.f1948b);
                this.f1958l.incrementWorkSpecRunAttemptCount(this.f1948b);
                z8 = true;
            } else {
                z8 = false;
            }
            this.f1957k.setTransactionSuccessful();
            this.f1957k.endTransaction();
            return z8;
        } catch (Throwable th) {
            this.f1957k.endTransaction();
            throw th;
        }
    }

    void d() {
        if (!l()) {
            this.f1957k.beginTransaction();
            try {
                v.a state = this.f1958l.getState(this.f1948b);
                this.f1957k.workProgressDao().delete(this.f1948b);
                if (state == null) {
                    g(false);
                } else if (state == v.a.RUNNING) {
                    b(this.f1954h);
                } else if (!state.isFinished()) {
                    e();
                }
                this.f1957k.setTransactionSuccessful();
                this.f1957k.endTransaction();
            } catch (Throwable th) {
                this.f1957k.endTransaction();
                throw th;
            }
        }
        List list = this.f1949c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).cancel(this.f1948b);
            }
            f.schedule(this.f1955i, this.f1957k, this.f1949c);
        }
    }

    public C getFuture() {
        return this.f1963q;
    }

    public void interrupt() {
        boolean zIsDone;
        this.f1965s = true;
        l();
        C c9 = this.f1964r;
        if (c9 != null) {
            zIsDone = c9.isDone();
            this.f1964r.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f1952f;
        if (listenableWorker != null && !zIsDone) {
            listenableWorker.stop();
        } else {
            l.get().debug(f1946t, String.format("WorkSpec %s is already done. Not interrupting.", this.f1951e), new Throwable[0]);
        }
    }

    void j() {
        this.f1957k.beginTransaction();
        try {
            c(this.f1948b);
            this.f1958l.setOutput(this.f1948b, ((ListenableWorker.a.C0177a) this.f1954h).getOutputData());
            this.f1957k.setTransactionSuccessful();
        } finally {
            this.f1957k.endTransaction();
            g(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> tagsForWorkSpecId = this.f1960n.getTagsForWorkSpecId(this.f1948b);
        this.f1961o = tagsForWorkSpecId;
        this.f1962p = a(tagsForWorkSpecId);
        i();
    }
}
