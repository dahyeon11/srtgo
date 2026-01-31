package androidx.work.impl.background.systemalarm;

import H0.l;
import I0.i;
import Q0.n;
import Q0.r;
import Q0.v;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class e implements I0.b {

    /* renamed from: k, reason: collision with root package name */
    static final String f11180k = l.tagWithPrefix("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    final Context f11181a;

    /* renamed from: b, reason: collision with root package name */
    private final R0.a f11182b;

    /* renamed from: c, reason: collision with root package name */
    private final v f11183c;

    /* renamed from: d, reason: collision with root package name */
    private final I0.d f11184d;

    /* renamed from: e, reason: collision with root package name */
    private final i f11185e;

    /* renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f11186f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f11187g;

    /* renamed from: h, reason: collision with root package name */
    final List f11188h;

    /* renamed from: i, reason: collision with root package name */
    Intent f11189i;

    /* renamed from: j, reason: collision with root package name */
    private c f11190j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f11188h) {
                e eVar2 = e.this;
                eVar2.f11189i = (Intent) eVar2.f11188h.get(0);
            }
            Intent intent = e.this.f11189i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f11189i.getIntExtra("KEY_START_ID", 0);
                l lVar = l.get();
                String str = e.f11180k;
                lVar.debug(str, String.format("Processing command %s, %s", e.this.f11189i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockNewWakeLock = r.newWakeLock(e.this.f11181a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    l.get().debug(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockNewWakeLock), new Throwable[0]);
                    wakeLockNewWakeLock.acquire();
                    e eVar3 = e.this;
                    eVar3.f11186f.n(eVar3.f11189i, intExtra, eVar3);
                    l.get().debug(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockNewWakeLock), new Throwable[0]);
                    wakeLockNewWakeLock.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        l lVar2 = l.get();
                        String str2 = e.f11180k;
                        lVar2.error(str2, "Unexpected error in onHandleIntent", th);
                        l.get().debug(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockNewWakeLock), new Throwable[0]);
                        wakeLockNewWakeLock.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        l.get().debug(e.f11180k, String.format("Releasing operation wake lock (%s) %s", action, wakeLockNewWakeLock), new Throwable[0]);
                        wakeLockNewWakeLock.release();
                        e eVar4 = e.this;
                        eVar4.i(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.i(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final e f11192a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f11193b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11194c;

        b(e eVar, Intent intent, int i8) {
            this.f11192a = eVar;
            this.f11193b = intent;
            this.f11194c = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11192a.add(this.f11193b, this.f11194c);
        }
    }

    interface c {
        void onAllCommandsCompleted();
    }

    static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final e f11195a;

        d(e eVar) {
            this.f11195a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11195a.b();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    private void a() {
        if (this.f11187g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean g(String str) {
        a();
        synchronized (this.f11188h) {
            try {
                Iterator it = this.f11188h.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void j() {
        a();
        PowerManager.WakeLock wakeLockNewWakeLock = r.newWakeLock(this.f11181a, "ProcessCommand");
        try {
            wakeLockNewWakeLock.acquire();
            this.f11185e.getWorkTaskExecutor().executeOnBackgroundThread(new a());
        } finally {
            wakeLockNewWakeLock.release();
        }
    }

    public boolean add(Intent intent, int i8) {
        l lVar = l.get();
        String str = f11180k;
        lVar.debug(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i8)), new Throwable[0]);
        a();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            l.get().warning(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && g("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i8);
        synchronized (this.f11188h) {
            try {
                boolean zIsEmpty = this.f11188h.isEmpty();
                this.f11188h.add(intent);
                if (zIsEmpty) {
                    j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    void b() {
        l lVar = l.get();
        String str = f11180k;
        lVar.debug(str, "Checking if commands are complete.", new Throwable[0]);
        a();
        synchronized (this.f11188h) {
            try {
                if (this.f11189i != null) {
                    l.get().debug(str, String.format("Removing command %s", this.f11189i), new Throwable[0]);
                    if (!((Intent) this.f11188h.remove(0)).equals(this.f11189i)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f11189i = null;
                }
                n backgroundExecutor = this.f11182b.getBackgroundExecutor();
                if (!this.f11186f.m() && this.f11188h.isEmpty() && !backgroundExecutor.hasPendingTasks()) {
                    l.get().debug(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.f11190j;
                    if (cVar != null) {
                        cVar.onAllCommandsCompleted();
                    }
                } else if (!this.f11188h.isEmpty()) {
                    j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    I0.d c() {
        return this.f11184d;
    }

    R0.a d() {
        return this.f11182b;
    }

    i e() {
        return this.f11185e;
    }

    v f() {
        return this.f11183c;
    }

    void h() {
        l.get().debug(f11180k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f11184d.removeExecutionListener(this);
        this.f11183c.onDestroy();
        this.f11190j = null;
    }

    void i(Runnable runnable) {
        this.f11187g.post(runnable);
    }

    void k(c cVar) {
        if (this.f11190j != null) {
            l.get().error(f11180k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f11190j = cVar;
        }
    }

    @Override // I0.b
    public void onExecuted(String str, boolean z8) {
        i(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f11181a, str, z8), 0));
    }

    e(Context context, I0.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f11181a = applicationContext;
        this.f11186f = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f11183c = new v();
        iVar = iVar == null ? i.getInstance(context) : iVar;
        this.f11185e = iVar;
        dVar = dVar == null ? iVar.getProcessor() : dVar;
        this.f11184d = dVar;
        this.f11182b = iVar.getWorkTaskExecutor();
        dVar.addExecutionListener(this);
        this.f11188h = new ArrayList();
        this.f11189i = null;
        this.f11187g = new Handler(Looper.getMainLooper());
    }
}
