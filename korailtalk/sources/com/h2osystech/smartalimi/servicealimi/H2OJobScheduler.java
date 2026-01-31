package com.h2osystech.smartalimi.servicealimi;

import H0.q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.h2osystech.smartalimi.common.LogFile;

/* loaded from: classes2.dex */
public class H2OJobScheduler {
    private static final int JOB_ID_UPDATE = 4096;
    private static final String TAG = "H2OJobScheduler";

    public static void setUpdateJob(Context context) {
        JobInfo jobInfoBuild = new JobInfo.Builder(4096, new ComponentName(context, (Class<?>) SyncJobService.class)).setRequiredNetworkType(1).setOverrideDeadline(q.MIN_PERIODIC_INTERVAL_MILLIS).build();
        LogFile.log(TAG, 1, "REGIST_SCHADULE JOB  ");
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            LogFile.log(TAG, 1, "REGIST_SCHADULE Update JOB  ");
            jobScheduler.schedule(jobInfoBuild);
        }
    }
}
