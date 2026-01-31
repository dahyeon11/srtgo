package androidx.work.impl.background.systemalarm;

import H0.l;
import Q0.r;
import Q0.v;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class d implements L0.c, I0.b, v.b {

    /* renamed from: j, reason: collision with root package name */
    private static final String f11170j = l.tagWithPrefix("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f11171a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11172b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11173c;

    /* renamed from: d, reason: collision with root package name */
    private final e f11174d;

    /* renamed from: e, reason: collision with root package name */
    private final L0.d f11175e;

    /* renamed from: h, reason: collision with root package name */
    private PowerManager.WakeLock f11178h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11179i = false;

    /* renamed from: g, reason: collision with root package name */
    private int f11177g = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f11176f = new Object();

    d(Context context, int i8, String str, e eVar) {
        this.f11171a = context;
        this.f11172b = i8;
        this.f11174d = eVar;
        this.f11173c = str;
        this.f11175e = new L0.d(context, eVar.d(), this);
    }

    private void a() {
        synchronized (this.f11176f) {
            try {
                this.f11175e.reset();
                this.f11174d.f().stopTimer(this.f11173c);
                PowerManager.WakeLock wakeLock = this.f11178h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    l.get().debug(f11170j, String.format("Releasing wakelock %s for WorkSpec %s", this.f11178h, this.f11173c), new Throwable[0]);
                    this.f11178h.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c() {
        synchronized (this.f11176f) {
            try {
                if (this.f11177g < 2) {
                    this.f11177g = 2;
                    l lVar = l.get();
                    String str = f11170j;
                    lVar.debug(str, String.format("Stopping work for WorkSpec %s", this.f11173c), new Throwable[0]);
                    Intent intentE = b.e(this.f11171a, this.f11173c);
                    e eVar = this.f11174d;
                    eVar.i(new e.b(eVar, intentE, this.f11172b));
                    if (this.f11174d.c().isEnqueued(this.f11173c)) {
                        l.get().debug(str, String.format("WorkSpec %s needs to be rescheduled", this.f11173c), new Throwable[0]);
                        Intent intentD = b.d(this.f11171a, this.f11173c);
                        e eVar2 = this.f11174d;
                        eVar2.i(new e.b(eVar2, intentD, this.f11172b));
                    } else {
                        l.get().debug(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f11173c), new Throwable[0]);
                    }
                } else {
                    l.get().debug(f11170j, String.format("Already stopped work for %s", this.f11173c), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void b() {
        this.f11178h = r.newWakeLock(this.f11171a, String.format("%s (%s)", this.f11173c, Integer.valueOf(this.f11172b)));
        l lVar = l.get();
        String str = f11170j;
        lVar.debug(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f11178h, this.f11173c), new Throwable[0]);
        this.f11178h.acquire();
        P0.r workSpec = this.f11174d.e().getWorkDatabase().workSpecDao().getWorkSpec(this.f11173c);
        if (workSpec == null) {
            c();
            return;
        }
        boolean zHasConstraints = workSpec.hasConstraints();
        this.f11179i = zHasConstraints;
        if (zHasConstraints) {
            this.f11175e.replace(Collections.singletonList(workSpec));
        } else {
            l.get().debug(str, String.format("No constraints for %s", this.f11173c), new Throwable[0]);
            onAllConstraintsMet(Collections.singletonList(this.f11173c));
        }
    }

    @Override // L0.c
    public void onAllConstraintsMet(List<String> list) {
        if (list.contains(this.f11173c)) {
            synchronized (this.f11176f) {
                try {
                    if (this.f11177g == 0) {
                        this.f11177g = 1;
                        l.get().debug(f11170j, String.format("onAllConstraintsMet for %s", this.f11173c), new Throwable[0]);
                        if (this.f11174d.c().startWork(this.f11173c)) {
                            this.f11174d.f().startTimer(this.f11173c, 600000L, this);
                        } else {
                            a();
                        }
                    } else {
                        l.get().debug(f11170j, String.format("Already started work for %s", this.f11173c), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // L0.c
    public void onAllConstraintsNotMet(List<String> list) {
        c();
    }

    @Override // I0.b
    public void onExecuted(String str, boolean z8) {
        l.get().debug(f11170j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z8)), new Throwable[0]);
        a();
        if (z8) {
            Intent intentD = b.d(this.f11171a, this.f11173c);
            e eVar = this.f11174d;
            eVar.i(new e.b(eVar, intentD, this.f11172b));
        }
        if (this.f11179i) {
            Intent intentA = b.a(this.f11171a);
            e eVar2 = this.f11174d;
            eVar2.i(new e.b(eVar2, intentA, this.f11172b));
        }
    }

    @Override // Q0.v.b
    public void onTimeLimitExceeded(String str) {
        l.get().debug(f11170j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        c();
    }
}
