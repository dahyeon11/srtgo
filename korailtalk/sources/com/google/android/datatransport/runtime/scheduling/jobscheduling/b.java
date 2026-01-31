package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* loaded from: classes.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final JobInfoSchedulerService f11742a;

    /* renamed from: b, reason: collision with root package name */
    private final JobParameters f11743b;

    private b(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f11742a = jobInfoSchedulerService;
        this.f11743b = jobParameters;
    }

    public static Runnable lambdaFactory$(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new b(jobInfoSchedulerService, jobParameters);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11742a.jobFinished(this.f11743b, false);
    }
}
