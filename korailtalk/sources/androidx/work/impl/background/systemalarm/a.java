package androidx.work.impl.background.systemalarm;

import H0.l;
import I0.i;
import P0.j;
import Q0.f;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.r;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11160a = l.tagWithPrefix("Alarms");

    private static void a(Context context, String str, int i8) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(r.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i8, b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        l.get().debug(f11160a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i8)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    private static void b(Context context, String str, int i8, long j8) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(r.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i8, b.b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j8, service);
        }
    }

    public static void cancelAlarm(Context context, i iVar, String str) {
        j jVarSystemIdInfoDao = iVar.getWorkDatabase().systemIdInfoDao();
        P0.i systemIdInfo = jVarSystemIdInfoDao.getSystemIdInfo(str);
        if (systemIdInfo != null) {
            a(context, str, systemIdInfo.systemId);
            l.get().debug(f11160a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            jVarSystemIdInfoDao.removeSystemIdInfo(str);
        }
    }

    public static void setAlarm(Context context, i iVar, String str, long j8) {
        WorkDatabase workDatabase = iVar.getWorkDatabase();
        j jVarSystemIdInfoDao = workDatabase.systemIdInfoDao();
        P0.i systemIdInfo = jVarSystemIdInfoDao.getSystemIdInfo(str);
        if (systemIdInfo != null) {
            a(context, str, systemIdInfo.systemId);
            b(context, str, systemIdInfo.systemId, j8);
        } else {
            int iNextAlarmManagerId = new f(workDatabase).nextAlarmManagerId();
            jVarSystemIdInfoDao.insertSystemIdInfo(new P0.i(str, iNextAlarmManagerId));
            b(context, str, iNextAlarmManagerId, j8);
        }
    }
}
