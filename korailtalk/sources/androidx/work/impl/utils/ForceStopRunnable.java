package androidx.work.impl.utils;

import H0.l;
import H0.v;
import I0.f;
import I0.h;
import I0.i;
import K0.g;
import P0.p;
import P0.s;
import Q0.d;
import Q0.k;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.r;
import androidx.core.os.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11229d = l.tagWithPrefix("ForceStopRunnable");

    /* renamed from: e, reason: collision with root package name */
    private static final long f11230e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    private final Context f11231a;

    /* renamed from: b, reason: collision with root package name */
    private final i f11232b;

    /* renamed from: c, reason: collision with root package name */
    private int f11233c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f11234a = l.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            l.get().verbose(f11234a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f11231a = context.getApplicationContext();
        this.f11232b = iVar;
    }

    static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent b(Context context, int i8) {
        return PendingIntent.getBroadcast(context, -1, a(context), i8);
    }

    static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(r.CATEGORY_ALARM);
        PendingIntent pendingIntentB = b(context, a.isAtLeastS() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f11230e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentB);
        }
    }

    public boolean cleanUp() {
        boolean zReconcileJobs = g.reconcileJobs(this.f11231a, this.f11232b);
        WorkDatabase workDatabase = this.f11232b.getWorkDatabase();
        s sVarWorkSpecDao = workDatabase.workSpecDao();
        p pVarWorkProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            List<P0.r> runningWork = sVarWorkSpecDao.getRunningWork();
            boolean z8 = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z8) {
                for (P0.r rVar : runningWork) {
                    sVarWorkSpecDao.setState(v.a.ENQUEUED, rVar.id);
                    sVarWorkSpecDao.markWorkSpecScheduled(rVar.id, -1L);
                }
            }
            pVarWorkProgressDao.deleteAll();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            return z8 || zReconcileJobs;
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    boolean d() {
        return this.f11232b.getPreferenceUtils().getNeedsReschedule();
    }

    public void forceStopRunnable() {
        boolean zCleanUp = cleanUp();
        if (d()) {
            l.get().debug(f11229d, "Rescheduling Workers.", new Throwable[0]);
            this.f11232b.rescheduleEligibleWork();
            this.f11232b.getPreferenceUtils().setNeedsReschedule(false);
        } else if (isForceStopped()) {
            l.get().debug(f11229d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f11232b.rescheduleEligibleWork();
        } else if (zCleanUp) {
            l.get().debug(f11229d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.schedule(this.f11232b.getConfiguration(), this.f11232b.getWorkDatabase(), this.f11232b.getSchedulers());
        }
    }

    public boolean isForceStopped() {
        try {
            PendingIntent pendingIntentB = b(this.f11231a, a.isAtLeastS() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentB != null) {
                    pendingIntentB.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f11231a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i8 = 0; i8 < historicalProcessExitReasons.size(); i8++) {
                        if (d.a(historicalProcessExitReasons.get(i8)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentB == null) {
                c(this.f11231a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e8) {
            e = e8;
            l.get().warning(f11229d, "Ignoring exception", e);
            return true;
        } catch (SecurityException e9) {
            e = e9;
            l.get().warning(f11229d, "Ignoring exception", e);
            return true;
        }
    }

    public boolean multiProcessChecks() {
        androidx.work.a configuration = this.f11232b.getConfiguration();
        if (TextUtils.isEmpty(configuration.getDefaultProcessName())) {
            l.get().debug(f11229d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zIsDefaultProcess = k.isDefaultProcess(this.f11231a, configuration);
        l.get().debug(f11229d, String.format("Is default app process = %s", Boolean.valueOf(zIsDefaultProcess)), new Throwable[0]);
        return zIsDefaultProcess;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i8;
        try {
            if (!multiProcessChecks()) {
                return;
            }
            while (true) {
                h.migrateDatabase(this.f11231a);
                l.get().debug(f11229d, "Performing cleanup operations.", new Throwable[0]);
                try {
                    forceStopRunnable();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e8) {
                    i8 = this.f11233c + 1;
                    this.f11233c = i8;
                    if (i8 >= 3) {
                        l.get().error(f11229d, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                        this.f11232b.getConfiguration().getExceptionHandler();
                        throw illegalStateException;
                    }
                    l.get().debug(f11229d, String.format("Retrying after %s", Long.valueOf(i8 * 300)), e8);
                    sleep(this.f11233c * 300);
                }
                l.get().debug(f11229d, String.format("Retrying after %s", Long.valueOf(i8 * 300)), e8);
                sleep(this.f11233c * 300);
            }
        } finally {
            this.f11232b.onForceStopRunnableCompleted();
        }
    }

    public void sleep(long j8) throws InterruptedException {
        try {
            Thread.sleep(j8);
        } catch (InterruptedException unused) {
        }
    }
}
