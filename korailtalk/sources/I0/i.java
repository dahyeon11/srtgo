package I0;

import H0.l;
import H0.n;
import H0.o;
import H0.q;
import H0.s;
import H0.u;
import H0.v;
import H0.w;
import H0.x;
import H0.y;
import P0.r;
import Q0.m;
import Q0.p;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.google.common.util.concurrent.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p.InterfaceC6046a;

/* loaded from: classes.dex */
public class i extends w {
    public static final int MAX_PRE_JOB_SCHEDULER_API_LEVEL = 22;
    public static final int MIN_JOB_SCHEDULER_API_LEVEL = 23;
    public static final String REMOTE_WORK_MANAGER_CLIENT = "androidx.work.multiprocess.RemoteWorkManagerClient";

    /* renamed from: j */
    private static final String f1929j = l.tagWithPrefix("WorkManagerImpl");

    /* renamed from: k */
    private static i f1930k = null;

    /* renamed from: l */
    private static i f1931l = null;

    /* renamed from: m */
    private static final Object f1932m = new Object();

    /* renamed from: a */
    private Context f1933a;

    /* renamed from: b */
    private androidx.work.a f1934b;

    /* renamed from: c */
    private WorkDatabase f1935c;

    /* renamed from: d */
    private R0.a f1936d;

    /* renamed from: e */
    private List f1937e;

    /* renamed from: f */
    private d f1938f;

    /* renamed from: g */
    private Q0.i f1939g;

    /* renamed from: h */
    private boolean f1940h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f1941i;

    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ androidx.work.impl.utils.futures.c f1942a;

        /* renamed from: b */
        final /* synthetic */ Q0.i f1943b;

