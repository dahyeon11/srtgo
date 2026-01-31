package I0;

import H0.l;
import I0.j;
import Q0.r;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class d implements b, O0.a {

    /* renamed from: l */
    private static final String f1901l = l.tagWithPrefix("Processor");

    /* renamed from: b */
    private Context f1903b;

    /* renamed from: c */
    private androidx.work.a f1904c;

    /* renamed from: d */
    private R0.a f1905d;

    /* renamed from: e */
    private WorkDatabase f1906e;

    /* renamed from: h */
    private List f1909h;

    /* renamed from: g */
    private Map f1908g = new HashMap();

    /* renamed from: f */
    private Map f1907f = new HashMap();

    /* renamed from: i */
    private Set f1910i = new HashSet();

    /* renamed from: j */
    private final List f1911j = new ArrayList();

    /* renamed from: a */
    private PowerManager.WakeLock f1902a = null;

    /* renamed from: k */
    private final Object f1912k = new Object();

    private static class a implements Runnable {

        /* renamed from: a */
        private b f1913a;

        /* renamed from: b */
        private String f1914b;

        /* renamed from: c */
        private C f1915c;

        a(b bVar, String str, C c9) {
            this.f1913a = bVar;
            this.f1914b = str;
            this.f1915c = c9;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f1915c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f1913a.onExecuted(this.f1914b, zBooleanValue);
        }
    }

    public d(Context context, androidx.work.a aVar, R0.a aVar2, WorkDatabase workDatabase, List<e> list) {
        this.f1903b = context;
        this.f1904c = aVar;
        this.f1905d = aVar2;
        this.f1906e = workDatabase;
        this.f1909h = list;
    }

    private static boolean a(String str, j jVar) {
        if (jVar == null) {
            l.get().debug(f1901l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        jVar.interrupt();
        l.get().debug(f1901l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    private void b() {
        synchronized (this.f1912k) {
            try {
                if (this.f1907f.isEmpty()) {
                    try {
                        this.f1903b.startService(androidx.work.impl.foreground.a.createStopForegroundIntent(this.f1903b));
                    } catch (Throwable th) {
                        l.get().error(f1901l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f1902a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f1902a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addExecutionListener(b bVar) {
        synchronized (this.f1912k) {
            this.f1911j.add(bVar);
        }
    }

    public boolean hasWork() {
        boolean z8;
        synchronized (this.f1912k) {
            try {
                z8 = (this.f1908g.isEmpty() && this.f1907f.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z8;
    }

    public boolean isCancelled(String str) {
        boolean zContains;
        synchronized (this.f1912k) {
            zContains = this.f1910i.contains(str);
        }
        return zContains;
    }

    public boolean isEnqueued(String str) {
        boolean z8;
        synchronized (this.f1912k) {
            try {
                z8 = this.f1908g.containsKey(str) || this.f1907f.containsKey(str);
            } finally {
            }
        }
        return z8;
    }

    public boolean isEnqueuedInForeground(String str) {
        boolean zContainsKey;
        synchronized (this.f1912k) {
            zContainsKey = this.f1907f.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // I0.b
    public void onExecuted(String str, boolean z8) {
        synchronized (this.f1912k) {
            try {
                this.f1908g.remove(str);
                l.get().debug(f1901l, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z8)), new Throwable[0]);
                Iterator it = this.f1911j.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).onExecuted(str, z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeExecutionListener(b bVar) {
        synchronized (this.f1912k) {
            this.f1911j.remove(bVar);
        }
    }

    @Override // O0.a
    public void startForeground(String str, H0.g gVar) {
        synchronized (this.f1912k) {
            try {
                l.get().info(f1901l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                j jVar = (j) this.f1908g.remove(str);
                if (jVar != null) {
                    if (this.f1902a == null) {
                        PowerManager.WakeLock wakeLockNewWakeLock = r.newWakeLock(this.f1903b, "ProcessorForegroundLck");
                        this.f1902a = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                    }
                    this.f1907f.put(str, jVar);
                    androidx.core.content.a.startForegroundService(this.f1903b, androidx.work.impl.foreground.a.createStartForegroundIntent(this.f1903b, str, gVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean startWork(String str) {
        return startWork(str, null);
    }

    public boolean stopAndCancelWork(String str) {
        boolean zA;
        synchronized (this.f1912k) {
            try {
                l.get().debug(f1901l, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f1910i.add(str);
                j jVar = (j) this.f1907f.remove(str);
                boolean z8 = jVar != null;
                if (jVar == null) {
                    jVar = (j) this.f1908g.remove(str);
                }
                zA = a(str, jVar);
                if (z8) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zA;
    }

    @Override // O0.a
    public void stopForeground(String str) {
        synchronized (this.f1912k) {
            this.f1907f.remove(str);
            b();
        }
    }

    public boolean stopForegroundWork(String str) {
        boolean zA;
        synchronized (this.f1912k) {
            l.get().debug(f1901l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zA = a(str, (j) this.f1907f.remove(str));
        }
        return zA;
    }

    public boolean stopWork(String str) {
        boolean zA;
        synchronized (this.f1912k) {
            l.get().debug(f1901l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zA = a(str, (j) this.f1908g.remove(str));
        }
        return zA;
    }

    public boolean startWork(String str, WorkerParameters.a aVar) {
        synchronized (this.f1912k) {
            try {
                if (isEnqueued(str)) {
                    l.get().debug(f1901l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                j jVarBuild = new j.c(this.f1903b, this.f1904c, this.f1905d, this, this.f1906e, str).withSchedulers(this.f1909h).withRuntimeExtras(aVar).build();
                C future = jVarBuild.getFuture();
                future.addListener(new a(this, str, future), this.f1905d.getMainThreadExecutor());
                this.f1908g.put(str, jVarBuild);
                this.f1905d.getBackgroundExecutor().execute(jVarBuild);
                l.get().debug(f1901l, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
