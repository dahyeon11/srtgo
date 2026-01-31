package K0;

import H0.l;
import H0.p;
import H0.v;
import I0.i;
import P0.r;
import P0.s;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class g implements I0.e {

    /* renamed from: e, reason: collision with root package name */
    private static final String f2726e = l.tagWithPrefix("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f2727a;

    /* renamed from: b, reason: collision with root package name */
    private final JobScheduler f2728b;

    /* renamed from: c, reason: collision with root package name */
    private final i f2729c;

    /* renamed from: d, reason: collision with root package name */
    private final f f2730d;

    public g(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new f(context));
    }

    private static void a(JobScheduler jobScheduler, int i8) {
        try {
            jobScheduler.cancel(i8);
        } catch (Throwable th) {
            l.get().error(f2726e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i8)), th);
        }
    }

    private static List b(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listC = c(context, jobScheduler);
        if (listC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listC) {
            if (str.equals(d(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            l.get().error(f2726e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void cancelAll(Context context) {
        List listC;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listC = c(context, jobScheduler)) == null || listC.isEmpty()) {
            return;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private static String d(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean reconcileJobs(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listC = c(context, jobScheduler);
        List<String> workSpecIds = iVar.getWorkDatabase().systemIdInfoDao().getWorkSpecIds();
        boolean z8 = false;
        HashSet hashSet = new HashSet(listC != null ? listC.size() : 0);
        if (listC != null && !listC.isEmpty()) {
            for (JobInfo jobInfo : listC) {
                String strD = d(jobInfo);
                if (TextUtils.isEmpty(strD)) {
                    a(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strD);
                }
            }
        }
        Iterator<String> it = workSpecIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                l.get().debug(f2726e, "Reconciling jobs", new Throwable[0]);
                z8 = true;
                break;
            }
        }
        if (z8) {
            WorkDatabase workDatabase = iVar.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                s sVarWorkSpecDao = workDatabase.workSpecDao();
                Iterator<String> it2 = workSpecIds.iterator();
                while (it2.hasNext()) {
                    sVarWorkSpecDao.markWorkSpecScheduled(it2.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
        return z8;
    }

    @Override // I0.e
    public void cancel(String str) {
        List listB = b(this.f2727a, this.f2728b, str);
        if (listB == null || listB.isEmpty()) {
            return;
        }
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            a(this.f2728b, ((Integer) it.next()).intValue());
        }
        this.f2729c.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(str);
    }

    @Override // I0.e
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // I0.e
    public void schedule(r... rVarArr) {
        WorkDatabase workDatabase = this.f2729c.getWorkDatabase();
        Q0.f fVar = new Q0.f(workDatabase);
        for (r rVar : rVarArr) {
            workDatabase.beginTransaction();
            try {
                r workSpec = workDatabase.workSpecDao().getWorkSpec(rVar.id);
                if (workSpec == null) {
                    l.get().warning(f2726e, "Skipping scheduling " + rVar.id + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else if (workSpec.state != v.a.ENQUEUED) {
                    l.get().warning(f2726e, "Skipping scheduling " + rVar.id + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else {
                    P0.i systemIdInfo = workDatabase.systemIdInfoDao().getSystemIdInfo(rVar.id);
                    int iNextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.systemId : fVar.nextJobSchedulerIdWithRange(this.f2729c.getConfiguration().getMinJobSchedulerId(), this.f2729c.getConfiguration().getMaxJobSchedulerId());
                    if (systemIdInfo == null) {
                        this.f2729c.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo(new P0.i(rVar.id, iNextJobSchedulerIdWithRange));
                    }
                    scheduleInternal(rVar, iNextJobSchedulerIdWithRange);
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    public void scheduleInternal(r rVar, int i8) {
        JobInfo jobInfoA = this.f2730d.a(rVar, i8);
        l lVar = l.get();
        String str = f2726e;
        lVar.debug(str, String.format("Scheduling work ID %s Job ID %s", rVar.id, Integer.valueOf(i8)), new Throwable[0]);
        try {
            if (this.f2728b.schedule(jobInfoA) == 0) {
                l.get().warning(str, String.format("Unable to schedule work ID %s", rVar.id), new Throwable[0]);
                if (rVar.expedited && rVar.outOfQuotaPolicy == p.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    rVar.expedited = false;
                    l.get().debug(str, String.format("Scheduling a non-expedited job (work ID %s)", rVar.id), new Throwable[0]);
                    scheduleInternal(rVar, i8);
                }
            }
        } catch (IllegalStateException e8) {
            List listC = c(this.f2727a, this.f2728b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listC != null ? listC.size() : 0), Integer.valueOf(this.f2729c.getWorkDatabase().workSpecDao().getScheduledWork().size()), Integer.valueOf(this.f2729c.getConfiguration().getMaxSchedulerLimit()));
            l.get().error(f2726e, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e8);
        } catch (Throwable th) {
            l.get().error(f2726e, String.format("Unable to schedule %s", rVar), th);
        }
    }

    public g(Context context, i iVar, JobScheduler jobScheduler, f fVar) {
        this.f2727a = context;
        this.f2729c = iVar;
        this.f2728b = jobScheduler;
        this.f2730d = fVar;
    }
}
