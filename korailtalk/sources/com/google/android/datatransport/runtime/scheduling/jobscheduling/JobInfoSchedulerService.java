package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import o1.l;
import o1.q;
import x1.C6483a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i8 = jobParameters.getExtras().getInt("priority");
        int i9 = jobParameters.getExtras().getInt("attemptNumber");
        q.initialize(getApplicationContext());
        l.a priority = l.builder().setBackendName(string).setPriority(C6483a.valueOf(i8));
        if (string2 != null) {
            priority.setExtras(Base64.decode(string2, 0));
        }
        q.getInstance().getUploader().upload(priority.build(), i9, b.lambdaFactory$(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
