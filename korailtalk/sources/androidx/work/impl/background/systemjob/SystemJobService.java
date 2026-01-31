package androidx.work.impl.background.systemjob;

import H0.l;
import I0.b;
import I0.i;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11196c = l.tagWithPrefix("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    private i f11197a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f11198b = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i iVar = i.getInstance(getApplicationContext());
            this.f11197a = iVar;
            iVar.getProcessor().addExecutionListener(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            l.get().warning(f11196c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f11197a;
        if (iVar != null) {
            iVar.getProcessor().removeExecutionListener(this);
        }
    }

    @Override // I0.b
    public void onExecuted(String str, boolean z8) {
        JobParameters jobParameters;
        l.get().debug(f11196c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f11198b) {
            jobParameters = (JobParameters) this.f11198b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z8);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f11197a == null) {
            l.get().debug(f11196c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            l.get().error(f11196c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f11198b) {
            try {
                if (this.f11198b.containsKey(strA)) {
                    l.get().debug(f11196c, String.format("Job is already being executed by SystemJobService: %s", strA), new Throwable[0]);
                    return false;
                }
                l.get().debug(f11196c, String.format("onStartJob for %s", strA), new Throwable[0]);
                this.f11198b.put(strA, jobParameters);
                int i8 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.triggeredContentUris = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.triggeredContentAuthorities = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i8 >= 28) {
                    aVar.network = jobParameters.getNetwork();
                }
                this.f11197a.startWork(strA, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f11197a == null) {
            l.get().debug(f11196c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            l.get().error(f11196c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        l.get().debug(f11196c, String.format("onStopJob for %s", strA), new Throwable[0]);
        synchronized (this.f11198b) {
            this.f11198b.remove(strA);
        }
        this.f11197a.stopWork(strA);
        return !this.f11197a.getProcessor().isCancelled(strA);
    }
}
