package I0;

import H0.l;
import P0.r;
import P0.s;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {
    public static final String GCM_SCHEDULER = "androidx.work.impl.background.gcm.GcmScheduler";

    /* renamed from: a, reason: collision with root package name */
    private static final String f1916a = l.tagWithPrefix("Schedulers");

    static e a(Context context, i iVar) {
        K0.g gVar = new K0.g(context, iVar);
        Q0.h.setComponentEnabled(context, SystemJobService.class, true);
        l.get().debug(f1916a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return gVar;
    }

    public static void schedule(androidx.work.a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        s sVarWorkSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<r> eligibleWorkForScheduling = sVarWorkSpecDao.getEligibleWorkForScheduling(aVar.getMaxSchedulerLimit());
            List<r> allEligibleWorkSpecsForScheduling = sVarWorkSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<r> it = eligibleWorkForScheduling.iterator();
                while (it.hasNext()) {
                    sVarWorkSpecDao.markWorkSpecScheduled(it.next().id, jCurrentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                r[] rVarArr = (r[]) eligibleWorkForScheduling.toArray(new r[eligibleWorkForScheduling.size()]);
                for (e eVar : list) {
                    if (eVar.hasLimitedSchedulingSlots()) {
                        eVar.schedule(rVarArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling == null || allEligibleWorkSpecsForScheduling.size() <= 0) {
                return;
            }
            r[] rVarArr2 = (r[]) allEligibleWorkSpecsForScheduling.toArray(new r[allEligibleWorkSpecsForScheduling.size()]);
            for (e eVar2 : list) {
                if (!eVar2.hasLimitedSchedulingSlots()) {
                    eVar2.schedule(rVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
