package com.h2osystech.smartalimi.servicealimi;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.AsyncTask;
import com.h2osystech.smartalimi.common.LogFile;

/* loaded from: classes2.dex */
public class SyncJobService extends JobService {
    private static final String TAG = "SyncJobService";
    long rtn = 0;
    FailTRProc m_trProc = null;

    private class FailTRProc extends AsyncTask<JobParameters, Void, Void> {
        private FailTRProc() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(JobParameters... jobParametersArr) {
            JobParameters jobParameters = jobParametersArr[0];
            AlimiInterface alimiInterface = new AlimiInterface(SyncJobService.this.getApplicationContext());
            alimiInterface.onInitInform();
            SyncJobService.this.rtn = alimiInterface.getNewMessageAndNoti(true);
            LogFile.log(SyncJobService.TAG, 1, "onStartJob: " + SyncJobService.this.rtn);
            SyncJobService syncJobService = SyncJobService.this;
            if (syncJobService.rtn == -1) {
                syncJobService.jobFinished(jobParameters, false);
                LogFile.log(SyncJobService.TAG, 1, "Job Schadule Failed Rescheduling & return false");
                return null;
            }
            syncJobService.jobFinished(jobParameters, false);
            LogFile.log(SyncJobService.TAG, 1, "Job Schadule Success !!!");
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        FailTRProc failTRProc = new FailTRProc();
        this.m_trProc = failTRProc;
        failTRProc.execute(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        FailTRProc failTRProc = this.m_trProc;
        if (failTRProc != null) {
            failTRProc.cancel(true);
        }
        return true;
    }
}
