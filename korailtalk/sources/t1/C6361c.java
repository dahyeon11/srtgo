package t1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import q1.AbstractC6104a;
import u1.InterfaceC6407c;
import x1.C6483a;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6361c implements p {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36892a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6407c f36893b;

    /* renamed from: c, reason: collision with root package name */
    private final d f36894c;

    public C6361c(Context context, InterfaceC6407c interfaceC6407c, d dVar) {
        this.f36892a = context;
        this.f36893b = interfaceC6407c;
        this.f36894c = dVar;
    }

    private boolean b(JobScheduler jobScheduler, int i8, int i9) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i10 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i8) {
                return i10 >= i9;
            }
        }
        return false;
    }

    int a(o1.l lVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f36892a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(lVar.getBackendName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C6483a.toInt(lVar.getPriority())).array());
        if (lVar.getExtras() != null) {
            adler32.update(lVar.getExtras());
        }
        return (int) adler32.getValue();
    }

    @Override // t1.p
    public void schedule(o1.l lVar, int i8) {
        ComponentName componentName = new ComponentName(this.f36892a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f36892a.getSystemService("jobscheduler");
        int iA = a(lVar);
        if (b(jobScheduler, iA, i8)) {
            AbstractC6104a.d("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", lVar);
            return;
        }
        long nextCallTime = this.f36893b.getNextCallTime(lVar);
        JobInfo.Builder builderConfigureJob = this.f36894c.configureJob(new JobInfo.Builder(iA, componentName), lVar.getPriority(), nextCallTime, i8);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i8);
        persistableBundle.putString("backendName", lVar.getBackendName());
        persistableBundle.putInt("priority", C6483a.toInt(lVar.getPriority()));
        if (lVar.getExtras() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(lVar.getExtras(), 0));
        }
        builderConfigureJob.setExtras(persistableBundle);
        AbstractC6104a.d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", lVar, Integer.valueOf(iA), Long.valueOf(this.f36894c.getScheduleDelay(lVar.getPriority(), nextCallTime, i8)), Long.valueOf(nextCallTime), Integer.valueOf(i8));
        jobScheduler.schedule(builderConfigureJob.build());
    }
}