        a(androidx.work.impl.utils.futures.c cVar, Q0.i iVar) {
            this.f1942a = cVar;
            this.f1943b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1942a.set(Long.valueOf(this.f1943b.getLastCancelAllTimeMillis()));
            } catch (Throwable th) {
                this.f1942a.setException(th);
            }
        }
    }

    class b implements InterfaceC6046a {
        b() {
        }

        @Override // p.InterfaceC6046a
        public v apply(List<r.c> list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return list.get(0).toWorkInfo();
        }
    }

    public i(Context context, androidx.work.a aVar, R0.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(s.workmanager_test_configuration));
    }

    private void b(Context context, androidx.work.a aVar, R0.a aVar2, WorkDatabase workDatabase, List list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f1933a = applicationContext;
        this.f1934b = aVar;
        this.f1936d = aVar2;
        this.f1935c = workDatabase;
        this.f1937e = list;
        this.f1938f = dVar;
        this.f1939g = new Q0.i(workDatabase);
        this.f1940h = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f1936d.executeOnBackgroundThread(new ForceStopRunnable(applicationContext, this));
    }

    private void c() {
        try {
            android.support.v4.media.session.f.a(Class.forName(REMOTE_WORK_MANAGER_CLIENT).getConstructor(Context.class, i.class).newInstance(this.f1933a, this));
        } catch (Throwable th) {
            l.get().debug(f1929j, "Unable to initialize multi-process support", th);
        }
    }

    @Deprecated
    public static i getInstance() {
        synchronized (f1932m) {
            try {
                i iVar = f1930k;
                if (iVar != null) {
                    return iVar;
                }
                return f1931l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void initialize(Context context, androidx.work.a aVar) {
        synchronized (f1932m) {
            try {
                i iVar = f1930k;
                if (iVar != null && f1931l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (iVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f1931l == null) {
                        f1931l = new i(applicationContext, aVar, new R0.b(aVar.getTaskExecutor()));
                    }
                    f1930k = f1931l;
                }
            } finally {
            }
        }
    }

    public static void setDelegate(i iVar) {
        synchronized (f1932m) {
            f1930k = iVar;
        }
    }

    LiveData a(List list) {
        return Q0.g.dedupedMappedLiveDataFor(this.f1935c.workSpecDao().getWorkStatusPojoLiveDataForIds(list), r.WORK_INFO_MAPPER, this.f1936d);
    }

    @Override // H0.w
    public u beginUniqueWork(String str, H0.f fVar, List<n> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new g(this, str, fVar, list);
    }

    @Override // H0.w
    public u beginWith(List<n> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new g(this, list);
    }

    @Override // H0.w
    public o cancelAllWork() {
        Q0.a aVarForAll = Q0.a.forAll(this);
        this.f1936d.executeOnBackgroundThread(aVarForAll);
        return aVarForAll.getOperation();
    }

    @Override // H0.w
    public o cancelAllWorkByTag(String str) {
        Q0.a aVarForTag = Q0.a.forTag(str, this);
        this.f1936d.executeOnBackgroundThread(aVarForTag);
        return aVarForTag.getOperation();
    }

    @Override // H0.w
    public o cancelUniqueWork(String str) {
        Q0.a aVarForName = Q0.a.forName(str, this, true);
        this.f1936d.executeOnBackgroundThread(aVarForName);
        return aVarForName.getOperation();
    }

    @Override // H0.w
    public o cancelWorkById(UUID uuid) {
        Q0.a aVarForId = Q0.a.forId(uuid, this);
        this.f1936d.executeOnBackgroundThread(aVarForId);
        return aVarForId.getOperation();
    }

    @Override // H0.w
    public PendingIntent createCancelPendingIntent(UUID uuid) {
        return PendingIntent.getService(this.f1933a, 0, androidx.work.impl.foreground.a.createCancelWorkIntent(this.f1933a, uuid.toString()), androidx.core.os.a.isAtLeastS() ? 167772160 : 134217728);
    }

    public List<e> createSchedulers(Context context, androidx.work.a aVar, R0.a aVar2) {
        return Arrays.asList(f.a(context, this), new J0.b(context, aVar, aVar2, this));
    }

    public g createWorkContinuationForUniquePeriodicWork(String str, H0.e eVar, q qVar) {
        return new g(this, str, eVar == H0.e.KEEP ? H0.f.KEEP : H0.f.REPLACE, Collections.singletonList(qVar));
    }

    @Override // H0.w
    public o enqueue(List<? extends y> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).enqueue();
    }

    @Override // H0.w
    public o enqueueUniquePeriodicWork(String str, H0.e eVar, q qVar) {
        return createWorkContinuationForUniquePeriodicWork(str, eVar, qVar).enqueue();
    }

    @Override // H0.w
    public o enqueueUniqueWork(String str, H0.f fVar, List<n> list) {
        return new g(this, str, fVar, list).enqueue();
    }

    public Context getApplicationContext() {
        return this.f1933a;
    }

    public androidx.work.a getConfiguration() {
        return this.f1934b;
    }

    @Override // H0.w
    public C getLastCancelAllTimeMillis() {
        androidx.work.impl.utils.futures.c cVarCreate = androidx.work.impl.utils.futures.c.create();
        this.f1936d.executeOnBackgroundThread(new a(cVarCreate, this.f1939g));
        return cVarCreate;
    }

    @Override // H0.w
    public LiveData getLastCancelAllTimeMillisLiveData() {
        return this.f1939g.getLastCancelAllTimeMillisLiveData();
    }

    public Q0.i getPreferenceUtils() {
        return this.f1939g;
    }

    public d getProcessor() {
        return this.f1938f;
    }

    public S0.a getRemoteWorkManager() {
        synchronized (f1932m) {
            try {
                c();
                if (!TextUtils.isEmpty(this.f1934b.getDefaultProcessName())) {
                    throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public List<e> getSchedulers() {
        return this.f1937e;
    }

    public WorkDatabase getWorkDatabase() {
        return this.f1935c;
    }

    @Override // H0.w
    public C getWorkInfoById(UUID uuid) {
        p pVarForUUID = p.forUUID(this, uuid);
        this.f1936d.getBackgroundExecutor().execute(pVarForUUID);
        return pVarForUUID.getFuture();
    }

    @Override // H0.w
    public LiveData getWorkInfoByIdLiveData(UUID uuid) {
        return Q0.g.dedupedMappedLiveDataFor(this.f1935c.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(uuid.toString())), new b(), this.f1936d);
    }

    @Override // H0.w
    public C getWorkInfos(x xVar) {
        p pVarForWorkQuerySpec = p.forWorkQuerySpec(this, xVar);
        this.f1936d.getBackgroundExecutor().execute(pVarForWorkQuerySpec);
        return pVarForWorkQuerySpec.getFuture();
    }

    @Override // H0.w
    public C getWorkInfosByTag(String str) {
        p pVarForTag = p.forTag(this, str);
        this.f1936d.getBackgroundExecutor().execute(pVarForTag);
        return pVarForTag.getFuture();
    }

    @Override // H0.w
    public LiveData getWorkInfosByTagLiveData(String str) {
        return Q0.g.dedupedMappedLiveDataFor(this.f1935c.workSpecDao().getWorkStatusPojoLiveDataForTag(str), r.WORK_INFO_MAPPER, this.f1936d);
    }

    @Override // H0.w
    public C getWorkInfosForUniqueWork(String str) {
        p pVarForUniqueWork = p.forUniqueWork(this, str);
        this.f1936d.getBackgroundExecutor().execute(pVarForUniqueWork);
        return pVarForUniqueWork.getFuture();
    }

    @Override // H0.w
    public LiveData getWorkInfosForUniqueWorkLiveData(String str) {
        return Q0.g.dedupedMappedLiveDataFor(this.f1935c.workSpecDao().getWorkStatusPojoLiveDataForName(str), r.WORK_INFO_MAPPER, this.f1936d);
    }

    @Override // H0.w
    public LiveData getWorkInfosLiveData(x xVar) {
        return Q0.g.dedupedMappedLiveDataFor(this.f1935c.rawWorkInfoDao().getWorkInfoPojosLiveData(m.workQueryToRawQuery(xVar)), r.WORK_INFO_MAPPER, this.f1936d);
    }

    public R0.a getWorkTaskExecutor() {
        return this.f1936d;
    }

    public void onForceStopRunnableCompleted() {
        synchronized (f1932m) {
            try {
                this.f1940h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f1941i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f1941i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H0.w
    public o pruneWork() {
        Q0.l lVar = new Q0.l(this);
        this.f1936d.executeOnBackgroundThread(lVar);
        return lVar.getOperation();
    }

    public void rescheduleEligibleWork() {
        K0.g.cancelAll(getApplicationContext());
        getWorkDatabase().workSpecDao().resetScheduledState();
        f.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
    }

    public void setReschedulePendingResult(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f1932m) {
            try {
                this.f1941i = pendingResult;
                if (this.f1940h) {
                    pendingResult.finish();
                    this.f1941i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void startWork(String str) {
        startWork(str, null);
    }

    public void stopForegroundWork(String str) {
        this.f1936d.executeOnBackgroundThread(new Q0.q(this, str, true));
    }

    public void stopWork(String str) {
        this.f1936d.executeOnBackgroundThread(new Q0.q(this, str, false));
    }

    public void startWork(String str, WorkerParameters.a aVar) {
        this.f1936d.executeOnBackgroundThread(new Q0.o(this, str, aVar));
    }

    public i(Context context, androidx.work.a aVar, R0.a aVar2, boolean z8) {
        this(context, aVar, aVar2, WorkDatabase.create(context.getApplicationContext(), aVar2.getBackgroundExecutor(), z8));
    }

    public static i getInstance(Context context) {
        i iVar;
        synchronized (f1932m) {
            try {
                iVar = getInstance();
                if (iVar == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public i(Context context, androidx.work.a aVar, R0.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        l.setLogger(new l.a(aVar.getMinimumLoggingLevel()));
        List<e> listCreateSchedulers = createSchedulers(applicationContext, aVar, aVar2);
        b(context, aVar, aVar2, workDatabase, listCreateSchedulers, new d(context, aVar, aVar2, workDatabase, listCreateSchedulers));
    }

    public i(Context context, androidx.work.a aVar, R0.a aVar2, WorkDatabase workDatabase, List<e> list, d dVar) {
        b(context, aVar, aVar2, workDatabase, list, dVar);
    }
}
