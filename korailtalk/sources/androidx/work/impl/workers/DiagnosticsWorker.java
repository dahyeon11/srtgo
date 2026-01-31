package androidx.work.impl.workers;

import H0.l;
import P0.i;
import P0.j;
import P0.m;
import P0.r;
import P0.s;
import P0.v;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: g, reason: collision with root package name */
    private static final String f11272g = l.tagWithPrefix("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(r rVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", rVar.id, rVar.workerClassName, num, rVar.state.name(), str, str2);
    }

    private static String b(m mVar, v vVar, j jVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            i systemIdInfo = jVar.getSystemIdInfo(rVar.id);
            sb.append(a(rVar, TextUtils.join(",", mVar.getNamesForWorkSpecId(rVar.id)), systemIdInfo != null ? Integer.valueOf(systemIdInfo.systemId) : null, TextUtils.join(",", vVar.getTagsForWorkSpecId(rVar.id))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase workDatabase = I0.i.getInstance(getApplicationContext()).getWorkDatabase();
        s sVarWorkSpecDao = workDatabase.workSpecDao();
        m mVarWorkNameDao = workDatabase.workNameDao();
        v vVarWorkTagDao = workDatabase.workTagDao();
        j jVarSystemIdInfoDao = workDatabase.systemIdInfoDao();
        List<r> recentlyCompletedWork = sVarWorkSpecDao.getRecentlyCompletedWork(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<r> runningWork = sVarWorkSpecDao.getRunningWork();
        List<r> allEligibleWorkSpecsForScheduling = sVarWorkSpecDao.getAllEligibleWorkSpecsForScheduling(200);
        if (recentlyCompletedWork != null && !recentlyCompletedWork.isEmpty()) {
            l lVar = l.get();
            String str = f11272g;
            lVar.info(str, "Recently completed work:\n\n", new Throwable[0]);
            l.get().info(str, b(mVarWorkNameDao, vVarWorkTagDao, jVarSystemIdInfoDao, recentlyCompletedWork), new Throwable[0]);
        }
        if (runningWork != null && !runningWork.isEmpty()) {
            l lVar2 = l.get();
            String str2 = f11272g;
            lVar2.info(str2, "Running work:\n\n", new Throwable[0]);
            l.get().info(str2, b(mVarWorkNameDao, vVarWorkTagDao, jVarSystemIdInfoDao, runningWork), new Throwable[0]);
        }
        if (allEligibleWorkSpecsForScheduling != null && !allEligibleWorkSpecsForScheduling.isEmpty()) {
            l lVar3 = l.get();
            String str3 = f11272g;
            lVar3.info(str3, "Enqueued work:\n\n", new Throwable[0]);
            l.get().info(str3, b(mVarWorkNameDao, vVarWorkTagDao, jVarSystemIdInfoDao, allEligibleWorkSpecsForScheduling), new Throwable[0]);
        }
        return ListenableWorker.a.success();
    }
}
