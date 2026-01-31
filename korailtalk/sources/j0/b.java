package J0;

import H0.l;
import H0.v;
import I0.e;
import I0.i;
import L0.c;
import L0.d;
import P0.r;
import Q0.k;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class b implements e, c, I0.b {

    /* renamed from: i, reason: collision with root package name */
    private static final String f2523i = l.tagWithPrefix("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f2524a;

    /* renamed from: b, reason: collision with root package name */
    private final i f2525b;

    /* renamed from: c, reason: collision with root package name */
    private final d f2526c;

    /* renamed from: e, reason: collision with root package name */
    private a f2528e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2529f;

    /* renamed from: h, reason: collision with root package name */
    Boolean f2531h;

    /* renamed from: d, reason: collision with root package name */
    private final Set f2527d = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f2530g = new Object();

    public b(Context context, androidx.work.a aVar, R0.a aVar2, i iVar) {
        this.f2524a = context;
        this.f2525b = iVar;
        this.f2526c = new d(context, aVar2, this);
        this.f2528e = new a(this, aVar.getRunnableScheduler());
    }

    private void a() {
        this.f2531h = Boolean.valueOf(k.isDefaultProcess(this.f2524a, this.f2525b.getConfiguration()));
    }

    private void b() {
        if (this.f2529f) {
            return;
        }
        this.f2525b.getProcessor().addExecutionListener(this);
        this.f2529f = true;
    }

    private void c(String str) {
        synchronized (this.f2530g) {
            try {
                Iterator it = this.f2527d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r rVar = (r) it.next();
                    if (rVar.id.equals(str)) {
                        l.get().debug(f2523i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f2527d.remove(rVar);
                        this.f2526c.replace(this.f2527d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I0.e
    public void cancel(String str) {
        if (this.f2531h == null) {
            a();
        }
        if (!this.f2531h.booleanValue()) {
            l.get().info(f2523i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        b();
        l.get().debug(f2523i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f2528e;
        if (aVar != null) {
            aVar.unschedule(str);
        }
        this.f2525b.stopWork(str);
    }

    @Override // I0.e
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    @Override // L0.c
    public void onAllConstraintsMet(List<String> list) {
        for (String str : list) {
            l.get().debug(f2523i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f2525b.startWork(str);
        }
    }

    @Override // L0.c
    public void onAllConstraintsNotMet(List<String> list) {
        for (String str : list) {
            l.get().debug(f2523i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f2525b.stopWork(str);
        }
    }

    @Override // I0.b
    public void onExecuted(String str, boolean z8) {
        c(str);
    }

    @Override // I0.e
    public void schedule(r... rVarArr) {
        if (this.f2531h == null) {
            a();
        }
        if (!this.f2531h.booleanValue()) {
            l.get().info(f2523i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        b();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (r rVar : rVarArr) {
            long jCalculateNextRunTime = rVar.calculateNextRunTime();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (rVar.state == v.a.ENQUEUED) {
                if (jCurrentTimeMillis < jCalculateNextRunTime) {
                    a aVar = this.f2528e;
                    if (aVar != null) {
                        aVar.schedule(rVar);
                    }
                } else if (!rVar.hasConstraints()) {
                    l.get().debug(f2523i, String.format("Starting work for %s", rVar.id), new Throwable[0]);
                    this.f2525b.startWork(rVar.id);
                } else if (rVar.constraints.requiresDeviceIdle()) {
                    l.get().debug(f2523i, String.format("Ignoring WorkSpec %s, Requires device idle.", rVar), new Throwable[0]);
                } else if (rVar.constraints.hasContentUriTriggers()) {
                    l.get().debug(f2523i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", rVar), new Throwable[0]);
                } else {
                    hashSet.add(rVar);
                    hashSet2.add(rVar.id);
                }
            }
        }
        synchronized (this.f2530g) {
            try {
                if (!hashSet.isEmpty()) {
                    l.get().debug(f2523i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f2527d.addAll(hashSet);
                    this.f2526c.replace(this.f2527d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setDelayedWorkTracker(a aVar) {
        this.f2528e = aVar;
    }

    public b(Context context, i iVar, d dVar) {
        this.f2524a = context;
        this.f2525b = iVar;
        this.f2526c = dVar;
    }
}
